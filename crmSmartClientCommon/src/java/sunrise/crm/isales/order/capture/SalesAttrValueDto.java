package sunrise.crm.isales.order.capture;

public class SalesAttrValueDto {

    private String objid;

    private String value;

    private SalesAttrDefDto definition;

    private String attrDefObjid;

    private String attrDefName;

    public SalesAttrValueDto(){
    }

    public SalesAttrValueDto(String objid, String value, SalesAttrDefDto definition) {
        this.objid = objid;
        this.value = value;
        this.definition = definition;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDefinition(SalesAttrDefDto definition) {
        this.definition = definition;
    }

    public void setAttributeName(String attributeName) {
        if (null == definition) {
            definition = new SalesAttrDefDto();
        }
        definition.setAttributeName(attributeName);
    }

    public void setDescription(String description) {
        if (null == definition) {
            definition = new SalesAttrDefDto();
        }
        definition.setDescription(description);
    }

    public void setDataType(String dataType) {
        if (null == definition) {
            definition = new SalesAttrDefDto();
        }
        definition.setDataType(dataType);
    }

    public void setVisible(String visible) {
        if (null == definition) {
            definition = new SalesAttrDefDto();
        }
        definition.setVisible(visible);
    }

    public void setAttrDefObjid(String attrDefObjid) {
        this.attrDefObjid = attrDefObjid;
    }

    public void setAttrDefName(String attrDefName) {
        this.attrDefName = attrDefName;
    }

    public String getAttributeName() {
        if (null == definition) {
            return null;
        }
        return definition.getAttributeName();
    }

    public String getDescription() {
        if (null == definition) {
            return null;
        }
        return definition.getDescription();
    }

    public String getDataType() {
        if (null == definition) {
            return null;
        }
        return definition.getDataType();
    }

    public String getVisible() {
        if (null == definition) {
            return null;
        }
        return definition.getVisible();
    }

    public String getObjid() {
        return this.objid;
    }

    public String getValue() {
        return this.value;
    }

    public SalesAttrDefDto getDefinition() {
        return this.definition;
    }

    public String getAttrDefObjid() {
        return this.attrDefObjid;
    }

    public String getAttrDefName() {
        return this.attrDefName;
    }

    @Override
    public String toString() {
        return "SalesAttrValueDto{" +
                "objid='" + objid + '\'' +
                ", value='" + value + '\'' +
                ", attrDefObjid='" + attrDefObjid + '\'' +
                ", attrDefName='" + attrDefName + '\'' +
                ", definition=" + definition +
                '}';
    }
}
