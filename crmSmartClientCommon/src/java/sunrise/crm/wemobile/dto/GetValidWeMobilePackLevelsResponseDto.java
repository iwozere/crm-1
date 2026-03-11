package sunrise.crm.wemobile.dto;

import com.google.gson.Gson;

import java.util.List;

public class GetValidWeMobilePackLevelsResponseDto {
	
	private WeMobilePackLevel currentPackLevel;

    public WeMobilePackLevel getCurrentPackLevel() {
		return currentPackLevel;
	}

	public void setCurrentPackLevel(WeMobilePackLevel currentPackLevel) {
		this.currentPackLevel = currentPackLevel;
	}

	private List<WeMobilePackLevel> allowedWeMobilePackLevels;

    public void setAllowedWeMobilePackLevels(List<WeMobilePackLevel> levels) {
        this.allowedWeMobilePackLevels = levels;
    }

    public List<WeMobilePackLevel> getAllowedWeMobilePackLevels() {
        return allowedWeMobilePackLevels;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
