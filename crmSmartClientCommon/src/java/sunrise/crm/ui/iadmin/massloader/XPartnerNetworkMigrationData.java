package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = 1, name = XConstants.PARTNER_NETWORK_MIGRATION)
public class XPartnerNetworkMigrationData {

	@XColumn(id = 0, required = true)
	public String siteId;

	@XColumn(id = 1, required = true)
	public String productSerial;

	@XColumn(id = 2)
	public String targetAccess;

	@XColumn(id = 3)
	public String targetOto;

	@XColumn(id = 4)
	public String migrationDate;

	@XColumn(id = 5)
	public String wishAccessSwitchDate;

	@XColumn(id = 6)
	public String sourceProduct;

	@XColumn(id = 7)
	public String targetProduct;

	@XColumn(id = 8)
	public String targetInternetRP;

	@XColumn(id = 9)
	public String targetPhoneRP;

	@XColumn(id = 10)
	public String targetTvRP;

	@XColumn(id = 11)
	public String shippingAddress;

	@XColumn(id = 12)
	public String shippingCity;

	@XColumn(id = 13)
	public String shippingZip;

	@XColumn(id = 14)
	public String shipCompName;

	@XColumn(id = 15)
	public String firstName;

	@XColumn(id = 16)
	public String lastName;

	@XColumn(id = 17)
	public String targetOption1;

	@XColumn(id = 18)
	public String targetOption2;

	@XColumn(id = 19)
	public String targetOption3;

	@XColumn(id = 20)
	public String targetOption4;

	@XColumn(id = 21)
	public String targetOption5;

	@XColumn(id = 22)
	public String targetDiscountName;

	@XColumn(id = 23)
	public String targetDiscountAmount;

	@XColumn(id = 24)
	public String targetDiscountDuration;

	// migration companion order
	@XColumn(id = 25)
	public String migrationOrder;

	@XColumn(id = 26)

	public String rescheduleMigration;

	@XColumn(id = 27)

	public String cancellationReason;

	@XColumn(id = 28)

	public String preferredMonth;

	public String getRescheduleMigration() {
		return rescheduleMigration;
	}

	public void setrescheduleMigration(String rescheduleMigration) {
		this.rescheduleMigration = rescheduleMigration;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setcancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public String getPreferredMonth() {
		return preferredMonth;
	}

	public void setpreferredMonth(String preferredMonth) {
		this.preferredMonth = preferredMonth;
	}

	public String getMigrationOrder() {
		return migrationOrder;
	}

	public void setmigrationOrder(String migrationOrder) {
		this.migrationOrder = migrationOrder;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getProductSerial() {
		return productSerial;
	}

	public void setproductSerial(String productSerial) {
		this.productSerial = productSerial;
	}

	public String getTargetAccess() {
		return targetAccess;
	}

	public void settargetAccess(String targetAccess) {
		this.targetAccess = targetAccess;
	}

	public String getTargetOto() {
		return targetOto;
	}

	public void settargetOto(String targetOto) {
		this.targetOto = targetOto;
	}

	public String getMigrationDate() {
		return migrationDate;
	}

	public void setmigrationDate(String migrationDate) {
		this.migrationDate = migrationDate;
	}

	public String getWishAccessSwitchDate() {
		return wishAccessSwitchDate;
	}

	public void setwishAccessSwitchDate(String wishAccessSwitchDate) {
		this.wishAccessSwitchDate = wishAccessSwitchDate;
	}

	public String getTargetProduct() {
		return targetProduct;
	}

	public void settargetProduct(String targetProduct) {
		this.targetProduct = targetProduct;
	}

	public String getTargetInternetRP() {
		return targetInternetRP;
	}

	public void settargetInternetRP(String targetInternetRP) {
		this.targetInternetRP = targetInternetRP;
	}

	// public String getIsIPV6() {
	// return isIPV6;
	// }
	//
	//
	// public void setisIPV6(String isIPV6) {
	// this.isIPV6 = isIPV6;
	// }

	public String getTargetTvRP() {
		return targetTvRP;
	}

	public void settargetTvRP(String targetTvRP) {
		this.targetTvRP = targetTvRP;
	}

	public String getTargetPhoneRP() {
		return targetPhoneRP;
	}

	public void settargetPhoneRP(String targetPhoneRP) {
		this.targetPhoneRP = targetPhoneRP;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setshippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setshippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingZip() {
		return shippingZip;
	}

	public void setshippingZip(String shippingZip) {
		this.shippingZip = shippingZip;
	}

	public String getShipCompName() {
		return shipCompName;
	}

	public void setshipCompName(String shipCompName) {
		this.shipCompName = shipCompName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTargetOption1() {
		return targetOption1;
	}

	public void settargetOption1(String targetOption1) {
		this.targetOption1 = targetOption1;
	}

	public String getTargetOption2() {
		return targetOption2;
	}

	public void settargetOption2(String targetOption2) {
		this.targetOption2 = targetOption2;
	}

	public String getTargetOption3() {
		return targetOption3;
	}

	public void settargetOption3(String targetOption3) {
		this.targetOption3 = targetOption3;
	}

	public String getTargetOption4() {
		return targetOption4;
	}

	public void settargetOption4(String targetOption4) {
		this.targetOption4 = targetOption4;
	}

	public String getTargetOption5() {
		return targetOption5;
	}

	public void settargetOption5(String targetOption5) {
		this.targetOption5 = targetOption5;
	}

	public String getTargetDiscountName() {
		return targetDiscountName;
	}

	public void settargetDiscountName(String targetDiscountName) {
		this.targetDiscountName = targetDiscountName;
	}

	public String getTargetDiscountAmount() {
		return targetDiscountAmount;
	}

	public void settargetDiscountAmount(String targetDiscountAmount) {
		this.targetDiscountAmount = targetDiscountAmount;
	}

	public String getTargetDiscountDuration() {
		return targetDiscountDuration;
	}

	public void settargetDiscountDuration(String targetDiscountDuration) {
		this.targetDiscountDuration = targetDiscountDuration;
	}

	public String getSourceProduct() {
		return sourceProduct;
	}

	public void setsourceProduct(String sourceProduct) {
		this.sourceProduct = sourceProduct;
	}

}
