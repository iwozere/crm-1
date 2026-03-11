package sunrise.crm.domain.enums;

import java.util.HashMap;
import java.util.Map;

public enum SiteDiscountLevelEnum {

    B0("B0"),
    B1("B1"),
    B2("B2"),
    B3("B3"),
    B4("B4"),
    B5("B5"),
    E1("E1"),
    E2("E2"),
    E3("E3"),
    E4("E4"),
    E5("E5");
    
    /**
     * Field value.
     */
    private final String value;

    /**
     * Field enumConstants.
     */
    private static final Map<String, SiteDiscountLevelEnum> enumConstants = new HashMap<String, SiteDiscountLevelEnum>();

    static {
        for (SiteDiscountLevelEnum c : SiteDiscountLevelEnum.values()) {
            SiteDiscountLevelEnum.enumConstants.put(c.value, c);
        }

    };

    // ----------------/
    // - Constructors -/
    // ----------------/

    private SiteDiscountLevelEnum(final String value) {
        this.value = value;
    }

    // -----------/
    // - Methods -/
    // -----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static SiteDiscountLevelEnum fromValue(final String value) {
        SiteDiscountLevelEnum c = SiteDiscountLevelEnum.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * @param value
     */
    public void setValue(final String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public String toString() {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public String value() {
        return this.value;
    }


    
    
}
