package io.ktor.client.plugins.sse;

import e4.k;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.request.BuildersJvmKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12145k;

    public /* synthetic */ c(int i7) {
        this.f12145k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12145k) {
            case 0:
                return BuildersKt.sseSession_Mswn__c$lambda$24((HttpRequestBuilder) obj);
            case 1:
                return BuildersKt.serverSentEventsSession_tL6_L_A$lambda$15((HttpRequestBuilder) obj);
            case 2:
                return BuildersKt.sse_Q9yt8Vw$lambda$26((HttpRequestBuilder) obj);
            case 3:
                return BuildersKt.sse_BAHpl2s$lambda$25((HttpRequestBuilder) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return BuildersKt.serverSentEventsSession_xEWcMm4$lambda$2((HttpRequestBuilder) obj);
            case 5:
                return BuildersKt.sseSession_xEWcMm4$lambda$10((HttpRequestBuilder) obj);
            case 6:
                return BuildersKt.sseSession_tL6_L_A$lambda$23((HttpRequestBuilder) obj);
            case 7:
                return BuildersKt.sse_Mswn__c$lambda$13((HttpRequestBuilder) obj);
            case 8:
                return BuildersKt.sseSession_mY9Nd3A$lambda$11((HttpRequestBuilder) obj);
            case 9:
                return BuildersKt.serverSentEventsSession_mY9Nd3A$lambda$4((HttpRequestBuilder) obj);
            case 10:
                return SSEKt.SSE$lambda$0((ClientPluginBuilder) obj);
            case 11:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$10((HttpRequestBuilder) obj);
            case 12:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$17((HttpRequestBuilder) obj);
            case 13:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$19((HttpRequestBuilder) obj);
            case 14:
                return io.ktor.client.plugins.websocket.BuildersKt.ws$lambda$14((HttpRequestBuilder) obj);
            case 15:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$5((HttpRequestBuilder) obj);
            case 16:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$12((HttpRequestBuilder) obj);
            case 17:
                return io.ktor.client.plugins.websocket.BuildersKt.ws$lambda$15((HttpRequestBuilder) obj);
            case 18:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$3((HttpRequestBuilder) obj);
            case 19:
                return BuildersJvmKt.prepareOptions$lambda$26((HttpRequestBuilder) obj);
            case 20:
                return BuildersJvmKt.delete$lambda$14((HttpRequestBuilder) obj);
            case 21:
                return BuildersJvmKt.preparePost$lambda$20((HttpRequestBuilder) obj);
            case 22:
                return BuildersJvmKt.preparePut$lambda$22((HttpRequestBuilder) obj);
            case 23:
                return BuildersJvmKt.prepareDelete$lambda$30((HttpRequestBuilder) obj);
            case 24:
                return BuildersJvmKt.put$lambda$6((HttpRequestBuilder) obj);
            case 25:
                return BuildersJvmKt.prepareGet$lambda$18((HttpRequestBuilder) obj);
            case 26:
                return BuildersJvmKt.preparePatch$lambda$24((HttpRequestBuilder) obj);
            case 27:
                return BuildersJvmKt.request$lambda$0((HttpRequestBuilder) obj);
            case 28:
                return BuildersJvmKt.options$lambda$10((HttpRequestBuilder) obj);
            default:
                return BuildersJvmKt.patch$lambda$8((HttpRequestBuilder) obj);
        }
    }
}
