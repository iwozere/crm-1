# Camunda 8 Setup Guide

## Overview
This guide covers setting up Camunda 8 (C8 Run) for local development with the CRM Backend Zeebe workers.

## Prerequisites
- Java 21 JDK (configured in `JAVA_HOME`)
- Camunda 8 Run (Self-Managed version)

## Download and Installation

1. **Download C8 Run** from https://camunda.com/download/self-managed/
2. **Unpack** to a local directory (e.g., `d:\tools\c8run-8.8.11\`)

## Start Script (start-camunda.bat)

Create `start-camunda.bat` in your C8 Run directory:

```bat
@echo off
:: 1. Point to your specific JDK 21 path
set "JAVA_HOME=D:\tools\jdk-21.0.9"

:: 2. Add the JDK bin folder to the start of the PATH for this session
set "PATH=%JAVA_HOME%\bin;%PATH%"

:: 3. Required for newer Camunda 8 Run versions to skip automatic version detection
set "JAVA_VERSION=21"

echo [INFO] Using JDK 21 from %JAVA_HOME%
java -version

:: 4. Launch Camunda 8 Run
.\c8run.exe start
pause
```

## Zeebe Connection Details

- **gRPC Address**: `localhost:26500`
- **REST API**: `localhost:8080`
- **Operate UI**: `localhost:8081`

## Configuration for crm-backend

The `crm-backend` module connects to Zeebe using these settings in `application.yaml`:

```yaml
camunda:
  zeebe:
    client:
      gateway-address: localhost:26500
      plaintext: true
      worker:
        max-jobs-active: 32
        threads: 8
zeebe:
  client:
    default-job-timeout: 1m
    default-job-retries: 3
```

## Testing BPMN Processes

1. Start C8 Run using the batch script
2. Access Operate UI at http://localhost:8081
3. Deploy BPMN processes with Service Tasks
4. Configure Service Tasks with:
   - **Job Type**: `crm-task`
   - **Task Headers/Variables**: `{"taskType": "check-credit"}`

## Troubleshooting

### Connection Issues
- Ensure C8 Run is started and Zeebe is listening on port 26500
- Check firewall settings for gRPC communication
- Verify Java 21 is being used

### Job Processing Issues
- Check crm-backend application logs for connection errors
- Verify task types match registered workers in `TaskWorkerAggregator`
- Ensure BPMN variables include required `taskType` parameter