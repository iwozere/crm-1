package sunrise.crm.isales.order.capture;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalesCampaignProductDto {

	private String segment;
	private String partNumber;
	private BigDecimal recurringDiscount;
	private boolean suppressSunriseAdvantage;
	private List<SalesCampaignProductDiscountDto> discounts = new ArrayList<>();
	
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public List<SalesCampaignProductDiscountDto> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(List<SalesCampaignProductDiscountDto> discounts) {
		this.discounts = discounts;
	}
	/**
	 * Sum of all RP RC discounts for this product from the particular promo.
	 * @return
	 */
	public BigDecimal getRecurringDiscount() {
		return recurringDiscount;
	}
	/**
	 * Sum of all RP RC discounts for this product from the particular promo.
	 * @param recurringDiscount
	 */
	public void setRecurringDiscount(BigDecimal recurringDiscount) {
		this.recurringDiscount = recurringDiscount;
	}
	/**
	 * Whether this promo will suppress Sunrise Advantage or not.
	 * @return
	 */
	public boolean isSuppressSunriseAdvantage() {
		return suppressSunriseAdvantage;
	}
	/**
	 * Whether this promo will suppress Sunrise Advantage or not.
	 * @param suppressSunriseAdvantage
	 */
	public void setSuppressSunriseAdvantage(boolean suppressSunriseAdvantage) {
		this.suppressSunriseAdvantage = suppressSunriseAdvantage;
	}
	@Override
	public String toString() {
		return "SalesCampaignProductDto [segment=" + segment + ", partNumber=" + partNumber + ", recurringDiscount="
				+ recurringDiscount + ", suppressSunriseAdvantage=" + suppressSunriseAdvantage + ", discounts="
				+ discounts + "]";
	}
}
