package sunrise.crm.integration.provisioning.xip;

import java.util.StringJoiner;

public class GetDonorInfoResponse {

    String tspId;
    String donorName;

    public String getTspId() {
        return tspId;
    }

    public void setTspId(String tspId) {
        this.tspId = tspId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GetDonorInfoResponse.class.getSimpleName() + "[", "]")
                .add("tspId='" + tspId + "'")
                .add("donorName='" + donorName + "'")
                .toString();
    }
}
