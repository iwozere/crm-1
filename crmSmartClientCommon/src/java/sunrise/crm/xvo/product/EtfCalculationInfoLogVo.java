package sunrise.crm.xvo.product;

import java.math.BigDecimal;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class EtfCalculationInfoLogVo {

	private String calculationType = "NEW";
	private BigDecimal monthlyRecurringCharge;
	private String monthlyRecurringChargeDetail;
	private Integer numberOfFullMonthsTillEarliestTermDate;
	//the difference between the two below is:
	//numberOfLeftOverDaysTillEarliestTermDate is used in the NEW method, calculated after full months are calculated
	private Integer numberOfLeftOverDaysTillEarliestTermDate;
	//numberOfDaysTillEarliestTermDate is used in the OLD method, no full month calculation, the date between wishdate and zero EFT date
	private Integer numberOfDaysTillEarliestTermDate;
	private BigDecimal adminFee;
	private BigDecimal discAdjustmentOnEtf;
	private String discAdjustmentOnEtfReason;
	private BigDecimal bindingPromoAdjustmentOnEtf;
	private String bindingPromoAdjustmentOnEtfReason;
	private String remainingDiscountOnEtf;
    private String remainingDiscountOnEtfReason;
    private BigDecimal promoHardwareEtf;
    private BigDecimal promoCashbackEtf;

	//in some cases, the total product ETF includes a separately calculated TV service ETF
	//for this, we do not provide a separate nested breakdown now but we just display the value
	private BigDecimal tvServiceETF;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE, true,
				EtfCalculationInfoLogVo.class);
	}
	
	public BigDecimal getTVServiceETF() {
		return tvServiceETF;
	}


	public void setTVServiceETF(BigDecimal tvServiceETF) {
		this.tvServiceETF = tvServiceETF;
	}


	public String getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}

	public String getMonthlyRecurringChargeDetail() {
		return monthlyRecurringChargeDetail;
	}

	public void setMonthlyRecurringChargeDetail(String monthlyRecurringChargeDetail) {
		this.monthlyRecurringChargeDetail = monthlyRecurringChargeDetail;
	}

	public BigDecimal getMonthlyRecurringChange() {
		return monthlyRecurringCharge;
	}

	public void setMonthlyRecurringCharge(BigDecimal monthlyRecurringCharge) {
		this.monthlyRecurringCharge = monthlyRecurringCharge;
	}

	public Integer getNumberOfFullMonthsTillEarliestTermDate() {
		return numberOfFullMonthsTillEarliestTermDate;
	}

	public void setNumberOfFullMonthsTillEarliestTermDate(Integer numberOfFullMonthsTillEarliestTermDate) {
		this.numberOfFullMonthsTillEarliestTermDate = numberOfFullMonthsTillEarliestTermDate;
	}

	public Integer getNumberOfLeftOverDaysTillEarliestTermDate() {
		return numberOfLeftOverDaysTillEarliestTermDate;
	}

	public void setNumberOfLeftOverDaysTillEarliestTermDate(Integer numberOfLeftOverDaysTillEarliestTermDate) {
		this.numberOfLeftOverDaysTillEarliestTermDate = numberOfLeftOverDaysTillEarliestTermDate;
	}

	
	public Integer getNumberOfDaysTillEarliestTermDate() {
		return numberOfDaysTillEarliestTermDate;
	}

	public void setNumberOfDaysTillEarliestTermDate(Integer numberOfDaysTillEarliestTermDate) {
		this.numberOfDaysTillEarliestTermDate = numberOfDaysTillEarliestTermDate;
	}

	public BigDecimal getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(BigDecimal adminFee) {
		this.adminFee = adminFee;
	}

	public BigDecimal getDiscAdjustmentOnEtf() {
		return discAdjustmentOnEtf;
	}

	public void setDiscAdjustmentOnEtf(BigDecimal adjustmentOnEtf) {
		this.discAdjustmentOnEtf = adjustmentOnEtf;
	}

	public String getDiscAdjustmentOnEtfReason() {
		return discAdjustmentOnEtfReason;
	}

	public void setDiscAdjustmentOnEtfReason(String adjustmentOnEtfReason) {
		this.discAdjustmentOnEtfReason = adjustmentOnEtfReason;
	}

	public BigDecimal getBindingPromoAdjustmentOnEtf() {
		return bindingPromoAdjustmentOnEtf;
	}

	public void setBindingPromoAdjustmentOnEtf(BigDecimal bindingPromoAdjustmentOnEtf) {
		this.bindingPromoAdjustmentOnEtf = bindingPromoAdjustmentOnEtf;
	}

	public String getBindingPromoAdjustmentOnEtfReason() {
		return bindingPromoAdjustmentOnEtfReason;
	}

	public void setBindingPromoAdjustmentOnEtfReason(String bindingPromoAdjustmentOnEtfReason) {
		this.bindingPromoAdjustmentOnEtfReason = bindingPromoAdjustmentOnEtfReason;
	}

	public String getRemainingDiscountOnEtf() {
		return remainingDiscountOnEtf;
	}

	public void setRemainingDiscountOnEtf(String remainingDiscountOnEtf) {
		this.remainingDiscountOnEtf = remainingDiscountOnEtf;
	}

	public String getRemainingDiscountOnEtfReason() {
		return remainingDiscountOnEtfReason;
	}

	public void setRemainingDiscountOnEtfReason(String remainingDiscountOnEtfReason) {
		this.remainingDiscountOnEtfReason = remainingDiscountOnEtfReason;
	}

	public BigDecimal getPromoHardwareEtf() {
		return promoHardwareEtf;
	}

	public void setPromoHardwareEtf(BigDecimal promoHardwareEtf) {
		this.promoHardwareEtf = promoHardwareEtf;
	}

	public BigDecimal getPromoCashbackEtf() {
		return promoCashbackEtf;
	}

	public void setPromoCashbackEtf(BigDecimal promoCashbackEtf) {
		this.promoCashbackEtf = promoCashbackEtf;
	}
}
