package sunrise.crm.domain.enums;

import java.util.HashMap;
import java.util.Map;

public enum HfcTechnicianTaskType {
	    
	//------------------/
	   //- Enum Constants -/
	  //------------------/
	  
	  /**
	   * Constant TRUCK_ROLL
	   */
	  TRUCK_ROLL("Truck Roll"),
	  /**
	   * Constant UNSEALING
	   */
	  UNSEALING("Unsealing / Entplombierung"),
	  /**
	   * Constant HOME_INSTALLATION
	   */	  
	  HOME_INSTALLATION("Home installation"),
	  /**
	   * Constant BUILDING_UPGRADE
	   */
	  BUILDING_UPGRADE("Building Upgrade"); 
	  
	  
	  private final String value;
	  
	// ----------------/
	// - Constructors -/
	// ----------------/

	private HfcTechnicianTaskType(String value) {
		this.value = value;
	}
	
	  /**
	   * Field enumConstants.
	   */
	  private static final Map<String, HfcTechnicianTaskType> enumConstants = new HashMap<String, HfcTechnicianTaskType>();

	  static {
	      for (HfcTechnicianTaskType c : HfcTechnicianTaskType.values()) {
	    	  HfcTechnicianTaskType.enumConstants.put(c.value, c);
	      }

	  };

	  // -----------/
	  // - Methods -/
	  // -----------/

	  /**
	   * Method fromValue.
	   * 
	   * @param value
	   * @return the constant for this value
	   */
	  public static HfcTechnicianTaskType fromValue(final String value) {
		  HfcTechnicianTaskType c = HfcTechnicianTaskType.enumConstants.get(value);
	      if (c != null) {
	          return c;
	      }
	      throw new IllegalArgumentException(value);
	  }

	  /**
	   * @param value
	   */
	  public void setValue(final String value) {
	  }

	  /**
	   * Method toString.
	   * 
	   * @return the value of this constant
	   */
	  public String toString() {
	      return this.value;
	  }

	  /**
	   * Method value.
	   * 
	   * @return the value of this constant
	   */
	  public String value() {
	      return this.value;
	  }
}
