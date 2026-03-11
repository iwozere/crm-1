package ch.sunrise.domain.model.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private String objid;
    private String orderId;
    private LocalDate creationDate;
    private LocalDate scheduledDate;
    private List<LineItem> lineItems = new ArrayList<>();
    private OrderType orderType;
    private OrderSubAction orderSubAction;
    private List<OrderAttribute> attributes = new ArrayList<>();

    public OrderBuilder objid(String objid) {
        this.objid = objid;
        return this;
    }

    public OrderBuilder orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder creationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public OrderBuilder scheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
        return this;
    }

    public OrderBuilder lineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems != null ? new ArrayList<>(lineItems) : new ArrayList<>();
        return this;
    }

    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    public OrderBuilder orderSubAction(OrderSubAction orderSubAction) {
        this.orderSubAction = orderSubAction;
        return this;
    }

    public OrderBuilder attributes(List<OrderAttribute> attributes) {
        this.attributes = attributes != null ? new ArrayList<>(attributes) : new ArrayList<>();
        return this;
    }

    public Order build() {
        return new Order(objid, orderId, creationDate, scheduledDate, lineItems, orderType, orderSubAction, attributes);
    }
}
