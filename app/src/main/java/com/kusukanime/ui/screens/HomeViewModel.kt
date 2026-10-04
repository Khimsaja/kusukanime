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
    private val _state = MutableStateFlow(HomeUiState())
    val state: StateFlow<HomeUiState> = _state.asStateFlow()

    init { load() }

    fun load() {
        viewModelScope.launch {
            _state.value = HomeUiState(loading = true)
            val feed = runCatching { repo.feed() }
            val latest = runCatching { repo.latestAnime() }
            if (feed.isSuccess || latest.isSuccess) {
                _state.value = HomeUiState(
                    loading = false,
                    feed = feed.getOrDefault(emptyList()),
                    latest = latest.getOrDefault(emptyList()),
                )
            } else {
                // Backend unreachable (project was dormant): keep the UI reviewable.
                _state.value = HomeUiState(
                    loading = false,
                    offlineDemo = true,
                    feed = DemoData.feed,
                    latest = DemoData.latest,
                )
            }
        }
    }
}
