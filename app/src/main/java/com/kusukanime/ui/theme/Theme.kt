package com.kusukanime.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val FrostScheme = lightColorScheme(
    primary = Frost.Sky,
    onPrimary = Frost.Ink,
    primaryContainer = Frost.SkySoft,
    onPrimaryContainer = Frost.Ink,
    secondary = Frost.SkyDeep,
    onSecondary = androidx.compose.ui.graphics.Color.White,
    background = Frost.Ice,
    onBackground = Frost.Ink,
    surface = Frost.GlassWhite,
    onSurface = Frost.Ink,
    surfaceVariant = Frost.SkySoft,
    onSurfaceVariant = Frost.InkSoft,
    outline = Frost.GlassStroke,
    error = Frost.Danger,
)

private val FrostTypography = Typography(
    headlineMedium = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, fontSize = 26.sp, lineHeight = 32.sp, color = Frost.Ink),
    titleLarge = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, fontSize = 20.sp, lineHeight = 26.sp, color = Frost.Ink),
    titleMedium = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.SemiBold, fontSize = 16.sp, lineHeight = 22.sp, color = Frost.Ink),
    bodyLarge = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal, fontSize = 15.sp, lineHeight = 22.sp, color = Frost.InkSoft),
    bodyMedium = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal, fontSize = 13.5.sp, lineHeight = 19.sp, color = Frost.InkSoft),
    labelLarge = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.SemiBold, fontSize = 13.sp, color = Frost.Ink),
    labelMedium = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Medium, fontSize = 11.5.sp, color = Frost.InkFaint),
)

@Composable
fun KusukanimeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = FrostScheme,
        typography = FrostTypography,
        content = content,
    )
}
