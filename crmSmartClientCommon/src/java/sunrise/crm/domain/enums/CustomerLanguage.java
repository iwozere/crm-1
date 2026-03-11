/**
 * 
 */
package sunrise.crm.domain.enums;

/**
 * @author Kosyrev
 * @since R37.0
 *
 */
public enum CustomerLanguage {
    
    GERMAN(1, "German", "de", "deu", "D"),
    FRENCH(2, "French", "fr", "fra", "F"),
    ITALIAN(3, "Italian", "it", "ita", "I"),
    ENGLISH(4, "English", "en", "eng", "E");
    
    private String isoCode2;
    private String isoCode3;
    private String name;
    private int id;
    private String abbreviation;
    
    private static final java.util.Map<String, CustomerLanguage> ENUM_CONSTANTS = new java.util.HashMap<String, CustomerLanguage>();
    
    static {
        for (CustomerLanguage enumValue: CustomerLanguage.values()) {
            CustomerLanguage.ENUM_CONSTANTS.put(enumValue.name, enumValue);
        }
    };
    
    private static final java.util.Map<String, CustomerLanguage> ENUM_ISO2_CONSTANTS = new java.util.HashMap<String, CustomerLanguage>();
    
    static {
        for (CustomerLanguage enumValue: CustomerLanguage.values()) {
            CustomerLanguage.ENUM_ISO2_CONSTANTS.put(enumValue.isoCode2, enumValue);
        }
    };

    /**
     * Converts string into enum member. Exception is thrown for unknown values.
     * @param displayValue
     * @return
     */
    public static CustomerLanguage fromDisplayValue(final String displayValue) {
        CustomerLanguage foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid language value: " + displayValue);
    }
    public static CustomerLanguage fromIsoCode2(final String isoCode2DisplayValue) {
        CustomerLanguage foundValue = ENUM_ISO2_CONSTANTS.get(isoCode2DisplayValue);
        if (foundValue != null) {
            return foundValue;
        }
        foundValue = ENUM_ISO2_CONSTANTS.get(isoCode2DisplayValue.toLowerCase());
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid language value: " + isoCode2DisplayValue);
    }

    /**
     * Converts string into enum member. Exception is not thrown 
     * for unknown values. GERMAN language returned instead as a 
     * customer default language.
     * @param displayValue
     * @return
     */
    public static CustomerLanguage fromDisplayValueNoException(final String displayValue) {
        CustomerLanguage foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        return CustomerLanguage.GERMAN;
    }

    private CustomerLanguage(int id, String displayValue, String isoCode2, String isoCode3, String abbreviation) {
        this.id = id;
        this.name = displayValue;
        this.isoCode2 = isoCode2;
        this.isoCode3 = isoCode3;
        this.abbreviation = abbreviation;
    }
    
    public String getDisplayValue() {
        return this.name;
    }
    
    public static CustomerLanguage getDefault(){
        return CustomerLanguage.GERMAN;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }

    /**
     * Get the type.
     *
     * @return Returns the type.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the id.
     *
     * @return Returns the id.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns iso code for language (3 chars)
     * @return
     */
    public String getIsoCode() {
        return isoCode3;
    }

    /**
     * Returns short iso code for language (2 chars)
     * @return
     */
    public String getShortIsoCode() {
        return isoCode2;
    }

    /**
     * Returns abbreviation code for language (1 char). Used by Vitria.
     * @return
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    public static CustomerLanguage fromIdNoException(final int id) {
        for (CustomerLanguage cl : ENUM_CONSTANTS.values()){
            if (cl.getId() == id){
                return cl;
            }
        }
        return getDefault();
    }
}
