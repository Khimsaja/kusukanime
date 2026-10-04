package io.ktor.utils.io;

import O3.C;
import O3.InterfaceC0554c;
import S3.c;
import e4.k;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "LO3/C;", "close", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "Lio/ktor/utils/io/ByteChannel;", "cancel", "(Lio/ktor/utils/io/ByteChannel;)V", "flushIfNeeded", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteWriteChannelKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ByteWriteChannelKt$close$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends j implements k {
        public AnonymousClass1(Object obj) {
            super(1, 0, ByteWriteChannel.class, obj, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // e4.k
        public final Object invoke(c<? super C> cVar) {
            return ((ByteWriteChannel) this.receiver).flushAndClose(cVar);
        }
    }

    public static final void cancel(ByteChannel byteChannel) {
        l.f("<this>", byteChannel);
        byteChannel.cancel(new IOException("Channel was cancelled"));
    }

    @InterfaceC0554c
    public static final void close(ByteWriteChannel byteWriteChannel) {
        l.f("<this>", byteWriteChannel);
        ByteWriteChannelOperationsKt.fireAndForget(new AnonymousClass1(byteWriteChannel));
    }

    @InternalAPI
    public static final Object flushIfNeeded(ByteWriteChannel byteWriteChannel, c<? super C> cVar) {
        Object objFlush;
        ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(byteWriteChannel);
        ByteChannel byteChannel = byteWriteChannel instanceof ByteChannel ? (ByteChannel) byteWriteChannel : null;
        return (((byteChannel == null || !byteChannel.getAutoFlush()) && BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer()) < 1048576) || (objFlush = byteWriteChannel.flush(cVar)) != T3.a.f9048k) ? C.a : objFlush;
    }

    @InterfaceC0554c
    public static final void cancel(ByteWriteChannel byteWriteChannel) {
        l.f("<this>", byteWriteChannel);
        byteWriteChannel.cancel(new IOException("Channel was cancelled"));
    }
}
