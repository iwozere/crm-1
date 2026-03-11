package sunrise.crm.xvo.bizOrder;

import java.io.Serializable;

public class XBizOrderBaseDataVo implements Serializable {

	private static final long serialVersionUID = 2400744216201050747L;

	//Customer
	private String siteId;
	private String siteName;
	private String siteCareLevel;
	private String address;
	private String city;
	private String state;   //canton
	private String country;
	private String phone;

	//Case
	private String serviceId;
	private String caseTitle;
	private String caseSubtype;
	
	//SitePart [Main Service]
	private String sitePartObjid;
	private String instanceName;
	private java.util.Date installDate;
	private String serialNo;
	private String partStatus;
	private int levelToPart;
	private String slaLevel;
	private java.util.Date slaExpiry;
	private String modLevelStatus;
	
	//XOrder
	private String orderObjid;
	private String orderPriority;
	private String orderStatus;
	private String orderContractReference;
	private String serviceName;
	private String changeType;
	private String remark1;
	private String remark2;
	private String serviceCodes;
	private int slt; 
	private java.util.Date sltStartDate;
	private java.util.Date customerWishDate;
	private java.util.Date customerCommitDate;
	private java.util.Date billingStartDate;
	private java.util.Date billingCeaseDate;
	private String customerRef1;
	private String customerRef2;
	private String globalRef;
	private String projectNo;
	private String ofValidation;
	private String failureCode1;
	private String failureCode2;
	private String serviceShortCode;
	private String requiresCli;
	private String serviceCliPrefix;
	private String noOfLogRecords;
	private String siteAobjid;
	private String siteZobjid;
	
	//Partner
	private String partnerName;
	private String partnerSalesId;
	
	//PartNum
	private String partType;
	
	//Attributes
	private String attributeLst;

    // ************************************************************************
    // GETTERS & SETTERS
    // ************************************************************************
	
	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteCareLevel() {
		return siteCareLevel;
	}

	public void setSiteCareLevel(String siteCareLevel) {
		this.siteCareLevel = siteCareLevel;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	public String getCaseTitle() {
		return caseTitle;
	}

	public void setCaseTitle(String caseTitle) {
		this.caseTitle = caseTitle;
	}
	
	public String getCaseSubtype() {
		return caseSubtype;
	}

	public void setCaseSubtype(String caseSubtype) {
		this.caseSubtype = caseSubtype;
	}
	
	public String getOrderPriority() {
		return orderPriority;
	}

	public void setOrderObjid(String orderObjid) {
		this.orderObjid = orderObjid;
	}
	
	public String getOrderObjid() {
		return orderObjid;
	}

	public void setSitePartObjid(String sitePartObjid) {
		this.sitePartObjid = sitePartObjid;
	}
	
	public String getSitePartObjid() {
		return sitePartObjid;
	}

	public void setOrderPriority(String orderPriority) {
		this.orderPriority = orderPriority;
	}
	
	public String getOrderContractReference() {
		return orderContractReference;
	}

	public void setOrderContractReference(String orderContractReference) {
		this.orderContractReference = orderContractReference;
	}
	
	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	
	public String getPartnerSalesId() {
		return partnerSalesId;
	}

	public void setPartnerSalesId(String partnerSalesId) {
		this.partnerSalesId = partnerSalesId;
	}
	
	public String getServiceName() {
		return serviceName;
	}
    
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public String getChangeType() {
		return changeType;
	}
	
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	
	public String getRemark1() {
		return remark1;
	}
	
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	
	public String getRemark2() {
		return remark2;
	}
	
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}
	
	public String getSlaLevel() {
		return slaLevel;
	}
	
	public void setSlaLevel(String slaLevel) {
		this.slaLevel = slaLevel;
	}
	
	public java.util.Date getSlaExpiry() {
		return slaExpiry;
	}
	
	public void setSlaExpiry( java.util.Date slaExpiry) {
		this.slaExpiry = slaExpiry;
	}
	
	public String getServiceCodes() {
		return serviceCodes;
	}

	public void setServiceCodes(String serviceCodes) {
		this.serviceCodes = serviceCodes;
	}
	
	public String getModLevelStatus() {
		return modLevelStatus;
	}
	
