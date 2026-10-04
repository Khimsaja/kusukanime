package com.kusukanime.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kusukanime.data.AnimeRepository
import com.kusukanime.data.DemoData
import com.kusukanime.data.FeedItem
import com.kusukanime.data.AnimeItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class HomeUiState(
    val loading: Boolean = true,
    val offlineDemo: Boolean = false,
    val feed: List<FeedItem> = emptyList(),
    val latest: List<AnimeItem> = emptyList(),
    val error: String? = null,
)

class HomeViewModel(private val repo: AnimeRepository = AnimeRepository()) : ViewModel() {
    // Start with the bundled catalog so the UI is never empty, then try the
    // live API in the background and swap in real data if it answers.
    private val _state = MutableStateFlow(
        HomeUiState(loading = false, offlineDemo = true, feed = DemoData.feed, latest = DemoData.latest)
    )
    val state: StateFlow<HomeUiState> = _state.asStateFlow()

    init { load() }

    fun load() {
        viewModelScope.launch {
            val feed = runCatching { repo.feed() }.getOrDefault(emptyList())
            val latest = runCatching { repo.latestAnime() }.getOrDefault(emptyList())
            if (feed.isNotEmpty() || latest.isNotEmpty()) {
                _state.value = HomeUiState(
                    loading = false,
                    offlineDemo = false,
                    feed = feed,
                    latest = latest,
                )
            }
            // Otherwise keep the demo catalog already on screen.
        }
    }
}
