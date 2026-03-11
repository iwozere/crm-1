package sunrise.crm.domain.enums;

/**
 * Campaign types. Q6454.
 * 
 * @author Kosyrev
 *
 */
public enum CampaignType {
    
    OPT_IN("SMS"),
    OPT_OUT("Flexible Benefit"),
    VOUCHER("Voucher"),
    BINDING_PROMO("Binding Promo"),
    BINDING_ATL_OFFER("Binding ATL Offer"),
    BINDING_PROMO_WITH_GIFT("Binding Promo with Gift"),
    BINDING_PROMO_DP_SUBSIDY("Binding Promo DP Subsidy"),
    VOUCHER_GENERATING_PROMO("Voucher Generating Promo"),
    VALUE_BASED_PROMO("Value Based Promo"),
    BASE_PRICE_PROMO("Base Price Promo");

    private String displayValue;
    
    private static final java.util.Map<String, CampaignType> ENUM_CONSTANTS = new java.util.HashMap<>();
    
    static {
        for (CampaignType enumValue: CampaignType.values()) {
            CampaignType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    private CampaignType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static CampaignType fromDisplayValue(final String displayValue) {
        CampaignType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid campaign type: " + displayValue);
    }
}
