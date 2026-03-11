package ch.sunrise.domain.model.common;

import java.util.List;

import ch.sunrise.domain.model.product.ProductAttribute;

public record PartNum(
                String objid,
                String name,
                PartType partType,
                PartClassification partClassification,
                List<ProductAttribute> attributes,
                List<ModLevel> modLevels) {

}
