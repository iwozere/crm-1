package sunrise.crm.product.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import sunrise.crm.xvo.product.ProductAttributeInfoVo;
import sunrise.crm.xvo.product.ProductOptionInfoVo;

public class ProductItemInfoDto {
	private String name;
	private String displayName;
	private String objid;
	private String partType;
	private String parentSitePartObjid;
	private BigDecimal rcAmount;
	private BigDecimal nrcAmount;
	private List<ProductAttributeInfoVo> attributes = new ArrayList<>();
	private List<ProductItemInfoDto> items = new ArrayList<>();
	
	public ProductItemInfoDto(){}
	
	public ProductItemInfoDto(ProductItemInfoDto i){
		if (i == null){
			return;
		}
		this.setDisplayName(i.getDisplayName());
		this.setName(i.getName());
		this.setNrcAmount(i.getNrcAmount());
		this.setObjid(i.getObjid());
		this.setParentSitePartObjid(i.getParentSitePartObjid());
		this.setPartType(i.getPartType());
		this.setRcAmount(i.getRcAmount());
		for (ProductAttributeInfoVo a : i.getAttributes()){
			attributes.add(new ProductAttributeInfoVo(a));
		}
		for (ProductItemInfoDto childItem : i.getItems()){
			items.add(new ProductItemInfoDto(childItem));
		}
	}

	public ProductItemInfoDto(ProductOptionInfoVo i){
		if (i == null){
			return;
		}
		this.setDisplayName(i.getInstanceName());
		this.setName(i.getInstanceName());
		this.setNrcAmount(i.getOneTimeCharge());
		this.setObjid(i.getSitePartObjid());
		this.setParentSitePartObjid(i.getParentSitePartObjid() == null || i.getParentSitePartObjid().isEmpty() ? null : i.getParentSitePartObjid().get(0));
		this.setPartType(i.getPartType());
		this.setRcAmount(i.getRecurringCharge());
		for (ProductAttributeInfoVo a : i.getAttributes()){
			attributes.add(new ProductAttributeInfoVo(a));
		}
		
		for (ProductOptionInfoVo child : i.getChildOptions()){
			items.add(new ProductItemInfoDto(child));
		}
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
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getPartType() {
		return partType;
	}
	public void setPartType(String partType) {
		this.partType = partType;
	}
	public String getParentSitePartObjid() {
		return parentSitePartObjid;
	}
	public void setParentSitePartObjid(String parentSitePartObjid) {
		this.parentSitePartObjid = parentSitePartObjid;
	}
	public BigDecimal getRcAmount() {
		return rcAmount;
	}
	public void setRcAmount(BigDecimal rcAmount) {
		this.rcAmount = rcAmount;
	}
	public BigDecimal getNrcAmount() {
		return nrcAmount;
	}
	public void setNrcAmount(BigDecimal nrcAmount) {
		this.nrcAmount = nrcAmount;
	}	
	public List<ProductItemInfoDto> getItems() {
		return items;
	}
	public void setItems(List<ProductItemInfoDto> items) {
		this.items = items;
	}
}
