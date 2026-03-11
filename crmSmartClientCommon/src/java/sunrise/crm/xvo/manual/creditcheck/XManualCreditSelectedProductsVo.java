package sunrise.crm.xvo.manual.creditcheck;

import java.math.BigDecimal;

public class XManualCreditSelectedProductsVo {
	
	private BigDecimal quantity;
	private String ratePlan;
	private String description;
	private String existingNew;
	private BigDecimal totalPrice;
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public String getRatePlan() {
		return ratePlan;
	}
	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExistingNew() {
		return existingNew;
	}
	public void setExistingNew(String existingNew) {
		this.existingNew = existingNew;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "XManualCreditSelectedProductsVo [quantity=" + quantity + ", ratePlan=" + ratePlan + ", description="
				+ description + ", existingNew=" + existingNew + ", totalPrice=" + totalPrice + "]";
	}
	
	
}
