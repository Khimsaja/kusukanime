package io.ktor.client.plugins.websocket;

import A5.c;
import A5.g;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.websocket.WebSocketExtensionsConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\".\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LA5/a;", "pingInterval", "", "maxFrameSize", "Lio/ktor/client/plugins/websocket/WebSockets;", "WebSockets-dnQKTGw", "(LA5/a;J)Lio/ktor/client/plugins/websocket/WebSockets;", "WebSockets", "getPingInterval", "(Lio/ktor/client/plugins/websocket/WebSockets;)LA5/a;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "new", "(Lio/ktor/client/plugins/websocket/WebSockets$Config;)LA5/a;", "setPingInterval-6Au4x4Y", "(Lio/ktor/client/plugins/websocket/WebSockets$Config;LA5/a;)V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DurationsKt {
    /* renamed from: WebSockets-dnQKTGw, reason: not valid java name */
    public static final WebSockets m158WebSocketsdnQKTGw(A5.a aVar, long j7) {
        return new WebSockets(aVar != null ? A5.a.c(aVar.f240k) : 0L, j7, new WebSocketExtensionsConfig(), null, 8, null);
    }

    /* renamed from: WebSockets-dnQKTGw$default, reason: not valid java name */
    public static /* synthetic */ WebSockets m159WebSocketsdnQKTGw$default(A5.a aVar, long j7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 2147483647L;
        }
        return m158WebSocketsdnQKTGw(aVar, j7);
    }

    public static final A5.a getPingInterval(WebSockets webSockets) {
        l.f("<this>", webSockets);
        Long lValueOf = Long.valueOf(webSockets.getPingIntervalMillis());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        int i7 = A5.a.f239n;
        return new A5.a(g.o(lValueOf.longValue(), c.f242m));
    }

    /* renamed from: setPingInterval-6Au4x4Y, reason: not valid java name */
    public static final void m160setPingInterval6Au4x4Y(WebSockets.Config config, A5.a aVar) {
        l.f("$this$pingInterval", config);
        config.setPingIntervalMillis(aVar != null ? A5.a.c(aVar.f240k) : 0L);
    }

    public static final A5.a getPingInterval(WebSockets.Config config) {
        l.f("<this>", config);
        Long lValueOf = Long.valueOf(config.getPingIntervalMillis());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        int i7 = A5.a.f239n;
        return new A5.a(g.o(lValueOf.longValue(), c.f242m));
    }
}
