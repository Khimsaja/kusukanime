package com.kusukanime.ui.nav

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.kusukanime.BuildConfig
import com.kusukanime.data.AnimeRepository
import com.kusukanime.data.HistoryEntry
import com.kusukanime.data.LibraryEntry
import com.kusukanime.data.LibraryStore
import com.kusukanime.ui.components.GlassBottomNav
import com.kusukanime.ui.components.Tab
import com.kusukanime.ui.screens.DetailScreen
import com.kusukanime.ui.screens.HomeScreen
import com.kusukanime.ui.screens.LibraryScreen
import com.kusukanime.ui.screens.PlayerScreen
import com.kusukanime.ui.screens.ProfileScreen
import com.kusukanime.ui.screens.ScheduleScreen
import com.kusukanime.ui.screens.SearchScreen
import com.kusukanime.ui.theme.FrostBackground
import kotlinx.coroutines.launch
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

private fun enc(value: String): String = URLEncoder.encode(value, StandardCharsets.UTF_8.toString())

object Routes {
    const val HOME = "home"
    const val SCHEDULE = "schedule"
    const val SEARCH = "search"
    const val LIBRARY = "library"
    const val PROFILE = "profile"
    const val DETAIL = "detail/{slug}"
    const val PLAYER = "player/{animeSlug}/{episodeSlug}?title={title}&label={label}"

    fun detail(slug: String) = "detail/${enc(slug)}"
    fun player(animeSlug: String, episodeSlug: String, title: String, label: String) =
        "player/${enc(animeSlug)}/${enc(episodeSlug)}?title=${enc(title)}&label=${enc(label)}"
}

@Composable
fun AppNav(
    initialSlug: String?,
    store: LibraryStore,
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val nav = rememberNavController()
    var tab by remember { mutableStateOf(Tab.Home) }

    val bookmarks by store.bookmarks.collectAsState(initial = emptyList())
    val history by store.history.collectAsState(initial = emptyList())

    fun goTab(t: Tab) {
        tab = t
        val route = when (t) {
            Tab.Home -> Routes.HOME
            Tab.Schedule -> Routes.SCHEDULE
            Tab.Search -> Routes.SEARCH
            Tab.Library -> Routes.LIBRARY
            Tab.Profile -> Routes.PROFILE
        }
        nav.navigate(route) {
            popUpTo(Routes.HOME) { saveState = true }
            launchSingleTop = true
            restoreState = true
        }
    }

    FrostBackground(Modifier.fillMaxSize()) {
        Box(Modifier.fillMaxSize()) {
            NavHost(navController = nav, startDestination = Routes.HOME, modifier = Modifier.fillMaxSize()) {
                composable(Routes.HOME) {
                    HomeScreen(
                        onOpenAnime = { nav.navigate(Routes.detail(it)) },
                        onOpenEpisode = { slug, ep, title ->
                            nav.navigate(Routes.player(slug, ep, title, "Episode"))
                        },
                        onOpenSearch = { goTab(Tab.Search) },
                        history = history,
                    )
                }
                composable(Routes.SCHEDULE) {
                    ScheduleScreen(onOpenAnime = { nav.navigate(Routes.detail(it)) })
                }
                composable(Routes.SEARCH) {
                    SearchScreen(onOpenAnime = { nav.navigate(Routes.detail(it)) })
                }
                composable(Routes.LIBRARY) {
                    LibraryScreen(
                        bookmarks = bookmarks,
                        history = history,
                        onOpenAnime = { nav.navigate(Routes.detail(it)) },
                        onResume = { entry ->
                            nav.navigate(Routes.player(entry.animeSlug, entry.episodeSlug, entry.animeTitle, entry.episodeLabel))
                        },
                    )
                }
                composable(Routes.PROFILE) {
                    ProfileScreen(
                        bookmarkCount = bookmarks.size,
                        historyCount = history.size,
                        onCheckUpdate = {
                            scope.launch {
                                val ota = AnimeRepository().otaCheck(BuildConfig.VERSION_CODE)
                                val msg = when {
                                    ota?.update == true -> "Ada pembaruan: v${ota.latest?.versionName} — unduh dari halaman rilis."
                                    ota != null -> "Sudah versi terbaru (${BuildConfig.VERSION_NAME})."
                                    else -> "Tidak bisa menghubungi server pembaruan."
                                }
                                Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
                            }
                        },
                    )
                }
                composable(
                    Routes.DETAIL,
                    arguments = listOf(navArgument("slug") { type = NavType.StringType }),
                ) { entry ->
                    val slug = entry.arguments?.getString("slug") ?: ""
                    DetailScreen(
                        slug = slug,
                        onBack = { nav.popBackStack() },
                        onPlay = { episodeSlug, label ->
                            nav.navigate(Routes.player(slug, episodeSlug, slug, label))
                        },
                        bookmarked = bookmarks.any { it.slug == slug },
                        onToggleBookmark = { detail ->
                            scope.launch {
                                store.toggleBookmark(
                                    LibraryEntry(
                                        slug = slug,
                                        title = detail.title,
                                        cover = detail.cover,
                                        meta = detail.info["Tahun"],
                                    )
                                )
                            }
                        },
                    )
                }
                composable(
                    Routes.PLAYER,
                    arguments = listOf(
                        navArgument("animeSlug") { type = NavType.StringType },
                        navArgument("episodeSlug") { type = NavType.StringType },
                        navArgument("title") { type = NavType.StringType; defaultValue = "" },
                        navArgument("label") { type = NavType.StringType; defaultValue = "Episode" },
                    ),
                ) { entry ->
                    val animeSlug = entry.arguments?.getString("animeSlug") ?: ""
                    val episodeSlug = entry.arguments?.getString("episodeSlug") ?: ""
                    val title = entry.arguments?.getString("title")?.ifBlank { animeSlug } ?: animeSlug
                    val label = entry.arguments?.getString("label") ?: "Episode"
                    PlayerScreen(
                        animeSlug = animeSlug,
                        animeTitle = title,
                        episodeSlug = episodeSlug,
                        episodeLabel = label,
                        onBack = { nav.popBackStack() },
                        onHistory = { positionMs, durationMs ->
                            scope.launch {
                                store.recordHistory(
                                    HistoryEntry(
                                        animeSlug = animeSlug,
                                        animeTitle = title,
                                        episodeSlug = episodeSlug,
                                        episodeLabel = label,
                                        positionMs = positionMs,
                                        durationMs = durationMs,
                                    )
                                )
                            }
                        },
                    )
                }
            }

            // Floating glass nav — hidden on detail/player so content breathes.
            val dest = nav.currentBackStackEntryFlow.collectAsState(initial = null).value?.destination?.route
            if (dest == null || dest in setOf(Routes.HOME, Routes.SCHEDULE, Routes.SEARCH, Routes.LIBRARY, Routes.PROFILE)) {
                GlassBottomNav(
                    selected = tab,
                    onSelect = { goTab(it) },
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 16.dp),
                )
            }
        }
    }

    // Deep link kusukanime://anime/<slug>
    androidx.compose.runtime.LaunchedEffect(initialSlug) {
        if (!initialSlug.isNullOrBlank()) {
            nav.navigate(Routes.detail(initialSlug))
        }
    }
}
