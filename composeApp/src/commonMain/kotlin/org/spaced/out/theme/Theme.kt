package org.spaced.out.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.spaced.out.theme.color.ColorScheme

/**
 * Provides the theme to be used in the applications interface.
 *
 * @param darkTheme <code>true</code> when the dark color scheme should be used.
 * @param content the content of the application.
 */
@Composable
fun OvertureTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
)
{
    val activeColorScheme = if (darkTheme) ColorScheme.dark else ColorScheme.light

    MaterialTheme(
        colorScheme = activeColorScheme,
        shapes = Shape.defaultShapes,
        typography = TODO(),
        content = content,
    )
}