// Copyright (C) 2025 Slack Technologies, LLC
// SPDX-License-Identifier: Apache-2.0
package com.slack.circuit.mosaic

import androidx.compose.runtime.Composable
import com.jakewharton.mosaic.modifier.Modifier
import com.jakewharton.mosaic.ui.Box
import com.slack.circuit.backstack.NavDecoration
import com.slack.circuit.runtime.navigation.NavArgument
import com.slack.circuit.runtime.navigation.NavStackList

public object MosaicNavDecoration : NavDecoration {
  @Composable
  override fun <T : NavArgument> DecoratedContent(
    args: NavStackList<T>,
    modifier: androidx.compose.ui.Modifier,
    content: @Composable (T) -> Unit,
  ) {
    // We ignore the androidx.compose.ui.Modifier passed in because Mosaic uses its own Modifier system.
    Box(modifier = Modifier) {
      content(args.top)
    }
  }
}
