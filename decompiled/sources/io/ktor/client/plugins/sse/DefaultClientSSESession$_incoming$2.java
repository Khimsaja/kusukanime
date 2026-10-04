package io.ktor.client.plugins.sse;

import K5.InterfaceC0330i;
import O3.C;
import P3.r;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.util.logging.LoggerJvmKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LK5/i;", "Lio/ktor/sse/ServerSentEvent;", "", "cause", "LO3/C;", "<anonymous>", "(LK5/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$2", f = "DefaultClientSSESession.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultClientSSESession$_incoming$2 extends j implements o {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$_incoming$2(DefaultClientSSESession defaultClientSSESession, S3.c<? super DefaultClientSSESession$_incoming$2> cVar) {
        super(3, cVar);
        this.this$0 = defaultClientSSESession;
    }

    @Override // e4.o
    public final Object invoke(InterfaceC0330i interfaceC0330i, Throwable th, S3.c<? super C> cVar) {
        DefaultClientSSESession$_incoming$2 defaultClientSSESession$_incoming$2 = new DefaultClientSSESession$_incoming$2(this.this$0, cVar);
        defaultClientSSESession$_incoming$2.L$0 = th;
        return defaultClientSSESession$_incoming$2.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        Throwable th = (Throwable) this.L$0;
        if (th instanceof CancellationException) {
            return C.a;
        }
        z6.b logger = SSEKt.getLOGGER();
        if (LoggerJvmKt.isTraceEnabled(logger)) {
            logger.e("Error during SSE session processing: " + th);
        }
        this.this$0.close();
        throw th;
    }
}
