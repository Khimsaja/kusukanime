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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.kusukanime.data.AnimeRepository
import com.kusukanime.data.SearchItem
import com.kusukanime.data.SearchSuggestion
import com.kusukanime.ui.components.EmptyState
import com.kusukanime.ui.components.PosterArt
import com.kusukanime.ui.components.SectionHeader
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SearchScreen(
    onOpenAnime: (slug: String) -> Unit,
    modifier: Modifier = Modifier,
    repo: AnimeRepository = remember { AnimeRepository() },
) {
    var query by remember { mutableStateOf("") }
    var suggestions by remember { mutableStateOf<List<SearchSuggestion>>(emptyList()) }
    var results by remember { mutableStateOf<List<SearchItem>>(emptyList()) }
    var searching by remember { mutableStateOf(false) }
    var submitted by remember { mutableStateOf(false) }
    val scope = androidx.compose.runtime.rememberCoroutineScope()

    LaunchedEffect(query) {
        if (query.length < 2) {
            suggestions = emptyList()
            return@LaunchedEffect
        }
        delay(280)
        suggestions = runCatching { repo.suggest(query) }.getOrDefault(emptyList())
    }

    suspend fun runSearch(q: String) {
        searching = true
        submitted = true
        results = runCatching { repo.search(q) }.getOrDefault(emptyList())
        searching = false
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 110.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        item {
            Column(Modifier.padding(start = 20.dp, end = 20.dp, top = 18.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Text("Cari Anime", style = MaterialTheme.typography.headlineMedium)
                GlassCard(shape = RoundedCornerShape(999.dp), modifier = Modifier.fillMaxWidth()) {
                    TextField(
                        value = query,
                        onValueChange = { query = it; submitted = false },
                        placeholder = { Text("Judul anime…", color = Frost.InkFaint) },
                        leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = null, tint = Frost.SkyDeep) },
                        singleLine = true,
                        keyboardOptions = androidx.compose.foundation.text.KeyboardOptions(imeAction = androidx.compose.ui.text.input.ImeAction.Search),
                        keyboardActions = androidx.compose.foundation.text.KeyboardActions(
                            onSearch = { scope.launch { runSearch(query) } }
                        ),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
            }
        }

        if (query.length >= 2 && !submitted && suggestions.isNotEmpty()) {
            item { SectionHeader("Saran", modifier = Modifier.padding(horizontal = 20.dp)) }
            items(suggestions) { suggestion ->
                GlassCard(modifier = Modifier.padding(horizontal = 18.dp).fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .clickable {
                                query = suggestion.title
                                scope.launch { runSearch(suggestion.title) }
                            }
                            .padding(horizontal = 14.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(Icons.Rounded.Search, contentDescription = null, tint = Frost.InkFaint, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(10.dp))
                        Text(suggestion.title, style = MaterialTheme.typography.bodyLarge, maxLines = 1, overflow = TextOverflow.Ellipsis)
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .clip(RoundedCornerShape(999.dp))
                        .background(Frost.Sky)
                        .clickable { scope.launch { runSearch(query) } }
                        .padding(horizontal = 18.dp, vertical = 12.dp),
                ) {
                    Text("Cari \"$query\"", style = MaterialTheme.typography.labelLarge, color = Frost.Ink)
                }
            }
        }

        if (searching) {
            item {
                Box(Modifier.fillMaxWidth().height(120.dp), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = Frost.SkyDeep)
                }
            }
        }

        if (submitted && !searching) {
            if (results.isEmpty()) {
                item {
                    EmptyState(
                        title = "Tidak ditemukan",
                        subtitle = "Tidak ada hasil untuk \"$query\". Cek ejaan, atau backend sedang offline.",
                        modifier = Modifier.padding(horizontal = 20.dp),
                    )
                }
            } else {
                item { SectionHeader("Hasil (${results.size})", modifier = Modifier.padding(horizontal = 20.dp)) }
                items(results) { item ->
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

}
