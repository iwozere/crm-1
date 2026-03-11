package sunrise.crm.isales.order.capture;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum SalesPartDomain {

    GSM("GSM Contract"),
    PREPAID("Mobile Prepaid Contract"),
    ULL("ULL Contract"),
    SUBSCRIPTION("Subscription Contract");

    private String displayValue;

    private static final java.util.Map<String, SalesPartDomain> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (SalesPartDomain enumValue : SalesPartDomain.values()) {
            SalesPartDomain.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    SalesPartDomain(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static SalesPartDomain fromDisplayValue(final String displayValue) {
        SalesPartDomain foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid sales part domain: " + displayValue);
    }

    public static List<String> stringValues(){
        return Stream.of(SalesPartDomain.values())
                .map(SalesPartDomain::getDisplayValue)
                .collect(Collectors.toList());
    }
}
