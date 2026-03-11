package sunrise.crm.xvo.cic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sunrise.crm.util.CrmStringUtil;

/**
 * Represents email object, stored in CCM database (CIC written medias).
 * Project Q8169.
 * 
 * @author kosyrev
 * @since R46 / R14.3
 *
 */
public class CCMEmail {
    
    private String objid;
    private String type;
    private String email_id;
    private String address_from;
    private String address_to;
    private String address_to_cc;
    private String subject;
    private Date email_date;
    private String content;
    private String htmlContent;
    private String cic_interaction_id;
    private String cic_service_id;
    private String cic_email_moniker_id;
    private String cic_email_sequence_id;
    private String cic_username;
    private String parentInteractionId;

	private List<CCMAttachment> attachments = new ArrayList<>();
    private List<CCMEmail> children = new ArrayList<>();

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress_from() {
        return address_from;
    }

    public void setAddress_from(String address_from) {
        this.address_from = address_from;
    }

    public String getAddress_to() {
        return address_to;
    }

    public void setAddress_to(String address_to) {
        this.address_to = address_to;
    }

    public String getAddress_to_cc() {
        return address_to_cc;
    }

    public void setAddress_to_cc(String address_to_cc) {
        this.address_to_cc = address_to_cc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getEmail_date() {
        return email_date;
    }

    public void setEmail_date(Date email_date) {
        this.email_date = email_date;
    }

    public String getContent() {
    	return CrmStringUtil.nvl(content, CrmStringUtil.EMPTY);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCic_interaction_id() {
        return cic_interaction_id;
    }

    public void setCic_interaction_id(String cic_interaction_id) {
        this.cic_interaction_id = cic_interaction_id;
    }

    public String getCic_service_id() {
        return cic_service_id;
    }

    public void setCic_service_id(String cic_service_id) {
        this.cic_service_id = cic_service_id;
    }

    public String getCic_email_moniker_id() {
        return cic_email_moniker_id;
    }

    public void setCic_email_moniker_id(String cic_email_moniker_id) {
        this.cic_email_moniker_id = cic_email_moniker_id;
    }

    public String getCic_email_sequence_id() {
        return cic_email_sequence_id;
    }

    public void setCic_email_sequence_id(String cic_email_sequence_id) {
        this.cic_email_sequence_id = cic_email_sequence_id;
    }

    public String getCic_username() {
        return cic_username;
    }

    public void setCic_username(String cic_username) {
        this.cic_username = cic_username;
    }
    
    public List<CCMAttachment> getAttachments() {
        return attachments;
    }
    public void setAttachments(List<CCMAttachment> attachments) {
        this.attachments = attachments;
    }
    public List<CCMEmail> getChildren() {
        return children;
    }
    public void setChildren(List<CCMEmail> children) {
        this.children = children;
    }

    public String getParentInteractionId() {
		return parentInteractionId;
	}

	public void setParentInteractionId(String parentInteractionId) {
		this.parentInteractionId = parentInteractionId;
	}

    public String getHtmlContent() {
    	if (CrmStringUtil.isBlank(htmlContent)){
    		return content;
    	}
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }
}
