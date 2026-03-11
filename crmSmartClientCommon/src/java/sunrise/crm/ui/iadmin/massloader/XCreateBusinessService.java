package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.CREATE_BUSINESS_SERVICE_ROW_OFFSET, name = XConstants.CREATE_BUSINESS_SERVICE)
public class XCreateBusinessService {

	/**
	 * Main Info
	 */
	@XColumn(id = 0)
	public String correlationId;

	@XColumn(id = 1)
	public String serviceId;

	@XColumn(id = 2)
	public String sipcoreId;

	@XColumn(id = 3)
	public String productName;

	@XColumn(id = 4)
	public String billingSite;

	@XColumn(id = 5)
	public String salesId;

	/**
	 * Site Information
	 */
	@XColumn(id = 6)
	public String siteName;

	@XColumn(id = 7)
	public String city;

	@XColumn(id = 8)
	public String address;

	@XColumn(id = 9)
	public String address2;

	@XColumn(id = 10)
	public String zip;

	@XColumn(id = 11)
	public String floor;

	@XColumn(id = 12)
	public String state;

	@XColumn(id = 13)
	public String country;

	/**
	 * Onsite Contact
	 */
	@XColumn(id = 14)
	public String onsiteContactFirstName;

	@XColumn(id = 15)
	public String onsiteContactLastName;

	@XColumn(id = 16)
	public String onsiteGender;

	@XColumn(id = 17)
	public String onsiteBusinessPhone;

	@XColumn(id = 18)
	public String onsiteFax;

	@XColumn(id = 19)
	public String onsiteEmail;

	/**
	 * Technical Contact
	 */
	@XColumn(id = 20)
	public String technicalContactFirstName;

	@XColumn(id = 21)
	public String technicalContactLastName;

	@XColumn(id = 22)
	public String technicalGender;

	@XColumn(id = 23)
	public String technicalBusinessPhone;

	@XColumn(id = 24)
	public String technicalFax;

	@XColumn(id = 25)
	public String technicalEmail;

	/**
	 * Electrician Contact
	 */
	@XColumn(id = 26)
	public String electricianSegment;

	@XColumn(id = 27)
	public String electricianCompanyName;

	@XColumn(id = 28)
	public String electricianAddress;

	@XColumn(id = 29)
	public String electricianZip;

	@XColumn(id = 30)
	public String electricianCity;

	@XColumn(id = 31)
	public String electricianContactFirstName;

	@XColumn(id = 32)
	public String electricianContactLastName;

	@XColumn(id = 33)
	public String electricianGender;

	@XColumn(id = 34)
	public String electricianBusinessPhone;

	@XColumn(id = 35)
	public String electricianMobilePhone;

	@XColumn(id = 36)
	public String electricianEmail;

	/**
	 * Customer Specific Data
	 */
	@XColumn(id = 37)
	public String serviceActivationDate;

	@XColumn(id = 38)
	public String customerRef1;

	@XColumn(id = 39)
	public String customerRef2;

	@XColumn(id = 40)
	public String globalRef;

	@XColumn(id = 41)
	public String projectNo;

	@XColumn(id = 42)
	public String contractRef;

	/**
	 * Others
	 */
	@XColumn(id = 43)
	public String contractExpiry;

	@XColumn(id = 44)
	public String slaLevel;

	/**
	 * Sunrise IP VPN - Main Service Attributes
	 */
	@XColumn(id = 45)
	public String sipvpnSpeed;

	@XColumn(id = 46)
	public String sipvpnAccessType;

	@XColumn(id = 47)
	public String sipvpnTopologyType;

	@XColumn(id = 48)
	public String sipvpnResilience;

	@XColumn(id = 49)
	public String sipvpnRelatedServiceIdResilience;

	@XColumn(id = 50)
	public String sipvpnServiceMultiplexing;

	@XColumn(id = 51)
	public String sipvpnRelatedServiceIdServiceMultiplexing;

	@XColumn(id = 52)
	public String sipvpnIpVersion;

	@XColumn(id = 53)
	public String sipvpnMulticastSupportIPv4;

	@XColumn(id = 54)
	public String sipvpnMulticastSupportIPv6;

	@XColumn(id = 55)
	public String sipvpnClassOfService;

	@XColumn(id = 56)
	public String sipvpnNetworkManagementAccess;

	@XColumn(id = 57)
	public String sipvpnIpEncryption;

	@XColumn(id = 58)
	public String sipvpnArborProductLine;

	@XColumn(id = 59)
	public String sipvpnPostSLAtype;

	@XColumn(id = 60)
	public String sipvpnPostSiteClass;

	@XColumn(id = 61)
	public String sipvpnIdNumber;

	@XColumn(id = 62)
	public String sipvpnOptionType;

	@XColumn(id = 63)
	public String sipvpnRemarks;

	/**
	 * Sunrise Internet Direct - Main Service Attributes
	 */
	@XColumn(id = 64)
	public String sidSpeed;

	@XColumn(id = 65)
	public String sidAccessType;

	@XColumn(id = 66)
	public String sidServiceType;

	@XColumn(id = 67)
	public String sidResilience;

	@XColumn(id = 68)
	public String sidRelatedServiceIdResilience;

	@XColumn(id = 69)
	public String sidServiceMultiplexing;

	@XColumn(id = 70)
	public String sidRelatedServiceIdServiceMultiplexing;

	@XColumn(id = 71)
	public String sidIPAddressType;

	@XColumn(id = 72)
	public String sidIPVersion;

	@XColumn(id = 73)
	public String sidClassOfService;

