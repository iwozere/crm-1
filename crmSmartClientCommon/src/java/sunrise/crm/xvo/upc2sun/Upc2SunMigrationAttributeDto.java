package sunrise.crm.xvo.upc2sun;

import com.google.gson.Gson;

public class Upc2SunMigrationAttributeDto {

	private String objid;
	private String name;
	private String value;
	private String lineItemName;

	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getLineItemName() {
		return lineItemName;
	}
	public void setLineItemName(String lineItemName) {
		this.lineItemName = lineItemName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Upc2SunMigrationAttributeDto: " + new Gson().toJson(this);
	}
}
