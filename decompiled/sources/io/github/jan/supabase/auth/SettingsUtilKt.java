package io.github.jan.supabase.auth;

import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.util.PlatformUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"createDefaultSettings", "Lcom/russhwolf/settings/Settings;", "createDefaultSettingsKey", "", "supabaseUrl", "createDefaultSessionManager", "Lio/github/jan/supabase/auth/SessionManager;", "Lio/github/jan/supabase/auth/Auth;", "createDefaultCodeVerifierCache", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SupabaseInternal
    public static final CodeVerifierCache createDefaultCodeVerifierCache(Auth auth) {
        l.f("<this>", auth);
        int i7 = 1;
        E3.a aVar = null;
        Object[] objArr = 0;
        if (PlatformUtils.INSTANCE.getIS_NODE()) {
            return new MemoryCodeVerifierCache(null, 1, null);
        }
        return new SettingsCodeVerifierCache(aVar, createDefaultSettingsKey(auth.getSupabaseClient().getSupabaseUrl()) + "-supabase_code_verifier", i7, objArr == true ? 1 : 0);
    }

    @SupabaseInternal
    public static final SessionManager createDefaultSessionManager(Auth auth) {
        l.f("<this>", auth);
        if (PlatformUtils.INSTANCE.getIS_NODE()) {
            return new MemorySessionManager(null, 1, null);
        }
        return new SettingsSessionManager(null, createDefaultSettingsKey(auth.getSupabaseClient().getSupabaseUrl()) + "-session", null, 5, null);
    }

    @SupabaseInternal
    public static final E3.a createDefaultSettings() {
        try {
            return z1.c.c();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create default settings for SettingsSessionManager. You might have to provide a custom settings instance or a custom session manager. Learn more at https://github.com/supabase-community/supabase-kt/wiki/Session-Saving");
        }
    }

    @SupabaseInternal
    public static final String createDefaultSettingsKey(String str) {
        l.f("supabaseUrl", str);
        return "sb-".concat(AbstractC2517v.Q(AbstractC2517v.Q(AbstractC2510o.p0(str, "/"), '/', '-'), '.', '-'));
    }
}
