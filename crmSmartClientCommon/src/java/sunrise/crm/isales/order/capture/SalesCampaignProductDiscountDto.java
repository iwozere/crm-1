package sunrise.crm.isales.order.capture;

import sunrise.crm.domain.enums.PartClassification;

import java.math.BigDecimal;
import java.util.Arrays;

public class SalesCampaignProductDiscountDto {
	
	private String amountName;
	private String amountUOM;
	private String amountValue;
	private String durationName;
	private String durationUOM;
	private String durationValue;
	private SalesDiscountType discountType; // RP OC DISCOUNT, RP RC DISCOUNT, OPTION, OPTION RC DISCOUNT
	

	private String recurringChargeString;
	private String recurringDiscountAmount;
	private String oneTimeDiscountAmount;
	private String partNumber;
	private String groupId;
	
	
	private BigDecimal oneTimeCharge;
	private BigDecimal recurringCharge;
	private BigDecimal oneTimeDiscount;
	private BigDecimal recurringDiscount;


	private String sapMaterialId;
	private String[] sapMaterialIds;

	private String chargePartNumber;
	private String chargePartClassification;

	/**
	 * Value, configured by business in FB framework, plain text. Used for OA/OC. AKA Landing price.
	 * @return
	 */
	public String getRecurringChargeString() {
		return recurringChargeString;
	}
	
	/**
	 * Value, configured by business in FB framework, plain text. Used for OA/OC. AKA Landing price.
	 * @param recurringCharge
	 */
	public void setRecurringChargeString(String recurringCharge) {
		this.recurringChargeString = recurringCharge;
	}
	
	/**
	 * Value, configured by business in FB framework, plain text. Used for OA/OC.
	 * @return
	 */
	public String getRecurringDiscountAmount() {
		return recurringDiscountAmount;
	}
	
	/**
	 * Value, configured by business in FB framework, plain text. Used for OA/OC.
	 * @param recurringDiscountAmount
	 */
	public void setRecurringDiscountAmount(String recurringDiscountAmount) {
		this.recurringDiscountAmount = recurringDiscountAmount;
	}
	
	/**
	 * Value, configured by business in FB framework, plain text. Used for OA/OC.
	 * @return
	 */
	public String getOneTimeDiscountAmount() {
		return oneTimeDiscountAmount;
	}
	
	/**
	 * Value, configured by business in FB framework, plain text. Used for OA/OC.
	 * @param oneTimeDiscountAmount
	 */
	public void setOneTimeDiscountAmount(String oneTimeDiscountAmount) {
		this.oneTimeDiscountAmount = oneTimeDiscountAmount;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	/**
	 * One Time Discount Amount. Calculated based on the campaign configuration and product configuration. Set from outside.
	 * @return
	 */
	public BigDecimal getOneTimeDiscount() {
		return oneTimeDiscount;
	}

	/**
	 * Recurring Discount Amount. Calculated based on the campaign configuration and product configuration. Set from outside.
	 * @return
	 */
	public BigDecimal getRecurringDiscount() {
		return recurringDiscount;
	}

	/**
	 * One Time Discount Amount. Calculated based on the campaign configuration and product configuration. Set from outside.
	 * @return
	 */
	public void setOneTimeDiscount(BigDecimal oneTimeDiscount) {
		this.oneTimeDiscount = oneTimeDiscount;
	}

	/**
	 * Recurring Discount Amount. Calculated based on the campaign configuration and product configuration. Set from outside.
	 * @return
	 */
	public void setRecurringDiscount(BigDecimal recurringDiscount) {
		this.recurringDiscount = recurringDiscount;
	}

	
	public String getAmountName() {
		return amountName;
	}

	public void setAmountName(String amountName) {
		this.amountName = amountName;
	}

	public String getAmountUOM() {
		return amountUOM;
	}

	public void setAmountUOM(String amountUOM) {
		this.amountUOM = amountUOM;
	}

	public String getAmountValue() {
		return amountValue;
	}

	public void setAmountValue(String amountValue) {
		this.amountValue = amountValue;
	}

	public String getDurationName() {
		return durationName;
	}

	public void setDurationName(String durationName) {
		this.durationName = durationName;
	}

	public String getDurationUOM() {
		return durationUOM;
	}

	public void setDurationUOM(String durationUOM) {
		this.durationUOM = durationUOM;
	}

	public String getDurationValue() {
		return durationValue;
	}

	public void setDurationValue(String durationValue) {
		this.durationValue = durationValue;
	}

	
	public SalesDiscountType getDiscountType() {
		return discountType;
	}

	public void setDiscountType(SalesDiscountType discountType) {
		this.discountType = discountType;
	}

	/**
	 * Parent option/product one time fee.
	 * @return
	 */
	public BigDecimal getOneTimeCharge() {
		return oneTimeCharge;
	}

	/**
	 * Parent option/product one time fee.
	 * @param oneTimeAmount
	 */
	public void setOneTimeCharge(BigDecimal oneTimeAmount) {
		this.oneTimeCharge = oneTimeAmount;
	}

	/**
	 * Parent option/product monthly fee.
	 * @return
	 */
	public BigDecimal getRecurringCharge() {
		return recurringCharge;
	}

	/**
	 * Parent option/product monthly fee.
	 * @param recurringAmount
	 */
	public void setRecurringCharge(BigDecimal recurringAmount) {
		this.recurringCharge = recurringAmount;
	}

	public String[] getSapMaterialIds() {
		return sapMaterialIds;
	}

	public void setSapMaterialIds(String[] sapMaterialIds) {
		this.sapMaterialIds = sapMaterialIds;
	}

	public String getSapMaterialId() {
		return sapMaterialId;
	}

	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}

	public String getChargePartNumber() {
		return chargePartNumber;
	}

	public void setChargePartNumber(String chargePartNumber) {
		this.chargePartNumber = chargePartNumber;
	}

	public String getChargePartClassification() {
		return chargePartClassification;
	}

	public void setChargePartClassification(String chargePartClassification) {
		this.chargePartClassification = chargePartClassification;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "SalesCampaignProductDiscountDto [amountName=" + amountName + ", amountUOM=" + amountUOM
				+ ", amountValue=" + amountValue + ", durationName=" + durationName + ", durationUOM=" + durationUOM
				+ ", durationValue=" + durationValue + ", discountType=" + discountType + ", recurringCharge="
				+ recurringChargeString + ", recurringDiscountAmount=" + recurringDiscountAmount + ", oneTimeDiscountAmount="
				+ oneTimeDiscountAmount + ", partNumber=" + partNumber + ", oneTimeAmount=" + oneTimeCharge
				+ ", recurringAmount=" + recurringCharge + ", oneTimeDiscount=" + oneTimeDiscount + ", groupId=" + groupId
				+ ", recurringDiscount=" + recurringDiscount + ", sapMaterialId=" + sapMaterialId + ", chargePartNumber=" + chargePartNumber + ", chargePartClassification=" + chargePartClassification + "]";
	}

}
