package sunrise.crm.isales.order.capture;

public class SalesCampaignRulesDto {

	private String ruleGroup;
	private boolean applyNotOperator;
	private String parameters;
	private String ruleName;
	public String getRuleGroup() {
		return ruleGroup;
	}
	public void setRuleGroup(String ruleGroup) {
		this.ruleGroup = ruleGroup;
	}
	public boolean isApplyNotOperator() {
		return applyNotOperator;
	}
	public void setApplyNotOperator(boolean applyNotOperator) {
		this.applyNotOperator = applyNotOperator;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	@Override
	public String toString() {
		return "SalesCampaignRulesDto [ruleGroup=" + ruleGroup + ", applyNotOperator=" + applyNotOperator
				+ ", parameters=" + parameters + ", ruleName=" + ruleName + "]";
	}
}
