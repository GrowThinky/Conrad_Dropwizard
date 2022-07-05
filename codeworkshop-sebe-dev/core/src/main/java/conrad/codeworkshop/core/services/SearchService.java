package conrad.codeworkshop.core.services;

import com.google.common.collect.ImmutableList;
import com.sun.xml.internal.bind.v2.TODO;
import conrad.codeworkshop.core.Config;
import conrad.codeworkshop.core.api.FieldNames;
import conrad.codeworkshop.core.api.ImmutableMovieSearchResponse;
import conrad.codeworkshop.core.api.ImmutableSearchHit;
import conrad.codeworkshop.core.api.ImmutableSearchQualityResponse;
import conrad.codeworkshop.core.api.Lang;
import conrad.codeworkshop.core.api.MovieSearchRequest;
import conrad.codeworkshop.core.api.MovieSearchResponse;
import conrad.codeworkshop.core.api.SearchHit;
import conrad.codeworkshop.core.api.SearchQualityResponse;
import conrad.codeworkshop.core.api.Sort;
import conrad.codeworkshop.core.util.HitUtil;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.message.BasicHeader;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.Operator;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;

import javax.inject.Singleton;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

@Singleton
public final class SearchService {

  private final Config config;
  private final RestHighLevelClient restHighLevelClient;
  private static final String INDEX = "tmdb";

  public SearchService(final Config config) {
    this.config = config;
    restHighLevelClient = new RestHighLevelClient(
        RestClient.builder(
            new HttpHost(config.getElasticsearchHost(), config.getPort(), "http"))
            .setDefaultHeaders(new Header[]{
                new BasicHeader("Content-Type", "application/json")
            }));
  }

  public MovieSearchResponse search(final MovieSearchRequest movieSearchRequest) throws IOException {
    System.out.println(movieSearchRequest.sort());
    if (config.isShouldDoSearch()) {
      final SearchResponse esResponse = restHighLevelClient
          .search(buildEsRequest(movieSearchRequest, Optional.empty()), RequestOptions.DEFAULT);

      return buildMovieSearchResponse(esResponse, movieSearchRequest);
    }

    return ImmutableMovieSearchResponse.of(movieSearchRequest);
  }

  public MovieSearchResponse searchByMovieLang(final MovieSearchRequest movieSearchRequest, final Lang lang) throws IOException {
    if (config.isShouldDoSearch()) {
      final SearchResponse esResponse = restHighLevelClient
          .search(buildEsRequest(movieSearchRequest, Optional.of(lang)), RequestOptions.DEFAULT);

      return buildMovieSearchResponse(esResponse, movieSearchRequest);
    }

    return ImmutableMovieSearchResponse.of(movieSearchRequest);
  }

  public SearchQualityResponse measureSearchQuality(final MovieSearchRequest movieSearchRequest) throws IOException {
    final MovieSearchResponse movieSearchResponse = search(movieSearchRequest);
    final ImmutableList<SearchHit> idealHits = getIdealSearchResultOrder(movieSearchResponse.hits());
    calculateIndexDistance(movieSearchResponse, idealHits);

    SearchQualityResponse result = ImmutableSearchQualityResponse.builder()
            .currentHits(movieSearchResponse.hits())
            .idealHits(idealHits)
           // .addDistance(summedDistances)
            .build();

    return result;
  }

  /**
   * Calculaes the summed distance between indexes of ideal and actual search results.
   */
  private void calculateIndexDistance(MovieSearchResponse movieSearchResponse, ImmutableList<SearchHit> idealHits) {
    int[] distances = new int[idealHits.size()];
    int idealIndex = 0;
    for(SearchHit hit : movieSearchResponse.hits()){
      int actualIndex = idealHits.indexOf(hit);
      distances[idealIndex] = Math.abs(idealIndex - actualIndex);
      idealIndex++;
    }
    int summedDistances = IntStream.of(distances).sum();
    System.out.println("Calculated Summed Distance: " + summedDistances);
  }

