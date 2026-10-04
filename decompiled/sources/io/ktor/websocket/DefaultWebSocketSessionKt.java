package io.ktor.websocket;

import A5.c;
import A5.g;
import H5.C0284z;
import io.github.jan.supabase.auth.SettingsSessionManager;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.websocket.CloseReason;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z6.b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001e\u0010\n\u001a\u00060\bj\u0002`\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\".\u0010\u001d\u001a\u0004\u0018\u00010\u0017*\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\"*\u0010\"\u001a\u00020\u0017*\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00178Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lio/ktor/websocket/WebSocketSession;", SettingsSessionManager.SETTINGS_KEY, "", "pingIntervalMillis", "timeoutMillis", "Lio/ktor/websocket/DefaultWebSocketSession;", "DefaultWebSocketSession", "(Lio/ktor/websocket/WebSocketSession;JJ)Lio/ktor/websocket/DefaultWebSocketSession;", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "getLOGGER", "()Lz6/b;", "PINGER_DISABLED", "J", "LH5/z;", "IncomingProcessorCoroutineName", "LH5/z;", "OutgoingProcessorCoroutineName", "Lio/ktor/websocket/CloseReason;", "NORMAL_CLOSE", "Lio/ktor/websocket/CloseReason;", "LA5/a;", "newDuration", "getPingInterval", "(Lio/ktor/websocket/DefaultWebSocketSession;)LA5/a;", "setPingInterval-6Au4x4Y", "(Lio/ktor/websocket/DefaultWebSocketSession;LA5/a;)V", "pingInterval", "getTimeout", "(Lio/ktor/websocket/DefaultWebSocketSession;)J", "setTimeout-HG0u8IE", "(Lio/ktor/websocket/DefaultWebSocketSession;J)V", "timeout", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultWebSocketSessionKt {
    public static final long PINGER_DISABLED = 0;
    private static final b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.websocket.WebSocket");
    private static final C0284z IncomingProcessorCoroutineName = new C0284z("ws-incoming-processor");
    private static final C0284z OutgoingProcessorCoroutineName = new C0284z("ws-outgoing-processor");
    private static final CloseReason NORMAL_CLOSE = new CloseReason(CloseReason.Codes.NORMAL, "OK");

    public static final DefaultWebSocketSession DefaultWebSocketSession(WebSocketSession webSocketSession, long j7, long j8) {
        l.f(SettingsSessionManager.SETTINGS_KEY, webSocketSession);
        if (webSocketSession instanceof DefaultWebSocketSession) {
            throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession");
        }
        return new DefaultWebSocketSessionImpl(webSocketSession, j7, j8);
    }

    public static /* synthetic */ DefaultWebSocketSession DefaultWebSocketSession$default(WebSocketSession webSocketSession, long j7, long j8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        if ((i7 & 4) != 0) {
            j8 = 15000;
        }
        return DefaultWebSocketSession(webSocketSession, j7, j8);
    }

    public static final b getLOGGER() {
        return LOGGER;
    }

    public static final A5.a getPingInterval(DefaultWebSocketSession defaultWebSocketSession) {
        l.f("<this>", defaultWebSocketSession);
        Long lValueOf = Long.valueOf(defaultWebSocketSession.getPingIntervalMillis());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        int i7 = A5.a.f239n;
        return new A5.a(g.o(lValueOf.longValue(), c.f242m));
    }

    public static final long getTimeout(DefaultWebSocketSession defaultWebSocketSession) {
        l.f("<this>", defaultWebSocketSession);
        int i7 = A5.a.f239n;
        return g.o(defaultWebSocketSession.getTimeoutMillis(), c.f242m);
    }

    /* renamed from: setPingInterval-6Au4x4Y, reason: not valid java name */
    public static final void m214setPingInterval6Au4x4Y(DefaultWebSocketSession defaultWebSocketSession, A5.a aVar) {
        l.f("$this$pingInterval", defaultWebSocketSession);
        defaultWebSocketSession.setPingIntervalMillis(aVar != null ? A5.a.c(aVar.f240k) : 0L);
    }

    /* renamed from: setTimeout-HG0u8IE, reason: not valid java name */
    public static final void m215setTimeoutHG0u8IE(DefaultWebSocketSession defaultWebSocketSession, long j7) {
        l.f("$this$timeout", defaultWebSocketSession);
        defaultWebSocketSession.setTimeoutMillis(A5.a.c(j7));
    }
}
