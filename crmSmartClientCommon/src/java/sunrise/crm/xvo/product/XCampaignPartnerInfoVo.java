package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import sunrise.crm.util.CrmDateUtil;

import java.util.Date;

public class XCampaignPartnerInfoVo {
    private String objid;
    private String id;
    private String type;
    private String campaignObjid;
    private Boolean isExcluded;
    private String auditOperation;
    private Date startDate;
    private Date endDate;
    private int capacityAllowed;
    private String capacityPeriod;

    private static final Date CAMPAIGN_PARTNER_DEFAULT_END_DATE = CrmDateUtil.parseDateEU("31.12.4712");
    private static final Date CAMPAIGN_PARTNER_DEFAULT_START_DATE = CrmDateUtil.parseDateEU("01.01.1753");

    public XCampaignPartnerInfoVo() {
    }

    public XCampaignPartnerInfoVo(String objid, String id, String type, String campaignObjid, Boolean isExcluded, String auditOperation, Date startDate, Date endDate) {
        this.objid = objid;
        this.id = id;
        this.type = type;
        this.campaignObjid = campaignObjid;
        this.isExcluded = isExcluded;
        this.auditOperation = auditOperation;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public XCampaignPartnerInfoVo(XCampaignPartnerInfoVo vo) {
        updateFields(vo);
    }

    public void updateFields(XCampaignPartnerInfoVo vo) {
        this.objid = vo.getObjid();
        this.id = vo.getId();
        this.type = vo.getType();
        this.campaignObjid = vo.getCampaignObjid();
        this.isExcluded = vo.getExcluded();
        this.auditOperation = vo.getAuditOperation();
        this.startDate = vo.getStartDate();
        this.endDate = vo.getEndDate();
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCampaignObjid() {
        return campaignObjid;
    }

    public void setCampaignObjid(String campaignObjid) {
        this.campaignObjid = campaignObjid;
    }

    public Boolean getExcluded() {
        return isExcluded;
    }

    public void setExcluded(Boolean excluded) {
        isExcluded = excluded;
    }

    public String getAuditOperation() {
        return auditOperation;
    }

    public void setAuditOperation(String auditOperation) {
        this.auditOperation = auditOperation;
    }

    public int getCapacityAllowed() {
        return capacityAllowed;
    }

    public void setCapacityAllowed(int capacityAllowed) {
        this.capacityAllowed = capacityAllowed;
    }

    public String getCapacityPeriod() {
        return capacityPeriod;
    }

    public void setCapacityPeriod(String capacityPeriod) {
        this.capacityPeriod = capacityPeriod;
    }

    public Date getStartDate() {
        if (startDate == null) {
            startDate = CAMPAIGN_PARTNER_DEFAULT_START_DATE;
        }
        return startDate;
    }

    public void setStartDate(Date startDate) {
        if (startDate == null) {
            startDate = CAMPAIGN_PARTNER_DEFAULT_START_DATE;
        }
        this.startDate = startDate;
    }

    public Date getEndDate() {
        if (endDate == null) {
            endDate = CAMPAIGN_PARTNER_DEFAULT_END_DATE;
        }
        return endDate;
    }

    public void setEndDate(Date endDate) {
        if (endDate == null) {
            endDate = CAMPAIGN_PARTNER_DEFAULT_END_DATE;
        }
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
