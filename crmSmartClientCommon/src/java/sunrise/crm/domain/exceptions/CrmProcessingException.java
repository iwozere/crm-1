package sunrise.crm.domain.exceptions;

import sunrise.crm.util.CrmStringUtil;

/**
 * @author Goncalves
 *
 */
public class CrmProcessingException extends CrmTechnicalException {
    
    private static final long serialVersionUID = 1L;
    
    private ProcessingIssue processingIssue;
    
    public CrmProcessingException(ProcessingIssue processingIssue, String ... additionalInformation) {
        super(String.format("%s: '%s'", processingIssue.getDescription(), CrmStringUtil.join(additionalInformation, "/")));
        this.processingIssue = processingIssue;
    }

    public CrmProcessingException(ProcessingIssue processingIssue, Throwable cause, String ... additionalInformation) {
        super(String.format("%s: '%s'", processingIssue.getDescription(), CrmStringUtil.join(additionalInformation, "/")), cause);
        this.processingIssue = processingIssue;
    }
    
    public ProcessingIssue getProcessingIssue() {
        return processingIssue;
    }
    
    public enum ProcessingIssue {
        
        INITILIZATION("Fatal exception during initializing"),
        CALL_METHOD_USING_REFLECTION("Error invoking method using reflection"),
        ENQUEUEING_MESSAGE("Fatal exception when enqueueing message"),
        DEQUEUEING_MESSAGE("Fatal exception when dequeueing message"),
        DATABASE_ACCESS("Database access error"),
        XML_EVALUATION("XML evaluation error"),
        UNEXPECTED_MESSAGE("Unexpected message received"),
        UNEXPECTED_CONDITION("Unexpected condition"),
        DUPLICATE_EVENT_PARAMETER("The specified event parameter is not unique"),
        METHOD_CALLER_NOT_ALLOWED("This method cannot be invoked from the current caller"),
        DEPRECATED_METHOD("The specified method is deprecated"), 
        UNSUPPORTED_CONFIGURATION("The specified configuration is not supported"),
        INCONSISTENT_PRODUCT_INSTALLATION("The product installation is inconsistent"),        
        RDB_ERROR("RDB Error"),
        NUTE_ONP_ERROR("Nute ONP Error"),
        NUTE_TV_ERROR("Error occured while Provisioning TV Service to NUTE Platform"),
        NUTE_INTERNET_ERROR("Error occured while Provisioning Internet Service to NUTE Platform"),
        NUTE_VOICE_ERROR("Error occured while Provisioning Voice Service to NUTE Platform"),
        NUTE_HOME_SECURITY_ERROR("Error occured while Provisioning Home Security Service to NUTE Platform"),
    	UNSUPPORTED_ACTION("The specified action is not valid for this operation"),
        NUTE_BCS_ERROR("Error occured while Provisioning BCS Cease to NUTE Platform"),
    	NUTE_CFFM_ERROR("Error occured while Provisioning CFFM to NUTE Platform"),
    	NUTE_HW_ERROR("Error occured while calling NUTE Hardware Selction"),
    	NUTE_LOOKOUT_ERROR("Error occured while Provisioning Lookout to NUTE Platform"),
    	KAFKA_PRODUCER_ERROR("Exception publishing message"),
    	STRING_CONVERSION_ERROR("Exception converting message to String"),
    	EXPRESSION_ERROR("Exception While evaluating the expression"),
    	REMOTE_ERROR("Error calling remote service: SAPCorrespondenceService:"),
    	ACTION_NOT_ALLOWED_ERROR("Action not allowed."),
    	PROVISIONING_ERROR("Error occured during provisioning."),
    	EXTERNAL_SYSTEM_ERROR("External system failed with exception");
        
        private String description;
        
        private ProcessingIssue(String description) {
            this.description = description;
        }
        
        public String getDescription() {
            return description;
        }
    }
}
