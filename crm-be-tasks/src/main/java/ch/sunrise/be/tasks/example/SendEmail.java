package ch.sunrise.be.tasks.example;

import ch.sunrise.be.tasks.JobWorkerServiceBase;

import java.util.HashMap;
import java.util.Map;

public class SendEmail extends JobWorkerServiceBase {

    @Override
    public String getWorkerType() {
        return "send-email";
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        String customerId = String.valueOf(params.getOrDefault("customerId", "N/A"));
        int score = 0;
        Object scoreRaw = params.get("creditScore");
        if (scoreRaw instanceof Number) {
            score = ((Number) scoreRaw).intValue();
        } else if (scoreRaw instanceof String) {
            try {
                score = Integer.parseInt((String) scoreRaw);
            } catch (NumberFormatException ignored) {
            }
        }

        String status = score > 700 ? "APPROVED" : "PENDING";

        Map<String, Object> result = new HashMap<>();
        result.put("customerId", customerId);
        result.put("creditScore", score);
        result.put("emailSent", true);
        result.put("status", status);
        return result;
    }
}
