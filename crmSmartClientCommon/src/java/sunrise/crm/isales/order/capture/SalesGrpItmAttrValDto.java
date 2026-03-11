package sunrise.crm.isales.order.capture;

import static sunrise.crm.util.CrmDateUtil.DATE_FORMAT_SHORT5;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sunrise.crm.util.CrmDateUtil;
import sunrise.crm.util.CrmNumberUtil;

public class SalesGrpItmAttrValDto {
	
	private Map<String, Object> map = new HashMap<>();

	private static List<String> fields = Arrays.asList(
		"OBJID",
		"X_PROD_GRP_OBJID",
		"X_ITM_OBJID",
		"X_ATTR_DEF_OBJID",
		"X_STR_VALUE",
		"X_DTE_VALUE",
		"X_NUM_VALUE",
		"X_CUR_VALUE",
		"X_BLN_VALUE",
		"X_DATA_TYPE",
		"X_ATTR_NAME",
		"S_X_ATTR_NAME",
		"X_IS_VISIBLE",
		"X_ATTR_RANK",
		"X_GROUP_NAME",
		"X_PRODUCT_NAME",
		"X_PROD_PART_NUM_OBJID",
		"X_PROD_PART_NUM",
		"X_START_SALES_DATE",
		"X_END_SALES_DATE",
		"X_ITM_RANK",
		"PRODUCT_PART_NUMBER",
		"X_PROD_PART_CLASS"
	);
	
	public SalesGrpItmAttrValDto(Map<String, Object> map){
		this.map = map;
	}
	
	public String getXProdPartClass(){
		return (String) map.get("X_PROD_PART_CLASS");
	}

	public String getObjid(){
		return CrmNumberUtil.bigDecimalToString(map.get("OBJID"));
	}
	public String getXItmObjid() {
		return CrmNumberUtil.bigDecimalToString(map.get("X_ITM_OBJID"));
	}
	public String getXProdGrpObjid(){
		return CrmNumberUtil.bigDecimalToString(map.get("X_PROD_GRP_OBJID"));
	}
	public String getXAttrDefObjid(){
		return CrmNumberUtil.bigDecimalToString(map.get("X_ATTR_DEF_OBJID"));
	}
	public String getXProdPartNumObjid(){
		return CrmNumberUtil.bigDecimalToString(map.get("X_PROD_PART_NUM_OBJID"));
	}
	public String getXProdPartNum() {
		return (String) map.get("X_PROD_PART_NUM");
	}
	public String getProdPartNumber() {
		return (String) map.get("PRODUCT_PART_NUMBER");
	}
	public boolean isAttrVisible(){
		return "1".equals(CrmNumberUtil.bigDecimalToString(map.get("X_IS_VISIBLE")));
	}
	public String getXGroupName(){
		return (String)map.get("X_GROUP_NAME");
	}
	public String getXProductName(){
		return (String)map.get("X_PRODUCT_NAME");
	}
	public int getXProductRank(){
		return CrmNumberUtil.bigDecimalToInt(map.get("X_ITM_RANK"));
	}
	public String getXAttrName() {
		return (String) map.get("X_ATTR_NAME");
	}
	public int getXAttrRank(){
		return CrmNumberUtil.bigDecimalToInt(map.get("X_ATTR_RANK"));
	}
	public String getIsActive() {
		return CrmNumberUtil.bigDecimalToString (map.get("IS_ACTIVE"));
	}
	private String getXDataType(){
		return (String)map.get("X_DATA_TYPE");
	}
	private int getXBlnValue() {
		return CrmNumberUtil.bigDecimalToInt(map.get("X_BLN_VALUE"));
	}

	private int getXCurValue() {
		return CrmNumberUtil.bigDecimalToInt(map.get("X_CUR_VALUE"));
	}

	private int getXNumValue() {
		return CrmNumberUtil.bigDecimalToInt(map.get("X_NUM_VALUE"));
	}

	private Date getXDteValue() {
		return (Date) map.get("X_DTE_VALUE");
	}

	private String getXStrValue() {
		return (String) map.get("X_STR_VALUE");
	}

	public String getAttrValue() {
		String xDataType = getXDataType();
		SalesAttrDataType salesAttrDataType = SalesAttrDataType.valueOf(xDataType);
		switch (salesAttrDataType) {
			case B:
				int value = getXBlnValue();
				if (value != 0) {
					return "true";
				}
				return "false";
			case C:
				int xCurValue = getXCurValue();
				return Integer.toString(xCurValue);
			case D:
				Date xDteValue = getXDteValue();
				return CrmDateUtil.format(DATE_FORMAT_SHORT5).format(xDteValue);
			case N:
				int xNumValue = getXNumValue();
				return Integer.toString(xNumValue);
			case S:
				return getXStrValue();
		}
		return null;
	}


    public Object getXValue(){
        String dataType = getXDataType();
        if ("S".equalsIgnoreCase(dataType)){
            return (String)map.get("X_STR_VALUE");
        }else if ("C".equalsIgnoreCase(dataType)){
            return (BigDecimal)map.get("X_CUR_VALUE");
        }else if ("N".equalsIgnoreCase(dataType)){
            return (BigDecimal)map.get("X_NUM_VALUE");
        }else if ("D".equalsIgnoreCase(dataType)){
            return (Date)map.get("X_DTE_VALUE");
        }else if ("B".equalsIgnoreCase(dataType)){
            return BigDecimal.ONE.equals((BigDecimal)map.get("X_BLN_VALUE"));
        }
        return (String)map.get("X_STR_VALUE");
    }

    @Override
    public String toString() {
        return "SalesGrpItmAttrValDto [map=" + map + "]";
    }
}
