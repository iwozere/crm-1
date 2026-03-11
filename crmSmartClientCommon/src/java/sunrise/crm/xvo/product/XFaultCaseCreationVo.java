package sunrise.crm.xvo.product;

public class XFaultCaseCreationVo {
	private String serialNo;                
    private String orderType;             
    private String address;
    private String nsn;
    private String accessType;
    private String status;
    private String title;
    private String productName;
    private String upkContact;

    

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************
	
    public XFaultCaseCreationVo(){}
    
    // ***************************
    // *** Setters and getters ***
    // ***************************
    
    public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNsn() {
		return nsn;
	}
	public void setNsn(String nsn) {
		this.nsn = nsn;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUpkContact() {
		return upkContact;
	}

	public void setUpkContact(String upkContact) {
		this.upkContact = upkContact;
	}


}
