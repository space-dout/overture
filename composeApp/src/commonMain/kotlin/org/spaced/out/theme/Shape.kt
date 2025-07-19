package org.spaced.out.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * Object containing the constants for the shapes of elements in the interface.
 */
object Shape
{
    /**
     * The Shape for elements in the interface. Most of the design is with non-rounded corners. Some elements like Icons
     * might have a rounded background on hover or special elements like in the calendar. The value used for rounded
     * corners is `small`
     */
    val defaultShapes = Shapes(
        extraSmall = RoundedCornerShape(0.dp),
        /* The value used for actually rounded corners. */
        small = RoundedCornerShape(10.dp),
        medium = RoundedCornerShape(0.dp),
        large = RoundedCornerShape(0.dp),
        extraLarge = RoundedCornerShape(0.dp),
    )
}