Here is a comprehensive **`project-brief.md`** file you can give to your dev agent. It summarizes the architecture, technical requirements, and boilerplate code needed to build the **crm-camunda** executor project for Camunda 8.

---

# Project Brief: crm-camunda Executor (Spring Boot)

## 1. Project Overview

**Name:** `crm-camunda`
**Goal:** A standalone Spring Boot application acting as a **Remote Job Worker** for Camunda 8. It will poll tasks from the Zeebe engine, execute business logic transactionally, and report completion or failure back to the process.

## 2. Technical Stack (2026 Standards)

* **Framework:** Spring Boot 3.5+ (or 4.0 if preferred)
* **Language:** Java 21+ (Running with `D:\tools\jdk-21.0.9\`)
* **Camunda Version:** Camunda 8.8.x (Self-Managed / C8 Run)
* **Protocol:** gRPC (via `camunda-spring-boot-starter`)

## 3. Core Architecture

* **Decoupled Execution:** The Camunda engine (Zeebe) holds the state; this app holds the logic.
* **Polling Mechanism:** The app maintains a long-polling gRPC connection to `localhost:26500`.
* **Idempotency:** Since network failures can occur between DB commit and Camunda "OK" signal, all worker logic must be idempotent.

---

## 4. Required Configuration

### Maven Dependency (`pom.xml`)

```xml
<dependency>
    <groupId>io.camunda</groupId>
    <artifactId>camunda-spring-boot-starter</artifactId>
    <version>8.8.16</version>
</dependency>

```

### Application Properties (`src/main/resources/application.yaml`)

```yaml
camunda:
  client:
    mode: self-managed
    auth:
      method: none  # Required for local C8 Run default setup
    zeebe:
      grpc-address: http://localhost:26500
      rest-address: http://localhost:8088
    # Optimize for Java 21 Virtual Threads
    execution-threads: 10 

spring:
  threads:
    virtual:
      enabled: true # Enable Loom virtual threads for high-throughput polling

```

---

## 5. Implementation Blueprint

### Main Application

```java
@SpringBootApplication
@EnableCamunda // Optional in newer starters but good for clarity
public class CrmCamundaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmCamundaApplication.class, args);
    }
}

```

### CRM Task Executor (The Worker)

```java
package io.crm.workers;

import io.camunda.client.api.response.ActivatedJob;
import io.camunda.client.spring.annotation.JobWorker;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.Map;

@Component
public class CrmTaskWorker {

    @JobWorker(type = "process-crm-task")
    @Transactional
    public Map<String, Object> execute(final ActivatedJob job) {
        // 1. Extract Variables
        var variables = job.getVariablesAsMap();
        String accountId = (String) variables.get("accountId");

        // 2. Perform Transactional Logic
        // TODO: Update CRM Database via JPA Repository
        System.out.println("Processing account: " + accountId);

        // 3. Return result to Camunda (automatically completes job)
        return Map.of("processedAt", System.currentTimeMillis(), "status", "COMPLETE");
    }
}

```

---

## 6. Development Workflow for Agent

1. **Project Init:** Generate Spring Boot project with `Web` and `Data JPA` starters.
2. **C8 Integration:** Add `camunda-spring-boot-starter`.
3. **Cross-Platform Readiness:** Ensure code uses standard Spring interfaces. Keep business logic in `@Service` classes, separate from the `@JobWorker` entry point.
4. **Error Handling:** Implement a global exception handler within the worker to send `bpmnError` to Camunda if a business-level failure occurs.

---
