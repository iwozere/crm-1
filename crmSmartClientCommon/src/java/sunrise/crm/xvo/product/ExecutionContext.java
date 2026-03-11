package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sunrise.crm.util.CrmStringUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class contains ONLY POJO objects. PLEASE DO NOT PUT BOs into it.
 *
 * It should be possible to pass this data between contexts, so using BOs would lead to backend crashes.
 *
 * @author Kosyrev
 *
 */
public class ExecutionContext {

	private static Log log = LogFactory.getLog(ExecutionContext.class);

	public static final String IN_MEMORY_OBJID_PREFIX = "IM";
	
	public static final String KEY_CURRENT_PRODUCTS = "currentProducts";
	public static final String KEY_CQ_RESPONSE = "captureQotationResponse";
	public static final String KEY_BUNDLED_PROMOTIONS = "bundledPromotions";
	public static final String KEY_EXCLUDE_CAMPAIGN_TYPES = "ExcludeCampaignTypes";

	
	public InMemoryObjidGenerator objidGenerator = new InMemoryObjidGenerator();

	private Map<String, ProductInfoVo> installedProductContainers = new LinkedHashMap<>();
	private Map<String, OrderInfoVo> creationOrders = new LinkedHashMap<>();
	private Map<String, XSpBundleInfoVo> siteBundles = new LinkedHashMap<>();
	private XSiteCategoryInfoVo siteCategory = null;
	private Map<String, List<OrderInfoVo>> pendingOrders = new HashMap<>();

	private ProductInfoVo currentProduct;
	private CustomerInfoVo currentCustomer;
	private Calendar creationTimestamp = Calendar.getInstance();
	
	private Map<String, Object> contextData = new HashMap<>();

	public Map<String, Object> getContextData() {
		return contextData;
	}

	public ExecutionContext(){
		log.debug("ExecutionContext created on " + creationTimestamp.getTime().toString());
	}

    public ExecutionContext(String siteId, String orderId) {
    	this();
    }

	public ExecutionContext(ExecutionContext from) {
		from.getInstalledProductContainers().forEach((s, productInfoVo) -> this.installedProductContainers.put(s, new ProductInfoVo(productInfoVo, true)));

		from.getCreationOrders().forEach((s, creationOrder) -> this.creationOrders.put(s, new OrderInfoVo(creationOrder)));

		from.getSiteBundles().forEach((s, xSpBundleInfoVo) -> this.siteBundles.put(s, new XSpBundleInfoVo(xSpBundleInfoVo)));

		if (from.getSiteCategory() != null) {
			this.siteCategory = new XSiteCategoryInfoVo(from.getSiteCategory());
		}

		from.getPendingOrders().forEach((s, pendingOrders) -> this.pendingOrders.put(s, pendingOrders.stream().map(OrderInfoVo::new).collect(Collectors.toList())));

		if (from.getCurrentProduct() != null) {
			this.currentProduct = this.installedProductContainers.get(from.getCurrentProduct().getTopSitePartObjid());
		}

		if (from.getCurrentCustomer() != null) {
			this.currentCustomer = new CustomerInfoVo(from.getCurrentCustomer());
		}

		this.creationTimestamp = from.creationTimestamp;
	}

	public List<ProductInfoVo> getInstalledProducts(){
    	return new ArrayList<>(installedProductContainers.values());
    }

    /**
     * @param targetProduct
     */
	public void provisionPart(ProductInfoVo targetProduct, ProductOptionInfoVo option, boolean delete) {
		if (targetProduct == null || option == null || CrmStringUtil.isBlank(option.getInstanceName())) {
			return;
		}
		if (CrmStringUtil.isBlank(option.getSitePartObjid())) {
			option.setSitePartObjid(String.valueOf(objidGenerator.generateObjid()));
		}
		if (delete) {
			ProductOptionInfoVo existingOption = targetProduct.getAllOptions().get(option.getSitePartObjid());
			if (CrmStringUtil.isNotEmpty(option.getActionType()) && option.getActionType().endsWith("Delete")){
				existingOption.setActionType(option.getActionType());
				if (option.isChangedByQuotation()){
					existingOption.setChangedByQuotation(option.isChangedByQuotation());
				}
			}else{
				existingOption.setActionType("Delete");
			}
		} else {
			if (CrmStringUtil.isEmpty(option.getActionType())){
				option.setActionType("Add");
			}
			targetProduct.addOption(option);
		}
	}

