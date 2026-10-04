package io.ktor.utils.io;

import O3.C;
import S3.c;
import S5.e;
import S5.g;
import S5.l;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u000e8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/ktor/utils/io/SinkByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "LS5/e;", "origin", "<init>", "(LS5/e;)V", "LO3/C;", "flush", "(LS3/c;)Ljava/lang/Object;", "flushAndClose", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "LS5/l;", "buffer", "LS5/l;", "getWriteBuffer", "()LS5/l;", "getWriteBuffer$annotations", "()V", "writeBuffer", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SinkByteWriteChannel implements ByteWriteChannel {
    static final /* synthetic */ AtomicReferenceFieldUpdater closed$FU = AtomicReferenceFieldUpdater.newUpdater(SinkByteWriteChannel.class, Object.class, "closed");
    private final l buffer;
    volatile /* synthetic */ Object closed;

    public SinkByteWriteChannel(e eVar) {
        kotlin.jvm.internal.l.f("origin", eVar);
        this.closed = null;
        this.buffer = new g(eVar);
    }

    @InternalAPI
    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        CloseToken closed = cause == null ? CloseTokenKt.getCLOSED() : new CloseToken(cause);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closed$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closed) && atomicReferenceFieldUpdater.get(this) == null) {
        }
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object flush(c<? super C> cVar) {
        getWriteBuffer().flush();
        return C.a;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object flushAndClose(c<? super C> cVar) {
        C c2;
        getWriteBuffer().flush();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closed$FU;
        CloseToken closed = CloseTokenKt.getCLOSED();
        do {
            boolean zCompareAndSet = atomicReferenceFieldUpdater.compareAndSet(this, null, closed);
            c2 = C.a;
            if (zCompareAndSet) {
                return c2;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return c2;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = (CloseToken) this.closed;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public l getWriteBuffer() throws Throwable {
        if (!isClosedForWrite()) {
            return this.buffer;
        }
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            throw new IOException("Channel is closed for write");
        }
        throw closedCause;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return this.closed != null;
    }
}
