package io.github.jan.supabase.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"minimalConfig", "", "Lio/github/jan/supabase/auth/AuthConfigDefaults;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MinimalConfigKt {
    public static final void minimalConfig(AuthConfigDefaults authConfigDefaults) {
        l.f("<this>", authConfigDefaults);
        authConfigDefaults.setAlwaysAutoRefresh(false);
        authConfigDefaults.setAutoLoadFromStorage(false);
        authConfigDefaults.setAutoSaveToStorage(false);
        authConfigDefaults.setSessionManager(new MemorySessionManager(null, 1, null));
        authConfigDefaults.setCodeVerifierCache(new MemoryCodeVerifierCache(null, 1, null));
        authConfigDefaults.setEnableLifecycleCallbacks(false);
    }
}
