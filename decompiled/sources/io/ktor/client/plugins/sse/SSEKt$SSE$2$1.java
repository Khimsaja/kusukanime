package io.ktor.client.plugins.sse;

import O3.C;
import P3.r;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.SSEClientResponseAdapter;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.logging.LoggerJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SSEKt$SSE$2$1 extends j implements o {
    final /* synthetic */ int $maxReconnectionAttempts;
    final /* synthetic */ long $reconnectionTime;
    final /* synthetic */ boolean $showCommentEvents;
    final /* synthetic */ boolean $showRetryEvents;
    final /* synthetic */ ClientPluginBuilder<SSEConfig> $this_createClientPlugin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SSEKt$SSE$2$1(ClientPluginBuilder<SSEConfig> clientPluginBuilder, long j7, boolean z7, boolean z8, int i7, S3.c<? super SSEKt$SSE$2$1> cVar) {
        super(3, cVar);
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$reconnectionTime = j7;
        this.$showCommentEvents = z7;
        this.$showRetryEvents = z8;
        this.$maxReconnectionAttempts = i7;
    }

    @Override // e4.o
    public final Object invoke(HttpRequestBuilder httpRequestBuilder, OutgoingContent outgoingContent, S3.c<? super OutgoingContent> cVar) {
        SSEKt$SSE$2$1 sSEKt$SSE$2$1 = new SSEKt$SSE$2$1(this.$this_createClientPlugin, this.$reconnectionTime, this.$showCommentEvents, this.$showRetryEvents, this.$maxReconnectionAttempts, cVar);
        sSEKt$SSE$2$1.L$0 = httpRequestBuilder;
        sSEKt$SSE$2$1.L$1 = outgoingContent;
        return sSEKt$SSE$2$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$0;
        OutgoingContent outgoingContent = (OutgoingContent) this.L$1;
        if (!l.a(SSEKt.getAttributeValue(httpRequestBuilder, BuildersKt.getSseRequestAttr()), Boolean.TRUE)) {
            return outgoingContent;
        }
        z6.b logger = SSEKt.getLOGGER();
        if (LoggerJvmKt.isTraceEnabled(logger)) {
            logger.e("Sending SSE request to " + httpRequestBuilder.getUrl());
        }
        httpRequestBuilder.setCapability(SSECapability.INSTANCE, C.a);
        A5.a aVar2 = (A5.a) SSEKt.getAttributeValue(httpRequestBuilder, BuildersKt.getReconnectionTimeAttr());
        Boolean bool = (Boolean) SSEKt.getAttributeValue(httpRequestBuilder, BuildersKt.getShowCommentEventsAttr());
        Boolean bool2 = (Boolean) SSEKt.getAttributeValue(httpRequestBuilder, BuildersKt.getShowRetryEventsAttr());
        httpRequestBuilder.getAttributes().put(HttpRequestKt.getResponseAdapterAttributeKey(), new SSEClientResponseAdapter());
        httpRequestBuilder.getAttributes().put(SSEKt.getSSEClientForReconnectionAttr(), this.$this_createClientPlugin.getClient());
        ContentType contentType = outgoingContent.getContentType();
        if (contentType != null) {
            HttpMessagePropertiesKt.contentType(httpRequestBuilder, contentType);
        }
        return new SSEClientContent(aVar2 != null ? aVar2.f240k : this.$reconnectionTime, bool != null ? bool.booleanValue() : this.$showCommentEvents, bool2 != null ? bool2.booleanValue() : this.$showRetryEvents, this.$maxReconnectionAttempts, getContext(), httpRequestBuilder, outgoingContent, null);
    }
}
