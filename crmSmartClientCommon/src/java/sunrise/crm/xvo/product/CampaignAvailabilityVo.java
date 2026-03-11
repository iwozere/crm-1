package sunrise.crm.xvo.product;

import com.google.gson.Gson;

/**
 * Indicates how many installations of the campaign are available (per campaign and per partner)
 */
public class CampaignAvailabilityVo {

	/**
	 * Campaign Objid
	 */
	private String campaignObjid;

	/**
	 * From table x_campaign_partner
	 */
	private String campaignPartnerObjid;

	/**
	 * Campaign Name
	 */
	private String campaignName;


	/**
	 * Partner Id ex. 0000023123
	 */
	private String partnerId;

	/**
	 * Campaign level availability (table_campaign), or -1 if counter is not set on the campaign level
	 */
	private int campaignAvailability = -1;

	/**
	 * Campaign-partner level availability (table_x_campaign_partner), or -1 if counter is not set on the partner level
	 */
	private int partnerAvailability = -1;

	private int capacityAllowed;

	private int capacityUsed;

	private String capacityPeriod;
	private boolean partnerIsExcluded;
	private String partnerType;

	public CampaignAvailabilityVo(String campaignObjid, String campaignPartnerObjid, String campaignName, String partnerId, int campaignAvailability, int partnerAvailability, int capacityAllowed, int capacityUsed, String capacityPeriod) {
		this.campaignObjid = campaignObjid;
		this.campaignPartnerObjid = campaignPartnerObjid;
		this.campaignName = campaignName;
		this.partnerId = partnerId;
		this.campaignAvailability = campaignAvailability;
		this.partnerAvailability = partnerAvailability;
		this.capacityAllowed = capacityAllowed;
		this.capacityUsed = capacityUsed;
		this.capacityPeriod = capacityPeriod;
	}

	public CampaignAvailabilityVo() {
	}

	public int getCounter() {
		return campaignAvailability == -1 ? partnerAvailability : campaignAvailability;
	}

	public String getCampaignObjid() {
		return campaignObjid;
	}

	public void setCampaignObjid(String campaignObjid) {
		this.campaignObjid = campaignObjid;
	}

	public String getCampaignPartnerObjid() {
		return campaignPartnerObjid;
	}

	public void setCampaignPartnerObjid(String campaignPartnerObjid) {
		this.campaignPartnerObjid = campaignPartnerObjid;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public int getCampaignAvailability() {
		return campaignAvailability;
	}

	public void setCampaignAvailability(int campaignAvailability) {
		this.campaignAvailability = campaignAvailability;
	}

	public int getPartnerAvailability() {
		return partnerAvailability;
	}

	public void setPartnerAvailability(int partnerAvailability) {
		this.partnerAvailability = partnerAvailability;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCapacityAllowed() {
		return capacityAllowed;
	}

	public void setCapacityAllowed(int capacityAllowed) {
		this.capacityAllowed = capacityAllowed;
	}

	public int getCapacityUsed() {
		return capacityUsed;
	}

	public void setCapacityUsed(int capacityUsed) {
		this.capacityUsed = capacityUsed;
	}

	public String getCapacityPeriod() {
		return capacityPeriod;
	}

	public void setCapacityPeriod(String capacityPeriod) {
		this.capacityPeriod = capacityPeriod;
	}


	public void setPartnerIsExcluded(boolean partnerIsExcluded) {
		this.partnerIsExcluded = partnerIsExcluded;
	}

	public boolean getPartnerIsExcluded() {
		return partnerIsExcluded;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getPartnerType() {
		return partnerType;
	}

	@Override public String toString() {
		return new Gson().toJson(this);
	}
}
