package sunrise.crm.isales.order.capture;

public class SalesAttrDefDto {
    private String objid;
    private String attributeName;
    private String description;
    private String dataType;
    private String visible;
    private String required;
    private String defaultValue;

    public SalesAttrDefDto() {
    }

    public SalesAttrDefDto(String objid, String attributeName, String description, String dataType, String visible) {
        this.objid = objid;
        this.attributeName = attributeName;
        this.description = description;
        this.dataType = dataType;
        this.visible = visible;
    }

    public void setObjid(String objid){
        this.objid = objid;
    }

    public void setAttributeName(String attributeName){
        this.attributeName = attributeName;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getObjid() {
        return objid;
    }

    public String getAttributeName(){
        return attributeName;
    }

    public String getDescription() {
        return description;
    }

    public String getDataType(){
        return dataType;
    }

    public String getVisible(){
        return visible;
    }
    
    public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Override
	public String toString() {
		return "SalesAttrDefDto [objid=" + objid + ", attributeName=" + attributeName + ", description=" + description
				+ ", dataType=" + dataType + ", visible=" + visible + ", required=" + required + ", defaultValue="
				+ defaultValue + "]";
	}

}
