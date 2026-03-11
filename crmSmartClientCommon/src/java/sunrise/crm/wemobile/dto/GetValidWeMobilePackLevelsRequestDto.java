package sunrise.crm.wemobile.dto;

import com.google.gson.Gson;

public class GetValidWeMobilePackLevelsRequestDto {
    private String siteId;
    private String customerSegment;
    private ProductBundleDto activeWeMobilePack;
    private boolean hasPendingModifyOrder;


    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public boolean hasActiveWeMobilePack() {
        return getActiveWeMobilePack() != null;
    }

    public ProductBundleDto getActiveWeMobilePack() {
        return activeWeMobilePack;
    }

    public void setActiveWeMobilePack(ProductBundleDto activeWeMobilePack) {
        this.activeWeMobilePack = activeWeMobilePack;
    }

    public void setHasPendingModifyOrder(boolean hasPendingModifyOrder) {
        this.hasPendingModifyOrder = hasPendingModifyOrder;
    }

    public boolean isHasPendingModifyOrder() {
        return this.hasPendingModifyOrder;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
