package sunrise.crm.util;

/**
 * SHA hashing algorithm enumeration
 * @author FernandezT
 *
 */
public enum HashAlgorithm {
		
	SHA1("SHA1"),
	SHA256("SHA-256"),
	SHA384("SHA-384"),
	SHA512("SHA-512"),
	HmacSHA256("HmacSHA256");
        
    private String displayValue;
    
    private static final java.util.Map<String, HashAlgorithm> ENUM_CONSTANTS = new java.util.HashMap<String, HashAlgorithm>();
    
    static {
        for (HashAlgorithm enumValue: HashAlgorithm.values()) {
        	HashAlgorithm.ENUM_CONSTANTS.put(enumValue.displayValue, enumValue);
        }
    };

    private HashAlgorithm(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
    
    @Override
    public String toString() {
        return getDisplayValue();
    }
    
    public static HashAlgorithm fromDisplayValue(final String displayValue) {
    	HashAlgorithm foundValue = ENUM_CONSTANTS.get(displayValue);
        if (foundValue != null) {
            return foundValue;
        }
        throw new IllegalArgumentException("Invalid access relevant attribute name: " + displayValue);
    }
}