	@XColumn(id = 74)
	public String sidNetworkManagementAccess;

	@XColumn(id = 75)
	public String sidSecureAccess;

	@XColumn(id = 76)
	public String sidDDOSP;

	@XColumn(id = 77)
	public String sidBBCSSLA;

	@XColumn(id = 78)
	public String sidOptionType;

	@XColumn(id = 79)
	public String sidRemarks;

	@XColumn(id = 80)
	public String sidPostSLAType;

	@XColumn(id = 81)
	public String sidPostSiteClass;

	@XColumn(id = 82)
	public String sidIdNumber;

	/**
	 * Sunrise Internet Light - Main Service Attributes
	 */
	@XColumn(id = 83)
	public String silSpeed;

	@XColumn(id = 84)
	public String silServiceType;

	@XColumn(id = 85)
	public String silAccessTechnology;

	@XColumn(id = 86)
	public String silDslConnectionType;

	@XColumn(id = 87)
	public String silBbcsSLA;

	@XColumn(id = 88)
	public String silInstallationPackage;

	@XColumn(id = 89)
	public String silRemarks;

	/**
	 * DSL Access
	 */
	@XColumn(id = 90)
	public String dslLDAPCN;

	@XColumn(id = 91)
	public String dslLDAPUID;

	@XColumn(id = 92)
	public String dslSpeed;

	@XColumn(id = 93)
	public String dslReference;

	@XColumn(id = 94)
	public String dslISPChange;

	@XColumn(id = 95)
	public String dslAccessStatus;

	@XColumn(id = 96)
	public String dslAccessType;

	@XColumn(id = 97)
	public String dslDemarcationPoint;

	@XColumn(id = 98)
	public String dslUPK;

	@XColumn(id = 99)
	public String dslOTOID;

	@XColumn(id = 100)
	public String dslActivationCode;

	@XColumn(id = 101)
	public String dslAccessOrderedDate;

	@XColumn(id = 102)
	public String dslInhousecablingOrderedDate;

	@XColumn(id = 103)
	public String dslLogin;

	@XColumn(id = 104)
	public String dslPassword;

	@XColumn(id = 105)
	public String dslNoOfTCPIPAddresses;

	@XColumn(id = 106)
	public String dslInstalledProduct;

	@XColumn(id = 107)
	public String dslCustomerWANIPAddress;

	@XColumn(id = 108)
	public String dslCustomerLANIPAddress;

	@XColumn(id = 109)
	public String dslLoopbackIPAddress;

	@XColumn(id = 110)
	public String dslCustomerWANIPAddressIPv6;

	@XColumn(id = 111)
	public String dslCustomerLANIPAddressIPv6;

	@XColumn(id = 112)
	public String dslLoopbackIPAddressIPv6;

	@XColumn(id = 113)
	public String dslRadiusPoolIPv6;

	@XColumn(id = 114)
	public String dslRadiusDelegatedPrefixIPv6;

	@XColumn(id = 115)
	public String dslRadiusDelegatedPrefixPoolIPv6;

	@XColumn(id = 116)
	public String dslVPNName;

	@XColumn(id = 117)
	public String dslLocalInterface;

	@XColumn(id = 118)
	public String dslRemark;

	/**
	 * ULL Access
	 */
	@XColumn(id = 119)
	public String ullAccessStatus;

	@XColumn(id = 120)
	public String ullAccessSpeed;

	@XColumn(id = 121)
	public String ullAmountOfTAL;

	@XColumn(id = 122)
	public String ullLEXID;

	@XColumn(id = 123)
	public String ullDemarcationPointUP;

	@XColumn(id = 124)
	public String ullNSN1;

	@XColumn(id = 125)
	public String ullUPK1;

	@XColumn(id = 126)
	public String ullHDFPort1;

	@XColumn(id = 127)
	public String ullNSN2;

	@XColumn(id = 128)
	public String ullUPK2;

	@XColumn(id = 129)
	public String ullHDFPort2;

	@XColumn(id = 130)
	public String ullNSN3;

	@XColumn(id = 131)
	public String ullUPK3;

	@XColumn(id = 132)
	public String ullHDFPort3;

	@XColumn(id = 133)
	public String ullNSN4;

	@XColumn(id = 134)
	public String ullUPK4;

	@XColumn(id = 135)
	public String ullHDFPort4;

	@XColumn(id = 136)
	public String ullAccessOrderedDate;

	@XColumn(id = 137)
	public String ullAccessDeliveryDate;

	@XColumn(id = 138)
	public String ullInhousecablingOrderedDate;

	@XColumn(id = 139)
	public String ullInhousecablingDeliveryDate;

	@XColumn(id = 140)
	public String ullRemark;

