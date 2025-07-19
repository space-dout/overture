package org.spaced.out.theme.color

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

object ColorScheme
{
    /** The color scheme for the light theme */
    val light = lightColorScheme(
        primary = LightColors.backgroundLight,
        onPrimary = LightColors.textPrimary,
        secondary = LightColors.backgroundDark,
        onSecondary = LightColors.textSecondary,
        outline = LightColors.outline,
        tertiary = LightColors.contrast,
        onTertiary = LightColors.textContrast,
    )

    /** The color scheme for the dark theme */
    val dark = darkColorScheme(
        primary = DarkColors.backgroundLight,
        onPrimary = DarkColors.textPrimary,
        secondary = DarkColors.backgroundDark,
        onSecondary = DarkColors.textSecondary,
        outline = DarkColors.outline,
        tertiary = DarkColors.contrast,
        onTertiary = DarkColors.textContrast,
    )
}