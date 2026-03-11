package sunrise.crm.xvo.product;

import java.io.Serializable;

public class XInteractionProductSelectorVo implements Serializable {
	
	/** 
	 * 
	 */
	private static final long serialVersionUID = -2305733820516270556L;


	
	private String interactionProductName;
	private String productName;
	
	public XInteractionProductSelectorVo() {}
	
	public XInteractionProductSelectorVo(String interactionProduct, String product) {
		this.interactionProductName = interactionProduct;
		this.productName = product;
	}
	public void setInteractionProductName(String interactionProductName) {
		this.interactionProductName = interactionProductName;
	}
	public String getInteractionProductName() {
		return interactionProductName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}

	
	
}
