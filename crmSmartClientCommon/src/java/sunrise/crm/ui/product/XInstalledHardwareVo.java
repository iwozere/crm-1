package sunrise.crm.ui.product;

import java.io.Serializable;

public class XInstalledHardwareVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String description ;
	private String sapMaterialId ;
	private String serialNo;
	
	public XInstalledHardwareVo() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSapMaterialId() {
		return sapMaterialId;
	}

	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

