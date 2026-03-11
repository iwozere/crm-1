package sunrise.crm.product.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sunrise.crm.xvo.product.ProductAttributeInfoVo;
import sunrise.crm.xvo.product.ProductInfoVo;
import sunrise.crm.xvo.product.ProductOptionInfoVo;

public class ProductInfoDto {

	//private static final List<String> DISCOUNT_PART_TYPES = Arrays.asList(PartType.PROMOTION.toString(), PartType.DISCOUNT.toString(), PartType.LOYALTY.toString());
	
	private String objid;
	private String name;
	private String serialNo;
	private String displayName;
	private Date contractStartDate;
	private Date contractEndDate;
	private int contractDuration;
	private BigDecimal rcGrandTotal = BigDecimal.ZERO;
	private BigDecimal rcDiscountsTotal = BigDecimal.ZERO;
	private BigDecimal rcTotal = BigDecimal.ZERO;
	private BigDecimal nrcGrandTotal = BigDecimal.ZERO;
	private BigDecimal nrcDiscountsTotal = BigDecimal.ZERO;
	private BigDecimal nrcTotal = BigDecimal.ZERO;
	private List<ProductAttributeInfoVo> attributes = new ArrayList<>();
	private List<ProductItemInfoDto> items = new ArrayList<>();
	
	public ProductInfoDto(){}
	
	public ProductInfoDto(ProductInfoDto p){
		if (p == null){
			return;
		}
		this.setContractDuration(p.getContractDuration());
		this.setContractEndDate(p.getContractEndDate());
		this.setContractStartDate(p.getContractStartDate());
		this.setName(p.getName());
		this.setNrcDiscountsTotal(p.getNrcDiscountsTotal());
		this.setNrcGrandTotal(p.getNrcGrandTotal());
		this.setNrcTotal(p.getNrcTotal());
		this.setObjid(p.getObjid());
		this.setRcDiscountsTotal(p.getRcDiscountsTotal());
		this.setRcGrandTotal(p.getRcGrandTotal());
		this.setRcTotal(p.getRcTotal());
		this.setSerialNo(p.getSerialNo());
		
		for (ProductAttributeInfoVo a : p.getAttributes()){
			attributes.add(new ProductAttributeInfoVo(a));
		}
		
		for (ProductItemInfoDto i : p.getItems()){
			items.add(new ProductItemInfoDto(i));
		}
	}

	public ProductInfoDto(ProductInfoVo p){
		if (p == null){
			return;
		}
		this.setContractDuration(p.getIpDuration());
		this.setContractEndDate(p.getIpExpireDate() == null ? null : p.getIpExpireDate().getTime());
		this.setContractStartDate(p.getIpStartDate() == null ? null : p.getIpStartDate().getTime());
		this.setName(p.getProductName());
		this.setObjid(p.getTopSitePartObjid());
		this.setSerialNo(p.getSerialNo());
		
		for (ProductAttributeInfoVo a : p.getAttributes()){
			attributes.add(new ProductAttributeInfoVo(a));
		}
		
		for (ProductOptionInfoVo o : p.getActiveBillableOptions()){
			items.add(new ProductItemInfoDto(o));
		}

		calculateTotals();
	}
	
	private void calculateTotals(){
		// Calculate amounts for all the billable items
		for (ProductItemInfoDto charge : items){
			rcGrandTotal = rcGrandTotal.add(charge.getRcAmount());
			nrcGrandTotal = nrcGrandTotal.add(charge.getNrcAmount());
			for (ProductItemInfoDto discount : charge.getItems()){
				rcDiscountsTotal = rcDiscountsTotal.add(discount.getRcAmount());
				nrcDiscountsTotal = nrcDiscountsTotal.add(discount.getNrcAmount());
			}
		}
		this.setNrcDiscountsTotal(nrcDiscountsTotal);
		this.setNrcGrandTotal(nrcGrandTotal);
		this.setNrcTotal(nrcGrandTotal.add(nrcDiscountsTotal));
		this.setRcDiscountsTotal(rcDiscountsTotal);
		this.setRcGrandTotal(rcGrandTotal);
		this.setRcTotal(rcGrandTotal.add(rcDiscountsTotal));
	}
	
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public List<ProductItemInfoDto> getItems() {
		return items;
	}
	public void setItems(List<ProductItemInfoDto> items) {
		this.items = items;
	}
	public List<ProductAttributeInfoVo> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<ProductAttributeInfoVo> attributes) {
		this.attributes = attributes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public Date getContractStartDate() {
		return contractStartDate;
	}
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}
	public Date getContractEndDate() {
		return contractEndDate;
	}
	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	public int getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}
	public BigDecimal getRcGrandTotal() {
		return rcGrandTotal;
	}
	public void setRcGrandTotal(BigDecimal rcGrandTotal) {
		this.rcGrandTotal = rcGrandTotal;
	}
	public BigDecimal getRcDiscountsTotal() {
		return rcDiscountsTotal;
	}
	public void setRcDiscountsTotal(BigDecimal rcDiscountsTotal) {
		this.rcDiscountsTotal = rcDiscountsTotal;
	}
	public BigDecimal getRcTotal() {
		return rcTotal;
	}
	public void setRcTotal(BigDecimal rcTotal) {
		this.rcTotal = rcTotal;
	}
	public BigDecimal getNrcGrandTotal() {
		return nrcGrandTotal;
	}
	public void setNrcGrandTotal(BigDecimal nrcGrandTotal) {
		this.nrcGrandTotal = nrcGrandTotal;
	}
	public BigDecimal getNrcDiscountsTotal() {
		return nrcDiscountsTotal;
	}
	public void setNrcDiscountsTotal(BigDecimal nrcDiscountsTotal) {
		this.nrcDiscountsTotal = nrcDiscountsTotal;
	}
	public BigDecimal getNrcTotal() {
		return nrcTotal;
	}
	public void setNrcTotal(BigDecimal nrcTotal) {
		this.nrcTotal = nrcTotal;
	}
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
