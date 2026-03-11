package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Map;
import java.util.StringJoiner;

public class XCampaignAttrDto {

    private String objid;
    private String xCampAttr2Campaign;
    private String xCampAttr2PartInfo;
    private String xCampAttr2XSegtype;
    private String xCampAttr2PrProg;
    private String xIsDeinstallShiftToEom;
    private String xOneTimeDiscountAmnt;
    private String xRecurringDiscountAmnt;
//    private String xRecurringCharge;          is always null
    private String xIsInstalledByCampaign;

    public static final String OBJID = "AC_OBJID";
    private static final String X_CAMP_ATTR2CAMPAIGN = "ATTR_CAMP_X_CAMP_ATTR2CAMPAIGN";
    private static final String X_CAMP_ATTR2PART_INFO = "X_CAMP_ATTR2PART_INFO";
    private static final String X_CAMP_ATTR2X_SEGTYPE = "X_CAMP_ATTR2X_SEGTYPE";
    private static final String X_CAMP_ATTR2PR_PROG = "X_CAMP_ATTR2PR_PROG";
    private static final String X_IS_DEINSTALL_SHIFT_TO_EOM = "X_IS_DEINSTALL_SHIFT_TO_EOM";
    private static final String X_ONE_TIME_DISCOUNT_AMNT = "AC_X_ONE_TIME_DISCOUNT_AMNT";
    private static final String X_RECURRING_DISCOUNT_AMNT = "AC_X_RECURRING_DISCOUNT_AMNT";
    private static final String X_IS_INSTALLED_BY_CAMPAIGN = "AC_X_IS_INSTALLED_BY_CAMPAIGN";

    public XCampaignAttrDto(Map<String, Object> map) {
        this.objid = map.get(OBJID).toString();
        this.xCampAttr2Campaign = CrmNumberUtil.bigDecimalToString(map.get(X_CAMP_ATTR2CAMPAIGN));
        this.xCampAttr2PartInfo = CrmNumberUtil.bigDecimalToString(map.get(X_CAMP_ATTR2PART_INFO));
        this.xCampAttr2XSegtype = CrmNumberUtil.bigDecimalToString(map.get(X_CAMP_ATTR2X_SEGTYPE));
        this.xCampAttr2PrProg = CrmNumberUtil.bigDecimalToString(map.get(X_CAMP_ATTR2PR_PROG));
        this.xIsDeinstallShiftToEom = CrmNumberUtil.bigDecimalToString(map.get(X_IS_DEINSTALL_SHIFT_TO_EOM));
        this.xOneTimeDiscountAmnt = objectToStringOrNull(map.get(X_ONE_TIME_DISCOUNT_AMNT));
        this.xRecurringDiscountAmnt = objectToStringOrNull(map.get(X_RECURRING_DISCOUNT_AMNT));
        this.xIsInstalledByCampaign = CrmNumberUtil.bigDecimalToString(map.get(X_IS_INSTALLED_BY_CAMPAIGN));
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

    public String getxCampAttr2Campaign() {
        return xCampAttr2Campaign;
    }

    public void setxCampAttr2Campaign(String xCampAttr2Campaign) {
        this.xCampAttr2Campaign = xCampAttr2Campaign;
    }

    public String getxCampAttr2PartInfo() {
        return xCampAttr2PartInfo;
    }

    public void setxCampAttr2PartInfo(String xCampAttr2PartInfo) {
        this.xCampAttr2PartInfo = xCampAttr2PartInfo;
    }

    public String getxCampAttr2XSegtype() {
        return xCampAttr2XSegtype;
    }

    public void setxCampAttr2XSegtype(String xCampAttr2XSegtype) {
        this.xCampAttr2XSegtype = xCampAttr2XSegtype;
    }

    public String getxCampAttr2PrProg() {
        return xCampAttr2PrProg;
    }

    public void setxCampAttr2PrProg(String xCampAttr2PrProg) {
        this.xCampAttr2PrProg = xCampAttr2PrProg;
    }

    public String getxIsDeinstallShiftToEom() {
        return xIsDeinstallShiftToEom;
    }

    public void setxIsDeinstallShiftToEom(String xIsDeinstallShiftToEom) {
        this.xIsDeinstallShiftToEom = xIsDeinstallShiftToEom;
    }

    public String getxOneTimeDiscountAmnt() {
        return xOneTimeDiscountAmnt;
    }

    public void setxOneTimeDiscountAmnt(String xOneTimeDiscountAmnt) {
        this.xOneTimeDiscountAmnt = xOneTimeDiscountAmnt;
    }

    public String getxRecurringDiscountAmnt() {
        return xRecurringDiscountAmnt;
    }

    public void setxRecurringDiscountAmnt(String xRecurringDiscountAmnt) {
        this.xRecurringDiscountAmnt = xRecurringDiscountAmnt;
    }

    public String getxIsInstalledByCampaign() {
        return xIsInstalledByCampaign;
    }

    public void setxIsInstalledByCampaign(String xIsInstalledByCampaign) {
        this.xIsInstalledByCampaign = xIsInstalledByCampaign;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XCampaignAttrDto.class.getSimpleName() + "[", "]")
                .add("objid='" + objid + "'")
                .add("xCampAttr2Campaign='" + xCampAttr2Campaign + "'")
                .add("xCampAttr2PartInfo='" + xCampAttr2PartInfo + "'")
                .add("xCampAttr2XSegtype='" + xCampAttr2XSegtype + "'")
                .add("xCampAttr2PrProg='" + xCampAttr2PrProg + "'")
                .add("xIsDeinstallShiftToEom='" + xIsDeinstallShiftToEom + "'")
                .add("xOneTimeDiscountAmnt='" + xOneTimeDiscountAmnt + "'")
                .add("xRecurringDiscountAmnt='" + xRecurringDiscountAmnt + "'")
                .add("xIsInstalledByCampaign='" + xIsInstalledByCampaign + "'")
                .toString();
    }
}
