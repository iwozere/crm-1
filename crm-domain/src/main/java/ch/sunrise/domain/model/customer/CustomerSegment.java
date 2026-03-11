package ch.sunrise.domain.model.customer;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Customer Segment.
 */
public enum CustomerSegment {

    RESIDENTIAL("Residential"),
    MEDIUM_CORPORATE("Medium Corporate"),
    LARGE_CORPORATE("Large Corporate"),
    SOHO("SoHo"),
    EMPLOYEE("Employee"),
    INTERCONNECT("Interconnect"),
    CARRIER("Carrier"),
    PARTNER("Partner"),
    INTERNAL_SUNRISE("InternalSunrise");

    private final String displayValue;

    private static final Map<String, CustomerSegment> LOOKUP = Map.copyOf(
            Stream.of(values()).collect(Collectors.toMap(
                    type -> type.displayValue.toUpperCase(),
                    type -> type)));

    CustomerSegment(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    /**
     * Finds the CustomerSegment by its display value (case-insensitive).
     *
     * @param displayValue The display value to look up.
     * @return An Optional containing the CustomerSegment if found, or empty
     *         otherwise.
     */
    public static Optional<CustomerSegment> fromDisplayValue(String displayValue) {
        return Optional.ofNullable(displayValue)
                .map(String::toUpperCase)
                .map(LOOKUP::get);
    }

    public boolean isBusinessCustomer() {
        return MEDIUM_CORPORATE.equals(this) || LARGE_CORPORATE.equals(this) || SOHO.equals(this);
    }
}
