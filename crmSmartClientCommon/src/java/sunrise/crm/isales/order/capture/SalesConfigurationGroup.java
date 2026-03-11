package sunrise.crm.isales.order.capture;

public enum SalesConfigurationGroup {

    SECURITY("Security"),
    MOBILE_POSTPAID("Mobile Postpaid"),
    MOBILE_PREPAID("Mobile Prepaid"),
    MOBILE_INTERNET("Mobile Internet"),
    WIN_INTERNET("WIN / Internet"),
    WIN_TV("WIN / TV"),
    WIN_PHONE("WIN / Phone"),
    TV_OTT("TV OTT"),
    SUNRISE_PROTECT("Sunrise Protect"),
    DIGI("DIGI"),
    OPTIONS("Options");

    private String displayValue;

    private static final java.util.Map<String, SalesConfigurationGroup> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (SalesConfigurationGroup enumValue : SalesConfigurationGroup.values()) {
            SalesConfigurationGroup.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    SalesConfigurationGroup(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static SalesConfigurationGroup fromDisplayValue(final String displayValue) {
        SalesConfigurationGroup foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid sales part domain: " + displayValue);
    }
}
