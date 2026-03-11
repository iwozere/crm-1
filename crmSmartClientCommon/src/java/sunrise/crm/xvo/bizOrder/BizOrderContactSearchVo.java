package sunrise.crm.xvo.bizOrder;

/**
 * Class for the rol_contct search - The Technical, OnSite and Electrician contacts.
 * @author arthur 
 * @notes  
 */
public class BizOrderContactSearchVo {
    
    private String siteObjid;
    private String type;
    private String siteStatus;
    private String siteId;
    private String siteName;
    private String address;
    private String zipcode;
    private String city;
    private String contactObjid;
    private String firstName;
    private String lastName;
    private String formattedName;
    private String phone;
    private String fax;
    private String email;
    private String mobilePhone;
    private String contactRole;
    private String contactStatus;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************
    
    public BizOrderContactSearchVo(){}
    
    // *************************************************************************
    // GETTERS & SETTERS
    // *************************************************************************

    public void setSiteObjid(String siteObjid) {
        this.siteObjid = siteObjid;
    }

    public String getSiteObjid() {
        return siteObjid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSiteStatus(String siteStatus) {
        this.siteStatus = siteStatus;
    }

    public String getSiteStatus() {
        return siteStatus;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

	public void setContactObjid(String contactObjid) {
		this.contactObjid = contactObjid;
	}

	public String getContactObjid() {
		return contactObjid;
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

	public void setContactRole(String contactRole) {
		this.contactRole = contactRole;
	}

	public String getContactRole() {
		return contactRole;
	}

	public void setContactStatus(String contactStatus) {
		this.contactStatus = contactStatus;
	}

	public String getContactStatus() {
		return contactStatus;
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
}
