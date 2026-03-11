package sunrise.crm.xvo.retention;

public class XLastRetentionOfferVo {
	String sourceProductName;
	String productName;
	String originalPrice;
	String discountAmount;
	String discountPerc;
	String finalPrice;
	String duration;
	String maximumArpuAmt;
	String minimumArpuAmt;
	String retentionOfferType;
	String offerPriority;
	String objid;
	String status;
	String multiDiscountAmount;
	String multiDiscountPerc;
	String multiDuration;
	String multiFinalPrice;

	String discountName;
	String productType;
	
	String sourcePhone;
	String sourceTv;
	
	String segmentType;
	
	public String getSourcePhone() {
		return sourcePhone;
	}
	public void setSourcePhone(String sourcePhone) {
		this.sourcePhone = sourcePhone;
	}
	public String getSourceTv() {
		return sourceTv;
	}
	public void setSourceTv(String sourceTv) {
		this.sourceTv = sourceTv;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountPerc() {
		return discountPerc;
	}
	public void setDiscountPerc(String discountPerc) {
		this.discountPerc = discountPerc;
	}
	public String getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getMaximumArpuAmt() {
		return maximumArpuAmt;
	}
	public void setMaximumArpuAmt(String maximumArpuAmt) {
		this.maximumArpuAmt = maximumArpuAmt;
	}
	public String getMinimumArpuAmt() {
		return minimumArpuAmt;
	}
	public void setMinimumArpuAmt(String minimumArpuAmt) {
		this.minimumArpuAmt = minimumArpuAmt;
	}
	public String getRetentionOfferType() {
		return retentionOfferType;
	}
	public void setRetentionOfferType(String retentionOfferType) {
		this.retentionOfferType = retentionOfferType;
	}
	public String getOfferPriority() {
		return offerPriority;
	}
	public void setOfferPriority(String offerPriority) {
		this.offerPriority = offerPriority;
	}
	public String getSourceProductName() {
		return sourceProductName;
	}
	public void setSourceProductName(String sourceProductName) {
		this.sourceProductName = sourceProductName;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getObjid() {
		return objid;
	}
	public String getMultiDiscountAmount() {
		return multiDiscountAmount;
	}
	public void setMultiDiscountAmount(String multiDiscountAmount) {
		this.multiDiscountAmount = multiDiscountAmount;
	}
	public String getMultiDiscountPerc() {
		return multiDiscountPerc;
	}
	public void setMultiDiscountPerc(String multiDiscountPerc) {
		this.multiDiscountPerc = multiDiscountPerc;
	}
	public String getMultiDuration() {
		return multiDuration;
	}
	public void setMultiDuration(String multiDuration) {
		this.multiDuration = multiDuration;
	}
	public String getMultiFinalPrice() {
		return multiFinalPrice;
	}
	public void setMultiFinalPrice(String multiFinalPrice) {
		this.multiFinalPrice = multiFinalPrice;
	}
	
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getSegmentType() {
		return segmentType;
	}
	public void setSegmentType(String segmentType) {
		this.segmentType = segmentType;
	}
	
	@Override
	public String toString() {
		return "XLastRetentionOfferVo [sourceProductName=" + sourceProductName + ", productName=" + productName
				+ ", originalPrice=" + originalPrice + ", discountAmount=" + discountAmount + ", discountPerc="
				+ discountPerc + ", finalPrice=" + finalPrice + ", duration=" + duration + ", maximumArpuAmt="
				+ maximumArpuAmt + ", minimumArpuAmt=" + minimumArpuAmt + ", retentionOfferType=" + retentionOfferType
				+ ", offerPriority=" + offerPriority + ", objid=" + objid + ", status=" + status
				+ ", multiDiscountAmount=" + multiDiscountAmount + ", multiDiscountPerc=" + multiDiscountPerc
				+ ", multiDuration=" + multiDuration + ", multiFinalPrice=" + multiFinalPrice + "]";
	}

}
