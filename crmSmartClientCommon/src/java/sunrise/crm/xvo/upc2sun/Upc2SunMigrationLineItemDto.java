package sunrise.crm.xvo.upc2sun;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Upc2SunMigrationLineItemDto {

	private String migrationRequestObjid;
	private String name;
	private String action = "NEW";
	private String upcCustomerId;
	private List<Upc2SunMigrationAttributeDto> attributes = new ArrayList<>();

	public void addAttribute(Upc2SunMigrationAttributeDto attribute) {
		attributes.add(attribute);
	}
	public String getMigrationRequestObjid() {
		return migrationRequestObjid;
	}
	public void setMigrationRequestObjid(String migrationRequestObjid) {
		this.migrationRequestObjid = migrationRequestObjid;
	}
	public String getUpcCustomerId() {
		return upcCustomerId;
	}
	public void setUpcCustomerId(String upcCustomerId) {
		this.upcCustomerId = upcCustomerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<Upc2SunMigrationAttributeDto> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Upc2SunMigrationAttributeDto> attributes) {
		this.attributes = attributes;
	}
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
