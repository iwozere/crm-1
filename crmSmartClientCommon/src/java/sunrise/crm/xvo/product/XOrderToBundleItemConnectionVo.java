package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Calendar;
import java.util.Objects;

public class XOrderToBundleItemConnectionVo {
    private String siteId;
    private String contractObjid;
    private String contractId;
    private String bundleId;
    private String bundleItemObjid;
    private Calendar activityInstanceStartDate;
    private Calendar activityInstanceEndDate;
    private String activityInstanceTask;
    private String orderTitle;

    private static Log log = LogFactory.getLog(XOrderToBundleItemConnectionVo.class);

    public XOrderToBundleItemConnectionVo() {
    }

    public XOrderToBundleItemConnectionVo(String contractId) {
        this.contractId = contractId;
    }

    public XOrderToBundleItemConnectionVo(String siteId, String contractObjid
            , String contractId, String bundleId, String bundleItemObjid
            , Calendar activityInstanceStartDate, Calendar activityInstanceEndDate
            , String activityInstanceTask, String orderTitle) {
        this.siteId = siteId;
        this.contractObjid = contractObjid;
        this.contractId = contractId;
        this.bundleId = bundleId;
        this.bundleItemObjid = bundleItemObjid;
        this.activityInstanceStartDate = activityInstanceStartDate;
        this.activityInstanceEndDate = activityInstanceEndDate;
        this.activityInstanceTask = activityInstanceTask;
        this.orderTitle = orderTitle;
    }

    public String getSiteId() {
        return siteId;
    }
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    public String getContractObjid() {
        return contractObjid;
    }
    public void setContractObjid(String contractObjid) {
        this.contractObjid = contractObjid;
    }
    public String getContractId() {
        return contractId;
    }
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }
    public String getBundleId() {
        return bundleId;
    }
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    public String getBundleItemObjid() {
        return bundleItemObjid;
    }
    public void setBundleItemObjid(String bundleItemObjid) {
        this.bundleItemObjid = bundleItemObjid;
    }
    public Calendar getActivityInstanceStartDate() {
        return activityInstanceStartDate;
    }
    public void setActivityInstanceStartDate(Calendar activityInstanceStartDate) {
        this.activityInstanceStartDate = activityInstanceStartDate;
    }
    public Calendar getActivityInstanceEndDate() {
        return activityInstanceEndDate;
    }
    public void setActivityInstanceEndDate(Calendar activityInstanceEndDate) {
        this.activityInstanceEndDate = activityInstanceEndDate;
    }
    public String getActivityInstanceTask() {
        return activityInstanceTask;
    }
    public void setActivityInstanceTask(String activityInstanceTask) {
        this.activityInstanceTask = activityInstanceTask;
    }
    public String getOrderTitle() {
        return orderTitle;
    }
    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XOrderToBundleItemConnectionVo orderToBundleItem = (XOrderToBundleItemConnectionVo) o;

        if (!Objects.equals(this.siteId, orderToBundleItem.siteId)) {
            return false;
        }
        if (!Objects.equals(this.contractObjid, orderToBundleItem.contractObjid)) {
            return false;
        }
        if (!Objects.equals(this.contractId, orderToBundleItem.contractId)) {
            return false;
        }
        if (!Objects.equals(this.bundleId, orderToBundleItem.bundleId)) {
            return false;
        }
        if (!Objects.equals(this.bundleItemObjid, orderToBundleItem.bundleItemObjid)) {
            return false;
        }
        if (!Objects.equals(this.activityInstanceStartDate, orderToBundleItem.activityInstanceStartDate)) {
            return false;
        }
        if (!Objects.equals(this.activityInstanceEndDate, orderToBundleItem.activityInstanceEndDate)) {
            return false;
        }
        if (!Objects.equals(this.activityInstanceTask, orderToBundleItem.activityInstanceTask)) {
            return false;
        }
        if (!Objects.equals(this.orderTitle, orderToBundleItem.orderTitle)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, contractObjid, contractId, bundleId
                , bundleItemObjid, activityInstanceStartDate, activityInstanceEndDate
                , activityInstanceTask, orderTitle);
    }

    @Override
    public String toString() { return new Gson().toJson(this); }
}