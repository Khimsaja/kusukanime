package com.kusukanime.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.kusukanime.data.HistoryEntry
import com.kusukanime.data.LibraryEntry
import com.kusukanime.ui.components.EmptyState
import com.kusukanime.ui.components.GlassChip
import com.kusukanime.ui.components.PosterArt
import com.kusukanime.ui.theme.GlassCard

@Composable
fun LibraryScreen(
    bookmarks: List<LibraryEntry>,
    history: List<HistoryEntry>,
    onOpenAnime: (slug: String) -> Unit,
    onResume: (HistoryEntry) -> Unit,
    modifier: Modifier = Modifier,
) {
    var tab by remember { mutableStateOf(0) }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 110.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        item {
            Column(
                Modifier.padding(start = 20.dp, end = 20.dp, top = 18.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Text("Koleksiku", style = MaterialTheme.typography.headlineMedium)
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    GlassChip(label = "Bookmark (${bookmarks.size})", selected = tab == 0, onClick = { tab = 0 })
                    GlassChip(label = "Riwayat (${history.size})", selected = tab == 1, onClick = { tab = 1 })
                }
            }
        }

        if (tab == 0) {
            if (bookmarks.isEmpty()) {
                item {
                    EmptyState(
                        title = "Belum ada bookmark",
                        subtitle = "Tekan ikon bookmark di halaman detail anime untuk menyimpannya di sini. Tersimpan lokal di perangkat.",
                        modifier = Modifier.padding(horizontal = 20.dp),
                    )
                }
            } else {
                items(bookmarks) { entry ->
                    GlassCard(modifier = Modifier.padding(horizontal = 18.dp).fillMaxWidth()) {
                        Row(
                            modifier = Modifier.clickable { onOpenAnime(entry.slug) }.padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            PosterArt(cover = entry.cover, title = entry.title, modifier = Modifier.size(52.dp), shape = RoundedCornerShape(12.dp))
                            Spacer(Modifier.width(12.dp))
                            Column(Modifier.weight(1f)) {
                                Text(entry.title, style = MaterialTheme.typography.labelLarge, maxLines = 2, overflow = TextOverflow.Ellipsis)
                                entry.meta?.let { Text(it, style = MaterialTheme.typography.labelMedium) }
                            }
                        }
                    }
                }
            }
        } else {
            if (history.isEmpty()) {
                item {
                    EmptyState(
                        title = "Belum ada riwayat",
                        subtitle = "Episode yang kamu tonton akan muncul di sini untuk dilanjutkan.",
                        modifier = Modifier.padding(horizontal = 20.dp),
                    )
                }
            } else {
                items(history) { entry ->
                    GlassCard(modifier = Modifier.padding(horizontal = 18.dp).fillMaxWidth()) {
                        Row(
                            modifier = Modifier.clickable { onResume(entry) }.padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            PosterArt(cover = entry.cover, title = entry.animeTitle, modifier = Modifier.size(52.dp), shape = RoundedCornerShape(12.dp))
                            Spacer(Modifier.width(12.dp))
                            Column(Modifier.weight(1f)) {
                                Text(entry.animeTitle, style = MaterialTheme.typography.labelLarge, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                Text(entry.episodeLabel, style = MaterialTheme.typography.labelMedium)
                            }
                        }
                    }
                }
            }
        }
    }
}
