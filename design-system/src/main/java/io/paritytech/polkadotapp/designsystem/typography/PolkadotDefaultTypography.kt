package io.paritytech.polkadotapp.designsystem.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class PolkadotDefaultTypography : PolkadotTypography() {
    override val display = Display(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            lineHeight = 48.sp,
            letterSpacing = -0.5.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            lineHeight = 64.sp,
            letterSpacing = -1.sp
        ),
        large = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 56.sp,
            lineHeight = 80.sp,
            letterSpacing = -1.sp
        ),
        extraLarge = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 64.sp,
            lineHeight = 80.sp,
            letterSpacing = -1.sp
        )
    )
    override val headline = Headline(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            lineHeight = 36.sp,
            letterSpacing = 0.sp
        ),
        large = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 40.sp,
            letterSpacing = -0.5.sp
        )
    )
    override val title = Title(
        tiny = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        ),
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp
        ),
        large = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp
        ),
        extraLarge = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp
        ),
        mediumEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp
        ),
        smallEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        ),
        tinyEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.manrope,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        )
    )
    override val body = Body(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        ),
        large = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp
        ),
        largeEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp
        ),
        mediumEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        ),
        smallEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        )
    )
    override val paragraph = Paragraph(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 18.sp,
            letterSpacing = 0.sp
        ),
        large = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        )
    )
    override val label = Label(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Medium,
            fontSize = 10.sp,
            lineHeight = 14.sp,
            letterSpacing = 0.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        ),
        mediumEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        ),
        smallEmphasized = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 10.sp,
            lineHeight = 14.sp,
            letterSpacing = 0.sp
        )
    )
    override val emoji = Emoji(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.martianMono,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 32.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.sp
        ),
        large = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.Normal,
            fontSize = 80.sp,
            lineHeight = 80.sp,
            letterSpacing = 0.sp
        )
    )
    override val code = Code(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.martianMono,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.martianMono,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 18.sp,
            letterSpacing = 0.sp
        ),
        large = TextStyle(
            fontFamily = PolkadotFontFamilies.martianMono,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.sp
        ),
        extraLarge = TextStyle(
            fontFamily = PolkadotFontFamilies.martianMono,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp
        )
    )
    override val caption = Caption(
        small = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 10.sp,
            lineHeight = 14.sp,
            letterSpacing = 1.2.sp
        ),
        medium = TextStyle(
            fontFamily = PolkadotFontFamilies.inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 1.sp
        )
    )
}
