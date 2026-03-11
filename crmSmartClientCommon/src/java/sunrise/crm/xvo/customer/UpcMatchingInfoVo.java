package sunrise.crm.xvo.customer;

import java.util.List;

import sunrise.crm.xvo.util.XSingleFieldVo;

public class UpcMatchingInfoVo {
	
	private String siteId;
	//Matches created via DWH
	private List<XSingleFieldVo> dwhMatches;
	// Matches created by Clarify. Flex attribute
	private String attributeMatch;
	// Match to be shown on the GUI
	private String guiMatchInfo;
	// Values "DWH" or "ATTRIBUTE"
	private String matchType;
	
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public List<XSingleFieldVo> getDwhMatches() {
		return dwhMatches;
	}
	public void setDwhMatches(List<XSingleFieldVo> dwhMatches) {
		this.dwhMatches = dwhMatches;
	}
	public String getAttributeMatch() {
		return attributeMatch;
	}
	public void setAttributeMatch(String attributeMatch) {
		this.attributeMatch = attributeMatch;
	}
	public String getGuiMatchInfo() {
		return guiMatchInfo;
	}
	public void setGuiMatchInfo(String guiMatchInfo) {
		this.guiMatchInfo = guiMatchInfo;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	
	

}