  private MovieSearchResponse buildMovieSearchResponse(final SearchResponse esResponse, final MovieSearchRequest movieSearchRequest) {
    final ImmutableList.Builder<SearchHit> immutableListBuilder = ImmutableList.builder();
    esResponse.getHits().forEach(hit -> immutableListBuilder.add(ImmutableSearchHit.builder()
        .id(String.valueOf(HitUtil.get(hit.getSourceAsMap(), FieldNames.ID, "")))
        .overview(HitUtil.get(hit.getSourceAsMap(), FieldNames.OVERVIEW, ""))
        .title(HitUtil.get(hit.getSourceAsMap(), FieldNames.TITLE, ""))
        .originalTitle(HitUtil.get(hit.getSourceAsMap(), FieldNames.ORIGINAL_TITLE, ""))
        .status(HitUtil.get(hit.getSourceAsMap(), FieldNames.STATUS, ""))
        .popularity(String.valueOf(HitUtil.get(hit.getSourceAsMap(), FieldNames.POPULARITY, "")))
        .runtime(String.valueOf(HitUtil.get(hit.getSourceAsMap(), FieldNames.RUNTIME, "")))
        .voteAverage(String.valueOf(HitUtil.get(hit.getSourceAsMap(), FieldNames.VOTE_AVERAGE, "")))
        .voteCount(String.valueOf(HitUtil.get(hit.getSourceAsMap(), FieldNames.VOTE_COUNT, "")))
        .originaLanguage(HitUtil.get(hit.getSourceAsMap(), FieldNames.ORIGINAL_LANGUAGE, ""))
        .build()));

    return ImmutableMovieSearchResponse.builder()
        .request(movieSearchRequest)
        .hits(immutableListBuilder.build())
        .build();
  }


  private SearchRequest buildEsRequest(final MovieSearchRequest movieSearchRequest, final Optional<Lang> lang) {
    final SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
    final MultiMatchQueryBuilder multiMatchQueryBuilder = QueryBuilders
        .multiMatchQuery(movieSearchRequest.query())
        .operator(Operator.AND)
        .slop(2)
        .field(FieldNames.ORIGINAL_TITLE, 20.0f)
        .field(FieldNames.TITLE, 12.5f)
        .field(FieldNames.OVERVIEW, 2.5f);
    final BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery()
        .must(multiMatchQueryBuilder);

    lang.ifPresent(lang1 -> boolQueryBuilder.filter(QueryBuilders.termQuery(FieldNames.ORIGINAL_LANGUAGE, lang1.toString().toLowerCase())));

    searchSourceBuilder.query(boolQueryBuilder);
    searchSourceBuilder.size(movieSearchRequest.size());
    searchSourceBuilder.from(movieSearchRequest.from());

    final Sort sort = movieSearchRequest.sort();

    ArrayList<String> supportedSort = new ArrayList<>(Arrays.asList("vote_average", "vote_count", "runtime", "popularity","id"));
    String sortErrorMsg = "Supported sort parameters: vote_average, vote_count, runtime, popularity and id";

    if (sort != null && supportedSort.contains(sort.fieldName())) {
      searchSourceBuilder.sort(new FieldSortBuilder(sort.fieldName().toLowerCase()).order(SortOrder.fromString(sort.order().name())));
    } else {
      throw new WebApplicationException(sortErrorMsg, Response.Status.NOT_FOUND);
    }

    final SearchRequest esSearchRequest = new SearchRequest();
    esSearchRequest.indices(INDEX);
    esSearchRequest.source(searchSourceBuilder);
    return esSearchRequest;
  }


  private ImmutableList<SearchHit> getIdealSearchResultOrder(final ImmutableList<SearchHit> searchHits) {
    final List<SearchHit> hits = new ArrayList<>(searchHits);
    Collections.shuffle(hits);
    final ImmutableList.Builder<SearchHit> immutableListBuilder = ImmutableList.builder();
    return immutableListBuilder.addAll(hits).build();
  }

}
