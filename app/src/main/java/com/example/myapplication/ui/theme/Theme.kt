package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = green900,
    secondary =  green300,
    surface = white150,
    onPrimary = white,
    background = grey,
    onBackground = white,
    onSecondary = grey,
    onSurface = white850
)


private val LightColorPalette = lightColors(
    primary = pink100,
    secondary =  pink900,
    background = white,
    surface = white850,
    onPrimary = grey,
    onSecondary = white,
    onBackground = grey,
    onSurface = grey


//    onBackground = lightBlue,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun BloomTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}