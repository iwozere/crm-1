package sunrise.crm.order.dto;

import java.math.BigDecimal;

/**
 * The same as OrbitBudgetType in order.xsd but for domain services.
 * 
 * @author Kosyrev
 * 
 * @version R26.1 720577 Pricing Engine
 *
 */
public class OrbitBudgetDto {
	private OrbitOfferType offerType = null;
	private String offerName;
	private String offerVersion;
	private String offerCalculationID;
	private BigDecimal totalBudget;
	private BigDecimal consumedBudget;
	private BigDecimal balanceBudget;

	/**
	 * NBO or ATL
	 * @return
	 */
	public OrbitOfferType getOfferType() {
		return offerType;
	}
	
	/**
	 * NBO or ATL
	 * @param offerType
	 */
	public void setOfferType(OrbitOfferType offerType) {
		this.offerType = offerType;
	}
	
	/**
	 * For ATL offer type it is a campaign name, i.e. PM_1213_Name
	 * @return
	 */
	public String getOfferName() {
		return offerName;
	}
	
	/**
	 * For ATL offer type it is a campaign name
	 * @param offerName
	 */
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	
	/**
	 * For ATL offer type it is a campaign version, like _v3
	 * @return
	 */
	public String getOfferVersion() {
		return offerVersion;
	}
	
	/**
	 * For ATL offer type it is a campaign version, like _v3
	 * @param offerVersion
	 */
	public void setOfferVersion(String offerVersion) {
		this.offerVersion = offerVersion;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getOfferCalculationID() {
		return offerCalculationID;
	}
	public void setOfferCalculationID(String offerCalculationID) {
		this.offerCalculationID = offerCalculationID;
	}
	
	/**
	 * Total budget for NBO
	 * @return
	 */
	public BigDecimal getTotalBudget() {
		return totalBudget;
	}
	
	/**
	 * Total budget for NBO
	 * @param totalBudget
	 */
	public void setTotalBudget(BigDecimal totalBudget) {
		this.totalBudget = totalBudget;
	}
	
	/**
	 * Consumed budget for NBO
	 * @return
	 */
	public BigDecimal getConsumedBudget() {
		return consumedBudget;
	}
	
	/**
	 * Consumed budget for NBO
	 * @param consumedBudget
	 */
	public void setConsumedBudget(BigDecimal consumedBudget) {
		this.consumedBudget = consumedBudget;
	}
	
	/**
	 * Remaining budget for NBO
	 * @return
	 */
	public BigDecimal getBalanceBudget() {
		return balanceBudget;
	}
	
	/**
	 * Remaining budget for NBO
	 * @param balanceBudget
	 */
	public void setBalanceBudget(BigDecimal balanceBudget) {
		this.balanceBudget = balanceBudget;
	}
}
