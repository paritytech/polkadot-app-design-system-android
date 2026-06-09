package io.paritytech.polkadotapp.designsystem.colors

import androidx.compose.ui.graphics.Color

class BerlinDayPalette : PolkadotColorsPalette() {
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
            disabled = PolkadotColorsPrimitives.ZincZinc200,
            error = PolkadotColorsPrimitives.RedRed200,
            primary = PolkadotColorsPrimitives.ZincZinc950,
            primaryHover = PolkadotColorsPrimitives.ZincZinc850,
            primaryInverted = PolkadotColorsPrimitives.NeutralWhite,
            primaryInvertedHover = PolkadotColorsPrimitives.ZincZinc100,
            secondary = PolkadotColorsPrimitives.ZincZinc200,
            secondaryHover = PolkadotColorsPrimitives.ZincZinc150,
            secondaryInverted = PolkadotColorsPrimitives.ZincZinc850,
            secondaryInvertedHover = PolkadotColorsPrimitives.ZincZinc700,
            tertiary = PolkadotColorsPrimitives.ZincZinc100,
            tertiaryHover = PolkadotColorsPrimitives.ZincZinc300,
            tertiaryInverted = PolkadotColorsPrimitives.ZincZinc700,
            tertiaryInvertedHover = PolkadotColorsPrimitives.ZincZinc600
        ),
        illustration = Bg.Illustration(
            dark = PolkadotColorsPrimitives.ZincZinc950,
            darkMuted = PolkadotColorsPrimitives.ZincZinc500,
            light = PolkadotColorsPrimitives.ZincZinc50,
            lightMuted = PolkadotColorsPrimitives.ZincZinc50
        ),
        selection = Bg.Selection(
            containerActive = PolkadotColorsPrimitives.ZincZinc100,
            containerActiveInverted = PolkadotColorsPrimitives.ZincZinc900,
            containerHover = PolkadotColorsPrimitives.ZincZinc50,
            containerHoverInverted = PolkadotColorsPrimitives.ZincZinc850
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
            container = PolkadotColorsPrimitives.NeutralWhite,
            containerInverted = PolkadotColorsPrimitives.NeutralNeutral900,
            main = PolkadotColorsPrimitives.ZincZinc50,
            nested = PolkadotColorsPrimitives.ZincZinc50,
            nestedInverted = PolkadotColorsPrimitives.ZincZinc850,
            overlay = PolkadotColorsPrimitives.AlphaBlackBlackAlpha48
        )
    )
    override val fg = Fg(
        disabled = PolkadotColorsPrimitives.ZincZinc400,
        error = PolkadotColorsPrimitives.RedRed600,
        link = PolkadotColorsPrimitives.BlueBlue600,
        linkHover = PolkadotColorsPrimitives.BlueBlue500,
        primary = PolkadotColorsPrimitives.ZincZinc950,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc100,
        secondary = PolkadotColorsPrimitives.ZincZinc600,
        secondaryHover = PolkadotColorsPrimitives.ZincZinc950,
        secondaryInverted = PolkadotColorsPrimitives.ZincZinc400,
        secondaryInvertedHover = PolkadotColorsPrimitives.NeutralNeutral150,
        staticWhite = PolkadotColorsPrimitives.NeutralWhite,
        success = PolkadotColorsPrimitives.GreenGreen600,
        tertiary = PolkadotColorsPrimitives.ZincZinc400,
        tertiaryInverted = PolkadotColorsPrimitives.ZincZinc600,
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
        primary = PolkadotColorsPrimitives.ZincZinc150,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc800,
        secondary = PolkadotColorsPrimitives.ZincZinc150,
        success = PolkadotColorsPrimitives.GreenGreen500,
        tertiary = PolkadotColorsPrimitives.ZincZinc300,
        warning = PolkadotColorsPrimitives.AmberAmber500
    )
}
