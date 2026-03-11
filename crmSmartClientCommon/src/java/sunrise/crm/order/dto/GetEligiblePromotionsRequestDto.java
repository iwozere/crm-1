package sunrise.crm.order.dto;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sunrise.crm.domain.enums.CampaignType;
import sunrise.crm.xvo.product.ExecutionContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GetEligiblePromotionsRequestDto {


    private String application;
    private String basketInfo;
    private String transactionId;
    private String siteId;
    private String customerLanguage;
    private String customerSegment;
    private String siteCategory;
    private List<BaseRequestDto> baseRequest = new ArrayList<>();
    private String ipId;
    private List<CampaignType> excludeCampaignTypes = new ArrayList<>();

	private transient ExecutionContext executionContext;

    public List<CampaignType> getExcludeCampaignTypes() {
		return excludeCampaignTypes;
	}

	public void setExcludeCampaignTypes(List<CampaignType> excludeCampaignTypes) {
		this.excludeCampaignTypes = excludeCampaignTypes;
	}

    public void setExecutionContext(ExecutionContext executionContext) {
        this.executionContext = executionContext;
    }

    public ExecutionContext getExecutionContext() {
        return executionContext;
    }

    private static Log log = LogFactory.getLog(GetEligiblePromotionsRequestDto.class);

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

    public void setBaseRequest(List<BaseRequestDto> baseRequest) {
        this.baseRequest = baseRequest;
    }

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    public String getIpId() {
        return ipId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetEligiblePromotionsRequestDto getEligiblePromotionsRequestDto = (GetEligiblePromotionsRequestDto) o;

        if (!Objects.equals(this.application, getEligiblePromotionsRequestDto.application)) {
            log.debug("Application is not equal.");
            return false;
        }
        if (!Objects.equals(this.basketInfo, getEligiblePromotionsRequestDto.basketInfo)) {
            log.debug("BasketInfo is not equal.");
            return false;
        }
        if (!Objects.equals(this.transactionId, getEligiblePromotionsRequestDto.transactionId)) {
            log.debug("TransactionId is not equal.");
            return false;
        }
        if (!Objects.equals(this.siteId, getEligiblePromotionsRequestDto.siteId)) {
            log.debug("SiteId is not equal.");
            return false;
        }
        if (!Objects.equals(this.customerLanguage, getEligiblePromotionsRequestDto.customerLanguage)) {
            log.debug("CustomerLanguage is not equal.");
            return false;
        }
        if (!Objects.equals(this.customerSegment, getEligiblePromotionsRequestDto.customerSegment)) {
            log.debug("CustomerSegment is not equal.");
            return false;
        }
        if (!Objects.equals(this.siteCategory, getEligiblePromotionsRequestDto.siteCategory)) {
            log.debug("SiteCategory is not equal.");
            return false;
        }
        if (!Objects.equals(this.baseRequest, getEligiblePromotionsRequestDto.baseRequest)) {
            log.debug("BaseRequest is not equal.");
            return false;
        }
        if (!Objects.equals(this.ipId, getEligiblePromotionsRequestDto.ipId)) {
            log.debug("IpId is not equal.");
            return false;
        }
        if (!Objects.equals(this.executionContext, getEligiblePromotionsRequestDto.executionContext)) {
            log.debug("ExecutionContext is not equal.");
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(application, basketInfo, transactionId, siteId
                , customerLanguage, customerSegment, siteCategory, baseRequest
                , ipId, executionContext);
    }
}
