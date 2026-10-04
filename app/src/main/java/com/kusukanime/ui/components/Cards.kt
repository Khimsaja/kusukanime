package com.kusukanime.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard
import com.kusukanime.ui.theme.ambientBrush

/** Poster artwork: real cover when available, gradient art otherwise. */
@Composable
fun PosterArt(
    cover: String?,
    title: String,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(16.dp),
) {
    Box(modifier = modifier.clip(shape)) {
        if (!cover.isNullOrBlank()) {
            AsyncImage(
                model = cover,
                contentDescription = title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(ambientBrush(title)),
            ) {
                Text(
                    text = title.take(2).uppercase(),
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White.copy(alpha = 0.85f),
                    modifier = Modifier.align(Alignment.Center),
                )
            }
        }
    }
}

@Composable
fun PosterCard(
    title: String,
    cover: String?,
    meta: String?,
    badge: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .width(112.dp)
            .clickable(onClick = onClick),
    ) {
        Box {
            PosterArt(cover = cover, title = title, modifier = Modifier.fillMaxWidth().height(150.dp))
            if (!badge.isNullOrBlank()) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(6.dp)
                        .clip(RoundedCornerShape(999.dp))
                        .background(Frost.Sky)
                        .padding(horizontal = 7.dp, vertical = 2.dp),
                ) {
                    Text(badge, style = MaterialTheme.typography.labelMedium, color = Frost.Ink, fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(Modifier.height(6.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.labelLarge,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
        if (!meta.isNullOrBlank()) {
            Text(text = meta, style = MaterialTheme.typography.labelMedium, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
    }
}

@Composable
fun SectionHeader(title: String, modifier: Modifier = Modifier, actionLabel: String? = null, onAction: (() -> Unit)? = null) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(width = 4.dp, height = 18.dp)
                .clip(RoundedCornerShape(999.dp))
                .background(Brush.verticalGradient(listOf(Frost.Sky, Frost.SkyDeep))),
        )
        Spacer(Modifier.width(8.dp))
        Text(text = title, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
        if (actionLabel != null && onAction != null) {
            Text(
                text = actionLabel,
                style = MaterialTheme.typography.labelLarge,
                color = Frost.SkyDeep,
                modifier = Modifier.clickable(onClick = onAction),
            )
        }
    }
}

@Composable
fun GlassChip(label: String, selected: Boolean, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(999.dp))
            .background(if (selected) Frost.Sky else Frost.GlassWhite)
            .clickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 8.dp),
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge,
            color = if (selected) Frost.Ink else Frost.InkSoft,
        )
    }
}

@Composable
fun EmptyState(title: String, subtitle: String, modifier: Modifier = Modifier) {
    GlassCard(modifier = modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Text(subtitle, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
