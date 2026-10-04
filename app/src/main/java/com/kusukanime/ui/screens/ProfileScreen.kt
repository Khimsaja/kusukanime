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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.SystemUpdate
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.kusukanime.BuildConfig
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard

@Composable
fun ProfileScreen(
    bookmarkCount: Int,
    historyCount: Int,
    onCheckUpdate: () -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(bottom = 110.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        item {
            Text(
                "Profil",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 18.dp),
            )
        }

        item {
            GlassCard(modifier = Modifier.padding(horizontal = 18.dp).fillMaxWidth()) {
                Row(Modifier.padding(18.dp), verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier.size(58.dp).clip(CircleShape).background(Frost.SkySoft),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(Icons.Rounded.Person, contentDescription = null, tint = Frost.SkyDeep, modifier = Modifier.size(30.dp))
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text("Tamu", style = MaterialTheme.typography.titleMedium)
                        Text(
                            "Login Google (Supabase) menyusul — bookmark & riwayat saat ini tersimpan lokal.",
                            style = MaterialTheme.typography.bodyMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
        }

        item {
            Row(
                modifier = Modifier.padding(horizontal = 18.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                StatCard(label = "Bookmark", value = bookmarkCount.toString(), modifier = Modifier.weight(1f))
                StatCard(label = "Ditonton", value = historyCount.toString(), modifier = Modifier.weight(1f))
            }
        }

        item {
            GlassCard(modifier = Modifier.padding(horizontal = 18.dp).fillMaxWidth()) {
                Column {
                    MenuRow(
                        icon = Icons.Rounded.SystemUpdate,
                        title = "Periksa Pembaruan",
                        subtitle = "Cek OTA update dari server (api/ota-check)",
                        onClick = onCheckUpdate,
                    )
                    Row(Modifier.padding(horizontal = 16.dp, vertical = 10.dp)) {
                        Column {
                            Text("Versi aplikasi", style = MaterialTheme.typography.labelLarge)
                            Text("Kusukanime ${BuildConfig.VERSION_NAME} (${BuildConfig.VERSION_CODE})", style = MaterialTheme.typography.labelMedium)
                        }
                    }
                }
            }
        }

        item {
            Text(
                "Backend: ${BuildConfig.API_BASE_URL}",
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(horizontal = 20.dp),
            )
        }
    }
}

@Composable
private fun StatCard(label: String, value: String, modifier: Modifier = Modifier) {
    GlassCard(modifier = modifier) {
        Column(
            Modifier.padding(vertical = 16.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(2.dp),
        ) {
            Text(value, style = MaterialTheme.typography.headlineMedium, color = Frost.SkyDeep)
            Text(label, style = MaterialTheme.typography.labelMedium)
        }
    }
}

@Composable
private fun MenuRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 13.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier.size(38.dp).clip(RoundedCornerShape(12.dp)).background(Frost.SkySoft),
            contentAlignment = Alignment.Center,
        ) {
            Icon(icon, contentDescription = null, tint = Frost.SkyDeep, modifier = Modifier.size(20.dp))
        }
        Spacer(Modifier.width(12.dp))
        Column(Modifier.weight(1f)) {
            Text(title, style = MaterialTheme.typography.labelLarge)
            Text(subtitle, style = MaterialTheme.typography.labelMedium, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Icon(Icons.AutoMirrored.Rounded.KeyboardArrowRight, contentDescription = null, tint = Frost.InkFaint)
    }
}
