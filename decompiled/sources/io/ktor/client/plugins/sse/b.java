package io.ktor.client.plugins.sse;

import e4.k;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12142k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f12143l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f12144m;

    public /* synthetic */ b(int i7, String str, k kVar) {
        this.f12142k = i7;
        this.f12143l = str;
        this.f12144m = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) obj;
        switch (this.f12142k) {
            case 0:
                return BuildersKt.serverSentEventsSession_Mswn__c$lambda$18(this.f12143l, this.f12144m, httpRequestBuilder);
            case 1:
                return BuildersKt.serverSentEvents_3bFjkrY$lambda$9(this.f12143l, this.f12144m, httpRequestBuilder);
            case 2:
                return BuildersKt.serverSentEvents_pTj2aPc$lambda$22(this.f12143l, this.f12144m, httpRequestBuilder);
            case 3:
                return BuildersKt.serverSentEventsSession_mY9Nd3A$lambda$5(this.f12143l, this.f12144m, httpRequestBuilder);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$13(this.f12143l, this.f12144m, httpRequestBuilder);
            case 5:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$18(this.f12143l, this.f12144m, httpRequestBuilder);
            default:
                return io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$6(this.f12143l, this.f12144m, httpRequestBuilder);
        }
    }
}
