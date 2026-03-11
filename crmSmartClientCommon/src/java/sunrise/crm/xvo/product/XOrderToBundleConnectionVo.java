package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Calendar;
import java.util.Objects;

public class XOrderToBundleConnectionVo {
    private String contractObjid;
    private String contractID;
    private String activityInstanceStatus;
    private Calendar activityInstanceStartTimeStamp;
    private Calendar activityInstanceEndTimeStamp;
    private String activityInstanceTask;
    private String bundleId;
    private Calendar bundleStartDate;
    private Calendar bundleUpdateDate;
    private String ipContractId;
    private String orderTitle;

    private static Log log = LogFactory.getLog(XOrderToBundleConnectionVo.class);

    public XOrderToBundleConnectionVo() {
    }

    public XOrderToBundleConnectionVo(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public XOrderToBundleConnectionVo(String contractObjid, String contractID
            , String activityInstanceStatus, Calendar activityInstanceStartTimeStamp
            , Calendar activityInstanceEndTimeStamp, String activityInstanceTask
            , String bundleId, Calendar bundleStartDate, Calendar bundleUpdateDate
            , String ipContractId, String orderTitle) {
        this.contractObjid = contractObjid;
        this.contractID = contractID;
        this.activityInstanceStatus = activityInstanceStatus;
        this.activityInstanceStartTimeStamp = activityInstanceStartTimeStamp;
        this.activityInstanceEndTimeStamp = activityInstanceEndTimeStamp;
        this.activityInstanceTask = activityInstanceTask;
        this.bundleId = bundleId;
        this.bundleStartDate = bundleStartDate;
        this.bundleUpdateDate = bundleUpdateDate;
        this.ipContractId = ipContractId;
        this.orderTitle = orderTitle;
    }

    public String getContractObjid() {
        return contractObjid;
    }
    public void setContractObjid(String contractObjid) {
        this.contractObjid = contractObjid;
    }
    public String getContractID() {
        return contractID;
    }
    public void setContractID(String contractID) {
        this.contractID = contractID;
    }
    public String getActivityInstanceStatus() {
        return activityInstanceStatus;
    }
    public void setActivityInstanceStatus(String activityInstanceStatus) {
        this.activityInstanceStatus = activityInstanceStatus;
    }
    public Calendar getActivityInstanceTimeStamp() {
        return activityInstanceStartTimeStamp;
    }
    public Calendar getActivityInstanceStartTimeStamp() {
        return activityInstanceStartTimeStamp;
    }
    public void setActivityInstanceStartTimeStamp(Calendar activityInstanceStartTimeStamp) {
        this.activityInstanceStartTimeStamp = activityInstanceStartTimeStamp;
    }
    public Calendar getActivityInstanceEndTimeStamp() {
        return activityInstanceEndTimeStamp;
    }
    public void setActivityInstanceEndTimeStamp(Calendar activityInstanceEndTimeStamp) {
        this.activityInstanceEndTimeStamp = activityInstanceEndTimeStamp;
    }
    public void setActivityInstanceTask(String activityInstanceTask) {
        this.activityInstanceTask = activityInstanceTask;
    }
    public String getActivityInstanceTask() {
        return activityInstanceTask;
    }
    public String getBundleId() {
        return bundleId;
    }
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    public Calendar getBundleStartDate() {
        return bundleStartDate;
    }
    public void setBundleStartDate(Calendar bundleStartDate) {
        this.bundleStartDate = bundleStartDate;
    }
    public Calendar getBundleUpdateDate() {
        return bundleUpdateDate;
    }
    public void setBundleUpdateDate(Calendar bundleUpdateDate) {
        this.bundleUpdateDate = bundleUpdateDate;
    }
    public String getIpContractId() {
        return ipContractId;
    }
    public void setIpContractId(String ipContractId) {
        this.ipContractId = ipContractId;
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
        XOrderToBundleConnectionVo orderToBundle = (XOrderToBundleConnectionVo) o;

        if (!Objects.equals(this.contractObjid, orderToBundle.contractObjid)) {
            return false;
        }
        if (!Objects.equals(this.contractID, orderToBundle.contractID)) {
            return false;
        }
        if (!Objects.equals(this.activityInstanceStatus, orderToBundle.activityInstanceStatus)) {
            return false;
        }
        if (!Objects.equals(this.activityInstanceStartTimeStamp, orderToBundle.activityInstanceStartTimeStamp)) {
            return false;
        }
        if (!Objects.equals(this.activityInstanceEndTimeStamp, orderToBundle.activityInstanceEndTimeStamp)) {
            return false;
        }
        if (!Objects.equals(this.activityInstanceTask, orderToBundle.activityInstanceTask)) {
            return false;
        }
        if (!Objects.equals(this.bundleId, orderToBundle.bundleId)) {
            return false;
        }
        if (!Objects.equals(this.bundleStartDate, orderToBundle.bundleStartDate)) {
            return false;
        }
        if (!Objects.equals(this.bundleUpdateDate, orderToBundle.bundleUpdateDate)) {
            return false;
        }
        if (!Objects.equals(this.ipContractId, orderToBundle.ipContractId)) {
            return false;
        }
        if (!Objects.equals(this.orderTitle, orderToBundle.orderTitle)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractObjid, contractID, activityInstanceStatus
                , activityInstanceStartTimeStamp, activityInstanceEndTimeStamp
                , activityInstanceTask, bundleId, bundleStartDate, bundleUpdateDate
                , ipContractId, orderTitle);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
