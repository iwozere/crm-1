package sunrise.crm.isales.order.capture;

import com.google.gson.Gson;

/**
 * This class contains information about product, having one particular product benefit, for example Extra benefit or We benefit (surf protect) for example.
 * @author Kosyrev
 *
 */
public class BenefitProductDto {
	private String topSitePartObjid;
	private String productName;
	private String productSerial;
	private String description;
	private boolean hasPendingActivationOrder;
	private boolean hasPendingModifyOrder;
	private boolean hasPendingConversionOrder;
	private boolean hasBenefitInstalled;

	public BenefitProductDto() {
	}

	public BenefitProductDto(String topSitePartObjid, String productName, String productSerial, String description, boolean hasPendingActivationOrder, boolean hasPendingModifyOrder, boolean hasPendingConversionOrder, boolean hasBenefitInstalled) {
		this.topSitePartObjid = topSitePartObjid;
		this.productName = productName;
		this.productSerial = productSerial;
		this.description = description;
		this.hasPendingActivationOrder = hasPendingActivationOrder;
		this.hasPendingModifyOrder = hasPendingModifyOrder;
		this.hasPendingConversionOrder = hasPendingConversionOrder;
		this.hasBenefitInstalled = hasBenefitInstalled;
	}

	public boolean isHasPendingConversionOrder() {
		return hasPendingConversionOrder;
	}
	public void setHasPendingConversionOrder(boolean hasPendingConversionOrder) {
		this.hasPendingConversionOrder = hasPendingConversionOrder;
	}
	public String getProductSerial() {
		return productSerial;
	}
	public void setProductSerial(String productSerial) {
		this.productSerial = productSerial;
	}
	public boolean isHasPendingActivationOrder() {
		return hasPendingActivationOrder;
	}
	public void setHasPendingActivationOrder(boolean hasPendingActivationOrder) {
		this.hasPendingActivationOrder = hasPendingActivationOrder;
	}
	public boolean isHasPendingModifyOrder() {
		return hasPendingModifyOrder;
	}
	public void setHasPendingModifyOrder(boolean hasPendingModifyOrder) {
		this.hasPendingModifyOrder = hasPendingModifyOrder;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isHasBenefitInstalled() {
		return hasBenefitInstalled;
	}

	public void setHasBenefitInstalled(boolean hasBenefitInstalled) {
		this.hasBenefitInstalled = hasBenefitInstalled;
	}

	public String getTopSitePartObjid() {
		return topSitePartObjid;
	}

	public void setTopSitePartObjid(String topSitePartObjid) {
		this.topSitePartObjid = topSitePartObjid;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
