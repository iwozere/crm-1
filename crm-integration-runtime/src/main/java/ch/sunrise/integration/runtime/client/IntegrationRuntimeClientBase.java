package ch.sunrise.integration.runtime.client;

import ch.sunrise.integration.runtime.auth.AuthenticationStrategy;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry as ReactorRetry;

import java.time.Duration;
import java.util.Optional;

/**
 * Base class for integration runtime clients.
 * Provides WebClient configuration, authentication, retry, and circuit breaker patterns.
 */
@Component
public abstract class IntegrationRuntimeClientBase {

    protected final WebClient webClient;
    protected final Optional<AuthenticationStrategy> authStrategy;
    protected final CircuitBreaker circuitBreaker;
    protected final Retry retry;

    /**
     * Initialize runtime client with WebClient and optional authentication.
     * @param webClient the WebClient instance
     * @param authStrategy optional authentication strategy
     */
    protected IntegrationRuntimeClientBase(WebClient webClient, Optional<AuthenticationStrategy> authStrategy) {
        this.webClient = webClient;
        this.authStrategy = authStrategy;
        this.circuitBreaker = createCircuitBreaker();
        this.retry = createRetryPolicy();
    }

    /**
     * Get the client system name.
     * @return system identifier
     */
    public abstract String getSystemName();

    /**
     * Execute an HTTP operation with resilience patterns (retry + circuit breaker).
     * @param operation lambda to execute
     * @param <T> response type
     * @return Mono with response
     */
    protected <T> Mono<T> executeWithResilience(java.util.function.Function<WebClient, Mono<T>> operation) {
        return operation.apply(webClient)
                .retryWhen(createRetrySpec())
                .transformDeferred(circuitBreaker.decoratePublisher());
    }

    /**
     * Create HTTP header with authentication if configured.
     * @return Mono with authenticated headers
     */
    protected Mono<org.springframework.http.HttpHeaders> createAuthenticatedHeaders() {
        if (authStrategy.isPresent()) {
            return authStrategy.get().authenticateHeaders();
        }
        return Mono.just(new org.springframework.http.HttpHeaders());
    }

    private CircuitBreaker createCircuitBreaker() {
        CircuitBreakerConfig config = CircuitBreakerConfig.custom()
                .failureRateThreshold(50)
                .slowCallRateThreshold(50)
                .waitDurationInOpenState(Duration.ofSeconds(30))
                .slowCallDurationThreshold(Duration.ofSeconds(5))
                .permittedNumberOfCallsInHalfOpenState(3)
                .minimumNumberOfCalls(5)
                .recordExceptions(WebClientResponseException.class, java.net.ConnectException.class)
                .ignoreExceptions(IllegalArgumentException.class)
                .build();

        return CircuitBreakerRegistry.ofDefaults().circuitBreaker(
                getSystemName() + "-cb",
                config
        );
    }

    private Retry createRetryPolicy() {
        RetryConfig config = RetryConfig.custom()
                .maxAttempts(3)
                .waitDuration(Duration.ofMillis(1000))
                .intervalFunction(io.github.resilience4j.core.IntervalFunction.ofExponentialBackoff(1000, 2))
                .retryExceptions(java.net.ConnectException.class, java.net.SocketTimeoutException.class)
                .ignoreExceptions(IllegalArgumentException.class)
                .build();

        return RetryRegistry.ofDefaults().retry(getSystemName() + "-retry", config);
    }

    private ReactorRetry createRetrySpec() {
        return ReactorRetry.backoff(3, Duration.ofMillis(1000))
                .filter(throwable -> throwable instanceof java.net.ConnectException ||
                                   throwable instanceof java.net.SocketTimeoutException);
    }
}