	/**
	 * IP Configuration
	 */
	@XColumn(id = 141)
	public String ipCPEHostName;
	@XColumn(id = 142)
	public String ipAddressType;
	@XColumn(id = 143)
	public String ipTotalNoOfLANIPAddresses;
	@XColumn(id = 144)
	public String ipLANInterfaceName;
	@XColumn(id = 145)
	public String ipLANInterfaceIPAddress;
	@XColumn(id = 146)
	public String ipSubnetAddress;
	@XColumn(id = 147)
	public String ipRoutingProtocolLANSide;
	@XColumn(id = 148)
	public String ipStaticRouting;
	@XColumn(id = 149)
	public String ipHSRP;
	@XColumn(id = 150)
	public String ipVLANID;
	@XColumn(id = 151)
	public String ipLANInterfaceName2;
	@XColumn(id = 152)
	public String ipLANInterfaceIPAddress2;
	@XColumn(id = 153)
	public String ipSubnetAddress2;
	@XColumn(id = 154)
	public String ipRoutingProtocolLANSide2;
	@XColumn(id = 155)
	public String ipStaticRouting2;
	@XColumn(id = 156)
	public String ipVLANID2;
	@XColumn(id = 157)
	public String ipHSRP2;
	@XColumn(id = 158)
	public String ipLANInterfaceName3;
	@XColumn(id = 159)
	public String ipLANInterfaceIPAddress3;
	@XColumn(id = 160)
	public String ipSubnetAddress3;
	@XColumn(id = 161)
	public String ipRoutingProtocolLANSide3;
	@XColumn(id = 162)
	public String ipStaticRouting3;
	@XColumn(id = 163)
	public String ipVLANID3;
	@XColumn(id = 164)
	public String ipHSRP3;
	@XColumn(id = 165)
	public String ipLANInterfaceName4;
	@XColumn(id = 166)
	public String ipLANInterfaceIPAddress4;
	@XColumn(id = 167)
	public String ipSubnetAddress4;
	@XColumn(id = 168)
	public String ipRoutingProtocolLANSide4;
	@XColumn(id = 169)
	public String ipStaticRouting4;
	@XColumn(id = 170)
	public String ipVLANID4;
	@XColumn(id = 171)
	public String ipHSRP4;
	@XColumn(id = 172)
	public String ipNetflow;
	@XColumn(id = 173)
	public String ipRIPENetname;
	@XColumn(id = 174)
	public String ipNetworkMgmtLBInterface;
	@XColumn(id = 175)
	public String ipLBInterfaceIPAddress;
	@XColumn(id = 176)
	public String ipRemark;

	/**
	 * DHCP/NAT
	 */
	@XColumn(id = 177)
	public String dhcpIPHelperAddress;
	
	@XColumn(id = 178)
	public String dhcpIPHelperAddress2;
	
	@XColumn(id = 179)
	public String dhcpIPHelperAddress3;
	
	@XColumn(id = 180)
	public String dhcpIPHelperAddress4;

	@XColumn(id = 181)
	public String dhcpCustomer;

	@XColumn(id = 182)
	public String dhcpAddressIPv4From;

	@XColumn(id = 183)
	public String dhcpAddressIPv4To;

	/**
	 * Hardware
	 */
	@XColumn(id = 184)
	public String hdwCPEOwner;
	@XColumn(id = 185)
	public String hdwCPEModel;
	@XColumn(id = 186)
	public String hdwSAPOrderNumber;
	@XColumn(id = 187)
	public String hdwAdditionalMemoryDRAM;
	@XColumn(id = 188)
	public String hdwAdditionalMemoryFlash;
	@XColumn(id = 189)
	public String hdwPESFP;
	@XColumn(id = 190)
	public String hdwAdditionalHardware1;
	@XColumn(id = 191)
	public String hdwAdditionalHardware2;
	@XColumn(id = 192)
	public String hdwAdditionalHardware3;
	@XColumn(id = 193)
	public String hdwAdditionalHardware4;
	@XColumn(id = 194)
	public String hdwIOS;
	@XColumn(id = 195)
	public String hdwTypeModemCustomer;
	@XColumn(id = 196)
	public String hdwAdapterCustomer;
	@XColumn(id = 197)
	public String hdwTypeModemPOP;
	@XColumn(id = 198)
	public String hdwAdapterPOP;
	@XColumn(id = 199)
	public String hdwRackInfoPOP;
	@XColumn(id = 200)
	public String hdwRemark1;
	@XColumn(id = 201)
	public String hdwRemark2;

	/**
	 * Communication
	 */
	@XColumn(id = 202)
	public String commDeinstallDate;
	@XColumn(id = 203)
	public String commLanguage;
	@XColumn(id = 204)
	public String commOutPortingDate;
	@XColumn(id = 205)
	public String commRemarks;
	@XColumn(id = 206)
	public String commServiceDesk;

	/**
	 * Response
	 */
	@XColumn(id = 207)
	public String respAppId;
	@XColumn(id = 208)
	public String respCustWANIP;
	@XColumn(id = 209)
	public String respNSN;
	@XColumn(id = 210)
	public String respDSLlogin;
	@XColumn(id = 211)
	public String respDSLpwd;
	@XColumn(id = 212)
	public String respDemarcationPoint;
	@XColumn(id = 213)
	public String respUPK;
	@XColumn(id = 214)
	public String respOTOID;
	@XColumn(id = 215)
	public String respAccessOrderDt;
	@XColumn(id = 216)
	public String respSerialNo;
	
	

