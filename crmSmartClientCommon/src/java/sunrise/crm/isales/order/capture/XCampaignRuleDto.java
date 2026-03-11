package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Map;
import java.util.StringJoiner;

public class XCampaignRuleDto{

    private String objid;
    private String xRuleGroup;
    private String xCanBeOverruled;
    private String xApplyNotOperator;
    private String xParam;
    private String xCampRule2Campaign;
    private String xRuleName;

    public static final String OBJID = "RL_OBJID";
    private static final String X_RULE_GROUP = "RL_X_RULE_GROUP";
    private static final String X_CAN_BE_OVERRULED = "RL_X_CAN_BE_OVERRULED";
    private static final String X_APPLY_NOT_OPERATOR = "RL_X_APPLY_NOT_OPERATOR";
    private static final String X_PARAM = "RL_X_PARAM";
    private static final String X_CAMP_RULE2CAMPAIGN = "RL_X_CAMP_RULE2CAMPAIGN";
    private static final String X_RULE_NAME = "RL_X_RULE_NAME";

    public XCampaignRuleDto(Map<String, Object> map) {
        this.objid = map.get(OBJID).toString();
        this.xRuleGroup = objectToStringOrNull(map.get(X_RULE_GROUP));
        this.xCanBeOverruled = CrmNumberUtil.bigDecimalToString(map.get(X_CAN_BE_OVERRULED));
        this.xApplyNotOperator = CrmNumberUtil.bigDecimalToString(map.get(X_APPLY_NOT_OPERATOR));
        this.xParam = objectToStringOrNull(map.get(X_PARAM));
        this.xCampRule2Campaign = CrmNumberUtil.bigDecimalToString(map.get(X_CAMP_RULE2CAMPAIGN));
        this.xRuleName = objectToStringOrNull(map.get(X_RULE_NAME));
    }

    // ToDo: Should it be replaced with String.valueOf(), that returns "null" string but not null value.
    private String objectToStringOrNull(Object object) {
        return object != null ? object.toString() : null;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getxRuleGroup() {
        return xRuleGroup;
    }

    public void setxRuleGroup(String xRuleGroup) {
        this.xRuleGroup = xRuleGroup;
    }

    public String getxCanBeOverruled() {
        return xCanBeOverruled;
    }

    public void setxCanBeOverruled(String xCanBeOverruled) {
        this.xCanBeOverruled = xCanBeOverruled;
    }

    public String getxApplyNotOperator() {
        return xApplyNotOperator;
    }

    public void setxApplyNotOperator(String xApplyNotOperator) {
        this.xApplyNotOperator = xApplyNotOperator;
    }

    public String getxParam() {
        return xParam;
    }

    public void setxParam(String xParam) {
        this.xParam = xParam;
    }

    public String getxCampRule2Campaign() {
        return xCampRule2Campaign;
    }

    public void setxCampRule2Campaign(String xCampRule2Campaign) {
        this.xCampRule2Campaign = xCampRule2Campaign;
    }

    public String getxRuleName() {
        return xRuleName;
    }

    public void setxRuleName(String xRuleName) {
        this.xRuleName = xRuleName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XCampaignRuleDto.class.getSimpleName() + "[", "]")
                .add("objid='" + objid + "'")
                .add("xRuleGroup='" + xRuleGroup + "'")
                .add("xCanBeOverruled='" + xCanBeOverruled + "'")
                .add("xApplyNotOperator='" + xApplyNotOperator + "'")
                .add("xParam='" + xParam + "'")
                .add("xCampRule2Campaign='" + xCampRule2Campaign + "'")
                .add("xRuleName='" + xRuleName + "'")
                .toString();
    }
}
