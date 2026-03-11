package sunrise.crm.domain.exceptions;

public abstract class CrmTechnicalException extends RuntimeException {
    
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

    public CrmTechnicalException(int errorCode, String errorMessage, Throwable cause) {
        super(errorMessage,cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CrmTechnicalException() {
        super();
    }

    public CrmTechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public CrmTechnicalException(String message) {
        super(message);
    }

    public CrmTechnicalException(Throwable cause) {
        super(cause);
    }
}
