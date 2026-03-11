
package sunrise.crm.xvo.manual.creditcheck;

public class XMCreditSelectedProductsVo {

	
	private int quantity;
	private String groupType;
	private String ratePlan;
	private String hardware;
	private String duration;
	private String isNewNumber;

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public String getRatePlan() {
		return ratePlan;
	}
	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}
	public String getHardware() {
		return hardware;
	}
	public void setHardware(String hardware) {
		this.hardware = hardware;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getIsNewNumber() {
		return isNewNumber;
	}
	public void setIsNewNumber(String isNewNumber) {
		this.isNewNumber = isNewNumber;
	}
	
	
	@Override
	public String toString() {
		return "XMCreditSelectedProductsVo [quantity=" + quantity
				+ ", groupType=" + groupType + ", ratePlan=" + ratePlan
				+ ", hardware=" + hardware + ", duration=" + duration
				+ ", isNewNumber=" + isNewNumber + "]";
	}
	
}
