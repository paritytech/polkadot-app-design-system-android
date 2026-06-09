package io.paritytech.polkadotapp.designsystem.colors

import androidx.compose.ui.graphics.Color

class MaltaPalette : PolkadotColorsPalette() {
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
            disabled = PolkadotColorsPrimitives.AdvancedEmeraldEmerald200,
            error = PolkadotColorsPrimitives.RedRed200,
            primary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald700,
            primaryHover = PolkadotColorsPrimitives.ZincZinc850,
            primaryInverted = PolkadotColorsPrimitives.NeutralWhite,
            primaryInvertedHover = PolkadotColorsPrimitives.ZincZinc100,
            secondary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald300,
            secondaryHover = PolkadotColorsPrimitives.ZincZinc150,
            secondaryInverted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald900,
            secondaryInvertedHover = PolkadotColorsPrimitives.ZincZinc700,
            tertiary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald100,
            tertiaryHover = PolkadotColorsPrimitives.ZincZinc300,
            tertiaryInverted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald800,
            tertiaryInvertedHover = PolkadotColorsPrimitives.ZincZinc600
        ),
        illustration = Bg.Illustration(
            dark = PolkadotColorsPrimitives.AdvancedEmeraldEmerald600,
            darkMuted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald300,
            light = PolkadotColorsPrimitives.AdvancedEmeraldEmerald50,
            lightMuted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald100
        ),
        selection = Bg.Selection(
            containerActive = PolkadotColorsPrimitives.AdvancedEmeraldEmerald100,
            containerActiveInverted = PolkadotColorsPrimitives.ZincZinc900,
            containerHover = PolkadotColorsPrimitives.AdvancedEmeraldEmerald50,
            containerHoverInverted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald900
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
            container = PolkadotColorsPrimitives.AdvancedEmeraldEmerald20,
            containerInverted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald700,
            main = PolkadotColorsPrimitives.AdvancedEmeraldEmerald100,
            nested = PolkadotColorsPrimitives.AdvancedEmeraldEmerald100,
            nestedInverted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald500,
            overlay = PolkadotColorsPrimitives.AlphaBlackBlackAlpha48
        )
    )
    override val fg = Fg(
        disabled = PolkadotColorsPrimitives.AdvancedEmeraldEmerald400,
        error = PolkadotColorsPrimitives.RedRed600,
        link = PolkadotColorsPrimitives.AdvancedEmeraldEmerald700,
        linkHover = PolkadotColorsPrimitives.AdvancedEmeraldEmerald800,
        primary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald900,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc100,
        secondary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald800,
        secondaryHover = PolkadotColorsPrimitives.ZincZinc950,
        secondaryInverted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald50,
        secondaryInvertedHover = PolkadotColorsPrimitives.NeutralNeutral150,
        staticWhite = PolkadotColorsPrimitives.NeutralWhite,
        success = PolkadotColorsPrimitives.GreenGreen600,
        tertiary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald600,
        tertiaryInverted = PolkadotColorsPrimitives.AdvancedEmeraldEmerald100,
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
        primary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald200,
        primaryInverted = PolkadotColorsPrimitives.ZincZinc800,
        secondary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald300,
        success = PolkadotColorsPrimitives.GreenGreen500,
        tertiary = PolkadotColorsPrimitives.AdvancedEmeraldEmerald400,
        warning = PolkadotColorsPrimitives.AmberAmber500
    )
}
