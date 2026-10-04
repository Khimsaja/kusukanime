package io.ktor.client.engine;

import H5.A;
import H5.AbstractC0281w;
import H5.C0263e0;
import H5.InterfaceC0265f0;
import O3.C;
import S3.h;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ClientEventsKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.InternalAPI;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8BX\u0082\u0004¨\u0006\""}, d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "LH5/A;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;)V", "requestData", "executeWithinCallContext", "(Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpResponseData;", "checkExtensions", "(Lio/ktor/client/request/HttpRequestData;)V", "LH5/w;", "getDispatcher", "()LH5/w;", "dispatcher", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "config", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "supportedCapabilities", "", "closed", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface HttpClientEngine extends A, Closeable {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        public static void checkExtensions(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData) {
            for (HttpClientEngineCapability<?> httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + httpClientEngineCapability).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object executeWithinCallContext(io.ktor.client.engine.HttpClientEngine r5, io.ktor.client.request.HttpRequestData r6, S3.c<? super io.ktor.client.request.HttpResponseData> r7) throws java.lang.Throwable {
            /*
                boolean r0 = r7 instanceof io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
                if (r0 == 0) goto L13
                r0 = r7
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = (io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 r0 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                T3.a r1 = T3.a.f9048k
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3f
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                P3.r.Y(r7)
                return r7
            L2a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L32:
                java.lang.Object r5 = r0.L$1
                r6 = r5
                io.ktor.client.request.HttpRequestData r6 = (io.ktor.client.request.HttpRequestData) r6
                java.lang.Object r5 = r0.L$0
                io.ktor.client.engine.HttpClientEngine r5 = (io.ktor.client.engine.HttpClientEngine) r5
                P3.r.Y(r7)
                goto L53
            L3f:
                P3.r.Y(r7)
                H5.f0 r7 = r6.getExecutionContext()
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = io.ktor.client.engine.HttpClientEngineKt.createCallContext(r5, r7, r0)
                if (r7 != r1) goto L53
                goto L74
            L53:
                S3.h r7 = (S3.h) r7
                io.ktor.client.engine.KtorCallContextElement r2 = new io.ktor.client.engine.KtorCallContextElement
                r2.<init>(r7)
                S3.h r7 = r7.plus(r2)
                io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2 r2 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2
                r4 = 0
                r2.<init>(r5, r6, r4)
                H5.H r5 = H5.D.f(r5, r7, r2, r3)
                r0.L$0 = r4
                r0.L$1 = r4
                r0.label = r3
                java.lang.Object r5 = r5.k(r0)
                if (r5 != r1) goto L75
            L74:
                return r1
            L75:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.HttpClientEngine.DefaultImpls.executeWithinCallContext(io.ktor.client.engine.HttpClientEngine, io.ktor.client.request.HttpRequestData, S3.c):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean getClosed(HttpClientEngine httpClientEngine) {
            return !(((InterfaceC0265f0) httpClientEngine.getCoroutineContext().get(C0263e0.f3843k)) != null ? r1.b() : false);
        }

        public static Set<HttpClientEngineCapability<?>> getSupportedCapabilities(HttpClientEngine httpClientEngine) {
            return P3.A.f7737k;
        }

        @InternalAPI
        public static void install(HttpClientEngine httpClientEngine, HttpClient httpClient) {
            l.f("client", httpClient);
            httpClient.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getEngine(), new AnonymousClass1(httpClient, httpClientEngine, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {154, 166}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.engine.HttpClientEngine$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ HttpClient $client;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ HttpClientEngine this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpClient httpClient, HttpClientEngine httpClientEngine, S3.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$client = httpClient;
            this.this$0 = httpClientEngine;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$2(HttpClient httpClient, HttpResponse httpResponse, Throwable th) {
            if (th != null) {
                httpClient.getMonitor().raise(ClientEventsKt.getHttpResponseCancelled(), httpResponse);
            }
            return C.a;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, S3.c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$client, this.this$0, cVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
        
            if (r3.proceedWith(r5, r10) == r0) goto L31;
         */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r10.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                P3.r.Y(r11)
                goto Lea
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                java.lang.Object r1 = r10.L$1
                io.ktor.client.request.HttpRequestData r1 = (io.ktor.client.request.HttpRequestData) r1
                java.lang.Object r3 = r10.L$0
                io.ktor.util.pipeline.PipelineContext r3 = (io.ktor.util.pipeline.PipelineContext) r3
                P3.r.Y(r11)
                goto Lb0
            L27:
                P3.r.Y(r11)
                java.lang.Object r11 = r10.L$0
                io.ktor.util.pipeline.PipelineContext r11 = (io.ktor.util.pipeline.PipelineContext) r11
                java.lang.Object r1 = r10.L$1
                io.ktor.client.request.HttpRequestBuilder r5 = new io.ktor.client.request.HttpRequestBuilder
                r5.<init>()
                java.lang.Object r6 = r11.getContext()
                io.ktor.client.request.HttpRequestBuilder r6 = (io.ktor.client.request.HttpRequestBuilder) r6
                r5.takeFromWithExecutionContext(r6)
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                if (r1 != 0) goto L57
                io.ktor.http.content.NullBody r1 = io.ktor.http.content.NullBody.INSTANCE
                r5.setBody(r1)
                kotlin.jvm.internal.z r1 = kotlin.jvm.internal.y.a
                l4.d r1 = r1.b(r6)
                l4.w r6 = kotlin.jvm.internal.y.a(r6)     // Catch: java.lang.Throwable -> L52
                goto L53
            L52:
                r6 = r4
            L53:
                b1.AbstractC0703b.z(r1, r6, r5)
                goto L74
            L57:
                boolean r7 = r1 instanceof io.ktor.http.content.OutgoingContent
                if (r7 == 0) goto L62
                r5.setBody(r1)
                r5.setBodyType(r4)
                goto L74
            L62:
                r5.setBody(r1)
                kotlin.jvm.internal.z r1 = kotlin.jvm.internal.y.a
                l4.d r1 = r1.b(r6)
                l4.w r6 = kotlin.jvm.internal.y.a(r6)     // Catch: java.lang.Throwable -> L70
                goto L71
            L70:
                r6 = r4
            L71:
                b1.AbstractC0703b.z(r1, r6, r5)
            L74:
                io.ktor.client.HttpClient r1 = r10.$client
                io.ktor.events.Events r1 = r1.getMonitor()
                io.ktor.events.EventDefinition r6 = io.ktor.client.utils.ClientEventsKt.getHttpRequestIsReadyForSending()
                r1.raise(r6, r5)
                io.ktor.client.request.HttpRequestData r1 = r5.build()
                io.ktor.client.HttpClient r5 = r10.$client
                io.ktor.util.Attributes r6 = r1.getAttributes()
                io.ktor.util.AttributeKey r7 = io.ktor.client.engine.HttpClientEngineKt.getCLIENT_CONFIG()
                io.ktor.client.HttpClientConfig r5 = r5.getConfig$ktor_client_core()
                r6.put(r7, r5)
                io.ktor.client.engine.HttpClientEngineKt.access$validateHeaders(r1)
                io.ktor.client.engine.HttpClientEngine r5 = r10.this$0
                io.ktor.client.engine.HttpClientEngine.DefaultImpls.access$checkExtensions(r5, r1)
                io.ktor.client.engine.HttpClientEngine r5 = r10.this$0
                r10.L$0 = r11
                r10.L$1 = r1
                r10.label = r3
                java.lang.Object r3 = io.ktor.client.engine.HttpClientEngine.DefaultImpls.access$executeWithinCallContext(r5, r1, r10)
                if (r3 != r0) goto Lad
                goto Le9
            Lad:
                r9 = r3
                r3 = r11
                r11 = r9
            Lb0:
                io.ktor.client.request.HttpResponseData r11 = (io.ktor.client.request.HttpResponseData) r11
                io.ktor.client.call.HttpClientCall r5 = new io.ktor.client.call.HttpClientCall
                io.ktor.client.HttpClient r6 = r10.$client
                r5.<init>(r6, r1, r11)
                io.ktor.client.statement.HttpResponse r11 = r5.getResponse()
                io.ktor.client.HttpClient r1 = r10.$client
                io.ktor.events.Events r1 = r1.getMonitor()
                io.ktor.events.EventDefinition r6 = io.ktor.client.utils.ClientEventsKt.getHttpResponseReceived()
                r1.raise(r6, r11)
                S3.h r1 = r11.getCoroutineContext()
                H5.f0 r1 = H5.D.q(r1)
                io.ktor.client.HttpClient r6 = r10.$client
                io.ktor.client.engine.a r7 = new io.ktor.client.engine.a
                r8 = 0
                r7.<init>(r8, r6, r11)
                r1.x(r7)
                r10.L$0 = r4
                r10.L$1 = r4
                r10.label = r2
                java.lang.Object r11 = r3.proceedWith(r5, r10)
                if (r11 != r0) goto Lea
            Le9:
                return r0
            Lea:
                O3.C r11 = O3.C.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.HttpClientEngine.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InternalAPI
    Object execute(HttpRequestData httpRequestData, S3.c<? super HttpResponseData> cVar);

    HttpClientEngineConfig getConfig();

    @Override // H5.A
    /* synthetic */ h getCoroutineContext();

    AbstractC0281w getDispatcher();

    Set<HttpClientEngineCapability<?>> getSupportedCapabilities();

    @InternalAPI
    void install(HttpClient client);
}
