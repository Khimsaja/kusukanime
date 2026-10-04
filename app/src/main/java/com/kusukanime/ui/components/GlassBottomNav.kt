package com.kusukanime.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Bookmark
import androidx.compose.material.icons.rounded.CalendarMonth
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kusukanime.ui.theme.Frost
import com.kusukanime.ui.theme.GlassCard

enum class Tab(val label: String, val icon: ImageVector) {
    Home("Beranda", Icons.Rounded.Home),
    Schedule("Jadwal", Icons.Rounded.CalendarMonth),
    Search("Cari", Icons.Rounded.Search),
    Library("Koleksi", Icons.Rounded.Bookmark),
    Profile("Profil", Icons.Rounded.Person),
}

/** Floating frosted pill — the Anime XD capsule, in white/light-blue glass. */
@Composable
fun GlassBottomNav(
    selected: Tab,
    onSelect: (Tab) -> Unit,
    modifier: Modifier = Modifier,
) {
    GlassCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp)
            .height(64.dp),
        shape = RoundedCornerShape(999.dp),
        fill = Frost.GlassWhiteStrong,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Tab.entries.forEach { tab ->
                val active = tab == selected
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(999.dp))
                        .background(if (active) Frost.Sky else androidx.compose.ui.graphics.Color.Transparent)
                        .clickable { onSelect(tab) }
                        .padding(horizontal = if (active) 14.dp else 10.dp, vertical = 9.dp),
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = tab.icon,
                            contentDescription = tab.label,
                            tint = if (active) Frost.Ink else Frost.InkFaint,
                        )
                        if (active) {
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = tab.label,
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold,
                                color = Frost.Ink,
                            )
                        }
                    }
                }
            }
        }
    }
}
