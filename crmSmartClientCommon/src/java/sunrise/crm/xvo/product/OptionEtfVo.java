package sunrise.crm.xvo.product;

import java.math.BigDecimal;

public class OptionEtfVo {
	
	private String optionName;
	private BigDecimal etfAmount;
	private String productSerial;
	private String ipContractId;
	
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public BigDecimal getEtfAmount() {
		return etfAmount;
	}
	public void setEtfAmount(BigDecimal etfAmount) {
		this.etfAmount = etfAmount;
	}
	
	public String getProductSerial() {
		return productSerial;
	}
	public void setProductSerial(String productSerial) {
		this.productSerial = productSerial;
	}
	public String getIpContractId() {
		return ipContractId;
	}
	public void setIpContractId(String ipContractId) {
		this.ipContractId = ipContractId;
	}
	
	@Override
	public String toString() {
		return "OptionEtfVo [optionName=" + optionName + ", etfAmount=" + etfAmount + ", productSerial=" + productSerial
				+ ", ipContractId=" + ipContractId + "]";
	}
	

}
