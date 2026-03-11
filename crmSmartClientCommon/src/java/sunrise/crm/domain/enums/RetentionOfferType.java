package sunrise.crm.domain.enums;


/** different retention offer type. 
 * distinct X_RETENTION_TYPE from TABLE_X_RETENTION_OFFER.
 * @author KumarAb
 *
 */
public enum RetentionOfferType {
    
    BC_TO_RC("BC to RC"),
    DRO2("DRO2"),
    LAST_OFFER("Last offer"),
    WINDRO2("WINDRO2"),
    DRO("DRO"),
    LAST_OFFER_XOF("Last offer XOF");

    private String displayValue;
    
    private static final java.util.Map<String, RetentionOfferType> ENUM_CONSTANTS = new java.util.HashMap<>();
    
    static {
        for (RetentionOfferType enumValue: RetentionOfferType.values()) {
            RetentionOfferType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    private RetentionOfferType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static RetentionOfferType fromDisplayValue(final String displayValue) {
        RetentionOfferType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid campaign type: " + displayValue);
    }
}
