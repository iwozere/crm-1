package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.CHANGE_RATE_PLAN)
public class XChangeRatePlan {

    public String msisdn;

    public String siteId;

    public String schedule;

    public String newProduct;

    public String oldProduct;
    
    public String netPrice;

    public void setmsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }

    public void setnewProduct(String newProduct) {
        this.newProduct = newProduct;
    }

    public void setoldProduct(String oldProduct) {
        this.oldProduct = oldProduct;
    }
    
    public void setnetPrice(String netPrice) {
        this.netPrice = netPrice;
    }
}
