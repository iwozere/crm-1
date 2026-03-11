package sunrise.crm.wemobile.dto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum WeMobilePackLevel implements Comparable<WeMobilePackLevel>{

    WE_MOBILE_M("We Mobile M pack"),
    WE_MOBILE_L("We Mobile L pack"),
    WE_MOBILE_XL("We Mobile XL pack");

    private final String level;

    WeMobilePackLevel(String level) {
        this.level = level;
    }

    public static WeMobilePackLevel fromLevel(String level) {
        return Arrays.stream(values()).filter(value -> value.getLevel().contains(level)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
    
    public String getLevel() {
        return level;
    }
    public static List<String> levels() {
        return Arrays.stream(values()).map(WeMobilePackLevel::getLevel).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return this.level;
    }
    
    public Integer getWeight(){
        switch(this){
        case WE_MOBILE_M: 
            return 1;
        case WE_MOBILE_L: 
            return 2;
        case WE_MOBILE_XL: 
            return 3;
        }
        return 9;
    }

}
