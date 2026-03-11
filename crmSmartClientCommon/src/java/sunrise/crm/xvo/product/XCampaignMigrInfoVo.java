package sunrise.crm.xvo.product;

import com.google.gson.Gson;

public class XCampaignMigrInfoVo {

	private String objid;
    private String campaignObjid;
    private String priceProgObjidFrom;
	private String priceProgNameFrom;
	private String internetPartNumberFrom;
	private String tvPartNumberFrom;
	private String voicePartNumberFrom;
	private String priceProgObjidTo;
	private String priceProgNameTo;
	private String internetPartNumberTo;
	private String tvPartNumberTo;
	private String voicePartNumberTo;
	private String auditOperation;

    public XCampaignMigrInfoVo() {}

    public XCampaignMigrInfoVo(XCampaignMigrInfoVo vo) {
		updateFields(vo);
    }

	public void updateFields(XCampaignMigrInfoVo vo) {
		this.objid = vo.getObjid();
		this.campaignObjid = vo.getCampaignObjid();
		this.priceProgObjidFrom = vo.getPriceProgObjidFrom();
		this.priceProgNameFrom = vo.getPriceProgNameFrom();
		this.internetPartNumberFrom = vo.getInternetPartNumberFrom();
		this.tvPartNumberFrom = vo.getTvPartNumberFrom();
		this.voicePartNumberFrom = vo.getVoicePartNumberFrom();
		this.priceProgObjidTo = vo.getPriceProgObjidTo();
		this.priceProgNameTo = vo.getPriceProgNameTo();
		this.internetPartNumberTo = vo.getInternetPartNumberTo();
		this.tvPartNumberTo = vo.getTvPartNumberTo();
		this.voicePartNumberTo = vo.getVoicePartNumberTo();
		this.auditOperation = vo.getAuditOperation();
	}
    
	public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getCampaignObjid() {
		return campaignObjid;
	}

	public void setCampaignObjid(String campaignObjid) {
		this.campaignObjid = campaignObjid;
	}

	public String getPriceProgObjidFrom() {
		return priceProgObjidFrom;
	}

	public void setPriceProgObjidFrom(String priceProgObjidFrom) {
		this.priceProgObjidFrom = priceProgObjidFrom;
	}

	public String getPriceProgNameFrom() {
		return priceProgNameFrom;
	}

	public void setPriceProgNameFrom(String priceProgNameFrom) {
		this.priceProgNameFrom = priceProgNameFrom;
	}

	public String getInternetPartNumberFrom() {
		return internetPartNumberFrom;
	}

	public void setInternetPartNumberFrom(String internetPartNumberFrom) {
		this.internetPartNumberFrom = internetPartNumberFrom;
	}

	public String getTvPartNumberFrom() {
		return tvPartNumberFrom;
	}

	public void setTvPartNumberFrom(String tvPartNumberFrom) {
		this.tvPartNumberFrom = tvPartNumberFrom;
	}

	public String getVoicePartNumberFrom() {
		return voicePartNumberFrom;
	}

	public void setVoicePartNumberFrom(String voicePartNumberFrom) {
		this.voicePartNumberFrom = voicePartNumberFrom;
	}

	public String getPriceProgNameTo() {
		return priceProgNameTo;
	}

	public void setPriceProgNameTo(String priceProgNameTo) {
		this.priceProgNameTo = priceProgNameTo;
	}

	public String getInternetPartNumberTo() {
		return internetPartNumberTo;
	}

	public void setInternetPartNumberTo(String internetPartNumberTo) {
		this.internetPartNumberTo = internetPartNumberTo;
	}

	public String getTvPartNumberTo() {
		return tvPartNumberTo;
	}

	public void setTvPartNumberTo(String tvPartNumberTo) {
		this.tvPartNumberTo = tvPartNumberTo;
	}

	public String getVoicePartNumberTo() {
		return voicePartNumberTo;
	}

	public void setVoicePartNumberTo(String voicePartNumberTo) {
		this.voicePartNumberTo = voicePartNumberTo;
	}

	public String getAuditOperation() {
		return auditOperation;
	}

	public void setAuditOperation(String auditOperation) {
		this.auditOperation = auditOperation;
	}

	public String getPriceProgObjidTo() {
		return priceProgObjidTo;
	}

	public void setPriceProgObjidTo(String priceProgObjidTo) {
		this.priceProgObjidTo = priceProgObjidTo;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}


}
