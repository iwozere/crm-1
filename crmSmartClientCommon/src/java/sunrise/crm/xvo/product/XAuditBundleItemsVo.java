package sunrise.crm.xvo.product;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

public class XAuditBundleItemsVo {

    private Calendar auditTimestamp;
    private String auditUsername;
    private String auditOsuser;
    private String auditMachine;
    private String auditProgram;
    private String auditOperation;
    private String objid;
    private String dev;
    private Calendar aBundlingStartDate;
    private Calendar aBundlingEndDate;
    private String aBundleItem2SpBundle;
    private String aBundleItem2SitePart;
    private Optional<String> aStatus;
    private boolean aIsMain = false;
    private boolean aIsOrderedAsMain = false;
    private String prodObjid;
    private String productTitle;
    private String productSerial;

    private static Log log = LogFactory.getLog(XAuditBundleItemsVo.class);

    public XAuditBundleItemsVo() {
    }

    public XAuditBundleItemsVo(Calendar auditTimestamp, String auditUsername
            , String auditOsuser, String auditMachine, String auditProgram
            , String auditOperation, String objid, String dev, Calendar aBundlingStartDate
            , Calendar aBundlingEndDate, String aBundleItem2SpBundle
            , String aBundleItem2SitePart, Optional<String> aStatus, boolean aIsMain
            , boolean aIsOrderedAsMain, String prodObjid, String productTitle
            , String productSerial) {
        this.auditTimestamp = auditTimestamp;
        this.auditUsername = auditUsername;
        this.auditOsuser = auditOsuser;
        this.auditMachine = auditMachine;
        this.auditProgram = auditProgram;
        this.auditOperation = auditOperation;
        this.objid = objid;
        this.dev = dev;
        this.aBundlingStartDate = aBundlingStartDate;
        this.aBundlingEndDate = aBundlingEndDate;
        this.aBundleItem2SpBundle = aBundleItem2SpBundle;
        this.aBundleItem2SitePart = aBundleItem2SitePart;
        this.aStatus = aStatus;
        this.aIsMain = aIsMain;
        this.aIsOrderedAsMain = aIsOrderedAsMain;
        this.prodObjid = prodObjid;
        this.productTitle = productTitle;
        this.productSerial = productSerial;
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
    public Calendar getABundlingStartDate() {
        return aBundlingStartDate;
    }
    public void setABundlingStartDate(Calendar aBundlingStartDate) {
        this.aBundlingStartDate = aBundlingStartDate;
    }
    public Calendar getABundlingEndDate() {
        return aBundlingEndDate;
    }
    public void setABundlingEndDate(Calendar aBundlingEndDate) {
        this.aBundlingEndDate = aBundlingEndDate;
    }
    public String getABundleItem2SpBundle() {
        return aBundleItem2SpBundle;
    }
    public void setABundleItem2SpBundle(String aBundleItem2SpBundle) {
        this.aBundleItem2SpBundle = aBundleItem2SpBundle;
    }
    public String getABundleItem2SitePart() {
        return aBundleItem2SitePart;
    }
    public void setABundleItem2SitePart(String aBundleItem2SitePart) {
        this.aBundleItem2SitePart = aBundleItem2SitePart;
    }
    public Optional<String> getAStatus() {
        return aStatus;
    }
    public void setaStatus(String aStatus) {
        this.aStatus = Optional.ofNullable(aStatus);
    }
    public boolean isAIsMain() {
        return aIsMain;
    }
    public void setAIsMain(boolean aIsMain) {
        this.aIsMain = aIsMain;
    }
    public boolean isAIsOrderedAsMain() {
        return aIsOrderedAsMain;
    }
    public void setAIsOrderedAsMain(boolean aIsOrderedAsMain) {
        this.aIsOrderedAsMain = aIsOrderedAsMain;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XAuditBundleItemsVo auditBundleItemsVo = (XAuditBundleItemsVo) o;
        if (!Objects.equals(this.auditTimestamp, auditBundleItemsVo.auditTimestamp)) {
            return false;
        }
        if (!Objects.equals(this.auditUsername, auditBundleItemsVo.auditUsername)) {
            return false;
        }
        if (!Objects.equals(this.auditOsuser, auditBundleItemsVo.auditOsuser)) {
            return false;
        }
        if (!Objects.equals(this.auditMachine, auditBundleItemsVo.auditMachine)) {
            return false;
        }
        if (!Objects.equals(this.auditProgram, auditBundleItemsVo.auditProgram)) {
            return false;
        }
        if (!Objects.equals(this.auditOperation, auditBundleItemsVo.auditOperation)) {
            return false;
        }
        if (!Objects.equals(this.objid, auditBundleItemsVo.objid)) {
            return false;
        }
        if (!Objects.equals(this.dev, auditBundleItemsVo.dev)) {
            return false;
        }
        if (!Objects.equals(this.aBundlingStartDate, auditBundleItemsVo.aBundlingStartDate)) {
            return false;
        }
        if (!Objects.equals(this.aBundlingEndDate, auditBundleItemsVo.aBundlingEndDate)) {
            return false;
        }
        if (!Objects.equals(this.aBundleItem2SpBundle, auditBundleItemsVo.aBundleItem2SpBundle)) {
            return false;
        }
        if (!Objects.equals(this.aBundleItem2SitePart, auditBundleItemsVo.aBundleItem2SitePart)) {
            return false;
        }
        if (!Objects.equals(this.aStatus, auditBundleItemsVo.aStatus)) {
            return false;
        }
        if (!Objects.equals(this.aIsMain, auditBundleItemsVo.aIsMain)) {
            return false;
        }
        if (!Objects.equals(this.aIsOrderedAsMain, auditBundleItemsVo.aIsOrderedAsMain)) {
            return false;
        }
        if (!Objects.equals(this.prodObjid, auditBundleItemsVo.prodObjid)) {
            return false;
        }
        if (!Objects.equals(this.productTitle, auditBundleItemsVo.productTitle)) {
            return false;
        }
        if (!Objects.equals(this.productSerial, auditBundleItemsVo.productSerial)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditTimestamp, auditUsername, auditOsuser, auditMachine
                , auditProgram, auditOperation, objid, dev, aBundlingStartDate
                , aBundlingEndDate, aBundleItem2SpBundle, aBundleItem2SitePart
                , aIsMain, aIsOrderedAsMain, prodObjid, productTitle, productSerial);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
