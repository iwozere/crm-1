package sunrise.crm.persistence.dao.dto;

import java.util.Map;

/**
 * Class Installed Product Benefit Items.
 * added for 8989
 * 
 * @author saxenas
 */

public class ProductBenefitItem {

	private String benefitCategory;
	private String benefitProvider;
	private String partnerId;

	private String partnerName;

	private String sitePartObjid;
	private Map<String, String> attributeNameValMap;
	private String name;

	/**
	 * @return the partnerId
	 */
	public String getPartnerId() {
		return partnerId;
	}

	/**
	 * @param partnerId
	 *            the partnerId to set
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * @return the partnerName
	 */
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * @param partnerName
	 *            the partnerName to set
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	/**
	 * @return the attributeNameValMap
	 */
	public Map<String, String> getAttributeNameValMap() {
		return attributeNameValMap;
	}

	/**
	 * @param attributeNameValMap
	 *            the attributeNameValMap to set
	 */
	public void setAttributeNameValMap(Map<String, String> attributeNameValMap) {
		this.attributeNameValMap = attributeNameValMap;
	}

	/**
	 * @return the sitePartObjid
	 */
	public String getSitePartObjid() {
		return sitePartObjid;
	}

	/**
	 * @param sitePartObjid
	 *            the sitePartObjid to set
	 */
	public void setSitePartObjid(String sitePartObjid) {
		this.sitePartObjid = sitePartObjid;
	}

	public ProductBenefitItem() {
	}

	public ProductBenefitItem(ProductBenefitItem o) {
		this.partnerId = o.getPartnerId();
		this.partnerName = o.getPartnerName();
		this.benefitCategory = o.getBenefitCategory();
		this.benefitProvider = o.getBenefitProvider();
	}

	/**
	 * @return the benefitCategory
	 */
	public String getBenefitCategory() {
		return benefitCategory;
	}

	/**
	 * @param benefitCategory
	 *            the benefitCategory to set
	 */
	public void setBenefitCategory(String benefitCategory) {
		this.benefitCategory = benefitCategory;
	}

	/**
	 * @return the benefitProvider
	 */
	public String getBenefitProvider() {
		return benefitProvider;
	}

	/**
	 * @param benefitProvider
	 *            the benefitProvider to set
	 */
	public void setBenefitProvider(String benefitProvider) {
		this.benefitProvider = benefitProvider;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("partnerId=").append(partnerId).append(";")
				.append("partnerName=").append(partnerName).append(";")
				.append("benefitCategory=").append(benefitCategory).append(";")
				.append("benefitProvider=").append(benefitProvider).append(";");
		return sb.toString();
	}
}
