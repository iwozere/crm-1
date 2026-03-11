package ch.sunrise.domain.model.order;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Order type representing various business operations.
 */
public enum OrderType {
    CEASE("Cease"),
    CONVERSION("Conversion"),
    TRANSFER("Transfer"),
    MIGRATION("Migration"),
    MODIFY("Modify"),
    NEW("New"),
    RECONNECT("Reconnect"),
    RELOCATION("Relocation"),
    UPGRD_DWNGRD("Upgrade/Downgrade"),
    RETURN("Return"),
    NEW_INSTALLATION("New Installation"),
    CHANGE("Change"),
    SUSPEND("Suspend"),
    UNSUSPEND("Unsuspend"),
    CANCELLED("Cancelled"),
    CONNECT("Connect"),
    EXCHANGE("Exchange"),
    RECONCILIATION("Reconciliation"),
    DAASCONTRACT("DaaS Contract");

    private final String displayValue;

    OrderType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }

    private static final Map<String, OrderType> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    /**
     * Finds the OrderType by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the OrderType if found, or empty otherwise.
     */
    public static Optional<OrderType> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }
}