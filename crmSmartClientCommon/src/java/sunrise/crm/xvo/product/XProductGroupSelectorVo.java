package sunrise.crm.xvo.product;

import java.io.Serializable;
import java.util.List;

public class XProductGroupSelectorVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8079195930466704670L;
 
	
	private String productGroupName;
	private List<XInteractionProductSelectorVo> interactionProducts;

	public XProductGroupSelectorVo() {}

	public XProductGroupSelectorVo(String productGroupName, List<XInteractionProductSelectorVo> interactionProducts) {
		this.productGroupName = productGroupName;
		this.interactionProducts = interactionProducts;
	}


	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}


	public String getProductGroupName() {
		return productGroupName;
	}


	public void setInteractionProducts(List<XInteractionProductSelectorVo> interactionProducts) {
		this.interactionProducts = interactionProducts;
	}


	public List<XInteractionProductSelectorVo> getInteractionProducts() {
		return interactionProducts;
	}
	
}
