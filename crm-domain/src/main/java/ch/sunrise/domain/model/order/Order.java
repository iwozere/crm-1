package ch.sunrise.domain.model.order;

import ch.sunrise.domain.annotation.MappedFrom;
import java.time.LocalDate;
import java.util.List;

@MappedFrom("DaContract")
public record Order(
        String objid,
        String orderId,
        LocalDate creationDate,
        LocalDate scheduledDate,
        List<LineItem> lineItems,
        OrderType orderType,
        OrderSubAction orderSubAction,
        List<OrderAttribute> attributes) {

    public Order withObjid(String objid) {
        return new Order(objid, orderId, creationDate, scheduledDate, lineItems, orderType, orderSubAction, attributes);
    }

    public Order withLineItems(List<LineItem> lineItems) {
        return new Order(objid, orderId, creationDate, scheduledDate, lineItems, orderType, orderSubAction, attributes);
    }

    public Order withAttributes(List<OrderAttribute> attributes) {
        return new Order(objid, orderId, creationDate, scheduledDate, lineItems, orderType, orderSubAction, attributes);
    }
}