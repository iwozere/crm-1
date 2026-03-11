To start this architectural walkthrough, we begin with **`crm-dal`** (Data Access Layer). This is the bridge between your clean Java Domain and the database. Its primary job is to hide the complexity of Hibernate and mapping from the rest of the system.

---

## 1. `crm-dal` Project Structure

I recommend a multi-module Maven/Gradle structure to separate the **Auto-generated code** (which you shouldn't touch) from the **Manual implementations** (where your logic lives).

```text
crm-dal/
├── crm-dal-generated/          <-- Submodule 1
│   ├── src/main/java/          
│   │   └── com.telecom.entity/ <-- JPA @Entity classes (OrderEntity, etc.)
│   │   └── com.telecom.repo/   <-- Basic Spring Data JpaRepositories
│   └── pom.xml
└── crm-dal-runtime/            <-- Submodule 2
    ├── src/main/java/
    │   └── com.telecom.mapper/ <-- MapStruct Interfaces
    │   └── com.telecom.impl/   <-- Implementation of Domain Repository interfaces
    │   └── com.telecom.audit/  <-- Independent Logging (REQUIRES_NEW)
    └── pom.xml

```

---

## 2. Project Specification (`project-specification.md`)

```markdown
# Project Specification: crm-dal

## Purpose
The `crm-dal` project provides a unified, persistent storage abstraction for the Telecom Backend. It isolates the Domain Model from the Database Schema and Hibernate-specific lifecycle states.

## Tech Stack
- **Java:** 21 (LTS)
- **Framework:** Spring Data JPA / Hibernate
- **Mapping:** MapStruct (Compile-time code generation)
- **Database:** [Your DB, e.g., PostgreSQL/Oracle]
- **Generation:** QueryDSL or Hibernate Tools (for Entity generation)

## Architectural Constraints
1. **Domain Isolation:** No project outside of `crm-dal` should ever import an `*Entity` class.
2. **Transaction Management:** Supports both `REQUIRED` (for standard tasks) and `REQUIRES_NEW` (for audit logging).
3. **Immutability:** Converts mutable Hibernate Entities into immutable Domain Records for safe processing in `crm-be-tasks`.

```

---

## 3. Module Responsibilities (`requirements.md`)

```markdown
# Module Requirements & Responsibilities

## 1. crm-dal-generated
**Responsibility:** Data Schema Mirroring.
- **Automated Mirroring:** This module contains POJOs that strictly match the DB table structure. These are generated via `hbm2java` or similar tools.
- **Base Persistence:** Provides the most basic CRUD operations (findById, save, delete) using Spring Data `JpaRepository`.
- **No Logic:** Zero business logic or custom queries should be written here to avoid being overwritten during re-generation.

## 2. crm-dal-runtime
**Responsibility:** Domain Mapping and Repository Implementation.

### A. Data Mapping (MapStruct)
- **Entity <-> Domain:** Must handle the transformation of a 300-attribute `OrderEntity` into a clean `Order` Domain Record.
- **Collection Handling:** Must implement "Update-in-Place" logic for LineItems to prevent Hibernate from issuing unnecessary Delete/Inserts.

### B. Repository Implementation
- **Interface Fulfillment:** Implements the `OrderRepository` interface defined in `crm-domain`.
- **Dirty Checking:** Coordinates with the Hibernate Session to ensure that only modified fields are sent to the DB at the end of a task.

### C. Independent Audit Logging
- **Transactional Independence:** Implements the `logIndependent` functionality. 
- **Requirement:** Must use `Propagation.REQUIRES_NEW` to ensure logs are committed even if the parent Order transaction rolls back.

### D. Performance Tuning
- **Batching:** Configures Hibernate batch-size for attribute updates.
- **Projections:** Provides "Lightweight" versions of the Order for tasks that don't need all 30 line items.

```

---

### Why this split works for your "Heavy" Order Object

By separating **Generated** from **Runtime**, you solve the "10k lines" issue. Your `OrderEntity` is just a data container. The logic for how that data is saved efficiently is hidden inside the `crm-dal-runtime` mappers and implementations.

**Would you like to move on to `crm-domain` next, specifically focusing on how to structure the Records and the "Simple Services" logic?**