	public void setModLevelStatus(String modLevelStatus) {
		this.modLevelStatus = modLevelStatus;
	}

    public String getAttributeLst() {
    	return attributeLst;
    }
    
    public void setAttributeLst(String attributeLst) {
    	this.attributeLst = attributeLst;
    }
	
	public String getInstanceName() {
		return instanceName;
	}
	
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	
	public java.util.Date getInstallDate() {
		return installDate;
	}
	
	public void setInstallDate( java.util.Date installDate) {
		this.installDate = installDate;
	}
	
	public String getSerialNo() {
		return serialNo;
	}
	
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
	public String getPartStatus() {
		return partStatus;
	}
	
	public void setPartStatus(String partStatus) {
		this.partStatus = partStatus;
	}
	
	public int getLevelToPart() {
		return levelToPart;
	}
	
	public void setLevelToPart(int levelToPart) {
		this.levelToPart = levelToPart;
	}
	
	public java.util.Date getSltStartDate() {
		return sltStartDate;
	}
	
	public void setSltStartDate( java.util.Date sltStartDate) {
		this.sltStartDate = sltStartDate;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public int getSlt() {
		return slt;
	}
	
	public void setSlt(int slt) {
		this.slt = slt;
	}
	
	public java.util.Date getCustomerWishDate() {
		return customerWishDate;
	}
	
	public void setCustomerWishDate( java.util.Date customerWishDate) {
		this.customerWishDate = customerWishDate;
	}
	
	public java.util.Date getCustomerCommitDate() {
		return customerCommitDate;
	}
	
	public void setCustomerCommitDate( java.util.Date customerCommitDate) {
		this.customerCommitDate = customerCommitDate;
	}
	
	public java.util.Date getBillingStartDate() {
		return billingStartDate;
	}
	
	public void setBillingStartDate( java.util.Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}
	
	
	public java.util.Date getBillingCeaseDate() {
		return billingCeaseDate;
	}
	
	public void setBillingCeaseDate( java.util.Date billingCeaseDate) {
		this.billingCeaseDate = billingCeaseDate;
	}
	
	public String getCustomerRef1() {
		return customerRef1;
	}
	
	public void setCustomerRef1(String customerRef1) {
		this.customerRef1 = customerRef1;
	}
	
	public String getCustomerRef2() {
		return customerRef2;
	}
	
	public void setCustomerRef2(String customerRef2) {
		this.customerRef2 = customerRef2;
	}
	
	public String getGlobalRef() {
		return globalRef;
	}
	
	public void setGlobalRef(String globalRef) {
		this.globalRef = globalRef;
	}

	public String getProjectNo() {
		return projectNo;
	}
	
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getOfValidation() {
		return ofValidation;
	}
	
	public void setOfValidation(String ofValidation) {
		this.ofValidation = ofValidation;
	}

	public String getFailureCode1() {
		return failureCode1;
	}
	
	public void setFailureCode1(String failureCode1) {
		this.failureCode1 = failureCode1;
	}

	public String getFailureCode2() {
		return failureCode2;
	}
	
	public void setFailureCode2(String failureCode2) {
		this.failureCode2 = failureCode2;
	}

	public void setServiceShortCode(String serviceShortCode) {
		this.serviceShortCode = serviceShortCode;
	}

	public String getServiceShortCode() {
		return serviceShortCode;
	}

	public void setRequiresCli(String requiresCli) {
		this.requiresCli = requiresCli;
	}

	public String getRequiresCli() {
		return requiresCli;
	}

	public void setServiceCliPrefix(String serviceCliPrefix) {
		this.serviceCliPrefix = serviceCliPrefix;
	}

	public String getServiceCliPrefix() {
		return serviceCliPrefix;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getPartType() {
		return partType;
	}

	public void setNoOfLogRecords(String noOfLogRecords) {
		this.noOfLogRecords = noOfLogRecords;
	}

	public String getNoOfLogRecords() {
		return noOfLogRecords;
	}

	public void setSiteAobjid(String siteAobjid) {
		this.siteAobjid = siteAobjid;
	}

	public String getSiteAobjid() {
		return siteAobjid;
	}

	public void setSiteZobjid(String siteZobjid) {
		this.siteZobjid = siteZobjid;
	}

	public String getSiteZobjid() {
		return siteZobjid;
	}
}
