package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

public class XBundleItemVo {
    private String objid;
    private String dev;
    private Calendar bundlingStartDate;
    private Calendar bundlingEndDate;
    private String bundleItem2SpBundle;
    private String bundleItem2SitePart;
    private Optional<String> status;
    private boolean isMain = false;
    private boolean isOrderedAsMain = false;
    private String prodObjid;
    private String productTitle;
    private String productSerial;

    private static Log log = LogFactory.getLog(XBundleItemVo.class);

    public XBundleItemVo() {
    }

    public XBundleItemVo(String objid, String dev, Calendar bundleStartDate
            , Calendar bundleEndDate, String bundleItem2SpBundle
            , String bundleItem2SitePart, Optional<String> status, boolean isMain
            , boolean isOrderedAsMain, String prodObjid, String productTitle
            , String productSerial) {
        this.objid = objid;
        this.dev = dev;
        this.bundlingStartDate = bundleStartDate;
        this.bundlingEndDate = bundleEndDate;
        this.bundleItem2SpBundle = bundleItem2SpBundle;
        this.bundleItem2SitePart = bundleItem2SitePart;
        this.status = status;
        this.isMain = isMain;
        this.isOrderedAsMain = isOrderedAsMain;
        this.prodObjid = prodObjid;
        this.productTitle = productTitle;
        this.productSerial = productSerial;
    }

    public String getObjid() {
        return objid;
    }
    public void setObjid(String objid) {
        this.objid = objid;
    }
    public String getDev() {
        return dev;
    }
    public void setDev(String dev) {
        this.dev = dev;
    }
    public Calendar getBundlingStartDate() {
        return bundlingStartDate;
    }
    public void setBundlingStartDate(Calendar bundlingStartDate) {
        this.bundlingStartDate = bundlingStartDate;
    }
    public Calendar getBundlingEndDate() {
        return bundlingEndDate;
    }
    public void setBundlingEndDate(Calendar bundlingEndDate) {
        this.bundlingEndDate = bundlingEndDate;
    }
    public String getBundleItem2SpBundle() {
        return bundleItem2SpBundle;
    }
    public void setBundleItem2SpBundle(String bundleItem2SpBundle) {
        this.bundleItem2SpBundle = bundleItem2SpBundle;
    }
    public String getBundleItem2SitePart() {
        return bundleItem2SitePart;
    }
    public void setBundleItem2SitePart(String bundleItem2SitePart) {
        this.bundleItem2SitePart = bundleItem2SitePart;
    }
    public Optional<String> getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = Optional.ofNullable(status);
    }
    public String getProdObjid() {
        return prodObjid;
    }
    public void setProdObjid(String prodObjid) {
        this.prodObjid = prodObjid;
    }
    public String getProductTitle() {
        return productTitle;
    }
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }
    public String getProductSerial() {
        return productSerial;
    }
    public void setProductSerial(String productSerial) {
        this.productSerial = productSerial;
    }
    public boolean getIsMain() {
        return isMain;
    }
    public void setMainSubscription(boolean isMain) {
        this.isMain = isMain;
    }
    public boolean getOrderedAsMain() {
        return isOrderedAsMain;
    }
    public void setOrderedAsMain(boolean isOrderedAsMain) {
        this.isOrderedAsMain = isOrderedAsMain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XBundleItemVo xBundleItemVo = (XBundleItemVo) o;

        if (!Objects.equals(this.objid, xBundleItemVo.objid)) {
            return false;
        }
        if (!Objects.equals(this.dev, xBundleItemVo.dev)) {
            return false;
        }
        if (!Objects.equals(this.bundlingStartDate, xBundleItemVo.bundlingStartDate)) {
            return false;
        }
        if (!Objects.equals(this.bundlingEndDate, xBundleItemVo.bundlingEndDate)) {
            return false;
        }
        if (!Objects.equals(this.bundleItem2SpBundle, xBundleItemVo.bundleItem2SpBundle)) {
            return false;
        }
        if (!Objects.equals(this.bundleItem2SitePart, xBundleItemVo.bundleItem2SitePart)) {
            return false;
        }
        if (!Objects.equals(this.status, xBundleItemVo.status)) {
            return false;
        }
        if (!Objects.equals(this.isMain, xBundleItemVo.isMain)) {
            return false;
        }
        if (!Objects.equals(this.isOrderedAsMain, xBundleItemVo.isOrderedAsMain)) {
            return false;
        }
        if (!Objects.equals(this.prodObjid, xBundleItemVo.prodObjid)) {
            return false;
        }
        if (!Objects.equals(this.productTitle, xBundleItemVo.productTitle)) {
            return false;
        }
        if (!Objects.equals(this.productSerial, xBundleItemVo.productSerial)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(objid, dev, bundlingStartDate, bundlingEndDate, bundleItem2SpBundle
                , bundleItem2SitePart, status, isMain, isOrderedAsMain);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
