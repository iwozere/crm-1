package sunrise.crm.isales.order.capture;

import com.google.gson.Gson;
import sunrise.crm.xvo.product.ProductOptionInfoVo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeBenefitInformationDto {
    private String benefitName;
    private int maxAllowance;
    private List<String> activeProductBenefits = new ArrayList<>();
    private List<BenefitParentInformationDto> parents = new ArrayList<>();
    private int usedAllowances;
    private String uom;
    private BigDecimal amount; // Amount in UOM
	private String suppressType;
	private List<BenefitProductDto> products = new ArrayList<>();
	private Map<String, List<ProductOptionInfoVo>> ineligibleProductBenefits = new HashMap<>();

	/**
	 * List of products, where benefit is already installed or can be installed.
	 */
	public List<BenefitProductDto> getProducts() {
		return products;
	}

	public void setProducts(List<BenefitProductDto> products) {
		this.products = products;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public int getUsedAllowances() {
		return usedAllowances;
	}

	public void setUsedAllowances(int usedAllowances) {
		this.usedAllowances = usedAllowances;
	}

	public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public List<String> getActiveProductBenefits() {
        return activeProductBenefits;
    }

    public void setActiveProductBenefits(List<String> activeProductBenefits) {
        this.activeProductBenefits = activeProductBenefits;
    }

    public int getMaxAllowance() {
        return maxAllowance;
    }

    public void setMaxAllowance(int maxAllowance) {
        this.maxAllowance = maxAllowance;
    }

	public List<BenefitParentInformationDto> getParents() {
		return parents;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	public void addParent(BenefitParentInformationDto benefitParentInformationDto) {
		parents.add(benefitParentInformationDto);
	}

	public void setSuppressType(String suppressType) {
		this.suppressType = suppressType;
	}

	public String getSuppressType() {
		return suppressType;
	}

	public Map<String, List<ProductOptionInfoVo>> getIneligibleProductBenefits() {
		return ineligibleProductBenefits;
	}

}
