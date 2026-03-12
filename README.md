# Sunrise CRM Project

This project follows a clean architectural pattern designed for a complex telecom CRM system, ensuring clear boundaries and high maintainability.

## Project Structure

The project is organized into several Maven modules, each with a specific responsibility:

### 1. `crm-domain` (The Core)
* **Responsibility:** Pure business logic, Records, and Interfaces.
* **Contents:** `Order`, `LineItem`, `OrderAttribute`, and `OrderRepository` **Interface**.
* **Dependencies:** None (Zero-dependency).
* **Docs:** [project-specification.md](file:///c:/dev/sunrise/crm-domain/docs/project-specification.md)

### 2. `crm-dal` (Data Access Layer)
* **Responsibility:** Bridging the Domain to the Database.
* **Sub-modules:**
    * `crm-dal-generated`: Automated JPA Entity generation from the DB schema.
    * `crm-dal-runtime`: Repository implementations and Spring Data logic.
    * `crm-cache`: Caching mechanisms.
* **Dependencies:** `crm-domain`.
* **Docs:** [project-specification.md](file:///c:/dev/sunrise/crm-dal/docs/project-specification.md)

### 3. `crm-be-tasks` (Business Orchestration)
* **Responsibility:** "Unit of Work" logic and orchestration.
* **Contents:** Camunda Task listeners or Service tasks. It coordinates between Domain methods and DAL repositories.
* **Dependencies:** `crm-domain`, `crm-dal`.
* **Docs:** [project-specification.md](file:///c:/dev/sunrise/crm-be-tasks/docs/project-specification.md)

### 4. `crm-service` (Service Entry Point)
* **Responsibility:** Transport layer.
* **Contents:** REST Controllers, gRPC stubs, and DTOs for the external world.
* **Dependencies:** `crm-be-tasks`.
* **Docs:** [project-specification.md](file:///c:/dev/sunrise/crm-service/docs/project-specification.md)

### 5. `crm-camunda` (The Runtime)
* **Responsibility:** The Spring Boot wrapper that manages the Camunda Process Engine.
* **Dependencies:** `crm-be-tasks`.
* **Docs:** [project-specification.md](file:///c:/dev/sunrise/crm-camunda/docs/project-specification.md)

---

## Dependency Diagram

```mermaid
graph TD
    subgraph "Application"
        Service[crm-service] --> Tasks[crm-be-tasks]
        Camunda[crm-camunda] --> Tasks
    end

    subgraph "Core & Data"
        Tasks --> Domain[crm-domain]
        Tasks --> DAL[crm-dal]
        DAL --> Domain
    end

    style Domain fill:#f9f,stroke:#333,stroke-width:2px
```

---

## Architectural Principles

### Pure Domain
The `crm-domain` module remains a "Pure Java" project. This is critical for keeping business logic decoupled from infrastructure concerns like Hibernate or Spring Data.

### Mappers and Repositories
Data mapping (MapStruct) and Repository implementations reside in `crm-dal`, keeping the `crm-domain` unaware of database-specific details.

### Business Orchestration
`crm-be-tasks` handles complex operations that require multiple domain objects or external data enrichment, isolating orchestration from core business rules.

---

## Getting Started

1. **Build the master project:**
   ```bash
   mvn clean install
   ```
2. **Run the Camunda application:**
   Navigate to `crm-camunda` and run the Spring Boot application.
uld you like to start with the main `Order` DTO?