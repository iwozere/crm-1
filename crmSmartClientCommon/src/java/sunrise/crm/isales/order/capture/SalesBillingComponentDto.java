package sunrise.crm.isales.order.capture;

import java.math.BigDecimal;

public class SalesBillingComponentDto {
	private int componentId;
	private int componentType;
	private BigDecimal amount = BigDecimal.ZERO;
	
	public int getComponentId() {
		return componentId;
	}
	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}
	public int getComponentType() {
		return componentType;
	}
	public void setComponentType(int componentType) {
		this.componentType = componentType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "SalesBillingComponentDto [componentId=" + componentId + ", componentType=" + componentType + ", amount="
				+ amount + "]";
	}
}
