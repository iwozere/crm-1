package sunrise.crm.domain.exceptions;



/**
 * @author Goncalves
 *
 */
public class CrmValidationException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
        
    private int errorCode = 0;
    private String errorMessage = "";

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CrmValidationException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    
    public CrmValidationException(String emptyAttributeName) {
        super(String.format("Attribute '%s' is empty", emptyAttributeName));
    }
    
    public CrmValidationException(Class<?> entityClass) {
        super(String.format("Entity '%s' is empty", entityClass.getSimpleName()));
    }
    
    public CrmValidationException(String invalidAttributeName, String invalidReason) {
        super(String.format("Attribute '%s' is invalid. Reason '%s'", invalidAttributeName, invalidReason));
    }
    
    public CrmValidationException(String attributeName, String actual, String expected) {
        super(String.format("Attribute '%s' mismatch. Actual: '%s', Expected: '%s'", attributeName, actual, expected));
    }
    
    public CrmValidationException(String emptyQueryParameter, String tableName, int dummy) {
        super(String.format("Invalid 'table_%s' query. Parameter '%s' is empty", tableName, emptyQueryParameter));
    }
}
