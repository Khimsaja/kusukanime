package io.github.jan.supabase.auth.providers;

import io.github.jan.supabase.auth.providers.OAuthProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, d2 = {"invoke", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/OAuthProvider$Companion;", "provider", "", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProvidersKt {
    public static final OAuthProvider invoke(OAuthProvider.Companion companion, String str) {
        l.f("<this>", companion);
        l.f("provider", str);
        return new OAuthProvider(str) { // from class: io.github.jan.supabase.auth.providers.ProvidersKt.invoke.1
            private final String name;

            {
                this.name = str;
            }

            @Override // io.github.jan.supabase.auth.providers.OAuthProvider
            public String getName() {
                return this.name;
            }
        };
    }
}
