package sunrise.crm.xvo.product;

import java.util.ArrayList;
import java.util.List;

public class XMobilePrepaidPromotionVo {

	private String name;
	private String units;
	private String value;
	private String startDate;
	private String renewalDate;
	private String expiryDate;
	private String status;
	private List<XMobilePrepaidPromotionVo> children = new ArrayList<XMobilePrepaidPromotionVo>();
	
	public XMobilePrepaidPromotionVo(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(String renewalDate) {
		this.renewalDate = renewalDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	public List<XMobilePrepaidPromotionVo> getChildren() {
		return children;
	}
	public void setChildren(List<XMobilePrepaidPromotionVo> children) {
		this.children = children;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(": name=").append(name).append(", units=").append(units)
		.append(", value=").append(value).append(", startDate=").append(startDate)
		.append(", renewalDate=").append(renewalDate).append(", expiryDate=").append(expiryDate)
		.append(", status=").append(status).append("\n")
		.append("[");
		for (XMobilePrepaidPromotionVo vo : children){
			sb.append(vo.toString());
		}
		sb.append("]").append("\n");
		return sb.toString();
	}
}
