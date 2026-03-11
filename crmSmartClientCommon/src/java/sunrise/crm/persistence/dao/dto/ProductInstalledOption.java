package sunrise.crm.persistence.dao.dto;

import java.util.Date;

/**
 * Class Installed Product Option.
 * @author kosyrev 
 */
public class ProductInstalledOption {
    
    private String name;
    private String serial;
    private Date activationDate;
    private int minimumDuration;
    private String optionType;
    private String optionSubType;
    private String optionObjid;
    
   

    public ProductInstalledOption(){}
    
    public ProductInstalledOption(ProductInstalledOption o){
        this.name = o.getName();
        this.serial = o.getSerial();
        this.activationDate = o.getActivationDate();
        this.minimumDuration = o.minimumDuration;
        this.optionType = o.getOptionType();
        this.optionSubType = o.getOptionSubType();
        this.optionObjid=o.getOptionObjid();
    }
    
    public String getOptionObjid() {
        return optionObjid;
    }

    public void setOptionObjid(String optionObjid) {
        this.optionObjid = optionObjid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public Date getActivationDate() {
        return activationDate;
    }
    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }
    public int getMinimumDuration() {
        return minimumDuration;
    }
    public void setMinimumDuration(int minimumDuration) {
        this.minimumDuration = minimumDuration;
    }
    public String getOptionType() {
        return optionType;
    }
    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }
    public String getOptionSubType() {
        return optionSubType;
    }
    public void setOptionSubType(String optionSubType) {
        this.optionSubType = optionSubType;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("name=").append(name).append(";")
          .append("serial=").append(serial).append(";")
          .append("activationDate=").append(activationDate).append(";")
          .append("minimumDuration=").append(minimumDuration).append(";")
          .append("optionType=").append(optionType).append(";")
          .append("optionSubType=").append(optionSubType).append(";");
        return sb.toString();
    }
}
