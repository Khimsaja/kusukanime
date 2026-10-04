package io.ktor.client.statement;

import U3.c;
import U3.e;
import e4.n;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000fJ\u0018\u0010\u0010\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086H¢\u0006\u0004\b\u0010\u0010\u000fJD\u0010\u0010\u001a\u00028\u0001\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0004\b\u0001\u0010\u00112$\b\u0004\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086H¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\nH\u0081@¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\nH\u0081@¢\u0006\u0004\b\u0013\u0010\u000fJ\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\nH\u0081@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lio/ktor/client/statement/HttpStatement;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V", "T", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "LS3/c;", "block", "execute", "(Le4/n;LS3/c;)Ljava/lang/Object;", "(LS3/c;)Ljava/lang/Object;", "body", "R", "fetchStreamingResponse", "fetchResponse", "LO3/C;", "cleanup", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "getClient$annotations", "()V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpStatement {
    private final HttpRequestBuilder builder;
    private final HttpClient client;

    @e(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {185}, m = "cleanup")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.HttpStatement$cleanup$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.cleanup(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {54, 57, 59, 59}, m = "execute")
    /* renamed from: io.ktor.client.statement.HttpStatement$execute$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12131<T> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12131(S3.c<? super C12131> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.execute(null, this);
        }
    }

    @e(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {162, 165, 166}, m = "fetchResponse")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.HttpStatement$fetchResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12141 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12141(S3.c<? super C12141> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.fetchResponse(this);
        }
    }

    @e(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {150}, m = "fetchStreamingResponse")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12151 extends c {
        int label;
        /* synthetic */ Object result;

        public C12151(S3.c<? super C12151> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.fetchStreamingResponse(this);
        }
    }

    public HttpStatement(HttpRequestBuilder httpRequestBuilder, HttpClient httpClient) {
        l.f("builder", httpRequestBuilder);
        l.f("client", httpClient);
        this.builder = httpRequestBuilder;
        this.client = httpClient;
    }

    public static /* synthetic */ void getClient$annotations() {
    }

    public final <T> Object body(S3.c<? super T> cVar) throws Throwable {
        try {
            HttpResponse httpResponse = (HttpResponse) fetchStreamingResponse(null);
            try {
                httpResponse.getCall();
                l.k();
                throw null;
            } catch (Throwable th) {
                HttpResponseKt.complete(httpResponse);
                throw th;
            }
        } catch (CancellationException e7) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cleanup(io.ktor.client.statement.HttpResponse r5, S3.c<? super O3.C> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.statement.HttpStatement.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = (io.ktor.client.statement.HttpStatement.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = new io.ktor.client.statement.HttpStatement$cleanup$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            H5.r r5 = (H5.r) r5
            P3.r.Y(r6)
            goto L5f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            P3.r.Y(r6)
            S3.h r6 = r5.getCoroutineContext()
            H5.e0 r2 = H5.C0263e0.f3843k
            S3.f r6 = r6.get(r2)
            kotlin.jvm.internal.l.c(r6)
            H5.r r6 = (H5.r) r6
            r2 = r6
            H5.h0 r2 = (H5.h0) r2
            r2.Z()
            io.ktor.utils.io.ByteReadChannel r5 = r5.getRawContent()     // Catch: java.lang.Throwable -> L52
            io.ktor.utils.io.ByteReadChannelKt.cancel(r5)     // Catch: java.lang.Throwable -> L52
        L52:
            r0.L$0 = r6
            r0.label = r3
            H5.n0 r6 = (H5.n0) r6
            java.lang.Object r5 = r6.m(r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.cleanup(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:54|(1:(1:(1:(1:(2:14|15)(3:16|17|49))(3:21|22|23))(5:24|55|25|41|(2:43|48)(1:44)))(2:29|30))(4:32|33|(1:35)|48)|36|52|37|(3:40|41|(0)(0))|48) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
    
        if (cleanup(r10, r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object execute(e4.n r9, S3.c<? super T> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.client.statement.HttpStatement.C12131
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.statement.HttpStatement$execute$1 r0 = (io.ktor.client.statement.HttpStatement.C12131) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$execute$1 r0 = new io.ktor.client.statement.HttpStatement$execute$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L51
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3e
            if (r2 == r3) goto L34
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            P3.r.Y(r10)     // Catch: java.util.concurrent.CancellationException -> L3c
            goto L8f
        L3c:
            r9 = move-exception
            goto L90
        L3e:
            java.lang.Object r9 = r0.L$0
            P3.r.Y(r10)     // Catch: java.util.concurrent.CancellationException -> L3c
            return r9
        L44:
            java.lang.Object r9 = r0.L$0
            io.ktor.client.statement.HttpResponse r9 = (io.ktor.client.statement.HttpResponse) r9
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L4c
            goto L77
        L4c:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto L84
        L51:
            java.lang.Object r9 = r0.L$0
            e4.n r9 = (e4.n) r9
            P3.r.Y(r10)     // Catch: java.util.concurrent.CancellationException -> L3c
            goto L67
        L59:
            P3.r.Y(r10)
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L3c
            r0.label = r6     // Catch: java.util.concurrent.CancellationException -> L3c
            java.lang.Object r10 = r8.fetchStreamingResponse(r0)     // Catch: java.util.concurrent.CancellationException -> L3c
            if (r10 != r1) goto L67
            goto L8e
        L67:
            io.ktor.client.statement.HttpResponse r10 = (io.ktor.client.statement.HttpResponse) r10     // Catch: java.util.concurrent.CancellationException -> L3c
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L83
            r0.label = r5     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.invoke(r10, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 != r1) goto L74
            goto L8e
        L74:
            r7 = r10
            r10 = r9
            r9 = r7
        L77:
            r0.L$0 = r10     // Catch: java.util.concurrent.CancellationException -> L3c
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L3c
            java.lang.Object r9 = r8.cleanup(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L3c
            if (r9 != r1) goto L82
            goto L8e
        L82:
            return r10
        L83:
            r9 = move-exception
        L84:
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L3c
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L3c
            java.lang.Object r10 = r8.cleanup(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L3c
            if (r10 != r1) goto L8f
        L8e:
            return r1
        L8f:
            throw r9     // Catch: java.util.concurrent.CancellationException -> L3c
        L90:
            java.lang.Throwable r9 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.execute(e4.n, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchResponse(S3.c<? super io.ktor.client.statement.HttpResponse> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.client.statement.HttpStatement.C12141
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.statement.HttpStatement$fetchResponse$1 r0 = (io.ktor.client.statement.HttpStatement.C12141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$fetchResponse$1 r0 = new io.ktor.client.statement.HttpStatement$fetchResponse$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.L$0
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0
            P3.r.Y(r7)     // Catch: java.util.concurrent.CancellationException -> L31
            return r0
        L31:
            r7 = move-exception
            goto L84
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            java.lang.Object r2 = r0.L$0
            io.ktor.client.call.HttpClientCall r2 = (io.ktor.client.call.HttpClientCall) r2
            P3.r.Y(r7)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L6e
        L43:
            P3.r.Y(r7)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L60
        L47:
            P3.r.Y(r7)
            io.ktor.client.request.HttpRequestBuilder r7 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.util.concurrent.CancellationException -> L31
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L31
            io.ktor.client.request.HttpRequestBuilder r2 = r6.builder     // Catch: java.util.concurrent.CancellationException -> L31
            io.ktor.client.request.HttpRequestBuilder r7 = r7.takeFromWithExecutionContext(r2)     // Catch: java.util.concurrent.CancellationException -> L31
            io.ktor.client.HttpClient r2 = r6.client     // Catch: java.util.concurrent.CancellationException -> L31
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r7 = r2.execute$ktor_client_core(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r7 != r1) goto L60
            goto L82
        L60:
            r2 = r7
            io.ktor.client.call.HttpClientCall r2 = (io.ktor.client.call.HttpClientCall) r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r7 = io.ktor.client.call.SavedCallKt.save(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r7 != r1) goto L6e
            goto L82
        L6e:
            io.ktor.client.call.HttpClientCall r7 = (io.ktor.client.call.HttpClientCall) r7     // Catch: java.util.concurrent.CancellationException -> L31
            io.ktor.client.statement.HttpResponse r7 = r7.getResponse()     // Catch: java.util.concurrent.CancellationException -> L31
            io.ktor.client.statement.HttpResponse r2 = r2.getResponse()     // Catch: java.util.concurrent.CancellationException -> L31
            r0.L$0 = r7     // Catch: java.util.concurrent.CancellationException -> L31
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r0 = r6.cleanup(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r0 != r1) goto L83
        L82:
            return r1
        L83:
            return r7
        L84:
            java.lang.Throwable r7 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.fetchResponse(S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchStreamingResponse(S3.c<? super io.ktor.client.statement.HttpResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.client.statement.HttpStatement.C12151
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1 r0 = (io.ktor.client.statement.HttpStatement.C12151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1 r0 = new io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            P3.r.Y(r5)     // Catch: java.util.concurrent.CancellationException -> L27
            goto L4d
        L27:
            r5 = move-exception
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            P3.r.Y(r5)
            io.ktor.client.request.HttpRequestBuilder r5 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.util.concurrent.CancellationException -> L27
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L27
            io.ktor.client.request.HttpRequestBuilder r2 = r4.builder     // Catch: java.util.concurrent.CancellationException -> L27
            io.ktor.client.request.HttpRequestBuilder r5 = r5.takeFromWithExecutionContext(r2)     // Catch: java.util.concurrent.CancellationException -> L27
            io.ktor.client.plugins.DoubleReceivePluginKt.skipSaveBody(r5)     // Catch: java.util.concurrent.CancellationException -> L27
            io.ktor.client.HttpClient r2 = r4.client     // Catch: java.util.concurrent.CancellationException -> L27
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L27
            java.lang.Object r5 = r2.execute$ktor_client_core(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L27
            if (r5 != r1) goto L4d
            return r1
        L4d:
            io.ktor.client.call.HttpClientCall r5 = (io.ktor.client.call.HttpClientCall) r5     // Catch: java.util.concurrent.CancellationException -> L27
            io.ktor.client.statement.HttpResponse r5 = r5.getResponse()     // Catch: java.util.concurrent.CancellationException -> L27
            return r5
        L54:
            java.lang.Throwable r5 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.fetchStreamingResponse(S3.c):java.lang.Object");
    }

    public final HttpClient getClient() {
        return this.client;
    }

    public String toString() {
        return "HttpStatement[" + this.builder.getUrl() + ']';
    }

    public final <T, R> Object body(n nVar, S3.c<? super R> cVar) throws Throwable {
        try {
            HttpResponse httpResponse = (HttpResponse) fetchStreamingResponse(null);
            try {
                httpResponse.getCall();
                l.k();
                throw null;
            } catch (Throwable th) {
                cleanup(httpResponse, null);
                throw th;
            }
        } catch (CancellationException e7) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e7);
        }
    }

    public final Object execute(S3.c<? super HttpResponse> cVar) {
        return fetchResponse(cVar);
    }
}
