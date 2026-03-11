package sunrise.crm.xvo.bizOrder;

import java.util.Map;

/**
 * Class for the site search - The Billing Site, Site-A, Pop-A, Site-Z, Pop-Z.
 * @author arthur 
 * @notes  
 */
public class BizOrderSiteSearchVo {
    
    private String siteObjid;
    private String type;
    private String industryType;
    private String status;
    private String siteId;
    private String siteName;
    private String address;
    private String zipcode;
    private String city;
    private String serviceId;
    private String address2;
    private String state;
    private String country;
    private String floor;
    private String roomNumber;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************
    
    public BizOrderSiteSearchVo(){}
    
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

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
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

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress2() {
		return address2;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFloor() {
		return floor;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}
}
