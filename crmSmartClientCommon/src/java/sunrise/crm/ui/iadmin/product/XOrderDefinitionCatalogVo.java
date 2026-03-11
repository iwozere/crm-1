package sunrise.crm.ui.iadmin.product;

import java.util.List;

public class XOrderDefinitionCatalogVo {
    private String icon;
    private Integer max;
    private Integer maxOnOrder;
    private Integer min;
    private String name;
    private Boolean isAttribute;
    private Boolean isCatalog;
    private Boolean isLineItem;
    private boolean isNew;
    private String objid;
    private List<XOrderDefinitionItemVo> items;

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMax() {
        return max;
    }

    public void setMaxOnOrder(Integer maxOnOrder) {
        this.maxOnOrder = maxOnOrder;
    }

    public Integer getMaxOnOrder() {
        return maxOnOrder;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMin() {
        return min;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getObjid() {
        return objid;
    }

    public void setItems(List<XOrderDefinitionItemVo> items) {
        this.items = items;
    }

    public List<XOrderDefinitionItemVo> getItems() {
        return items;
    }
}
