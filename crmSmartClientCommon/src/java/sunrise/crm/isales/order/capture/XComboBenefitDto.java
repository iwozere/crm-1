/**
 * 
 */
package sunrise.crm.isales.order.capture;

import java.util.Map;

/**
 * @author Jamge
 *
 */
public class XComboBenefitDto {

	public static final String X_RULE_OBJID = "x_rule_objid";
    public static final String X_RULE_NAME = "x_rule_name";
    public static final String X_ATTRIBUTE_NAME = "x_atribute_name";
    public static final String X_ATTR_STR_VALUE = "x_attr_str_value";
    public static final String X_ATTR_NUM_VALUE = "x_attr_num_value";
    public static final String X_UOM_TYPE = "x_attr_uom";
    public static final String X_BENEFIT_NAME = "x_opt_bnf_name";
    
    private String xRuleObjid;
	private String xRuleName;
    private String xAttributeName;
    private String xAttrStrValue;
    private String xAttrNumValue;
    private String xBenefitName;
    private String xUomType;
    
    
    public XComboBenefitDto(Map<String, Object> map) {
        this.xRuleObjid = map.get(X_RULE_OBJID).toString();
        this.xRuleName = map.get(X_RULE_NAME).toString();
        this.xAttributeName = map.get(X_ATTRIBUTE_NAME).toString();
        this.xAttrStrValue = map.get(X_ATTR_STR_VALUE).toString();
        this.xAttrNumValue = map.get(X_ATTR_NUM_VALUE).toString();
        this.xUomType = map.get(X_UOM_TYPE).toString();
        this.xBenefitName = map.get(X_BENEFIT_NAME).toString();
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


	public String getxAttributeName() {
		return xAttributeName;
	}


	public void setxAttributeName(String xAttributeName) {
		this.xAttributeName = xAttributeName;
	}

	public String getxAttrStrValue() {
		return xAttrStrValue;
	}

	public void setxAttrStrValue(String xAttrStrValue) {
		this.xAttrStrValue = xAttrStrValue;
	}

	public String getxAttrNumValue() {
		return xAttrNumValue;
	}

	public void setxAttrNumValue(String xAttrNumValue) {
		this.xAttrNumValue = xAttrNumValue;
	}

	public String getxBenefitName() {
		return xBenefitName;
	}

	public void setxBenefitName(String xBenefitName) {
		this.xBenefitName = xBenefitName;
	}

	public String getxUomType() {
		return xUomType;
	}

	public void setxUomType(String xUomType) {
		this.xUomType = xUomType;
	}

    
    @Override
	public String toString() {
		return "XComboBenefitDto [xRuleObjid=" + xRuleObjid + ", xRuleName=" + xRuleName + ", xAttributeName="
				+ xAttributeName + ", xAttrStrValue=" + xAttrStrValue + ", xAttrNumValue=" + xAttrNumValue
				+ ", xBenefitName=" + xBenefitName + ", xUomType=" + xUomType + "]";
	}


 }
