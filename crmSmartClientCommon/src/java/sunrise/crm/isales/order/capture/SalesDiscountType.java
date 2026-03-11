package sunrise.crm.isales.order.capture;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This enum represents type of the discount, being installed by the promo.
 * It can be one time or recurring discount on the rate plan or OC/RC on the option.
 * This "discount" can also be an option itself, without any discount, when it gets installed by promotion.
 * 
 * @author Kosyrev
 *
 */
public enum SalesDiscountType {
	
    RP_RECURRING("RP RC DISCOUNT"),
    HW_ONE_TIME("HW OC DISCOUNT"),
    RP_ONE_TIME("RP OC DISCOUNT"),
    OPTION_RECURRING("OPTION RC DISCOUNT"),
    OPTION_ONE_TIME("OPTION OC DISCOUNT"),
    OPTION("OPTION");

    private String displayValue;

    private static final java.util.Map<String, SalesDiscountType> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (SalesDiscountType enumValue : SalesDiscountType.values()) {
        	SalesDiscountType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    SalesDiscountType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }

    public static SalesDiscountType fromDisplayValue(final String displayValue) {
    	SalesDiscountType foundValue = ENUM_CONSTANTS.get(displayValue);
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
