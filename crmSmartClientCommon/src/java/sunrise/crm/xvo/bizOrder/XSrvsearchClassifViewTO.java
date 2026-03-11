package sunrise.crm.xvo.bizOrder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import sunrise.crm.util.CrmDateUtil;

/**
 * The persistent class for the TABLE_X_SRVSEARCH_CLASSIF_VIEW database table.
 * 
 */
public class XSrvsearchClassifViewTO implements Serializable {

	private static final long serialVersionUID = 1L;
	


	//(name="ATV_ACCESS_SPEED")
	private String atvAccessSpeed;

	//(name="ATV_ACCESS_SPEED_Z")
	private String atvAccessSpeedZ;

	//(name="ATV_ATM_PIR")
	private String atvAtmPir;

	//(name="ATV_ATM_TYPE")
	private String atvAtmType;

	//(name="ATV_ATM_VPI")
	private String atvAtmVpi;

	//(name="ATV_CIRCUIT_CONTRACT")
	private String atvCircuitContract;

	//(name="ATV_CIRCUIT_ID")
	private String atvCircuitId;

	//(name="ATV_CIRCUIT_SUPPLIER")
	private String atvCircuitSupplier;

	//(name="ATV_CUST_IP_ADDR")
	private String atvCustIpAddr;

	//(name="ATV_CUST_IP_ADDR_A")
	private String atvCustIpAddrA;

	//(name="ATV_CUST_IP_ADDR_Z")
	private String atvCustIpAddrZ;

	//(name="ATV_FR_DLCI")
	private String atvFrDlci;

	//(name="ATV_FR_SPEED_CIR")
	private String atvFrSpeedCir;

	//(name="ATV_MGMT_IP_ADDR")
	private String atvMgmtIpAddr;

	//(name="ATV_MODEM_OWNER")
	private String atvModemOwner;

	//(name="ATV_NODE")
	private String atvNode;

	//(name="ATV_NUM_IP_ADDRS")
	private String atvNumIpAddrs;

	//(name="ATV_PHYSICAL_TARGET")
	private String atvPhysicalTarget;

	//(name="ATV_ROUTER_TYPE")
	private String atvRouterType;

	//(name="ATV_SUNRISE_CO_NO")
	private String atvSunriseCoNo;

	//(name="ATV_SUNRISE_MAIN_NO")
	private String atvSunriseMainNo;

	//(name="ATV_SUNRISE_NO_RANGE")
	private String atvSunriseNoRange;

	//(name="ATV_SWCOM_MAIN_NO")
	private String atvSwcomMainNo;

	//(name="ATV_SWCOM_NO_RANGE")
	private String atvSwcomNoRange;

	//(name="CASE_ID")
	private String caseId;
	
	//(name="CASE_CON_TITLE")
	private String caseConTitle;	

	private BigDecimal objid;

	//(name="ORD_BILLING_DATE")
	private Date ordBillingDate;

	//(name="ORD_CEASED_DATE")
	private Date ordCeasedDate;

	//(name="ORD_CUST_COMMIT_DATE")
	private Date ordCustCommitDate;

	//(name="ORD_CUST_DESIRE_DATE")
	private Date ordCustDesireDate;

	//(name="ORD_CUST_REF_1")
	private String ordCustRef1;

	//(name="ORD_CUST_REF_2")
	private String ordCustRef2;

	//(name="ORD_ICA")
	private String ordIca;

	//(name="ORD_ICD")
	private Date ordIcd;

	//(name="ORD_OMNI_NUM")
	private String ordOmniNum;

	//(name="ORD_PROJECT_NUM")
	private String ordProjectNum;

	//(name="ORD_SALES_ORD_NUM")
	private String ordSalesOrdNum;

	//(name="ORD_SERVICE_ID")
	private String ordServiceId;

	//(name="ORD_SERVICE_NAME")
	private String ordServiceName;

	//(name="ORD_STATUS")
	private String ordStatus;

	//(name="PART_INSTALL_DATE")
	private Date partInstallDate;

	//(name="PART_INSTANCE_NAME")
	private String partInstanceName;

	//(name="PROD_CLASS")
	private String prodClass;

