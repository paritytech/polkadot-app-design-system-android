package io.paritytech.polkadotapp.designsystem.shapes

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

class PolkadotDefaultShapes : PolkadotShapes() {
    override val zero: Shape = RoundedCornerShape(0.dp)
    override val extraTiny: Shape = RoundedCornerShape(2.dp)
    override val tiny: Shape = RoundedCornerShape(4.dp)
    override val extraSmall: Shape = RoundedCornerShape(6.dp)
    override val small: Shape = RoundedCornerShape(8.dp)
    override val smallIncreased: Shape = RoundedCornerShape(10.dp)
    override val extraMedium: Shape = RoundedCornerShape(12.dp)
    override val medium: Shape = RoundedCornerShape(14.dp)
    override val mediumIncreased: Shape = RoundedCornerShape(16.dp)
    override val large: Shape = RoundedCornerShape(24.dp)
    override val extraLarge: Shape = RoundedCornerShape(32.dp)
    override val full: Shape = CircleShape
}
