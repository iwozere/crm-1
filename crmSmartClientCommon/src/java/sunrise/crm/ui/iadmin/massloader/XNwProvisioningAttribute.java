package sunrise.crm.ui.iadmin.massloader;

/**
 * Used for both nw provisioning and network provisioning pages
 */
@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET, columnOffset = XConstants.NW_PROVISIONING_ATTRIBUTES_COLUMN_OFFSET)
public class XNwProvisioningAttribute {

    public String attribute;

    public String value;

    public void setattribute(String attribute) {
        this.attribute = attribute;
    }

    public void setvalue(String value) {
        this.value = value;
    }
}