	//(name="S_SITE_A_CITY")
	private String sSiteACity;

	//(name="S_SITE_MAIN_NAME")
	private String sSiteMainName;

	//(name="S_SITE_POP_A_NAME")
	private String sSitePopAName;

	//(name="S_SITE_POP_Z_NAME")
	private String sSitePopZName;

	//(name="S_SITE_Z_CITY")
	private String sSiteZCity;

	//(name="SITE_A_ADDRESS")
	private String siteAAddress;

	//(name="SITE_A_CITY")
	private String siteACity;

	//(name="SITE_MAIN_ID")
	private String siteMainId;

	//(name="SITE_MAIN_NAME")
	private String siteMainName;

	//(name="SITE_MAIN_OBJID")
	private BigDecimal siteMainObjid;

	//(name="SITE_Z_ADDRESS")
	private String siteZAddress;

	//(name="SITE_Z_CITY")
	private String siteZCity;

	//(name="POSU_NUMBER")
	private String posuNumber;
	
    public XSrvsearchClassifViewTO() {
    }
    
    public Date getValidDateOrNull(Date input) {
    	if(CrmDateUtil.isValidDate(input) && input.after(CrmDateUtil.getClarifyMinDate()))
    		return input;
    	return null;
    }
   

	public XSrvsearchClassifViewTO(Map<String, Object> map) {
		this.atvAccessSpeed = (String)map.get("ATV_ACCESS_SPEED");
		this.atvAccessSpeedZ = (String)map.get("ATV_ACCESS_SPEED_Z");
		this.atvAtmPir = (String)map.get("ATV_ATM_PIR");
		this.atvAtmType = (String)map.get("ATV_ATM_TYPE");
		this.atvAtmVpi = (String)map.get("ATV_ATM_VPI");
		this.atvCircuitContract = (String)map.get("ATV_CIRCUIT_CONTRACT");
		this.atvCircuitId = (String)map.get("ATV_CIRCUIT_ID");
		this.atvCircuitSupplier = (String)map.get("ATV_CIRCUIT_SUPPLIER");
		this.atvCustIpAddr = (String)map.get("ATV_CUST_IP_ADDR");
		this.atvCustIpAddrA = (String)map.get("ATV_CUST_IP_ADDR_A");
		this.atvCustIpAddrZ = (String)map.get("ATV_CUST_IP_ADDR_Z");
		this.atvFrDlci = (String)map.get("ATV_FR_DLCI");
		this.atvFrSpeedCir = (String)map.get("ATV_FR_SPEED_CIR");
		this.atvMgmtIpAddr = (String)map.get("ATV_MGMT_IP_ADDR");
		this.atvModemOwner = (String)map.get("ATV_MODEM_OWNER");
		this.atvNode = (String)map.get("ATV_NODE");
		this.atvNumIpAddrs = (String)map.get("ATV_NUM_IP_ADDRS");
		this.atvPhysicalTarget = (String)map.get("ATV_PHYSICAL_TARGET");
		this.atvRouterType = (String)map.get("ATV_ROUTER_TYPE");
		this.atvSunriseCoNo = (String)map.get("ATV_SUNRISE_CO_NO");
		this.atvSunriseMainNo = (String)map.get("ATV_SUNRISE_MAIN_NO");
		this.atvSunriseNoRange = (String)map.get("ATV_SUNRISE_NO_RANGE");
		this.atvSwcomMainNo = (String)map.get("ATV_SWCOM_MAIN_NO");
		this.atvSwcomNoRange = (String)map.get("ATV_SWCOM_NO_RANGE");
		this.caseId = (String)map.get("CASE_ID");
		this.caseConTitle = (String)map.get("CASE_CON_TITLE");
		this.objid = (BigDecimal)map.get("OBJID");
		this.ordBillingDate = getValidDateOrNull((Date)map.get("ORD_BILLING_DATE"));
		this.ordCeasedDate = getValidDateOrNull((Date)map.get("ORD_CEASED_DATE"));
		this.ordCustCommitDate = getValidDateOrNull((Date)map.get("ORD_CUST_COMMIT_DATE"));
		this.ordCustDesireDate = getValidDateOrNull((Date)map.get("ORD_CUST_DESIRE_DATE"));
		this.ordCustRef1 = (String)map.get("ORD_CUST_REF_1");
		this.ordCustRef2 = (String)map.get("ORD_CUST_REF_2");
		this.ordIca = (String)map.get("ORD_ICA");
		this.ordIcd = getValidDateOrNull((Date)map.get("ORD_ICD"));
		this.ordOmniNum = (String)map.get("ORD_OMNI_NUM");
		this.ordProjectNum = (String)map.get("ORD_PROJECT_NUM");
		this.ordSalesOrdNum = (String)map.get("ORD_SALES_ORD_NUM");
		this.ordServiceId = (String)map.get("ORD_SERVICE_ID");
		this.ordServiceName = (String)map.get("ORD_SERVICE_NAME");
		this.ordStatus = (String)map.get("ORD_STATUS");
		this.partInstallDate = getValidDateOrNull((Date)map.get("PART_INSTALL_DATE"));
		this.partInstanceName = (String)map.get("PART_INSTANCE_NAME");
		this.prodClass = (String)map.get("PROD_CLASS");
		this.sSiteACity = (String)map.get("S_SITE_A_CITY");
		this.sSiteMainName = (String)map.get("S_SITE_MAIN_NAME");
		this.sSitePopAName = (String)map.get("S_SITE_POP_A_NAME");
		this.sSitePopZName = (String)map.get("S_SITE_POP_Z_NAME");
		this.sSiteZCity = (String)map.get("S_SITE_Z_CITY");
		this.siteAAddress = (String)map.get("SITE_A_ADDRESS");
		this.siteACity = (String)map.get("SITE_A_CITY");
		this.siteMainId = (String)map.get("SITE_MAIN_ID");
		this.siteMainName = (String)map.get("SITE_MAIN_NAME");
		this.siteMainObjid = (BigDecimal)map.get("SITE_MAIN_OBJID");
		this.siteZAddress = (String)map.get("SITE_Z_ADDRESS");
		this.siteZCity = (String)map.get("SITE_Z_CITY");
		this.posuNumber = (String)map.get("POSU_NUMBER");
	}

