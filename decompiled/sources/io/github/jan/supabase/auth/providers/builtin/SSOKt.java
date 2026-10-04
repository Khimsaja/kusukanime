package io.github.jan.supabase.auth.providers.builtin;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.AuthKt;
import io.github.jan.supabase.auth.Utils_androidKt;
import io.github.jan.supabase.auth.providers.builtin.SSO;
import io.github.jan.supabase.auth.providers.builtin.SSOKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0080@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"loginWithSSO", "", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "onSuccess", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Lkotlin/coroutines/Continuation;", "", "redirectUrl", "", "config", "Lkotlin/Function1;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/SupabaseClient;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SSOKt {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.auth.providers.builtin.SSOKt$loginWithSSO$2", f = "SSO.kt", l = {72}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.providers.builtin.SSOKt$loginWithSSO$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ k $config;
        final /* synthetic */ SupabaseClient $supabaseClient;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SupabaseClient supabaseClient, k kVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$supabaseClient = supabaseClient;
            this.$config = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, SSO.Config config) {
            if (kVar != null) {
                kVar.invoke(config);
            }
            return C.a;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$supabaseClient, this.$config, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                Auth auth = AuthKt.getAuth(this.$supabaseClient);
                final k kVar = this.$config;
                k kVar2 = new k() { // from class: io.github.jan.supabase.auth.providers.builtin.a
                    @Override // e4.k
                    public final Object invoke(Object obj2) {
                        return SSOKt.AnonymousClass2.invokeSuspend$lambda$0(kVar, (SSO.Config) obj2);
                    }
                };
                this.L$0 = null;
                this.label = 1;
                obj = auth.retrieveSSOUrl(str, kVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return ((SSO.Result) obj).getUrl();
        }

        @Override // e4.n
        public final Object invoke(String str, c<? super String> cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(C.a);
        }
    }

    public static final Object loginWithSSO(SupabaseClient supabaseClient, n nVar, String str, k kVar, c<? super C> cVar) {
        Object objStartExternalAuth = Utils_androidKt.startExternalAuth(AuthKt.getAuth(supabaseClient), str, new AnonymousClass2(supabaseClient, kVar, null), nVar, cVar);
        return objStartExternalAuth == T3.a.f9048k ? objStartExternalAuth : C.a;
    }
}
