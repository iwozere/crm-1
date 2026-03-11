package sunrise.crm.xvo.bizOrder;

public class CustomerServiceSearchVo {

    private String objid;
    private String ordServiceId;
    private String ordServiceName;
    private String ordIca;
    private String ordCustRef1;
    private String ordCustRef2;
    private String ordProjectNum;
    private String ordOmniNum;
    private String ordSalesOrdNum;
    private String ordStatus;
    private java.util.Date ordIcd;
    private java.util.Date ordCeasedDate;
    private java.util.Date ordBillingDate;
    private java.util.Date partInstallDate;
    private String siteMainObjid;
    private String siteMainId;
    private String siteMainName;
    private String siteMainAddress;
    private String siteAname;
    private String siteAaddress;
    private String siteAcity;
    private String siteZname;
    private String siteZaddress;
    private String siteZcity;
    private String sitePopAname;
    private String sitePopZname;
    private String partObjid;        //site_part.objid
    private String partInstanceName;
    private String partSerialNo;
    private String partCliStatus;
    private java.util.Date partActivationDate;
    private java.util.Date partDeactivationDate;
    private String prodSvcType;
    private int svcUmbrellaFlag;
    private String caseCondition;
    private String caseId;
    private String posuNumber;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public CustomerServiceSearchVo(){}
        
    // ***************************
    // *** Setters and getters ***
    // ***************************
        
	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getObjid() {
		return objid;
	}

	public void setOrdServiceId(String ordServiceId) {
		this.ordServiceId = ordServiceId;
	}

	public String getOrdServiceId() {
		return ordServiceId;
	}

	public void setOrdServiceName(String ordServiceName) {
		this.ordServiceName = ordServiceName;
	}

	public String getOrdServiceName() {
		return ordServiceName;
	}

	public void setOrdIca(String ordIca) {
		this.ordIca = ordIca;
	}

	public String getOrdIca() {
		return ordIca;
	}

	public void setOrdCustRef1(String ordCustRef1) {
		this.ordCustRef1 = ordCustRef1;
	}

	public String getOrdCustRef1() {
		return ordCustRef1;
	}

	public void setOrdCustRef2(String ordCustRef2) {
		this.ordCustRef2 = ordCustRef2;
	}

	public String getOrdCustRef2() {
		return ordCustRef2;
	}

	public void setOrdProjectNum(String ordProjectNum) {
		this.ordProjectNum = ordProjectNum;
	}

	public String getOrdProjectNum() {
		return ordProjectNum;
	}

	public void setOrdOmniNum(String ordOmniNum) {
		this.ordOmniNum = ordOmniNum;
	}

	public String getOrdOmniNum() {
		return ordOmniNum;
	}

	public void setOrdSalesOrdNum(String ordSalesOrdNum) {
		this.ordSalesOrdNum = ordSalesOrdNum;
	}

