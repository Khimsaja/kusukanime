package com.kusukanime.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kusukanime.data.AnimeDetail
import com.kusukanime.data.AnimeRepository
import com.kusukanime.data.DemoData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class DetailUiState(
    val loading: Boolean = true,
    val detail: AnimeDetail? = null,
    val demoMode: Boolean = false,
)

class DetailViewModel(private val repo: AnimeRepository = AnimeRepository()) : ViewModel() {
    private val _state = MutableStateFlow(DetailUiState())
    val state: StateFlow<DetailUiState> = _state.asStateFlow()

    fun load(slug: String) {
        viewModelScope.launch {
            _state.value = DetailUiState(loading = true)
            runCatching { repo.detail(slug) }
                .onSuccess { _state.value = DetailUiState(loading = false, detail = it) }
                .onFailure {
                    _state.value = DetailUiState(loading = false, detail = DemoData.detail(slug), demoMode = true)
                }
        }
    }
}
