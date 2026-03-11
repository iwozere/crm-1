package sunrise.crm.xvo.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;
import java.util.Objects;

public class XSiteCategoryProductDiscountInfoVo {

	private String partNumber;
	private BigDecimal discountPercent;
	private static Log log = LogFactory.getLog(XSiteCategoryProductDiscountInfoVo.class);

	public XSiteCategoryProductDiscountInfoVo() {
	}

	public XSiteCategoryProductDiscountInfoVo(XSiteCategoryProductDiscountInfoVo discount) {
		this.partNumber = discount.getPartNumber();
		this.discountPercent = discount.getDiscountPercent();
	}

	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public BigDecimal getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(BigDecimal discountPercent) {
		this.discountPercent = discountPercent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		XSiteCategoryProductDiscountInfoVo xSiteCategoryProductDiscountInfoVo = (XSiteCategoryProductDiscountInfoVo) o;

		if (!Objects.equals(this.partNumber, xSiteCategoryProductDiscountInfoVo.partNumber)) {
			//log.debug("PartNumber is not equal.");
			return false;
		}
		if (!Objects.equals(this.discountPercent, xSiteCategoryProductDiscountInfoVo.discountPercent)) {
			//log.debug("DiscountPercent is not equal.");
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(partNumber, discountPercent);
	}
}
