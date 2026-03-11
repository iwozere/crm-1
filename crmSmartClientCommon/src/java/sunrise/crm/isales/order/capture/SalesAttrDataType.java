package sunrise.crm.isales.order.capture;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum SalesAttrDataType {

    B("Boolean"),
    C("Currency"),
    D("Date"),
    N("Number"),
    S("String");

    private String displayValue;

    private static final java.util.Map<String, SalesAttrDataType> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (SalesAttrDataType enumValue : SalesAttrDataType.values()) {
            SalesAttrDataType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    SalesAttrDataType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static SalesAttrDataType fromDisplayValue(final String displayValue) {
        SalesAttrDataType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid attribute type: " + displayValue);
    }

    public static List<String> stringValues(){
        return Stream.of(SalesAttrDataType.values())
                .map(SalesAttrDataType::getDisplayValue)
                .collect(Collectors.toList());
    }


    public static List<String> stringNames(){
        return Stream.of(SalesAttrDataType.values())
                .map(SalesAttrDataType::name)
                .collect(Collectors.toList());
    }
}