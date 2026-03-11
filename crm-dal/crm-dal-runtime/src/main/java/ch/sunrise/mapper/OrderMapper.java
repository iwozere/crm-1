package ch.sunrise.mapper;

import ch.sunrise.dal.entity.DaContract;
import ch.sunrise.dal.entity.DaContrItm;
import ch.sunrise.dal.entity.DaXContractAttr;
import ch.sunrise.domain.model.order.LineItem;
import ch.sunrise.domain.model.order.Order;
import ch.sunrise.domain.model.order.OrderAttribute;
import ch.sunrise.domain.model.order.OrderType;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {

    @Mapping(target = "objid", expression = "java(contract.getObjid().toString())")
    @Mapping(target = "orderId", source = "id")
    @Mapping(target = "creationDate", expression = "java(contract.getCreateDt().toLocalDate())")
    @Mapping(target = "scheduledDate", expression = "java(contract.getXSchedDate() != null ? contract.getXSchedDate().toLocalDate() : null)")
    @Mapping(target = "orderType", source = "type", qualifiedByName = "toOrderType")
    @Mapping(target = "orderSubAction", source = "XOrderSubaction", qualifiedByName = "toOrderSubAction")
    @Mapping(target = "lineItems", expression = "java(mapLineItems(contract))")
    @Mapping(target = "attributes", source = "contract2XContrAttr")
    Order toDomain(DaContract contract);

    @Mapping(target = "id", source = "orderId")
    @Mapping(target = "createDt", expression = "java(domain.creationDate().atStartOfDay())")
    @Mapping(target = "XSchedDate", expression = "java(domain.scheduledDate() != null ? domain.scheduledDate().atStartOfDay() : null)")
    @Mapping(target = "type", source = "orderType.displayValue")
    @Mapping(target = "objid", ignore = true)
    @Mapping(target = "XOrderSubaction", source = "orderSubAction.displayValue")
    void toEntity(Order domain, @MappingTarget DaContract entity);

    @Mapping(target = "name", source = "XName")
    @Mapping(target = "value", source = "XValue")
    @Mapping(target = "dateValue", source = "XDteValue")
    OrderAttribute toAttribute(DaXContractAttr attr);

    @Named("toOrderType")
    default OrderType toOrderType(String type) {
        return OrderType.fromDisplayValue(type).orElse(null);
    }

    @Named("toOrderSubAction")
    default ch.sunrise.domain.model.order.OrderSubAction toOrderSubAction(String subAction) {
        return ch.sunrise.domain.model.order.OrderSubAction.fromDisplayValue(subAction).orElse(null);
    }

    default List<LineItem> mapLineItems(DaContract contract) {
        if (contract.getContract2ContrSchedule() == null) return List.of();
        return contract.getContract2ContrSchedule().stream()
                .flatMap(s -> s.getSchedule2ContrItm().stream())
                .map(this::toLineItem)
                .toList();
    }

    @Mapping(target = "objid", expression = "java(item.getObjid().toString())")
    LineItem toLineItem(DaContrItm item);
}
