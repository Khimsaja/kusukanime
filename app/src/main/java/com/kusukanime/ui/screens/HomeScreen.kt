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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kusukanime.data.AnimeItem
import com.kusukanime.data.FeedItem
import com.kusukanime.data.HistoryEntry
import com.kusukanime.ui.components.EmptyState
import com.kusukanime.ui.components.PosterArt
import com.kusukanime.ui.components.PosterCard
import com.kusukanime.ui.components.SectionHeader
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard

@Composable
fun HomeScreen(
    onOpenAnime: (slug: String) -> Unit,
    onOpenEpisode: (animeSlug: String, episodeSlug: String, animeTitle: String) -> Unit,
    onOpenSearch: () -> Unit,
    history: List<HistoryEntry>,
    modifier: Modifier = Modifier,
    vm: HomeViewModel = viewModel(),
) {
    val state by vm.state.collectAsState()

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 110.dp),
        verticalArrangement = Arrangement.spacedBy(22.dp),
    ) {
        item {
            HomeHeader(onOpenSearch = onOpenSearch, demoMode = state.offlineDemo)
        }

        if (state.loading) {
            item {
                Box(Modifier.fillMaxWidth().height(220.dp), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = Frost.SkyDeep)
                }
            }
            return@LazyColumn
        }

        // Hero carousel from the freshest feed entries
        if (state.feed.isNotEmpty()) {
            item {
                HeroPager(
                    items = state.feed.take(5),
                    onWatch = { onOpenEpisode(it.animeSlug, it.episodeSlug, it.animeTitle) },
                )
            }
        }

        // Continue watching (local history)
        if (history.isNotEmpty()) {
            item {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    SectionHeader("Lanjutkan Menonton", modifier = Modifier.padding(horizontal = 20.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                    ) {
                        items(history) { entry ->
                            ContinueCard(entry) {
                                onOpenEpisode(entry.animeSlug, entry.episodeSlug, entry.animeTitle)
                            }
                        }
                    }
                }
            }
        }

        // Baru rilis (latest episodes feed)
        if (state.feed.isNotEmpty()) {
            item {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    SectionHeader("Baru Rilis", modifier = Modifier.padding(horizontal = 20.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                    ) {
                        items(state.feed) { feed ->
                            PosterCard(
                                title = feed.animeTitle,
                                cover = feed.cover,
                                meta = "Episode ${feed.episodeN}",
                                badge = "EP ${feed.episodeN}",
                                onClick = { onOpenAnime(feed.animeSlug) },
                            )
                        }
                    }
                }
            }
        }

        // Katalog terbaru
        if (state.latest.isNotEmpty()) {
            item {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    SectionHeader("Katalog Terbaru", modifier = Modifier.padding(horizontal = 20.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                    ) {
                        items(state.latest) { anime ->
                            PosterCard(
                                title = anime.title,
                                cover = anime.cover,
                                meta = anime.meta,
                                badge = anime.episodeN?.let { "EP $it" },
                                onClick = { onOpenAnime(anime.stableSlug) },
                            )
                        }
                    }
                }
            }
        }

        if (state.feed.isEmpty() && state.latest.isEmpty()) {
            item {
                EmptyState(
                    title = "Belum ada konten",
                    subtitle = "API belum mengembalikan data. Coba lagi sebentar, atau periksa koneksi backend api.kusukanime.id.",
                    modifier = Modifier.padding(horizontal = 20.dp),
                )
            }
        }
    }
}

@Composable
private fun HomeHeader(onOpenSearch: () -> Unit, demoMode: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 18.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text("Halo, selamat datang di", style = MaterialTheme.typography.labelMedium)
            Text("Kusukanime", style = MaterialTheme.typography.headlineMedium)
            if (demoMode) {
                Spacer(Modifier.height(4.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(999.dp))
                        .background(Frost.SkySoft)
                        .padding(horizontal = 9.dp, vertical = 3.dp),
                ) {
                    Text("Mode demo — API offline", style = MaterialTheme.typography.labelMedium, color = Frost.SkyDeep)
                }
            }
        }
        GlassCard(shape = CircleShape, modifier = Modifier.size(46.dp)) {
            Box(Modifier.fillMaxSize().clickable(onClick = onOpenSearch), contentAlignment = Alignment.Center) {
                Icon(Icons.Rounded.Search, contentDescription = "Cari anime", tint = Frost.Ink)
            }
        }
    }
}

@Composable
private fun HeroPager(items: List<FeedItem>, onWatch: (FeedItem) -> Unit) {
    val pager = rememberPagerState(pageCount = { items.size })
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        HorizontalPager(state = pager, contentPadding = PaddingValues(horizontal = 20.dp), pageSpacing = 12.dp) { page ->
            val item = items[page]
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp)
                    .clip(RoundedCornerShape(26.dp))
                    .clickable { onWatch(item) },
            ) {
                PosterArt(cover = item.cover, title = item.animeTitle, modifier = Modifier.fillMaxSize(), shape = RoundedCornerShape(26.dp))
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(Brush.verticalGradient(listOf(Color.Transparent, Color(0xB30B2A4A)))),
                )
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Rounded.Star, contentDescription = null, tint = Frost.Rating, modifier = Modifier.size(15.dp))
                        Spacer(Modifier.width(4.dp))
                        Text("Episode ${item.episodeN} • Baru saja rilis", style = MaterialTheme.typography.labelMedium, color = Color.White)
                    }
                    Text(
                        item.animeTitle,
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(999.dp))
                            .background(Frost.Sky)
                            .clickable { onWatch(item) }
                            .padding(horizontal = 16.dp, vertical = 9.dp),
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Rounded.PlayArrow, contentDescription = null, tint = Frost.Ink, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(4.dp))
                            Text("Tonton Sekarang", style = MaterialTheme.typography.labelLarge, color = Frost.Ink, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            repeat(items.size) { i ->
                Box(
                    modifier = Modifier
                        .padding(horizontal = 3.dp)
                        .size(if (pager.currentPage == i) 18.dp else 6.dp, 6.dp)
                        .clip(CircleShape)
                        .background(if (pager.currentPage == i) Frost.SkyDeep else Frost.Sky.copy(alpha = 0.35f)),
                )
            }
        }
    }
}

@Composable
private fun ContinueCard(entry: HistoryEntry, onClick: () -> Unit) {
    GlassCard(modifier = Modifier.width(240.dp)) {
        Row(
            modifier = Modifier.clickable(onClick = onClick).padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            PosterArt(cover = entry.cover, title = entry.animeTitle, modifier = Modifier.size(56.dp), shape = RoundedCornerShape(12.dp))
            Spacer(Modifier.width(10.dp))
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(3.dp)) {
                Text(entry.animeTitle, style = MaterialTheme.typography.labelLarge, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Text(entry.episodeLabel, style = MaterialTheme.typography.labelMedium, maxLines = 1)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(5.dp)
                        .clip(RoundedCornerShape(999.dp))
                        .background(Frost.SkySoft),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(entry.progress.coerceIn(0.02f, 1f))
                            .height(5.dp)
                            .clip(RoundedCornerShape(999.dp))
                            .background(Frost.Sky),
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .clip(CircleShape)
                    .background(Frost.Sky),
                contentAlignment = Alignment.Center,
            ) {
                Icon(Icons.Rounded.PlayArrow, contentDescription = "Lanjutkan", tint = Frost.Ink, modifier = Modifier.size(19.dp))
            }
        }
    }
}
