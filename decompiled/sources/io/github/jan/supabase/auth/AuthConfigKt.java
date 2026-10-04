package io.github.jan.supabase.auth;

import D6.r;
import O3.InterfaceC0554c;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\rH\u0007\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u0015"}, d2 = {"deepLink", "", "Lio/github/jan/supabase/auth/AuthConfig;", "getDeepLink$annotations", "(Lio/github/jan/supabase/auth/AuthConfig;)V", "getDeepLink", "(Lio/github/jan/supabase/auth/AuthConfig;)Ljava/lang/String;", "deepLinkOrNull", "getDeepLinkOrNull", "minimalSettings", "", "Lio/github/jan/supabase/auth/AuthConfigDefaults;", "alwaysAutoRefresh", "", "autoLoadFromStorage", "autoSaveToStorage", "sessionManager", "Lio/github/jan/supabase/auth/SessionManager;", "codeVerifierCache", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "enableLifecycleCallbacks", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthConfigKt {
    public static final String getDeepLink(AuthConfig authConfig) {
        l.f("<this>", authConfig);
        String scheme = authConfig.getScheme();
        if (scheme == null) {
            AuthExtensionsKt.noDeeplinkError("scheme");
            throw new r();
        }
        String host = authConfig.getHost();
        if (host == null) {
            AuthExtensionsKt.noDeeplinkError("host");
            throw new r();
        }
        return scheme + "://" + host;
    }

    public static /* synthetic */ void getDeepLink$annotations(AuthConfig authConfig) {
    }

    public static final String getDeepLinkOrNull(AuthConfig authConfig) {
        String host;
        l.f("<this>", authConfig);
        String scheme = authConfig.getScheme();
        if (scheme == null || (host = authConfig.getHost()) == null) {
            return null;
        }
        return scheme + "://" + host;
    }

    @InterfaceC0554c
    public static final void minimalSettings(AuthConfigDefaults authConfigDefaults, boolean z7, boolean z8, boolean z9, SessionManager sessionManager, CodeVerifierCache codeVerifierCache, boolean z10) {
        l.f("<this>", authConfigDefaults);
        authConfigDefaults.setAlwaysAutoRefresh(z7);
        authConfigDefaults.setAutoLoadFromStorage(z8);
        authConfigDefaults.setAutoSaveToStorage(z9);
        authConfigDefaults.setSessionManager(sessionManager);
        authConfigDefaults.setCodeVerifierCache(codeVerifierCache);
        authConfigDefaults.setEnableLifecycleCallbacks(z10);
    }

    public static /* synthetic */ void minimalSettings$default(AuthConfigDefaults authConfigDefaults, boolean z7, boolean z8, boolean z9, SessionManager sessionManager, CodeVerifierCache codeVerifierCache, boolean z10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        if ((i7 & 4) != 0) {
            z9 = false;
        }
        if ((i7 & 8) != 0) {
            sessionManager = new MemorySessionManager(null, 1, null);
        }
        if ((i7 & 16) != 0) {
            codeVerifierCache = new MemoryCodeVerifierCache(null, 1, null);
        }
        if ((i7 & 32) != 0) {
            z10 = false;
        }
        minimalSettings(authConfigDefaults, z7, z8, z9, sessionManager, codeVerifierCache, z10);
    }
}
