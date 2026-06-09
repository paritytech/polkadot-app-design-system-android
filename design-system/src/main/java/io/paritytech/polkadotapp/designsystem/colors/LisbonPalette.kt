package io.paritytech.polkadotapp.designsystem.colors

import androidx.compose.ui.graphics.Color

class LisbonPalette : PolkadotColorsPalette() {
    override val avatar = Avatar(
        bg = Avatar.Bg(
            amethyst = PolkadotColorsPrimitives.AdvancedAmethystAmethyst500,
            emerald = PolkadotColorsPrimitives.AdvancedEmeraldEmerald800,
            garnet = PolkadotColorsPrimitives.AdvancedGarnetGarnet800,
            onyx = PolkadotColorsPrimitives.AdvancedOnyxOnyx700,
            opal = PolkadotColorsPrimitives.AdvancedOpalOpal950,
            pearl = PolkadotColorsPrimitives.AdvancedPearlPearl900,
            ruby = PolkadotColorsPrimitives.AdvancedRubyRuby700,
            sapphire = PolkadotColorsPrimitives.AdvancedSapphireSapphire800,
            topaz = PolkadotColorsPrimitives.AdvancedTopazTopaz600,
            turquoise = PolkadotColorsPrimitives.AdvancedTurquoiseTurquoise600
        ),
        fg = Avatar.Fg(
            amethyst = PolkadotColorsPrimitives.AdvancedAmethystAmethyst100,
            emerald = PolkadotColorsPrimitives.AdvancedEmeraldEmerald100,
            garnet = PolkadotColorsPrimitives.AdvancedGarnetGarnet100,
            onyx = PolkadotColorsPrimitives.AdvancedOnyxOnyx100,
            opal = PolkadotColorsPrimitives.AdvancedOpalOpal300,
            pearl = PolkadotColorsPrimitives.AdvancedPearlPearl200,
            ruby = PolkadotColorsPrimitives.AdvancedRubyRuby100,
            sapphire = PolkadotColorsPrimitives.AdvancedSapphireSapphire100,
            topaz = PolkadotColorsPrimitives.AdvancedTopazTopaz100,
            turquoise = PolkadotColorsPrimitives.AdvancedTurquoiseTurquoise100
        )
    )
    override val bg = Bg(
        accent = PolkadotColorsPrimitives.BlueBlue500,
        action = Bg.Action(
            active = PolkadotColorsPrimitives.ZincZinc200,
            disabled = PolkadotColorsPrimitives.AdvancedTopazTopaz200,
            error = PolkadotColorsPrimitives.RedRed200,
            primary = PolkadotColorsPrimitives.AdvancedTopazTopaz500,
            primaryHover = PolkadotColorsPrimitives.ZincZinc850,
            primaryInverted = PolkadotColorsPrimitives.NeutralWhite,
            primaryInvertedHover = PolkadotColorsPrimitives.ZincZinc100,
            secondary = PolkadotColorsPrimitives.AdvancedTopazTopaz300,
            secondaryHover = PolkadotColorsPrimitives.ZincZinc150,
            secondaryInverted = PolkadotColorsPrimitives.AdvancedTopazTopaz900,
            secondaryInvertedHover = PolkadotColorsPrimitives.ZincZinc700,
            tertiary = PolkadotColorsPrimitives.AdvancedTopazTopaz100,
            tertiaryHover = PolkadotColorsPrimitives.ZincZinc300,
            tertiaryInverted = PolkadotColorsPrimitives.AdvancedTopazTopaz800,
            tertiaryInvertedHover = PolkadotColorsPrimitives.ZincZinc600
        ),
        illustration = Bg.Illustration(
            dark = PolkadotColorsPrimitives.AdvancedTopazTopaz600,
            darkMuted = PolkadotColorsPrimitives.AdvancedTopazTopaz300,
            light = PolkadotColorsPrimitives.AdvancedTopazTopaz50,
            lightMuted = PolkadotColorsPrimitives.AdvancedTopazTopaz100
        ),
        selection = Bg.Selection(
            containerActive = PolkadotColorsPrimitives.AdvancedTopazTopaz100,
            containerActiveInverted = PolkadotColorsPrimitives.ZincZinc900,
            containerHover = PolkadotColorsPrimitives.AdvancedTopazTopaz50,
            containerHoverInverted = PolkadotColorsPrimitives.AdvancedTopazTopaz900
        ),
        status = Bg.Status(
            error = PolkadotColorsPrimitives.RedRed600,
            errorHover = PolkadotColorsPrimitives.RedRed700,
            success = PolkadotColorsPrimitives.GreenGreen600,
            successHover = PolkadotColorsPrimitives.GreenGreen700,
            warning = PolkadotColorsPrimitives.AmberAmber500,
            warningHover = PolkadotColorsPrimitives.AmberAmber400
        ),
        surface = Bg.Surface(
            container = PolkadotColorsPrimitives.AdvancedTopazTopaz20,
            containerInverted = PolkadotColorsPrimitives.AdvancedTopazTopaz700,
            main = PolkadotColorsPrimitives.AdvancedTopazTopaz100,
            nested = PolkadotColorsPrimitives.AdvancedTopazTopaz100,
            nestedInverted = PolkadotColorsPrimitives.AdvancedTopazTopaz500,
            overlay = PolkadotColorsPrimitives.AlphaBlackBlackAlpha48
        )
    )
    override val fg = Fg(
        disabled = PolkadotColorsPrimitives.AdvancedTopazTopaz400,
        error = PolkadotColorsPrimitives.RedRed600,
        link = PolkadotColorsPrimitives.AdvancedTopazTopaz700,
        linkHover = PolkadotColorsPrimitives.AdvancedTopazTopaz800,
        primary = PolkadotColorsPrimitives.AdvancedTopazTopaz900,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc100,
        secondary = PolkadotColorsPrimitives.AdvancedTopazTopaz800,
        secondaryHover = PolkadotColorsPrimitives.ZincZinc950,
        secondaryInverted = PolkadotColorsPrimitives.AdvancedTopazTopaz50,
        secondaryInvertedHover = PolkadotColorsPrimitives.NeutralNeutral150,
        staticWhite = PolkadotColorsPrimitives.NeutralWhite,
        success = PolkadotColorsPrimitives.GreenGreen600,
        tertiary = PolkadotColorsPrimitives.AdvancedTopazTopaz600,
        tertiaryInverted = PolkadotColorsPrimitives.AdvancedTopazTopaz100,
        warning = PolkadotColorsPrimitives.AmberAmber600
    )
    override val focus = Focus(
        error = PolkadotColorsPrimitives.AlphaRedRedAlpha24,
        ring = PolkadotColorsPrimitives.AlphaBlackBlackAlpha24
    )
    override val gradient = Gradient(
        navigationOverlayEnd = PolkadotColorsPrimitives.AlphaWhiteWhiteAlpha0,
        navigationOverlayStart = PolkadotColorsPrimitives.AlphaWhiteWhiteAlpha80
    )
    override val shadow = Shadow(
        medium = PolkadotColorsPrimitives.AlphaBlackBlackAlpha48,
        soft = PolkadotColorsPrimitives.AlphaBlackBlackAlpha24
    )
    override val stroke = Stroke(
        cutout = PolkadotColorsPrimitives.NeutralWhite,
        error = PolkadotColorsPrimitives.RedRed600,
        primary = PolkadotColorsPrimitives.AdvancedTopazTopaz200,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc800,
        secondary = PolkadotColorsPrimitives.AdvancedTopazTopaz300,
        success = PolkadotColorsPrimitives.GreenGreen500,
        tertiary = PolkadotColorsPrimitives.AdvancedTopazTopaz400,
        warning = PolkadotColorsPrimitives.AmberAmber500
    )
}
