package sunrise.crm.xvo.bizOrder;

/**
 * Class for the unique contact list search.
 * @author arthur 
 * @notes  
 */
public class BizOrderUniqueContactVo {
    
    private String objid;
    private String firstName;
    private String lastName;
    private String formattedName;
    private String phone;
    private String fax;
    private String email;
    private String mobilePhone;
    private String status;
    private String contactId;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

	public BizOrderUniqueContactVo(){}
    
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

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFax() {
		return fax;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactId() {
		return contactId;
	}
}
