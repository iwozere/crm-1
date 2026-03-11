package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Date;
import java.util.Map;
import java.util.StringJoiner;

public class CampaignDto{

    private String objid;
    private String camType;
    private Date startDate;
    private Date endDate;
    private String description;

    private String name;
    private String status;
    private String xChildRedmp2Campaign;
    private String xPrecedence;
    private String xSmsKeyword;

    private String campaign2Currency;
    private String xDescription;
    private String xDiscountCategoryCode;

//    private String camCode;           is always null
//    private String xPromoUrl;
//    private String xPromoUrlText;
//    private String xCampaign2XPartner;    is always null
////, CAM_TYPE2HGBST_ELM NUMBER               is always null
////, CAM_STAT2HGBST_ELM NUMBER               is always null
////, S_X_SMS_KEYWORD VARCHAR2(30 BYTE)
////, X_PROMO_REDEEM_URL VARCHAR2(2000 BYTE)
////, X_PROMO_REDEEM_URL_TEXT VARCHAR2(255 BYTE)
////, X_PROMO_VOUCHER_MSGID NUMBER
    //, OBJECTIVE VARCHAR2(255 BYTE)    is always null
//, AUDIENCE VARCHAR2(80 BYTE)          is always null
//, INT_RSRC VARCHAR2(50 BYTE)          is always null
//, EXT_RSRC VARCHAR2(50 BYTE)          is always null
//, COST NUMBER(19, 4)                  is always null
    //, S_NAME VARCHAR2(80 BYTE)
//, BUDGET_AMT NUMBER(19, 4)            is always null
//, OPPS_GOAL NUMBER                    is always null
//, WON_GOAL NUMBER                     is always null
//, REVENUE_GOAL NUMBER(19, 4)          is always null

    //, PRODUCTS VARCHAR2(80 BYTE)      is always null
//, ARCH_IND NUMBER                     is always null
//, DEV NUMBER                          is always null
//, X_ECAMP_ID VARCHAR2(12 BYTE)        is always null
//, CAMPAIGN2PRICE_PROG NUMBER          is always null
//, CAM_OWNER2USER NUMBER               is always null


    public static final String OBJID = "C_OBJID";
    public static final String CAM_TYPE = "C_CAM_TYPE";
    public static final String START_DATE = "C_START_DATE";
    public static final String END_DATE = "C_END_DATE";
    public static final String DESCRIPTION = "C_DESCRIPTION";

    public static final String NAME = "C_NAME";
    public static final String STATUS = "C_STATUS";
    public static final String X_CHILD_REDMP2CAMPAIGN = "C_X_CHILD_REDMP2CAMPAIGN";
    public static final String X_PRECEDENCE = "C_X_PRECEDENCE";
    public static final String X_SMS_KEYWORD = "C_S_X_SMS_KEYWORD";

    public static final String CAMPAIGN2CURRENCY = "C_CAMPAIGN2CURRENCY";
    public static final String X_DESCRIPTION = "C_X_DESCRIPTION";
    public static final String X_DISCOUNT_CATEGORY_CODE = "C_X_DISCOUNT_CATEGORY_CODE";

    public CampaignDto() {

    }

    public CampaignDto(Map<String, Object> map) {
        this.objid = map.get(OBJID).toString();
        this.camType = map.get(CAM_TYPE).toString();
        this.startDate = CrmNumberUtil.convertTimestampToDate(map.get(START_DATE));
        this.endDate = CrmNumberUtil.convertTimestampToDate(map.get(END_DATE));
        this.description = map.get(DESCRIPTION).toString();

        this.name = map.get(NAME).toString();
        this.status = map.get(STATUS).toString();
        this.xChildRedmp2Campaign = CrmNumberUtil.bigDecimalToString(map.get(X_CHILD_REDMP2CAMPAIGN));
        this.xSmsKeyword = objectToStringOrNull(map.get(X_SMS_KEYWORD));
        this.xPrecedence = objectToStringOrNull(map.get(X_PRECEDENCE));

        this.xDescription = objectToStringOrNull(map.get(X_DESCRIPTION));
        this.xDiscountCategoryCode = objectToStringOrNull(map.get(X_DISCOUNT_CATEGORY_CODE));
        this.campaign2Currency = objectToStringOrNull(map.get(CAMPAIGN2CURRENCY));
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

    public String getCamType() {
        return camType;
    }

    public void setCamType(String camType) {
        this.camType = camType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getxChildRedmp2Campaign() {
        return xChildRedmp2Campaign;
    }

    public void setxChildRedmp2Campaign(String xChildRedmp2Campaign) {
        this.xChildRedmp2Campaign = xChildRedmp2Campaign;
    }

    public String getxPrecedence() {
        return xPrecedence;
    }

    public void setxPrecedence(String xPrecedence) {
        this.xPrecedence = xPrecedence;
    }

    public String getxSmsKeyword() {
        return xSmsKeyword;
    }

    public void setxSmsKeyword(String xSmsKeyword) {
        this.xSmsKeyword = xSmsKeyword;
    }

    public String getCampaign2Currency() {
        return campaign2Currency;
    }

    public void setCampaign2Currency(String campaign2Currency) {
        this.campaign2Currency = campaign2Currency;
    }

    public String getxDescription() {
        return xDescription;
    }

    public void setxDescription(String xDescription) {
        this.xDescription = xDescription;
    }

    public String getxDiscountCategoryCode() {
        return xDiscountCategoryCode;
    }

    public void setxDiscountCategoryCode(String xDiscountCategoryCode) {
        this.xDiscountCategoryCode = xDiscountCategoryCode;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CampaignDto.class.getSimpleName() + "[", "]")
                .add("objid='" + objid + "'")
                .add("camType='" + camType + "'")
                .add("startDate=" + startDate)
                .add("endDate=" + endDate)
                .add("description='" + description + "'")
                .add("name='" + name + "'")
                .add("status='" + status + "'")
                .add("xChildRedmp2Campaign='" + xChildRedmp2Campaign + "'")
                .add("xPrecedence='" + xPrecedence + "'")
                .add("xSmsKeyword='" + xSmsKeyword + "'")
                .add("campaign2Currency='" + campaign2Currency + "'")
                .add("xDescription='" + xDescription + "'")
                .add("xDiscountCategoryCode='" + xDiscountCategoryCode + "'")
                .toString();
    }
}
