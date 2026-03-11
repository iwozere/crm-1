package sunrise.crm.xvo.order;

import amdocs.core.vo.VoMetaData;

/**
 * VO to hold information about child SIM orders to be created
 * 
 * @author borkar
 *
 */
public class XAdditionalSIMOrderVo {

	public String simDelivery;
	public String iccid;
	public String price;
	public String productName;
	public String simType;
	public String sapMaterialId;
	public String status;
	public String msisdn;
	public String sitePartObjid;
	public String partNumObjid;
	public boolean hasPendingOrder;
	

	public String getSimDelivery() {
		return simDelivery;
	}

	public void setSimDelivery(String simDelivery) {
		this.simDelivery = simDelivery;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSimType() {
		return simType;
	}

	public void setSimType(String simType) {
		this.simType = simType;
	}

	public String getSapMaterialId() {
		return sapMaterialId;
	}

	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getSitePartObjid() {
		return sitePartObjid;
	}

	public void setSitePartObjid(String sitePartObjid) {
		this.sitePartObjid = sitePartObjid;
	}

	public String getPartNumObjid() {
		return partNumObjid;
	}

	public void setPartNumObjid(String partNumObjid) {
		this.partNumObjid = partNumObjid;
	}

	public boolean isHasPendingOrder() {
		return hasPendingOrder;
	}

	public void setHasPendingOrder(boolean hasPendingOrder) {
		this.hasPendingOrder = hasPendingOrder;
	}

	@Override
	public String toString() {
		return "XAdditionalSIMOrderVo [simDelivery=" + simDelivery + ", iccid="
				+ iccid + ", price=" + price + ", productName=" + productName
				+ ", simType=" + simType + ", sapMaterialId=" +sapMaterialId+  ", status="+status+ "]";
	}

}
