package conrad.codeworkshop.core.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MovieSearchResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMovieSearchResponse.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableMovieSearchResponse.of()}.
 */
@Generated(from = "MovieSearchResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableMovieSearchResponse implements MovieSearchResponse {
  private final MovieSearchRequest request;
  private final ImmutableList<SearchHit> hits;

  private ImmutableMovieSearchResponse(MovieSearchRequest request) {
    this.request = ImmutableMovieSearchRequest.copyOf(request);
    this.hits = ImmutableList.of();
  }

  private ImmutableMovieSearchResponse(
      MovieSearchRequest request,
      ImmutableList<SearchHit> hits) {
    this.request = request;
    this.hits = hits;
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public MovieSearchRequest request() {
    return request;
  }

  /**
   * @return The value of the {@code hits} attribute
   */
  @JsonProperty("hits")
  @Override
  public ImmutableList<SearchHit> hits() {
    return hits;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MovieSearchResponse#request() request} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for request
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMovieSearchResponse withRequest(MovieSearchRequest value) {
    if (this.request == value) return this;
    MovieSearchRequest newValue = ImmutableMovieSearchRequest.copyOf(value);
    return new ImmutableMovieSearchResponse(newValue, this.hits);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MovieSearchResponse#hits() hits}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMovieSearchResponse withHits(SearchHit... elements) {
    ImmutableList<SearchHit> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMovieSearchResponse(this.request, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MovieSearchResponse#hits() hits}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of hits elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMovieSearchResponse withHits(Iterable<? extends SearchHit> elements) {
    if (this.hits == elements) return this;
    ImmutableList<SearchHit> newValue = ImmutableList.copyOf(elements);
    return new ImmutableMovieSearchResponse(this.request, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMovieSearchResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMovieSearchResponse
        && equalTo((ImmutableMovieSearchResponse) another);
  }

  private boolean equalTo(ImmutableMovieSearchResponse another) {
    return request.equals(another.request)
        && hits.equals(another.hits);
  }

  /**
   * Computes a hash code from attributes: {@code request}, {@code hits}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + request.hashCode();
    h += (h << 5) + hits.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MovieSearchResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MovieSearchResponse")
        .omitNullValues()
        .add("request", request)
        .add("hits", hits)
        .toString();
  }

  /**
   * Construct a new immutable {@code MovieSearchResponse} instance.
   * @param request The value for the {@code request} attribute
   * @return An immutable MovieSearchResponse instance
   */
  public static MovieSearchResponse of(MovieSearchRequest request) {
    return new ImmutableMovieSearchResponse(request);
  }

  /**
   * Creates an immutable copy of a {@link MovieSearchResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MovieSearchResponse instance
   */
  public static MovieSearchResponse copyOf(MovieSearchResponse instance) {
    if (instance instanceof ImmutableMovieSearchResponse) {
      return (ImmutableMovieSearchResponse) instance;
    }
    return ImmutableMovieSearchResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link MovieSearchResponse MovieSearchResponse}.
   * <pre>
   * ImmutableMovieSearchResponse.builder()
   *    .request(conrad.codeworkshop.core.api.MovieSearchRequest) // required {@link MovieSearchResponse#request() request}
   *    .addHit|addAllHits(conrad.codeworkshop.core.api.SearchHit) // {@link MovieSearchResponse#hits() hits} elements
   *    .build();
   * </pre>
   * @return A new MovieSearchResponse builder
   */
  public static ImmutableMovieSearchResponse.Builder builder() {
    return new ImmutableMovieSearchResponse.Builder();
  }

  /**
   * Builds instances of type {@link MovieSearchResponse MovieSearchResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MovieSearchResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_REQUEST = 0x1L;
    private long initBits = 0x1L;

    private @Nullable MovieSearchRequest request;
    private ImmutableList.Builder<SearchHit> hits = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MovieSearchResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(MovieSearchResponse instance) {
      Objects.requireNonNull(instance, "instance");
      request(instance.request());
      addAllHits(instance.hits());
      return this;
    }

    /**
     * Constructs and initializes the value for the {@link MovieSearchResponse#request() request} attribute.
     * @param from The value for {@code request.from} 
     * @param size The value for {@code request.size} 
     * @param query The value for {@code request.query} 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder request(int from, int size, String query) {
      return request(ImmutableMovieSearchRequest.of(from, size, query));
    }

    /**
     * Initializes the value for the {@link MovieSearchResponse#request() request} attribute.
     * @param request The value for request 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("request")
    public final Builder request(MovieSearchRequest request) {
      this.request = ImmutableMovieSearchRequest.copyOf(request);
      initBits &= ~INIT_BIT_REQUEST;
      return this;
    }

    /**
     * Adds one element to {@link MovieSearchResponse#hits() hits} list.
     * @param element A hits element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHit(SearchHit element) {
      element = ImmutableSearchHit.copyOf(element);
      this.hits.add(element);
      return this;
    }

    /**
     * Adds elements to {@link MovieSearchResponse#hits() hits} list.
     * @param elements An array of hits elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHits(SearchHit... elements) {
      for (SearchHit element : elements) {
        element = ImmutableSearchHit.copyOf(element);
        this.hits.add(Objects.requireNonNull(element, "hits element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link MovieSearchResponse#hits() hits} list.
     * @param elements An iterable of hits elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("hits")
    public final Builder hits(Iterable<? extends SearchHit> elements) {
      this.hits = ImmutableList.builder();
      return addAllHits(elements);
    }

    /**
     * Adds elements to {@link MovieSearchResponse#hits() hits} list.
     * @param elements An iterable of hits elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllHits(Iterable<? extends SearchHit> elements) {
      for (SearchHit element : elements) {
        element = ImmutableSearchHit.copyOf(element);
        this.hits.add(Objects.requireNonNull(element, "hits element"));
      }
      return this;
    }

    /**
     * Builds a new {@link MovieSearchResponse MovieSearchResponse}.
     * @return An immutable instance of MovieSearchResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MovieSearchResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMovieSearchResponse(ImmutableMovieSearchRequest.copyOf(request), hits.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_REQUEST) != 0) attributes.add("request");
      return "Cannot build MovieSearchResponse, some of required attributes are not set " + attributes;
    }
  }
}
