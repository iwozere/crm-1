package ch.sunrise.be.tasks.example;

import ch.sunrise.be.tasks.JobWorkerServiceBase;

import java.util.HashMap;
import java.util.Map;

public class CheckCredit extends JobWorkerServiceBase {

    @Override
    public String getWorkerType() {
        return "check-credit";
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        String customerId = String.valueOf(params.getOrDefault("customerId", "N/A"));
        double amount = 0.0;
        Object amountRaw = params.get("amount");
        if (amountRaw instanceof Number) {
            amount = ((Number) amountRaw).doubleValue();
        } else if (amountRaw instanceof String) {
            try {
                amount = Double.parseDouble((String) amountRaw);
            } catch (NumberFormatException ignored) {
            }
        }

        int creditScore = (int) (600 + Math.min(200, Math.max(0, amount / 1000)));

        Map<String, Object> result = new HashMap<>();
        result.put("customerId", customerId);
        result.put("amount", amount);
        result.put("creditScore", creditScore);
        result.put("status", creditScore > 700 ? "APPROVED" : "DECLINED");
        return result;
    }
}
