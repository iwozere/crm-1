package sunrise.crm.custom.step.product.dto;


public enum ProductSubStatus {


    //------------------/
   //- Enum Constants -/
  //------------------/

	/**
     * Constant ACTIVATED
     */
    ACTIVATED("Activated"),
    /**
     * Constant ACTIVATION_PENDING
     */
    ACTIVATION_PENDING("Activation Pending");


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
  private static final java.util.Map<java.lang.String, ProductSubStatus> enumConstants = new java.util.HashMap<java.lang.String, ProductSubStatus>();


  static {
      for (ProductSubStatus c: ProductSubStatus.values()) {
          ProductSubStatus.enumConstants.put(c.value, c);
      }

  };


    //----------------/
   //- Constructors -/
  //----------------/

  private ProductSubStatus(final java.lang.String value) {
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
  public static ProductSubStatus fromValue(
          final java.lang.String value) {
      ProductSubStatus c = ProductSubStatus.enumConstants.get(value);
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
