package sunrise.crm.xvo.order;

import java.io.Serializable;
import java.util.Date;

public class XBulkOrderDetailsVo implements Serializable {

	/**
	 * 
	 */

	private String bulkOrderObjid;
	private String bulkOrderId;
	private String bulkOrderTitle;
	private Date bulkOrderCreateDt;
	private String bulkOrderStatus;
	private String bulkOrderConfType;
	private String bulkOrderConfEmail;
	private String siteObjid;
	private String siteId;
	private String contractObjid;
	private String contractId;
	private String caseObjid;
	private String caseId;
	private String partnerId;
	private String partnerName;
	private String parnerLocId;
	private String partnerLocName;
	private String partNum;
	private String partDomain;
	
	
	public String getBulkOrderObjid() {
		return bulkOrderObjid;
	}
	public void setBulkOrderObjid(String bulkOrderObjid) {
		this.bulkOrderObjid = bulkOrderObjid;
	}
	public String getBulkOrderId() {
		return bulkOrderId;
	}
	public void setBulkOrderId(String bulkOrderId) {
		this.bulkOrderId = bulkOrderId;
	}
	public String getBulkOrderTitle() {
		return bulkOrderTitle;
	}
	public void setBulkOrderTitle(String bulkOrderTitle) {
		this.bulkOrderTitle = bulkOrderTitle;
	}
	public Date getBulkOrderCreateDt() {
		return bulkOrderCreateDt;
	}
	public void setBulkOrderCreateDt(Date bulkOrderCreateDt) {
		this.bulkOrderCreateDt = bulkOrderCreateDt;
	}
	public String getBulkOrderStatus() {
		return bulkOrderStatus;
	}
	public void setBulkOrderStatus(String bulkOrderStatus) {
		this.bulkOrderStatus = bulkOrderStatus;
	}
	public String getBulkOrderConfType() {
		return bulkOrderConfType;
	}
	public void setBulkOrderConfType(String bulkOrderConfType) {
		this.bulkOrderConfType = bulkOrderConfType;
	}
	public String getBulkOrderConfEmail() {
		return bulkOrderConfEmail;
	}
	public void setBulkOrderConfEmail(String bulkOrderConfEmail) {
		this.bulkOrderConfEmail = bulkOrderConfEmail;
	}
	public String getSiteObjid() {
		return siteObjid;
	}
	public void setSiteObjid(String siteObjid) {
		this.siteObjid = siteObjid;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getContractObjid() {
		return contractObjid;
	}
	public void setContractObjid(String contractObjid) {
		this.contractObjid = contractObjid;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getCaseObjid() {
		return caseObjid;
	}
	public void setCaseObjid(String caseObjid) {
		this.caseObjid = caseObjid;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getParnerLocId() {
		return parnerLocId;
	}
	public void setParnerLocId(String parnerLocId) {
		this.parnerLocId = parnerLocId;
	}
	public String getPartnerLocName() {
		return partnerLocName;
	}
	public void setPartnerLocName(String partnerLocName) {
		this.partnerLocName = partnerLocName;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDomain() {
		return partDomain;
	}
	public void setPartDomain(String partDomain) {
		this.partDomain = partDomain;
	}
}
