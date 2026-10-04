package io.github.jan.supabase.auth;

import O3.C;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseExperimental;
import kotlin.Metadata;

@SupabaseExperimental
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/UrlLauncher;", "", "openUrl", "", "supabase", "Lio/github/jan/supabase/SupabaseClient;", "url", "", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface UrlLauncher {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/auth/UrlLauncher$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/github/jan/supabase/auth/UrlLauncher;", "getDEFAULT", "()Lio/github/jan/supabase/auth/UrlLauncher;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final UrlLauncher DEFAULT = new UrlLauncher() { // from class: io.github.jan.supabase.auth.UrlLauncher$Companion$DEFAULT$1
            @Override // io.github.jan.supabase.auth.UrlLauncher
            public final Object openUrl(SupabaseClient supabaseClient, String str, S3.c<? super C> cVar) {
                Object objOpenExternalUrl = Utils_androidKt.openExternalUrl(supabaseClient, str, cVar);
                return objOpenExternalUrl == T3.a.f9048k ? objOpenExternalUrl : C.a;
            }
        };

        private Companion() {
        }

        public final UrlLauncher getDEFAULT() {
            return DEFAULT;
        }
    }

    Object openUrl(SupabaseClient supabaseClient, String str, S3.c<? super C> cVar);
}
