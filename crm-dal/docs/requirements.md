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

# Module Requirements: crm-cache

## 1. Warm-up Strategy
- **Startup Loading:** Must implement `CommandLineRunner` or `@EventListener(ApplicationReadyEvent.class)` to populate caches before the gRPC/REST listeners open.
- **Fail-Fast:** If critical reference data (e.g., Billing Tax Rules) fails to load, the application must fail to start.

## 2. Concurrency & Performance
- **Lock-Free Reads:** Use `ConcurrentHashMap` or Caffeine Cache for near-zero latency.
- **Immutability:** Cached POJOs must be immutable to prevent "Cache Poisoning" (where one task accidentally modifies a shared product definition).

## 3. Refresh Mechanism
- **Selective Eviction:** Ability to refresh a single product definition via a management endpoint (useful for mid-day catalog updates).