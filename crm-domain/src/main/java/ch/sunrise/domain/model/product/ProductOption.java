package ch.sunrise.domain.model.product;

import java.util.List;

public record ProductOption(
        String objid,
        String name,
        SitePartStatus status,
        List<ProductAttribute> attributes) {
}
