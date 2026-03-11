package ch.sunrise.domain.model.order;

import java.util.List;

public record LineItem(
        String objid,
        String name,
        LineItemAction action,
        String flexBenefitObjid,
        String sitePartObjid,
        List<OrderAttribute> attributes) {
}
