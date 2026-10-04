package io.ktor.client.plugins.websocket;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLProtocolKt;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import z6.b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebSockets$Plugin$install$1 extends j implements o {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ WebSockets $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$1(boolean z7, WebSockets webSockets, c<? super WebSockets$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$extensionsSupported = z7;
        this.$plugin = webSockets;
    }

    @Override // e4.o
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, c<? super C> cVar) {
        WebSockets$Plugin$install$1 webSockets$Plugin$install$1 = new WebSockets$Plugin$install$1(this.$extensionsSupported, this.$plugin, cVar);
        webSockets$Plugin$install$1.L$0 = pipelineContext;
        return webSockets$Plugin$install$1.invokeSuspend(C.a);
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
        if (URLProtocolKt.isWebsocket(((HttpRequestBuilder) pipelineContext.getContext()).getUrl().getProtocol())) {
            b logger = WebSocketsKt.getLOGGER();
            if (LoggerJvmKt.isTraceEnabled(logger)) {
                logger.e("Sending WebSocket request " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
            }
            ((HttpRequestBuilder) pipelineContext.getContext()).setCapability(WebSocketCapability.INSTANCE, c2);
            if (this.$extensionsSupported) {
                this.$plugin.installExtensions((HttpRequestBuilder) pipelineContext.getContext());
            }
            WebSocketContent webSocketContent = new WebSocketContent();
            this.label = 1;
            if (pipelineContext.proceedWith(webSocketContent, this) == aVar) {
                return aVar;
            }
        } else {
            b logger2 = WebSocketsKt.getLOGGER();
            if (LoggerJvmKt.isTraceEnabled(logger2)) {
                logger2.e("Skipping WebSocket plugin for non-websocket request: " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
                return c2;
            }
        }
        return c2;
    }
}
