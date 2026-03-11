package sunrise.crm.xvo.bizOrder;

import sunrise.crm.util.CrmStringUtil;

public class BizOrderImplementationManagerVo {

    private String objid;
    private String firstName;
    private String lastName;
    private String formattedName;

    // *************************************************************************
    // CONSTRUCTOR
    // *************************************************************************

    public BizOrderImplementationManagerVo(){}
        
    // ***************************
    // *** Setters and getters ***
    // ***************************

	public void setObjid(String objid) {
		this.objid = objid;
	}

	public String getObjid() {
		return objid;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFormattedName(String formattedName) {
		this.formattedName = formattedName;
	}

	public String getFormattedName() {
		return formattedName;
	}
	
	public String formatName(){
		return (CrmStringUtil.null2empty(firstName) + " " + CrmStringUtil.null2empty(lastName)).trim();		
	}
}
