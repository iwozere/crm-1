package sunrise.crm.isales.order.capture;

import sunrise.crm.util.CrmDateUtil;

import java.util.Date;

import static sunrise.crm.util.CrmDateUtil.format;

public class AdvantageConfigPortfolioDto {

    private String name;
    private String description;
    private String release;
    private Date effectDate;
    private Date endDate;


    public AdvantageConfigPortfolioDto() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getEndDateSQL() {
        return format(CrmDateUtil.DATE_FORMAT_SQL).format(endDate);
    }

    public String getEffectDateSQL() {
        return format(CrmDateUtil.DATE_FORMAT_SQL).format(effectDate);
    }



    @Override
    public String toString() {
        return "AdvantageConfigPortfolioDto{"
                + " name='" + name
                + ", description='" + description
                + ", release='" + release
                + ", effectDate='" + effectDate
                + ", endDate='" + endDate
                + '}';
    }
}