package com.kusukanime.data;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/kusukanime/data/SocialPrefs;", "", "<init>", "()V", "PREFS", "", "KEY_JOINED", "KEY_SNOOZE_UNTIL", "KEY_PROMO", "KEY_LAUNCH_COUNT", "TELEGRAM_URL", "TELEGRAM_HANDLE", "countedThisProcess", "", "p", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "ctx", "Landroid/content/Context;", "joined", "markJoined", "", "snoozeUntil", "", "snooze", "minutes", "", "countLaunch", "launchCount", "promoEnabled", "setPromoEnabled", "v", "shouldShow", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocialPrefs {
    private static final String KEY_JOINED = "tg_joined";
    private static final String KEY_LAUNCH_COUNT = "tg_launch_count";
    private static final String KEY_PROMO = "tg_promo_enabled";
    private static final String KEY_SNOOZE_UNTIL = "tg_snooze_until";
    private static final String PREFS = "kusu_social";
    public static final String TELEGRAM_HANDLE = "@kusukanime";
    public static final String TELEGRAM_URL = "https://t.me/kusukanime";
    private static volatile boolean countedThisProcess;
    public static final SocialPrefs INSTANCE = new SocialPrefs();
    public static final int $stable = 8;

    private SocialPrefs() {
    }

    private final SharedPreferences p(Context ctx) {
        return ctx.getSharedPreferences(PREFS, 0);
    }

    public final void countLaunch(Context ctx) {
        l.f("ctx", ctx);
        if (countedThisProcess) {
            return;
        }
        countedThisProcess = true;
        p(ctx).edit().putLong(KEY_LAUNCH_COUNT, p(ctx).getLong(KEY_LAUNCH_COUNT, 0L) + 1).apply();
    }

    public final boolean joined(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getBoolean(KEY_JOINED, false);
    }

    public final long launchCount(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getLong(KEY_LAUNCH_COUNT, 0L);
    }

    public final void markJoined(Context ctx) {
        l.f("ctx", ctx);
        p(ctx).edit().putBoolean(KEY_JOINED, true).remove(KEY_SNOOZE_UNTIL).apply();
    }

    public final boolean promoEnabled(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getBoolean(KEY_PROMO, true);
    }

    public final void setPromoEnabled(Context ctx, boolean v5) {
        l.f("ctx", ctx);
        p(ctx).edit().putBoolean(KEY_PROMO, v5).apply();
    }

    public final boolean shouldShow(Context ctx) {
        l.f("ctx", ctx);
        return promoEnabled(ctx) && !joined(ctx) && System.currentTimeMillis() >= snoozeUntil(ctx) && launchCount(ctx) - 1 >= 1;
    }

    public final void snooze(Context ctx, int minutes) {
        l.f("ctx", ctx);
        p(ctx).edit().putLong(KEY_SNOOZE_UNTIL, (minutes * 60000) + System.currentTimeMillis()).apply();
    }

    public final long snoozeUntil(Context ctx) {
        l.f("ctx", ctx);
        return p(ctx).getLong(KEY_SNOOZE_UNTIL, 0L);
    }
}
