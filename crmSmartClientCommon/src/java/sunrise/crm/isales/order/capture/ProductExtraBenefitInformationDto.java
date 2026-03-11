package sunrise.crm.isales.order.capture;

import com.google.gson.Gson;

public class ProductExtraBenefitInformationDto {
	private String productName;
	private String productPartNumObjid;
	private String productPartClass;
	private String baseFee;
	private String price;
	private boolean preSelectOption;

	public String getProductPartClass() {
		return productPartClass;
	}

	public void setProductPartClass(String productPartClass) {
		this.productPartClass = productPartClass;
	}

	public String getProductPartNumObjid() {
		return productPartNumObjid;
	}

	public void setProductPartNumObjid(String productPartNumObjid) {
		this.productPartNumObjid = productPartNumObjid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBaseFee() {
		return baseFee;
	}

	public void setBaseFee(String baseFee) {
		this.baseFee = baseFee;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isPreSelectOption() {
		return preSelectOption;
	}

	public void setPreSelectOption(boolean preSelectOption) {
		this.preSelectOption = preSelectOption;
	}

	@Override public String toString() {
		return new Gson().toJson(this);
	}
}