	public void setcorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public void setserviceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public void setsipcoreId(String sipcoreId) {
		this.sipcoreId = sipcoreId;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public void setbillingSite(String billingSite) {
		this.billingSite = billingSite;
	}

	public void setsalesId(String salesId) {
		this.salesId = salesId;
	}

	public void setsiteName(String siteName) {
		this.siteName = siteName;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public void setaddress2(String address2) {
		this.address2 = address2;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}

	public void setfloor(String floor) {
		this.floor = floor;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public void setcountry(String country) {
		this.country = country;
	}

	public void setonsiteContactFirstName(String onsiteContactFirstName) {
		this.onsiteContactFirstName = onsiteContactFirstName;
	}

	public void setonsiteContactLastName(String onsiteContactLastName) {
		this.onsiteContactLastName = onsiteContactLastName;
	}

	public void setonsiteGender(String onsiteGender) {
		this.onsiteGender = onsiteGender;
	}

	public void setonsiteBusinessPhone(String onsiteBusinessPhone) {
		this.onsiteBusinessPhone = onsiteBusinessPhone;
	}

	public void setonsiteFax(String onsiteFax) {
		this.onsiteFax = onsiteFax;
	}

	public void setonsiteEmail(String onsiteEmail) {
		this.onsiteEmail = onsiteEmail;
	}

	public void settechnicalContactFirstName(String technicalContactFirstName) {
		this.technicalContactFirstName = technicalContactFirstName;
	}

	public void settechnicalContactLastName(String technicalContactLastName) {
		this.technicalContactLastName = technicalContactLastName;
	}

	public void settechnicalGender(String technicalGender) {
		this.technicalGender = technicalGender;
	}

	public void settechnicalBusinessPhone(String technicalBusinessPhone) {
		this.technicalBusinessPhone = technicalBusinessPhone;
	}

	public void settechnicalFax(String technicalFax) {
		this.technicalFax = technicalFax;
	}

	public void settechnicalEmail(String technicalEmail) {
		this.technicalEmail = technicalEmail;
	}

	public void setelectricianSegment(String electricianSegment) {
		this.electricianSegment = electricianSegment;
	}

	public void setelectricianCompanyName(String electricianCompanyName) {
		this.electricianCompanyName = electricianCompanyName;
	}

	public void setelectricianAddress(String electricianAddress) {
		this.electricianAddress = electricianAddress;
	}

	public void setelectricianZip(String electricianZip) {
		this.electricianZip = electricianZip;
	}

	public void setelectricianCity(String electricianCity) {
		this.electricianCity = electricianCity;
	}

	public void setelectricianContactFirstName(String electricianContactFirstName) {
		this.electricianContactFirstName = electricianContactFirstName;
	}

	public void setelectricianContactLastName(String electricianContactLastName) {
		this.electricianContactLastName = electricianContactLastName;
	}

	public void setelectricianGender(String electricianGender) {
		this.electricianGender = electricianGender;
	}

	public void setelectricianBusinessPhone(String electricianBusinessPhone) {
		this.electricianBusinessPhone = electricianBusinessPhone;
	}

	public void setelectricianMobilePhone(String electricianMobilePhone) {
		this.electricianMobilePhone = electricianMobilePhone;
	}

	public void setelectricianEmail(String electricianEmail) {
		this.electricianEmail = electricianEmail;
	}

	public void setserviceActivationDate(String serviceActivationDate) {
		this.serviceActivationDate = serviceActivationDate;
	}

	public void setcustomerRef1(String customerRef1) {
		this.customerRef1 = customerRef1;
	}

	public void setcustomerRef2(String customerRef2) {
		this.customerRef2 = customerRef2;
	}

	public void setglobalRef(String globalRef) {
		this.globalRef = globalRef;
	}

	public void setprojectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public void setcontractRef(String contractRef) {
		this.contractRef = contractRef;
	}

	public void setcontractExpiry(String contractExpiry) {
		this.contractExpiry = contractExpiry;
	}

	public void setslaLevel(String slaLevel) {
		this.slaLevel = slaLevel;
	}

	public void setsipvpnSpeed(String sipvpnSpeed) {
		this.sipvpnSpeed = sipvpnSpeed;
	}

	public void setsipvpnAccessType(String sipvpnAccessType) {
		this.sipvpnAccessType = sipvpnAccessType;
	}

	public void setsipvpnTopologyType(String sipvpnTopologyType) {
		this.sipvpnTopologyType = sipvpnTopologyType;
	}

	public void setsipvpnResilience(String sipvpnResilience) {
		this.sipvpnResilience = sipvpnResilience;
	}

	public void setsipvpnRelatedServiceIdResilience(String sipvpnRelatedServiceIdResilience) {
		this.sipvpnRelatedServiceIdResilience = sipvpnRelatedServiceIdResilience;
	}

	public void setsipvpnServiceMultiplexing(String sipvpnServiceMultiplexing) {
		this.sipvpnServiceMultiplexing = sipvpnServiceMultiplexing;
	}

	public void setsipvpnRelatedServiceIdServiceMultiplexing(String sipvpnRelatedServiceIdServiceMultiplexing) {
		this.sipvpnRelatedServiceIdServiceMultiplexing = sipvpnRelatedServiceIdServiceMultiplexing;
	}

	public void setsipvpnIpVersion(String sipvpnIpVersion) {
		this.sipvpnIpVersion = sipvpnIpVersion;
	}

	public void setsipvpnMulticastSupportIPv4(String sipvpnMulticastSupportIPv4) {
		this.sipvpnMulticastSupportIPv4 = sipvpnMulticastSupportIPv4;
	}

	public void setsipvpnMulticastSupportIPv6(String sipvpnMulticastSupportIPv6) {
		this.sipvpnMulticastSupportIPv6 = sipvpnMulticastSupportIPv6;
	}

	public void setsipvpnClassOfService(String sipvpnClassOfService) {
		this.sipvpnClassOfService = sipvpnClassOfService;
	}

	public void setsipvpnNetworkManagementAccess(String sipvpnNetworkManagementAccess) {
		this.sipvpnNetworkManagementAccess = sipvpnNetworkManagementAccess;
	}

	public void setsipvpnIpEncryption(String sipvpnIpEncryption) {
		this.sipvpnIpEncryption = sipvpnIpEncryption;
	}

	public void setsipvpnArborProductLine(String sipvpnArborProductLine) {
		this.sipvpnArborProductLine = sipvpnArborProductLine;
	}

	public void setsipvpnPostSLAtype(String sipvpnPostSLAtype) {
		this.sipvpnPostSLAtype = sipvpnPostSLAtype;
	}

	public void setsipvpnPostSiteClass(String sipvpnPostSiteClass) {
		this.sipvpnPostSiteClass = sipvpnPostSiteClass;
	}

	public void setsipvpnIdNumber(String sipvpnIdNumber) {
		this.sipvpnIdNumber = sipvpnIdNumber;
	}

	public void setsipvpnOptionType(String sipvpnOptionType) {
		this.sipvpnOptionType = sipvpnOptionType;
	}

	public void setsipvpnRemarks(String sipvpnRemarks) {
		this.sipvpnRemarks = sipvpnRemarks;
	}

	public void setsidSpeed(String sidSpeed) {
		this.sidSpeed = sidSpeed;
	}

	public void setsidAccessType(String sidAccessType) {
		this.sidAccessType = sidAccessType;
	}

	public void setsidServiceType(String sidServiceType) {
		this.sidServiceType = sidServiceType;
	}

	public void setsidResilience(String sidResilience) {
		this.sidResilience = sidResilience;
	}

	public void setsidRelatedServiceIdResilience(String sidRelatedServiceIdResilience) {
		this.sidRelatedServiceIdResilience = sidRelatedServiceIdResilience;
	}

	public void setsidServiceMultiplexing(String sidServiceMultiplexing) {
		this.sidServiceMultiplexing = sidServiceMultiplexing;
	}

	public void setsidRelatedServiceIdServiceMultiplexing(String sidRelatedServiceIdServiceMultiplexing) {
		this.sidRelatedServiceIdServiceMultiplexing = sidRelatedServiceIdServiceMultiplexing;
	}

	public void setsidIPAddressType(String sidIPAddressType) {
		this.sidIPAddressType = sidIPAddressType;
	}

	public void setsidIPVersion(String sidIPVersion) {
		this.sidIPVersion = sidIPVersion;
	}

	public void setsidClassOfService(String sidClassOfService) {
		this.sidClassOfService = sidClassOfService;
	}

	public void setsidNetworkManagementAccess(String sidNetworkManagementAccess) {
		this.sidNetworkManagementAccess = sidNetworkManagementAccess;
	}

	public void setsidSecureAccess(String sidSecureAccess) {
		this.sidSecureAccess = sidSecureAccess;
	}

	public void setsidDDOSP(String sidDDOSP) {
		this.sidDDOSP = sidDDOSP;
	}

	public void setsidBBCSSLA(String sidBBCSSLA) {
		this.sidBBCSSLA = sidBBCSSLA;
	}

	public void setsidOptionType(String sidOptionType) {
		this.sidOptionType = sidOptionType;
	}

	public void setsidRemarks(String sidRemarks) {
		this.sidRemarks = sidRemarks;
	}

	public void setsidPostSLAType(String sidPostSLAType) {
		this.sidPostSLAType = sidPostSLAType;
	}

	public void setsidPostSiteClass(String sidPostSiteClass) {
		this.sidPostSiteClass = sidPostSiteClass;
	}

	public void setsidIdNumber(String sidIdNumber) {
		this.sidIdNumber = sidIdNumber;
	}

	public void setsilSpeed(String silSpeed) {
		this.silSpeed = silSpeed;
	}

	public void setsilServiceType(String silServiceType) {
		this.silServiceType = silServiceType;
	}

	public void setsilAccessTechnology(String silAccessTechnology) {
		this.silAccessTechnology = silAccessTechnology;
	}

	public void setsilDslConnectionType(String silDslConnectionType) {
		this.silDslConnectionType = silDslConnectionType;
	}

	public void setsilBbcsSLA(String silBbcsSLA) {
		this.silBbcsSLA = silBbcsSLA;
	}

	public void setsilInstallationPackage(String silInstallationPackage) {
		this.silInstallationPackage = silInstallationPackage;
	}

	public void setsilRemarks(String silRemarks) {
		this.silRemarks = silRemarks;
	}

	public void setdslLDAPCN(String dslLDAPCN) {
		this.dslLDAPCN = dslLDAPCN;
	}

	public void setdslLDAPUID(String dslLDAPUID) {
		this.dslLDAPUID = dslLDAPUID;
	}

	public void setdslSpeed(String dslSpeed) {
		this.dslSpeed = dslSpeed;
	}

	public void setdslReference(String dslReference) {
		this.dslReference = dslReference;
	}

	public void setdslISPChange(String dslISPChange) {
		this.dslISPChange = dslISPChange;
	}

	public void setdslAccessStatus(String dslAccessStatus) {
		this.dslAccessStatus = dslAccessStatus;
	}

	public void setdslAccessType(String dslAccessType) {
		this.dslAccessType = dslAccessType;
	}

	public void setdslDemarcationPoint(String dslDemarcationPoint) {
		this.dslDemarcationPoint = dslDemarcationPoint;
	}

	public void setdslUPK(String dslUPK) {
		this.dslUPK = dslUPK;
	}

	public void setdslOTOID(String dslOTOID) {
		this.dslOTOID = dslOTOID;
	}

	public void setdslActivationCode(String dslActivationCode) {
		this.dslActivationCode = dslActivationCode;
	}

	public void setdslAccessOrderedDate(String dslAccessOrderedDate) {
		this.dslAccessOrderedDate = dslAccessOrderedDate;
	}

	public void setdslInhousecablingOrderedDate(String dslInhousecablingOrderedDate) {
		this.dslInhousecablingOrderedDate = dslInhousecablingOrderedDate;
	}

	public void setdslLogin(String dslLogin) {
		this.dslLogin = dslLogin;
	}

	public void setdslPassword(String dslPassword) {
		this.dslPassword = dslPassword;
	}

	public void setdslNoOfTCPIPAddresses(String dslNoOfTCPIPAddresses) {
		this.dslNoOfTCPIPAddresses = dslNoOfTCPIPAddresses;
	}

	public void setdslInstalledProduct(String dslInstalledProduct) {
		this.dslInstalledProduct = dslInstalledProduct;
	}

	public void setdslCustomerWANIPAddress(String dslCustomerWANIPAddress) {
		this.dslCustomerWANIPAddress = dslCustomerWANIPAddress;
	}

	public void setdslCustomerLANIPAddress(String dslCustomerLANIPAddress) {
		this.dslCustomerLANIPAddress = dslCustomerLANIPAddress;
	}

	public void setdslLoopbackIPAddress(String dslLoopbackIPAddress) {
		this.dslLoopbackIPAddress = dslLoopbackIPAddress;
	}

	public void setdslCustomerWANIPAddressIPv6(String dslCustomerWANIPAddressIPv6) {
		this.dslCustomerWANIPAddressIPv6 = dslCustomerWANIPAddressIPv6;
	}

	public void setdslCustomerLANIPAddressIPv6(String dslCustomerLANIPAddressIPv6) {
		this.dslCustomerLANIPAddressIPv6 = dslCustomerLANIPAddressIPv6;
	}

	public void setdslLoopbackIPAddressIPv6(String dslLoopbackIPAddressIPv6) {
		this.dslLoopbackIPAddressIPv6 = dslLoopbackIPAddressIPv6;
	}

	public void setdslRadiusPoolIPv6(String dslRadiusPoolIPv6) {
		this.dslRadiusPoolIPv6 = dslRadiusPoolIPv6;
	}

	public void setdslRadiusDelegatedPrefixIPv6(String dslRadiusDelegatedPrefixIPv6) {
		this.dslRadiusDelegatedPrefixIPv6 = dslRadiusDelegatedPrefixIPv6;
	}

	public void setdslRadiusDelegatedPrefixPoolIPv6(String dslRadiusDelegatedPrefixPoolIPv6) {
		this.dslRadiusDelegatedPrefixPoolIPv6 = dslRadiusDelegatedPrefixPoolIPv6;
	}

	public void setdslVPNName(String dslVPNName) {
		this.dslVPNName = dslVPNName;
	}

	public void setdslLocalInterface(String dslLocalInterface) {
		this.dslLocalInterface = dslLocalInterface;
	}

	public void setdslRemark(String dslRemark) {
		this.dslRemark = dslRemark;
	}

	public void setullAccessStatus(String ullAccessStatus) {
		this.ullAccessStatus = ullAccessStatus;
	}

	public void setullAccessSpeed(String ullAccessSpeed) {
		this.ullAccessSpeed = ullAccessSpeed;
	}

	public void setullAmountOfTAL(String ullAmountOfTAL) {
		this.ullAmountOfTAL = ullAmountOfTAL;
	}

	public void setullLEXID(String ullLEXID) {
		this.ullLEXID = ullLEXID;
	}

	public void setullDemarcationPointUP(String ullDemarcationPointUP) {
		this.ullDemarcationPointUP = ullDemarcationPointUP;
	}

	public void setullNSN1(String ullNSN1) {
		this.ullNSN1 = ullNSN1;
	}

	public void setullUPK1(String ullUPK1) {
		this.ullUPK1 = ullUPK1;
	}

	public void setullHDFPort1(String ullHDFPort1) {
		this.ullHDFPort1 = ullHDFPort1;
	}

	public void setullNSN2(String ullNSN2) {
		this.ullNSN2 = ullNSN2;
	}

	public void setullUPK2(String ullUPK2) {
		this.ullUPK2 = ullUPK2;
	}

	public void setullHDFPort2(String ullHDFPort2) {
		this.ullHDFPort2 = ullHDFPort2;
	}

	public void setullNSN3(String ullNSN3) {
		this.ullNSN3 = ullNSN3;
	}

	public void setullUPK3(String ullUPK3) {
		this.ullUPK3 = ullUPK3;
	}

	public void setullHDFPort3(String ullHDFPort3) {
		this.ullHDFPort3 = ullHDFPort3;
	}

	public void setullNSN4(String ullNSN4) {
		this.ullNSN4 = ullNSN4;
	}

	public void setullUPK4(String ullUPK4) {
		this.ullUPK4 = ullUPK4;
	}

	public void setullHDFPort4(String ullHDFPort4) {
		this.ullHDFPort4 = ullHDFPort4;
	}

	public void setullAccessOrderedDate(String ullAccessOrderedDate) {
		this.ullAccessOrderedDate = ullAccessOrderedDate;
	}

	public void setullAccessDeliveryDate(String ullAccessDeliveryDate) {
		this.ullAccessDeliveryDate = ullAccessDeliveryDate;
	}

	public void setullInhousecablingOrderedDate(String ullInhousecablingOrderedDate) {
		this.ullInhousecablingOrderedDate = ullInhousecablingOrderedDate;
	}

	public void setullInhousecablingDeliveryDate(String ullInhousecablingDeliveryDate) {
		this.ullInhousecablingDeliveryDate = ullInhousecablingDeliveryDate;
	}

	public void setullRemark(String ullRemark) {
		this.ullRemark = ullRemark;
	}

	public void setipCPEHostName(String ipCPEHostName) {
		this.ipCPEHostName = ipCPEHostName;
	}

	public void setipAddressType(String ipAddressType) {
		this.ipAddressType = ipAddressType;
	}

	public void setipTotalNoOfLANIPAddresses(String ipTotalNoOfLANIPAddresses) {
		this.ipTotalNoOfLANIPAddresses = ipTotalNoOfLANIPAddresses;
	}

	public void setipLANInterfaceName(String ipLANInterfaceName) {
		this.ipLANInterfaceName = ipLANInterfaceName;
	}

	public void setipLANInterfaceIPAddress(String ipLANInterfaceIPAddress) {
		this.ipLANInterfaceIPAddress = ipLANInterfaceIPAddress;
	}

	public void setipSubnetAddress(String ipSubnetAddress) {
		this.ipSubnetAddress = ipSubnetAddress;
	}

	public void setipRoutingProtocolLANSide(String ipRoutingProtocolLANSide) {
		this.ipRoutingProtocolLANSide = ipRoutingProtocolLANSide;
	}

	public void setipStaticRouting(String ipStaticRouting) {
		this.ipStaticRouting = ipStaticRouting;
	}

	public void setipHSRP(String ipHSRP) {
		this.ipHSRP = ipHSRP;
	}

	public void setipVLANID(String ipVLANID) {
		this.ipVLANID = ipVLANID;
	}

	public void setipLANInterfaceName2(String ipLANInterfaceName2) {
		this.ipLANInterfaceName2 = ipLANInterfaceName2;
	}

	public void setipLANInterfaceIPAddress2(String ipLANInterfaceIPAddress2) {
		this.ipLANInterfaceIPAddress2 = ipLANInterfaceIPAddress2;
	}

	public void setipSubnetAddress2(String ipSubnetAddress2) {
		this.ipSubnetAddress2 = ipSubnetAddress2;
	}

	public void setipRoutingProtocolLANSide2(String ipRoutingProtocolLANSide2) {
		this.ipRoutingProtocolLANSide2 = ipRoutingProtocolLANSide2;
	}

	public void setipStaticRouting2(String ipStaticRouting2) {
		this.ipStaticRouting2 = ipStaticRouting2;
	}

	public void setipVLANID2(String ipVLANID2) {
		this.ipVLANID2 = ipVLANID2;
	}

	public void setipHSRP2(String ipHSRP2) {
		this.ipHSRP2 = ipHSRP2;
	}

	public void setipLANInterfaceName3(String ipLANInterfaceName3) {
		this.ipLANInterfaceName3 = ipLANInterfaceName3;
	}

	public void setipLANInterfaceIPAddress3(String ipLANInterfaceIPAddress3) {
		this.ipLANInterfaceIPAddress3 = ipLANInterfaceIPAddress3;
	}

	public void setipSubnetAddress3(String ipSubnetAddress3) {
		this.ipSubnetAddress3 = ipSubnetAddress3;
	}

	public void setipRoutingProtocolLANSide3(String ipRoutingProtocolLANSide3) {
		this.ipRoutingProtocolLANSide3 = ipRoutingProtocolLANSide3;
	}

	public void setipStaticRouting3(String ipStaticRouting3) {
		this.ipStaticRouting3 = ipStaticRouting3;
	}

	public void setipVLANID3(String ipVLANID3) {
		this.ipVLANID3 = ipVLANID3;
	}

	public void setipHSRP3(String ipHSRP3) {
		this.ipHSRP3 = ipHSRP3;
	}

	public void setipLANInterfaceName4(String ipLANInterfaceName4) {
		this.ipLANInterfaceName4 = ipLANInterfaceName4;
	}

	public void setipLANInterfaceIPAddress4(String ipLANInterfaceIPAddress4) {
		this.ipLANInterfaceIPAddress4 = ipLANInterfaceIPAddress4;
	}

	public void setipSubnetAddress4(String ipSubnetAddress4) {
		this.ipSubnetAddress4 = ipSubnetAddress4;
	}

	public void setipRoutingProtocolLANSide4(String ipRoutingProtocolLANSide4) {
		this.ipRoutingProtocolLANSide4 = ipRoutingProtocolLANSide4;
	}

	public void setipStaticRouting4(String ipStaticRouting4) {
		this.ipStaticRouting4 = ipStaticRouting4;
	}

	public void setipVLANID4(String ipVLANID4) {
		this.ipVLANID4 = ipVLANID4;
	}

	public void setipHSRP4(String ipHSRP4) {
		this.ipHSRP4 = ipHSRP4;
	}

	public void setipNetflow(String ipNetflow) {
		this.ipNetflow = ipNetflow;
	}

	public void setipRIPENetname(String ipRIPENetname) {
		this.ipRIPENetname = ipRIPENetname;
	}

	public void setipNetworkMgmtLBInterface(String ipNetworkMgmtLBInterface) {
		this.ipNetworkMgmtLBInterface = ipNetworkMgmtLBInterface;
	}

	public void setipLBInterfaceIPAddress(String ipLBInterfaceIPAddress) {
		this.ipLBInterfaceIPAddress = ipLBInterfaceIPAddress;
	}

	public void setipRemark(String ipRemark) {
		this.ipRemark = ipRemark;
	}
	public void setdhcpIPHelperAddress(String dhcpIPHelperAddress) {
		this.dhcpIPHelperAddress = dhcpIPHelperAddress;
	}

	public void setdhcpIPHelperAddress2(String dhcpIPHelperAddress2) {
		this.dhcpIPHelperAddress2 = dhcpIPHelperAddress2;
	}

	public void setdhcpIPHelperAddress3(String dhcpIPHelperAddress3) {
		this.dhcpIPHelperAddress3 = dhcpIPHelperAddress3;
	}

	public void setdhcpIPHelperAddress4(String dhcpIPHelperAddress4) {
		this.dhcpIPHelperAddress4 = dhcpIPHelperAddress4;
	}
	public void setdhcpCustomer(String dhcpCustomer) {
		this.dhcpCustomer = dhcpCustomer;
	}

	public void setdhcpAddressIPv4From(String dhcpAddressIPv4From) {
		this.dhcpAddressIPv4From = dhcpAddressIPv4From;
	}

	public void setdhcpAddressIPv4To(String dhcpAddressIPv4To) {
		this.dhcpAddressIPv4To = dhcpAddressIPv4To;
	}

	public void sethdwCPEOwner(String hdwCPEOwner) {
		this.hdwCPEOwner = hdwCPEOwner;
	}

	public void sethdwCPEModel(String hdwCPEModel) {
		this.hdwCPEModel = hdwCPEModel;
	}

	public void sethdwSAPOrderNumber(String hdwSAPOrderNumber) {
		this.hdwSAPOrderNumber = hdwSAPOrderNumber;
	}

	public void sethdwAdditionalMemoryDRAM(String hdwAdditionalMemoryDRAM) {
		this.hdwAdditionalMemoryDRAM = hdwAdditionalMemoryDRAM;
	}

	public void sethdwAdditionalMemoryFlash(String hdwAdditionalMemoryFlash) {
		this.hdwAdditionalMemoryFlash = hdwAdditionalMemoryFlash;
	}

	public void sethdwPESFP(String hdwPESFP) {
		this.hdwPESFP = hdwPESFP;
	}

	public void sethdwAdditionalHardware1(String hdwAdditionalHardware1) {
		this.hdwAdditionalHardware1 = hdwAdditionalHardware1;
	}

	public void sethdwAdditionalHardware2(String hdwAdditionalHardware2) {
		this.hdwAdditionalHardware2 = hdwAdditionalHardware2;
	}

	public void sethdwAdditionalHardware3(String hdwAdditionalHardware3) {
		this.hdwAdditionalHardware3 = hdwAdditionalHardware3;
	}

	public void sethdwAdditionalHardware4(String hdwAdditionalHardware4) {
		this.hdwAdditionalHardware4 = hdwAdditionalHardware4;
	}

	public void sethdwIOS(String hdwIOS) {
		this.hdwIOS = hdwIOS;
	}

	public void sethdwTypeModemCustomer(String hdwTypeModemCustomer) {
		this.hdwTypeModemCustomer = hdwTypeModemCustomer;
	}

	public void sethdwAdapterCustomer(String hdwAdapterCustomer) {
		this.hdwAdapterCustomer = hdwAdapterCustomer;
	}

	public void sethdwTypeModemPOP(String hdwTypeModemPOP) {
		this.hdwTypeModemPOP = hdwTypeModemPOP;
	}

	public void sethdwAdapterPOP(String hdwAdapterPOP) {
		this.hdwAdapterPOP = hdwAdapterPOP;
	}

	public void sethdwRackInfoPOP(String hdwRackInfoPOP) {
		this.hdwRackInfoPOP = hdwRackInfoPOP;
	}

	public void sethdwRemark1(String hdwRemark1) {
		this.hdwRemark1 = hdwRemark1;
	}

	public void sethdwRemark2(String hdwRemark2) {
		this.hdwRemark2 = hdwRemark2;
	}

	public void setcommDeinstallDate(String commDeinstallDate) {
		this.commDeinstallDate = commDeinstallDate;
	}

	public void setcommLanguage(String commLanguage) {
		this.commLanguage = commLanguage;
	}

	public void setcommOutPortingDate(String commOutPortingDate) {
		this.commOutPortingDate = commOutPortingDate;
	}

	public void setcommRemarks(String commRemarks) {
		this.commRemarks = commRemarks;
	}

	public void setcommServiceDesk(String commServiceDesk) {
		this.commServiceDesk = commServiceDesk;
	}

	public void setrespAppId(String respAppId) {
		this.respAppId = respAppId;
	}

	public void setrespCustWANIP(String respCustWANIP) {
		this.respCustWANIP = respCustWANIP;
	}

	public void setrespNSN(String respNSN) {
		this.respNSN = respNSN;
	}

	public void setrespDSLlogin(String respDSLlogin) {
		this.respDSLlogin = respDSLlogin;
	}

	public void setrespDSLpwd(String respDSLpwd) {
		this.respDSLpwd = respDSLpwd;
	}

	public void setrespDemarcationPoint(String respDemarcationPoint) {
		this.respDemarcationPoint = respDemarcationPoint;
	}

	public void setrespUPK(String respUPK) {
		this.respUPK = respUPK;
	}

	public void setrespOTOID(String respOTOID) {
		this.respOTOID = respOTOID;
	}

	public void setrespAccessOrderDt(String respAccessOrderDt) {
		this.respAccessOrderDt = respAccessOrderDt;
	}

	public void setrespSerialNo(String respSerialNo) {
		this.respSerialNo = respSerialNo;
	}

}
