package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = 1, name = XConstants.OTT_MASS_MIGRATION_DATA)
public class XOttMassMigrationData {
	
    @XColumn(id = 0, required = true)
    public String siteId;

    @XColumn(id = 1)
    public String productSerial;
    
    @XColumn(id = 2)
    public String loginName;

    @XColumn(id = 3)
    public String sourceProduct;
    
    @XColumn(id = 4)
    public String targetProduct;

    @XColumn(id = 5)
    public String targetOttRpName;
 
    @XColumn(id = 6)
    public String migrationDate;
    
    @XColumn(id = 7)
    public String migrationScenario;
    
    @XColumn(id = 8)
    public String discountName;
    
    @XColumn(id = 9)
    public String discountAmount;
    
    @XColumn(id = 10)
    public String discountDuration;
    
    @XColumn(id = 11)
    public String discountType;

    
    // Only OUT Params
    
    public String migrationStatus;
    
    public String migrationStage;
    
    public String orderId;
    
    public String failureReason;
    
    /** ******************************************************************
     * SETTERS 
     **********************************************************************/

	public void setsiteId(String siteId) {
		this.siteId = siteId;
	}

	public void setproductSerial(String productSerial) {
		this.productSerial = productSerial;
	}

	public void setloginName(String loginName) {
		this.loginName = loginName;
	}

	public void setsourceProduct(String sourceProduct) {
		this.sourceProduct = sourceProduct;
	}

	public void settargetProduct(String targetProduct) {
		this.targetProduct = targetProduct;
	}

	public void settargetOttRpName(String targetOttRpName) {
		this.targetOttRpName = targetOttRpName;
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
	
	/** ******************************************************************
     * GETTERS 
     **********************************************************************/

	public String getSiteId() {
		return siteId;
	}

	public String getProductSerial() {
		return productSerial;
	}
	
	public String getLoginName() {
		return loginName;
	}

	public String getSourceProduct() {
		return sourceProduct;
	}

	public String getTargetProduct() {
		return targetProduct;
	}

	public String getTargetOttRpName() {
		return targetOttRpName;
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

}
