package sunrise.crm.xvo.order;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class XAttributeValueVo implements Serializable {
	
	private static final long serialVersionUID = 6290818047046635171L;

	private String attributeValueObjid;
	private String attributeValue;
	private String attributeName;
	private String attributeDisplayValue;
	private String uom;
	
	public XAttributeValueVo() {}
	
	public XAttributeValueVo(String attributeName, String attributeValue) {
		this.attributeValue = attributeValue;
		this.attributeName = attributeName;
		this.attributeDisplayValue = attributeValue;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getAttributeValueObjid() {
		return attributeValueObjid;
	}
	public void setAttributeValueObjid(String attributeValueObjid) {
		this.attributeValueObjid = attributeValueObjid;
	}

	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public String getAttributeDisplayValue() { return attributeDisplayValue; }
	public void setAttributeDisplayValue(String attributeDisplayValue) { this.attributeDisplayValue = attributeDisplayValue; }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
