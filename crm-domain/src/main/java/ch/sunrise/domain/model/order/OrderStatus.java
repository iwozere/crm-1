package ch.sunrise.domain.model.order;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Order status representing the lifecycle state of an order.
 */
public enum OrderStatus {
    NEW_ORDER("New Order"),
    PENDING("Pending"),
    CANCELLED("Cancelled"),
    CLOSED("Closed"),
    CONFIRMED("Confirmed"),
    REJECTED("Rejected"),
    NONE("None"),
    OFFER("Offer"),
    ORDER("Order"),
    DECLINED("Declined"),
    EXPIRED("Expired");

    private final String displayValue;

    OrderStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }

    private static final Map<String, OrderStatus> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    /**
     * Finds the OrderStatus by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the OrderStatus if found, or empty otherwise.
     */
    public static Optional<OrderStatus> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }
}
