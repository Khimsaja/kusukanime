package com.kusukanime.data;

import A3.e;
import O3.C;
import android.content.Context;
import android.content.SharedPreferences;
import com.kusukanime.BuildConfig;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.AuthConfig;
import io.github.jan.supabase.auth.FlowType;
import io.github.jan.supabase.auth.SettingsCodeVerifierCache;
import io.github.jan.supabase.auth.SettingsSessionManager;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.storage.Storage;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/kusukanime/data/SbClient;", "", "<init>", "()V", "client", "Lio/github/jan/supabase/SupabaseClient;", "lastKey", "", "appCtx", "Landroid/content/Context;", "init", "", "ctx", "ready", "", "getOrNull", "get", "reset", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SbClient {
    private static volatile Context appCtx;
    private static volatile SupabaseClient client;
    private static volatile String lastKey;
    public static final SbClient INSTANCE = new SbClient();
    public static final int $stable = 8;

    private SbClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C getOrNull$lambda$0$0$0(AuthConfig authConfig) {
        l.f("$this$install", authConfig);
        authConfig.setFlowType(FlowType.IMPLICIT);
        authConfig.setScheme("kusukanime");
        authConfig.setHost("login-callback");
        authConfig.setDefaultRedirectUrl(GoogleAuth.REDIRECT);
        Context context = appCtx;
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("supabase_session", 0);
            l.c(sharedPreferences);
            E3.b bVar = new E3.b(true, 0, sharedPreferences);
            authConfig.setSessionManager(new SettingsSessionManager(bVar, null, null, 6, null));
            authConfig.setCodeVerifierCache(new SettingsCodeVerifierCache(bVar, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0));
        }
        authConfig.setAutoLoadFromStorage(true);
        authConfig.setAutoSaveToStorage(true);
        authConfig.setAlwaysAutoRefresh(true);
        return C.a;
    }

    public final SupabaseClient get() {
        SupabaseClient orNull = getOrNull();
        if (orNull != null) {
            return orNull;
        }
        throw new IllegalStateException("Supabase belum siap (anon key kosong)");
    }

    public final SupabaseClient getOrNull() {
        SupabaseClient supabaseClient = null;
        if (!ready()) {
            return null;
        }
        SupabaseClient supabaseClient2 = client;
        if (supabaseClient2 != null && l.a(lastKey, BuildConfig.SUPABASE_ANON_KEY)) {
            return supabaseClient2;
        }
        synchronized (this) {
            SupabaseClient supabaseClient3 = client;
            if (supabaseClient3 != null) {
                if (l.a(lastKey, BuildConfig.SUPABASE_ANON_KEY)) {
                    return supabaseClient3;
                }
            }
            try {
                SupabaseClientBuilder supabaseClientBuilder = new SupabaseClientBuilder(BuildConfig.SUPABASE_URL, BuildConfig.SUPABASE_ANON_KEY);
                supabaseClientBuilder.install(Auth.INSTANCE, new e(18));
                SupabaseClientBuilder.install$default(supabaseClientBuilder, Postgrest.INSTANCE, null, 2, null);
                SupabaseClientBuilder.install$default(supabaseClientBuilder, Storage.INSTANCE, null, 2, null);
                SupabaseClient supabaseClientBuild = supabaseClientBuilder.build();
                client = supabaseClientBuild;
                lastKey = BuildConfig.SUPABASE_ANON_KEY;
                supabaseClient = supabaseClientBuild;
            } catch (Throwable unused) {
            }
            return supabaseClient;
        }
    }

    public final void init(Context ctx) {
        l.f("ctx", ctx);
        appCtx = ctx.getApplicationContext();
    }

    public final boolean ready() {
        return (AbstractC2510o.g0(BuildConfig.SUPABASE_URL) || AbstractC2510o.g0(BuildConfig.SUPABASE_ANON_KEY)) ? false : true;
    }

    public final void reset() {
        client = null;
        lastKey = null;
    }
}
