package sunrise.crm.domain.enums;

import java.util.Arrays;
import java.util.List;

public enum PartClassification {
     TV("TV"),
     OTT_TV("OTT TV"),
     VOICE("Voice"),
     INTERNET("Internet"),
     HZN_TV("HZN TV"),
     WIFI_POD("WIFI POD"),
     OTT_SERVICE("OTT Service"),
     FIXNET("Fixnet"),
     MOBILE("Mobile"),
     OTT_VAS("OTT VAS"),
     OTT_BUNDLE("OTT Bundle"),
     SECURITY("Security")
     ;
     
    private String value;
   
    public static final List<PartClassification> TV_SERVICES = Arrays.asList(TV, OTT_TV, HZN_TV,OTT_VAS, OTT_BUNDLE); // 696381
    
    public static final List<String> TV_SERVICES_STR = Arrays.asList(TV.toString(), OTT_TV.toString(), HZN_TV.toString(), OTT_VAS.toString(), OTT_BUNDLE.toString()); // 696381

    private static final java.util.Map<String, PartClassification> ENUM_CONSTANTS = new java.util.HashMap<>();

    static {
        for (PartClassification enumValue : PartClassification.values()) {
            PartClassification.ENUM_CONSTANTS.put(enumValue.value, enumValue);
        }
    }
    
  
    public static PartClassification fromDisplayValue(final String displayValue) {        
        return ENUM_CONSTANTS.get(displayValue);
    }
    
    private PartClassification(final java.lang.String value) {
        this.value = value;
    }
    
    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    @Override
    public java.lang.String toString() {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value() {
        return this.value;
    }
}

