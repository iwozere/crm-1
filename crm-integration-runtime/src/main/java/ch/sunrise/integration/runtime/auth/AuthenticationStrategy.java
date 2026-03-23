package ch.sunrise.integration.runtime.auth;

import org.springframework.http.HttpHeaders;
import reactor.core.publisher.Mono;

/**
 * Base class for authentication strategies used in integration clients.
 * Provides methods to add authentication headers to HTTP requests.
 */
public abstract class AuthenticationStrategy {

    /**
     * Get the authentication strategy name.
     * @return strategy identifier
     */
    public abstract String getName();

    /**
     * Apply authentication to HTTP headers.
     * @return Mono containing populated headers
     */
    public abstract Mono<HttpHeaders> authenticateHeaders();
}