	public String getPosuNumber() {
		return posuNumber;
	}

	public void setPosuNumber(String posuNumber) {
		this.posuNumber = posuNumber;
	}

	public String getAtvAccessSpeed() {
		return this.atvAccessSpeed;
	}

	public void setAtvAccessSpeed(String atvAccessSpeed) {
		this.atvAccessSpeed = atvAccessSpeed;
	}

	public String getAtvAccessSpeedZ() {
		return this.atvAccessSpeedZ;
	}

	public void setAtvAccessSpeedZ(String atvAccessSpeedZ) {
		this.atvAccessSpeedZ = atvAccessSpeedZ;
	}

	public String getAtvAtmPir() {
		return this.atvAtmPir;
	}

	public void setAtvAtmPir(String atvAtmPir) {
		this.atvAtmPir = atvAtmPir;
	}

	public String getAtvAtmType() {
		return this.atvAtmType;
	}

	public void setAtvAtmType(String atvAtmType) {
		this.atvAtmType = atvAtmType;
	}

	public String getAtvAtmVpi() {
		return this.atvAtmVpi;
	}

	public void setAtvAtmVpi(String atvAtmVpi) {
		this.atvAtmVpi = atvAtmVpi;
	}

	public String getAtvCircuitContract() {
		return this.atvCircuitContract;
	}

	public void setAtvCircuitContract(String atvCircuitContract) {
		this.atvCircuitContract = atvCircuitContract;
	}

	public String getAtvCircuitId() {
		return this.atvCircuitId;
	}

	public void setAtvCircuitId(String atvCircuitId) {
		this.atvCircuitId = atvCircuitId;
	}

	public String getAtvCircuitSupplier() {
		return this.atvCircuitSupplier;
	}

	public void setAtvCircuitSupplier(String atvCircuitSupplier) {
		this.atvCircuitSupplier = atvCircuitSupplier;
	}

	public String getAtvCustIpAddr() {
		return this.atvCustIpAddr;
	}

