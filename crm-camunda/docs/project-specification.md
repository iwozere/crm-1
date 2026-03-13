# CRM Camunda Runtime Specification

## Purpose
The `crm-camunda` module is the Spring Boot "wrapper" that brings the entire application together.

## Responsibilities
- Bootstrapping the application via `@SpringBootApplication`.
- Hosting and managing the Camunda Process Engine.
- Configuring shared infrastructure like the database connection pool and security.

## Dependencies
- `crm-be-tasks`
- Camunda BPM Spring Boot Starter

## Camunda Setup
Download Camunda8 Run from https://camunda.com/download/self-managed/ unpack (for example to d:\tools\c8run-8.8.11\) and create a start-camunda.bat file in this folder:

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