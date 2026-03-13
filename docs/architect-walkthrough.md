# Architectural Walkthrough & Critique

## Project Overview
This is a backend-only Telco migration project from a legacy Amdocs framework to a modern, Clean Architecture-based Java system.

## 1. Project Hierarchy & Structure [OK]
The multi-module Maven setup is well-organized:
- `crm-domain`: Pure business logic (Zero-dependency).
- `crm-dal`: Data Access Layer (Split into `generated` and `runtime`).
- `crm-be-tasks`: Business orchestration (Skeleton).
- `crm-service`: Transport layer (Skeleton).
- `crm-camunda`: Runtime orchestration.

## 2. Dependencies [OK]
Dependencies are unidirectional and correctly point inward towards the domain:
- Infrastructure (DAL, Service, Camunda) depends on the Domain.
- Orchestration (Tasks) coordinates between Domain and DAL.
- **No Circular Dependencies** were found in the current structural setup.

## 3. Responsibilities [OK]
- **Domain Layer**: Uses Java `record`s for immutability and clear state representation. Traceability to legacy entities is maintained via a custom `@MappedFrom` SOURCE-retention annotation, which is a brilliant way to keep the domain pure while providing a map for developers.
- **DAL Layer**: Effectively manages the "massive" Amdocs schema (501 entities in `crm-dal-generated`). The split between generated entities and manual implementations (`crm-dal-runtime`) is critical for long-term maintainability.
- **Orchestration**: `crm-be-tasks` is positioned correctly to handle transactional boundaries and multi-entity coordination.

## 4. Critique & Risks

### A. Mapping Complexity (High)
The [OrderMapper](file:///c:/dev/sunrise/crm-dal/crm-dal-runtime/src/main/java/ch/sunrise/mapper/OrderMapper.java#14-61) already shows signs of "Attribute Explosion." With 500+ entities to map, maintainability of MapStruct interfaces will be a challenge. 
> [!TIP]
> Consider using MapStruct "Decorator" or "Composition" patterns if mappers grow beyond 500 lines to keep them readable.

### B. Audit-Log Coupling
[OrderRepositoryImpl](file:///c:/dev/sunrise/crm-dal/crm-dal-runtime/src/main/java/ch/sunrise/impl/OrderRepositoryImpl.java#15-80) is directly coupled to [OrderAuditService](file:///c:/dev/sunrise/crm-dal/crm-dal-runtime/src/main/java/ch/sunrise/impl/OrderAuditService.java#7-20). While the implementation is correct (using `REQUIRES_NEW`), the explicit call inside the repository for reconciliation logic might grow complex.
> [!NOTE]
> Ensure reconciliation logic doesn't become a performance bottleneck as [LineItem](file:///c:/dev/sunrise/crm-dal/crm-dal-runtime/src/main/java/ch/sunrise/mapper/OrderMapper.java#58-60) counts increase.

### C. Physical Delete Implementation
There is commented-out logic for physical deletes in [OrderRepositoryImpl](file:///c:/dev/sunrise/crm-dal/crm-dal-runtime/src/main/java/ch/sunrise/impl/OrderRepositoryImpl.java#15-80). 
> [!WARNING]
> In Telco systems, Soft Delete is usually preferred over Physical Delete for compliance and audit-trail integrity. Ensure this design choice is deliberate.

## 5. Formal Architectural Report

```json
{
  "summary": "The project follows a robust Clean Architecture pattern with a commendable 'Pure Domain' isolation strategy. The migration from Amdocs is handled via a structured DAL split that isolates legacy complexity (500+ entities) from the core business logic. The use of immutable Records and MapStruct provides a high-performance, type-safe mapping layer.",
  "problems": [
    {
      "id": "A1",
      "description": "Potential for massive Mapper files in DAL runtime due to the size of legacy Amdocs entities.",
      "impact": "medium"
    },
    {
      "id": "A2",
      "description": "Incomplete source code in Orchestration (Tasks) and Transport (Service) modules inhibits full system evaluation.",
      "impact": "low"
    },
    {
      "id": "A3",
      "description": "Risk of business logic leaking into Repository implementation (e.g., entity reconciliation).",
      "impact": "medium"
    }
  ],
  "improvements": [
    {
      "id": "I1",
      "description": "Implement MapStruct compositions for larger mappers.",
      "rationale": "Prevents monolithic mapper interfaces when dealing with 100+ attribute entities.",
      "priority": "medium"
    },
    {
      "id": "I2",
      "description": "Formalize the soft-delete vs. physical-delete strategy in the ADR.",
      "rationale": "Clarifies audit requirements and prevents data loss during reconciliation.",
      "priority": "high"
    },
    {
      "id": "I3",
      "description": "Extract orchestration logic from Repositories into Domain Services or BeTasks.",
      "rationale": "Maintains the single responsibility of repositories (persistence only).",
      "priority": "medium"
    }
  ]
}
```
