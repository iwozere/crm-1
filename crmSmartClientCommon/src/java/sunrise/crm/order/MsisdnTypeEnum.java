package sunrise.crm.order;


public enum MsisdnTypeEnum {

	TYPE_STANDARD("TYPE_STANDARD",1),
	TYPE_NUMBERPORTING("TYPE_NUMBERPORTING",2),
	TYPE_SERVICEDELIVERY("TYPE_SERVICEDELIVERY",3),
	TYPE_REPLACESIM("TYPE_REPLACESIM",4),
	TYPE_REPLACEMSISDN("TYPE_REPLACEMSISDN",5),
	TYPE_CHECKMSISDN("TYPE_CHECKMSISDN",6),
	TYPE_MULTIPLECARD("TYPE_MULTIPLECARD",7),
	TYPE_REPLACEMSISDNBUS("TYPE_REPLACEMSISDNBUS",8),
	TYPE_CONVERSION("TYPE_CONVERSION",9),
	TYPE_RESELLER_MIGRATION("TYPE_RESELLER_MIGRATION",10),
	TYPE_BUSINESS_STANDARD("TYPE_BUSINESS_STANDARD",20),
	TYPE_DEFAULT_CATEGORY("TYPE_DEFAULT_CATEGORY",99);
	

  /**
   * Field description.
   */
  private final java.lang.String description;
  private final int value;

  /**
   * Field enumConstants.
   */
  private static final java.util.Map<java.lang.String, MsisdnTypeEnum> 
      enumConstants = new java.util.HashMap<java.lang.String, MsisdnTypeEnum>();


  static {
      for (MsisdnTypeEnum c : MsisdnTypeEnum.values()) {
    	  MsisdnTypeEnum.enumConstants.put(c.description, c);
      }

  };



  private MsisdnTypeEnum(final java.lang.String description, final int value) {
      this.description = description;
      this.value = value;
  }



  public static MsisdnTypeEnum fromDescription(
          final java.lang.String description) {
	  MsisdnTypeEnum c = MsisdnTypeEnum.enumConstants.get(description);
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
  public java.lang.String toString() {
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


  public int value() {
      return value;
  }

}


