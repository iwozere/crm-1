package sunrise.crm.xvo.pack;

import sunrise.crm.xvo.order.XLineItemVo;

import java.util.Arrays;
import java.util.StringJoiner;

public class XProductInfoVo {
	private String productName;
	private String productSerial;
	private XLineItemVo[] lineItems;
	private String orderAction;
	private String ipId;
	private String orderSubAction = "None";
	private String verifyOffer;
	private String mrcNow;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductSerial() {
		return productSerial;
	}
	public void setProductSerial(String productSerial) {
		this.productSerial = productSerial;
	}
	public XLineItemVo[] getLineItems() {
		return lineItems;
	}
	public void setLineItems(XLineItemVo[] lineItems) {
		this.lineItems = lineItems;
	}
	public String getOrderAction() {
		return orderAction;
	}
	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}
	public String getIpId() {
		return ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}
	public String getOrderSubAction() {
		return orderSubAction;
	}
	public void setOrderSubAction(String orderSubAction) {
		this.orderSubAction = orderSubAction;
	}
	
	public String getVerifyOffer() {
		return verifyOffer;
	}
	public void setVerifyOffer(String verifyOffer) {
		this.verifyOffer = verifyOffer;
	}

	public String getMrcNow() {
		return mrcNow;
	}

	public void setMrcNow(String mrcNow) {
		this.mrcNow = mrcNow;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", XProductInfoVo.class.getSimpleName() + "[", "]")
				.add("productName='" + productName + "'")
				.add("productSerial='" + productSerial + "'")
				.add("lineItems=" + Arrays.toString(lineItems))
				.add("orderAction='" + orderAction + "'")
				.add("ipId='" + ipId + "'")
				.add("orderSubAction='" + orderSubAction + "'")
				.add("verifyOffer='" + verifyOffer + "'")
				.add("mrcNow='" + mrcNow + "'")
				.toString();
	}
}