package ch.sunrise.integration;

import org.springframework.stereotype.Component;

/**
 * Base class for generated integration clients.
 * This module contains pure generated code for connecting to external systems.
 *
 * Generated clients should extend this class and implement specific
 * integration protocols (REST, SOAP, messaging, etc.).
 */
@Component
public abstract class IntegrationClientBase {

    /**
     * Get the integration system name.
     * @return the system identifier
     */
    public abstract String getSystemName();

    /**
     * Test connectivity to the external system.
     * @return true if connection is successful
     */
    public abstract boolean testConnection();

    /**
     * Get integration client health status.
     * @return health status information
     */
    public abstract IntegrationHealth getHealth();
}