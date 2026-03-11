package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.OWNER_CHANGE)
public class XOwnerChange {

    public String productSerial;

    public String schedule;

    public String currentOwnerSiteId;

    public String newOwnerSiteId;

    public void setproductSerial(String productSerial) {
        this.productSerial = productSerial;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }

    public void setcurrentOwnerSiteId(String currentOwnerSiteId) {
        this.currentOwnerSiteId = currentOwnerSiteId;
    }

    public void setnewOwnerSiteId(String newOwnerSiteId) {
        this.newOwnerSiteId = newOwnerSiteId;
    }
}
