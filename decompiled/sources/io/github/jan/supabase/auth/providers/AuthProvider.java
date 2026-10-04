package io.github.jan.supabase.auth.providers;

import O3.C;
import S3.c;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Jc\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u0010H¦@¢\u0006\u0002\u0010\u0011Je\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u001b\b\u0002\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u0010H¦@¢\u0006\u0002\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/providers/AuthProvider;", "C", "R", "", "login", "", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "onSuccess", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Lkotlin/coroutines/Continuation;", "redirectUrl", "", "config", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/SupabaseClient;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AuthProvider<C, R> {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object login$default(AuthProvider authProvider, SupabaseClient supabaseClient, n nVar, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
        }
        if ((i7 & 4) != 0) {
            str = null;
        }
        if ((i7 & 8) != 0) {
            kVar = null;
        }
        return authProvider.login(supabaseClient, nVar, str, kVar, cVar);
    }

    static /* synthetic */ Object signUp$default(AuthProvider authProvider, SupabaseClient supabaseClient, n nVar, String str, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUp");
        }
        if ((i7 & 4) != 0) {
            str = null;
        }
        if ((i7 & 8) != 0) {
            kVar = null;
        }
        return authProvider.signUp(supabaseClient, nVar, str, kVar, cVar);
    }

    Object login(SupabaseClient supabaseClient, n nVar, String str, k kVar, c<? super C> cVar);

    Object signUp(SupabaseClient supabaseClient, n nVar, String str, k kVar, c<? super R> cVar);
}
