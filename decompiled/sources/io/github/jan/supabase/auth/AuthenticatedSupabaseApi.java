package io.github.jan.supabase.auth;

import O3.C;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.network.SupabaseApi;
import io.github.jan.supabase.plugins.SupabasePlugin;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0094\u0001\b\u0007\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0003\u00125\b\u0002\u0010\b\u001a/\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003¢\u0006\u0002\b\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00042\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\u0002\b\u0012H\u0096@¢\u0006\u0002\u0010\u001bJ'\u0010\u0018\u001a\u00020\n2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\u0002\b\u0012H\u0086@¢\u0006\u0002\u0010\u001cJ/\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00042\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\u0002\b\u0012H\u0096@¢\u0006\u0002\u0010\u001bR!\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0003¢\u0006\u0002\b\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "Lio/github/jan/supabase/network/SupabaseApi;", "resolveUrl", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", ContentDisposition.Parameters.Name, "path", "parseErrorResponse", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "response", "Lkotlin/coroutines/Continuation;", "Lio/github/jan/supabase/exceptions/RestException;", "", "defaultRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "jwtToken", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;)V", "rawRequest", "url", "builder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareRequest", "Lio/ktor/client/statement/HttpStatement;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthenticatedSupabaseApi extends SupabaseApi {
    private final k defaultRequest;
    private final String jwtToken;

    @U3.e(c = "io.github.jan.supabase.auth.AuthenticatedSupabaseApi", f = "AuthenticatedSupabaseApi.kt", l = {24, 25}, m = "rawRequest", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthenticatedSupabaseApi$rawRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticatedSupabaseApi.this.rawRequest(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SupabaseInternal
    public AuthenticatedSupabaseApi(k kVar, n nVar, k kVar2, SupabaseClient supabaseClient, String str) {
        super(kVar, nVar, supabaseClient);
        l.f("resolveUrl", kVar);
        l.f("supabaseClient", supabaseClient);
        this.defaultRequest = kVar2;
        this.jwtToken = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C prepareRequest$lambda$0(AuthenticatedSupabaseApi authenticatedSupabaseApi, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$prepareRequest", httpRequestBuilder);
        String strCurrentAccessTokenOrNull = authenticatedSupabaseApi.jwtToken;
        if (strCurrentAccessTokenOrNull == null) {
            SupabasePlugin<?> supabasePlugin = authenticatedSupabaseApi.getSupabaseClient().getPluginManager().getInstalledPlugins().get(Auth.INSTANCE.getKey());
            if (!(supabasePlugin instanceof Auth)) {
                supabasePlugin = null;
            }
            Auth auth = (Auth) supabasePlugin;
            strCurrentAccessTokenOrNull = auth != null ? auth.currentAccessTokenOrNull() : null;
            if (strCurrentAccessTokenOrNull == null) {
                strCurrentAccessTokenOrNull = authenticatedSupabaseApi.getSupabaseClient().getSupabaseKey();
            }
        }
        io.ktor.client.request.UtilsKt.bearerAuth(httpRequestBuilder, strCurrentAccessTokenOrNull);
        kVar.invoke(httpRequestBuilder);
        k kVar2 = authenticatedSupabaseApi.defaultRequest;
        if (kVar2 != null) {
            kVar2.invoke(httpRequestBuilder);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C rawRequest$lambda$0(String str, k kVar, AuthenticatedSupabaseApi authenticatedSupabaseApi, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$rawRequest", httpRequestBuilder);
        io.ktor.client.request.UtilsKt.bearerAuth(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        k kVar2 = authenticatedSupabaseApi.defaultRequest;
        if (kVar2 != null) {
            kVar2.invoke(httpRequestBuilder);
        }
        return C.a;
    }

    @Override // io.github.jan.supabase.network.SupabaseApi, io.github.jan.supabase.network.SupabaseHttpClient
    public Object prepareRequest(String str, k kVar, S3.c<? super HttpStatement> cVar) {
        return super.prepareRequest(str, new I5.d(4, this, kVar), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.github.jan.supabase.network.SupabaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object rawRequest(java.lang.String r9, e4.k r10, S3.c<? super io.ktor.client.statement.HttpResponse> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r11
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi$rawRequest$1 r0 = (io.github.jan.supabase.auth.AuthenticatedSupabaseApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi$rawRequest$1 r0 = new io.github.jan.supabase.auth.AuthenticatedSupabaseApi$rawRequest$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.result
            T3.a r0 = T3.a.f9048k
            int r1 = r4.label
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L4d
            if (r1 == r2) goto L40
            if (r1 != r7) goto L38
            java.lang.Object r9 = r4.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r4.L$1
            e4.k r9 = (e4.k) r9
            java.lang.Object r9 = r4.L$0
            java.lang.String r9 = (java.lang.String) r9
            P3.r.Y(r11)
            return r11
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.Object r9 = r4.L$1
            r10 = r9
            e4.k r10 = (e4.k) r10
            java.lang.Object r9 = r4.L$0
            java.lang.String r9 = (java.lang.String) r9
            P3.r.Y(r11)
            goto L67
        L4d:
            P3.r.Y(r11)
            io.github.jan.supabase.SupabaseClient r1 = r8.getSupabaseClient()
            r11 = r2
            java.lang.String r2 = r8.jwtToken
            r4.L$0 = r9
            r4.L$1 = r10
            r4.label = r11
            r5 = 2
            r6 = 0
            r3 = 0
            java.lang.Object r11 = io.github.jan.supabase.auth.AccessTokenKt.resolveAccessToken$default(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L67
            goto L80
        L67:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L82
            io.github.jan.supabase.auth.d r1 = new io.github.jan.supabase.auth.d
            r2 = 0
            r1.<init>(r11, r10, r8, r2)
            r10 = 0
            r4.L$0 = r10
            r4.L$1 = r10
            r4.L$2 = r10
            r4.label = r7
            java.lang.Object r9 = super.rawRequest(r9, r1, r4)
            if (r9 != r0) goto L81
        L80:
            return r0
        L81:
            return r9
        L82:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "No access token available"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthenticatedSupabaseApi.rawRequest(java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    public /* synthetic */ AuthenticatedSupabaseApi(k kVar, n nVar, k kVar2, SupabaseClient supabaseClient, String str, int i7, f fVar) {
        this(kVar, (i7 & 2) != 0 ? null : nVar, (i7 & 4) != 0 ? null : kVar2, supabaseClient, (i7 & 16) != 0 ? null : str);
    }

    public final Object rawRequest(k kVar, S3.c<? super HttpResponse> cVar) {
        return rawRequest("", kVar, cVar);
    }
}
