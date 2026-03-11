package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemoryOrderProcessingRequestDto {

    private String application;
    private String basketInfo;
    private String transactionId;
    private String siteId;
    private String customerLanguage;
    private String customerSegment;
    private String siteCategory;
    private List<BaseRequestDto> baseRequest = new ArrayList<>();
    private static Log log = LogFactory.getLog(InMemoryOrderProcessingRequestDto.class);

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

    @Override
    public String toString() {
        return new com.google.gson.Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InMemoryOrderProcessingRequestDto inMemoryOrderProcessingRequestDto = (InMemoryOrderProcessingRequestDto) o;

        if (!Objects.equals(this.application, inMemoryOrderProcessingRequestDto.application)) {
            log.debug("Application is not equal.");
            return false;
        }
        if (!Objects.equals(this.basketInfo, inMemoryOrderProcessingRequestDto.basketInfo)) {
            log.debug("BasketInfo is not equal.");
            return false;
        }
        if (!Objects.equals(this.transactionId, inMemoryOrderProcessingRequestDto.transactionId)) {
            log.debug("TransactionId is not equal.");
            return false;
        }
        if (!Objects.equals(this.siteId, inMemoryOrderProcessingRequestDto.siteId)) {
            log.debug("SiteId is not equal.");
            return false;
        }
        if (!Objects.equals(this.customerLanguage, inMemoryOrderProcessingRequestDto.customerLanguage)) {
            log.debug("CustomerLanguage is not equal.");
            return false;
        }
        if (!Objects.equals(this.customerSegment, inMemoryOrderProcessingRequestDto.customerSegment)) {
            log.debug("CustomerSegment is not equal.");
            return false;
        }
        if (!Objects.equals(this.siteCategory, inMemoryOrderProcessingRequestDto.siteCategory)) {
            log.debug("SiteCategory is not equal.");
            return false;
        }
        if (!Objects.equals(this.baseRequest, inMemoryOrderProcessingRequestDto.baseRequest)) {
            log.debug("BaseRequest is not equal.");
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(application, basketInfo, transactionId, siteId
                , customerLanguage, customerSegment, siteCategory, baseRequest);
    }
}
