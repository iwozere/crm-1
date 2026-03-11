package sunrise.crm.domain.enums;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Customer Salutation.
 * 
 * Make sure that it includes values from UDP x_prefix and x_prepaid_salutations(?).
 * 
 * @author Kosyrev
 * @since R37.0
 *
 */
public enum CustomerSalutation {
    
    NONE("--------------", false, false, CustomerLanguage.GERMAN, ""),
    PLEASE_SPECIFY("Please specify", false, false, CustomerLanguage.GERMAN, ""),
    COMPANY("Company", false, false, CustomerLanguage.ENGLISH, ""),
    FIRMA("Firma", false, false, CustomerLanguage.GERMAN, ""),
    AZIENDA("Azienda", false, false, CustomerLanguage.ITALIAN, ""),
    SOCIETE("Societe", false, false, CustomerLanguage.FRENCH, ""),
    FRAU("Frau", false, true, CustomerLanguage.GERMAN, "Sehr geehrte Frau "),
    MADAME("Madame", false, true, CustomerLanguage.FRENCH, "Madame,"),
    SIGNORA("Signora", false, true, CustomerLanguage.ITALIAN, "Gentile signora "),
    MRSDOT("Mrs.", false, true, CustomerLanguage.ENGLISH, "Dear Mrs. "),
    MS("Ms", false, true, CustomerLanguage.ENGLISH, "Dear Ms. "),
    MSDOT("Ms.", false, true, CustomerLanguage.ENGLISH, "Dear Ms. "),
    MRS("Mrs", false, true, CustomerLanguage.ENGLISH, "Dear Mrs. "),
    MME("Mme", false, true, CustomerLanguage.FRENCH, "Madame,"),
    MISS("Miss", false, true, CustomerLanguage.ENGLISH, "Dear Miss "),
    HERR("Herr", true, false, CustomerLanguage.GERMAN, "Sehr geehrter Herr "),
    MONSIEUR("Monsieur", true, false, CustomerLanguage.FRENCH, "Monsieur,"),
    SIGNOR("Signor", true, false, CustomerLanguage.ITALIAN, "Egregio signor "),
    MRDOT("Mr.", true, false, CustomerLanguage.ENGLISH, "Dear Mr. "),
    MR("Mr", true, false, CustomerLanguage.ENGLISH, "Dear Mr. "),
    MR_AND_MRS("Mrs. and Mr.", true, true, CustomerLanguage.ENGLISH, "Dear Mrs. and Mr. "),
    FRAU_UND_HERR("Frau und Herr", true, true, CustomerLanguage.GERMAN, "Sehr geehrte Frau und Herr "),
    MADAME_ET_MONSIEUR("Madame et Monsieur", true, true, CustomerLanguage.FRENCH, "Madame et Monsieur,"),
    SIGNORA_E_SIGNOR("Signora e Signor", true, true, CustomerLanguage.ITALIAN, "Gentile signora e signor ");

    private String displayValue;
    private boolean isMaleSalutation;
    private boolean isFemaleSalutation;
    private String emailSalutation;
    private CustomerLanguage customerLanguage;
    
    private static final java.util.Map<String, CustomerSalutation> ENUM_CONSTANTS = new java.util.HashMap<String, CustomerSalutation>();

    static {
        for (CustomerSalutation enumValue: CustomerSalutation.values()) {
            CustomerSalutation.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private CustomerSalutation(String displayValue, boolean isMaleSalutation, boolean isFemaleSalutation,
            CustomerLanguage language, String emailSalutation) {
        this.displayValue = displayValue;
        this.isMaleSalutation = isMaleSalutation;
        this.customerLanguage = language;
        this.emailSalutation = emailSalutation;
        this.isFemaleSalutation = isFemaleSalutation;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    public String getEmailSalutation() {
        return this.emailSalutation;
    }

    public Boolean isMaleSalutation() {
        return this.isMaleSalutation;
    }

    public Boolean isFemaleSalutation() {
        return this.isFemaleSalutation;
    }

    public CustomerLanguage getCustomerLanguage() {
        return this.customerLanguage;
    }

    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static CustomerSalutation fromDisplayValue(final String displayValue) {
        
        if (displayValue == null || displayValue.trim().length() == 0){
        	return getDefaultValue();
        }
        
        CustomerSalutation foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        
        // Please specify is not case sensitive
        if (PLEASE_SPECIFY.toString().equalsIgnoreCase(displayValue)){
            return PLEASE_SPECIFY;
        }

        return getDefaultValue();
    }
    
    public static CustomerSalutation getDefaultValue(){
        return CustomerSalutation.NONE;
    }

    /**
     * Returns list of customer salutations, filtered out by language and gender
     * @param language
     * @param isMale
     * @param isFemale
     * @return
     */
    public static List<CustomerSalutation> getByLanguageAndGender(CustomerLanguage language, 
            boolean isMale, boolean isFemale){
        List<CustomerSalutation> result = new ArrayList<CustomerSalutation>(); 
        Iterator<Map.Entry<String, CustomerSalutation>> it = ENUM_CONSTANTS.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, CustomerSalutation> entry = it.next();
            CustomerSalutation value = entry.getValue();
            if (value.isMaleSalutation == isMale 
                    && value.isFemaleSalutation == isFemale
                    && value.getCustomerLanguage().equals(language)){
                result.add(value);
            }
        }
        return result;
    }
}
