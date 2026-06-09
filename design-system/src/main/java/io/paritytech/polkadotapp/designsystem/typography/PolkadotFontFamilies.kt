@file:OptIn(ExperimentalTextApi::class)

package io.paritytech.polkadotapp.designsystem.typography

import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import io.paritytech.polkadotapp.designsystem.R

object PolkadotFontFamilies {
    val inter = FontFamily(
        Font(R.font.inter_variable, FontWeight.Normal, variationSettings = FontVariation.Settings(FontVariation.weight(400))),
        Font(R.font.inter_variable, FontWeight.Medium, variationSettings = FontVariation.Settings(FontVariation.weight(500))),
        Font(R.font.inter_variable, FontWeight.SemiBold, variationSettings = FontVariation.Settings(FontVariation.weight(600)))
    )
    val manrope = FontFamily(
        Font(R.font.manrope_variable, FontWeight.SemiBold, variationSettings = FontVariation.Settings(FontVariation.weight(600))),
        Font(R.font.manrope_variable, FontWeight.Bold, variationSettings = FontVariation.Settings(FontVariation.weight(700)))
    )
    val martianMono = FontFamily(
        Font(R.font.martian_mono_variable, FontWeight.Normal, variationSettings = FontVariation.Settings(FontVariation.weight(400)))
    )
}
