package sunrise.crm.xvo.product;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class XScheduledCeaseOrderVo {

        private String ipObjid;                // table_contract.objid 
        private String contractId;             // The IP-Contract ID
        private java.util.Date expiryDate;
        private java.util.Date ceaseWishDate;
        private String firstName;
        private String lastName;
        private String title;
        private String serialNo;
        private String parentSerialNo;
        private String instanceName;
        private String productName;
        private String productType;
        private String rollover;
        private BigDecimal productEtf;
        private BigDecimal optionEtf;
        private BigDecimal devicePlanEtf;
        private BigDecimal bindingPromoViolationEtf;
		private String reason;
        private String pendingOrderInfo;
        private boolean selected;
        private java.util.Date ceaseWishDateRAT;
        private int duration;
        private String hwOption;
        private String multiSave;
        private String ceaseOption;
        private String[] ceaseOptions;
        private String ceaseOrderStatus;
        
        //Added for CR#31042
        private String etfFlag;
        private String ceaseLetterFlag;
        private String billCorectionFlag;
        
        private boolean relevantActivationOrderPending = false;
        private Boolean childAutoMigrate = true;
        private Boolean childAutoMigrateEnabled = false;
        
        //Added for CR#31325
        private Boolean childHandlingEnabled = true;
        private String  childHandlingOption;
        private String[]  childHandlingOptions;
        
        //Added for CR32200
        private Boolean altCommFlag = Boolean.FALSE;
        private Boolean altCommEnabled = Boolean.FALSE;
        private String[] altMobileNumbers;
        
        private String relatedCaseID;
        private String productEtfCalculationInfo;
        private String optionEtfCalculationInfo;
        private String deviceEtfCalculationInfo;
        
        private String productBudgetInfo;

		// CR 33489
        private Date accessCeaseWishDate;
        
        private Boolean hasAcceptedOutport;
        private Boolean hasOpenCeaseOrder;


        //CR 638113

		private String productFamily;

		private Boolean isBcsCase = Boolean.FALSE;
		
		private String ceaseType;
		
		private String xPartSubstatus;			//708406
		
	
        // *************************************************************************
        // CONSTRUCTOR
        // *************************************************************************

		public XScheduledCeaseOrderVo(){}
        
        // ***************************
        // *** Setters and getters ***
        // ***************************
        
		public void setIpObjid(String ipObjid) {
			this.ipObjid = ipObjid;
		}

		public String getIpObjid() {
			return ipObjid;
		}

		public void setContractId(String contractId) {
			this.contractId = contractId;
		}

		public String getContractId() {
			return contractId;
		}

		public void setExpiryDate(java.util.Date expiryDate) {
			this.expiryDate = expiryDate;
		}

		public java.util.Date getExpiryDate() {
			return expiryDate;
		}

		public void setCeaseWishDate(java.util.Date ceaseWishDate) {
			this.ceaseWishDate = ceaseWishDate;
		}

		public java.util.Date getCeaseWishDate() {
			return ceaseWishDate;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}

		public String getSerialNo() {
			return serialNo;
		}

		/**
		 * @param parentSerialNo the parentSerialNo to set
		 */
		public void setParentSerialNo(String parentSerialNo) {
			this.parentSerialNo = parentSerialNo;
		}

		/**
		 * @return the parentSerialNo
		 */
		public String getParentSerialNo() {
			return parentSerialNo;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceName() {
			return instanceName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductType(String productType) {
			this.productType = productType;
		}

		public String getProductType() {
			return productType;
		}

		public void setRollover(String rollover) {
			this.rollover = rollover;
		}

		public String getRollover() {
			return rollover;
		}

		public void setProductEtf(BigDecimal productEtf) {
			this.productEtf = productEtf;
		}

		public BigDecimal getProductEtf() {
			return productEtf;
		}

		public void setOptionEtf(BigDecimal optionEtf) {
			this.optionEtf = optionEtf;
		}

		public BigDecimal getOptionEtf() {
			return optionEtf;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getReason() {
			return reason;
		}

		public void setPendingOrderInfo(String pendingOrderInfo) {
			this.pendingOrderInfo = pendingOrderInfo;
		}

		public String getPendingOrderInfo() {
			return pendingOrderInfo;
		}

		public void setDevicePlanEtf(BigDecimal devicePlanEtf) {
			this.devicePlanEtf = devicePlanEtf;
		}

		public BigDecimal getDevicePlanEtf() {
			return devicePlanEtf;
		}

		public void setSelected(boolean selected) {
			this.selected = selected;
		}

		public boolean isSelected() {
			return selected;
		}

		public java.util.Date getCeaseWishDateRAT() {
			return ceaseWishDateRAT;
		}

		public void setCeaseWishDateRAT(java.util.Date ceaseWishDateRAT) {
			this.ceaseWishDateRAT = ceaseWishDateRAT;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public String getHwOption() {
			return hwOption;
		}

		public void setHwOption(String hwOption) {
			this.hwOption = hwOption;
		}

		public String getMultiSave() {
			return multiSave;
		}

		public void setMultiSave(String multiSave) {
			this.multiSave = multiSave;
		}
		
		public String[] getCeaseOptions() {
			return ceaseOptions;
		}

		public void setCeaseOptions(String[] ceaseOptions) {
			this.ceaseOptions = ceaseOptions;
		}
		
		public String getCeaseOption() {
			return ceaseOption;
		}

		public void setCeaseOption(String ceaseOption) {
			this.ceaseOption = ceaseOption;
		}

		public String getCeaseOrderStatus() {
			return ceaseOrderStatus;
		}

		public void setCeaseOrderStatus(String ceaseOrderStatus) {
			this.ceaseOrderStatus = ceaseOrderStatus;
		}

        public String getEtfFlag() {
			return etfFlag;
		}

		public void setEtfFlag(String etfFlag) {
			this.etfFlag = etfFlag;
		}

		public String getCeaseLetterFlag() {
			return ceaseLetterFlag;
		}

		public void setCeaseLetterFlag(String ceaseLetterFlag) {
			this.ceaseLetterFlag = ceaseLetterFlag;
		}

		public String getBillCorectionFlag() {
			return billCorectionFlag;
		}

		public void setBillCorectionFlag(String billCorectionFlag) {
			this.billCorectionFlag = billCorectionFlag;
		}
		
		//End here

		@Override
		public String toString() {
/*			return "XScheduledCeaseOrderVo [ipObjid=" + ipObjid
					+ ", contractId=" + contractId + ", expiryDate="
					+ expiryDate + ", ceaseWishDate=" + ceaseWishDate
					+ ", firstName=" + firstName + ", lastName=" + lastName
					+ ", title=" + title + ", serialNo=" + serialNo
					+ ", instanceName=" + instanceName + ", productName="
					+ productName + ", productType=" + productType
					+ ", rollover=" + rollover + ", productEtf=" + productEtf
					+ ", optionEtf=" + optionEtf + ", devicePlanEtf="
					+ devicePlanEtf + ", reason=" + reason
					+ ", pendingOrderInfo=" + pendingOrderInfo + ", selected="
					+ selected + ", ceaseWishDateRAT=" + ceaseWishDateRAT
					+ ", duration=" + duration + ", hwOption=" + hwOption
					+ ", multiSave=" + multiSave + ", ceaseOption="
					+ ceaseOption + "], ceaseOrderStatus="+ceaseOrderStatus
					+ ", etfFlag= " + etfFlag + " ], ceaseLetterFlag= "
					+ceaseLetterFlag + "], billCorectionFlag= "+billCorectionFlag;*/
			return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
        
		}

		public void setRelevantActivationOrderPending(
				boolean relevantActivationOrderPending) {
			this.relevantActivationOrderPending = relevantActivationOrderPending;
		}

		public boolean isRelevantActivationOrderPending() {
			return relevantActivationOrderPending;
		}

		/**
		 * @return the childAutoMigrate
		 */
		public Boolean getChildAutoMigrate() {
			return childAutoMigrate;
		}

		/**
		 * @param childAutoMigrate the childAutoMigrate to set
		 */
		public void setChildAutoMigrate(Boolean childAutoMigrate) {
			this.childAutoMigrate = childAutoMigrate;
		}

		/**
		 * @return the childAutoMigrateEnabled
		 */
		public Boolean getChildAutoMigrateEnabled() {
			return childAutoMigrateEnabled;
		}

		/**
		 * @param childAutoMigrateEnabled the childAutoMigrateEnabled to set
		 */
		public void setChildAutoMigrateEnabled(Boolean childAutoMigrateEnabled) {
			this.childAutoMigrateEnabled = childAutoMigrateEnabled;
		}

		/**
		 * @return the childHandlingEnabled
		 */
		public Boolean getChildHandlingEnabled() {
			return childHandlingEnabled;
		}

		/**
		 * @param childHandlingEnabled the childHandlingEnabled to set
		 */
		public void setChildHandlingEnabled(Boolean childHandlingEnabled) {
			this.childHandlingEnabled = childHandlingEnabled;
		}

		/**
		 * @return the childHandlingOption
		 */
		public String getChildHandlingOption() {
			return childHandlingOption;
		}

		/**
		 * @param childHandlingOption the childHandlingOption to set
		 */
		public void setChildHandlingOption(String childHandlingOption) {
			this.childHandlingOption = childHandlingOption;
		}

		/**
		 * @return the childHandlingOptions
		 */
		public String[] getChildHandlingOptions() {
			return childHandlingOptions;
		}

		/**
		 * @param childHandlingOptions the childHandlingOptions to set
		 */
		public void setChildHandlingOptions(String[] childHandlingOptions) {
			this.childHandlingOptions = childHandlingOptions;
		}

		public Boolean getAltCommFlag() {
			return altCommFlag;
		}

		public void setAltCommFlag(Boolean altCommFlag) {
			this.altCommFlag = altCommFlag;
		}

		public Boolean getAltCommEnabled() {
			return altCommEnabled;
		}

		public void setAltCommEnabled(Boolean altCommEnabled) {
			this.altCommEnabled = altCommEnabled;
		}

		public String[] getAltMobileNumbers() {
			return altMobileNumbers;
		}

		public void setAltMobileNumbers(String[] altMobileNumbers) {
			this.altMobileNumbers = altMobileNumbers;
		}

		public String getRelatedCaseID() {
			return relatedCaseID;
		}

		public void setRelatedCaseID(String relatedCaseID) {
			this.relatedCaseID = relatedCaseID;
		}

		public String getProductEtfCalculationInfo() {
			return productEtfCalculationInfo;
		}

		public void setProductEtfCalculationInfo(String productEtfCalculationInfo) {
			this.productEtfCalculationInfo = productEtfCalculationInfo;
		}
		
		public String getOptionEtfCalculationInfo() {
			return optionEtfCalculationInfo;
		}

		public void setOptionEtfCalculationInfo(String optionEtfCalculationInfo) {
			this.optionEtfCalculationInfo = optionEtfCalculationInfo;
		}

		public String getDeviceEtfCalculationInfo() {
			return deviceEtfCalculationInfo;
		}

		public void setDeviceEtfCalculationInfo(String deviceEtfCalculationInfo) {
			this.deviceEtfCalculationInfo = deviceEtfCalculationInfo;
		}

		public BigDecimal getBindingPromoViolationEtf() {
			return bindingPromoViolationEtf;
		}
 
		public void setBindingPromoViolationEtf(BigDecimal bindingPromoViolationEtf) {
			this.bindingPromoViolationEtf = bindingPromoViolationEtf;
		}
		// CR 33489
        public Date getAccessCeaseWishDate() {
            return accessCeaseWishDate;
        }
 
        public void setAccessCeaseWishDate(Date accessCeaseWishDate) {
            this.accessCeaseWishDate = accessCeaseWishDate;
        }
        
        public String getProductBudgetInfo() {
			return productBudgetInfo;
		}

		public void setProductBudgetInfo(String productBudgetInfo) {
			this.productBudgetInfo = productBudgetInfo;
		}

		public void setHasAcceptedOutport(Boolean hasAcceptedOutport) {
			this.hasAcceptedOutport = hasAcceptedOutport;
		}
		
		public Boolean getHasAcceptedOutport() {
			return hasAcceptedOutport;
		}
		
		public Boolean getHasOpenCeaseOrder() {
			return hasOpenCeaseOrder; 
		}

		public void setHasOpenCeaseOrder(Boolean hasOpenCeaseOrder) {
			this.hasOpenCeaseOrder = hasOpenCeaseOrder;
		}
		
		public Boolean getBcsCase() {
			return isBcsCase;
		}

		public void setBcsCase(Boolean bcsCase) {
			isBcsCase = bcsCase;
		}

		public String getProductFamily() {return productFamily;}

		public void setProductFamily(String productFamily) {this.productFamily = productFamily;}

		public String getCeaseType() {
			return ceaseType;
		}

		public void setCeaseType(String ceaseType) {
			this.ceaseType = ceaseType;
		}
		// start | 708406
		public String getXPartSubstatus() {
			return xPartSubstatus;
		}

		public void setXPartSubstatus(String xPartSubstatus) {
			this.xPartSubstatus = xPartSubstatus;
		}
		// end | 708406

}