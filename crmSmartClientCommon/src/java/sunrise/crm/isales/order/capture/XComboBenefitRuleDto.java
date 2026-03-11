/**
 * 
 */
package sunrise.crm.isales.order.capture;

import java.util.Map;

/**
 * @author Jamge
 */
public class XComboBenefitRuleDto {
    
    public static final String X_RULE_OBJID = "x_rule_objid";
    public static final String X_RULE_NAME = "x_rule_name";
    public static final String X_RULE_TYPE = "x_rule_type";
    public static final String X_OPTION_NAME = "x_option_name";

    private String xRuleObjid;
    private String xRuleName;
    private String xRuleType;
	private String xOptionName;
        
	
	public XComboBenefitRuleDto(Map<String, Object> map) {
		
		this.xRuleObjid = map.get(X_RULE_OBJID).toString();
		this.xRuleName = map.get(X_RULE_NAME).toString();
		this.xRuleType = map.get(X_RULE_TYPE).toString();
		this.xOptionName = map.get(X_OPTION_NAME).toString();
	}

	public String getxRuleObjid() {
		return xRuleObjid;
	}
	public void setxRuleObjid(String xRuleObjid) {
		this.xRuleObjid = xRuleObjid;
	}
	public String getxRuleName() {
		return xRuleName;
	}
	public void setxRuleName(String xRuleName) {
		this.xRuleName = xRuleName;
	}
	
    public String getxRuleType() {
		return xRuleType;
	}

	public void setxRuleType(String xRuleType) {
		this.xRuleType = xRuleType;
	}

	public String getxOptionName() {
		return xOptionName;
	}
	public void setxOptionName(String xOptionName) {
		this.xOptionName = xOptionName;
	}

	@Override
	public String toString() {
		return "XComboBenefitRuleDto [xRuleObjid=" + xRuleObjid + ", xRuleName=" + xRuleName + ", xRuleType=" + xRuleType
				+ "xOptionName=" + xOptionName + "]";
	}

}
