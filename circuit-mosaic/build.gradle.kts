// Copyright (C) 2025 Slack Technologies, LLC
// SPDX-License-Identifier: Apache-2.0
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
  alias(libs.plugins.kotlin.multiplatform)
  alias(libs.plugins.kotlin.plugin.parcelize)
  alias(libs.plugins.compose)
  alias(libs.plugins.mavenPublish)
  alias(libs.plugins.baselineprofile)
}

kotlin {
  jvm()

  @OptIn(ExperimentalKotlinGradlePluginApi::class)
  compilerOptions.optIn.add("com.slack.circuit.foundation.DelicateCircuitFoundationApi")

  sourceSets {
    commonMain {
      dependencies {
        api(libs.mosaic)
        api(projects.circuitFoundation)
        api(projects.circuitRuntime)
        api(projects.circuitRuntimePresenter)
        api(projects.circuitRuntimeUi)
      }
    }
    commonTest {
      dependencies {
        implementation(libs.kotlin.test)
      }
    }
  }
}

android {
  namespace = "com.slack.circuit.mosaic"
}
