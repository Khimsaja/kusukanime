package com.kusukanime.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kusukanime.data.AnimeRepository
import com.kusukanime.data.EpisodeStreamDetail
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class PlayerUiState(
    val loading: Boolean = true,
    val detail: EpisodeStreamDetail? = null,
)

class PlayerViewModel(private val repo: AnimeRepository = AnimeRepository()) : ViewModel() {
    private val _state = MutableStateFlow(PlayerUiState())
    val state: StateFlow<PlayerUiState> = _state.asStateFlow()

    fun load(episodeSlug: String) {
        viewModelScope.launch {
            _state.value = PlayerUiState(loading = true)
            val detail = runCatching { repo.episode(episodeSlug) }.getOrNull()
            _state.value = PlayerUiState(loading = false, detail = detail)
        }
    }
}
