package io.paritytech.polkadotapp.designsystem.colors

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

abstract class PolkadotColorsPalette {
    abstract val avatar: Avatar
    abstract val bg: Bg
    abstract val fg: Fg
    abstract val focus: Focus
    abstract val gradient: Gradient
    abstract val shadow: Shadow
    abstract val stroke: Stroke

    data class Avatar(
        val bg: Bg,
        val fg: Fg
    ) {

        data class Bg(
            val amethyst: Color,
            val emerald: Color,
            val garnet: Color,
            val onyx: Color,
            val opal: Color,
            val pearl: Color,
            val ruby: Color,
            val sapphire: Color,
            val topaz: Color,
            val turquoise: Color
        )

        data class Fg(
            val amethyst: Color,
            val emerald: Color,
            val garnet: Color,
            val onyx: Color,
            val opal: Color,
            val pearl: Color,
            val ruby: Color,
            val sapphire: Color,
            val topaz: Color,
            val turquoise: Color
        )
    }

    data class Bg(
        val accent: Color,
        val action: Action,
        val illustration: Illustration,
        val selection: Selection,
        val status: Status,
        val surface: Surface
    ) {

        data class Action(
            val active: Color,
            val disabled: Color,
            val error: Color,
            val primary: Color,
            val primaryHover: Color,
            val primaryInverted: Color,
            val primaryInvertedHover: Color,
            val secondary: Color,
            val secondaryHover: Color,
            val secondaryInverted: Color,
            val secondaryInvertedHover: Color,
            val tertiary: Color,
            val tertiaryHover: Color,
            val tertiaryInverted: Color,
            val tertiaryInvertedHover: Color
        )

        data class Illustration(
            val dark: Color,
            val darkMuted: Color,
            val light: Color,
            val lightMuted: Color
        )

        data class Selection(
            val containerActive: Color,
            val containerActiveInverted: Color,
            val containerHover: Color,
            val containerHoverInverted: Color
        )

        data class Status(
            val error: Color,
            val errorHover: Color,
            val success: Color,
            val successHover: Color,
            val warning: Color,
            val warningHover: Color
        )

        data class Surface(
            val container: Color,
            val containerInverted: Color,
            val main: Color,
            val nested: Color,
            val nestedInverted: Color,
            val overlay: Color
        )
    }

    data class Fg(
        val disabled: Color,
        val error: Color,
        val link: Color,
        val linkHover: Color,
        val primary: Color,
        val primaryInverted: Color,
        val secondary: Color,
        val secondaryHover: Color,
        val secondaryInverted: Color,
        val secondaryInvertedHover: Color,
        val staticWhite: Color,
        val success: Color,
        val tertiary: Color,
        val tertiaryInverted: Color,
        val warning: Color
    )

    data class Focus(
        val error: Color,
        val ring: Color
    )

    data class Gradient(
        val navigationOverlayEnd: Color,
        val navigationOverlayStart: Color
    )

    data class Shadow(
        val medium: Color,
        val soft: Color
    )

    data class Stroke(
        val cutout: Color,
        val error: Color,
        val primary: Color,
        val primaryInverted: Color,
        val secondary: Color,
        val success: Color,
        val tertiary: Color,
        val warning: Color
    )
}

val LocalPolkadotColors = staticCompositionLocalOf<PolkadotColorsPalette> {
    error("LocalPolkadotColors not provided")
}
