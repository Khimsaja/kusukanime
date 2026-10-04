package io.ktor.client.plugins.websocket;

import J5.u;
import J5.v;
import O3.C;
import O3.InterfaceC0554c;
import S3.c;
import S3.h;
import io.github.jan.supabase.auth.SettingsSessionManager;
import io.ktor.client.call.HttpClientCall;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketExtension;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096A¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096A¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u00020\u00148\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001e\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lio/ktor/client/plugins/websocket/DelegatingClientWebSocketSession;", "Lio/ktor/client/plugins/websocket/ClientWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/client/call/HttpClientCall;", "call", SettingsSessionManager.SETTINGS_KEY, "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/websocket/WebSocketSession;)V", "Lio/ktor/websocket/Frame;", "frame", "LO3/C;", "send", "(Lio/ktor/websocket/Frame;LS3/c;)Ljava/lang/Object;", "flush", "(LS3/c;)Ljava/lang/Object;", "terminate", "()V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "", "getMasking", "()Z", "setMasking", "(Z)V", "masking", "", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize", "LJ5/u;", "getIncoming", "()LJ5/u;", "incoming", "LJ5/v;", "getOutgoing", "()LJ5/v;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "extensions", "LS3/h;", "getCoroutineContext", "()LS3/h;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatingClientWebSocketSession implements ClientWebSocketSession, WebSocketSession {
    private final /* synthetic */ WebSocketSession $$delegate_0;
    private final HttpClientCall call;

    public DelegatingClientWebSocketSession(HttpClientCall httpClientCall, WebSocketSession webSocketSession) {
        l.f("call", httpClientCall);
        l.f(SettingsSessionManager.SETTINGS_KEY, webSocketSession);
        this.$$delegate_0 = webSocketSession;
        this.call = httpClientCall;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(c<? super C> cVar) {
        return this.$$delegate_0.flush(cVar);
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession
    public HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession, io.ktor.websocket.WebSocketSession, H5.A
    public h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return this.$$delegate_0.getExtensions();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public u getIncoming() {
        return this.$$delegate_0.getIncoming();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.$$delegate_0.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.$$delegate_0.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public v getOutgoing() {
        return this.$$delegate_0.getOutgoing();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, c<? super C> cVar) {
        return this.$$delegate_0.send(frame, cVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z7) {
        this.$$delegate_0.setMasking(z7);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j7) {
        this.$$delegate_0.setMaxFrameSize(j7);
    }

    @Override // io.ktor.websocket.WebSocketSession
    @InterfaceC0554c
    public void terminate() {
        this.$$delegate_0.terminate();
    }
}
