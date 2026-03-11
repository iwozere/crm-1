package ch.sunrise.domain.model.product;

import java.util.Map;

public record Product(
        String objid,
        String name,
        Map<String, ProductOption> options,
        Map<String, ProductAttribute> attributes) {

}
