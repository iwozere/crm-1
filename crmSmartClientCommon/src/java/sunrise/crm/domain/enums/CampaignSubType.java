package sunrise.crm.domain.enums;

/**
 * Campaign types. 715663 OTT.
 * 
 * @author Kosyrev
 *
 */
public enum CampaignSubType {
    
    STANDARD("Standard"), // Regular binding promo
    LOYALTY("Loyalty"),   // for LJI
    BUNDLED("Bundled");  // Bundled promotion

    private String displayValue;
    
    private static final java.util.Map<String, CampaignSubType> ENUM_CONSTANTS = new java.util.HashMap<>();
    
    static {
        for (CampaignSubType enumValue: CampaignSubType.values()) {
            CampaignSubType.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    }

    private CampaignSubType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static CampaignSubType fromDisplayValue(final String displayValue) {
        CampaignSubType foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid campaign subtype: " + displayValue);
    }
}
