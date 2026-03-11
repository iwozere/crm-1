package sunrise.crm.loyalty.pointhistory;

import java.util.List;
import java.util.StringJoiner;

public class TierHistoryDto {
	 private List<TierDto> tier;

	public List<TierDto> getTier() {
		return tier;
	}

	public void setTier(List<TierDto> tier) {
		this.tier = tier;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(", ", TierHistoryDto.class.getSimpleName() + "[", "]").add("tier=" + tier).toString();
	}
}