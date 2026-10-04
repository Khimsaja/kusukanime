package com.kusukanime.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.BookmarkBorder
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kusukanime.data.AnimeDetail
import com.kusukanime.ui.components.PosterArt
import com.kusukanime.ui.components.SectionHeader
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard

@Composable
fun DetailScreen(
    slug: String,
    onBack: () -> Unit,
    onPlay: (episodeSlug: String, episodeLabel: String) -> Unit,
    bookmarked: Boolean,
    onToggleBookmark: (AnimeDetail) -> Unit,
    modifier: Modifier = Modifier,
    vm: DetailViewModel = viewModel(),
) {
    val state by vm.state.collectAsState()
    LaunchedEffect(slug) { vm.load(slug) }

    val detail = state.detail
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 110.dp),
    ) {
        item {
            Box(Modifier.fillMaxWidth().height(300.dp)) {
                PosterArt(
                    cover = detail?.cover,
                    title = detail?.title ?: slug,
                    modifier = Modifier.fillMaxSize(),
                    shape = RoundedCornerShape(0.dp),
                )
                Box(
                    Modifier.fillMaxSize().background(
                        Brush.verticalGradient(listOf(Color(0x660B2A4A), Color.Transparent, Color(0xCCEFF6FF)))
                    )
                )
                GlassCard(
                    shape = CircleShape,
                    modifier = Modifier.padding(start = 18.dp, top = 18.dp).size(44.dp),
                ) {
                    Box(Modifier.fillMaxSize().clickable(onClick = onBack), contentAlignment = Alignment.Center) {
                        Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Kembali", tint = Frost.Ink)
                    }
                }
            }
        }

        if (state.loading) {
            item {
                Box(Modifier.fillMaxWidth().height(160.dp), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = Frost.SkyDeep)
                }
            }
            return@LazyColumn
        }

        if (detail == null) return@LazyColumn

        item {
            GlassCard(modifier = Modifier.padding(horizontal = 18.dp).fillMaxWidth()) {
                Column(Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text(detail.title, style = MaterialTheme.typography.headlineMedium, maxLines = 3, overflow = TextOverflow.Ellipsis)
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Rounded.Star, contentDescription = null, tint = Frost.Rating, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(4.dp))
                            Text(detail.info["Skor"] ?: "—", style = MaterialTheme.typography.labelLarge)
                        }
                        detail.info["Tahun"]?.let { Text("•  $it", style = MaterialTheme.typography.labelMedium) }
                        detail.info["Status"]?.let { Text("•  $it", style = MaterialTheme.typography.labelMedium) }
                        detail.episode?.let { Text("•  $it Episode", style = MaterialTheme.typography.labelMedium) }
                    }
                    if (detail.genres.isNotEmpty()) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            detail.genres.take(4).forEach { genre ->
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(999.dp))
                                        .background(Frost.SkySoft)
                                        .padding(horizontal = 10.dp, vertical = 5.dp),
                                ) {
                                    Text(genre, style = MaterialTheme.typography.labelMedium, color = Frost.SkyDeep)
                                }
                            }
                        }
                    }
                    detail.sinopsis?.takeIf { it.isNotBlank() }?.let { synopsis ->
                        var expanded by remember { mutableStateOf(false) }
                        Text(
                            text = synopsis,
                            style = MaterialTheme.typography.bodyLarge,
                            maxLines = if (expanded) Int.MAX_VALUE else 3,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.clickable { expanded = !expanded },
                        )
                    }

                    Spacer(Modifier.height(2.dp))
                    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        val firstEp = detail.episodes.firstOrNull()
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(50.dp)
                                .clip(RoundedCornerShape(999.dp))
                                .background(Frost.Sky)
                                .clickable(enabled = firstEp != null) {
                                    firstEp?.let { onPlay(it.slug, it.title.ifBlank { "Episode ${it.n}" }) }
                                },
                            contentAlignment = Alignment.Center,
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Rounded.PlayArrow, contentDescription = null, tint = Frost.Ink)
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    if (firstEp != null) "Nonton Episode ${firstEp.n}" else "Belum ada episode",
                                    style = MaterialTheme.typography.labelLarge, fontWeight = FontWeight.Bold, color = Frost.Ink,
                                )
                            }
                        }
                        GlassCard(shape = CircleShape, modifier = Modifier.size(50.dp)) {
                            Box(Modifier.fillMaxSize().clickable { onToggleBookmark(detail) }, contentAlignment = Alignment.Center) {
                                Icon(
                                    if (bookmarked) Icons.Rounded.Bookmark else Icons.Rounded.BookmarkBorder,
                                    contentDescription = "Bookmark",
                                    tint = if (bookmarked) Frost.SkyDeep else Frost.Ink,
                                )
                            }
                        }
                        GlassCard(shape = CircleShape, modifier = Modifier.size(50.dp)) {
                            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Icon(Icons.Rounded.Share, contentDescription = "Bagikan", tint = Frost.Ink)
                            }
                        }
                    }
                }
            }
        }

        item { Spacer(Modifier.height(20.dp)) }
        item {
            SectionHeader(
                title = "Daftar Episode (${detail.episodes.size})",
                modifier = Modifier.padding(horizontal = 20.dp),
            )
        }
        item { Spacer(Modifier.height(10.dp)) }
        items(detail.episodes) { ep ->
            GlassCard(modifier = Modifier.padding(horizontal = 18.dp, vertical = 4.dp).fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .clickable { onPlay(ep.slug, ep.title.ifBlank { "Episode ${ep.n}" }) }
                        .padding(horizontal = 14.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier.size(38.dp).clip(CircleShape).background(Frost.SkySoft),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(Icons.Rounded.PlayArrow, contentDescription = null, tint = Frost.SkyDeep, modifier = Modifier.size(20.dp))
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(Modifier.weight(1f)) {
                        Text(
                            ep.title.ifBlank { "Episode ${ep.n}" },
                            style = MaterialTheme.typography.labelLarge,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                        Text("Episode ${ep.n}", style = MaterialTheme.typography.labelMedium)
                    }
                }
            }
        }
    }
}
