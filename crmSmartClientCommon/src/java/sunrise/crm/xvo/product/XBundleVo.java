package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

public class XBundleVo {
    private String objid;
    private String dev;
    private String bundleId;
    private String bundleType;
    private String status;
    private Calendar startDate;
    private Calendar endDate;
    private Calendar updateTimeStamp;
    private Calendar createDate;
    private Calendar deinstallDate;
    private String bundle2Site;
    private String packLevel;
    private String bundle2SitePart;
    private List<XBundleItemVo> bundleItems = new ArrayList<>();

    private static Log log = LogFactory.getLog(XBundleVo.class);

    public XBundleVo() {
    }

    public XBundleVo(String objid, String dev, String bundleId, String bundleType
            , String status, Calendar startDate, Calendar endDate, Calendar updateTimeStamp
            , Calendar createDate, Calendar deinstallDate, String bundle2Site, String packLevel
            , String bundle2SitePart, List<XBundleItemVo> bundleItems) {
        this.objid = objid;
        this.dev = dev;
        this.bundleId = bundleId;
        this.bundleType = bundleType;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.updateTimeStamp = updateTimeStamp;
        this.createDate = createDate;
        this.deinstallDate = deinstallDate;
        this.bundle2Site = bundle2Site;
        this.packLevel = packLevel;
        this.bundle2SitePart = bundle2SitePart;
        this.bundleItems = bundleItems;
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
    public String getBundleId() {
        return bundleId;
    }
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    public String getBundleType() {
        return bundleType;
    }
    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Calendar getStartDate() {
        return startDate;
    }
    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }
    public Calendar getEndDate() {
        return endDate;
    }
    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }
    public Calendar getUpdateTimeStamp() {
        return updateTimeStamp;
    }
    public void setUpdateTimeStamp(Calendar updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }
    public Calendar getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }
    public Calendar getDeinstallDate() {
        return deinstallDate;
    }
    public void setDeinstallDate(Calendar deinstallDate) {
        this.deinstallDate = deinstallDate;
    }
    public String getBundle2Site() {
        return bundle2Site;
    }
    public void setBundle2Site(String bundle2Site) {
        this.bundle2Site = bundle2Site;
    }
    public String getPackLevel() {
        return packLevel;
    }
    public void setPackLevel(String packLevel) {
        this.packLevel = packLevel;
    }
    public String getBundle2SitePart() {
        return bundle2SitePart;
    }
    public void setBundle2SitePart(String bundle2SitePart) {
        this.bundle2SitePart = bundle2SitePart;
    }
    public List<XBundleItemVo> getBundleItems() {
        return bundleItems;
    }
    public void setBundleItems(List<XBundleItemVo> bundleItems) {
        this.bundleItems = bundleItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XBundleVo xBundleVo = (XBundleVo) o;
        if (!Objects.equals(this.objid, xBundleVo.objid)) {
            return false;
        }
        if (!Objects.equals(this.bundleId, xBundleVo.bundleId)) {
            return false;
        }
        if (!Objects.equals(this.bundleType, xBundleVo.bundleType)) {
            return false;
        }
        if (!Objects.equals(this.status, xBundleVo.status)) {
            return false;
        }
        if (!Objects.equals(this.startDate, xBundleVo.startDate)) {
            return false;
        }
        if (!Objects.equals(this.endDate, xBundleVo.endDate)) {
            return false;
        }
        if (!Objects.equals(this.updateTimeStamp, xBundleVo.updateTimeStamp)) {
            return false;
        }
        if (!Objects.equals(this.createDate, xBundleVo.createDate)) {
            return false;
        }
        if (!Objects.equals(this.deinstallDate, xBundleVo.deinstallDate)) {
            return false;
        }
        if (!Objects.equals(this.bundle2Site, xBundleVo.bundle2Site)) {
            return false;
        }
        if (!Objects.equals(this.packLevel, xBundleVo.packLevel)) {
            return false;
        }
        if (!Objects.equals(this.bundle2SitePart, xBundleVo.bundle2SitePart)) {
            return false;
        }
        if (!Objects.equals(this.bundleItems, xBundleVo.bundleItems)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(objid, dev, bundleId, bundleType, status, startDate
                , endDate, updateTimeStamp, createDate, deinstallDate
                , bundle2Site, packLevel, bundle2SitePart, bundleItems);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
