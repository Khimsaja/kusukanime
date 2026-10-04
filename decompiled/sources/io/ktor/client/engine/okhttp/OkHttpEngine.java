package io.ktor.client.engine.okhttp;

import H5.A;
import H5.B;
import H5.C0263e0;
import H5.D;
import H5.InterfaceC0265f0;
import H5.Y;
import H5.h0;
import O3.C;
import O3.i;
import P3.m;
import P3.r;
import S3.f;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import f6.AbstractC0897K;
import f6.C0887A;
import f6.C0895I;
import f6.z;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.plugins.HttpTimeoutCapability;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.sse.SSECapability;
import io.ktor.client.plugins.websocket.WebSocketCapability;
import io.ktor.client.request.HttpResponseData;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.CacheKt;
import io.ktor.util.CoroutinesUtilsKt;
import io.ktor.util.date.GMTDate;
import java.net.Proxy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z1.c;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000f\u0010\u000eJ0\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0010H\u0096@¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R$\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b2\u00103R\"\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "config", "<init>", "(Lio/ktor/client/engine/okhttp/OkHttpConfig;)V", "Lf6/A;", "engine", "Lf6/D;", "engineRequest", "LS3/h;", "callContext", "Lio/ktor/client/request/HttpResponseData;", "executeWebSocketRequest", "(Lf6/A;Lf6/D;LS3/h;LS3/c;)Ljava/lang/Object;", "executeServerSendEventsRequest", "Lio/ktor/client/request/HttpRequestData;", "requestData", "executeHttpRequest", "(Lf6/A;Lf6/D;LS3/h;Lio/ktor/client/request/HttpRequestData;LS3/c;)Ljava/lang/Object;", "Lf6/I;", "response", "Lio/ktor/util/date/GMTDate;", "requestTime", "", "body", "buildResponseData", "(Lf6/I;Lio/ktor/util/date/GMTDate;Ljava/lang/Object;LS3/h;)Lio/ktor/client/request/HttpResponseData;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "timeoutExtension", "createOkHttpClient", "(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lf6/A;", "data", "execute", "(Lio/ktor/client/request/HttpRequestData;LS3/c;)Ljava/lang/Object;", "LO3/C;", "close", "()V", "Lio/ktor/client/engine/okhttp/OkHttpConfig;", "getConfig", "()Lio/ktor/client/engine/okhttp/OkHttpConfig;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "supportedCapabilities", "Ljava/util/Set;", "getSupportedCapabilities", "()Ljava/util/Set;", "requestsJob", "LS3/h;", "coroutineContext", "getCoroutineContext", "()LS3/h;", "", "clientCache", "Ljava/util/Map;", "Companion", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpEngine extends HttpClientEngineBase {
    private static final Companion Companion = new Companion(null);
    private static final i okHttpClientPrototype$delegate = c.C(new J3.a(14));
    private final Map<HttpTimeoutConfig, C0887A> clientCache;
    private final OkHttpConfig config;
    private final h coroutineContext;
    private final h requestsJob;
    private final Set<HttpClientEngineCapability<?>> supportedCapabilities;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        int label;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return OkHttpEngine.this.new AnonymousClass1(cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    r.Y(obj);
                    f fVar = OkHttpEngine.this.requestsJob.get(C0263e0.f3843k);
                    l.c(fVar);
                    this.label = 1;
                    if (((InterfaceC0265f0) fVar).m(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.Y(obj);
                }
                while (it.hasNext()) {
                    C0887A c0887a = (C0887A) ((Map.Entry) it.next()).getValue();
                    c0887a.f11448l.u();
                    ((ThreadPoolExecutor) c0887a.f11447k.c()).shutdown();
                }
                return C.a;
            } finally {
                it = OkHttpEngine.this.clientCache.entrySet().iterator();
                while (it.hasNext()) {
                    C0887A c0887a2 = (C0887A) ((Map.Entry) it.next()).getValue();
                    c0887a2.f11448l.u();
                    ((ThreadPoolExecutor) c0887a2.f11447k.c()).shutdown();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngine$Companion;", "", "<init>", "()V", "Lf6/A;", "okHttpClientPrototype$delegate", "LO3/i;", "getOkHttpClientPrototype", "()Lf6/A;", "okHttpClientPrototype", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final C0887A getOkHttpClientPrototype() {
            return (C0887A) OkHttpEngine.okHttpClientPrototype$delegate.getValue();
        }

        private Companion() {
        }
    }

    @e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {60, 67, 68, 69}, m = "execute")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$execute$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11571 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11571(S3.c<? super C11571> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttpEngine.this.execute(null, this);
        }
    }

    @e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {118}, m = "executeHttpRequest")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11581 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11581(S3.c<? super C11581> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttpEngine.this.executeHttpRequest(null, null, null, null, this);
        }
    }

    @e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {107}, m = "executeServerSendEventsRequest")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11591 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11591(S3.c<? super C11591> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttpEngine.this.executeServerSendEventsRequest(null, null, null, this);
        }
    }

    @e(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {91}, m = "executeWebSocketRequest")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11601 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11601(S3.c<? super C11601> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttpEngine.this.executeWebSocketRequest(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpEngine(OkHttpConfig okHttpConfig) {
        super("ktor-okhttp");
        l.f("config", okHttpConfig);
        this.config = okHttpConfig;
        this.supportedCapabilities = m.v0(new HttpClientEngineCapability[]{HttpTimeoutCapability.INSTANCE, WebSocketCapability.INSTANCE, SSECapability.INSTANCE});
        this.clientCache = CacheKt.createLRUCache(new OkHttpEngine$clientCache$1(this), new io.ktor.client.b(6), getConfig().getClientCacheSize());
        f fVar = super.getCoroutineContext().get(C0263e0.f3843k);
        l.c(fVar);
        h hVarSilentSupervisor = CoroutinesUtilsKt.SilentSupervisor((InterfaceC0265f0) fVar);
        this.requestsJob = hVarSilentSupervisor;
        this.coroutineContext = super.getCoroutineContext().plus(hVarSilentSupervisor);
        D.w(Y.f3831k, super.getCoroutineContext(), B.f3792m, new AnonymousClass1(null));
    }

    private final HttpResponseData buildResponseData(C0895I response, GMTDate requestTime, Object body, h callContext) {
        return new HttpResponseData(new HttpStatusCode(response.f11498n, response.f11497m), requestTime, OkUtilsKt.fromOkHttp(response.f11500p), OkUtilsKt.fromOkHttp(response.f11496l), body, callContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C clientCache$lambda$0(C0887A c0887a) {
        l.f("it", c0887a);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0887A createOkHttpClient(HttpTimeoutConfig timeoutExtension) {
        C0887A preconfigured = getConfig().getPreconfigured();
        if (preconfigured == null) {
            preconfigured = Companion.getOkHttpClientPrototype();
        }
        z zVarA = preconfigured.a();
        zVarA.a = new A2.b(8);
        getConfig().getConfig().invoke(zVarA);
        Proxy proxy = getConfig().getProxy();
        if (proxy != null) {
            if (!l.a(proxy, zVarA.f11639l)) {
                zVarA.f11628A = null;
            }
            zVarA.f11639l = proxy;
        }
        if (timeoutExtension != null) {
            OkHttpEngineKt.setupTimeoutAttributes(zVarA, timeoutExtension);
        }
        return new C0887A(zVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeHttpRequest(f6.C0887A r6, f6.C0890D r7, S3.h r8, io.ktor.client.request.HttpRequestData r9, S3.c<? super io.ktor.client.request.HttpResponseData> r10) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r10 instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C11581
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1 r0 = (io.ktor.client.engine.okhttp.OkHttpEngine.C11581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeHttpRequest$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            io.ktor.util.date.GMTDate r6 = (io.ktor.util.date.GMTDate) r6
            java.lang.Object r7 = r0.L$1
            r9 = r7
            io.ktor.client.request.HttpRequestData r9 = (io.ktor.client.request.HttpRequestData) r9
            java.lang.Object r7 = r0.L$0
            r8 = r7
            S3.h r8 = (S3.h) r8
            P3.r.Y(r10)
            goto L57
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            P3.r.Y(r10)
            r10 = 0
            io.ktor.util.date.GMTDate r10 = io.ktor.util.date.DateJvmKt.GMTDate$default(r10, r3, r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r3
            java.lang.Object r6 = io.ktor.client.engine.okhttp.OkUtilsKt.execute(r6, r7, r9, r8, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            r4 = r10
            r10 = r6
            r6 = r4
        L57:
            f6.I r10 = (f6.C0895I) r10
            f6.K r7 = r10.f11501q
            H5.e0 r0 = H5.C0263e0.f3843k
            S3.f r0 = r8.get(r0)
            kotlin.jvm.internal.l.c(r0)
            H5.f0 r0 = (H5.InterfaceC0265f0) r0
            A3.d r1 = new A3.d
            r2 = 14
            r1.<init>(r2, r7)
            r0.x(r1)
            if (r7 == 0) goto L7e
            w6.k r7 = r7.g()
            if (r7 == 0) goto L7e
            io.ktor.utils.io.ByteReadChannel r7 = io.ktor.client.engine.okhttp.OkHttpEngineKt.access$toChannel(r7, r8, r9)
            if (r7 != 0) goto L84
        L7e:
            io.ktor.utils.io.ByteReadChannel$Companion r7 = io.ktor.utils.io.ByteReadChannel.INSTANCE
            io.ktor.utils.io.ByteReadChannel r7 = r7.getEmpty()
        L84:
            io.ktor.client.request.HttpResponseData r6 = r5.buildResponseData(r10, r6, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.executeHttpRequest(f6.A, f6.D, S3.h, io.ktor.client.request.HttpRequestData, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C executeHttpRequest$lambda$2(AbstractC0897K abstractC0897K, Throwable th) {
        if (abstractC0897K != null) {
            abstractC0897K.close();
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeServerSendEventsRequest(f6.C0887A r5, f6.C0890D r6, S3.h r7, S3.c<? super io.ktor.client.request.HttpResponseData> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C11591
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1 r0 = (io.ktor.client.engine.okhttp.OkHttpEngine.C11591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeServerSendEventsRequest$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$2
            io.ktor.client.engine.okhttp.OkHttpSSESession r5 = (io.ktor.client.engine.okhttp.OkHttpSSESession) r5
            java.lang.Object r6 = r0.L$1
            io.ktor.util.date.GMTDate r6 = (io.ktor.util.date.GMTDate) r6
            java.lang.Object r7 = r0.L$0
            S3.h r7 = (S3.h) r7
            P3.r.Y(r8)
            goto L60
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            P3.r.Y(r8)
            r8 = 0
            io.ktor.util.date.GMTDate r8 = io.ktor.util.date.DateJvmKt.GMTDate$default(r8, r3, r8)
            io.ktor.client.engine.okhttp.OkHttpSSESession r2 = new io.ktor.client.engine.okhttp.OkHttpSSESession
            r2.<init>(r5, r6, r7)
            H5.p r5 = r2.getOriginResponse()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r2
            r0.label = r3
            H5.q r5 = (H5.C0276q) r5
            java.lang.Object r5 = r5.k(r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            r6 = r8
            r8 = r5
            r5 = r2
        L60:
            f6.I r8 = (f6.C0895I) r8
            io.ktor.client.request.HttpResponseData r5 = r4.buildResponseData(r8, r6, r5, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.executeServerSendEventsRequest(f6.A, f6.D, S3.h, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeWebSocketRequest(f6.C0887A r6, f6.C0890D r7, S3.h r8, S3.c<? super io.ktor.client.request.HttpResponseData> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C11601
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1 r0 = (io.ktor.client.engine.okhttp.OkHttpEngine.C11601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngine$executeWebSocketRequest$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$2
            io.ktor.client.engine.okhttp.OkHttpWebsocketSession r6 = (io.ktor.client.engine.okhttp.OkHttpWebsocketSession) r6
            java.lang.Object r7 = r0.L$1
            io.ktor.util.date.GMTDate r7 = (io.ktor.util.date.GMTDate) r7
            java.lang.Object r8 = r0.L$0
            S3.h r8 = (S3.h) r8
            P3.r.Y(r9)
            goto L6e
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            P3.r.Y(r9)
            r9 = 0
            io.ktor.util.date.GMTDate r9 = io.ktor.util.date.DateJvmKt.GMTDate$default(r9, r3, r9)
            io.ktor.client.engine.okhttp.OkHttpWebsocketSession r2 = new io.ktor.client.engine.okhttp.OkHttpWebsocketSession
            io.ktor.client.engine.okhttp.OkHttpConfig r4 = r5.getConfig()
            f6.N r4 = r4.getWebSocketFactory()
            if (r4 != 0) goto L50
            r4 = r6
        L50:
            r2.<init>(r6, r4, r7, r8)
            r2.start()
            H5.p r6 = r2.getOriginResponse()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r2
            r0.label = r3
            H5.q r6 = (H5.C0276q) r6
            java.lang.Object r6 = r6.k(r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            r7 = r9
            r9 = r6
            r6 = r2
        L6e:
            f6.I r9 = (f6.C0895I) r9
            io.ktor.client.request.HttpResponseData r6 = r5.buildResponseData(r9, r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.executeWebSocketRequest(f6.A, f6.D, S3.h, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0887A okHttpClientPrototype_delegate$lambda$5() {
        return new C0887A(new z());
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        f fVar = this.requestsJob.get(C0263e0.f3843k);
        l.d("null cannot be cast to non-null type kotlinx.coroutines.CompletableJob", fVar);
        ((h0) ((H5.r) fVar)).Z();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(io.ktor.client.request.HttpRequestData r10, S3.c<? super io.ktor.client.request.HttpResponseData> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.client.engine.okhttp.OkHttpEngine.C11571
            if (r0 == 0) goto L14
            r0 = r11
            io.ktor.client.engine.okhttp.OkHttpEngine$execute$1 r0 = (io.ktor.client.engine.okhttp.OkHttpEngine.C11571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            io.ktor.client.engine.okhttp.OkHttpEngine$execute$1 r0 = new io.ktor.client.engine.okhttp.OkHttpEngine$execute$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            T3.a r0 = T3.a.f9048k
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L4b
            if (r1 == r5) goto L42
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            P3.r.Y(r11)
            return r11
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            P3.r.Y(r11)
            return r11
        L3e:
            P3.r.Y(r11)
            return r11
        L42:
            java.lang.Object r10 = r6.L$0
            io.ktor.client.request.HttpRequestData r10 = (io.ktor.client.request.HttpRequestData) r10
            P3.r.Y(r11)
        L49:
            r5 = r10
            goto L59
        L4b:
            P3.r.Y(r11)
            r6.L$0 = r10
            r6.label = r5
            java.lang.Object r11 = io.ktor.client.engine.UtilsKt.callContext(r6)
            if (r11 != r0) goto L49
            goto La2
        L59:
            S3.h r11 = (S3.h) r11
            r10 = r3
            f6.D r3 = io.ktor.client.engine.okhttp.OkHttpEngineKt.access$convertToOkHttpRequest(r5, r11)
            java.util.Map<io.ktor.client.plugins.HttpTimeoutConfig, f6.A> r1 = r9.clientCache
            io.ktor.client.plugins.HttpTimeoutCapability r7 = io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE
            java.lang.Object r7 = r5.getCapabilityOrNull(r7)
            java.lang.Object r1 = r1.get(r7)
            f6.A r1 = (f6.C0887A) r1
            if (r1 == 0) goto La4
            boolean r7 = io.ktor.client.request.HttpRequestKt.isUpgradeRequest(r5)
            r8 = 0
            if (r7 == 0) goto L83
            r6.L$0 = r8
            r6.label = r4
            java.lang.Object r10 = r9.executeWebSocketRequest(r1, r3, r11, r6)
            if (r10 != r0) goto L82
            goto La2
        L82:
            return r10
        L83:
            boolean r4 = io.ktor.client.request.HttpRequestKt.isSseRequest(r5)
            if (r4 == 0) goto L95
            r6.L$0 = r8
            r6.label = r10
            java.lang.Object r10 = r9.executeServerSendEventsRequest(r1, r3, r11, r6)
            if (r10 != r0) goto L94
            goto La2
        L94:
            return r10
        L95:
            r6.L$0 = r8
            r6.label = r2
            r4 = r11
            r2 = r1
            r1 = r9
            java.lang.Object r10 = r1.executeHttpRequest(r2, r3, r4, r5, r6)
            if (r10 != r0) goto La3
        La2:
            return r0
        La3:
            return r10
        La4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "OkHttpClient can't be constructed because HttpTimeout plugin is not installed"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.okhttp.OkHttpEngine.execute(io.ktor.client.request.HttpRequestData, S3.c):java.lang.Object");
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public OkHttpConfig getConfig() {
        return this.config;
    }
}
