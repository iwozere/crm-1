package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = 1, name = XConstants.PARTNER_NETWORK_MIGRATION_L3_TO_L1)
public class XPartnerNetworkMigrationDataL3toL1 {

	@XColumn(id = 0, required = true)
	public String siteId;

	@XColumn(id = 1, required = true)
	public String productSerial;

	@XColumn(id = 2)
	public String targetAccess;

	@XColumn(id = 3)
	public String targetOto;

	@XColumn(id = 4)
	public String wishAccessSwitchDate;

	@XColumn(id = 5)
	public String shipAddress;

	@XColumn(id = 6)
	public String shipCity;

	@XColumn(id = 7)
	public String shipZip;

	@XColumn(id = 8)
	public String shipCompanyName;

	@XColumn(id = 9)
	public String shipFName;

	@XColumn(id = 10)
	public String shipLName;

	@XColumn(id = 11)
	public String hasDect;

	@XColumn(id = 12)
	public String hasModem;

	public String getsiteId() {
		return siteId;
	}

	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getproductSerial() {
		return productSerial;
	}

	public void setproductSerial(String productSerial) {
		this.productSerial = productSerial;
	}

	public String gettargetAccess() {
		return targetAccess;
	}

	public void settargetAccess(String targetAccess) {
		this.targetAccess = targetAccess;
	}

	public String gettargetOto() {
		return targetOto;
	}


	public void settargetOto(String targetOto) {
		this.targetOto = targetOto;
	}
	
	public String getwishAccessSwitchDate() {
		return wishAccessSwitchDate;
	}

	public void setwishAccessSwitchDate(String wishAccessSwitchDate) {
		this.wishAccessSwitchDate = wishAccessSwitchDate;
	}

	public String getshipAddress() {
		return shipAddress;
	}

	public void setshipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getshipCity() {
		return shipCity;
	}

	public void setshipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getshipZip() {
		return shipZip;
	}

	public void setshipZip(String shipZip) {
		this.shipZip = shipZip;
	}

	public String getshipCompanyName() {
		return shipCompanyName;
	}

	public void setshipCompanyName(String shipCompanyName) {
		this.shipCompanyName = shipCompanyName;
	}

	public String getshipFName() {
		return shipFName;
	}

	public void setshipFName(String shipFName) {
		this.shipFName = shipFName;
	}

	public String getshipLName() {
		return shipLName;
	}

	public void setshipLName(String shipLName) {
		this.shipLName = shipLName;
	}

	public String gethasDect() {
		return hasDect;
	}

	public void sethasDect(String hasDect) {
		this.hasDect = hasDect;
	}

	public String gethasModem() {
		return hasModem;
	}

	public void sethasModem(String hasModem) {
		this.hasModem = hasModem;
	}

}