	public void setAtvCustIpAddr(String atvCustIpAddr) {
		this.atvCustIpAddr = atvCustIpAddr;
	}

	public String getAtvCustIpAddrA() {
		return this.atvCustIpAddrA;
	}

	public void setAtvCustIpAddrA(String atvCustIpAddrA) {
		this.atvCustIpAddrA = atvCustIpAddrA;
	}

	public String getAtvCustIpAddrZ() {
		return this.atvCustIpAddrZ;
	}

	public void setAtvCustIpAddrZ(String atvCustIpAddrZ) {
		this.atvCustIpAddrZ = atvCustIpAddrZ;
	}

	public String getAtvFrDlci() {
		return this.atvFrDlci;
	}

	public void setAtvFrDlci(String atvFrDlci) {
		this.atvFrDlci = atvFrDlci;
	}

	public String getAtvFrSpeedCir() {
		return this.atvFrSpeedCir;
	}

	public void setAtvFrSpeedCir(String atvFrSpeedCir) {
		this.atvFrSpeedCir = atvFrSpeedCir;
	}

	public String getAtvMgmtIpAddr() {
		return this.atvMgmtIpAddr;
	}

	public void setAtvMgmtIpAddr(String atvMgmtIpAddr) {
		this.atvMgmtIpAddr = atvMgmtIpAddr;
	}

	public String getAtvModemOwner() {
		return this.atvModemOwner;
	}

	public void setAtvModemOwner(String atvModemOwner) {
		this.atvModemOwner = atvModemOwner;
	}

	public String getAtvNode() {
		return this.atvNode;
	}

	public void setAtvNode(String atvNode) {
		this.atvNode = atvNode;
	}

	public String getAtvNumIpAddrs() {
		return this.atvNumIpAddrs;
	}

	public void setAtvNumIpAddrs(String atvNumIpAddrs) {
		this.atvNumIpAddrs = atvNumIpAddrs;
	}

	public String getAtvPhysicalTarget() {
		return this.atvPhysicalTarget;
	}

	public void setAtvPhysicalTarget(String atvPhysicalTarget) {
		this.atvPhysicalTarget = atvPhysicalTarget;
	}

	public String getAtvRouterType() {
		return this.atvRouterType;
	}

	public void setAtvRouterType(String atvRouterType) {
		this.atvRouterType = atvRouterType;
	}

	public String getAtvSunriseCoNo() {
		return this.atvSunriseCoNo;
	}

	public void setAtvSunriseCoNo(String atvSunriseCoNo) {
		this.atvSunriseCoNo = atvSunriseCoNo;
	}

	public String getAtvSunriseMainNo() {
		return this.atvSunriseMainNo;
	}

	public void setAtvSunriseMainNo(String atvSunriseMainNo) {
		this.atvSunriseMainNo = atvSunriseMainNo;
	}

	public String getAtvSunriseNoRange() {
		return this.atvSunriseNoRange;
	}

	public void setAtvSunriseNoRange(String atvSunriseNoRange) {
		this.atvSunriseNoRange = atvSunriseNoRange;
	}

	public String getAtvSwcomMainNo() {
		return this.atvSwcomMainNo;
	}

	public void setAtvSwcomMainNo(String atvSwcomMainNo) {
		this.atvSwcomMainNo = atvSwcomMainNo;
	}

	public String getAtvSwcomNoRange() {
		return this.atvSwcomNoRange;
	}

	public void setAtvSwcomNoRange(String atvSwcomNoRange) {
		this.atvSwcomNoRange = atvSwcomNoRange;
	}

	public String getCaseId() {
		return this.caseId;
	}
	
