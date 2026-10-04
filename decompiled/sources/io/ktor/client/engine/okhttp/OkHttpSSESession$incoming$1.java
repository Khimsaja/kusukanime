package io.ktor.client.engine.okhttp;

import K5.InterfaceC0330i;
import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.o;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LK5/i;", "Lio/ktor/sse/ServerSentEvent;", "", "cause", "LO3/C;", "<anonymous>", "(LK5/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.engine.okhttp.OkHttpSSESession$incoming$1", f = "OkHttpSSESession.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OkHttpSSESession$incoming$1 extends j implements o {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OkHttpSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpSSESession$incoming$1(OkHttpSSESession okHttpSSESession, c<? super OkHttpSSESession$incoming$1> cVar) {
        super(3, cVar);
        this.this$0 = okHttpSSESession;
    }

    @Override // e4.o
    public final Object invoke(InterfaceC0330i interfaceC0330i, Throwable th, c<? super C> cVar) {
        OkHttpSSESession$incoming$1 okHttpSSESession$incoming$1 = new OkHttpSSESession$incoming$1(this.this$0, cVar);
        okHttpSSESession$incoming$1.L$0 = th;
        return okHttpSSESession$incoming$1.invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        if (((Throwable) this.L$0) instanceof CancellationException) {
            this.this$0.close(null);
        }
        return C.a;
    }
}
