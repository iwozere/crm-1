package sunrise.crm.xvo.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XSiteCatProdDiscCustVO {
	
	private String objid;
	private double x_discount_pct;
	private String xSiteCatObjid;
	private String xPartNumObjid;
	private String partNumber;
	private String internetObjid ;
	private String voiceObjid ;
	private String tvObjid ;
	private String tvPartName ;
	private String voicePartName ;
	private String internetPartName ;
	private String productLine ;
	private String price;
	private String endPrice;
	private String discountAmount;
	private String trinityFlag ;
	private String[] trinityOptions ;
	
	private static final List<String> trinityValues = new ArrayList<String>(Arrays.asList("true","false"));
	
	public XSiteCatProdDiscCustVO() {
		setTrinityOptions(trinityValues.toArray(new String[0])) ;
	}
	
	public String[] getTrinityOptions() {
		return trinityOptions;
	}
	public void setTrinityOptions(String[] trinityOptions) {
		this.trinityOptions = trinityOptions;
	}
	
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public double getXDiscountPct() {
		return x_discount_pct;
	}

	public void setXDiscountPct(double d) {
		this.x_discount_pct = d;
	}
	public String getXSiteCatObjid() {
		return xSiteCatObjid;
	}
	public void setXSiteCatObjid(String xSiteCatObjid) {
		this.xSiteCatObjid = xSiteCatObjid;
	}
	public String getXPartNumObjid() {
		return xPartNumObjid;
	}
	public void setXPartNumObjid(String xPartNumObjid) {
		this.xPartNumObjid = xPartNumObjid;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getInternetObjid() {
		return internetObjid;
	}
	public void setInternetObjid(String internetObjid) {
		this.internetObjid = internetObjid;
	}
	public String getVoiceObjid() {
		return voiceObjid;
	}
	public void setVoiceObjid(String voiceObjid) {
		this.voiceObjid = voiceObjid;
	}
	public String getTvObjid() {
		return tvObjid;
	}
	public void setTvObjid(String tvObjid) {
		this.tvObjid = tvObjid;
	}
	public String getTvPartName() {
		return tvPartName;
	}
	public void setTvPartName(String tvPartName) {
		this.tvPartName = tvPartName;
	}
	public String getVoicePartName() {
		return voicePartName;
	}
	public void setVoicePartName(String voicePartName) {
		this.voicePartName = voicePartName;
	}
	public String getInternetPartName() {
		return internetPartName;
	}
	public void setInternetPartName(String internetPartName) {
		this.internetPartName = internetPartName;
	}
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getTrinityFlag() {
		return trinityFlag;
	}
	public void setTrinityFlag(String trinityFlag) {
		this.trinityFlag = trinityFlag;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	
}
