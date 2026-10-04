package com.kusukanime.ui.screens

import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.media3.common.MediaItem
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.ui.PlayerView
import com.kusukanime.data.EpisodeStreamDetail
import com.kusukanime.data.StreamItem
import com.kusukanime.ui.components.EmptyState
import com.kusukanime.ui.components.SectionHeader
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard

@Composable
fun PlayerScreen(
    animeSlug: String,
    animeTitle: String,
    episodeSlug: String,
    episodeLabel: String,
    onBack: () -> Unit,
    onHistory: (positionMs: Long, durationMs: Long) -> Unit,
    modifier: Modifier = Modifier,
    vm: PlayerViewModel = viewModel(),
) {
    val state by vm.state.collectAsState()
    LaunchedEffect(episodeSlug) { vm.load(episodeSlug) }

    var activeStream by remember(episodeSlug) { mutableStateOf<StreamItem?>(null) }
    val detail = state.detail

    // Auto-pick the first direct stream once data arrives.
    LaunchedEffect(detail) {
        if (activeStream == null && detail != null) {
            activeStream = detail.pickDefaultStream()
        }
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 110.dp),
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth().padding(start = 18.dp, end = 18.dp, top = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                GlassCard(shape = CircleShape, modifier = Modifier.size(44.dp)) {
                    Box(Modifier.fillMaxSize().clickable(onClick = onBack), contentAlignment = Alignment.Center) {
                        Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Kembali", tint = Frost.Ink)
                    }
                }
                Spacer(Modifier.size(12.dp))
                Column(Modifier.weight(1f)) {
                    Text(animeTitle, style = MaterialTheme.typography.titleMedium, maxLines = 1, overflow = TextOverflow.Ellipsis)
                    Text(episodeLabel, style = MaterialTheme.typography.labelMedium, maxLines = 1)
                }
            }
        }
        item { Spacer(Modifier.height(14.dp)) }

        item {
            val stream = activeStream
            when {
                state.loading -> Box(Modifier.fillMaxWidth().aspectRatio(16f / 9f), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = Frost.SkyDeep)
                }
                stream == null -> EmptyState(
                    title = "Stream belum tersedia",
                    subtitle = "API belum memberikan sumber video untuk episode ini. Coba server lain di bawah, atau ulangi sebentar lagi.",
                    modifier = Modifier.padding(horizontal = 18.dp),
                )
                stream.isEmbed -> WebEmbed(url = stream.url.orEmpty())
                else -> ExoSurface(
                    stream = stream,
                    onProgress = onHistory,
                    modifier = Modifier.fillMaxWidth().aspectRatio(16f / 9f).padding(horizontal = 12.dp),
                )
            }
        }

        item { Spacer(Modifier.height(18.dp)) }
        item {
            SectionHeader(title = "Pilih Server & Kualitas", modifier = Modifier.padding(horizontal = 20.dp))
        }
        item { Spacer(Modifier.height(8.dp)) }

        val groups = detail?.serverGroups().orEmpty()
        if (groups.isEmpty() && !state.loading) {
            item {
                Text(
                    "Tidak ada server terdaftar untuk episode ini.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(horizontal = 20.dp),
                )
            }
        }
        items(groups) { group ->
            Column(Modifier.padding(horizontal = 18.dp, vertical = 4.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    group.server + if (group.direct) " • langsung" else " • embed",
                    style = MaterialTheme.typography.labelLarge,
                    color = Frost.SkyDeep,
                )
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    group.qualities.forEach { quality ->
                        val selected = quality == activeStream
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(999.dp))
                                .background(if (selected) Frost.Sky else Frost.GlassWhite)
                                .clickable { activeStream = quality }
                                .padding(horizontal = 13.dp, vertical = 8.dp),
                        ) {
                            Text(
                                quality.resolution ?: "Auto",
                                style = MaterialTheme.typography.labelLarge,
                                color = if (selected) Frost.Ink else Frost.InkSoft,
                            )
                        }
                    }
                }
            }
        }
    }
}

/** Flatten servers/qualities/streams into selectable groups. */
fun EpisodeStreamDetail.serverGroups(): List<com.kusukanime.data.ServerGroup> {
    if (servers.isNotEmpty()) return servers
    val all = (streams + qualities).filter { !it.url.isNullOrBlank() }
    if (all.isEmpty()) return emptyList()
    return all.groupBy { it.server ?: "Server" }.map { (server, items) ->
        com.kusukanime.data.ServerGroup(server = server, direct = items.any { !it.isEmbed }, qualities = items)
    }
}

fun EpisodeStreamDetail.pickDefaultStream(): StreamItem? {
    val groups = serverGroups()
    val direct = groups.firstOrNull { it.direct }?.qualities?.firstOrNull { !it.url.isNullOrBlank() }
    if (direct != null) return direct
    return groups.firstOrNull()?.qualities?.firstOrNull { !it.url.isNullOrBlank() }
        ?: streams.firstOrNull { !it.url.isNullOrBlank() }
}

@androidx.annotation.OptIn(UnstableApi::class)
@Composable
private fun ExoSurface(stream: StreamItem, onProgress: (Long, Long) -> Unit, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val player = remember(stream.url) {
        val dataSourceFactory = DefaultHttpDataSource.Factory()
            .setDefaultRequestProperties(stream.headers)
            .setAllowCrossProtocolRedirects(true)
        ExoPlayer.Builder(context)
            .setMediaSourceFactory(DefaultMediaSourceFactory(dataSourceFactory))
            .build()
            .apply {
                setMediaItem(MediaItem.fromUri(stream.url.orEmpty()))
                prepare()
                playWhenReady = true
            }
    }
    DisposableEffect(player) {
        val listener = object : androidx.media3.common.Player.Listener {
            override fun onPlaybackStateChanged(playbackState: Int) {
                if (playbackState == androidx.media3.common.Player.STATE_READY ||
                    playbackState == androidx.media3.common.Player.STATE_ENDED
                ) {
                    onProgress(player.currentPosition, player.duration.coerceAtLeast(0))
                }
            }
        }
        player.addListener(listener)
        onDispose {
            onProgress(player.currentPosition, player.duration.coerceAtLeast(0))
            player.removeListener(listener)
            player.release()
        }
    }
    AndroidView(
        factory = { ctx ->
            PlayerView(ctx).apply {
                this.player = player
                layoutParams = FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                )
                setShutterBackgroundColor(android.graphics.Color.BLACK)
            }
        },
        modifier = modifier.clip(RoundedCornerShape(20.dp)).background(Color.Black),
    )
}

@Composable
private fun WebEmbed(url: String) {
    var open by remember { mutableStateOf(true) }
    if (!open) {
        EmptyState(title = "Embed ditutup", subtitle = "Sumber ini berupa embed eksternal.")
        return
    }
    Dialog(onDismissRequest = { open = false }, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        AndroidView(
            factory = { ctx ->
                android.webkit.WebView(ctx).apply {
                    settings.javaScriptEnabled = true
                    settings.domStorageEnabled = true
                    webViewClient = android.webkit.WebViewClient()
                    loadUrl(url)
                }
            },
            modifier = Modifier.fillMaxSize().background(Color.Black),
        )
    }
}
