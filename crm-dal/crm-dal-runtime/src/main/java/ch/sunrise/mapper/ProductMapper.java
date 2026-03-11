package ch.sunrise.mapper;

import ch.sunrise.dal.entity.DaSitePart;
import ch.sunrise.dal.entity.DaXPartAttributeValue;
import ch.sunrise.domain.model.product.Product;
import ch.sunrise.domain.model.product.ProductAttribute;
import ch.sunrise.domain.model.product.ProductOption;
import ch.sunrise.domain.model.product.SitePartStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    @Mapping(target = "objid", expression = "java(sitePart.getObjid().toString())")
    @Mapping(target = "name", source = "instanceName")
    @Mapping(target = "options", expression = "java(mapOptions(sitePart))")
    @Mapping(target = "attributes", expression = "java(mapAttributes(sitePart.getSitePart2XPartAttrVal()))")
    Product toProduct(DaSitePart sitePart);

    @Mapping(target = "objid", expression = "java(sitePart.getObjid().toString())")
    @Mapping(target = "name", source = "instanceName")
    @Mapping(target = "status", expression = "java(mapStatus(sitePart.getPartStatus()))")
    @Mapping(target = "attributes", expression = "java(mapAttributesList(sitePart.getSitePart2XPartAttrVal()))")
    ProductOption toProductOption(DaSitePart sitePart);

    @Mapping(target = "objid", expression = "java(attr.getObjid().toString())")
    @Mapping(target = "name", expression = "java(attr.getXPartAttrVal2XAttrDef() != null ? attr.getXPartAttrVal2XAttrDef().getXName() : null)")
    @Mapping(target = "value", source = "XValue")
    @Mapping(target = "dateValue", expression = "java(attr.getXDteValue() != null ? attr.getXDteValue().toLocalDate() : null)")
    ProductAttribute toAttribute(DaXPartAttributeValue attr);

    default Map<String, ProductOption> mapOptions(DaSitePart sitePart) {
        if (sitePart.getInc2SitePart() == null) return Map.of();
        return sitePart.getInc2SitePart().stream()
                .filter(p -> p.getLevelToPart() != null && p.getLevelToPart() >= 2)
                .collect(Collectors.toMap(
                        DaSitePart::getInstanceName,
                        this::toProductOption,
                        (existing, replacement) -> existing
                ));
    }

    default Map<String, ProductAttribute> mapAttributes(java.util.Set<DaXPartAttributeValue> attrs) {
        if (attrs == null) return Map.of();
        return attrs.stream()
                .filter(a -> a.getXPartAttrVal2XAttrDef() != null)
                .collect(Collectors.toMap(
                        a -> a.getXPartAttrVal2XAttrDef().getXName(),
                        this::toAttribute,
                        (existing, replacement) -> existing
                ));
    }

    default List<ProductAttribute> mapAttributesList(java.util.Set<DaXPartAttributeValue> attrs) {
        if (attrs == null) return List.of();
        return attrs.stream()
                .map(this::toAttribute)
                .toList();
    }

    default SitePartStatus mapStatus(String status) {
        return SitePartStatus.fromDisplayValue(status).orElse(null);
    }
}
