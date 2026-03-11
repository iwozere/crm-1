package sunrise.crm.integration.pp.srap.qualification.product;

/**
 * Fixnet product families.
 * @author Oliveira
 *
 */
public enum ProductFamily {   
            
    //Currently supported Product Access Families ; ADSL and SELECT are just internal categories of obsolete
    //products. They will never be queried by any interface. They are used just to correctly identify the old
    //installed products.
    UNSPECIFIED("unspecified"),
    ULL("ull"), 
    XDSL_ULL_BROADBAND("xdslull"), 
    //VDSL("vdsl"), 
    VDSL2("vdsl2"), 
    VOICE("voice"), 
    VOICE_BROADBAND("voice_broadband"), 
    ADSL("adsl"), 
    FIXNET("fixnet"),
    SELECT("select"),
    TV("tv"),
    NIP("nip"),
    P24("p24"),
    VDSL_SHARED_BROADBAND("vdsl_shared"), 
    UNLIMITED("unlimited"),
    XDSL("xdsl"),
    SUNRISE_HOME_5G("home 5G"),    
    UNLIMITED_5G("unlimited 5G"),
    AURORA("aurora"),
    STELLA("stella"),
    MAX("max"),
    UP20("up20"),
    STB_TV("stb_tv"),
    KICKSTART("Kick-start"),
    OTT_TV("ott_tv"),
    BILL2("2Bill");
    
    // *************************************************************************
    // PRIVATE FIELDS AND CONSTANTS
    // *************************************************************************
    
    private String name = null;
    
    private static final java.util.Map<String, ProductFamily> ENUM_CONSTANTS = new java.util.HashMap<String, ProductFamily>();
    
    static {
        for (ProductFamily enumValue: ProductFamily.values()) {
            ProductFamily.ENUM_CONSTANTS.put(enumValue.name, enumValue);
        }
    };

    // *************************************************************************
    // PUBLIC STATIC METHODS
    // *************************************************************************

    /**
     * Get name.
     */
    public String getName() {
        return name;
    }
    // *************************************************************************
    // PRIVATE METHODS
    // *************************************************************************


    private ProductFamily(String name) {
        this.name = name;
    }
    
    public String toString() {
        return getName();
    }
    
    public static ProductFamily fromDisplayValue(final String displayValue) {
        ProductFamily foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid part type name: " + displayValue);
    }
    
}
