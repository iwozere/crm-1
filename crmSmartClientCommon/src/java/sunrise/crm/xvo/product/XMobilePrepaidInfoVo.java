package sunrise.crm.xvo.product;

import java.math.BigDecimal;
import java.util.Date;

public class XMobilePrepaidInfoVo {
	private String status;
	private BigDecimal totalBalance;
	private String numberOfRefills;
	private String ratePlan;
	private int category;
	private int points;
	private String serviceProvider;
	private Date lastTransactionDate;
	private Date expiryDate;
	private Date deactivationDate;
	
	public XMobilePrepaidInfoVo(){
		
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNumberOfRefills() {
		return numberOfRefills;
	}
	public void setNumberOfRefills(String numberOfRefills) {
		this.numberOfRefills = numberOfRefills;
	}
	public String getRatePlan() {
		return ratePlan;
	}
	public void setRatePlan(String ratePlan) {
		this.ratePlan = ratePlan;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}
	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getDeactivationDate() {
		return deactivationDate;
	}
	public void setDeactivationDate(Date deactivationDate) {
		this.deactivationDate = deactivationDate;
	}
	public BigDecimal getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(BigDecimal totalBalance) {
		this.totalBalance = totalBalance;
	}
}
