package io.paritytech.polkadotapp.designsystem.typography

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

abstract class PolkadotTypography {
    abstract val display: Display
    abstract val headline: Headline
    abstract val title: Title
    abstract val body: Body
    abstract val paragraph: Paragraph
    abstract val label: Label
    abstract val emoji: Emoji
    abstract val code: Code
    abstract val caption: Caption

    data class Display(
        val small: TextStyle,
        val medium: TextStyle,
        val large: TextStyle,
        val extraLarge: TextStyle
    )

    data class Headline(
        val small: TextStyle,
        val medium: TextStyle,
        val large: TextStyle
    )

    data class Title(
        val tiny: TextStyle,
        val small: TextStyle,
        val medium: TextStyle,
        val large: TextStyle,
        val extraLarge: TextStyle,
        val mediumEmphasized: TextStyle,
        val smallEmphasized: TextStyle,
        val tinyEmphasized: TextStyle
    )

    data class Body(
        val small: TextStyle,
        val medium: TextStyle,
        val large: TextStyle,
        val largeEmphasized: TextStyle,
        val mediumEmphasized: TextStyle,
        val smallEmphasized: TextStyle
    )

    data class Paragraph(
        val small: TextStyle,
        val medium: TextStyle,
        val large: TextStyle
    )

    data class Label(
        val small: TextStyle,
        val medium: TextStyle,
        val mediumEmphasized: TextStyle,
        val smallEmphasized: TextStyle
    )

    data class Emoji(
        val small: TextStyle,
        val medium: TextStyle,
        val large: TextStyle
    )

    data class Code(
        val small: TextStyle,
        val medium: TextStyle,
        val large: TextStyle,
        val extraLarge: TextStyle
    )

    data class Caption(
        val small: TextStyle,
        val medium: TextStyle
    )
}

val LocalPolkadotTypography = staticCompositionLocalOf<PolkadotTypography> {
    error("LocalPolkadotTypography not provided")
}
