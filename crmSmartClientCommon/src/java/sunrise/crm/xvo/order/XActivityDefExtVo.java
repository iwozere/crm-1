package sunrise.crm.xvo.order;

import java.util.ArrayList;
import java.util.List;

public class XActivityDefExtVo extends XActivityDefinitionVo {

	private boolean blnRollback;
	@SuppressWarnings("unused")
	private List<XActivityDefExtVo> allchildren = new ArrayList<XActivityDefExtVo>();
	
	
	public boolean getRollback() {
		return blnRollback;
	}
	public void setRollback(boolean rollbackFlag) {
		this.blnRollback = rollbackFlag;
	}
	public List<XActivityDefExtVo> getAllChildren() {
		return allchildren;
	}
	public void setAllChildren(List<XActivityDefExtVo> allchildren) {
		this.allchildren = allchildren;
	}	
	
}
