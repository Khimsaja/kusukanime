package io.ktor.client.plugins.sse;

import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import O3.C;
import P3.r;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import e4.o;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2", f = "SSE.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SSEKt$SSE$2$2 extends j implements o {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SSEKt$SSE$2$2(S3.c<? super SSEKt$SSE$2$2> cVar) {
        super(3, cVar);
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, S3.c<? super C> cVar) {
        SSEKt$SSE$2$2 sSEKt$SSE$2$2 = new SSEKt$SSE$2$2(cVar);
        sSEKt$SSE$2$2.L$0 = pipelineContext;
        sSEKt$SSE$2$2.L$1 = httpResponseContainer;
        return sSEKt$SSE$2$2.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        C c2 = C.a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return c2;
        }
        r.Y(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.L$1;
        TypeInfo expectedType = httpResponseContainer.getExpectedType();
        final Object response = httpResponseContainer.getResponse();
        HttpResponse response2 = ((HttpClientCall) pipelineContext.getContext()).getResponse();
        if (l.a(HttpResponseKt.getRequest(response2).getAttributes().getOrNull(BuildersKt.getSseRequestAttr()), Boolean.TRUE)) {
            SSEKt.checkResponse(response2);
            if (!(response instanceof SSESession)) {
                throw new SSEClientException(response2, null, "Expected " + y.a.b(SSESession.class).n() + " content but was " + response, 2, null);
            }
            z6.b logger = SSEKt.getLOGGER();
            if (LoggerJvmKt.isTraceEnabled(logger)) {
                logger.e("Receive SSE session from " + HttpResponseKt.getRequest(response2).getUrl() + ": " + response);
            }
            final n nVar = (n) HttpResponseKt.getRequest(response2).getAttributes().getOrNull(BuildersKt.getDeserializerAttr());
            HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(expectedType, nVar != null ? new ClientSSESessionWithDeserialization((HttpClientCall) pipelineContext.getContext(), new SSESessionWithDeserialization(response, nVar) { // from class: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1
                private final h coroutineContext;
                private final n deserializer;
                private final InterfaceC0329h incoming;

                {
                    SSESession sSESession = (SSESession) response;
                    final InterfaceC0329h incoming = sSESession.getIncoming();
                    this.incoming = new InterfaceC0329h() { // from class: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC0330i {
                            final /* synthetic */ InterfaceC0330i $this_unsafeFlow;

                            @e(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2", f = "SSE.kt", l = {50}, m = "emit")
                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends U3.c {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(S3.c cVar) {
                                    super(cVar);
                                }

                                @Override // U3.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(InterfaceC0330i interfaceC0330i) {
                                this.$this_unsafeFlow = interfaceC0330i;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // K5.InterfaceC0330i
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r11, S3.c r12) throws java.lang.Throwable {
                                /*
                                    r10 = this;
                                    boolean r0 = r12 instanceof io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r12
                                    io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2$1 r0 = (io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2$1 r0 = new io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1$2$1
                                    r0.<init>(r12)
                                L18:
                                    java.lang.Object r12 = r0.result
                                    T3.a r1 = T3.a.f9048k
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L2f
                                    if (r2 != r3) goto L27
                                    P3.r.Y(r12)
                                    goto L58
                                L27:
                                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                                    r11.<init>(r12)
                                    throw r11
                                L2f:
                                    P3.r.Y(r12)
                                    K5.i r12 = r10.$this_unsafeFlow
                                    io.ktor.sse.ServerSentEvent r11 = (io.ktor.sse.ServerSentEvent) r11
                                    io.ktor.sse.TypedServerSentEvent r4 = new io.ktor.sse.TypedServerSentEvent
                                    java.lang.String r5 = r11.getData()
                                    java.lang.String r6 = r11.getEvent()
                                    java.lang.String r7 = r11.getId()
                                    java.lang.Long r8 = r11.getRetry()
                                    java.lang.String r9 = r11.getComments()
                                    r4.<init>(r5, r6, r7, r8, r9)
                                    r0.label = r3
                                    java.lang.Object r11 = r12.emit(r4, r0)
                                    if (r11 != r1) goto L58
                                    return r1
                                L58:
                                    O3.C r11 = O3.C.a
                                    return r11
                                */
                                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.SSEKt$SSE$2$2$clientSSESession$1$1$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, S3.c):java.lang.Object");
                            }
                        }

                        @Override // K5.InterfaceC0329h
                        public Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) {
                            Object objCollect = incoming.collect(new AnonymousClass2(interfaceC0330i), cVar);
                            return objCollect == T3.a.f9048k ? objCollect : C.a;
                        }
                    };
                    this.deserializer = nVar;
                    this.coroutineContext = sSESession.getCoroutineContext();
                }

                @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization, H5.A
                public h getCoroutineContext() {
                    return this.coroutineContext;
                }

                @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
                public n getDeserializer() {
                    return this.deserializer;
                }

                @Override // io.ktor.client.plugins.sse.SSESessionWithDeserialization
                public InterfaceC0329h getIncoming() {
                    return this.incoming;
                }
            }) : new ClientSSESession((HttpClientCall) pipelineContext.getContext(), (SSESession) response));
            this.L$0 = null;
            this.label = 1;
            if (pipelineContext.proceedWith(httpResponseContainer2, this) == aVar) {
                return aVar;
            }
        } else {
            z6.b logger2 = SSEKt.getLOGGER();
            if (LoggerJvmKt.isTraceEnabled(logger2)) {
                logger2.e("Skipping non SSE response from " + HttpResponseKt.getRequest(response2).getUrl());
                return c2;
            }
        }
        return c2;
    }
}
