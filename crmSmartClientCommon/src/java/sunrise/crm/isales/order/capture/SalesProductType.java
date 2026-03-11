package sunrise.crm.isales.order.capture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum SalesProductType {
    POSTPAID("Mobile Postpaid", "Mobile Postpaid"),
    PREPAID("Mobile Prepaid", "Mobile Prepaid"),
    MOBILE_INTERNET("Mobile Internet", "Mobile Internet Postpaid"),
    WIN("Internet/TV", "click&call+ (ULL)", "click&call/ call"),
    TV_OTT("TV OTT", "others/ various"),
    SUNRISE_PROTECT("Sunrise Protect", "others/ various"),
    DIGI("DIGI", "OTT"),
    SECURITY("Security", "Mobile Postpaid");

    private String displayValue;
    private List<String> creditCheckGroups;

    private static final java.util.Map<String, SalesProductType> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (SalesProductType enumValue : SalesProductType.values()) {
            SalesProductType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    SalesProductType(String displayValue, String... creditCheckGroups) {
        this.displayValue = displayValue;
        this.creditCheckGroups = new ArrayList<>();
        this.creditCheckGroups.addAll(Arrays.asList(creditCheckGroups));
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    public List<String> getCreditCheckGroups(){
        return creditCheckGroups;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static SalesProductType fromDisplayValue(final String displayValue) {
        SalesProductType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid sales product type: " + displayValue);
    }
}
