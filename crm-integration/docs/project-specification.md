# CRM Integration Module

## Overview

The `crm-integration` module contains pure generated code for connections to external systems. This module provides standardized integration patterns and client implementations for communicating with third-party services, APIs, and external data sources.

## Architecture

### IntegrationClientBase

All integration clients extend the `IntegrationClientBase` abstract class, which provides:

- **System Identification**: Each client declares its target system name
- **Health Monitoring**: Standardized health check capabilities
- **Connection Testing**: Consistent connectivity validation
- **Error Handling**: Unified error reporting patterns

### Generated Code Pattern

Integration clients are typically generated from:

- **OpenAPI/Swagger specifications** for REST APIs
- **WSDL files** for SOAP web services
- **Protocol buffer definitions** for gRPC services
- **Database schemas** for direct database connections
- **Message schemas** for event-driven integrations

## Current Integration Examples

### ExternalCrmClient
- **Target System**: External CRM platform
- **Protocol**: REST API (example implementation)
- **Capabilities**:
  - Customer data synchronization
  - Order notification delivery
  - Health monitoring and connectivity checks

## Dependencies

- `crm-common`: Shared transport layer and business operations
- `spring-boot-starter`: Spring framework support

## Integration Patterns

### REST API Integration
```java
@Component
public class RestApiClient extends IntegrationClientBase {
    private final WebClient webClient;

    @Override
    public String getSystemName() { return "external-api"; }

    public ApiResponse callExternalService(RequestData request) {
        return webClient.post()
            .uri("/api/endpoint")
            .bodyValue(request)
            .retrieve()
            .bodyToMono(ApiResponse.class)
            .block();
    }
}
```

### Database Integration
```java
@Component
public class DatabaseClient extends IntegrationClientBase {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public String getSystemName() { return "external-db"; }

    public List<ExternalData> queryExternalData(String criteria) {
        return jdbcTemplate.query(
            "SELECT * FROM external_table WHERE criteria = ?",
            (rs, rowNum) -> new ExternalData(rs.getString("field")),
            criteria
        );
    }
}
```

### Message Queue Integration
```java
@Component
public class MessagingClient extends IntegrationClientBase {
    private final JmsTemplate jmsTemplate;

    @Override
    public String getSystemName() { return "message-queue"; }

    public void sendMessage(String destination, Object payload) {
        jmsTemplate.convertAndSend(destination, payload);
    }
}
```

## Code Generation

Integration code is typically generated using:

- **OpenAPI Generator**: For REST API clients
- **Apache CXF**: For SOAP web service clients
- **Protocol Buffers Compiler**: For gRPC services
- **JOOQ**: For type-safe database access
- **Custom Generators**: For proprietary protocols

## Configuration

Integration clients are configured through `application.yaml`:

```yaml
crm:
  integration:
    external-api:
      base-url: https://api.external-system.com
      api-key: ${EXTERNAL_API_KEY}
      timeout: 30s
    external-db:
      url: jdbc:postgresql://external-db:5432/external
      username: ${EXTERNAL_DB_USER}
      password: ${EXTERNAL_DB_PASSWORD}
```

## Health Monitoring

All integration clients provide health status through the `/actuator/health` endpoint:

```json
{
  "status": "UP",
  "integrations": {
    "external-crm": {
      "status": "UP",
      "connected": true,
      "lastError": null
    },
    "external-api": {
      "status": "DOWN",
      "connected": false,
      "lastError": "Connection timeout"
    }
  }
}
```

## Error Handling

Integration clients implement comprehensive error handling:

- **Connection Failures**: Automatic retry with exponential backoff
- **Authentication Errors**: Token refresh and re-authentication
- **Rate Limiting**: Request throttling and queuing
- **Circuit Breaker**: Failure isolation and recovery
- **Logging**: Structured logging for troubleshooting

## Testing

Integration modules include:

- **Unit Tests**: Mock external dependencies
- **Integration Tests**: Test with test instances of external systems
- **Contract Tests**: Verify API contracts with external systems
- **Performance Tests**: Load testing and throughput validation

## Security

Integration clients implement security best practices:

- **Credential Management**: Secure storage and rotation
- **TLS/SSL**: Encrypted communications
- **Authentication**: API keys, OAuth, certificates
- **Authorization**: Scoped access controls
- **Audit Logging**: Security event tracking

## Future Enhancements

- **Event-Driven Integration**: Asynchronous message processing
- **API Gateway Integration**: Centralized API management
- **Service Mesh**: Advanced traffic management
- **Multi-Region Support**: Global system integration
- **Real-time Synchronization**: Event streaming and CDC</content>
<parameter name="filePath">c:\dev\learn\crm\crm-integration\docs\project-specification.md