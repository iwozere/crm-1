package sunrise.crm.xvo.order;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;
import java.util.Date;
import java.util.StringJoiner;

public class XHardwareReturnOrderInfoVo {

    private static Log LOG = LogFactory.getLog(XHardwareReturnOrderInfoVo.class);

    private String orderId;
    private String sapMaterialId;
    private String deviceInstanceName;
    private String orderStatus;

    public XHardwareReturnOrderInfoVo() {
    }

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSapMaterialId() {
		return sapMaterialId;
	}

	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}

	@Override
	public String toString() {
		return "XHardwareReturnOrderInfoVo [orderId=" + orderId + ", sapMaterialId=" + sapMaterialId
				+ ", deviceInstanceName=" + deviceInstanceName + ", orderStatus=" + orderStatus + "]";
	}

	public String getDeviceInstanceName() {
		return deviceInstanceName;
	}

	public void setDeviceInstanceName(String deviceInstanceName) {
		this.deviceInstanceName = deviceInstanceName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
    
    
}
