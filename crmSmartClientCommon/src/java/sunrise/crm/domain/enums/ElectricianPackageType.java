package sunrise.crm.domain.enums;

import java.util.HashMap;
import java.util.Map;

public enum ElectricianPackageType {
    
    //------------------/
   //- Enum Constants -/
  //------------------/

  /**
   * Constant NO_ELECTRICIAN
   */
  NO_ELECTRICIAN("No Electrician"),
 /**
  * Constant CUSTOMER_OWN_ELECTRICIAN
  */
 CUSTOMER_OWN_ELECTRICIAN("Customer Own Electrician"),
  /**
   * Constant UPK_ONLY
   */
  UPK_ONLY("UPK only"),
  /**
   * Constant HOME_INSTALLATION_ONLY
   */
  HOME_INSTALLATION_ONLY("Home installation only"),
  /**
   * Constant UPK___HOME_INSTALLATION
   */
  UPK___HOME_INSTALLATION("UPK & Home installation"),
  /**
   * Constant BASIC_INSTALLATION
   */
  BASIC_INSTALLATION("Basic installation"),
  /**
   * Constant UPK___BASIC_INSTALLATION
   */
  UPK___BASIC_INSTALLATION("UPK & Basic installation"),
  /**
   * Constant ASSURANCE
   */
  ASSURANCE("Assurance"),
  /**
   * Constant DISPATCH_LIGHT
   */
  DISPATCH_LIGHT("Dispatch Light"),
  /**
   * Constant T3_ONLY
   */
  T3_ONLY("T3 only"),
  /**
   * Constant T3_HOME_INSTALLATION
   */
  T3_HOME_INSTALLATION("T3 & Home installation"),
  /**
   * Constant T3_BASIC_INSTALLATION
   */
  T3_BASIC_INSTALLATION("T3 & Basic installation"),
	
  /**
	* Constant PARTNER_NETWORK_ELECTRICIAN
  */
  PARTNER_NETWORK_ELECTRICIAN("Partner Network Electrician"),
  
  // Inhome Technician
  INHOME_ACTIVATION("Inhome Activation"),
  INHOME_INSTALLATION("Inhome Installation"),
  INHOME_ACTIVATION_AND_INSTALLATION("Inhome Activation+Installation"),
  INHOME_ASSURANCE("Inhome Assurance"),
  INHOME_MODERNIZATION("Inhome Modernization");
  
  private final String value;

  /**
   * Field enumConstants.
   */
  private static final Map<String, ElectricianPackageType> enumConstants = new HashMap<String, ElectricianPackageType>();

  static {
      for (ElectricianPackageType c : ElectricianPackageType.values()) {
          ElectricianPackageType.enumConstants.put(c.value, c);
      }

  };
  
  // ----------------/
  // - Constructors -/
  // ----------------/

  private ElectricianPackageType(final String value) {
      this.value = value;
  }

  // -----------/
  // - Methods -/
  // -----------/

  /**
   * Method fromValue.
   * 
   * @param value
   * @return the constant for this value
   */
  public static ElectricianPackageType fromValue(final String value) {
      ElectricianPackageType c = ElectricianPackageType.enumConstants.get(value);
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
