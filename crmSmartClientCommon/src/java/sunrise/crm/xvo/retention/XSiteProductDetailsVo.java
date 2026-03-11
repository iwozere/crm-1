package sunrise.crm.xvo.retention;

import java.util.Date;

import com.clarify.cbo.Site;

public class XSiteProductDetailsVo {
	private String siteId;
	private String custName;
	private String ratePlanName;
	private String serialNo;
	//private String fairPayLink;
	private String custAvailBudget;
	private String custUsedBudget;
	private String firstName;
	private String lastName;
	private String billingLanguage;
	private String industryType;
	private String ipContract;
	private Site site;
	private String ratePlanItems;
	private Date contractEndDate;		
	private String rcPrice;
	private String custOverBudget;
	private String custIsProfitableFlag;
	
	public String getRatePlanItems() {
		return ratePlanItems;
	}
	public void setRatePlanItems(String ratePlanItems) {
		this.ratePlanItems = ratePlanItems;
	}
	public String getBillingLanguage() {
		return billingLanguage;
	}
	public void setBillingLanguage(String billingLanguage) {
		this.billingLanguage = billingLanguage;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getRatePlanName() {
		return ratePlanName;
	}
	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getCustAvailBudget() {
		return custAvailBudget;
	}
	public void setCustAvailBudget(String custAvailBudget) {
		this.custAvailBudget = custAvailBudget;
	}
	public String getCustUsedBudget() {
		return custUsedBudget;
	}
	public void setCustUsedBudget(String custUsedBudget) {
		this.custUsedBudget = custUsedBudget;
	}	
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getIndustryType() {
		return industryType;
	}
	
	@Override
	public String toString() {
		return "XSiteProductDetailsVo [siteId=" + siteId + ", custName="
				+ custName + ", ratePlanName=" + ratePlanName + ", serialNo="
				+ serialNo + ", custAvailBudget=" + custAvailBudget
				+ ", custUsedBudget=" + custUsedBudget 
				+ ", firstName=" + firstName
				+ ", lastName=" + lastName 
				+ ", billingLanguage= " + billingLanguage 
				+ ", industryType= " + industryType 
				+ ", custOverBudget= " + custOverBudget
				+ ", custIsProfitableFlag= " + custIsProfitableFlag +"]";
	}
	
	public void setIpContract(String ipContract) {
		this.ipContract = ipContract;
	}
	public String getIpContract() {
		return ipContract;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public Site getSite() {
		return site;
	}	
	public Date getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	
	public String getRcPrice() {
		return rcPrice;
	}
	public void setRcPrice(String rcPrice) {
		this.rcPrice = rcPrice;
	}
	
	public String getCustOverBudget() {
		return custOverBudget;
	}
	public void setCustOverBudget(String custOverBudget) {
		this.custOverBudget = custOverBudget;
	}
	public String getCustIsProfitableFlag() {
		return custIsProfitableFlag;
	}
	public void setCustIsProfitableFlag(String custIsProfitableFlag) {
		this.custIsProfitableFlag = custIsProfitableFlag;
	}
}
