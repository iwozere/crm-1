package sunrise.crm.xvo.product;

import com.google.gson.Gson;

public class XCampaignRuleInfoVo {

    private String objid;
    private String ruleGroup;
    private boolean reevaluateAtEnd;
    private boolean applyNotOperator;
    private String params;
    private String campaignObjid;
    private String ruleName;
    private String auditOperation;

    public XCampaignRuleInfoVo() {}

    public XCampaignRuleInfoVo(XCampaignRuleInfoVo vo) {
        updateFields(vo);
    }

    public void updateFields(XCampaignRuleInfoVo vo) {
        this.objid = vo.getObjid();
        this.ruleGroup = vo.getRuleGroup();
        this.reevaluateAtEnd = vo.isReevaluateAtEnd();
        this.applyNotOperator = vo.getApplyNotOperator();
        this.params = vo.getParams();
        this.campaignObjid = vo.getCampaignObjid();
        this.ruleName = vo.getRuleName();
        this.auditOperation = vo.getAuditOperation();
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getRuleGroup() {
        return ruleGroup;
    }

    public void setRuleGroup(String ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    public boolean isReevaluateAtEnd() {
        return reevaluateAtEnd;
    }

    public void setReevaluateAtEnd(boolean reevaluateAtEnd) {
        this.reevaluateAtEnd = reevaluateAtEnd;
    }

    public boolean getApplyNotOperator() {
        return applyNotOperator;
    }

    public void setApplyNotOperator(boolean applyNotOperator) {
        this.applyNotOperator = applyNotOperator;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getCampaignObjid() {
        return campaignObjid;
    }

    public void setCampaignObjid(String campaignObjid) {
        this.campaignObjid = campaignObjid;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String xRuleName) {
        this.ruleName = xRuleName;
    }

    public String getAuditOperation() {
        return auditOperation;
    }

    public void setAuditOperation(String auditOperation) {
        this.auditOperation = auditOperation;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