	public Map<String, ProductInfoVo> getChanges() {
		return installedProductContainers.entrySet()
				.stream()
				.filter(entry -> entry.getValue().getAllOptions().entrySet()
						.stream()
						.anyMatch(entryOption -> entryOption.getValue().getActionType() != null))
				.peek(entry -> {
					ProductInfoVo clone = new ProductInfoVo(entry.getValue(), true);
					Map<String, ProductOptionInfoVo> filtered = clone.getAllOptions().entrySet()
							.stream()
							.filter(entryOption -> entryOption.getValue().getActionType() != null)
							.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
					clone.setOptionsMap(filtered);
					entry.setValue(clone);
				})
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

	public void setInstalledProductContainers(Map<String, ProductInfoVo> installedProductContainers) {
		this.installedProductContainers = installedProductContainers;
	}

	/**
	 * Key - IP contract objid
	 * @param creationOrders
	 */
	public void setCreationOrders(Map<String, OrderInfoVo> creationOrders) {
		this.creationOrders = creationOrders;
	}

	public void setCurrentProduct(ProductInfoVo currentProduct) {
		this.currentProduct = currentProduct;
	}
	public void setCurrentProductByIpId(String ipId) {
		if (CrmStringUtil.isEmpty(ipId)) {
			return;
		}
		setCurrentProduct(getInstalledProductContainers().values().stream().filter(p -> ipId.equals(p.getIpId())).findFirst().orElse(null));
	}
	public void setCurrentCustomer(CustomerInfoVo currentCustomer) {
		this.currentCustomer = currentCustomer;
	}

	public Map<String, ProductInfoVo> getInstalledProductContainers() {
		return installedProductContainers;
	}

	/**
	 * Key - IP contract objid
	 * @return
	 */
	public Map<String, OrderInfoVo> getCreationOrders() {
		return creationOrders;
	}

	public ProductInfoVo getCurrentProduct() {
		return currentProduct;
	}

	public CustomerInfoVo getCurrentCustomer() {
		return currentCustomer;
	}

	public Map<String, XSpBundleInfoVo> getSiteBundles() {
		return siteBundles;
	}

	public void setSiteBundles(Map<String, XSpBundleInfoVo> siteBundles) {
		this.siteBundles = siteBundles;
	}

	public int findActiveCountByName(String partNumber) {
		return (int) installedProductContainers.values().stream()
				.flatMap(productInfoVo -> productInfoVo.getAllOptions().values().stream())
				.filter(option -> option.getInstanceName().equals(partNumber)).count();
	}

	public Calendar getCreationTimestamp() {
		return creationTimestamp;
	}
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

	public InMemoryObjidGenerator getObjidGenerator() {
		return objidGenerator;
	}

	public ProductInfoVo addProduct(ProductInfoVo product) {
		if (installedProductContainers.containsKey(product.getTopSitePartObjid())) {
			throw new IllegalArgumentException("Product with site part objid " + product.getTopSitePartObjid() + " is already in the execution context");
		}
		installedProductContainers.put(product.getTopSitePartObjid(), product);
		return product;
	}

	public XSiteCategoryInfoVo getSiteCategory() {
		return siteCategory;
	}

	public void setSiteCategory(XSiteCategoryInfoVo siteCategory) {
		this.siteCategory = siteCategory;
	}

	/**
	 * Key - IP contract objid
	 * @return
	 */
	public Map<String, List<OrderInfoVo>> getPendingOrders() {
		return pendingOrders;
	}

	/**
	 * Key - IP contract objid
	 * @param pendingOrders
	 */
	public void setPendingOrders(Map<String, List<OrderInfoVo>> pendingOrders) {
		this.pendingOrders = pendingOrders;
	}

	public XSpBundleInfoVo getWeMobileBundle() {
		if (siteBundles == null) {
			return null;
		}
		return siteBundles.values().stream().filter(bundle -> "MOBILE_PACK".equals(bundle.getBundleType())).findFirst().orElse(null);
	}

	public XSpBundleInfoVo getUpMobileBundle() {
		if (siteBundles == null) {
			return null;
		}
		return siteBundles.values().stream().filter(bundle -> "STELLA_BUNDLE".equals(bundle.getBundleType())).findFirst().orElse(null);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ExecutionContext that = (ExecutionContext) o;

		if (! checkIfInstalledProductContainersAreEqual(that)) return false;

		if (! Objects.equals(this.siteCategory, that.siteCategory)) {
			//log.debug("SiteCategory is not equal.");
			return false;
		}
        if (!Objects.equals(sortingSiteBundlesByBundleType(this.siteBundles), sortingSiteBundlesByBundleType(that.siteBundles))) {
            //log.debug("SiteBundles is not equal.");
            return false;
        }
		if (! Objects.equals(this.currentCustomer, that.currentCustomer)) {
			//log.debug("CurrentCustomer is not equal.");
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
        return Objects.hash(sortingInstalledProductContainersByIpId(this.installedProductContainers),
                sortingSiteBundlesByBundleType(siteBundles), siteCategory, currentCustomer
        );
	}

	private boolean checkIfInstalledProductContainersAreEqual(ExecutionContext that) {
		if (this.installedProductContainers.size() == that.installedProductContainers.size()) {
			if (! Objects.equals(sortingInstalledProductContainersByIpId(this.installedProductContainers)
					, sortingInstalledProductContainersByIpId(that.installedProductContainers))) {
				log.debug("InstalledProductContainers are not equal-1.");
				return false;
			}
		} else {
			log.debug("InstalledProductContainers are not equal-2.");
			return false;
		}
		return true;
	}

	private List<ProductInfoVo> sortingInstalledProductContainersByIpId(Map<String, ProductInfoVo> installedProductContainers) {
		return installedProductContainers.values().stream()
				.sorted(Comparator.comparing(ProductInfoVo::getIpId, Comparator.nullsFirst(Comparator.naturalOrder())))
				.collect(Collectors.toList());
	}

    private List<XSpBundleInfoVo> sortingSiteBundlesByBundleType(Map<String, XSpBundleInfoVo> items) {
        return new ArrayList<>(items.values()).stream()
                .sorted(Comparator.comparing(XSpBundleInfoVo::getBundleType, Comparator.nullsFirst(Comparator.naturalOrder())))
                .collect(Collectors.toList());
    }

	public List<ProductOptionInfoVo> findActiveByName(String name) {
		List<ProductOptionInfoVo> result = new ArrayList<>();
		for (ProductInfoVo prod : installedProductContainers.values()) {
			for (ProductOptionInfoVo option : prod.getActiveOptions()) {
				if (name.equals(option.getInstanceName()) && (option.getActionType() == null || !option.getActionType().endsWith("Delete")) && "Installed".equals(option.getSitePartStatus())) {
					result.add(option);
				}
			}
		}
		return result;
	}
	
	public ProductInfoVo getProductBySerial(String serialNo){
		if (CrmStringUtil.isBlank(serialNo)){
			return null;
		}
		return this.installedProductContainers.values().stream().filter(p -> serialNo.equals(p.getSerialNo())).findFirst().orElse(null);
	}

	public ProductInfoVo getProductByIpId(String ipId){
		if (CrmStringUtil.isBlank(ipId)){
			return null;
		}
		return this.installedProductContainers.values().stream().filter(p -> ipId.equals(p.getIpId())).findFirst().orElse(null);
	}

	public ProductInfoVo getProductByIpObjid(String ipObjid){
		if (CrmStringUtil.isBlank(ipObjid)){
			return null;
		}
		return this.installedProductContainers.values().stream().filter(p -> ipObjid.equals(p.getIpObjid())).findFirst().orElse(null);
	}
}
