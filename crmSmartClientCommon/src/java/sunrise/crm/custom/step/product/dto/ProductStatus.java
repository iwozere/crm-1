package sunrise.crm.custom.step.product.dto;


public enum ProductStatus {


    //------------------/
   //- Enum Constants -/
  //------------------/

  /**
   * Constant INSTALLED
   */
  INSTALLED("Installed"),
  /**
   * Constant DEINSTALLED
   */
  DEINSTALLED("Deinstalled"),
  /**
   * Constant DISCONNECTED
   */
  DISCONNECTED("Disconnected"),
  /**
   * Constant SUSPENDED
   */
  SUSPENDED("Suspended"),
  /**
   * Constant PENDING
   */
  PENDING("Pending"),
  /**
   * Constant PENDING_NEW
   */
  PENDING_NEW("Pending_New"),
  /**
   * Constant PENDING_CHANGE
   */
  PENDING_CHANGE("Pending_Change"),
  /**
   * Constant PENDING_CEASE
   */
  PENDING_CEASE("Pending_Cease");
  

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
  private static final java.util.Map<java.lang.String, ProductStatus> enumConstants = new java.util.HashMap<java.lang.String, ProductStatus>();


  static {
      for (ProductStatus c: ProductStatus.values()) {
          ProductStatus.enumConstants.put(c.value, c);
      }

  };


    //----------------/
   //- Constructors -/
  //----------------/

  private ProductStatus(final java.lang.String value) {
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
  public static ProductStatus fromValue(
          final java.lang.String value) {
      ProductStatus c = ProductStatus.enumConstants.get(value);
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
