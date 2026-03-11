package sunrise.crm.ui.iadmin.product;

import java.util.List;

public class XOrderDefinitionVo {

    private String container;
    private String icon;
    private String name;
    private List<XOrderDefinitionItemVo> items;
    private List<XOrderDefinitionCatalogVo> catalogs;
    private List<XOrderDefinitionAttributeVo> attributes;
    private String domain;
    private String description;
    private String clonedFrom;

    public String getClonedFrom() {
        return clonedFrom;
    }

    public void setClonedFrom(String clonedFrom) {
        this.clonedFrom = clonedFrom;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getContainer() {
        return container;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setItems(List<XOrderDefinitionItemVo> items) {
        this.items = items;
    }

    public List<XOrderDefinitionItemVo> getItems() {
        return items;
    }

    public void setCatalogs(List<XOrderDefinitionCatalogVo> catalogs) {
        this.catalogs = catalogs;
    }

    public List<XOrderDefinitionCatalogVo> getCatalogs() {
        return catalogs;
    }

    public void setAttributes(List<XOrderDefinitionAttributeVo> attributes) {
        this.attributes = attributes;
    }

    public List<XOrderDefinitionAttributeVo> getAttributes() {
        return attributes;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
