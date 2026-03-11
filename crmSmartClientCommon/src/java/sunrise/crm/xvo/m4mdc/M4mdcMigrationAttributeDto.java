package sunrise.crm.xvo.m4mdc;

import com.google.gson.Gson;

public class M4mdcMigrationAttributeDto {

    private String objid;
    private String offerId;
    private String name;
    private String value;
    private String uom;


    public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "M4mdcMigrationAttributeDto: " + new Gson().toJson(this);
    }
}
