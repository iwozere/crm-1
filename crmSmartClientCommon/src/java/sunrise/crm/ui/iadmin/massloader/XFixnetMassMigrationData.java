/**
 * 
 */
package sunrise.crm.ui.iadmin.massloader;

/**
 * @author Jamge
 *
 */
@XWorksheet(rowOffset = 1, name = XConstants.FIXNET_MASS_MIGRATION_DATA)
public class XFixnetMassMigrationData {

    @XColumn(id = 0, required = true)
    public String siteId;

    @XColumn(id = 1)
    public String productSerial;

    @XColumn(id = 2)
    public String sourceProduct;

    @XColumn(id = 3)
    public String targetProduct;

    @XColumn(id = 4)
    public String targetTvRpName;

    @XColumn(id = 5)
    public String targetInternetRpName;

    @XColumn(id = 6)
    public String tvBoxSerial;

    @XColumn(id = 7)
    public String multiBoxSerial1;

    @XColumn(id = 8)
    public String multiBoxSerial2;

    @XColumn(id = 9)
    public String hfcAdressType;

    @XColumn(id = 10)
    public String hfcAdressId;

    @XColumn(id = 11)
    public String hfcNetwork;

    @XColumn(id = 12)
    public String hfcBillingMethod;

    @XColumn(id = 13)
    public String hfcTvSupport;
    
    @XColumn(id = 14)
    public String speedProfile;
    
    @XColumn(id = 15)
    public String dectPhone;
    
    @XColumn(id = 16)
    public String premiumChannel;
    
    @XColumn(id = 17)
    public String migrationDate;
    
    @XColumn(id = 18)
    public String migrationScenario;
            
    @XColumn(id = 19)
    public String discountName;
    
    @XColumn(id = 20)
    public String discountAmount;
    
    @XColumn(id = 21)
    public String discountDuration;
    
    @XColumn(id = 22)
    public String discountType;
    
    // Only OUT Params
    
    public String migrationStatus;
    
    public String migrationStage;
    
    public String orderId;
    
    public String failureReason;
    
    public String orderStatus;
    
    public String notes;

    public String otoId;
    
    public String migrationPostponeCounter;
    
    public String OtoUpdateCounter;
    
	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}

	public void setproductSerial(String productSerial) {
		this.productSerial = productSerial;
	}

	public void setsourceProduct(String sourceProduct) {
		this.sourceProduct = sourceProduct;
	}


	public void settargetProduct(String targetProduct) {
		this.targetProduct = targetProduct;
	}

	public void settargetTvRpName(String targetTvRpName) {
		this.targetTvRpName = targetTvRpName;
	}


	public void settargetInternetRpName(String targetInternetRpName) {
		this.targetInternetRpName = targetInternetRpName;
	}


	public void settvBoxSerial(String tvBoxSerial) {
		this.tvBoxSerial = tvBoxSerial;
	}

	public void setmultiBoxSerial1(String muliBoxSerial1) {
		this.multiBoxSerial1 = muliBoxSerial1;
	}

	public void setmultiBoxSerial2(String muliBoxSerial2) {
		this.multiBoxSerial2 = muliBoxSerial2;
	}

	public void sethfcAdressType(String hfcAdressType) {
		this.hfcAdressType = hfcAdressType;
	}

	public void sethfcAdressId(String hfcAdressId) {
		this.hfcAdressId = hfcAdressId;
	}

	public void sethfcNetwork(String hfcNetwork) {
		this.hfcNetwork = hfcNetwork;
	}

	public void sethfcBillingMethod(String hfcBillingMethod) {
		this.hfcBillingMethod = hfcBillingMethod;
	}

	public void sethfcTvSupport(String hfcTvSupport) {
		this.hfcTvSupport = hfcTvSupport;
	}

	public void setmigrationScenario(String migrationScenario) {
		this.migrationScenario = migrationScenario;
	}

	public String getMigrationDate() {
		return migrationDate;
	}

	public void setmigrationDate(String migrationDate) {
		this.migrationDate = migrationDate;
	}

	public String getSiteId() {
		return siteId;
	}

	public String getProductSerial() {
		return productSerial;
	}

	public String getSourceProduct() {
		return sourceProduct;
	}

	public String getTargetProduct() {
		return targetProduct;
	}

	public String getTargetTvRpName() {
		return targetTvRpName;
	}

	public String getTargetInternetRpName() {
		return targetInternetRpName;
	}

	public String getTvBoxSerial() {
		return tvBoxSerial;
	}

	public String getMigrationStatus() {
		return migrationStatus;
	}

	public void setMigrationStatus(String migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMultiBoxSerial1() {
		return multiBoxSerial1;
	}

	public String getMultiBoxSerial2() {
		return multiBoxSerial2;
	}

	public String getHfcAdressType() {
		return hfcAdressType;
	}

	public String getHfcAdressId() {
		return hfcAdressId;
	}

	public String getHfcNetwork() {
		return hfcNetwork;
	}

	public String getHfcBillingMethod() {
		return hfcBillingMethod;
	}

	public String getHfcTvSupport() {
		return hfcTvSupport;
	}

	public String getMigrationScenario() {
		return migrationScenario;
	}

	public String getMigrationStage() {
		return migrationStage;
	}

	public void setMigrationStage(String migrationStage) {
		this.migrationStage = migrationStage;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public void setspeedProfile(String speedProfile) {
		this.speedProfile = speedProfile;
	}

	public void setdectPhone(String dectPhone) {
		this.dectPhone = dectPhone;
	}

	public void setpremiumChannel(String premiumChannel) {
		this.premiumChannel = premiumChannel;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setdiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setdiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountDuration() {
		return discountDuration;
	}

	public void setdiscountDuration(String discountDuration) {
		this.discountDuration = discountDuration;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setdiscountType(String discountType) {
		this.discountType = discountType;
	}
	
	public void setnotes(String notes) {
		this.notes = notes;
	}
	
	public String getNotes() {
		return notes;
	}

	public String getOtoId() {
		return otoId;
	}

	public void setOtoId(String otoId) {
		this.otoId = otoId;
	}

	public String getMigrationPostponeCounter() {
		return migrationPostponeCounter;
	}

	public void setMigrationPostponeCounter(String migrationPostponeCounter) {
		this.migrationPostponeCounter = migrationPostponeCounter;
	}

	public String getOtoUpdateCounter() {
		return OtoUpdateCounter;
	}

	public void setOtoUpdateCounter(String otoUpdateCounter) {
		OtoUpdateCounter = otoUpdateCounter;
	}

}
