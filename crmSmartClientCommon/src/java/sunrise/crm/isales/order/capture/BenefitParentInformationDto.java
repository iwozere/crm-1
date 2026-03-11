package sunrise.crm.isales.order.capture;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class BenefitParentInformationDto {

	private BigDecimal discountAmount; //Amount in CHF
	private BigDecimal baseFee;
	private String parentOption;

	public BenefitParentInformationDto() {
	}

	public BenefitParentInformationDto(BigDecimal discountAmount, BigDecimal baseFee, String parentOption) {
		this.discountAmount = discountAmount;
		this.baseFee = baseFee;
		this.parentOption = parentOption;
	}

	public String getParentOption() {
		return parentOption;
	}

	public void setParentOption(String parentOption) {
		this.parentOption = parentOption;
	}

	public BigDecimal getBaseFee() {
		return baseFee;
	}

	public void setBaseFee(BigDecimal baseFee) {
		this.baseFee = baseFee;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
