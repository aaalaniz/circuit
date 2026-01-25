# Specification: Mosaic Integration

## Overview
This track focuses on improving the integration of Mosaic (a terminal UI library) with Circuit. Currently, using Mosaic with Circuit requires manual workaround for navigation decoration and modifier handling in injection sites. We aim to package `MosaicNavDecoration` into a reusable library and update the Circuit codegen to automatically handle Mosaic modifiers.

## Functional Requirements
1.  **MosaicNavDecoration Package:**
    - Create a new package (likely `circuit-mosaic`) to house `MosaicNavDecoration`.
    - Ensure `MosaicNavDecoration` is correctly implemented and exported for use in Mosaic-based Circuit apps.
2.  **Codegen Update:**
    - Update the Circuit codegen (likely within `circuit-codegen`) to detect when a user is building with Mosaic.
    - If Mosaic is detected, the generated code for `@CircuitInject` sites should use the Mosaic-specific `Modifier` instead of the standard `androidx.compose.ui.Modifier`.

## Non-Functional Requirements
- **Backward Compatibility:** Ensure existing Android/JVM Circuit apps are not negatively affected by the codegen changes.
- **Maintainability:** The new package should follow existing project structure and conventions.

## Out of Scope
- Full refactoring of the `terminal-velocity` sample app (reference only).
