package ch.sunrise.frontend;

import ch.sunrise.ui.tasks.UITaskAggregator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Web UI controller for CRM frontend operations.
 * Provides web pages and forms that delegate to UI tasks.
 */
@Controller
@RequestMapping("/ui")
public class CrmFrontendController {

    private final UITaskAggregator taskAggregator;

    public CrmFrontendController(UITaskAggregator taskAggregator) {
        this.taskAggregator = taskAggregator;
    }

    /**
     * Customer dashboard page.
     */
    @GetMapping("/customer/{customerId}/dashboard")
    public String customerDashboard(@PathVariable String customerId, Model model) {
        try {
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("customerId", customerId);

            Map<String, Object> dashboardData = taskAggregator.executeTask("getCustomerDashboard", parameters);
            model.addAllAttributes(dashboardData);

            return "customer-dashboard";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "error";
        }
    }

    /**
     * Home page.
     */
    @GetMapping("/")
    public String home() {
        return "home";
    }
}