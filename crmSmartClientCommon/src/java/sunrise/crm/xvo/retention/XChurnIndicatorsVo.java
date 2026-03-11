package sunrise.crm.xvo.retention;

import java.util.Map;

public class XChurnIndicatorsVo {

	private String attributeName;
	private String attributeValue;
	
	public XChurnIndicatorsVo(){
		
	}
	
	public XChurnIndicatorsVo(Map<String, Object> map){
		this.attributeName = (String)map.get("ATTRIBUTE_NAME");
		this.attributeValue = String.valueOf(map.get("ATTRIBUTE_VALUE"));
	}
	
	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	@Override
	public String toString() {
		return "XChurnIndicatorsVo [attributeName=" + attributeName + ", attributeValue=" + attributeValue + "]";
	}
}
