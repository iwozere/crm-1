package sunrise.crm.custom.step.product.dto;



public enum ProductGroupAdj {

    //------------------/
   //- Enum Constants -/
  //------------------/

  MOBILE("Mobile Postpaid",8235),
  MOBILE_INTERNET("Mobile Internet Postpaid",8235),
  TV("TV",7800),
  INTERNET("Internet",7941),
  FIXNET_VOICE_ONLY("Fixnet (Voice only)",7000),
  OTHER_IT_BACKOFFICE("Other (IT/Back office)",8235);

  //--------------------------/
  //- Class/Member Variables -/
  //--------------------------/

  /**
   * Field description.
   */
  private final java.lang.String description;
  private final int value;

  /**
   * Field enumConstants.
   */
  private static final java.util.Map<java.lang.String, ProductGroupAdj> 
      enumConstants = new java.util.HashMap<java.lang.String, ProductGroupAdj>();


  static {
      for (ProductGroupAdj c : ProductGroupAdj.values()) {
          ProductGroupAdj.enumConstants.put(c.description, c);
      }

  };


  //----------------/
  //- Constructors -/
  //----------------/

  /**
   * Default constructor.
   * @param description - the input description
   */
  private ProductGroupAdj(final java.lang.String description, final int value) {
      this.description = description;
      this.value = value;
  }


  //-----------/
  //- Methods -/
  //-----------/

  /**
   * Method fromdescription.
   * 
   * @param description - the input description
   * @return the constant for this description
   */
  public static ProductGroupAdj fromDescription(
          final java.lang.String description) {
      ProductGroupAdj c = ProductGroupAdj.enumConstants.get(description);
      if (c != null) {
          return c;
      }
      throw new IllegalArgumentException(description);
  }

  /**
   * Method toString.
   * 
   * @return the description of this constant
   */
  public java.lang.String toString(
  ) {
      return this.description;
  }

  /**
   * Method description.
   * 
   * @return the description of this constant
   */
  public java.lang.String getDescription(
  ) {
      return this.description;
  }


  public int getValue() {
      return value;
  }
    
}
