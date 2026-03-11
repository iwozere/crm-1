package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Map;
import java.util.StringJoiner;

public class XCampaignMigrDto{

    private String objid;
    private String xCampaignMigr2Campaign;
    private String xCampaignMigr2PriceProg;
    private String xInternetCampMigr2PartNum;
    private String xTvCampMigr2PartNum;
    private String xVoiceCampMigr2PartNum;

    public static final String OBJID = "MG_OBJID";
    private static final String X_CAMPAIGN_MIGR2CAMPAIGN = "MG_X_CAMPAIGN_MIGR2CAMPAIGN";
    private static final String X_CAMPAIGN_MIGR2PRICE_PROG = "MG_X_CAMPAIGN_MIGR2PRICE_PROG";
    private static final String X_INTERNET_CAMP_MIGR2PART_NUM = "MG_INTERNET_CAMP_MIGR2PART_NUM";
    private static final String X_TV_CAMP_MIGR2PART_NUM = "MG_X_TV_CAMP_MIGR2PART_NUM";
    private static final String X_VOICE_CAMP_MIGR2PART_NUM = "MG_X_VOICE_CAMP_MIGR2PART_NUM";

    public XCampaignMigrDto(Map<String, Object> map) {
        this.objid = map.get(OBJID).toString();
        // DEV
        this.xCampaignMigr2Campaign = CrmNumberUtil.bigDecimalToString(map.get(X_CAMPAIGN_MIGR2CAMPAIGN));
        this.xCampaignMigr2PriceProg = CrmNumberUtil.bigDecimalToString(map.get(X_CAMPAIGN_MIGR2PRICE_PROG));
        this.xInternetCampMigr2PartNum = CrmNumberUtil.bigDecimalToString(map.get(X_INTERNET_CAMP_MIGR2PART_NUM));
        this.xTvCampMigr2PartNum = CrmNumberUtil.bigDecimalToString(map.get(X_TV_CAMP_MIGR2PART_NUM));
        this.xVoiceCampMigr2PartNum = CrmNumberUtil.bigDecimalToString(map.get(X_VOICE_CAMP_MIGR2PART_NUM));
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getxCampaignMigr2Campaign() {
        return xCampaignMigr2Campaign;
    }

    public void setxCampaignMigr2Campaign(String xCampaignMigr2Campaign) {
        this.xCampaignMigr2Campaign = xCampaignMigr2Campaign;
    }

    public String getxCampaignMigr2PriceProg() {
        return xCampaignMigr2PriceProg;
    }

    public void setxCampaignMigr2PriceProg(String xCampaignMigr2PriceProg) {
        this.xCampaignMigr2PriceProg = xCampaignMigr2PriceProg;
    }

    public String getxInternetCampMigr2PartNum() {
        return xInternetCampMigr2PartNum;
    }

    public void setxInternetCampMigr2PartNum(String xInternetCampMigr2PartNum) {
        this.xInternetCampMigr2PartNum = xInternetCampMigr2PartNum;
    }

    public String getxTvCampMigr2PartNum() {
        return xTvCampMigr2PartNum;
    }

    public void setxTvCampMigr2PartNum(String xTvCampMigr2PartNum) {
        this.xTvCampMigr2PartNum = xTvCampMigr2PartNum;
    }

    public String getxVoiceCampMigr2PartNum() {
        return xVoiceCampMigr2PartNum;
    }

    public void setxVoiceCampMigr2PartNum(String xVoiceCampMigr2PartNum) {
        this.xVoiceCampMigr2PartNum = xVoiceCampMigr2PartNum;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", XCampaignMigrDto.class.getSimpleName() + "[", "]")
                .add("objid='" + objid + "'")
                .add("xCampaignMigr2Campaign='" + xCampaignMigr2Campaign + "'")
                .add("xCampaignMigr2PriceProg='" + xCampaignMigr2PriceProg + "'")
                .add("xInternetCampMigr2PartNum='" + xInternetCampMigr2PartNum + "'")
                .add("xTvCampMigr2PartNum='" + xTvCampMigr2PartNum + "'")
                .add("xVoiceCampMigr2PartNum='" + xVoiceCampMigr2PartNum + "'")
                .toString();
    }
}
