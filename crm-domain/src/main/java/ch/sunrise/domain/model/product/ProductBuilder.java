package ch.sunrise.domain.model.product;

import java.util.HashMap;
import java.util.Map;

public class ProductBuilder {
    private String objid;
    private String name;
    private Map<String, ProductOption> options = new HashMap<>();
    private Map<String, ProductAttribute> attributes = new HashMap<>();

    public ProductBuilder objid(String objid) {
        this.objid = objid;
        return this;
    }

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder options(Map<String, ProductOption> options) {
        this.options = options;
        return this;
    }

    public ProductBuilder putOption(String key, ProductOption option) {
        this.options.put(key, option);
        return this;
    }

    public ProductBuilder attributes(Map<String, ProductAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductBuilder putAttribute(String key, ProductAttribute attribute) {
        this.attributes.put(key, attribute);
        return this;
    }

    public Product build() {
        return new Product(objid, name, options, attributes);
    }
}
