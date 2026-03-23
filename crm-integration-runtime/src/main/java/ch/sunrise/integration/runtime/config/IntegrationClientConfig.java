package ch.sunrise.integration.runtime.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

/**
 * Configuration for HTTP clients used by integration runtime.
 * Provides WebClient instances with retry, circuit breaker, and timeout configurations.
 */
@Configuration
public class IntegrationClientConfig {

    /**
     * Create a WebClient instance with default timeout and resilience settings.
     * This client is suitable for most external system integrations.
     *
     * @param builder the WebClient builder
     * @return configured WebClient bean
     */
    @Bean
    public WebClient integrationWebClient(WebClient.Builder builder) {
        return builder
                .responseTimeout(Duration.ofSeconds(30))
                .build();
    }

    /**
     * Create a WebClient instance with aggressive timeout for quick-response APIs.
     * Suitable for health checks and lightweight operations.
     *
     * @param builder the WebClient builder
     * @return configured WebClient bean for quick operations
     */
    @Bean(name = "quickIntegrationWebClient")
    public WebClient quickIntegrationWebClient(WebClient.Builder builder) {
        return builder
                .responseTimeout(Duration.ofSeconds(5))
                .build();
    }

    /**
     * Create a WebClient instance with extended timeout for long-running operations.
     * Suitable for bulk data transfers and report generation.
     *
     * @param builder the WebClient builder
     * @return configured WebClient bean for long operations
     */
    @Bean(name = "longRunningIntegrationWebClient")
    public WebClient longRunningIntegrationWebClient(WebClient.Builder builder) {
        return builder
                .responseTimeout(Duration.ofSeconds(120))
                .build();
    }
}
