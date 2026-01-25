// Copyright (C) 2025 Slack Technologies, LLC
// SPDX-License-Identifier: Apache-2.0
package com.slack.circuit.mosaic

import com.slack.circuit.backstack.NavDecoration
import kotlin.test.Test
import kotlin.test.assertTrue

class MosaicNavDecorationTest {
  @Test
  fun implementsNavDecoration() {
    val decoration: NavDecoration = MosaicNavDecoration
    assertTrue(decoration === MosaicNavDecoration)
  }
}