	public String getCaseConTitle() {
		return this.caseConTitle;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	
	public void setCaseConTitle(String caseConTitle) {
		this.caseConTitle = caseConTitle;
	}

	public BigDecimal getObjid() {
		return this.objid;
	}

	public void setObjid(BigDecimal objid) {
		this.objid = objid;
	}

	public Date getOrdBillingDate() {
		return this.ordBillingDate;
	}

	public void setOrdBillingDate(Date ordBillingDate) {
		this.ordBillingDate = ordBillingDate;
	}

	public Date getOrdCeasedDate() {
		return this.ordCeasedDate;
	}

	public void setOrdCeasedDate(Date ordCeasedDate) {
		this.ordCeasedDate = ordCeasedDate;
	}

	public Date getOrdCustCommitDate() {
		return this.ordCustCommitDate;
	}

	public void setOrdCustCommitDate(Date ordCustCommitDate) {
		this.ordCustCommitDate = ordCustCommitDate;
	}

	public Date getOrdCustDesireDate() {
		return this.ordCustDesireDate;
	}

	public void setOrdCustDesireDate(Date ordCustDesireDate) {
		this.ordCustDesireDate = ordCustDesireDate;
	}

	public String getOrdCustRef1() {
		return this.ordCustRef1;
	}

	public void setOrdCustRef1(String ordCustRef1) {
		this.ordCustRef1 = ordCustRef1;
	}

	public String getOrdCustRef2() {
		return this.ordCustRef2;
	}

	public void setOrdCustRef2(String ordCustRef2) {
		this.ordCustRef2 = ordCustRef2;
	}

	public String getOrdIca() {
		return this.ordIca;
	}

	public void setOrdIca(String ordIca) {
		this.ordIca = ordIca;
	}

	public Date getOrdIcd() {
		return this.ordIcd;
	}

	public void setOrdIcd(Date ordIcd) {
		this.ordIcd = ordIcd;
	}

	public String getOrdOmniNum() {
		return this.ordOmniNum;
	}

	public void setOrdOmniNum(String ordOmniNum) {
		this.ordOmniNum = ordOmniNum;
	}

	public String getOrdProjectNum() {
		return this.ordProjectNum;
	}

	public void setOrdProjectNum(String ordProjectNum) {
		this.ordProjectNum = ordProjectNum;
	}

	public String getOrdSalesOrdNum() {
		return this.ordSalesOrdNum;
	}

	public void setOrdSalesOrdNum(String ordSalesOrdNum) {
		this.ordSalesOrdNum = ordSalesOrdNum;
	}

	public String getOrdServiceId() {
		return this.ordServiceId;
	}

	public void setOrdServiceId(String ordServiceId) {
		this.ordServiceId = ordServiceId;
	}

	public String getOrdServiceName() {
		return this.ordServiceName;
	}

	public void setOrdServiceName(String ordServiceName) {
		this.ordServiceName = ordServiceName;
	}

	public String getOrdStatus() {
		return this.ordStatus;
	}

	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}

	public Date getPartInstallDate() {
		return this.partInstallDate;
	}

	public void setPartInstallDate(Date partInstallDate) {
		this.partInstallDate = partInstallDate;
	}

	public String getPartInstanceName() {
		return this.partInstanceName;
	}

	public void setPartInstanceName(String partInstanceName) {
		this.partInstanceName = partInstanceName;
	}

	public String getProdClass() {
		return this.prodClass;
	}

	public void setProdClass(String prodClass) {
		this.prodClass = prodClass;
	}

	public String getSSiteACity() {
		return this.sSiteACity;
	}

	public void setSSiteACity(String sSiteACity) {
		this.sSiteACity = sSiteACity;
	}

	public String getSSiteMainName() {
		return this.sSiteMainName;
	}

	public void setSSiteMainName(String sSiteMainName) {
		this.sSiteMainName = sSiteMainName;
	}

	public String getSSitePopAName() {
		return this.sSitePopAName;
	}

	public void setSSitePopAName(String sSitePopAName) {
		this.sSitePopAName = sSitePopAName;
	}

	public String getSSitePopZName() {
		return this.sSitePopZName;
	}

	public void setSSitePopZName(String sSitePopZName) {
		this.sSitePopZName = sSitePopZName;
	}

	public String getSSiteZCity() {
		return this.sSiteZCity;
	}

	public void setSSiteZCity(String sSiteZCity) {
		this.sSiteZCity = sSiteZCity;
	}

	public String getSiteAAddress() {
		return this.siteAAddress;
	}

	public void setSiteAAddress(String siteAAddress) {
		this.siteAAddress = siteAAddress;
	}

	public String getSiteACity() {
		return this.siteACity;
	}

