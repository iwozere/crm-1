package sunrise.crm.order.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Main Orbit related object. Used at the moment only by Pricing Engine calls.
 * 
 * @author Kosyrev
 * @version R26.1 720577
 *
 */
public class OrbitInfoDto {
	//base_types:BudgetDetailsType - budget details are not included. Assumption is that this information is already in OrbitBudgetDto
	private OrbitBudgetDto orbitBudget = null;
	//private List<OrbitDiscountDto> orbitDiscounts = new ArrayList<>();

	public OrbitBudgetDto getOrbitBudget() {
		return orbitBudget;
	}
	public void setOrbitBudget(OrbitBudgetDto orbitBudget) {
		this.orbitBudget = orbitBudget;
	}
//	public List<OrbitDiscountDto> getOrbitDiscounts() {
//		return orbitDiscounts;
//	}
//	public void setOrbitDiscounts(List<OrbitDiscountDto> orbitDiscounts) {
//		this.orbitDiscounts = orbitDiscounts;
//	}
}
