package io.ktor.websocket;

import H5.A;
import J5.u;
import J5.v;
import O3.C;
import O3.InterfaceC0554c;
import S3.c;
import S3.h;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lio/ktor/websocket/WebSocketSession;", "LH5/A;", "Lio/ktor/websocket/Frame;", "frame", "LO3/C;", "send", "(Lio/ktor/websocket/Frame;LS3/c;)Ljava/lang/Object;", "flush", "(LS3/c;)Ljava/lang/Object;", "terminate", "()V", "", "getMasking", "()Z", "setMasking", "(Z)V", "masking", "", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize", "LJ5/u;", "getIncoming", "()LJ5/u;", "incoming", "LJ5/v;", "getOutgoing", "()LJ5/v;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "extensions", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WebSocketSession extends A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object send(WebSocketSession webSocketSession, Frame frame, c<? super C> cVar) {
            Object objSend = webSocketSession.getOutgoing().send(frame, cVar);
            return objSend == T3.a.f9048k ? objSend : C.a;
        }
    }

    Object flush(c<? super C> cVar);

    @Override // H5.A
    /* synthetic */ h getCoroutineContext();

    List<WebSocketExtension<?>> getExtensions();

    u getIncoming();

    boolean getMasking();

    long getMaxFrameSize();

    v getOutgoing();

    Object send(Frame frame, c<? super C> cVar);

    void setMasking(boolean z7);

    void setMaxFrameSize(long j7);

    @InterfaceC0554c
    void terminate();
}
