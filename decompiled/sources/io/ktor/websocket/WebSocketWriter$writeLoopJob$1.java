package io.ktor.websocket;

import H5.A;
import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebSocketWriter$writeLoopJob$1 extends j implements n {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WebSocketWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoopJob$1(WebSocketWriter webSocketWriter, c<? super WebSocketWriter$writeLoopJob$1> cVar) {
        super(2, cVar);
        this.this$0 = webSocketWriter;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new WebSocketWriter$writeLoopJob$1(this.this$0, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((WebSocketWriter$writeLoopJob$1) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ObjectPool pool;
        Object obj2;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$1;
            pool = (ObjectPool) this.L$0;
            try {
                r.Y(obj);
                pool.recycle(obj2);
                return C.a;
            } catch (Throwable th) {
                th = th;
                pool.recycle(obj2);
                throw th;
            }
        }
        r.Y(obj);
        pool = this.this$0.getPool();
        WebSocketWriter webSocketWriter = this.this$0;
        Object objBorrow = pool.borrow();
        try {
            this.L$0 = pool;
            this.L$1 = objBorrow;
            this.label = 1;
            if (webSocketWriter.writeLoop((ByteBuffer) objBorrow, this) == aVar) {
                return aVar;
            }
            obj2 = objBorrow;
            pool.recycle(obj2);
            return C.a;
        } catch (Throwable th2) {
            th = th2;
            obj2 = objBorrow;
            pool.recycle(obj2);
            throw th;
        }
    }
}
