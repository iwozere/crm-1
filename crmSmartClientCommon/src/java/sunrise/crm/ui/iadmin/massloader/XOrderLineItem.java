package sunrise.crm.ui.iadmin.massloader;

@XWorksheet(rowOffset = XConstants.DEFAULT_ROW_OFFSET)
public class XOrderLineItem {

	public String item;

	public String attribute;

	public String value;

	public void setitem(String item) {
		this.item = item;
	}

	public void setattribute(String attribute) {
		this.attribute = attribute;
	}

	public void setvalue(String value) {
		this.value = value;
	}
}
