package sunrise.crm.xvo.order;

import java.io.Serializable;

public class XNetPriceVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7309140625548772667L;
	
	private String productName;
	private String price;
	private String basefee;
	private String serviceCommission;
	
	public XNetPriceVo(String productName, String price, String basefee) {
		super();
		this.productName = productName;
		this.price = price;
		this.basefee = basefee;
	}

	public XNetPriceVo(String productName) {
		super();
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBasefee() {
		return basefee;
	}

	public void setBasefee(String basefee) {
		this.basefee = basefee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getServiceCommission() {
		return serviceCommission;
	}

	public void setServiceCommission(String serviceCommission) {
		this.serviceCommission = serviceCommission;
	}

//	@Override
//	public String toString() {
//		return "XNetPriceVo [productName=" + productName + ", price=" + price + ", basefee=" + basefee + ", serviceCommision]";
//	}


	@Override
	public String toString() {
		return "XNetPriceVo {" +
				"productName='" + productName + '\'' +
				", price='" + price + '\'' +
				", basefee='" + basefee + '\'' +
				", serviceCommission='" + serviceCommission + '\'' +
				'}';
	}
}
