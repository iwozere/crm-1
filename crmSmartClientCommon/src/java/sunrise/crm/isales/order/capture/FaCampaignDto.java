package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmNumberUtil;

import java.util.Map;
import java.util.StringJoiner;

public class FaCampaignDto{

   private String objid;
   private String attributeName;
   private String attributeValue;
   private String faCampaign2campaign;
   private String faCampaign2FlexDefn;

   public static final String OBJID = "FC_OBJID";
   private static final String ATTRIBUTE_NAME = "FC_ATTRIBUTE_NAME";
   private static final String ATTRIBUTE_VALUE = "FC_ATTRIBUTE_VALUE";
   private static final String FA_CAMPAIGN2CAMPAIGN = "FC_FA_CAMPAIGN2CAMPAIGN";
   private static final String FA_CAMPAIGN2FLEX_DEFN = "FC_FA_CAMPAIGN2FLEX_DEFN";

   //private static final String S_ATTRIBUTE_VALUE VARCHAR2(1300 BYTE)     is there any sense
   //private static final String ATTRIBUTE_DATATYPE NUMBER                 always 7
   //private static final String DEV NUMBER                                always null

   public FaCampaignDto(Map<String, Object> map) {
      this.objid = map.get(OBJID).toString();
      this.attributeName = objectToStringOrNull(map.get(ATTRIBUTE_NAME));
      this.attributeValue = objectToStringOrNull(map.get(ATTRIBUTE_VALUE));
      this.faCampaign2campaign = CrmNumberUtil.bigDecimalToString(map.get(FA_CAMPAIGN2CAMPAIGN));
      this.faCampaign2FlexDefn = CrmNumberUtil.bigDecimalToString(map.get(FA_CAMPAIGN2FLEX_DEFN));
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

   public String getFaCampaign2campaign() {
      return faCampaign2campaign;
   }

   public void setFaCampaign2campaign(String faCampaign2campaign) {
      this.faCampaign2campaign = faCampaign2campaign;
   }

   public String getFaCampaign2FlexDefn() {
      return faCampaign2FlexDefn;
   }

   public void setFaCampaign2FlexDefn(String faCampaign2FlexDefn) {
      this.faCampaign2FlexDefn = faCampaign2FlexDefn;
   }

   @Override
   public String toString() {
      return new StringJoiner(", ", FaCampaignDto.class.getSimpleName() + "[", "]")
              .add("objid='" + objid + "'")
              .add("attributeName='" + attributeName + "'")
              .add("attributeValue='" + attributeValue + "'")
              .add("faCampaign2campaign='" + faCampaign2campaign + "'")
              .add("faCampaign2FlexDefn='" + faCampaign2FlexDefn + "'")
              .toString();
   }
}
