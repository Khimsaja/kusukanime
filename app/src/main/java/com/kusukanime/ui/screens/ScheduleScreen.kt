package com.kusukanime.ui.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.kusukanime.data.AnimeRepository
import com.kusukanime.data.DemoData
import com.kusukanime.data.ScheduleDay
import com.kusukanime.ui.components.EmptyState
import com.kusukanime.ui.components.GlassChip
import com.kusukanime.ui.components.PosterArt
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard

@Composable
fun ScheduleScreen(
    onOpenAnime: (slug: String) -> Unit,
    modifier: Modifier = Modifier,
    repo: AnimeRepository = remember { AnimeRepository() },
) {
    var days by remember { mutableStateOf<List<ScheduleDay>>(emptyList()) }
    var loading by remember { mutableStateOf(true) }
    var selectedDay by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) {
        days = runCatching { repo.schedule() }.getOrElse { DemoData.schedule }
        if (days.isEmpty()) days = DemoData.schedule
        loading = false
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 110.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        item {
            Text(
                "Jadwal Rilis",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 18.dp),
            )
        }

        if (loading) {
            item {
                Box(Modifier.fillMaxWidth().height(160.dp), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = Frost.SkyDeep)
                }
            }
            return@LazyColumn
        }

        if (days.isEmpty()) {
            item {
                EmptyState(
                    title = "Jadwal kosong",
                    subtitle = "API belum memberikan jadwal minggu ini.",
                    modifier = Modifier.padding(horizontal = 20.dp),
                )
            }
            return@LazyColumn
        }

        val effectiveDay = selectedDay ?: days.first().day
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(days) { day ->
                    GlassChip(
                        label = day.day,
                        selected = day.day == effectiveDay,
                        onClick = { selectedDay = day.day },
                    )
                }
            }
        }

        val itemsToday = days.firstOrNull { it.day == effectiveDay }?.items.orEmpty()
        if (itemsToday.isEmpty()) {
            item {
                EmptyState(
                    title = "Tidak ada rilis hari ini",
                    subtitle = "Belum ada judul yang terjadwal untuk $effectiveDay.",
                    modifier = Modifier.padding(horizontal = 20.dp),
                )
            }
        } else {
            items(itemsToday) { item ->
                GlassCard(modifier = Modifier.padding(horizontal = 18.dp).fillMaxWidth()) {
                    Row(
                        modifier = Modifier.clickable { onOpenAnime(item.slug) }.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        PosterArt(cover = item.cover, title = item.title, modifier = Modifier.size(52.dp), shape = RoundedCornerShape(12.dp))
                        Spacer(Modifier.width(12.dp))
                        Column(Modifier.weight(1f)) {
                            Text(item.title, style = MaterialTheme.typography.labelLarge, maxLines = 2, overflow = TextOverflow.Ellipsis)
                            item.meta?.let { Text(it, style = MaterialTheme.typography.labelMedium) }
                        }
                    }
                }
            }
        }
    }
}
