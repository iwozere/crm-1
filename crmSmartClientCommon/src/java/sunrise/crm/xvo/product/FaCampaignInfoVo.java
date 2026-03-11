package sunrise.crm.xvo.product;

import com.google.gson.Gson;

public class FaCampaignInfoVo {

	private String objid;
	private String attributeName;
	private String attributeValue;
	private String campaignObjid;
	private String flexDefnObjid;

    public FaCampaignInfoVo() {}

    public FaCampaignInfoVo(FaCampaignInfoVo vo) {
        this.objid = vo.getObjid();
        this.attributeName = vo.getAttributeName();
        this.attributeValue = vo.getAttributeValue();
        this.campaignObjid = vo.getCampaignObjid();
        this.flexDefnObjid = vo.getFlexDefnObjid();
    }

    public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getCampaignObjid() {
		return campaignObjid;
	}

	public void setCampaignObjid(String campaignObjid) {
		this.campaignObjid = campaignObjid;
	}

	public String getFlexDefnObjid() {
		return flexDefnObjid;
	}

	public void setFlexDefnObjid(String flexDefnObjid) {
		this.flexDefnObjid = flexDefnObjid;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
