package sunrise.crm.wemobile.dto;

import com.google.gson.Gson;


public class ProductBundleDto {
    private String bundleId;
    private WeMobilePackLevel level;
    private boolean hasLightProduct;

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public WeMobilePackLevel getLevel() {
        return level;
    }

    public void setLevel(WeMobilePackLevel level) {
        this.level = level;
    }

    public boolean isHasLightProduct() {
        return hasLightProduct;
    }

    public void setHasLightProduct(boolean hasLightProduct) {
        this.hasLightProduct = hasLightProduct;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
