package io.ktor.websocket;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/websocket/CloseReason;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/websocket/CloseReason;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1", f = "DefaultWebSocketSession.kt", l = {335}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 extends j implements n {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, c<? super DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 = new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this.this$0, cVar);
        defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1;
    }

    @Override // e4.n
    public final Object invoke(CloseReason closeReason, c<? super C> cVar) {
        return ((DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1) create(closeReason, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            CloseReason closeReason = (CloseReason) this.L$0;
            DefaultWebSocketSessionImpl defaultWebSocketSessionImpl = this.this$0;
            IOException iOException = new IOException("Ping timeout");
            this.label = 1;
            if (defaultWebSocketSessionImpl.sendCloseSequence(closeReason, iOException, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        return C.a;
    }
}
