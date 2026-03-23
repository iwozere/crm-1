package ch.sunrise.integration;

/**
 * Health status information for integration clients.
 */
public class IntegrationHealth {
    private final String systemName;
    private final boolean connected;
    private final String status;
    private final String lastError;

    public IntegrationHealth(String systemName, boolean connected, String status, String lastError) {
        this.systemName = systemName;
        this.connected = connected;
        this.status = status;
        this.lastError = lastError;
    }

    public String getSystemName() { return systemName; }
    public boolean isConnected() { return connected; }
    public String getStatus() { return status; }
    public String getLastError() { return lastError; }
}