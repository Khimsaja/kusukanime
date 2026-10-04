package io.ktor.client.engine.okhttp;

import H5.B;
import H5.C0263e0;
import H5.C0276q;
import H5.D;
import H5.G;
import H5.InterfaceC0265f0;
import H5.InterfaceC0275p;
import J5.e;
import J5.i;
import J5.u;
import J5.v;
import O3.C;
import O3.InterfaceC0554c;
import P3.F;
import P3.y;
import S3.c;
import S3.h;
import e4.n;
import f6.AbstractC0902P;
import f6.C0887A;
import f6.C0890D;
import f6.C0895I;
import f6.InterfaceC0900N;
import f6.InterfaceC0901O;
import io.ktor.client.plugins.websocket.WebSocketException;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketExtension;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import z5.C2496a;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001b\u0010\u001fJ'\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010$J)\u0010(\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b*\u0010+J\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0017¢\u0006\u0004\b-\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0000038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00105R&\u0010@\u001a\b\u0012\u0004\u0012\u00020:0?8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010,\u001a\u0004\bB\u0010CR$\u0010K\u001a\u00020E2\u0006\u0010F\u001a\u00020E8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010N\u001a\u00020E2\u0006\u0010F\u001a\u00020E8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010T\u001a\u00020O2\u0006\u0010F\u001a\u00020O8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010W\u001a\u00020E2\u0006\u0010F\u001a\u00020E8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020:0X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001e\u0010b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpWebsocketSession;", "Lio/ktor/websocket/DefaultWebSocketSession;", "Lf6/P;", "Lf6/A;", "engine", "Lf6/N;", "webSocketFactory", "Lf6/D;", "engineRequest", "LS3/h;", "coroutineContext", "<init>", "(Lf6/A;Lf6/N;Lf6/D;LS3/h;)V", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", "LO3/C;", "start", "(Ljava/util/List;)V", "Lf6/O;", "webSocket", "Lf6/I;", "response", "onOpen", "(Lf6/O;Lf6/I;)V", "Lw6/l;", "bytes", "onMessage", "(Lf6/O;Lw6/l;)V", "", ContentType.Text.TYPE, "(Lf6/O;Ljava/lang/String;)V", "", "code", "reason", "onClosed", "(Lf6/O;ILjava/lang/String;)V", "onClosing", "", "t", "onFailure", "(Lf6/O;Ljava/lang/Throwable;Lf6/I;)V", "flush", "(LS3/c;)Ljava/lang/Object;", "()V", "terminate", "Lf6/A;", "Lf6/N;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "LH5/p;", "self", "LH5/p;", "originResponse", "getOriginResponse$ktor_client_okhttp", "()LH5/p;", "LJ5/i;", "Lio/ktor/websocket/Frame;", "_incoming", "LJ5/i;", "Lio/ktor/websocket/CloseReason;", "_closeReason", "LJ5/v;", "outgoing", "LJ5/v;", "getOutgoing", "()LJ5/v;", "getOutgoing$annotations", "", "_", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "pingIntervalMillis", "getTimeoutMillis", "setTimeoutMillis", "timeoutMillis", "", "getMasking", "()Z", "setMasking", "(Z)V", "masking", "getMaxFrameSize", "setMaxFrameSize", "maxFrameSize", "LJ5/u;", "getIncoming", "()LJ5/u;", "incoming", "LH5/G;", "getCloseReason", "()LH5/G;", "closeReason", "getExtensions", "()Ljava/util/List;", "extensions", "ktor-client-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpWebsocketSession extends AbstractC0902P implements DefaultWebSocketSession {
    private final InterfaceC0275p _closeReason;
    private final i _incoming;
    private final h coroutineContext;
    private final C0887A engine;
    private final InterfaceC0275p originResponse;
    private final v outgoing;
    private final InterfaceC0275p self;
    private final InterfaceC0900N webSocketFactory;

    public OkHttpWebsocketSession(C0887A c0887a, InterfaceC0900N interfaceC0900N, C0890D c0890d, h hVar) {
        l.f("engine", c0887a);
        l.f("webSocketFactory", interfaceC0900N);
        l.f("engineRequest", c0890d);
        l.f("coroutineContext", hVar);
        this.engine = c0887a;
        this.webSocketFactory = interfaceC0900N;
        this.coroutineContext = hVar;
        this.self = D.b();
        this.originResponse = D.b();
        this._incoming = F.a(0, 7, null);
        this._closeReason = D.b();
        n okHttpWebsocketSession$outgoing$1 = new OkHttpWebsocketSession$outgoing$1(this, c0890d, null);
        S3.i iVar = S3.i.f8767k;
        B b4 = B.f3790k;
        h hVarY = D.y(this, iVar);
        e eVarA = F.a(0, 6, null);
        B b7 = B.f3790k;
        J5.a aVar = new J5.a(hVarY, eVarA, false, true);
        aVar.C((InterfaceC0265f0) hVarY.get(C0263e0.f3843k));
        aVar.b0(b4, aVar, okHttpWebsocketSession$outgoing$1);
        this.outgoing = aVar;
    }

    public static /* synthetic */ void getOutgoing$annotations() {
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(c<? super C> cVar) {
        return C.a;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public G getCloseReason() {
        return this._closeReason;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession, io.ktor.websocket.WebSocketSession, H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return y.f7779k;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public u getIncoming() {
        return this._incoming;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return true;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return Long.MAX_VALUE;
    }

    /* renamed from: getOriginResponse$ktor_client_okhttp, reason: from getter */
    public final InterfaceC0275p getOriginResponse() {
        return this.originResponse;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public v getOutgoing() {
        return this.outgoing;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getPingIntervalMillis() {
        this.engine.getClass();
        return 0;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getTimeoutMillis() {
        return this.engine.f11445H;
    }

    @Override // f6.AbstractC0902P
    public void onClosed(InterfaceC0901O webSocket, int code, String reason) {
        Object objValueOf;
        l.f("webSocket", webSocket);
        l.f("reason", reason);
        short s7 = (short) code;
        ((C0276q) this._closeReason).F(new CloseReason(s7, reason));
        this._incoming.close(null);
        v outgoing = getOutgoing();
        StringBuilder sb = new StringBuilder("WebSocket session closed with code ");
        CloseReason.Codes codesByCode = CloseReason.Codes.INSTANCE.byCode(s7);
        if (codesByCode == null || (objValueOf = codesByCode.toString()) == null) {
            objValueOf = Integer.valueOf(code);
        }
        outgoing.close(new CancellationException(A6.b.i(sb, objValueOf, '.')));
    }

    @Override // f6.AbstractC0902P
    public void onClosing(InterfaceC0901O webSocket, int code, String reason) {
        l.f("webSocket", webSocket);
        l.f("reason", reason);
        short s7 = (short) code;
        ((C0276q) this._closeReason).F(new CloseReason(s7, reason));
        try {
            AbstractC1420H.Q(getOutgoing(), new Frame.Close(new CloseReason(s7, reason)));
        } catch (Throwable unused) {
        }
        this._incoming.close(null);
    }

    @Override // f6.AbstractC0902P
    public void onFailure(InterfaceC0901O webSocket, Throwable t7, C0895I response) {
        l.f("webSocket", webSocket);
        l.f("t", t7);
        Integer numValueOf = response != null ? Integer.valueOf(response.f11498n) : null;
        int value = HttpStatusCode.INSTANCE.getUnauthorized().getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            ((C0276q) this.originResponse).F(response);
            this._incoming.close(null);
            getOutgoing().close(null);
        } else {
            ((C0276q) this.originResponse).Z(t7);
            ((C0276q) this._closeReason).Z(t7);
            this._incoming.close(t7);
            getOutgoing().close(t7);
        }
    }

    @Override // f6.AbstractC0902P
    public void onMessage(InterfaceC0901O webSocket, w6.l bytes) {
        l.f("webSocket", webSocket);
        l.f("bytes", bytes);
        AbstractC1420H.Q(this._incoming, new Frame.Binary(true, bytes.q()));
    }

    @Override // f6.AbstractC0902P
    public void onOpen(InterfaceC0901O webSocket, C0895I response) {
        l.f("webSocket", webSocket);
        l.f("response", response);
        ((C0276q) this.originResponse).F(response);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, c<? super C> cVar) {
        return DefaultWebSocketSession.DefaultImpls.send(this, frame, cVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z7) {
        throw new WebSocketException("Masking switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j7) {
        throw new WebSocketException("Max frame size switch is not supported in OkHttp engine.");
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setPingIntervalMillis(long j7) {
        throw new WebSocketException("OkHttp doesn't support dynamic ping interval. You could switch it in the engine configuration.");
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setTimeoutMillis(long j7) {
        throw new WebSocketException("Websocket timeout should be configured in OkHttp engine.");
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void start(List<? extends WebSocketExtension<?>> negotiatedExtensions) {
        l.f("negotiatedExtensions", negotiatedExtensions);
        if (!negotiatedExtensions.isEmpty()) {
            throw new IllegalArgumentException("Extensions are not supported.");
        }
    }

    @Override // io.ktor.websocket.WebSocketSession
    @InterfaceC0554c
    public void terminate() {
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) getCoroutineContext().get(C0263e0.f3843k);
        if (interfaceC0265f0 != null) {
            interfaceC0265f0.e(null);
        }
    }

    @Override // f6.AbstractC0902P
    public void onMessage(InterfaceC0901O webSocket, String text) {
        l.f("webSocket", webSocket);
        l.f(ContentType.Text.TYPE, text);
        i iVar = this._incoming;
        byte[] bytes = text.getBytes(C2496a.f19036b);
        l.e("getBytes(...)", bytes);
        AbstractC1420H.Q(iVar, new Frame.Text(true, bytes));
    }

    public final void start() {
        ((C0276q) this.self).F(this);
    }
}
