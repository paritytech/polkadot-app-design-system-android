package io.paritytech.polkadotapp.designsystem.shapes

import androidx.compose.ui.graphics.Shape
import androidx.compose.runtime.staticCompositionLocalOf

abstract class PolkadotShapes {
    /**
     * Default: 0dp
     */
    abstract val zero: Shape
    /**
     * Default: 2dp
     */
    abstract val extraTiny: Shape
    /**
     * Default: 4dp
     */
    abstract val tiny: Shape
    /**
     * Default: 6dp
     */
    abstract val extraSmall: Shape
    /**
     * Default: 8dp
     */
    abstract val small: Shape
    /**
     * Default: 10dp
     */
    abstract val smallIncreased: Shape
    /**
     * Default: 12dp
     */
    abstract val extraMedium: Shape
    /**
     * Default: 14dp
     */
    abstract val medium: Shape
    /**
     * Default: 16dp
     */
    abstract val mediumIncreased: Shape
    /**
     * Default: 24dp
     */
    abstract val large: Shape
    /**
     * Default: 32dp
     */
    abstract val extraLarge: Shape
    /**
     * Default: CircleShape
     */
    abstract val full: Shape
}

val LocalPolkadotShapes = staticCompositionLocalOf<PolkadotShapes> {
    error("LocalPolkadotShapes not provided")
}
