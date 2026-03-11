package sunrise.crm.order.dto;

/**
 * Represents selected Promotional Hardware from Binding Promo with Gift or from Binding Promo, having Promotional Hardware in "positive" group, i.e. one, which has to be selected by customer.
 * @author Kosyrev
 *
 */
public class PromotionalHardwareDto {

	private String sapMaterialId;
	private int benefitGroupId;
	
	public PromotionalHardwareDto(){}
	public PromotionalHardwareDto(PromotionalHardwareDto dto){
        if (dto == null) {
            return;
        }
        this.sapMaterialId = dto.getSapMaterialId();
        this.benefitGroupId = dto.getBenefitGroupId();		
	}
	public PromotionalHardwareDto(String sapMaterialId, int benefitGroupId) {
		super();
		this.sapMaterialId = sapMaterialId;
		this.benefitGroupId = benefitGroupId;
	}
	
	public String getSapMaterialId() {
		return sapMaterialId;
	}
	public void setSapMaterialId(String sapMaterialId) {
		this.sapMaterialId = sapMaterialId;
	}
	public int getBenefitGroupId() {
		return benefitGroupId;
	}
	public void setBenefitGroupId(int benefitGroupId) {
		this.benefitGroupId = benefitGroupId;
	}
	@Override
	public String toString() {
		return "PromotionalHardwareDto [sapMaterialId=" + sapMaterialId + ", benefitGroupId=" + benefitGroupId + "]";
	}
}
