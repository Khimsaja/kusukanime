package io.ktor.client;

import A3.d;
import H5.A;
import H5.C0263e0;
import H5.D;
import H5.InterfaceC0265f0;
import H5.h0;
import H5.r;
import O3.C;
import S3.c;
import S3.h;
import U3.e;
import U3.j;
import e4.k;
import e4.o;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.plugins.DefaultResponseValidationKt;
import io.ktor.client.plugins.DefaultTransformKt;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.HttpCallValidatorKt;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpPlainTextKt;
import io.ktor.client.plugins.HttpRedirectKt;
import io.ktor.client.plugins.HttpRequestLifecycleKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.client.utils.HttpResponseReceiveFail;
import io.ktor.events.Events;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00002\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010M\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lio/ktor/client/HttpClient;", "LH5/A;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "userConfig", "<init>", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;)V", "", "manageEngine", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;Z)V", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/call/HttpClientCall;", "execute$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;LS3/c;)Ljava/lang/Object;", "execute", "Lio/ktor/client/engine/HttpClientEngineCapability;", "capability", "isSupported", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Z", "Lkotlin/Function1;", "LO3/C;", "block", "config", "(Le4/k;)Lio/ktor/client/HttpClient;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/engine/HttpClientEngine;", "getEngine", "()Lio/ktor/client/engine/HttpClientEngine;", "Lio/ktor/client/HttpClientConfig;", "Z", "LH5/r;", "clientJob", "LH5/r;", "LS3/h;", "coroutineContext", "LS3/h;", "getCoroutineContext", "()LS3/h;", "Lio/ktor/client/request/HttpRequestPipeline;", "requestPipeline", "Lio/ktor/client/request/HttpRequestPipeline;", "getRequestPipeline", "()Lio/ktor/client/request/HttpRequestPipeline;", "Lio/ktor/client/statement/HttpResponsePipeline;", "responsePipeline", "Lio/ktor/client/statement/HttpResponsePipeline;", "getResponsePipeline", "()Lio/ktor/client/statement/HttpResponsePipeline;", "Lio/ktor/client/request/HttpSendPipeline;", "sendPipeline", "Lio/ktor/client/request/HttpSendPipeline;", "getSendPipeline", "()Lio/ktor/client/request/HttpSendPipeline;", "Lio/ktor/client/statement/HttpReceivePipeline;", "receivePipeline", "Lio/ktor/client/statement/HttpReceivePipeline;", "getReceivePipeline", "()Lio/ktor/client/statement/HttpReceivePipeline;", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "engineConfig", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getEngineConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "Lio/ktor/events/Events;", "monitor", "Lio/ktor/events/Events;", "getMonitor", "()Lio/ktor/events/Events;", "getConfig$ktor_client_core", "()Lio/ktor/client/HttpClientConfig;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpClient implements A, Closeable {
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClient.class, "closed");
    private final Attributes attributes;
    private final r clientJob;
    private volatile /* synthetic */ int closed;
    private final HttpClientConfig<HttpClientEngineConfig> config;
    private final h coroutineContext;
    private final HttpClientEngine engine;
    private final HttpClientEngineConfig engineConfig;
    private boolean manageEngine;
    private final Events monitor;
    private final HttpReceivePipeline receivePipeline;
    private final HttpRequestPipeline requestPipeline;
    private final HttpResponsePipeline responsePipeline;
    private final HttpSendPipeline sendPipeline;
    private final HttpClientConfig<? extends HttpClientEngineConfig> userConfig;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "call", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {1370, 1372}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements o {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, c<? super C> cVar) {
            AnonymousClass2 anonymousClass2 = HttpClient.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            PipelineContext pipelineContext;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            C c2 = C.a;
            if (i7 == 0) {
                P3.r.Y(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                obj2 = this.L$1;
                if (!(obj2 instanceof HttpClientCall)) {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + y.a.b(obj2.getClass()) + ").").toString());
                }
                HttpReceivePipeline receivePipeline = HttpClient.this.getReceivePipeline();
                HttpResponse response = ((HttpClientCall) obj2).getResponse();
                this.L$0 = pipelineContext2;
                this.L$1 = obj2;
                this.label = 1;
                Object objExecute = receivePipeline.execute(c2, response, this);
                if (objExecute != aVar) {
                    pipelineContext = pipelineContext2;
                    obj = objExecute;
                }
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
                return c2;
            }
            obj2 = this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            P3.r.Y(obj);
            ((HttpClientCall) obj2).setResponse$ktor_client_core((HttpResponse) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            return pipelineContext.proceedWith(obj2, this) == aVar ? aVar : c2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {1404}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    public static final class AnonymousClass4 extends j implements o {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(c<? super AnonymousClass4> cVar) {
            super(3, cVar);
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, c<? super C> cVar) {
            AnonymousClass4 anonymousClass4 = HttpClient.this.new AnonymousClass4(cVar);
            anonymousClass4.L$0 = pipelineContext;
            return anonymousClass4.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            PipelineContext pipelineContext;
            Throwable th;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                P3.r.Y(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                try {
                    this.L$0 = pipelineContext2;
                    this.label = 1;
                    Object objProceed = pipelineContext2.proceed(this);
                    if (objProceed == aVar) {
                        return aVar;
                    }
                    pipelineContext = pipelineContext2;
                    obj = objProceed;
                } catch (Throwable th2) {
                    pipelineContext = pipelineContext2;
                    th = th2;
                    HttpClient.this.getMonitor().raise(ClientEventsKt.getHttpResponseReceiveFailed(), new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pipelineContext = (PipelineContext) this.L$0;
                try {
                    P3.r.Y(obj);
                } catch (Throwable th3) {
                    th = th3;
                    HttpClient.this.getMonitor().raise(ClientEventsKt.getHttpResponseReceiveFailed(), new HttpResponseReceiveFail(((HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            }
            return C.a;
        }
    }

    public HttpClient(HttpClientEngine httpClientEngine, HttpClientConfig<? extends HttpClientEngineConfig> httpClientConfig) {
        l.f("engine", httpClientEngine);
        l.f("userConfig", httpClientConfig);
        this.engine = httpClientEngine;
        this.userConfig = httpClientConfig;
        boolean z7 = false;
        this.closed = 0;
        h0 h0Var = new h0((InterfaceC0265f0) httpClientEngine.getCoroutineContext().get(C0263e0.f3843k));
        this.clientJob = h0Var;
        this.coroutineContext = httpClientEngine.getCoroutineContext().plus(h0Var);
        int i7 = 1;
        f fVar = null;
        this.requestPipeline = new HttpRequestPipeline(z7, i7, fVar);
        HttpResponsePipeline httpResponsePipeline = new HttpResponsePipeline(z7, i7, fVar);
        this.responsePipeline = httpResponsePipeline;
        HttpSendPipeline httpSendPipeline = new HttpSendPipeline(z7, i7, fVar);
        this.sendPipeline = httpSendPipeline;
        this.receivePipeline = new HttpReceivePipeline(z7, i7, fVar);
        this.attributes = AttributesJvmKt.Attributes(true);
        this.engineConfig = httpClientEngine.getConfig();
        this.monitor = new Events();
        HttpClientConfig<HttpClientEngineConfig> httpClientConfig2 = new HttpClientConfig<>();
        this.config = httpClientConfig2;
        if (this.manageEngine) {
            h0Var.x(new d(11, this));
        }
        httpClientEngine.install(this);
        httpSendPipeline.intercept(HttpSendPipeline.INSTANCE.getReceive(), new AnonymousClass2(null));
        HttpClientConfig.install$default(httpClientConfig2, HttpRequestLifecycleKt.getHttpRequestLifecycle(), null, 2, null);
        HttpClientConfig.install$default(httpClientConfig2, BodyProgressKt.getBodyProgress(), null, 2, null);
        HttpClientConfig.install$default(httpClientConfig2, DoubleReceivePluginKt.getSaveBody(), null, 2, null);
        if (httpClientConfig.getUseDefaultTransformers()) {
            httpClientConfig2.install("DefaultTransformers", new io.github.jan.supabase.storage.f(29));
        }
        HttpClientConfig.install$default(httpClientConfig2, HttpSend.INSTANCE, null, 2, null);
        HttpClientConfig.install$default(httpClientConfig2, HttpCallValidatorKt.getHttpCallValidator(), null, 2, null);
        if (httpClientConfig.getFollowRedirects()) {
            HttpClientConfig.install$default(httpClientConfig2, HttpRedirectKt.getHttpRedirect(), null, 2, null);
        }
        httpClientConfig2.plusAssign(httpClientConfig);
        if (httpClientConfig.getUseDefaultTransformers()) {
            HttpClientConfig.install$default(httpClientConfig2, HttpPlainTextKt.getHttpPlainText(), null, 2, null);
        }
        DefaultResponseValidationKt.addDefaultResponseValidation(httpClientConfig2);
        httpClientConfig2.install(this);
        httpResponsePipeline.intercept(HttpResponsePipeline.INSTANCE.getReceive(), new AnonymousClass4(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C _init_$lambda$0(HttpClient httpClient, Throwable th) {
        if (th != null) {
            D.h(httpClient.engine, null);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C lambda$2$lambda$1(HttpClient httpClient) {
        l.f("$this$install", httpClient);
        DefaultTransformKt.defaultTransformers(httpClient);
        return C.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            Attributes attributes = (Attributes) this.attributes.get(HttpClientPluginKt.getPLUGIN_INSTALLED_LIST());
            Iterator<T> it = attributes.getAllKeys().iterator();
            while (it.hasNext()) {
                AttributeKey attributeKey = (AttributeKey) it.next();
                l.d("null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>", attributeKey);
                Object obj = attributes.get(attributeKey);
                if (obj instanceof AutoCloseable) {
                    ((AutoCloseable) obj).close();
                }
            }
            ((h0) this.clientJob).Z();
            if (this.manageEngine) {
                this.engine.close();
            }
        }
    }

    public final HttpClient config(k block) {
        l.f("block", block);
        HttpClientEngine httpClientEngine = this.engine;
        HttpClientConfig httpClientConfig = new HttpClientConfig();
        httpClientConfig.plusAssign(this.userConfig);
        block.invoke(httpClientConfig);
        return new HttpClient(httpClientEngine, httpClientConfig, this.manageEngine);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute$ktor_client_core(io.ktor.client.request.HttpRequestBuilder r5, S3.c<? super io.ktor.client.call.HttpClientCall> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.HttpClient$execute$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.HttpClient$execute$1 r0 = (io.ktor.client.HttpClient$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.HttpClient$execute$1 r0 = new io.ktor.client.HttpClient$execute$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r6)
            io.ktor.events.Events r6 = r4.monitor
            io.ktor.events.EventDefinition r2 = io.ktor.client.utils.ClientEventsKt.getHttpRequestCreated()
            r6.raise(r2, r5)
            io.ktor.client.request.HttpRequestPipeline r6 = r4.requestPipeline
            java.lang.Object r2 = r5.getBody()
            r0.label = r3
            java.lang.Object r6 = r6.execute(r5, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            kotlin.jvm.internal.l.d(r5, r6)
            io.ktor.client.call.HttpClientCall r6 = (io.ktor.client.call.HttpClientCall) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.HttpClient.execute$ktor_client_core(io.ktor.client.request.HttpRequestBuilder, S3.c):java.lang.Object");
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final HttpClientConfig<HttpClientEngineConfig> getConfig$ktor_client_core() {
        return this.config;
    }

    @Override // H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final HttpClientEngine getEngine() {
        return this.engine;
    }

    public final HttpClientEngineConfig getEngineConfig() {
        return this.engineConfig;
    }

    public final Events getMonitor() {
        return this.monitor;
    }

    public final HttpReceivePipeline getReceivePipeline() {
        return this.receivePipeline;
    }

    public final HttpRequestPipeline getRequestPipeline() {
        return this.requestPipeline;
    }

    public final HttpResponsePipeline getResponsePipeline() {
        return this.responsePipeline;
    }

    public final HttpSendPipeline getSendPipeline() {
        return this.sendPipeline;
    }

    public final boolean isSupported(HttpClientEngineCapability<?> capability) {
        l.f("capability", capability);
        return this.engine.getSupportedCapabilities().contains(capability);
    }

    public String toString() {
        return "HttpClient[" + this.engine + ']';
    }

    public /* synthetic */ HttpClient(HttpClientEngine httpClientEngine, HttpClientConfig httpClientConfig, int i7, f fVar) {
        this(httpClientEngine, (i7 & 2) != 0 ? new HttpClientConfig() : httpClientConfig);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClient(HttpClientEngine httpClientEngine, HttpClientConfig<? extends HttpClientEngineConfig> httpClientConfig, boolean z7) {
        this(httpClientEngine, httpClientConfig);
        l.f("engine", httpClientEngine);
        l.f("userConfig", httpClientConfig);
        this.manageEngine = z7;
    }
}
