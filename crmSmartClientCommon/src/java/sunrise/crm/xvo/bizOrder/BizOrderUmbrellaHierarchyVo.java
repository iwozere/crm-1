package sunrise.crm.xvo.bizOrder;

public class BizOrderUmbrellaHierarchyVo {

    private String serviceId;
    private String orderStatus;
    private int    serviceLevel;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public BizOrderUmbrellaHierarchyVo(){}
        
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
}
