package conrad.codeworkshop.core.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link SearchHit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSearchHit.builder()}.
 */
@Generated(from = "SearchHit", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableSearchHit implements SearchHit {
  private final String id;
  private final String overview;
  private final String title;
  private final String originalTitle;
  private final String status;
  private final String popularity;
  private final String runtime;
  private final String voteAverage;
  private final String voteCount;
  private final String originaLanguage;

  private ImmutableSearchHit(
      String id,
      String overview,
      String title,
      String originalTitle,
      String status,
      String popularity,
      String runtime,
      String voteAverage,
      String voteCount,
      String originaLanguage) {
    this.id = id;
    this.overview = overview;
    this.title = title;
    this.originalTitle = originalTitle;
    this.status = status;
    this.popularity = popularity;
    this.runtime = runtime;
    this.voteAverage = voteAverage;
    this.voteCount = voteCount;
    this.originaLanguage = originaLanguage;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code overview} attribute
   */
  @JsonProperty("overview")
  @Override
  public String overview() {
    return overview;
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public String title() {
    return title;
  }

  /**
   * @return The value of the {@code originalTitle} attribute
   */
  @JsonProperty("originalTitle")
  @Override
  public String originalTitle() {
    return originalTitle;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public String status() {
    return status;
  }

  /**
   * @return The value of the {@code popularity} attribute
   */
  @JsonProperty("popularity")
  @Override
  public String popularity() {
    return popularity;
  }

  /**
   * @return The value of the {@code runtime} attribute
   */
  @JsonProperty("runtime")
  @Override
  public String runtime() {
    return runtime;
  }

  /**
   * @return The value of the {@code voteAverage} attribute
   */
  @JsonProperty("voteAverage")
  @Override
  public String voteAverage() {
    return voteAverage;
  }

  /**
   * @return The value of the {@code voteCount} attribute
   */
  @JsonProperty("voteCount")
  @Override
  public String voteCount() {
    return voteCount;
  }

  /**
   * @return The value of the {@code originaLanguage} attribute
   */
  @JsonProperty("originaLanguage")
  @Override
  public String originaLanguage() {
    return originaLanguage;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withId(String value) {
    String newValue = Objects.requireNonNull(value, "id");
    if (this.id.equals(newValue)) return this;
    return new ImmutableSearchHit(
        newValue,
        this.overview,
        this.title,
        this.originalTitle,
        this.status,
        this.popularity,
        this.runtime,
        this.voteAverage,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#overview() overview} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for overview
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withOverview(String value) {
    String newValue = Objects.requireNonNull(value, "overview");
    if (this.overview.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        newValue,
        this.title,
        this.originalTitle,
        this.status,
        this.popularity,
        this.runtime,
        this.voteAverage,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#title() title} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for title
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withTitle(String value) {
    String newValue = Objects.requireNonNull(value, "title");
    if (this.title.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        newValue,
        this.originalTitle,
        this.status,
        this.popularity,
        this.runtime,
        this.voteAverage,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#originalTitle() originalTitle} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for originalTitle
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withOriginalTitle(String value) {
    String newValue = Objects.requireNonNull(value, "originalTitle");
    if (this.originalTitle.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        this.title,
        newValue,
        this.status,
        this.popularity,
        this.runtime,
        this.voteAverage,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#status() status} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withStatus(String value) {
    String newValue = Objects.requireNonNull(value, "status");
    if (this.status.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        this.title,
        this.originalTitle,
        newValue,
        this.popularity,
        this.runtime,
        this.voteAverage,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#popularity() popularity} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for popularity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withPopularity(String value) {
    String newValue = Objects.requireNonNull(value, "popularity");
    if (this.popularity.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        this.title,
        this.originalTitle,
        this.status,
        newValue,
        this.runtime,
        this.voteAverage,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#runtime() runtime} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for runtime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withRuntime(String value) {
    String newValue = Objects.requireNonNull(value, "runtime");
    if (this.runtime.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        this.title,
        this.originalTitle,
        this.status,
        this.popularity,
        newValue,
        this.voteAverage,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#voteAverage() voteAverage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for voteAverage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withVoteAverage(String value) {
    String newValue = Objects.requireNonNull(value, "voteAverage");
    if (this.voteAverage.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        this.title,
        this.originalTitle,
        this.status,
        this.popularity,
        this.runtime,
        newValue,
        this.voteCount,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#voteCount() voteCount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for voteCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withVoteCount(String value) {
    String newValue = Objects.requireNonNull(value, "voteCount");
    if (this.voteCount.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        this.title,
        this.originalTitle,
        this.status,
        this.popularity,
        this.runtime,
        this.voteAverage,
        newValue,
        this.originaLanguage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchHit#originaLanguage() originaLanguage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for originaLanguage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchHit withOriginaLanguage(String value) {
    String newValue = Objects.requireNonNull(value, "originaLanguage");
    if (this.originaLanguage.equals(newValue)) return this;
    return new ImmutableSearchHit(
        this.id,
        this.overview,
        this.title,
        this.originalTitle,
        this.status,
        this.popularity,
        this.runtime,
        this.voteAverage,
        this.voteCount,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSearchHit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSearchHit
        && equalTo((ImmutableSearchHit) another);
  }

  private boolean equalTo(ImmutableSearchHit another) {
    return id.equals(another.id)
        && overview.equals(another.overview)
        && title.equals(another.title)
        && originalTitle.equals(another.originalTitle)
        && status.equals(another.status)
        && popularity.equals(another.popularity)
        && runtime.equals(another.runtime)
        && voteAverage.equals(another.voteAverage)
        && voteCount.equals(another.voteCount)
        && originaLanguage.equals(another.originaLanguage);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code overview}, {@code title}, {@code originalTitle}, {@code status}, {@code popularity}, {@code runtime}, {@code voteAverage}, {@code voteCount}, {@code originaLanguage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + overview.hashCode();
    h += (h << 5) + title.hashCode();
    h += (h << 5) + originalTitle.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + popularity.hashCode();
    h += (h << 5) + runtime.hashCode();
    h += (h << 5) + voteAverage.hashCode();
    h += (h << 5) + voteCount.hashCode();
    h += (h << 5) + originaLanguage.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SearchHit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SearchHit")
        .omitNullValues()
        .add("id", id)
        .add("overview", overview)
        .add("title", title)
        .add("originalTitle", originalTitle)
        .add("status", status)
        .add("popularity", popularity)
        .add("runtime", runtime)
        .add("voteAverage", voteAverage)
        .add("voteCount", voteCount)
        .add("originaLanguage", originaLanguage)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link SearchHit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SearchHit instance
   */
  public static SearchHit copyOf(SearchHit instance) {
    if (instance instanceof ImmutableSearchHit) {
      return (ImmutableSearchHit) instance;
    }
    return ImmutableSearchHit.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link SearchHit SearchHit}.
   * <pre>
   * ImmutableSearchHit.builder()
   *    .id(String) // required {@link SearchHit#id() id}
   *    .overview(String) // required {@link SearchHit#overview() overview}
   *    .title(String) // required {@link SearchHit#title() title}
   *    .originalTitle(String) // required {@link SearchHit#originalTitle() originalTitle}
   *    .status(String) // required {@link SearchHit#status() status}
   *    .popularity(String) // required {@link SearchHit#popularity() popularity}
   *    .runtime(String) // required {@link SearchHit#runtime() runtime}
   *    .voteAverage(String) // required {@link SearchHit#voteAverage() voteAverage}
   *    .voteCount(String) // required {@link SearchHit#voteCount() voteCount}
   *    .originaLanguage(String) // required {@link SearchHit#originaLanguage() originaLanguage}
   *    .build();
   * </pre>
   * @return A new SearchHit builder
   */
  public static ImmutableSearchHit.Builder builder() {
    return new ImmutableSearchHit.Builder();
  }

  /**
   * Builds instances of type {@link SearchHit SearchHit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SearchHit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_OVERVIEW = 0x2L;
    private static final long INIT_BIT_TITLE = 0x4L;
    private static final long INIT_BIT_ORIGINAL_TITLE = 0x8L;
    private static final long INIT_BIT_STATUS = 0x10L;
    private static final long INIT_BIT_POPULARITY = 0x20L;
    private static final long INIT_BIT_RUNTIME = 0x40L;
    private static final long INIT_BIT_VOTE_AVERAGE = 0x80L;
    private static final long INIT_BIT_VOTE_COUNT = 0x100L;
    private static final long INIT_BIT_ORIGINA_LANGUAGE = 0x200L;
    private long initBits = 0x3ffL;

    private @Nullable String id;
    private @Nullable String overview;
    private @Nullable String title;
    private @Nullable String originalTitle;
    private @Nullable String status;
    private @Nullable String popularity;
    private @Nullable String runtime;
    private @Nullable String voteAverage;
    private @Nullable String voteCount;
    private @Nullable String originaLanguage;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SearchHit} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(SearchHit instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      overview(instance.overview());
      title(instance.title());
      originalTitle(instance.originalTitle());
      status(instance.status());
      popularity(instance.popularity());
      runtime(instance.runtime());
      voteAverage(instance.voteAverage());
      voteCount(instance.voteCount());
      originaLanguage(instance.originaLanguage());
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("id")
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#overview() overview} attribute.
     * @param overview The value for overview 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("overview")
    public final Builder overview(String overview) {
      this.overview = Objects.requireNonNull(overview, "overview");
      initBits &= ~INIT_BIT_OVERVIEW;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#title() title} attribute.
     * @param title The value for title 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("title")
    public final Builder title(String title) {
      this.title = Objects.requireNonNull(title, "title");
      initBits &= ~INIT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#originalTitle() originalTitle} attribute.
     * @param originalTitle The value for originalTitle 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("originalTitle")
    public final Builder originalTitle(String originalTitle) {
      this.originalTitle = Objects.requireNonNull(originalTitle, "originalTitle");
      initBits &= ~INIT_BIT_ORIGINAL_TITLE;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("status")
    public final Builder status(String status) {
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#popularity() popularity} attribute.
     * @param popularity The value for popularity 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("popularity")
    public final Builder popularity(String popularity) {
      this.popularity = Objects.requireNonNull(popularity, "popularity");
      initBits &= ~INIT_BIT_POPULARITY;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#runtime() runtime} attribute.
     * @param runtime The value for runtime 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("runtime")
    public final Builder runtime(String runtime) {
      this.runtime = Objects.requireNonNull(runtime, "runtime");
      initBits &= ~INIT_BIT_RUNTIME;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#voteAverage() voteAverage} attribute.
     * @param voteAverage The value for voteAverage 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("voteAverage")
    public final Builder voteAverage(String voteAverage) {
      this.voteAverage = Objects.requireNonNull(voteAverage, "voteAverage");
      initBits &= ~INIT_BIT_VOTE_AVERAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#voteCount() voteCount} attribute.
     * @param voteCount The value for voteCount 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("voteCount")
    public final Builder voteCount(String voteCount) {
      this.voteCount = Objects.requireNonNull(voteCount, "voteCount");
      initBits &= ~INIT_BIT_VOTE_COUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchHit#originaLanguage() originaLanguage} attribute.
     * @param originaLanguage The value for originaLanguage 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("originaLanguage")
    public final Builder originaLanguage(String originaLanguage) {
      this.originaLanguage = Objects.requireNonNull(originaLanguage, "originaLanguage");
      initBits &= ~INIT_BIT_ORIGINA_LANGUAGE;
      return this;
    }

    /**
     * Builds a new {@link SearchHit SearchHit}.
     * @return An immutable instance of SearchHit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SearchHit build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSearchHit(
          id,
          overview,
          title,
          originalTitle,
          status,
          popularity,
          runtime,
          voteAverage,
          voteCount,
          originaLanguage);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_OVERVIEW) != 0) attributes.add("overview");
      if ((initBits & INIT_BIT_TITLE) != 0) attributes.add("title");
      if ((initBits & INIT_BIT_ORIGINAL_TITLE) != 0) attributes.add("originalTitle");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_POPULARITY) != 0) attributes.add("popularity");
      if ((initBits & INIT_BIT_RUNTIME) != 0) attributes.add("runtime");
      if ((initBits & INIT_BIT_VOTE_AVERAGE) != 0) attributes.add("voteAverage");
      if ((initBits & INIT_BIT_VOTE_COUNT) != 0) attributes.add("voteCount");
      if ((initBits & INIT_BIT_ORIGINA_LANGUAGE) != 0) attributes.add("originaLanguage");
      return "Cannot build SearchHit, some of required attributes are not set " + attributes;
    }
  }
}