	public void setSiteACity(String siteACity) {
		this.siteACity = siteACity;
	}

	public String getSiteMainId() {
		return this.siteMainId;
	}

	public void setSiteMainId(String siteMainId) {
		this.siteMainId = siteMainId;
	}

	public String getSiteMainName() {
		return this.siteMainName;
	}

	public void setSiteMainName(String siteMainName) {
		this.siteMainName = siteMainName;
	}

	public BigDecimal getSiteMainObjid() {
		return this.siteMainObjid;
	}

	public void setSiteMainObjid(BigDecimal siteMainObjid) {
		this.siteMainObjid = siteMainObjid;
	}

	public String getSiteZAddress() {
		return this.siteZAddress;
	}

	public void setSiteZAddress(String siteZAddress) {
		this.siteZAddress = siteZAddress;
	}

	public String getSiteZCity() {
		return this.siteZCity;
	}

	public void setSiteZCity(String siteZCity) {
		this.siteZCity = siteZCity;
	}

	@Override
	public String toString() {
		return "XSrvsearchClassifViewTO [atvAccessSpeed=" + atvAccessSpeed + ", atvAccessSpeedZ=" + atvAccessSpeedZ
				+ ", atvAtmPir=" + atvAtmPir + ", atvAtmType=" + atvAtmType + ", atvAtmVpi=" + atvAtmVpi
				+ ", atvCircuitContract=" + atvCircuitContract + ", atvCircuitId=" + atvCircuitId
				+ ", atvCircuitSupplier=" + atvCircuitSupplier + ", atvCustIpAddr=" + atvCustIpAddr
				+ ", atvCustIpAddrA=" + atvCustIpAddrA + ", atvCustIpAddrZ=" + atvCustIpAddrZ + ", atvFrDlci="
				+ atvFrDlci + ", atvFrSpeedCir=" + atvFrSpeedCir + ", atvMgmtIpAddr=" + atvMgmtIpAddr
				+ ", atvModemOwner=" + atvModemOwner + ", atvNode=" + atvNode + ", atvNumIpAddrs=" + atvNumIpAddrs
				+ ", atvPhysicalTarget=" + atvPhysicalTarget + ", atvRouterType=" + atvRouterType + ", atvSunriseCoNo="
				+ atvSunriseCoNo + ", atvSunriseMainNo=" + atvSunriseMainNo + ", atvSunriseNoRange="
				+ atvSunriseNoRange + ", atvSwcomMainNo=" + atvSwcomMainNo + ", atvSwcomNoRange=" + atvSwcomNoRange
				+ ", caseId=" + caseId + ", caseConTitle=" + caseConTitle + ", objid=" + objid + ", ordBillingDate="
				+ ordBillingDate + ", ordCeasedDate=" + ordCeasedDate + ", ordCustCommitDate=" + ordCustCommitDate
				+ ", ordCustDesireDate=" + ordCustDesireDate + ", ordCustRef1=" + ordCustRef1 + ", ordCustRef2="
				+ ordCustRef2 + ", ordIca=" + ordIca + ", ordIcd=" + ordIcd + ", ordOmniNum=" + ordOmniNum
				+ ", ordProjectNum=" + ordProjectNum + ", ordSalesOrdNum=" + ordSalesOrdNum + ", ordServiceId="
				+ ordServiceId + ", ordServiceName=" + ordServiceName + ", ordStatus=" + ordStatus
				+ ", partInstallDate=" + partInstallDate + ", partInstanceName=" + partInstanceName + ", prodClass="
				+ prodClass + ", sSiteACity=" + sSiteACity + ", sSiteMainName=" + sSiteMainName + ", sSitePopAName="
				+ sSitePopAName + ", sSitePopZName=" + sSitePopZName + ", sSiteZCity=" + sSiteZCity + ", siteAAddress="
				+ siteAAddress + ", siteACity=" + siteACity + ", siteMainId=" + siteMainId + ", siteMainName="
				+ siteMainName + ", siteMainObjid=" + siteMainObjid + ", siteZAddress=" + siteZAddress + ", siteZCity="
				+ siteZCity + ", posuNumber=" + posuNumber + "]";
	}
}
