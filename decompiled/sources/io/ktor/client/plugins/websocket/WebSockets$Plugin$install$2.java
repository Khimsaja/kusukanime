package io.ktor.client.plugins.websocket;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import b1.AbstractC0703b;
import e4.o;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.WebSocketSession;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import z6.b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebSockets$Plugin$install$2 extends j implements o {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ WebSockets $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$2(WebSockets webSockets, boolean z7, c<? super WebSockets$Plugin$install$2> cVar) {
        super(3, cVar);
        this.$plugin = webSockets;
        this.$extensionsSupported = z7;
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, c<? super C> cVar) {
        WebSockets$Plugin$install$2 webSockets$Plugin$install$2 = new WebSockets$Plugin$install$2(this.$plugin, this.$extensionsSupported, cVar);
        webSockets$Plugin$install$2.L$0 = pipelineContext;
        webSockets$Plugin$install$2.L$1 = httpResponseContainer;
        return webSockets$Plugin$install$2.invokeSuspend(C.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [io.ktor.client.plugins.websocket.DefaultClientWebSocketSession] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        DelegatingClientWebSocketSession delegatingClientWebSocketSession;
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
        Object response = httpResponseContainer.getResponse();
        HttpResponse response2 = ((HttpClientCall) pipelineContext.getContext()).getResponse();
        HttpStatusCode status = response2.getStatus();
        OutgoingContent content = HttpResponseKt.getRequest(response2).getContent();
        if (content instanceof WebSocketContent) {
            HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
            if (!l.a(status, companion.getSwitchingProtocols())) {
                throw new WebSocketException("Handshake exception, expected status code " + companion.getSwitchingProtocols().getValue() + " but was " + status.getValue());
            }
            if (!(response instanceof WebSocketSession)) {
                throw new WebSocketException(AbstractC0703b.o(y.a, response.getClass(), new StringBuilder("Handshake exception, expected `WebSocketSession` content but was ")));
            }
            b logger = WebSocketsKt.getLOGGER();
            if (LoggerJvmKt.isTraceEnabled(logger)) {
                logger.e("Receive websocket session from " + ((HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + ": " + response);
            }
            if (this.$plugin.getMaxFrameSize() != 2147483647L) {
                ((WebSocketSession) response).setMaxFrameSize(this.$plugin.getMaxFrameSize());
            }
            if (l.a(expectedType.getType(), y.a.b(DefaultClientWebSocketSession.class))) {
                ?? defaultClientWebSocketSession = new DefaultClientWebSocketSession((HttpClientCall) pipelineContext.getContext(), this.$plugin.convertSessionToDefault$ktor_client_core((WebSocketSession) response));
                defaultClientWebSocketSession.start(this.$extensionsSupported ? this.$plugin.completeNegotiation((HttpClientCall) pipelineContext.getContext()) : P3.y.f7779k);
                delegatingClientWebSocketSession = defaultClientWebSocketSession;
            } else {
                delegatingClientWebSocketSession = new DelegatingClientWebSocketSession((HttpClientCall) pipelineContext.getContext(), (WebSocketSession) response);
            }
            HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(expectedType, delegatingClientWebSocketSession);
            this.L$0 = null;
            this.label = 1;
            if (pipelineContext.proceedWith(httpResponseContainer2, this) == aVar) {
                return aVar;
            }
        } else {
            b logger2 = WebSocketsKt.getLOGGER();
            if (LoggerJvmKt.isTraceEnabled(logger2)) {
                logger2.e("Skipping non-websocket response from " + ((HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + ": " + content);
                return c2;
            }
        }
        return c2;
    }
}
