package ch.sunrise.ui.tasks.example;

import ch.sunrise.ui.tasks.UITaskBase;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Example UI task for retrieving customer dashboard data.
 */
@Component
public class GetCustomerDashboardTask extends UITaskBase {

    @Override
    public String getTaskType() {
        return "getCustomerDashboard";
    }

    @Override
    protected void validateParameters(Map<String, Object> parameters) {
        if (!parameters.containsKey("customerId")) {
            throw new IllegalArgumentException("customerId parameter is required");
        }
    }

    @Override
    public Map<String, Object> executeTask(Map<String, Object> parameters) {
        String customerId = (String) parameters.get("customerId");

        // Business logic for retrieving customer dashboard data
        // This would typically involve calling repositories and services

        Map<String, Object> result = new HashMap<>();
        result.put("customerId", customerId);
        result.put("dashboard", Map.of(
            "recentOrders", 5,
            "activeOrders", 2,
            "totalSpent", 1250.00,
            "lastLogin", "2026-03-23"
        ));

        return result;
    }
}