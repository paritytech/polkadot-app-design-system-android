package io.paritytech.polkadotapp.designsystem.spacings

import androidx.compose.ui.unit.Dp
import androidx.compose.runtime.staticCompositionLocalOf

abstract class PolkadotSpacings {
    /**
     * Default: 0dp
     */
    abstract val zero: Dp
    /**
     * Default: 2dp
     */
    abstract val extraTiny: Dp
    /**
     * Default: 4dp
     */
    abstract val tiny: Dp
    /**
     * Default: 6dp
     */
    abstract val extraSmall: Dp
    /**
     * Default: 8dp
     */
    abstract val small: Dp
    /**
     * Default: 10dp
     */
    abstract val smallIncreased: Dp
    /**
     * Default: 12dp
     */
    abstract val extraMedium: Dp
    /**
     * Default: 14dp
     */
    abstract val medium: Dp
    /**
     * Default: 16dp
     */
    abstract val mediumIncreased: Dp
    /**
     * Default: 24dp
     */
    abstract val large: Dp
    /**
     * Default: 32dp
     */
    abstract val extraLarge: Dp
    /**
     * Default: 40dp
     */
    abstract val extraLargeIncreased: Dp
}

val LocalPolkadotSpacings = staticCompositionLocalOf<PolkadotSpacings> {
    error("LocalPolkadotSpacings not provided")
}
