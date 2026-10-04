package io.ktor.websocket;

import H5.A;
import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebSocketReader$readerJob$1 extends j implements n {
    final /* synthetic */ ObjectPool<ByteBuffer> $pool;
    Object L$0;
    int label;
    final /* synthetic */ WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$readerJob$1(ObjectPool<ByteBuffer> objectPool, WebSocketReader webSocketReader, c<? super WebSocketReader$readerJob$1> cVar) {
        super(2, cVar);
        this.$pool = objectPool;
        this.this$0 = webSocketReader;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new WebSocketReader$readerJob$1(this.$pool, this.this$0, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((WebSocketReader$readerJob$1) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ByteBuffer byteBuffer;
        ProtocolViolationException e7;
        FrameTooBigException e8;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        try {
            if (i7 == 0) {
                r.Y(obj);
                ByteBuffer byteBufferBorrow = this.$pool.borrow();
                try {
                    WebSocketReader webSocketReader = this.this$0;
                    this.L$0 = byteBufferBorrow;
                    this.label = 1;
                    if (webSocketReader.readLoop(byteBufferBorrow, this) == aVar) {
                        return aVar;
                    }
                    byteBuffer = byteBufferBorrow;
                } catch (FrameTooBigException e9) {
                    byteBuffer = byteBufferBorrow;
                    e8 = e9;
                    this.this$0.queue.close(e8);
                } catch (ProtocolViolationException e10) {
                    byteBuffer = byteBufferBorrow;
                    e7 = e10;
                    this.this$0.queue.close(e7);
                } catch (ClosedChannelException unused) {
                    byteBuffer = byteBufferBorrow;
                } catch (IOException unused2) {
                    byteBuffer = byteBufferBorrow;
                    this.this$0.queue.e(null);
                } catch (CancellationException unused3) {
                    byteBuffer = byteBufferBorrow;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBuffer = (ByteBuffer) this.L$0;
                try {
                    r.Y(obj);
                } catch (FrameTooBigException e11) {
                    e8 = e11;
                    this.this$0.queue.close(e8);
                } catch (ProtocolViolationException e12) {
                    e7 = e12;
                    this.this$0.queue.close(e7);
                } catch (ClosedChannelException | CancellationException unused4) {
                } catch (IOException unused5) {
                    this.this$0.queue.e(null);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            this.$pool.recycle(byteBuffer);
            this.this$0.queue.close(null);
            return C.a;
        } catch (Throwable th4) {
            this.$pool.recycle(aVar);
            this.this$0.queue.close(null);
            throw th4;
        }
    }
}
