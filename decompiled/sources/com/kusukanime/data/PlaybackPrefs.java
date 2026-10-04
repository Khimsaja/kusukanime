package com.kusukanime.data;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0016¨\u0006\u001a"}, d2 = {"Lcom/kusukanime/data/PlaybackPrefs;", "", "<init>", "()V", "p", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "ctx", "Landroid/content/Context;", "quality", "", "saveQuality", "", "v", "introSec", "", "saveIntroSec", "outroSec", "saveOutroSec", "introPreset", "saveIntroPreset", "showInfoOverlay", "", "saveShowInfoOverlay", "autoplay", "saveAutoplay", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaybackPrefs {
    public static final int $stable = 0;
    public static final PlaybackPrefs INSTANCE = new PlaybackPrefs();

    private PlaybackPrefs() {
    }

    private final SharedPreferences p(Context ctx) {
        return ctx.getSharedPreferences("kusu_settings", 0);
    }

    public final boolean autoplay(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getBoolean("autoplay", true);
    }

    public final String introPreset(Context ctx) {
        l.f("ctx", ctx);
        String string = p(ctx).getString("intro_preset", "off");
        return string == null ? "off" : string;
    }

    public final int introSec(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getInt("intro_sec", 0);
    }

    public final int outroSec(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getInt("outro_sec", 0);
    }

    public final String quality(Context ctx) {
        l.f("ctx", ctx);
        String string = p(ctx).getString("quality", "");
        return string == null ? "" : string;
    }

    public final void saveAutoplay(Context ctx, boolean v5) {
        l.f("ctx", ctx);
        p(ctx).edit().putBoolean("autoplay", v5).apply();
    }

    public final void saveIntroPreset(Context ctx, String v5) {
        l.f("ctx", ctx);
        l.f("v", v5);
        p(ctx).edit().putString("intro_preset", v5).apply();
    }

    public final void saveIntroSec(Context ctx, int v5) {
        l.f("ctx", ctx);
        p(ctx).edit().putInt("intro_sec", v5).apply();
    }

    public final void saveOutroSec(Context ctx, int v5) {
        l.f("ctx", ctx);
        p(ctx).edit().putInt("outro_sec", v5).apply();
    }

    public final void saveQuality(Context ctx, String v5) {
        l.f("ctx", ctx);
        l.f("v", v5);
        p(ctx).edit().putString("quality", v5).apply();
    }

    public final void saveShowInfoOverlay(Context ctx, boolean v5) {
        l.f("ctx", ctx);
        p(ctx).edit().putBoolean("info_overlay", v5).apply();
    }

    public final boolean showInfoOverlay(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getBoolean("info_overlay", false);
    }
}
