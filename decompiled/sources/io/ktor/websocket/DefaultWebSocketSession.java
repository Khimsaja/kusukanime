package io.ktor.websocket;

import H5.G;
import O3.C;
import P3.y;
import S3.c;
import S3.h;
import io.ktor.utils.io.InternalAPI;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/ktor/websocket/DefaultWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", "LO3/C;", "start", "(Ljava/util/List;)V", "", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "pingIntervalMillis", "getTimeoutMillis", "setTimeoutMillis", "timeoutMillis", "LH5/G;", "Lio/ktor/websocket/CloseReason;", "getCloseReason", "()LH5/G;", "closeReason", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DefaultWebSocketSession extends WebSocketSession {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object send(DefaultWebSocketSession defaultWebSocketSession, Frame frame, c<? super C> cVar) {
            Object objSend = WebSocketSession.DefaultImpls.send(defaultWebSocketSession, frame, cVar);
            return objSend == T3.a.f9048k ? objSend : C.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void start$default(DefaultWebSocketSession defaultWebSocketSession, List list, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i7 & 1) != 0) {
                list = y.f7779k;
            }
            defaultWebSocketSession.start(list);
        }
    }

    G getCloseReason();

    @Override // io.ktor.websocket.WebSocketSession, H5.A
    /* synthetic */ h getCoroutineContext();

    long getPingIntervalMillis();

    long getTimeoutMillis();

    void setPingIntervalMillis(long j7);

    void setTimeoutMillis(long j7);

    @InternalAPI
    void start(List<? extends WebSocketExtension<?>> negotiatedExtensions);
}
