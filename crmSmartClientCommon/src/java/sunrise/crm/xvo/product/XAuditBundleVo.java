package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class XAuditBundleVo {

    private Calendar auditTimestamp;
    private String auditUsername;
    private String auditOsuser;
    private String auditMachine;
    private String auditProgram;
    private String auditOperation;
    private String objid;
    private String dev;
    private String aBundleId;
    private String aBundleType;
    private String aStatus;
    private Calendar aStartDate;
    private Calendar aEndDate;
    private Calendar aUpdateStmp;
    private Calendar aCreateDate;
    private Calendar aDeinstallDate;
    private String aBundle2Site;
    private String aPackLevel;
    private String aBundle2SitePart;
    private List<XAuditBundleItemsVo> aBundleItems = new ArrayList<>();

    private static Log log = LogFactory.getLog(XAuditBundleVo.class);

    public XAuditBundleVo() {
    }

    public XAuditBundleVo(Calendar auditTimestamp, String auditUsername
            , String auditOsuser, String auditMachine, String auditProgram
            , String auditOperation, String objid, String dev, String aBundleId
            , String aBundleType, String aStatus, Calendar aStartDate
            , Calendar aEndDate, Calendar aUpdateStmp, Calendar aCreateDate
            , Calendar aDeinstallDate, String aBundle2Site, String aPackLevel
            , String aBundle2SitePart, List<XAuditBundleItemsVo> aBundleItems) {
        this.auditTimestamp = auditTimestamp;
        this.auditUsername = auditUsername;
        this.auditOsuser = auditOsuser;
        this.auditMachine = auditMachine;
        this.auditProgram = auditProgram;
        this.auditOperation = auditOperation;
        this.objid = objid;
        this.dev = dev;
        this.aBundleId = aBundleId;
        this.aBundleType = aBundleType;
        this.aStatus = aStatus;
        this.aStartDate = aStartDate;
        this.aEndDate = aEndDate;
        this.aUpdateStmp = aUpdateStmp;
        this.aCreateDate = aCreateDate;
        this.aDeinstallDate = aDeinstallDate;
        this.aBundle2Site = aBundle2Site;
        this.aPackLevel = aPackLevel;
        this.aBundle2SitePart = aBundle2SitePart;
        this.aBundleItems = aBundleItems;
    }

    public Calendar getAuditTimestamp() {
        return auditTimestamp;
    }
    public void setAuditTimestamp(Calendar auditTimestamp) {
        this.auditTimestamp = auditTimestamp;
    }
    public String getAuditUsername() {
        return auditUsername;
    }
    public void setAuditUsername(String auditUsername) {
        this.auditUsername = auditUsername;
    }
    public String getAuditOsuser() {
        return auditOsuser;
    }
    public void setAuditOsuser(String auditOsuser) {
        this.auditOsuser = auditOsuser;
    }
    public String getAuditMachine() {
        return auditMachine;
    }
    public void setAuditMachine(String auditMachine) {
        this.auditMachine = auditMachine;
    }
    public String getAuditProgram() {
        return auditProgram;
    }
    public void setAuditProgram(String auditProgram) {
        this.auditProgram = auditProgram;
    }
    public String getAuditOperation() {
        return auditOperation;
    }
    public void setAuditOperation(String auditOperation) {
        this.auditOperation = auditOperation;
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
    public String getABundleId() {
        return aBundleId;
    }
    public void setABundleId(String aBundleId) {
        this.aBundleId = aBundleId;
    }
    public String getABundleType() {
        return aBundleType;
    }
    public void setABundleType(String aBundleType) {
        this.aBundleType = aBundleType;
    }
    public String getAStatus() {
        return aStatus;
    }
    public void setAStatus(String aStatus) {
        this.aStatus = aStatus;
    }
    public Calendar getAStartDate() {
        return aStartDate;
    }
    public void setAStartDate(Calendar aStartDate) {
        this.aStartDate = aStartDate;
    }
    public Calendar getAEndDate() {
        return aEndDate;
    }
    public void setAEndDate(Calendar aEndDate) {
        this.aEndDate = aEndDate;
    }
    public Calendar getAUpdateStmp() {
        return aUpdateStmp;
    }
    public void setAUpdateStmp(Calendar aUpdateStmp) {
        this.aUpdateStmp = aUpdateStmp;
    }
    public Calendar getACreateDate() {
        return aCreateDate;
    }
    public void setACreateDate(Calendar aCreateDate) {
        this.aCreateDate = aCreateDate;
    }
    public Calendar getADeinstallDate() {
        return aDeinstallDate;
    }
    public void setADeinstallDate(Calendar aDeinstallDate) {
        this.aDeinstallDate = aDeinstallDate;
    }
    public String getABundle2Site() {
        return aBundle2Site;
    }
    public void setABundle2Site(String aBundle2Site) {
        this.aBundle2Site = aBundle2Site;
    }
    public String getAPackLevel() {
        return aPackLevel;
    }
    public void setAPackLevel(String aPackLevel) {
        this.aPackLevel = aPackLevel;
    }
    public String getABundle2SitePart() {
        return aBundle2SitePart;
    }
    public void setABundle2SitePart(String aBundle2SitePart) {
        this.aBundle2SitePart = aBundle2SitePart;
    }
    public List<XAuditBundleItemsVo> getABundleItems() {
        return aBundleItems;
    }
    public void setABundleItems(List<XAuditBundleItemsVo> aBundleItems) {
        this.aBundleItems = aBundleItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XAuditBundleVo auditBundleVo = (XAuditBundleVo) o;
        if (!Objects.equals(this.auditTimestamp, auditBundleVo.auditTimestamp)) {
            return false;
        }
        if (!Objects.equals(this.auditUsername, auditBundleVo.auditUsername)) {
            return false;
        }
        if (!Objects.equals(this.auditOsuser, auditBundleVo.auditOsuser)) {
            return false;
        }
        if (!Objects.equals(this.auditMachine, auditBundleVo.auditMachine)) {
            return false;
        }
        if (!Objects.equals(this.auditProgram, auditBundleVo.auditProgram)) {
            return false;
        }
        if (!Objects.equals(this.auditOperation, auditBundleVo.auditOperation)) {
            return false;
        }
        if (!Objects.equals(this.objid, auditBundleVo.objid)) {
            return false;
        }
        if (!Objects.equals(this.dev, auditBundleVo.dev)) {
            return false;
        }
        if (!Objects.equals(this.aBundleId, auditBundleVo.aBundleId)) {
            return false;
        }
        if (!Objects.equals(this.aBundleType, auditBundleVo.aBundleType)) {
            return false;
        }
        if (!Objects.equals(this.aStatus, auditBundleVo.aStatus)) {
            return false;
        }
        if (!Objects.equals(this.aStartDate, auditBundleVo.aStartDate)) {
            return false;
        }
        if (!Objects.equals(this.aEndDate, auditBundleVo.aEndDate)) {
            return false;
        }
        if (!Objects.equals(this.aCreateDate, auditBundleVo.aCreateDate)) {
            return false;
        }
        if (!Objects.equals(this.aDeinstallDate, auditBundleVo.aDeinstallDate)) {
            return false;
        }
        if (!Objects.equals(this.aBundle2Site, auditBundleVo.aBundle2Site)) {
            return false;
        }
        if (!Objects.equals(this.aPackLevel, auditBundleVo.aPackLevel)) {
            return false;
        }
        if (!Objects.equals(this.aBundle2SitePart, auditBundleVo.aBundle2SitePart)) {
            return false;
        }
        if (!Objects.equals(this.aBundleItems, auditBundleVo.aBundleItems)) {
            return false;
        }
        if (!Objects.equals(this.aUpdateStmp, auditBundleVo.aUpdateStmp)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditTimestamp, auditUsername, auditOsuser
                , auditMachine, auditProgram, auditOperation, objid, dev, aBundleId
                , aBundleType, aStatus, aStartDate, aEndDate, aUpdateStmp
                , aCreateDate, aDeinstallDate, aBundle2Site, aPackLevel
                , aBundle2SitePart, aBundleItems);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
