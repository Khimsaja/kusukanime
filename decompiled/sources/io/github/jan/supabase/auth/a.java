package io.github.jan.supabase.auth;

import O3.C;
import com.kusukanime.data.FeedItem;
import e4.k;
import io.github.jan.supabase.auth.user.UserSession;
import io.ktor.client.plugins.api.MonitoringEvent;
import io.ktor.client.plugins.sse.BuildersKt;
import io.ktor.client.plugins.sse.SSEConfig;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.CodecsKt;
import io.ktor.util.GzipHeaderFlags;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12061k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f12062l;

    public /* synthetic */ a(int i7, k kVar) {
        this.f12061k = i7;
        this.f12062l = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12061k) {
            case 0:
                return AndroidKt.handleDeeplinks$lambda$1(this.f12062l, (UserSession) obj);
            case 1:
                return MonitoringEvent.install$lambda$0(this.f12062l, obj);
            case 2:
                return BuildersKt.SSE$lambda$0(this.f12062l, (SSEConfig) obj);
            case 3:
                return io.ktor.client.plugins.websocket.BuildersKt.WebSockets$lambda$0(this.f12062l, (WebSockets.Config) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$16(this.f12062l, (HttpRequestBuilder) obj);
            case 5:
                return Boolean.valueOf(CodecsKt.forEach$lambda$11(this.f12062l, (S5.a) obj));
            default:
                FeedItem feedItem = (FeedItem) obj;
                l.f("it", feedItem);
                this.f12062l.invoke(feedItem.getAnime_slug());
                return C.a;
        }
    }
}
