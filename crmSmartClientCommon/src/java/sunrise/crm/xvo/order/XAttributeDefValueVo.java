package sunrise.crm.xvo.order;

import java.io.Serializable;
import java.util.Arrays;


/**
 * @author bansalg
 * sunrise.crm.xvo.order.XAttributeDefValueVo
 */
public class XAttributeDefValueVo implements Serializable  {
	
	private String objid;
	private String xName;
	private String xDescription;
	private String xType;
	private String[] xDefault;
	private String xValue;
	
	public String getObjid() {
		return objid;
	}
	public void setObjid(String objid) {
		this.objid = objid;
	}
	public String getxName() {
		return xName;
	}
	public void setxName(String xName) {
		this.xName = xName;
	}
	public String getxDescription() {
		return xDescription;
	}
	public void setxDescription(String xDescription) {
		this.xDescription = xDescription;
	}
	public String getxType() {
		return xType;
	}
	public void setxType(String xType) {
		this.xType = xType;
	}
	public String[] getxDefault() {
		return xDefault;
	}
	public void setxDefault(String[] xDefault) {
		this.xDefault = xDefault;
	}
	public String getxValue() {
		return xValue;
	}
	public void setxValue(String xValue) {
		this.xValue = xValue;
	}
	@Override
	public String toString() {
		return "XAttributeDefValueVo [objid=" + objid + ", xName=" + xName
				+ ", xDescription=" + xDescription + ", xType=" + xType
				+ ", xDefault=" + Arrays.toString(xDefault) + "]";
	}
	
}
