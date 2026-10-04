package io.github.jan.supabase.auth;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"defaultRedirectUrl", "", "Lio/github/jan/supabase/auth/Auth;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RedirectUrlKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final String defaultRedirectUrl(Auth auth) {
        l.f("<this>", auth);
        String defaultRedirectUrl = ((AuthConfig) auth.getConfig()).getDefaultRedirectUrl();
        return defaultRedirectUrl == null ? RedirectUrl_androidKt.defaultPlatformRedirectUrl(auth) : defaultRedirectUrl;
    }
}
