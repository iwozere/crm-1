package sunrise.crm.iadmin.processdefinition;

import sunrise.crm.xvo.order.XActivityDefinitionVo;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

public class XProcessDefinitionVo {

    protected String name;
    protected boolean isActive;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MMM dd, yyyy HH:mm:ss aa")
    private Date activationDate;
    protected BigDecimal version;
    protected String defOnholdQueue;
    protected String id;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MMM dd, yyyy HH:mm:ss aa")
    private Date deactivationDate;
    protected BigInteger objid;
    protected String description;
    protected boolean reversible;
    protected boolean isStatusLogEnabled;
    protected boolean isStatusEnabled;
    protected String versionDsp;
    protected String defProcessingQueue;
    protected String errorQueue;
    protected String preprocessingQueue;
    protected XActivityDefinitionVo mainActivity;

    public XProcessDefinitionVo(){}

    public XProcessDefinitionVo(String name, boolean isActive, Date activationDate, BigDecimal version,
                                String defOnholdQueue, String id, Date deactivationDate, BigInteger objid, String description,
                                boolean reversible, boolean isStatusLogEnabled, boolean isStatusEnabled, String versionDsp,
                                String defProcessingQueue, XActivityDefinitionVo mainActivity, String errorQueue, String preprocessingQueue) {
        this.name = name;
        this.isActive = isActive;
        this.activationDate = activationDate;
        this.version = version;
        this.defOnholdQueue = defOnholdQueue;
        this.id = id;
        this.deactivationDate = deactivationDate;
        this.objid = objid;
        this.description = description;
        this.reversible = reversible;
        this.isStatusLogEnabled = isStatusLogEnabled;
        this.isStatusEnabled = isStatusEnabled;
        this.versionDsp = versionDsp;
        this.defProcessingQueue = defProcessingQueue;
        this.mainActivity = mainActivity;
        this.errorQueue = errorQueue;
        this.preprocessingQueue = preprocessingQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getDefOnholdQueue() {
        return defOnholdQueue;
    }

    public void setDefOnholdQueue(String defOnholdQueue) {
        this.defOnholdQueue = defOnholdQueue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(Date deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public BigInteger getObjid() {
        return objid;
    }

    public void setObjid(BigInteger objid) {
        this.objid = objid;
    }

    public String getDefErrorQueue() {
        return errorQueue;
    }

    public void setDefErrorQueue(String defErrorQueue) {
        this.errorQueue = defErrorQueue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isReversible() {
        return reversible;
    }

    public void setReversible(boolean reversible) {
        this.reversible = reversible;
    }

    public boolean getIsStatusLogEnabled() {
        return isStatusLogEnabled;
    }

    public void setIsStatusLogEnabled(boolean statusLogEnabled) {
        this.isStatusLogEnabled = statusLogEnabled;
    }

    public boolean getIsStatusEnabled() {
        return isStatusEnabled;
    }

    public void setIsStatusEnabled(boolean statusEnabled) {
        this.isStatusEnabled = statusEnabled;
    }

    public String getVersionDsp() {
        return versionDsp;
    }

    public void setVersionDsp(String versionDsp) {
        this.versionDsp = versionDsp;
    }

    public String getDefProcessingQueue() {
        return defProcessingQueue;
    }

    public void setDefProcessingQueue(String defProcessingQueue) {
        this.defProcessingQueue = defProcessingQueue;
    }

    public XActivityDefinitionVo getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(XActivityDefinitionVo mainActivity) {
        this.mainActivity = mainActivity;
    }

    public String getErrorQueue() {
        return errorQueue;
    }

    public void setErrorQueue(String errorQueue) {
        this.errorQueue = errorQueue;
    }

    public String getPreprocessingQueue() {
        return preprocessingQueue;
    }

    public void setPreprocessingQueue(String preprocessingQueue) {
        this.preprocessingQueue = preprocessingQueue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XProcessDefinitionVo that = (XProcessDefinitionVo) o;
        return isActive == that.isActive &&
                reversible == that.reversible &&
                isStatusLogEnabled == that.isStatusLogEnabled &&
                isStatusEnabled == that.isStatusEnabled &&
                Objects.equals(name, that.name) &&
                Objects.equals(activationDate, that.activationDate) &&
                Objects.equals(version, that.version) &&
                Objects.equals(defOnholdQueue, that.defOnholdQueue) &&
                Objects.equals(id, that.id) &&
                Objects.equals(deactivationDate, that.deactivationDate) &&
                Objects.equals(objid, that.objid) &&
                Objects.equals(description, that.description) &&
                Objects.equals(versionDsp, that.versionDsp) &&
                Objects.equals(defProcessingQueue, that.defProcessingQueue) &&
                Objects.equals(errorQueue, that.errorQueue) &&
                Objects.equals(preprocessingQueue, that.preprocessingQueue) &&
                Objects.equals(mainActivity, that.mainActivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isActive, activationDate, version, defOnholdQueue, id, deactivationDate, objid, description, reversible, isStatusLogEnabled, isStatusEnabled, versionDsp, defProcessingQueue, errorQueue, preprocessingQueue, mainActivity);
    }

    @Override
    public String toString() {
        return "XProcessDefinitionVo{" +
                "name='" + name + '\'' +
                ", isActive=" + isActive +
                ", activationDate=" + activationDate +
                ", version=" + version +
                ", defOnholdQueue='" + defOnholdQueue + '\'' +
                ", id='" + id + '\'' +
                ", deactivationDate=" + deactivationDate +
                ", objid=" + objid +
                ", description='" + description + '\'' +
                ", reversible=" + reversible +
                ", isStatusLogEnabled=" + isStatusLogEnabled +
                ", isStatusEnabled=" + isStatusEnabled +
                ", versionDsp='" + versionDsp + '\'' +
                ", defProcessingQueue='" + defProcessingQueue + '\'' +
                ", errorQueue='" + errorQueue + '\'' +
                ", preprocessingQueue='" + preprocessingQueue + '\'' +
                ", mainActivity=" + mainActivity +
                '}';
    }
}
