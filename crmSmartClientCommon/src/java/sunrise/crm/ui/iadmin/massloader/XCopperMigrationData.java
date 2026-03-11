package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = 1, name = XConstants.COPPER_MIGRATION)
public class XCopperMigrationData {
	
	@XColumn(id = 0, required = true)
    public String siteId;

    @XColumn(id = 1)
    public String productSerial;
    
    @XColumn(id = 2)
    public String otoId;

    @XColumn(id = 3)
    public String prio1Access;
    
    @XColumn(id = 4)
    public String prio2Access;

    @XColumn(id = 5)
    public String migrationScenario;
 
    @XColumn(id = 6)
    public String activationDate;
    
    @XColumn(id = 7)
    public String sourceProduct;
    
    @XColumn(id = 8)
    public String targetProduct;
    
    @XColumn(id = 9)
    public String internetRatePlan;
    
    @XColumn(id = 10)
    public String tvRatePlan;
    
    @XColumn(id = 11)
    public String phoneRatePlan;
	
    @XColumn(id = 12)
    public String optionName1;
    
    @XColumn(id = 13)
    public String optionName2;
    
    @XColumn(id = 14)
    public String optionName3;
    
    @XColumn(id = 15)
    public String discountName;
    
    @XColumn(id = 16)
    public String discountAmount;
    
    @XColumn(id = 17)
    public String discountDuration;
    
    @XColumn(id = 18)
    public String data1;
    
    @XColumn(id = 19)
    public String data2;
    
    @XColumn(id = 20)
    public String data3;
    
    // Only OUT Params
    
    public String migrationStatus;
    
    public String migrationStage;
    
    public String orderId;
    
    public String failureReason;
    
    //extra params to load
    public String migrationPostponeCounter;
    
    public String otoUpdateCounter;
    
    /** ******************************************************************
     * SETTERS 
     **********************************************************************/

	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}

	public void setproductSerial(String productSerial) {
		this.productSerial = productSerial;
	}

	public void setotoId(String otoId) {
		this.otoId = otoId;
	}

	public void setprio1Access(String prio1Access) {
		this.prio1Access = prio1Access;
	}

	public void setprio2Access(String prio2Access) {
		this.prio2Access = prio2Access;
	}

	public void setmigrationScenario(String migrationScenario) {
		this.migrationScenario = migrationScenario;
	}

	public void setactivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

	public void setsourceProduct(String sourceProduct) {
		this.sourceProduct = sourceProduct;
	}

	public void settargetProduct(String targetProduct) {
		this.targetProduct = targetProduct;
	}

	public void setinternetRatePlan(String internetRatePlan) {
		this.internetRatePlan = internetRatePlan;
	}

	public void settvRatePlan(String tvRatePlan) {
		this.tvRatePlan = tvRatePlan;
	}

	public void setphoneRatePlan(String phoneRatePlan) {
		this.phoneRatePlan = phoneRatePlan;
	}

	public void setoptionName1(String optionName1) {
		this.optionName1 = optionName1;
	}

	public void setoptionName2(String optionName2) {
		this.optionName2 = optionName2;
	}

	public void setoptionName3(String optionName3) {
		this.optionName3 = optionName3;
	}

	public void setdiscountName(String discountName) {
		this.discountName = discountName;
	}

	public void setdiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public void setdiscountDuration(String discountDuration) {
		this.discountDuration = discountDuration;
	}

	public void setdata1(String data1) {
		this.data1 = data1;
	}

	public void setdata2(String data2) {
		this.data2 = data2;
	}

	public void setdata3(String data3) {
		this.data3 = data3;
	}

	public void setmigrationStatus(String migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public void setmigrationStage(String migrationStage) {
		this.migrationStage = migrationStage;
	}

	public void setorderId(String orderId) {
		this.orderId = orderId;
	}

	public void setfailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public void setmigrationPostponeCounter(String migrationPostponeCounter) {
		this.migrationPostponeCounter = migrationPostponeCounter;
	}

	public void setotoUpdateCounter(String otoUpdateCounter) {
		this.otoUpdateCounter = otoUpdateCounter;
	}
	
    /** ******************************************************************
     * GETTERS
     **********************************************************************/

	public String getSiteId() {
		return siteId;
	}

	public String getProductSerial() {
		return productSerial;
	}

	public String getOtoId() {
		return otoId;
	}

	public String getPrio1Access() {
		return prio1Access;
	}

	public String getPrio2Access() {
		return prio2Access;
	}

	public String getMigrationScenario() {
		return migrationScenario;
	}

	public String getActivationDate() {
		return activationDate;
	}

	public String getSourceProduct() {
		return sourceProduct;
	}

	public String getTargetProduct() {
		return targetProduct;
	}

	public String getInternetRatePlan() {
		return internetRatePlan;
	}

	public String getTvRatePlan() {
		return tvRatePlan;
	}

	public String getPhoneRatePlan() {
		return phoneRatePlan;
	}

	public String getOptionName1() {
		return optionName1;
	}

	public String getOptionName2() {
		return optionName2;
	}

	public String getOptionName3() {
		return optionName3;
	}

	public String getDiscountName() {
		return discountName;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public String getDiscountDuration() {
		return discountDuration;
	}

	public String getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public String getData3() {
		return data3;
	}

	public String getMigrationStatus() {
		return migrationStatus;
	}

	public String getMigrationStage() {
		return migrationStage;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public String getMigrationPostponeCounter() {
		return migrationPostponeCounter;
	}

	public String getOtoUpdateCounter() {
		return otoUpdateCounter;
	}
 

}

