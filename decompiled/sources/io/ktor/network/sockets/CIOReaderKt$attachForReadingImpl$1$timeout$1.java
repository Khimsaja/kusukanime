package io.ktor.network.sockets;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.k;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import java.net.SocketTimeoutException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO3/C;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1$timeout$1", f = "CIOReader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CIOReaderKt$attachForReadingImpl$1$timeout$1 extends j implements k {
    final /* synthetic */ ByteChannel $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOReaderKt$attachForReadingImpl$1$timeout$1(ByteChannel byteChannel, c<? super CIOReaderKt$attachForReadingImpl$1$timeout$1> cVar) {
        super(1, cVar);
        this.$channel = byteChannel;
    }

    @Override // U3.a
    public final c<C> create(c<?> cVar) {
        return new CIOReaderKt$attachForReadingImpl$1$timeout$1(this.$channel, cVar);
    }

    @Override // e4.k
    public final Object invoke(c<? super C> cVar) {
        return ((CIOReaderKt$attachForReadingImpl$1$timeout$1) create(cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        ByteWriteChannelOperationsKt.close(this.$channel, new SocketTimeoutException());
        return C.a;
    }
}
