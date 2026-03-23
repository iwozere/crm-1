package ch.sunrise.integration.runtime.auth;

import org.springframework.http.HttpHeaders;
import reactor.core.publisher.Mono;

/**
 * API Key authentication strategy.
 * Adds API key to request headers, typically as "X-API-Key" or "Authorization: Bearer" headers.
 */
public class ApiKeyAuthenticationStrategy extends AuthenticationStrategy {

    private final String headerName;
    private final String headerValue;

    /**
     * Create API key authentication with custom header name.
     * @param headerName the header name (e.g., "X-API-Key")
     * @param headerValue the header value (API key)
     */
    public ApiKeyAuthenticationStrategy(String headerName, String headerValue) {
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    /**
     * Create API key authentication using bearer token format.
     * @param bearerToken the bearer token
     * @return authentication strategy with "Authorization: Bearer" header
     */
    public static ApiKeyAuthenticationStrategy bearerToken(String bearerToken) {
        return new ApiKeyAuthenticationStrategy("Authorization", "Bearer " + bearerToken);
    }

    @Override
    public String getName() {
        return "api-key";
    }

    @Override
    public Mono<HttpHeaders> authenticateHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(headerName, headerValue);
        return Mono.just(headers);
    }
}
