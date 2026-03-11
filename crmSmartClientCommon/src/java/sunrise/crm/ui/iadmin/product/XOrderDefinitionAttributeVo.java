package sunrise.crm.ui.iadmin.product;

public class XOrderDefinitionAttributeVo {
    private String defaultValue;
    private String icon;
    private String name;
    private String type;
    private Boolean isAttribute;
    private Boolean isCatalog;
    private Boolean isLineItem;
    private String objid;

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Boolean getAttribute() {
        return isAttribute;
    }

    public void setAttribute(Boolean attribute) {
        isAttribute = attribute;
    }

    public Boolean getCatalog() {
        return isCatalog;
    }

    public void setCatalog(Boolean catalog) {
        isCatalog = catalog;
    }

    public Boolean getLineItem() {
        return isLineItem;
    }

    public void setLineItem(Boolean lineItem) {
        isLineItem = lineItem;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getObjid() {
        return objid;
    }
}
