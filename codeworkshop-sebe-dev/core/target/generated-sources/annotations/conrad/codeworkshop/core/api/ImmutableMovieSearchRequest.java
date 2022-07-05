package conrad.codeworkshop.core.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;
import org.jetbrains.annotations.Nullable;

/**
 * Immutable implementation of {@link MovieSearchRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMovieSearchRequest.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableMovieSearchRequest.of()}.
 */
@Generated(from = "MovieSearchRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableMovieSearchRequest implements MovieSearchRequest {
  private final int from;
  private final int size;
  private final String query;
  private final @Nullable ImmutableSort sort;

  private ImmutableMovieSearchRequest(int from, int size, String query) {
    this.from = from;
    this.size = size;
    this.query = Objects.requireNonNull(query, "query");
    this.sort = null;
  }

  private ImmutableMovieSearchRequest(
      int from,
      int size,
      String query,
      @Nullable ImmutableSort sort) {
    this.from = from;
    this.size = size;
    this.query = query;
    this.sort = sort;
  }

  /**
   * @return The value of the {@code from} attribute
   */
  @JsonProperty("from")
  @Override
  public int from() {
    return from;
  }

  /**
   * @return The value of the {@code size} attribute
   */
  @JsonProperty("size")
  @Override
  public int size() {
    return size;
  }

  /**
   * @return The value of the {@code query} attribute
   */
  @JsonProperty("query")
  @Override
  public String query() {
    return query;
  }

  /**
   * @return The value of the {@code sort} attribute
   */
  @JsonProperty("sort")
  @Override
  public @Nullable ImmutableSort sort() {
    return sort;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MovieSearchRequest#from() from} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for from
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMovieSearchRequest withFrom(int value) {
    if (this.from == value) return this;
    return new ImmutableMovieSearchRequest(value, this.size, this.query, this.sort);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MovieSearchRequest#size() size} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for size
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMovieSearchRequest withSize(int value) {
    if (this.size == value) return this;
    return new ImmutableMovieSearchRequest(this.from, value, this.query, this.sort);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MovieSearchRequest#query() query} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for query
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMovieSearchRequest withQuery(String value) {
    String newValue = Objects.requireNonNull(value, "query");
    if (this.query.equals(newValue)) return this;
    return new ImmutableMovieSearchRequest(this.from, this.size, newValue, this.sort);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MovieSearchRequest#sort() sort} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sort (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMovieSearchRequest withSort(@Nullable Sort value) {
    if (this.sort == value) return this;
    @Nullable ImmutableSort newValue = value == null ? null : ImmutableSort.copyOf(value);
    return new ImmutableMovieSearchRequest(this.from, this.size, this.query, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMovieSearchRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMovieSearchRequest
        && equalTo((ImmutableMovieSearchRequest) another);
  }

  private boolean equalTo(ImmutableMovieSearchRequest another) {
    return from == another.from
        && size == another.size
        && query.equals(another.query)
        && Objects.equals(sort, another.sort);
  }

  /**
   * Computes a hash code from attributes: {@code from}, {@code size}, {@code query}, {@code sort}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + from;
    h += (h << 5) + size;
    h += (h << 5) + query.hashCode();
    h += (h << 5) + Objects.hashCode(sort);
    return h;
  }

  /**
   * Prints the immutable value {@code MovieSearchRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("MovieSearchRequest")
        .omitNullValues()
        .add("from", from)
        .add("size", size)
        .add("query", query)
        .add("sort", sort)
        .toString();
  }

  /**
   * Construct a new immutable {@code MovieSearchRequest} instance.
   * @param from The value for the {@code from} attribute
   * @param size The value for the {@code size} attribute
   * @param query The value for the {@code query} attribute
   * @return An immutable MovieSearchRequest instance
   */
  public static MovieSearchRequest of(int from, int size, String query) {
    return new ImmutableMovieSearchRequest(from, size, query);
  }

  /**
   * Creates an immutable copy of a {@link MovieSearchRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MovieSearchRequest instance
   */
  public static MovieSearchRequest copyOf(MovieSearchRequest instance) {
    if (instance instanceof ImmutableMovieSearchRequest) {
      return (ImmutableMovieSearchRequest) instance;
    }
    return ImmutableMovieSearchRequest.builder()
        .from(instance.from())
        .size(instance.size())
        .query(instance.query())
        .sort(instance.sort())
        .build();
  }

  /**
   * Creates a builder for {@link MovieSearchRequest MovieSearchRequest}.
   * <pre>
   * ImmutableMovieSearchRequest.builder()
   *    .from(int) // required {@link MovieSearchRequest#from() from}
   *    .size(int) // required {@link MovieSearchRequest#size() size}
   *    .query(String) // required {@link MovieSearchRequest#query() query}
   *    .sort(conrad.codeworkshop.core.api.Sort | null) // nullable {@link MovieSearchRequest#sort() sort}
   *    .build();
   * </pre>
   * @return A new MovieSearchRequest builder
   */
  public static ImmutableMovieSearchRequest.Builder builder() {
    return new ImmutableMovieSearchRequest.Builder();
  }

  /**
   * Builds instances of type {@link MovieSearchRequest MovieSearchRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MovieSearchRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_FROM = 0x1L;
    private static final long INIT_BIT_SIZE = 0x2L;
    private static final long INIT_BIT_QUERY = 0x4L;
    private long initBits = 0x7L;

    private int from;
    private int size;
    private @javax.annotation.Nullable String query;
    private @javax.annotation.Nullable Sort sort;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link MovieSearchRequest#from() from} attribute.
     * @param from The value for from 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("from")
    public final Builder from(int from) {
      this.from = from;
      initBits &= ~INIT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the value for the {@link MovieSearchRequest#size() size} attribute.
     * @param size The value for size 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("size")
    public final Builder size(int size) {
      this.size = size;
      initBits &= ~INIT_BIT_SIZE;
      return this;
    }

    /**
     * Initializes the value for the {@link MovieSearchRequest#query() query} attribute.
     * @param query The value for query 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("query")
    public final Builder query(String query) {
      this.query = Objects.requireNonNull(query, "query");
      initBits &= ~INIT_BIT_QUERY;
      return this;
    }

    /**
     * Initializes the value for the {@link MovieSearchRequest#sort() sort} attribute.
     * @param sort The value for sort (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("sort")
    public final Builder sort(@Nullable Sort sort) {
      this.sort = sort == null ? null : ImmutableSort.copyOf(sort);
      return this;
    }

    /**
     * Builds a new {@link MovieSearchRequest MovieSearchRequest}.
     * @return An immutable instance of MovieSearchRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MovieSearchRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMovieSearchRequest(
          from,
          size,
          query,
          sort == null ? null : ImmutableSort.copyOf(sort));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FROM) != 0) attributes.add("from");
      if ((initBits & INIT_BIT_SIZE) != 0) attributes.add("size");
      if ((initBits & INIT_BIT_QUERY) != 0) attributes.add("query");
      return "Cannot build MovieSearchRequest, some of required attributes are not set " + attributes;
    }
  }
}
