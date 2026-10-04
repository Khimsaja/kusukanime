package com.kusukanime.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Frosted-glass surface: translucent white fill, bright hairline edge, soft
 * ambient shadow. True backdrop blur needs RenderEffect (API 31+); the
 * translucent fill over the ambient gradient gives the same read on minSdk 24.
 */
@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(22.dp),
    fill: Color = Frost.GlassWhite,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        modifier = modifier
            .shadow(elevation = 14.dp, shape = shape, clip = false, ambientColor = Color(0x1A38BDF8), spotColor = Color(0x1A38BDF8))
            .clip(shape)
            .background(fill)
            .border(1.dp, Frost.GlassStroke, shape),
        content = content,
    )
}

/** Soft sky ambient background the glass floats on. */
@Composable
fun FrostBackground(modifier: Modifier = Modifier, content: @Composable BoxScope.() -> Unit) {
    Box(
        modifier = modifier.background(
            Brush.verticalGradient(
                colors = listOf(Frost.Ice, Color(0xFFE8F4FF), Frost.Mist),
            )
        ),
        content = content,
    )
}

/** Colored blob used behind hero art so glass surfaces have something to refract. */
fun ambientBrush(seed: String): Brush {
    val palettes = listOf(
        listOf(Color(0xFF7DD3FC), Color(0xFF38BDF8), Color(0xFF818CF8)),
        listOf(Color(0xFF67E8F9), Color(0xFF38BDF8), Color(0xFF34D399)),
        listOf(Color(0xFFBAE6FD), Color(0xFF60A5FA), Color(0xFFA78BFA)),
        listOf(Color(0xFF93C5FD), Color(0xFF38BDF8), Color(0xFFF0ABFC)),
        listOf(Color(0xFF7DD3FC), Color(0xFF2DD4BF), Color(0xFF38BDF8)),
        listOf(Color(0xFFFDA4AF), Color(0xFF93C5FD), Color(0xFF38BDF8)),
    )
    val colors = palettes[(seed.hashCode().mod(palettes.size) + palettes.size) % palettes.size]
    return Brush.linearGradient(colors)
}
