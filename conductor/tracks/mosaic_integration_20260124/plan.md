# Implementation Plan - Mosaic Integration

## Phase 1: MosaicNavDecoration Package
- [x] Task: Create new module `circuit-mosaic`. be1bf5e
    - [ ] Create directory structure `circuit-mosaic/src/commonMain/kotlin/...`.
    - [ ] Configure `build.gradle.kts` for the new module, including Mosaic dependencies.
- [x] Task: Implement `MosaicNavDecoration`. c2841f2
    - [ ] Port `MosaicNavDecoration` logic from the reference project (`terminal-velocity`) to `circuit-mosaic`.
    - [ ] Write unit tests for `MosaicNavDecoration`.
- [x] Task: Conductor - User Manual Verification 'MosaicNavDecoration Package' (Protocol in workflow.md) be1bf5e

## Phase 2: Codegen Update
- [ ] Task: Analyze current codegen logic.
    - [ ] Review `circuit-codegen` to understand how `Modifier` is currently generated.
- [ ] Task: Implement Mosaic detection strategy.
    - [ ] Determine how to detect if the target is a Mosaic application (e.g., via annotation, classpath check, or configuration).
- [ ] Task: Update Codegen logic.
    - [ ] Write tests for the new codegen logic (ensuring Mosaic modifier is used when appropriate).
    - [ ] Implement the logic to switch between `androidx` and `Mosaic` modifiers.
- [ ] Task: Conductor - User Manual Verification 'Codegen Update' (Protocol in workflow.md)

## Phase 3: Verification
- [ ] Task: Create a sample/test case.
    - [ ] Create a small Mosaic-based sample (or use a test module) to verify the new package and codegen work as expected.
    - [ ] Verify that standard Android/JVM apps still compile and run correctly.
- [ ] Task: Conductor - User Manual Verification 'Verification' (Protocol in workflow.md)
