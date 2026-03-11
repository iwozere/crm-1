package ch.sunrise.domain.model.order;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Order sub-action representing specific operational variants.
 */
public enum OrderSubAction {
    EMPTY(""),
    NONE("None"),
    EXTENSION("Extension"),
    RENEWAL("Renewal"),
    MIGRATION("Migration"),
    DP_ACTIVATION("DP activation"),
    AP_ACTIVATION("AP activation"),
    DP_RECREATE("DP recreate"),
    AP_RECREATE("AP recreate"),
    EXPIRATION("Expiration"),
    CANCEL("Cancel"),
    PAYOFF("Payoff"),
    DP_SWAP("DP swap"),
    AP_SWAP("AP swap"),
    DP_RETURN("DP return"),
    AP_RETURN("AP return"),
    HDW_EXCHANGE("HDW Exchange"),
    CORRECTION_ORDER("Correction Order");

    private final String displayValue;

    OrderSubAction(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }

    private static final Map<String, OrderSubAction> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    /**
     * Finds the OrderSubAction by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the OrderSubAction if found, or empty
     *         otherwise.
     */
    public static Optional<OrderSubAction> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }
}