	public String getOrdSalesOrdNum() {
		return ordSalesOrdNum;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

	public String getOrdStatus() {
		return ordStatus;
	}

	public void setOrdIcd(java.util.Date ordIcd) {
		this.ordIcd = ordIcd;
	}

	public java.util.Date getOrdIcd() {
		return ordIcd;
	}

	public void setOrdCeasedDate(java.util.Date ordCeasedDate) {
		this.ordCeasedDate = ordCeasedDate;
	}

	public java.util.Date getOrdCeasedDate() {
		return ordCeasedDate;
	}

	public void setOrdBillingDate(java.util.Date ordBillingDate) {
		this.ordBillingDate = ordBillingDate;
	}

	public java.util.Date getOrdBillingDate() {
		return ordBillingDate;
	}

	public void setPartInstallDate(java.util.Date partInstallDate) {
		this.partInstallDate = partInstallDate;
	}

	public java.util.Date getPartInstallDate() {
		return partInstallDate;
	}

	public void setSiteMainObjid(String siteMainObjid) {
		this.siteMainObjid = siteMainObjid;
	}

	public String getSiteMainObjid() {
		return siteMainObjid;
	}

	public void setSiteMainId(String siteMainId) {
		this.siteMainId = siteMainId;
	}

	public String getSiteMainId() {
		return siteMainId;
	}

	public void setSiteMainName(String siteMainName) {
		this.siteMainName = siteMainName;
	}

	public String getSiteMainName() {
		return siteMainName;
	}

	public void setSiteMainAddress(String siteMainAddress) {
		this.siteMainAddress = siteMainAddress;
	}

	public String getSiteMainAddress() {
		return siteMainAddress;
	}

	public void setSiteAname(String siteAname) {
		this.siteAname = siteAname;
	}

	public String getSiteAname() {
		return siteAname;
	}

	public void setSiteAaddress(String siteAaddress) {
		this.siteAaddress = siteAaddress;
	}

	public String getSiteAaddress() {
		return siteAaddress;
	}

	public void setSiteAcity(String siteAcity) {
		this.siteAcity = siteAcity;
	}

	public String getSiteAcity() {
		return siteAcity;
	}

	public void setSiteZname(String siteZname) {
		this.siteZname = siteZname;
	}

	public String getSiteZname() {
		return siteZname;
	}

	public void setSiteZaddress(String siteZaddress) {
		this.siteZaddress = siteZaddress;
	}

	public String getSiteZaddress() {
		return siteZaddress;
	}

	public void setSiteZcity(String siteZcity) {
		this.siteZcity = siteZcity;
	}

	public String getSiteZcity() {
		return siteZcity;
	}

	public void setSitePopAname(String sitePopAname) {
		this.sitePopAname = sitePopAname;
	}

	public String getSitePopAname() {
		return sitePopAname;
	}

	public void setSitePopZname(String sitePopZname) {
		this.sitePopZname = sitePopZname;
	}

	public String getSitePopZname() {
		return sitePopZname;
	}

	public void setPartObjid(String partObjid) {
		this.partObjid = partObjid;
	}

	public String getPartObjid() {
		return partObjid;
	}

	public void setPartInstanceName(String partInstanceName) {
		this.partInstanceName = partInstanceName;
	}

	public String getPartInstanceName() {
		return partInstanceName;
	}

	public void setPartSerialNo(String partSerialNo) {
		this.partSerialNo = partSerialNo;
	}

	public String getPartSerialNo() {
		return partSerialNo;
	}

	public void setPartCliStatus(String partCliStatus) {
		this.partCliStatus = partCliStatus;
	}

	public String getPartCliStatus() {
		return partCliStatus;
	}

	public void setPartActivationDate(java.util.Date partActivationDate) {
		this.partActivationDate = partActivationDate;
	}

	public java.util.Date getPartActivationDate() {
		return partActivationDate;
	}

	public void setPartDeactivationDate(java.util.Date partDeactivationDate) {
		this.partDeactivationDate = partDeactivationDate;
	}

	public java.util.Date getPartDeactivationDate() {
		return partDeactivationDate;
	}

	public void setProdSvcType(String prodSvcType) {
		this.prodSvcType = prodSvcType;
	}

	public String getProdSvcType() {
		return prodSvcType;
	}

	public void setSvcUmbrellaFlag(int svcUmbrellaFlag) {
		this.svcUmbrellaFlag = svcUmbrellaFlag;
	}

	public int getSvcUmbrellaFlag() {
		return svcUmbrellaFlag;
	}

	/**
	 * @return the caseCondition
	 */
	public String getCaseCondition() {
		return caseCondition;
	}

	/**
	 * @param caseCondition the caseCondition to set
	 */
	public void setCaseCondition(String caseCondition) {
		this.caseCondition = caseCondition;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setPosuNumber(String posuNumber) {
		this.posuNumber = posuNumber;
	}

	public String getPosuNumber() {
		return posuNumber;
	}
}
