package sunrise.crm.xvo.bizOrder;

public class LdapInfoVo {

    private String returnCode;           // OK, ERROR, WARNING
    private String noOfRecords;          // 
    private String fixIpAddress;         // 
    private String staticRouterAddress;  //
    private String noOfAddresses;        //
    private String serviceType;          //
    private String isServiceProvisioned; //
    private String returnMsg;            //
    private String accessObjid;			 // Access Objid to be used in reserve release IPs
    private String ipConfigObjid;
    private String networkIPObjid;
    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

	public LdapInfoVo(){}
        
    // ***************************
    // *** Setters and getters ***
    // ***************************

	public String getAccessObjid() {
		return accessObjid;
	}

	public void setAccessObjid(String accessObjid) {
		this.accessObjid = accessObjid;
	}
	
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setNoOfRecords(String noOfRecords) {
		this.noOfRecords = noOfRecords;
	}

	public String getNoOfRecords() {
		return noOfRecords;
	}

	public void setFixIpAddress(String fixIpAddress) {
		this.fixIpAddress = fixIpAddress;
	}

	public String getFixIpAddress() {
		return fixIpAddress;
	}

	public void setStaticRouterAddress(String staticRouterAddress) {
		this.staticRouterAddress = staticRouterAddress;
	}

	public String getStaticRouterAddress() {
		return staticRouterAddress;
	}

	public void setNoOfAddresses(String noOfAddresses) {
		this.noOfAddresses = noOfAddresses;
	}

	public String getNoOfAddresses() {
		return noOfAddresses;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setIsServiceProvisioned(String isServiceProvisioned) {
		this.isServiceProvisioned = isServiceProvisioned;
	}

	public String getIsServiceProvisioned() {
		return isServiceProvisioned;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public String getIpConfigObjid() {
		return ipConfigObjid;
	}

	public void setIpConfigObjid(String ipConfigObjid) {
		this.ipConfigObjid = ipConfigObjid;
	}

	public String getNetworkIPObjid() {
		return networkIPObjid;
	}

	public void setNetworkIPObjid(String networkIPObjid) {
		this.networkIPObjid = networkIPObjid;
	}
	
	

}
