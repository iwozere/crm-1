package ch.sunrise.domain.model.product;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Status representing the lifecycle state of a site part.
 */
public enum SitePartStatus {

    INSTALLED("Installed"),
    DEINSTALLED("Deinstalled"),
    DISCONNECTED("Disconnected"),
    CANCELLED("Cancelled"),
    SUSPENDED("Suspended"),
    PENDING_EXCHANGE("Pending Exchange"),
    PENDING_RETURN("Pending Return"),
    SHIPPED("shipped"),
    PENDING_PROVISIONING("Pending Provisioning"),
    PENDING_CEASE("Pending Cease");

    private final String displayValue;

    SitePartStatus(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }

    private static final Map<String, SitePartStatus> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    /**
     * Finds the SitePartStatus by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the SitePartStatus if found, or empty
     *         otherwise.
     */
    public static Optional<SitePartStatus> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }
}
