package io.paritytech.polkadotapp.designsystem.colors

import androidx.compose.ui.graphics.Color

class BerlinNightPalette : PolkadotColorsPalette() {
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
            active = PolkadotColorsPrimitives.ZincZinc600,
            disabled = PolkadotColorsPrimitives.ZincZinc800,
            error = PolkadotColorsPrimitives.RedRed950,
            primary = PolkadotColorsPrimitives.ZincZinc150,
            primaryHover = PolkadotColorsPrimitives.ZincZinc200,
            primaryInverted = PolkadotColorsPrimitives.ZincZinc950,
            primaryInvertedHover = PolkadotColorsPrimitives.ZincZinc850,
            secondary = PolkadotColorsPrimitives.ZincZinc700,
            secondaryHover = PolkadotColorsPrimitives.ZincZinc800,
            secondaryInverted = PolkadotColorsPrimitives.ZincZinc200,
            secondaryInvertedHover = PolkadotColorsPrimitives.ZincZinc300,
            tertiary = PolkadotColorsPrimitives.ZincZinc800,
            tertiaryHover = PolkadotColorsPrimitives.ZincZinc700,
            tertiaryInverted = PolkadotColorsPrimitives.ZincZinc100,
            tertiaryInvertedHover = PolkadotColorsPrimitives.ZincZinc150
        ),
        illustration = Bg.Illustration(
            dark = PolkadotColorsPrimitives.ZincZinc150,
            darkMuted = PolkadotColorsPrimitives.ZincZinc600,
            light = PolkadotColorsPrimitives.ZincZinc900,
            lightMuted = PolkadotColorsPrimitives.ZincZinc600
        ),
        selection = Bg.Selection(
            containerActive = PolkadotColorsPrimitives.ZincZinc800,
            containerActiveInverted = PolkadotColorsPrimitives.ZincZinc100,
            containerHover = PolkadotColorsPrimitives.ZincZinc850,
            containerHoverInverted = PolkadotColorsPrimitives.ZincZinc50
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
            container = PolkadotColorsPrimitives.ZincZinc900,
            containerInverted = PolkadotColorsPrimitives.NeutralWhite,
            main = PolkadotColorsPrimitives.ZincZinc950,
            nested = PolkadotColorsPrimitives.ZincZinc850,
            nestedInverted = PolkadotColorsPrimitives.ZincZinc100,
            overlay = PolkadotColorsPrimitives.AlphaBlackBlackAlpha48
        )
    )
    override val fg = Fg(
        disabled = PolkadotColorsPrimitives.ZincZinc600,
        error = PolkadotColorsPrimitives.RedRed600,
        link = PolkadotColorsPrimitives.BlueBlue500,
        linkHover = PolkadotColorsPrimitives.BlueBlue400,
        primary = PolkadotColorsPrimitives.ZincZinc100,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc950,
        secondary = PolkadotColorsPrimitives.ZincZinc400,
        secondaryHover = PolkadotColorsPrimitives.ZincZinc150,
        secondaryInverted = PolkadotColorsPrimitives.ZincZinc500,
        secondaryInvertedHover = PolkadotColorsPrimitives.NeutralBlack,
        staticWhite = PolkadotColorsPrimitives.NeutralWhite,
        success = PolkadotColorsPrimitives.GreenGreen500,
        tertiary = PolkadotColorsPrimitives.ZincZinc600,
        tertiaryInverted = PolkadotColorsPrimitives.ZincZinc400,
        warning = PolkadotColorsPrimitives.AmberAmber500
    )
    override val focus = Focus(
        error = PolkadotColorsPrimitives.AlphaRedRedAlpha24,
        ring = PolkadotColorsPrimitives.AlphaWhiteWhiteAlpha16
    )
    override val gradient = Gradient(
        navigationOverlayEnd = PolkadotColorsPrimitives.AlphaBlackBlackAlpha0,
        navigationOverlayStart = PolkadotColorsPrimitives.AlphaBlackBlackAlpha80
    )
    override val shadow = Shadow(
        medium = PolkadotColorsPrimitives.AlphaBlackBlackAlpha48,
        soft = PolkadotColorsPrimitives.AlphaBlackBlackAlpha24
    )
    override val stroke = Stroke(
        cutout = PolkadotColorsPrimitives.NeutralBlack,
        error = PolkadotColorsPrimitives.RedRed600,
        primary = PolkadotColorsPrimitives.ZincZinc850,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc150,
        secondary = PolkadotColorsPrimitives.ZincZinc700,
        success = PolkadotColorsPrimitives.GreenGreen500,
        tertiary = PolkadotColorsPrimitives.ZincZinc400,
        warning = PolkadotColorsPrimitives.AmberAmber500
    )
}
