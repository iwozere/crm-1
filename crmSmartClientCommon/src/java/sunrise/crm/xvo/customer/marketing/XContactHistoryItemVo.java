package sunrise.crm.xvo.customer.marketing;

import java.util.Date;

public class XContactHistoryItemVo  {
	

	private String communicationChannel;
	private String campaignType;
	private String campaignSubType;
	private String emailSubject;
	private String journeyActivity;
	private String journeyName;
	private String mobileNumber;
	private String relatedPromo;
	private String sender;
	private String smsBodyContent;
	private String viewEmailURL;
	private String placeholder1;
	private String placeholder2;

	private Date activityDate;
	private Date dateTimeFirstOpened;
	private Date dateTimeFirstClicked;
	private Date dateBounced;
	
	public String getCommunicationChannel() {
		return communicationChannel;
	}

	public String getCampaignType() {
		return campaignType;
	}

	public String getCampaignSubType() {
		return campaignSubType;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public String getJourneyActivity() {
		return journeyActivity;
	}

	public String getJourneyName() {
		return journeyName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getRelatedPromo() {
		return relatedPromo;
	}

	public String getSender() {
		return sender;
	}

	public String getSmsBodyContent() {
		return smsBodyContent;
	}

	public String getViewEmailURL() {
		return viewEmailURL;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public Date getDateTimeFirstOpened() {
		return dateTimeFirstOpened;
	}

	public Date getDateTimeFirstClicked() {
		return dateTimeFirstClicked;
	}

	public Date getDateBounced() {
		return dateBounced;
	}

	public void setCommunicationChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
		
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
		
	}

	public void setCampaignSubType(String campaignSubType) {
		this.campaignSubType = campaignSubType;		
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
		
	}

	public void setJourneyActivity(String journeyActivity) {
		this.journeyActivity = journeyActivity;
		
	}

	public void setJourneyName(String journeyName) {
		this.journeyName = journeyName;
		
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		
	}

	public void setRelatedPromo(String relatedPromo) {
		this.relatedPromo = relatedPromo;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setSmsBodyContent(String smsBodyContent) {
		this.smsBodyContent = smsBodyContent;
	}

	public void setViewEmailURL(String viewEmailURL) {
		this.viewEmailURL = viewEmailURL;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public void setDateTimeFirstOpened(Date dateTimeFirstOpened) {
		this.dateTimeFirstOpened = dateTimeFirstOpened;
	}

	public void setDateTimeFirstClicked(Date dateTimeFirstClicked) {
		this.dateTimeFirstClicked = dateTimeFirstClicked;
	}

	public void setDateBounced(Date dateBounced) {
		this.dateBounced = dateBounced;
	}

	public String getPlaceholder1() {
		return placeholder1;
	}

	public void setPlaceholder1(String placeholder1) {
		this.placeholder1 = placeholder1;
	}

	public String getPlaceholder2() {
		return placeholder2;
	}

	public void setPlaceholder2(String placeholder2) {
		this.placeholder2 = placeholder2;
	}

	@Override
	public String toString() {
		return "XContactHistoryItemVo [communicationChannel=" + communicationChannel + ", campaignType=" + campaignType
				+ ", campaignSubType=" + campaignSubType + ", emailSubject=" + emailSubject + ", journeyActivity="
				+ journeyActivity + ", journeyName=" + journeyName + ", mobileNumber=" + mobileNumber
				+ ", relatedPromo=" + relatedPromo + ", sender=" + sender + ", smsBodyContent=" + smsBodyContent
				+ ", viewEmailURL=" + viewEmailURL + ", placeholder1=" + placeholder1 + ", placeholder2=" + placeholder2
				+ ", activityDate=" + activityDate + ", dateTimeFirstOpened=" + dateTimeFirstOpened
				+ ", dateTimeFirstClicked=" + dateTimeFirstClicked + ", dateBounced=" + dateBounced + "]";
	}
	
	

}
