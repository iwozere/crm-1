package sunrise.crm.xvo.product;

public class MessageInfoVo {

	private String campaignObjid;
	private String messageId;
	private String messageName;
	private String language;
	private String message;

	public MessageInfoVo() {

	}

	public MessageInfoVo(MessageInfoVo message) {

		this.campaignObjid = message.getCampaignObjid();
		this.messageId = message.getMessageId();
		this.messageName = message.getMessageName();
		this.language = message.getLanguage();
		this.message = message.getMessage();
	}

	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getCampaignObjid() {
		return campaignObjid;
	}

	public void setCampaignObjid(String campaignObjid) {
		this.campaignObjid = campaignObjid;
	}
}
