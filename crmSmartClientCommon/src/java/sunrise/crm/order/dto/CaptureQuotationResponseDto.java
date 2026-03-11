package sunrise.crm.order.dto;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.xvo.product.ExecutionContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaptureQuotationResponseDto {

    private String correlationId;
    private String application;
    private String basketInfo;
    private String transactionId;

    private List<OrderInfoDto> orderInfo = new ArrayList<>();

    private static Log log = LogFactory.getLog(CaptureQuotationResponseDto.class);
    private transient ExecutionContext executionContext;

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

    public String getCorrelationId() {
        return correlationId;
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

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @Override
    public String toString() {
        return new com.google.gson.Gson().toJson(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        CaptureQuotationResponseDto responseDto = (CaptureQuotationResponseDto) o;

        if (!Objects.equals(this.correlationId, responseDto.correlationId)) {
            log.debug("CorrelationId is not equal.");
            return false;
        }
        if (!Objects.equals(this.application, responseDto.application)) {
            log.debug("Application is not equal.");
            return false;
        }
        if (!Objects.equals(this.basketInfo, responseDto.basketInfo)) {
            log.debug("BasketInfo is not equal.");
            return false;
        }
        if (!Objects.equals(this.transactionId, responseDto.transactionId)) {
            log.debug("TransactionId is not equal.");
            return false;
        }
        if (!Objects.equals(this.executionContext, responseDto.getExecutionContext())) {
            log.debug("ExecutionContext is not equal.");
            return false;
        }
        if (!Objects.equals(this.orderInfo, responseDto.getOrderInfo())) {
            log.debug("OrderInfo is not equal.");
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationId, application, basketInfo
                , transactionId, orderInfo, executionContext);
    }
}
