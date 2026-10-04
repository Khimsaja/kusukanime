package com.kusukanime.data

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

private val Context.dataStore by preferencesDataStore(name = "kusu_library")

@Serializable
data class LibraryEntry(
    val slug: String,
    val title: String,
    val cover: String? = null,
    val meta: String? = null,
    val savedAt: Long = System.currentTimeMillis(),
)

@Serializable
data class HistoryEntry(
    val animeSlug: String,
    val animeTitle: String,
    val episodeSlug: String,
    val episodeLabel: String,
    val cover: String? = null,
    val positionMs: Long = 0,
    val durationMs: Long = 0,
    val updatedAt: Long = System.currentTimeMillis(),
) {
    val progress: Float
        get() = if (durationMs > 0) (positionMs.toFloat() / durationMs).coerceIn(0f, 1f) else 0f
}

/** Local-only bookmarks & watch history (the social layer moves to Supabase later). */
class LibraryStore(private val context: Context) {
    private val json = Json { ignoreUnknownKeys = true }

    private val bookmarksKey = stringPreferencesKey("bookmarks_json")
    private val historyKey = stringPreferencesKey("history_json")

    val bookmarks: Flow<List<LibraryEntry>> = context.dataStore.data.map { prefs ->
        decode(prefs[bookmarksKey])
    }

    val history: Flow<List<HistoryEntry>> = context.dataStore.data.map { prefs ->
        runCatching {
            prefs[historyKey]?.let { json.decodeFromString<List<HistoryEntry>>(it) }
        }.getOrNull().orEmpty()
    }

    private fun decode(raw: String?): List<LibraryEntry> =
        runCatching { raw?.let { json.decodeFromString<List<LibraryEntry>>(it) } }.getOrNull().orEmpty()

    suspend fun toggleBookmark(entry: LibraryEntry) {
        context.dataStore.edit { prefs ->
            val current = decode(prefs[bookmarksKey]).toMutableList()
            if (current.any { it.slug == entry.slug }) {
                current.removeAll { it.slug == entry.slug }
            } else {
                current.add(0, entry)
            }
            prefs[bookmarksKey] = json.encodeToString(current)
        }
    }

    suspend fun recordHistory(entry: HistoryEntry) {
        context.dataStore.edit { prefs ->
            val current = runCatching {
                prefs[historyKey]?.let { json.decodeFromString<List<HistoryEntry>>(it) }
            }.getOrNull().orEmpty().toMutableList()
            current.removeAll { it.episodeSlug == entry.episodeSlug }
            current.add(0, entry)
            prefs[historyKey] = json.encodeToString(current.take(60))
        }
    }

    suspend fun clearHistory() {
        context.dataStore.edit { it.remove(historyKey) }
    }
}
