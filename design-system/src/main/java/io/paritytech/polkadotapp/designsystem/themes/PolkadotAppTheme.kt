package io.paritytech.polkadotapp.designsystem.themes

import io.paritytech.polkadotapp.designsystem.colors.PolkadotColorsPalette
import io.paritytech.polkadotapp.designsystem.colors.BerlinDayPalette
import io.paritytech.polkadotapp.designsystem.colors.BerlinNightPalette
import io.paritytech.polkadotapp.designsystem.colors.LisbonPalette
import io.paritytech.polkadotapp.designsystem.colors.MaltaPalette
import io.paritytech.polkadotapp.designsystem.colors.TokyoPalette
import io.paritytech.polkadotapp.designsystem.typography.PolkadotTypography
import io.paritytech.polkadotapp.designsystem.typography.PolkadotDefaultTypography

enum class PolkadotAppTheme(val id: String) {
    BerlinNight(id = "Berlin Night"),
    BerlinDay(id = "Berlin Day"),
    Lisbon(id = "Lisbon"),
    Malta(id = "Malta"),
    Tokyo(id = "Tokyo");

    fun colors(): PolkadotColorsPalette = when (this) {
        BerlinNight -> BerlinNightPalette()
        BerlinDay -> BerlinDayPalette()
        Lisbon -> LisbonPalette()
        Malta -> MaltaPalette()
        Tokyo -> TokyoPalette()
    }

    fun typography(): PolkadotTypography = when (this) {
        BerlinNight -> PolkadotDefaultTypography()
        BerlinDay -> PolkadotDefaultTypography()
        Lisbon -> PolkadotDefaultTypography()
        Malta -> PolkadotDefaultTypography()
        Tokyo -> PolkadotDefaultTypography()
    }

    companion object {
        val DEFAULT = BerlinNight

        fun fromId(id: String?): PolkadotAppTheme = entries.find { it.id == id } ?: DEFAULT
    }
}
