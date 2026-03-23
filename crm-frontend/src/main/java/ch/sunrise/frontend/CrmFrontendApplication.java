package ch.sunrise.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the CRM Frontend.
 * Provides web UI controllers for CRM operations through UI tasks.
 */
@SpringBootApplication
public class CrmFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmFrontendApplication.class, args);
    }
}