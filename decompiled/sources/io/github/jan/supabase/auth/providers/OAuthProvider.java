package io.github.jan.supabase.auth.providers;

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
import io.github.jan.supabase.auth.providers.OAuthProvider;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0096@¢\u0006\u0002\u0010\u0016J_\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/auth/providers/OAuthProvider;", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "Lio/github/jan/supabase/auth/providers/ExternalAuthConfig;", "", "<init>", "()V", ContentDisposition.Parameters.Name, "", "getName", "()Ljava/lang/String;", "login", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "onSuccess", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Lkotlin/coroutines/Continuation;", "", "redirectUrl", "config", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/SupabaseClient;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class OAuthProvider implements AuthProvider<ExternalAuthConfig, C> {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.auth.providers.OAuthProvider$login$2", f = "OAuthProvider.kt", l = {}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.auth.providers.OAuthProvider$login$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ ExternalAuthConfig $authConfig;
        final /* synthetic */ SupabaseClient $supabaseClient;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OAuthProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SupabaseClient supabaseClient, OAuthProvider oAuthProvider, ExternalAuthConfig externalAuthConfig, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$supabaseClient = supabaseClient;
            this.this$0 = oAuthProvider;
            this.$authConfig = externalAuthConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(ExternalAuthConfig externalAuthConfig, ExternalAuthConfigDefaults externalAuthConfigDefaults) {
            externalAuthConfigDefaults.getScopes().addAll(externalAuthConfig.getScopes());
            externalAuthConfigDefaults.getQueryParams().putAll(externalAuthConfig.getQueryParams());
            return C.a;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$supabaseClient, this.this$0, this.$authConfig, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.L$0;
            T3.a aVar = T3.a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            Auth auth = AuthKt.getAuth(this.$supabaseClient);
            OAuthProvider oAuthProvider = this.this$0;
            final ExternalAuthConfig externalAuthConfig = this.$authConfig;
            return Auth.getOAuthUrl$default(auth, oAuthProvider, str, null, new k() { // from class: io.github.jan.supabase.auth.providers.a
                @Override // e4.k
                public final Object invoke(Object obj2) {
                    return OAuthProvider.AnonymousClass2.invokeSuspend$lambda$0(externalAuthConfig, (ExternalAuthConfigDefaults) obj2);
                }
            }, 4, null);
        }

        @Override // e4.n
        public final Object invoke(String str, c<? super String> cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(C.a);
        }
    }

    @e(c = "io.github.jan.supabase.auth.providers.OAuthProvider", f = "OAuthProvider.kt", l = {45}, m = "signUp$suspendImpl", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.providers.OAuthProvider$signUp$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OAuthProvider.signUp$suspendImpl(OAuthProvider.this, null, null, null, null, this);
        }
    }

    public static Object login$suspendImpl(OAuthProvider oAuthProvider, SupabaseClient supabaseClient, n nVar, String str, k kVar, c<? super C> cVar) {
        ExternalAuthConfig externalAuthConfig = new ExternalAuthConfig();
        if (kVar != null) {
            kVar.invoke(externalAuthConfig);
        }
        Object objStartExternalAuth = Utils_androidKt.startExternalAuth(AuthKt.getAuth(supabaseClient), str, new AnonymousClass2(supabaseClient, oAuthProvider, externalAuthConfig, null), nVar, cVar);
        return objStartExternalAuth == T3.a.f9048k ? objStartExternalAuth : C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object signUp$suspendImpl(io.github.jan.supabase.auth.providers.OAuthProvider r4, io.github.jan.supabase.SupabaseClient r5, e4.n r6, java.lang.String r7, e4.k r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            io.github.jan.supabase.auth.providers.OAuthProvider$signUp$1 r0 = (io.github.jan.supabase.auth.providers.OAuthProvider.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            io.github.jan.supabase.auth.providers.OAuthProvider$signUp$1 r0 = new io.github.jan.supabase.auth.providers.OAuthProvider$signUp$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.result
            T3.a r1 = T3.a.f9048k
            int r2 = r9.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r4 = r9.L$4
            e4.k r4 = (e4.k) r4
            java.lang.Object r4 = r9.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r9.L$2
            e4.n r4 = (e4.n) r4
            java.lang.Object r4 = r9.L$1
            io.github.jan.supabase.SupabaseClient r4 = (io.github.jan.supabase.SupabaseClient) r4
            java.lang.Object r4 = r9.L$0
            io.github.jan.supabase.auth.providers.OAuthProvider r4 = (io.github.jan.supabase.auth.providers.OAuthProvider) r4
            P3.r.Y(r0)
            goto L5c
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L45:
            P3.r.Y(r0)
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.L$3 = r0
            r9.L$4 = r0
            r9.label = r3
            java.lang.Object r4 = r4.login(r5, r6, r7, r8, r9)
            if (r4 != r1) goto L5c
            return r1
        L5c:
            O3.C r4 = O3.C.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.providers.OAuthProvider.signUp$suspendImpl(io.github.jan.supabase.auth.providers.OAuthProvider, io.github.jan.supabase.SupabaseClient, e4.n, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    public abstract String getName();

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    public Object login(SupabaseClient supabaseClient, n nVar, String str, k kVar, c<? super C> cVar) {
        return login$suspendImpl(this, supabaseClient, nVar, str, kVar, cVar);
    }

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    public Object signUp(SupabaseClient supabaseClient, n nVar, String str, k kVar, c<? super C> cVar) {
        return signUp$suspendImpl(this, supabaseClient, nVar, str, kVar, cVar);
    }
}
