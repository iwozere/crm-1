# CRM Integration Runtime

## Overview

The `crm-integration-runtime` module provides runtime support infrastructure for external system integrations. While `crm-integration` contains pure generated code from WSDL/OpenAPI specifications, this module provides the operational support: WebClient configuration, authentication strategies, retry logic, circuit breaker patterns, and health monitoring.

## Architecture

### Core Components

#### IntegrationRuntimeClientBase
Abstract base class for all integration clients that provides:
- WebClient configuration with multiple timeout profiles
- Authentication strategy integration
- Retry policies with exponential backoff
- Circuit breaker patterns for failure isolation
- Health check capabilities

#### AuthenticationStrategy
Base class for authentication implementations supporting:
- API Key authentication
- Bearer token authentication
- OAuth 2.0 (planned)
- SOAP WS-Security (planned)
- Certificate-based authentication (planned)

#### ApiKeyAuthenticationStrategy
Concrete implementation for API key and bearer token authentication.

### Supporting Infrastructure

#### IntegrationClientConfig
Spring configuration providing:
- Default WebClient with 30-second timeout
- Quick response WebClient for health checks (5-second timeout)
- Long-running operations WebClient (120-second timeout)

## Key Features

### Resilience Patterns

#### Circuit Breaker
- Failure threshold: 50%
- Slow call threshold: 50%
- Open state duration: 30 seconds
- Minimum calls to evaluate: 5
- Half-open state calls: 3

#### Retry Policy
- Maximum attempts: 3
- Initial wait: 1000ms
- Backoff multiplier: 2.0 (exponential)
- Retries on: Connection errors, timeouts
- Ignores: Validation errors, authentication failures

#### Timeout Configuration
- Standard operations: 30 seconds
- Health checks/quick ops: 5 seconds
- Long-running operations: 120 seconds

### Authentication

```java
// API Key authentication
var apiKeyAuth = new ApiKeyAuthenticationStrategy("X-API-Key", "your-key");

// Bearer token
var bearerAuth = ApiKeyAuthenticationStrategy.bearerToken("your-token");
```

### Usage Pattern

```java
@Component
public class ExternalCrmRuntimeClient extends IntegrationRuntimeClientBase {

    public ExternalCrmRuntimeClient(WebClient webClient) {
        super(webClient, Optional.of(
            ApiKeyAuthenticationStrategy.bearerToken("token")
        ));
    }

    @Override
    public String getSystemName() {
        return "external-crm";
    }

    public Mono<CustomerData> getCustomer(String id) {
        return executeWithResilience(client ->
            client.get()
                .uri("https://api.external.com/customers/{id}", id)
                .retrieve()
                .bodyToMono(CustomerData.class)
        );
    }
}
```

## Configuration

Integration runtime clients are configured through `application-integration.yaml`:

```yaml
crm:
  integration:
    external-crm:
      base-url: https://api.external-crm.com
      api-key: ${EXTERNAL_CRM_API_KEY}
      timeout: 30s
    external-api:
      base-url: https://api.external-system.com
      auth-type: bearer
      timeout: 5s
    external-db:
      timeout: 120s
      
resilience4j:
  circuitbreaker:
    instances:
      external-crm-cb:
        failureRateThreshold: 50
        waitDurationInOpenState: 30s
  retry:
    instances:
      external-crm-retry:
        maxAttempts: 3
        waitDuration: 1000
```

## Monitoring and Observability

### Metrics
- Circuit breaker state (OPEN, CLOSED, HALF_OPEN)
- Call counts and success rates
- Retry attempts and backoff durations
- Response time percentiles
- Timeout occurrences

### Health Indicators
- Integration system connectivity
- Circuit breaker status
- Authentication validity
- Last error tracking

### Logging
- Request/response logging (debug level)
- Authentication events (info level)
- Circuit breaker state changes (info level)
- Retry attempts (warn level)
- Failures and errors (error level)

## Dependencies

- `spring-boot-starter-webflux`: Reactive HTTP client
- `spring-boot-starter-actuator`: Health and metrics
- `resilience4j-spring-boot3`: Resilience patterns
- `resilience4j-circuitbreaker`: Circuit breaker implementation
- `resilience4j-retry`: Retry implementation
- `resilience4j-micrometer`: Metrics integration

## Integration with crm-common

The `crm-shared` module (formerly crm-common) depends on `crm-integration-runtime` to:
1. Call external systems via configured clients
2. Apply consistent resilience patterns
3. Handle authentication centrally
4. Monitor integration health

Business logic in `crm-shared` uses integration runtime clients to:
- Synchronize customer data from external CRM
- Send order notifications to external systems
- Query external databases
- Retrieve data from REST APIs

## Best Practices

### Error Handling
- Circuit breaker open exceptions → retry with degraded mode
- Timeout exceptions → log and notify, don't retry
- Authentication failures → refresh tokens, retry once
- Network failures → retry with backoff

### Configuration
- Use environment variables for sensitive credentials
- Separate timeouts for different operation types
- Monitor and tune circuit breaker thresholds
- Document retry assumptions per external system

### Testing
- Mock external systems in unit tests
- Use Wiremock for integration tests
- Test circuit breaker behavior
- Validate authentication flows
- Test timeout scenarios

## Future Enhancements

- OAuth 2.0 authentication support
- SOAP WS-Security authentication
- Certificate-based authentication
- Advanced rate limiting
- Request/response caching
- GraphQL client support
- gRPC client support
- Protocol buffer serialization
- Distributed tracing integration
- Advanced metrics and dashboards
