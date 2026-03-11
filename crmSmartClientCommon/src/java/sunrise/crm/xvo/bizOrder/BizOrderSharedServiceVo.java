package sunrise.crm.xvo.bizOrder;

/**
 * Class for Biz Order management - The shared service Vo record type.
 * @author arthur 
 * @notes  
 */
public class BizOrderSharedServiceVo {

    private String sitePartObjid;
    private String instanceName;
    private java.util.Date installDate;
    private String partNumber;
    private String modLevel;
    private String serialNo;
    private String scnServiceId;
    private String roleName;
    private String siteId;
    private String siteName;
    private java.util.Date serviceEndDate;
    private String family;
    private String line;
    private String billingSiteId;
    private String billingSiteName;
    private String partnerId;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public BizOrderSharedServiceVo(){}

    // *************************************************************************
    // GETTERS & SETTERS
    // *************************************************************************

    public void setSitePartObjid(String sitePartObjid) {
        this.sitePartObjid = sitePartObjid;
    }
    
    public String getSitePartObjid() {
        return sitePartObjid;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setModLevel(String modLevel) {
        this.modLevel = modLevel;
    }

    public String getModLevel() {
        return modLevel;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    
    public String getSerialNo() {
        return serialNo;
    }

    public void setScnServiceId(String scnServiceId) {
        this.scnServiceId = scnServiceId;
    }

    public String getScnServiceId() {
        return scnServiceId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setServiceEndDate(java.util.Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public java.util.Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setBillingSiteId(String billingSiteId) {
        this.billingSiteId = billingSiteId;
    }

    public String getBillingSiteId() {
        return billingSiteId;
    }

    public void setBillingSiteName(String billingSiteName) {
        this.billingSiteName = billingSiteName;
    }

    public String getBillingSiteName() {
        return billingSiteName;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerId() {
        return partnerId;
    }

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstallDate(java.util.Date installDate) {
		this.installDate = installDate;
	}

	public java.util.Date getInstallDate() {
		return installDate;
	}
}
