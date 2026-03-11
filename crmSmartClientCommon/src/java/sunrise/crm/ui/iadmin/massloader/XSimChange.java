package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, name = XConstants.SIM_CHANGE)
public class XSimChange {

    public String salesId;

    public String msisdn;

    public String siteId;

    public String schedule;

    public String item;

    public String attribute;

    public String value;

    public String delSalutation;

    public String delFName;

    public String delLName;

    public String delCompanyName;

    public String delAddress;

    public String delAddress2;

    public String delCity;

    public String delZipCode;

    public String delCountry;

    public String shippingType;

    public String expressShipment;

    public String shippingCost;

    public String materialId;

    public String listPrice;

    public String discount;


    public void setsalesId(String salesId) {
        this.salesId = salesId;
    }

    public void setmsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setsiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }

    public void setitem(String item) {
        this.item = item;
    }

    public void setattribute(String attribute) {
        this.attribute = attribute;
    }

    public void setvalue(String value) {
        this.value = value;
    }

    public void setdelSalutation(String delSalutation) {
        this.delSalutation = delSalutation;
    }

    public void setdelFName(String delFName) {
        this.delFName = delFName;
    }

    public void setdelLName(String delLName) {
        this.delLName = delLName;
    }

    public void setdelCompanyName(String delCompanyName) {
        this.delCompanyName = delCompanyName;
    }

    public void setdelAddress(String delAddress) {
        this.delAddress = delAddress;
    }

    public void setdelAddress2(String delAddress2) {
        this.delAddress2 = delAddress2;
    }

    public void setdelCity(String delCity) {
        this.delCity = delCity;
    }

    public void setdelZipCode(String delZipCode) {
        this.delZipCode = delZipCode;
    }

    public void setdelCountry(String delCountry) {
        this.delCountry = delCountry;
    }

    public void setshippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public void setexpressShipment(String expressShipment) {
        this.expressShipment = expressShipment;
    }

    public void setshippingCost(String shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setmaterialId(String materialId) {
        this.materialId = materialId;
    }

    public void setlistPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public void setdiscount(String discount) {
        this.discount = discount;
    }
}
