package sunrise.crm.ui.iadmin.product;

import java.util.List;

public class XOrderDefinitionItemVo {
    private String billingInfo;
    private String family;
    private String icon;
    private Integer max;
    private Integer maxOnOrder;
    private Integer min;
    private String name;
    private String partLine;
    private String partType;
    private String XPartClassification;
    private Boolean isAttribute;
    private Boolean isCatalog;
    private Boolean isInstallable;
    private Boolean isLineItem;
    private Boolean isDefault;
    private Boolean isRemovable;
    private Boolean isVisible;
    private String objid;
    private List<XOrderDefinitionAttributeVo> attributes;
    private List<String> allowedSegments;
    private List<XOrderDefinitionItemVo> items;
    private String domain;
    private List<VisibilityItem> visibilities;

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public String getBillingInfo() {
        return billingInfo;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

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

    public void setPartLine(String partLine) {
        this.partLine = partLine;
    }

    public String getPartLine() {
        return partLine;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartType() {
        return partType;
    }

    public void setXPartClassification(String xPartClassification) {
        this.XPartClassification = xPartClassification;
    }

    public String getXPartClassification() {
        return XPartClassification;
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

    public Boolean getInstallable() {
        return isInstallable;
    }

    public void setInstallable(Boolean installable) {
        isInstallable = installable;
    }

    public Boolean getLineItem() {
        return isLineItem;
    }

    public void setLineItem(Boolean lineItem) {
        isLineItem = lineItem;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getRemovable() {
        return isRemovable;
    }

    public void setRemovable(Boolean removable) {
        isRemovable = removable;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getObjid() {
        return objid;
    }

    public void setAttributes(List<XOrderDefinitionAttributeVo> attributes) {
        this.attributes = attributes;
    }

    public List<XOrderDefinitionAttributeVo> getAttributes() {
        return attributes;
    }

    public void setAllowedSegments(List<String> allowedSegments) {
        this.allowedSegments = allowedSegments;
    }

    public List<String> getAllowedSegments() {
        return allowedSegments;
    }

    public void setItems(List<XOrderDefinitionItemVo> items) {
        this.items = items;
    }

    public List<XOrderDefinitionItemVo> getItems() {
        return items;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public List<VisibilityItem> getVisibilities() {
        return visibilities;
    }

    public void setVisibilities(List<VisibilityItem> visibilities) {
        this.visibilities = visibilities;
    }

}
