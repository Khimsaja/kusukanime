package io.github.jan.supabase.auth;

import O3.C;
import U3.j;
import e4.k;
import e4.n;
import io.github.jan.supabase.auth.providers.OAuthProvider;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HttpMethod;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "redirectTo"}, k = 3, mv = {2, 2, 0}, xi = 48)
@U3.e(c = "io.github.jan.supabase.auth.AuthImpl$linkIdentity$fetchUrl$1", f = "AuthImpl.kt", l = {167, 651}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AuthImpl$linkIdentity$fetchUrl$1 extends j implements n {
    final /* synthetic */ k $config;
    final /* synthetic */ OAuthProvider $provider;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AuthImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthImpl$linkIdentity$fetchUrl$1(AuthImpl authImpl, OAuthProvider oAuthProvider, k kVar, S3.c<? super AuthImpl$linkIdentity$fetchUrl$1> cVar) {
        super(2, cVar);
        this.this$0 = authImpl;
        this.$provider = oAuthProvider;
        this.$config = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C invokeSuspend$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "skip_http_redirect", Boolean.TRUE);
        return C.a;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        AuthImpl$linkIdentity$fetchUrl$1 authImpl$linkIdentity$fetchUrl$1 = new AuthImpl$linkIdentity$fetchUrl$1(this.this$0, this.$provider, this.$config, cVar);
        authImpl$linkIdentity$fetchUrl$1.L$0 = obj;
        return authImpl$linkIdentity$fetchUrl$1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(2:6|(4:21|(3:23|(1:26)|(1:28))|29|30)(2:31|32))(2:7|8))(1:9))(3:10|(0)|19)|13|33|14|17) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r9 == r1) goto L19;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            java.lang.String r0 = (java.lang.String) r0
            T3.a r1 = T3.a.f9048k
            int r2 = r8.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 == r5) goto L29
            if (r2 != r4) goto L21
            java.lang.Object r0 = r8.L$3
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0
            java.lang.Object r0 = r8.L$2
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0
            java.lang.Object r0 = r8.L$1
            java.lang.String r0 = (java.lang.String) r0
            P3.r.Y(r9)
            goto L86
        L21:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L29:
            java.lang.Object r0 = r8.L$1
            java.lang.String r0 = (java.lang.String) r0
            P3.r.Y(r9)
            goto L59
        L31:
            P3.r.Y(r9)
            io.github.jan.supabase.auth.AuthImpl r9 = r8.this$0
            io.github.jan.supabase.auth.providers.OAuthProvider r2 = r8.$provider
            java.lang.String r6 = "user/identities/authorize"
            e4.k r7 = r8.$config
            java.lang.String r9 = r9.getOAuthUrl(r2, r0, r6, r7)
            io.github.jan.supabase.auth.AuthImpl r0 = r8.this$0
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r0 = r0.getApi()
            io.github.jan.supabase.auth.c r2 = new io.github.jan.supabase.auth.c
            r6 = 0
            r2.<init>(r6)
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r5
            java.lang.Object r9 = r0.rawRequest(r9, r2, r8)
            if (r9 != r1) goto L59
            goto L85
        L59:
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            io.ktor.client.call.HttpClientCall r9 = r9.getCall()
            kotlin.jvm.internal.z r0 = kotlin.jvm.internal.y.a
            java.lang.Class<kotlinx.serialization.json.c> r2 = kotlinx.serialization.json.c.class
            l4.d r0 = r0.b(r2)
            l4.w r2 = kotlin.jvm.internal.y.a(r2)     // Catch: java.lang.Throwable -> L6c
            goto L6d
        L6c:
            r2 = r3
        L6d:
            io.ktor.util.reflect.TypeInfo r5 = new io.ktor.util.reflect.TypeInfo
            r5.<init>(r0, r2)
            r8.L$0 = r3
            r8.L$1 = r3
            r8.L$2 = r3
            r8.L$3 = r3
            r0 = 0
            r8.I$0 = r0
            r8.label = r4
            java.lang.Object r9 = r9.bodyNullable(r5, r8)
            if (r9 != r1) goto L86
        L85:
            return r1
        L86:
            if (r9 == 0) goto Lac
            kotlinx.serialization.json.c r9 = (kotlinx.serialization.json.c) r9
            java.lang.String r0 = "url"
            java.lang.Object r9 = r9.get(r0)
            kotlinx.serialization.json.b r9 = (kotlinx.serialization.json.b) r9
            if (r9 == 0) goto La4
            kotlinx.serialization.json.d r9 = a6.l.f(r9)
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonNull
            if (r0 == 0) goto L9d
            goto La1
        L9d:
            java.lang.String r3 = r9.a()
        La1:
            if (r3 == 0) goto La4
            return r3
        La4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "No URL found in response"
            r9.<init>(r0)
            throw r9
        Lac:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthImpl$linkIdentity$fetchUrl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // e4.n
    public final Object invoke(String str, S3.c<? super String> cVar) {
        return ((AuthImpl$linkIdentity$fetchUrl$1) create(str, cVar)).invokeSuspend(C.a);
    }
}
