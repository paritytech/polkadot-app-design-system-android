package io.paritytech.polkadotapp.designsystem.borders

import androidx.compose.ui.unit.Dp
import androidx.compose.runtime.staticCompositionLocalOf

abstract class PolkadotBorders {
    /**
     * Default: 1dp
     */
    abstract val default: Dp
    /**
     * Default: 2dp
     */
    abstract val medium: Dp
    /**
     * Default: 4dp
     */
    abstract val large: Dp
}

val LocalPolkadotBorders = staticCompositionLocalOf<PolkadotBorders> {
    error("LocalPolkadotBorders not provided")
}
