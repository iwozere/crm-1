package sunrise.crm.xvo.bizOrder;

public class UmbrellaHierarchyVo {

    private String serviceId;
    private String orderStatus;
    private int    serviceLevel;
    private String parentServiceId;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public UmbrellaHierarchyVo(){}
        
    // ***************************
    // *** Setters and getters ***
    // ***************************
        
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

    public void setServiceLevel(int serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
        
    public int getServiceLevel() {
        return serviceLevel;
    }

	public String getParentServiceId() {
		return parentServiceId;
	}

	public void setParentServiceId(String parentServiceId) {
		this.parentServiceId = parentServiceId;
	}
}
