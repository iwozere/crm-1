package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;
import java.util.Objects;

public class BillingItemInfoVo {

    private static Log log = LogFactory.getLog(BillingItemInfoVo.class);

    private int componentId;
    private int packageId;
    private int componentType;
    private BigDecimal amount = BigDecimal.ZERO;
    private String uomType;
	private String rateDescription = null;
    private BigDecimal monetaryAmount = BigDecimal.ZERO;

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getRateDescription() {
		return rateDescription;
	}

	public void setRateDescription(String rateDescription) {
		this.rateDescription = rateDescription;
	}

	public BigDecimal getMonetaryAmount() {
		return monetaryAmount;
	}

	public void setMonetaryAmount(BigDecimal monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}

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

    public BillingItemInfoVo() {
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public BillingItemInfoVo(BillingItemInfoVo billingItemInfoVo) {
        this.componentId = billingItemInfoVo.componentId;
        this.packageId = billingItemInfoVo.packageId;
        this.componentType = billingItemInfoVo.componentType;
        this.amount = BigDecimal.ZERO.add(billingItemInfoVo.amount);
        this.rateDescription = billingItemInfoVo.rateDescription;
        this.monetaryAmount = BigDecimal.ZERO.add(billingItemInfoVo.monetaryAmount);
        this.uomType = billingItemInfoVo.uomType;
    }

	@Override
	public String toString() {
		return "BillingItemInfoVo [componentId=" + componentId + ", packageId=" + packageId + ", componentType=" + componentType + ", amount=" + amount + ", uomType=" + uomType + ", rateDescription="
				+ rateDescription + ", monetaryAmount=" + monetaryAmount + "]";
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillingItemInfoVo billingItemInfoVo = (BillingItemInfoVo) o;

        if (!Objects.equals(this.componentId, billingItemInfoVo.componentId)) {
            return false;
        }
        if (!Objects.equals(this.packageId, billingItemInfoVo.packageId)) {
            return false;
        }
        if (!Objects.equals(this.componentType, billingItemInfoVo.componentType)) {
            return false;
        }
        if (!Objects.equals(this.amount, billingItemInfoVo.amount)) {
            return false;
        }
        if (!Objects.equals(this.uomType, billingItemInfoVo.uomType)) {
            return false;
        }
        if (!Objects.equals(this.rateDescription, billingItemInfoVo.rateDescription)) {
            return false;
        }
        if (!Objects.equals(this.monetaryAmount, billingItemInfoVo.monetaryAmount)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, packageId, componentType, amount, uomType, rateDescription, monetaryAmount);
    }
}
