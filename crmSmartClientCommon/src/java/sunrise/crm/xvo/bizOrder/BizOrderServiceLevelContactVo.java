package sunrise.crm.xvo.bizOrder;

/**
 * Class for the service-level contact list.
 * @author arthur 
 * @notes  
 */
public class BizOrderServiceLevelContactVo {
    
    private String objid;
    private String firstName;
    private String lastName;
    private String formattedName;
    private String phone;
    private String fax;
    private String email;
    private int status;
    private String contactId;
    private java.util.Date installDate;
    private String rolObjid;
    private String role;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

	public BizOrderServiceLevelContactVo(){}
    
    // *************************************************************************
    // GETTERS & SETTERS
    // *************************************************************************
    
    public String getObjid() {
		return objid;
	}

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}

	public String getFormattedName() {
		return formattedName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFax() {
		return fax;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactId() {
		return contactId;
	}

	public java.util.Date getInstallDate() {
		return installDate;
	}

	public void setInstallDate(java.util.Date installDate) {
		this.installDate = installDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRolObjid() {
		return rolObjid;
	}

	public void setRolObjid(String rolObjid) {
		this.rolObjid = rolObjid;
	}
}
