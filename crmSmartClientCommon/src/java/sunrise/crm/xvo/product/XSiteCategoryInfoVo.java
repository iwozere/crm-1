package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XSiteCategoryInfoVo {
	
	private String objid;
	private String categoryType;
	private String name;
	private String categoryFamily;
	private int minDuration;
	private BigDecimal discountPercent;
	private boolean isDiscountPerProduct;
	private boolean isAdvantageCompatible;
	private boolean isMmbSuppressedByXoF;
	private List<XSiteCategoryProductDiscountInfoVo> productDiscounts = new ArrayList<>();
	
	private static Log log = LogFactory.getLog(XSiteCategoryInfoVo.class);

	public XSiteCategoryInfoVo() {
	}

	public XSiteCategoryInfoVo(XSiteCategoryInfoVo siteCategory) {
		this.categoryType = siteCategory.getCategoryType();
		this.name = siteCategory.getName();
		this.categoryFamily = siteCategory.getCategoryFamily();
		this.minDuration = siteCategory.getMinDuration();
		this.discountPercent = siteCategory.getDiscountPercent();
		this.isDiscountPerProduct = siteCategory.isDiscountPerProduct;
		this.isAdvantageCompatible = siteCategory.isAdvantageCompatible;
		this.isMmbSuppressedByXoF = siteCategory.isMmbSuppressedByXoF;
		this.objid = siteCategory.objid;
		siteCategory.getProductDiscounts().forEach(discount -> this.productDiscounts.add(new XSiteCategoryProductDiscountInfoVo(discount)));
	}

	/**
	 * Returns discount percentage based on either per product discount percentage or category percentage.
	 * If discount is not allowed null will be returned.
	 * @param productPartNum
	 * @return
	 */
	public BigDecimal getProductPercentage(String productPartNum){
		if (productDiscounts.isEmpty()){
			return discountPercent;
		}
		BigDecimal productDiscount = productDiscounts.stream().filter(vo -> productPartNum.equals(vo.getPartNumber())).findFirst().map(XSiteCategoryProductDiscountInfoVo::getDiscountPercent).orElse(null);
		if (productDiscount == null){
			return null;
		}else if (BigDecimal.ZERO.compareTo(productDiscount) == 0){
			return discountPercent;
		}
		return productDiscount;
	}
	
	
	public List<XSiteCategoryProductDiscountInfoVo> getProductDiscounts() {
		return productDiscounts;
	}
	public void setProductDiscounts(List<XSiteCategoryProductDiscountInfoVo> productDiscounts) {
		this.productDiscounts = productDiscounts;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategoryFamily() {
		return categoryFamily;
	}
	public void setCategoryFamily(String categoryFamily) {
		this.categoryFamily = categoryFamily;
	}
	public int getMinDuration() {
		return minDuration;
	}
	public void setMinDuration(int minDuration) {
		this.minDuration = minDuration;
	}
	public BigDecimal getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(BigDecimal discountPercent) {
		this.discountPercent = discountPercent;
	}
	public boolean isDiscountPerProduct() {
		return isDiscountPerProduct;
	}
	public void setDiscountPerProduct(boolean isDiscountPerProduct) {
		this.isDiscountPerProduct = isDiscountPerProduct;
	}
	public boolean isAdvantageCompatible() {
		return isAdvantageCompatible;
	}
	public void setAdvantageCompatible(boolean isAdvantageCompatible) {
		this.isAdvantageCompatible = isAdvantageCompatible;
	}
	public boolean isMmbSuppressedByXoF() {
		return isMmbSuppressedByXoF;
	}
	public void setMmbSuppressedByXoF(boolean isMmbSuppressedByXoF) {
		this.isMmbSuppressedByXoF = isMmbSuppressedByXoF;
	}
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		XSiteCategoryInfoVo xSiteCategoryInfoVo = (XSiteCategoryInfoVo) o;

		if (!Objects.equals(this.minDuration, xSiteCategoryInfoVo.minDuration)) {
			//log.debug("MinDuration is not equal.");
			return false;
		}
		if (!Objects.equals(this.isDiscountPerProduct, xSiteCategoryInfoVo.isDiscountPerProduct)) {
			//log.debug("IsDiscountPerProduct is not equal.");
			return false;
		}
		if (!Objects.equals(this.isAdvantageCompatible, xSiteCategoryInfoVo.isAdvantageCompatible)) {
			//log.debug("IsAdvantageCompatible is not equal.");
			return false;
		}
		if (!Objects.equals(this.objid, xSiteCategoryInfoVo.objid)) {
			//log.debug("Objid is not equal.");
			return false;
		}
		if (!Objects.equals(this.categoryType, xSiteCategoryInfoVo.categoryType)) {
			//log.debug("CategoryType is not equal.");
			return false;
		}
		if (!Objects.equals(this.name, xSiteCategoryInfoVo.name)) {
			//log.debug("Name is not equal.");
			return false;
		}
		if (!Objects.equals(this.categoryFamily, xSiteCategoryInfoVo.categoryFamily)) {
			//log.debug("CategoryFamily is not equal.");
			return false;
		}
		if (!Objects.equals(this.discountPercent, xSiteCategoryInfoVo.discountPercent)) {
			//log.debug("DiscountPercent is not equal.");
			return false;
		}
		if (!Objects.equals(this.productDiscounts, xSiteCategoryInfoVo.productDiscounts)) {
			//log.debug("ProductDiscounts is not equal.");
			return false;
		}
		 return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(objid, categoryType, name, categoryFamily, minDuration, discountPercent, isDiscountPerProduct, isAdvantageCompatible, productDiscounts);
	}
}
