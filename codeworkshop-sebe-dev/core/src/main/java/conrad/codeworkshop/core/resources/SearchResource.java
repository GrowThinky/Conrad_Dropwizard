package conrad.codeworkshop.core.resources;

import com.codahale.metrics.annotation.Timed;
import conrad.codeworkshop.core.api.Lang;
import conrad.codeworkshop.core.api.MovieSearchRequest;
import conrad.codeworkshop.core.api.MovieSearchResponse;
import conrad.codeworkshop.core.api.SearchQualityResponse;
import conrad.codeworkshop.core.services.SearchService;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Singleton
public final class SearchResource {

  private final SearchService searchService;

  public SearchResource(final SearchService searchService) {
    this.searchService = searchService;
  }

  @POST
  @Timed
  @Path("search/")
  @Consumes(MediaType.APPLICATION_JSON)
  public MovieSearchResponse search(
      final MovieSearchRequest movieSearchRequest) throws IOException {
    final String msg = String.format("Collection  does not exist");
    MovieSearchResponse response;
    response = searchService.search(movieSearchRequest);
    return response;
  }

  @POST
  @Timed
  @Path("search/{lang}")
  @Consumes(MediaType.APPLICATION_JSON)
  public MovieSearchResponse searchByLang(
      @PathParam("lang") final Lang lang,
      final MovieSearchRequest movieSearchRequest) throws IOException {
    return searchService.searchByMovieLang(movieSearchRequest, lang);
  }

  @POST
  @Timed
  @Path("measureSearchQuality/")
  @Consumes(MediaType.APPLICATION_JSON)
  public SearchQualityResponse measureSearchQuality(
      final MovieSearchRequest movieSearchRequest) throws IOException {
    return searchService.measureSearchQuality(movieSearchRequest);
  }
}
