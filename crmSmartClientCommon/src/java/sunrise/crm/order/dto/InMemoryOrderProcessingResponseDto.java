package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.xvo.product.ExecutionContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemoryOrderProcessingResponseDto {

    private ExecutionContext executionContext;

    private List<OrderInfoDto> orderInfo = new ArrayList<OrderInfoDto>();

    private String application;
    private String basketInfo;
    private String transactionId;
    private String ineligibleReason;
    private static Log log = LogFactory.getLog(InMemoryOrderProcessingResponseDto.class);

    public ExecutionContext getExecutionContext() {
        return executionContext;
    }

    public void setExecutionContext(ExecutionContext executionContext) {
        this.executionContext = executionContext;
    }

    public List<OrderInfoDto> getOrderInfo() {
        return orderInfo;
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

    public void setApplication(String application) {
        this.application = application;
    }

    public void setBasketInfo(String basketInfo) {
        this.basketInfo = basketInfo;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getIneligibleReason() {
        return ineligibleReason;
    }

    public void setIneligibleReason(String ineligibleReason) {
        this.ineligibleReason = ineligibleReason;
    }

    @Override
    public String toString() {
        return new com.google.gson.Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InMemoryOrderProcessingResponseDto inMemoryOrderProcessingResponseDto = (InMemoryOrderProcessingResponseDto) o;

        if (!Objects.equals(this.executionContext, inMemoryOrderProcessingResponseDto.executionContext)) {
            log.debug("ExecutionContext is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderInfo, inMemoryOrderProcessingResponseDto.orderInfo)) {
            log.debug("OrderInfo is not equal.");
            return false;
        }
        if (!Objects.equals(this.application, inMemoryOrderProcessingResponseDto.application)) {
            log.debug("Application is not equal.");
            return false;
        }
        if (!Objects.equals(this.basketInfo, inMemoryOrderProcessingResponseDto.basketInfo)) {
            log.debug("BasketInfo is not equal.");
            return false;
        }
        if (!Objects.equals(this.transactionId, inMemoryOrderProcessingResponseDto.transactionId)) {
            log.debug("TransactionId is not equal.");
            return false;
        }
        if (!Objects.equals(this.ineligibleReason, inMemoryOrderProcessingResponseDto.ineligibleReason)) {
            log.debug("IneligibleReason is not equal.");
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionContext, orderInfo, application, basketInfo
                , transactionId, ineligibleReason);
    }
}
