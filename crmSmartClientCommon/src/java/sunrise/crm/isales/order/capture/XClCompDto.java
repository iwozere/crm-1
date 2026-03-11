package sunrise.crm.isales.order.capture;

import java.util.Map;

import sunrise.crm.util.CrmNumberUtil;

public class XClCompDto {
	private String componentObjid;
	private String componentId;
	private String packageId;
	private String componentType;
	private String rateDescription;
	private String bundleId;
	private String partNumId;
	private String partNumber;
	private String partType;

	public XClCompDto(Map<String, Object> map) {
		this.componentId = CrmNumberUtil.bigDecimalToString(map.get("COMPONENT_ID"));
		this.packageId = CrmNumberUtil.bigDecimalToString(map.get("PACKAGE_ID"));
		this.componentType = CrmNumberUtil.bigDecimalToString(map.get("COMPONENT_TYPE"));
		this.rateDescription = (String) map.get("RATE_DESCRIPTION");
		this.bundleId = (String) map.get("BUNDLE_ID");
		this.partNumId = CrmNumberUtil.bigDecimalToString(map.get("PN_OBJID"));
		this.partNumber = (String) map.get("PART_NUMBER");
		this.partType = (String) map.get("PART_TYPE");
		this.componentObjid = CrmNumberUtil.bigDecimalToString(map.get("OBJID"));
	}

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getRateDescription() {
		return rateDescription;
	}

	public void setRateDescription(String rateDescription) {
		this.rateDescription = rateDescription;
	}

	public String getPartNumId() {
		return partNumId;
	}

	public void setPartNumId(String partNumId) {
		this.partNumId = partNumId;
	}

	public String getBundleId() {
		return bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getComponentObjid() {
		return componentObjid;
	}

	public void setComponentObjid(String componentObjid) {
		this.componentObjid = componentObjid;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getPackageId() { return packageId; }

	public void setPackageId(String packageId) { this.packageId = packageId; }

	@Override
	public String toString() {
		return "XClCompDto [" +
				    "componentObjid=" + componentObjid
				+ ", componentId=" + componentId
				+ ", packageId=" + packageId
				+ ", componentType=" + componentType
				+ ", rateDescription=" + rateDescription
				+ ", bundleId=" + bundleId
				+ ", partNumId=" + partNumId
				+ ", partNumber=" + partNumber
				+ ", partType=" + partType + "]";
	}

}
