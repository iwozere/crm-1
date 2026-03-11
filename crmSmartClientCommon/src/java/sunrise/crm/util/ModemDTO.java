package sunrise.crm.util;

public class ModemDTO {
	String sapMaterialId;
	boolean needsProvisioning;
	String modemType;
	public String getSapMaterialId() {
		return sapMaterialId;
	}
	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}
	public boolean isNeedsProvisioning() {
		return needsProvisioning;
	}
	public void setNeedsProvisioning(boolean needsProvisioning) {
		this.needsProvisioning = needsProvisioning;
	}
	public String getModemType() {
		return modemType;
	}
	public void setModemType(String modemType) {
		this.modemType = modemType;
	}
	public ModemDTO(String sapMaterialId, boolean needsProvisioning, String modemType) {
		super();
		this.sapMaterialId = sapMaterialId;
		this.needsProvisioning = needsProvisioning;
		this.modemType = modemType;
	}
}
