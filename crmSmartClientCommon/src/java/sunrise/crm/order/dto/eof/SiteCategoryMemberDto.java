package sunrise.crm.order.dto.eof;

import java.util.Date;

public class SiteCategoryMemberDto {
    private boolean eofFamily;
    private boolean siteCatPendingStatus;
    private Date endDate;

    public boolean isEofFamily() {
        return eofFamily;
    }

    public void setEofFamily(boolean eofFamily) {
        this.eofFamily = eofFamily;
    }

    public boolean isSiteCatPendingStatus() {
        return siteCatPendingStatus;
    }

    public void setSiteCatPendingStatus(boolean siteCatPendingStatus) {
        this.siteCatPendingStatus = siteCatPendingStatus;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
