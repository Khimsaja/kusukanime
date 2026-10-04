package io.github.jan.supabase.network;

import U3.c;
import U3.e;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001Bk\b\u0007\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0003\u00125\b\u0002\u0010\b\u001a/\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0003¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0003¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ/\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u00042\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0003¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ'\u0010\u001e\u001a\u00020\u001f2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0003¢\u0006\u0002\b\u001bH\u0086@¢\u0006\u0002\u0010 R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R=\u0010\b\u001a/\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lio/github/jan/supabase/network/SupabaseApi;", "Lio/github/jan/supabase/network/SupabaseHttpClient;", "resolveUrl", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", ContentDisposition.Parameters.Name, "path", "parseErrorResponse", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "response", "Lkotlin/coroutines/Continuation;", "Lio/github/jan/supabase/exceptions/RestException;", "", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lio/github/jan/supabase/SupabaseClient;)V", "Lkotlin/jvm/functions/Function2;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "request", "url", "builder", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawRequest", "prepareRequest", "Lio/ktor/client/statement/HttpStatement;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class SupabaseApi extends SupabaseHttpClient {
    private final n parseErrorResponse;
    private final k resolveUrl;
    private final SupabaseClient supabaseClient;

    @e(c = "io.github.jan.supabase.network.SupabaseApi", f = "SupabaseApi.kt", l = {24, 25}, m = "rawRequest$suspendImpl", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.network.SupabaseApi$rawRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupabaseApi.rawRequest$suspendImpl(SupabaseApi.this, null, null, this);
        }
    }

    @SupabaseInternal
    public SupabaseApi(k kVar, n nVar, SupabaseClient supabaseClient) {
        l.f("resolveUrl", kVar);
        l.f("supabaseClient", supabaseClient);
        this.resolveUrl = kVar;
        this.parseErrorResponse = nVar;
        this.supabaseClient = supabaseClient;
    }

    public static /* synthetic */ Object prepareRequest$suspendImpl(SupabaseApi supabaseApi, String str, k kVar, S3.c<? super HttpStatement> cVar) {
        return supabaseApi.supabaseClient.getHttpClient().prepareRequest((String) supabaseApi.resolveUrl.invoke(str), kVar, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object rawRequest$suspendImpl(io.github.jan.supabase.network.SupabaseApi r6, java.lang.String r7, e4.k r8, S3.c<? super io.ktor.client.statement.HttpResponse> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.github.jan.supabase.network.SupabaseApi.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.network.SupabaseApi$rawRequest$1 r0 = (io.github.jan.supabase.network.SupabaseApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.network.SupabaseApi$rawRequest$1 r0 = new io.github.jan.supabase.network.SupabaseApi$rawRequest$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            java.lang.Object r6 = r0.L$3
            io.ktor.client.statement.HttpResponse r6 = (io.ktor.client.statement.HttpResponse) r6
            java.lang.Object r6 = r0.L$2
            e4.k r6 = (e4.k) r6
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            io.github.jan.supabase.network.SupabaseApi r6 = (io.github.jan.supabase.network.SupabaseApi) r6
            P3.r.Y(r9)
            goto L90
        L43:
            java.lang.Object r6 = r0.L$2
            e4.k r6 = (e4.k) r6
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            io.github.jan.supabase.network.SupabaseApi r6 = (io.github.jan.supabase.network.SupabaseApi) r6
            P3.r.Y(r9)
            goto L6b
        L53:
            P3.r.Y(r9)
            io.github.jan.supabase.SupabaseClient r9 = r6.supabaseClient
            io.github.jan.supabase.network.KtorSupabaseHttpClient r9 = r9.getHttpClient()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r9 = r9.request(r7, r8, r0)
            if (r9 != r1) goto L6b
            goto L8f
        L6b:
            r7 = r9
            io.ktor.client.statement.HttpResponse r7 = (io.ktor.client.statement.HttpResponse) r7
            io.ktor.http.HttpStatusCode r8 = r7.getStatus()
            boolean r8 = io.ktor.http.HttpStatusCodeKt.isSuccess(r8)
            if (r8 != 0) goto L93
            e4.n r6 = r6.parseErrorResponse
            if (r6 == 0) goto L93
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r8 = 0
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r9 = r6.invoke(r7, r0)
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.network.SupabaseApi.rawRequest$suspendImpl(io.github.jan.supabase.network.SupabaseApi, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    public final SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    @Override // io.github.jan.supabase.network.SupabaseHttpClient
    public Object prepareRequest(String str, k kVar, S3.c<? super HttpStatement> cVar) {
        return prepareRequest$suspendImpl(this, str, kVar, cVar);
    }

    public Object rawRequest(String str, k kVar, S3.c<? super HttpResponse> cVar) {
        return rawRequest$suspendImpl(this, str, kVar, cVar);
    }

    @Override // io.github.jan.supabase.network.SupabaseHttpClient
    public final Object request(String str, k kVar, S3.c<? super HttpResponse> cVar) {
        return rawRequest((String) this.resolveUrl.invoke(str), kVar, cVar);
    }

    public final Object prepareRequest(k kVar, S3.c<? super HttpStatement> cVar) {
        return prepareRequest("", kVar, cVar);
    }

    public /* synthetic */ SupabaseApi(k kVar, n nVar, SupabaseClient supabaseClient, int i7, f fVar) {
        this(kVar, (i7 & 2) != 0 ? null : nVar, supabaseClient);
    }
}
