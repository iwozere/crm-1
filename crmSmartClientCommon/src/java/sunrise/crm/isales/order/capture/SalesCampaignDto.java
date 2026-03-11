package sunrise.crm.isales.order.capture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesCampaignDto {

	private String name;
	private String camType;
	private String hasVoucher;
	private boolean isVoucherRequired;
	private boolean hasHardware;
	private int bindingDuration;
	private String description;

	private SalesCampaignProductDto[] products;
	private SalesCampaignRulesDto[] rules;
	private SalesVoucherDto[] vouchers;
	
	private String[] requiredSapMaterialIds;
	private String[] recommendedSapMaterialIds;
	private String[] recommendedProducts;
	
	private String[] highlightedProducts;
	private String[] highlightedInternetRateplans;
	private String[] highlightedTvRateplans;
	private boolean isPromoCumulative;

	public void addRequiredSapMaterialIds(List<String> sapMaterials) {
		List<String> existingSapMaterials = new ArrayList<>();
		if (requiredSapMaterialIds != null && requiredSapMaterialIds.length > 0){
			existingSapMaterials.addAll(Arrays.asList(requiredSapMaterialIds));
		}
		existingSapMaterials.addAll(sapMaterials);
		this.requiredSapMaterialIds = existingSapMaterials.toArray(new String[0]);
	}

	public boolean hasProduct(String partNumber){
		if (products == null) return false;
		for (SalesCampaignProductDto dto : products){
			if (dto.getPartNumber().equals(partNumber)){
				return true;
			}
		}
		return false;
	}

	public SalesCampaignProductDto getProduct(String partNumber){
		if (products == null) return null;
		for (SalesCampaignProductDto dto : products){
			if (dto.getPartNumber().equals(partNumber)){
				return dto;
			}
		}
		return null;
	}

	public SalesVoucherDto[] getVouchers() {
		return vouchers;
	}

	public void setVouchers(SalesVoucherDto[] vouchers) {
		this.vouchers = vouchers;
	}

	public boolean isVoucherRequired() {
		return isVoucherRequired;
	}

	public void setVoucherRequired(boolean isVoucherRequired) {
		this.isVoucherRequired = isVoucherRequired;
	}

	public int getBindingDuration() {
		return bindingDuration;
	}

	public void setBindingDuration(int bindingDuration) {
		this.bindingDuration = bindingDuration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCamType() {
		return camType;
	}

	public void setCamType(String camType) {
		this.camType = camType;
	}

	public SalesCampaignProductDto[] getProducts() {
		return products;
	}

	public void setProducts(SalesCampaignProductDto[] prods) {
		this.products = prods;
	}

	public void addProducts(List<SalesCampaignProductDto> prods) {
		this.products = prods.toArray(new SalesCampaignProductDto[0]);
	}

	public void addProduct(SalesCampaignProductDto dto) {
		SalesCampaignProductDto x = getProduct(dto.getPartNumber());
		if (x != null){
			//products.remove(x);
		}else{
			if (products == null){
				products = new SalesCampaignProductDto[]{dto};
			}else{
				List<SalesCampaignProductDto> list = new ArrayList<>(Arrays.asList(products));
				list.add(dto);
				products = list.toArray(new SalesCampaignProductDto[0]);
			}
		}
	}

	public SalesCampaignRulesDto[] getRules() {
		return rules;
	}

	public void setRules(SalesCampaignRulesDto[] rules) {
		this.rules = rules;
	}
	
	/**
	 * These are the SAP Material IDs, required by this this particular promo.
	 * @return
	 */
	public String[] getRequiredSapMaterialIds() {
		return requiredSapMaterialIds;
	}

	/**
	 * These are the SAP Material IDs, required by this this particular promo.
	 * @param requiredPromoDPInfos
	 */
	public void setRequiredSapMaterialIds(String[] requiredPromoDPInfos) {
		this.requiredSapMaterialIds = requiredPromoDPInfos;
	}

	/**
	 * These are the SAP Material IDs, recommended by fairpay for this particular promo.
	 * @return
	 */
	public String[] getRecommendedSapMaterialIds() {
		return recommendedSapMaterialIds;
	}

	/**
	 * These are the SAP Material IDs, recommended by fairpay for this particular promo.
	 * @param optionalPromoDPInfos
	 */
	public void setRecommendedSapMaterialIds(String[] optionalPromoDPInfos) {
		this.recommendedSapMaterialIds = optionalPromoDPInfos;
	}

	/**
	 * These are the products, recommended by fairpay for this particular promo.
	 * @return
	 */
	public String[] getRecommendedProducts() {
		return recommendedProducts;
	}

	/**
	 * These are the products, recommended by fairpay for this particular promo.
	 * @param recommendedProducts
	 */
	public void setRecommendedProducts(String[] recommendedProducts) {
		this.recommendedProducts = recommendedProducts;
	}

	public String getHasVoucher() {
		return hasVoucher;
	}

	public void setHasVoucher(String hasVoucher) {
		this.hasVoucher = hasVoucher;
	}

	/**
	 * Mobile products to be highlighted in Salto (eligible for the given promotion)
	 * @return
	 */
	public String[] getHighlightedProducts() {
		return highlightedProducts;
	}

	/**
	 * Mobile products to be highlighted in Salto (eligible for the given promotion)
	 * @param highlightedProducts
	 */
	public void setHighlightedProducts(String[] highlightedProducts) {
		this.highlightedProducts = highlightedProducts;
	}

	/**
	 * Internet rate plans to be highlighted in Salto (eligible for the given promotion)
	 * @return
	 */
	public String[] getHighlightedInternetRateplans() {
		return highlightedInternetRateplans;
	}

	/**
	 * Internet rate plans to be highlighted in Salto (eligible for the given promotion)
	 * @param highlightedInternetRateplans
	 */
	public void setHighlightedInternetRateplans(String[] highlightedInternetRateplans) {
		this.highlightedInternetRateplans = highlightedInternetRateplans;
	}

	/**
	 * TV rate plans to be highlighted in Salto (eligible for the given promotion)
	 * @return
	 */
	public String[] getHighlightedTvRateplans() {
		return highlightedTvRateplans;
	}

	/**
	 * TV rate plans to be highlighted in Salto (eligible for the given promotion)
	 * @param highlightedTvRateplans
	 */
	public void setHighlightedTvRateplans(String[] highlightedTvRateplans) {
		this.highlightedTvRateplans = highlightedTvRateplans;
	}

	public boolean isHasHardware() {
		return hasHardware;
	}

	public void setHasHardware(boolean hasHardware) {
		this.hasHardware = hasHardware;
	}

	public void setPromoCumulative(boolean promoCumulative) {
		this.isPromoCumulative = promoCumulative;
	}

	public boolean isPromoCumulative() {
		return isPromoCumulative;
	}
	@Override
	public String toString() {
		return "SalesCampaignDto [name=" + name + ", camType=" + camType + ", hasVoucher=" + hasVoucher
				+ ", isVoucherRequired=" + isVoucherRequired + ", hasHardware=" + hasHardware + ", bindingDuration=" + bindingDuration
				+ ", isPromoCumulative=" + isPromoCumulative + ", products=" + Arrays.toString(products) + ", rules=" + Arrays.toString(rules) + ", vouchers="
				+ Arrays.toString(vouchers) + ", requiredSapMaterialIds=" + Arrays.toString(requiredSapMaterialIds)
				+ ", recommendedSapMaterialIds=" + Arrays.toString(recommendedSapMaterialIds) + ", recommendedProducts="
				+ Arrays.toString(recommendedProducts) + "]";
	}

}
