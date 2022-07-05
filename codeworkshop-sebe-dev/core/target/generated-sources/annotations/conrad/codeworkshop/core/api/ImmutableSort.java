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
 * Immutable implementation of {@link Sort}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSort.builder()}.
 */
@Generated(from = "Sort", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableSort implements Sort {
  private final String fieldName;
  private final Sort.Order order;

  private ImmutableSort(ImmutableSort.Builder builder) {
    this.fieldName = builder.fieldName;
    this.order = builder.order != null
        ? builder.order
        : Objects.requireNonNull(Sort.super.order(), "order");
  }

  private ImmutableSort(String fieldName, Sort.Order order) {
    this.fieldName = fieldName;
    this.order = order;
  }

  /**
   * @return The value of the {@code fieldName} attribute
   */
  @JsonProperty("fieldName")
  @Override
  public String fieldName() {
    return fieldName;
  }

  /**
   * @return The value of the {@code order} attribute
   */
  @JsonProperty("order")
  @Override
  public Sort.Order order() {
    return order;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Sort#fieldName() fieldName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for fieldName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSort withFieldName(String value) {
    String newValue = Objects.requireNonNull(value, "fieldName");
    if (this.fieldName.equals(newValue)) return this;
    return new ImmutableSort(newValue, this.order);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Sort#order() order} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for order
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSort withOrder(Sort.Order value) {
    if (this.order == value) return this;
    Sort.Order newValue = Objects.requireNonNull(value, "order");
    if (this.order.equals(newValue)) return this;
    return new ImmutableSort(this.fieldName, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSort} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSort
        && equalTo((ImmutableSort) another);
  }

  private boolean equalTo(ImmutableSort another) {
    return fieldName.equals(another.fieldName)
        && order.equals(another.order);
  }

  /**
   * Computes a hash code from attributes: {@code fieldName}, {@code order}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + fieldName.hashCode();
    h += (h << 5) + order.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Sort} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Sort")
        .omitNullValues()
        .add("fieldName", fieldName)
        .add("order", order)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Sort} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Sort instance
   */
  public static ImmutableSort copyOf(Sort instance) {
    if (instance instanceof ImmutableSort) {
      return (ImmutableSort) instance;
    }
    return ImmutableSort.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSort ImmutableSort}.
   * <pre>
   * ImmutableSort.builder()
   *    .fieldName(String) // required {@link Sort#fieldName() fieldName}
   *    .order(conrad.codeworkshop.core.api.Sort.Order) // optional {@link Sort#order() order}
   *    .build();
   * </pre>
   * @return A new ImmutableSort builder
   */
  public static ImmutableSort.Builder builder() {
    return new ImmutableSort.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSort ImmutableSort}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Sort", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_FIELD_NAME = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String fieldName;
    private @Nullable Sort.Order order;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Sort} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Sort instance) {
      Objects.requireNonNull(instance, "instance");
      fieldName(instance.fieldName());
      order(instance.order());
      return this;
    }

    /**
     * Initializes the value for the {@link Sort#fieldName() fieldName} attribute.
     * @param fieldName The value for fieldName 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("fieldName")
    public final Builder fieldName(String fieldName) {
      this.fieldName = Objects.requireNonNull(fieldName, "fieldName");
      initBits &= ~INIT_BIT_FIELD_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Sort#order() order} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Sort#order() order}.</em>
     * @param order The value for order 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("order")
    public final Builder order(Sort.Order order) {
      this.order = Objects.requireNonNull(order, "order");
      return this;
    }

    /**
     * Builds a new {@link ImmutableSort ImmutableSort}.
     * @return An immutable instance of Sort
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSort build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSort(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FIELD_NAME) != 0) attributes.add("fieldName");
      return "Cannot build Sort, some of required attributes are not set " + attributes;
    }
  }
}
