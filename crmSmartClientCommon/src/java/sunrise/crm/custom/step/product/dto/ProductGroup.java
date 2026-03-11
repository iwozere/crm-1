package sunrise.crm.custom.step.product.dto;


public enum ProductGroup {

    //------------------/
   //- Enum Constants -/
  //------------------/

  /**
   * Constant MOBILE
   */
  MOBILE("mobile"),
  /**
   * Constant INTERNET
   */
  INTERNET("internet"),
  /**
   * Constant VOICE
   */
  VOICE("voice"),
  /**
   * Constant SOLUTION
   */
  SOLUTION("solution"),
  /**
   * Constant INTERNETANDVOICE
   */
  INTERNETANDVOICE("internetandvoice"),
  
  /**
  * Constant MOBILECOVERAGE
  */
  MOBILECOVERAGE("mobilecoverage"),
  
  
  /**
   * Constant HARDWARE
   */
  HARDWARE("hardware"),
  
  DIGITALSERVICE("DigitalService"),
  
  SUBSCRIPTION("subscription"),
  
  SUNRISEMAINSERVICES("sunrisemainservices"),
  
  BUSINESS2BUSINESS("business2business"),

  HOMESECURITY("homesecurity"),
  
  TV_STREAMING("tv_streaming");
  

    //--------------------------/
   //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field value.
   */
  private final java.lang.String value;

  /**
   * Field enumConstants.
   */
  private static final java.util.Map<java.lang.String, ProductGroup> enumConstants = new java.util.HashMap<java.lang.String, ProductGroup>();


  static {
      for (ProductGroup c: ProductGroup.values()) {
          ProductGroup.enumConstants.put(c.value, c);
      }

  };


    //----------------/
   //- Constructors -/
  //----------------/

  private ProductGroup(final java.lang.String value) {
      this.value = value;
  }


    //-----------/
   //- Methods -/
  //-----------/

  /**
   * Method fromValue.
   * 
   * @param value
   * @return the constant for this value
   */
  public static ProductGroup fromValue(
          final java.lang.String value) {
      ProductGroup c = ProductGroup.enumConstants.get(value);
      if (c != null) {
          return c;
      }
      throw new IllegalArgumentException(value);
  }

  /**
   * 
   * 
   * @param value
   */
  public void setValue(
          final java.lang.String value) {
  }

  /**
   * Method toString.
   * 
   * @return the value of this constant
   */
  public java.lang.String toString(
  ) {
      return this.value;
  }

  /**
   * Method value.
   * 
   * @return the value of this constant
   */
  public java.lang.String value(
  ) {
      return this.value;
  }
}
