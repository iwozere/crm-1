package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.util.CrmStringUtil;
import sunrise.crm.xvo.product.ExecutionContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaptureQuotationRequestDto {

	private String correlationId;
	private String application;
    private String basketInfo;
    private String transactionId;
    private String siteId;
    private String customerLanguage;
    private String customerSegment;
    private String siteCategory;
    private boolean skipPendingActivation = false;
    private boolean completePendingOrders = false;
    private ProcessingMode mode = ProcessingMode.SEQUENTIAL;
	private List<BaseRequestDto> baseRequest = new ArrayList<>();
	private String multiMobileEnablerSerialNo;
	
	private String currentProductsCacheId;
	private String futureProductsCacheId;

    private SalesInfoDto callerInfo;

	private transient ExecutionContext executionContext;

    private static Log log = LogFactory.getLog(CaptureQuotationRequestDto.class);
    
    public CaptureQuotationRequestDto(){}
    
    public CaptureQuotationRequestDto(CaptureQuotationRequestDto dto){
    	this.application = dto.getApplication();
    	this.basketInfo = dto.getBasketInfo();
    	this.transactionId = dto.getTransactionId();
    	this.siteId = dto.getSiteId();
    	this.customerLanguage = dto.getCustomerLanguage();
    	this.customerSegment = dto.getCustomerSegment();
    	this.siteCategory = dto.getSiteCategory();
    	this.skipPendingActivation = dto.isSkipPendingActivation();
    	this.completePendingOrders = dto.isCompletePendingOrders();
        this.mode = dto.getMode();
        this.executionContext = new ExecutionContext(dto.getExecutionContext());
        this.callerInfo = dto.getCallerInfo();
		for (BaseRequestDto req : dto.getBaseRequest()){
    		this.baseRequest.add(new BaseRequestDto(req));
    	}
    }

    public String getApplication() {
        return application;
    }

    public String getBasketInfo() {
        return basketInfo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getCustomerLanguage() {
        return customerLanguage;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public String getSiteCategory() {
        return siteCategory;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public void setBasketInfo(String basketInfo) {
        this.basketInfo = basketInfo;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setCustomerLanguage(String customerLanguage) {
        this.customerLanguage = customerLanguage;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public void setSiteCategory(String siteCategory) {
        this.siteCategory = siteCategory;
    }

    public List<BaseRequestDto> getBaseRequest() {
        return baseRequest;
    }

    public ExecutionContext getExecutionContext() {
        return executionContext;
    }

    public void setExecutionContext(ExecutionContext executionContext) {
        this.executionContext = executionContext;
    }

    /**
     * When this flag is set to True, all We Mobile Pack New orders (aka Pending Activation)
     * and all RP change orders from non-Pack products to Pack (aka Pending RP Change) will be removed
     * from the context, corresponding bundle items as well and captureQuotation will not use them at all.
     * @return
     */
    public boolean isSkipPendingActivation() {
		return skipPendingActivation;
	}

    /**
     * When this flag is set to True, all We Mobile Pack New orders (aka Pending Activation)
     * and all RP change orders from non-Pack products to Pack (aka Pending RP Change) will be removed
     * from the context, corresponding bundle items as well and captureQuotation will not use them at all.
     * @param skipPendingActivation
     */
	public void setSkipPendingActivation(boolean skipPendingActivation) {
		this.skipPendingActivation = skipPendingActivation;
	}

	/**
	 * When True, all pending orders will be provisioned into the context as if they were completed.
	 * @return
	 */
	public boolean isCompletePendingOrders() {
		return completePendingOrders;
	}

	/**
	 * When True, all pending orders will be provisioned into the context as if they were completed.
	 * @param completePendingOrders
	 */
	public void setCompletePendingOrders(boolean completePendingOrders) {
		this.completePendingOrders = completePendingOrders;
	}

    public ProcessingMode getMode() {
        return mode;
    }

    public void setMode(ProcessingMode processingMode) {
        this.mode = processingMode;
    }
    
    public String getCorrelationId() {
    	if (CrmStringUtil.isBlank(correlationId)){
    		correlationId = CrmStringUtil.generateCorrelationId(siteId);
    	}
		return correlationId;
	}

	public String getMultiMobileEnablerSerialNo() {
		return multiMobileEnablerSerialNo;
	}

	public void setMultiMobileEnablerSerialNo(String multiMobileEnablerSerialNo) {
		this.multiMobileEnablerSerialNo = multiMobileEnablerSerialNo;
	}

	public String getCurrentProductsCacheId() {
		return currentProductsCacheId;
	}

	public void setCurrentProductsCacheId(String currentProductsCacheId) {
		this.currentProductsCacheId = currentProductsCacheId;
	}

    public String getFutureProductsCacheId() {
		return futureProductsCacheId;
	}

	public void setFutureProductsCacheId(String futureProductsCacheId) {
		this.futureProductsCacheId = futureProductsCacheId;
	}

	public SalesInfoDto getCallerInfo() {
		return callerInfo;
	}

	public void setCallerInfo(SalesInfoDto callerInfo) {
		this.callerInfo = callerInfo;
	}

	@Override
    public String toString() {
        return new com.google.gson.Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaptureQuotationRequestDto captureQuotationRequestDto = (CaptureQuotationRequestDto) o;

        if (!Objects.equals(this.skipPendingActivation, captureQuotationRequestDto.skipPendingActivation)) {
            log.debug("SkipPendingActivation is not equal.");
            return false;
        }
        if (!Objects.equals(this.completePendingOrders, captureQuotationRequestDto.completePendingOrders)) {
            log.debug("CompletePendingOrders is not equal.");
            return false;
        }
        if (!Objects.equals(this.correlationId, captureQuotationRequestDto.correlationId)) {
            log.debug("CorrelationId is not equal.");
            return false;
        }
        if (!Objects.equals(this.application, captureQuotationRequestDto.application)) {
            log.debug("Application is not equal.");
            return false;
        }
        if (!Objects.equals(this.basketInfo, captureQuotationRequestDto.basketInfo)) {
            log.debug("BasketInfo is not equal.");
            return false;
        }
        if (!Objects.equals(this.transactionId, captureQuotationRequestDto.transactionId)) {
            log.debug("TransactionId is not equal.");
            return false;
        }
        if (!Objects.equals(this.siteId, captureQuotationRequestDto.siteId)) {
            log.debug("SiteId is not equal.");
            return false;
        }
        if (!Objects.equals(this.customerLanguage, captureQuotationRequestDto.customerLanguage)) {
            log.debug("CustomerLanguage is not equal.");
            return false;
        }
        if (!Objects.equals(this.customerSegment, captureQuotationRequestDto.customerSegment)) {
            log.debug("CustomerSegment is not equal.");
            return false;
        }
        if (!Objects.equals(this.siteCategory, captureQuotationRequestDto.siteCategory)) {
            log.debug("SiteCategory is not equal.");
            return false;
        }
        if (!Objects.equals(this.baseRequest, captureQuotationRequestDto.baseRequest)) {
            log.debug("BaseRequest is not equal.");
            return false;
        }
        if (!Objects.equals(this.executionContext, captureQuotationRequestDto.executionContext)) {
            log.debug("ExecutionContext is not equal.");
            return false;
        }
        if (!Objects.equals(this.mode, captureQuotationRequestDto.mode)) {
            log.debug("Mode is not equal.");
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationId, application, basketInfo, transactionId
                , siteId, customerLanguage, customerSegment, siteCategory
                , skipPendingActivation, completePendingOrders, mode
                , baseRequest, executionContext);
    }
}
