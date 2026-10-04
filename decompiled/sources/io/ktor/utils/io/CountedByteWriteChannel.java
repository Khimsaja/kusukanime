package io.ktor.utils.io;

import O3.C;
import U3.c;
import U3.e;
import io.ktor.util.collections.ConcurrentMapKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\rR\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\u00148F¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00198VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lio/ktor/utils/io/CountedByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "LO3/C;", "flush", "(LS3/c;)Ljava/lang/Object;", "flushAndClose", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "", "initial", "I", "getInitial$annotations", "()V", "flushedCount", "", "getTotalBytesWritten", "()J", "getTotalBytesWritten$annotations", "totalBytesWritten", "LS5/l;", "getWriteBuffer", "()LS5/l;", "getWriteBuffer$annotations", "writeBuffer", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CountedByteWriteChannel implements ByteWriteChannel {
    private final ByteWriteChannel delegate;
    private int flushedCount;
    private int initial;

    @e(c = "io.ktor.utils.io.CountedByteWriteChannel", f = "CountedByteWriteChannel.kt", l = {ConcurrentMapKt.INITIAL_CAPACITY}, m = "flush")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.CountedByteWriteChannel$flush$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CountedByteWriteChannel.this.flush(this);
        }
    }

    public CountedByteWriteChannel(ByteWriteChannel byteWriteChannel) {
        l.f("delegate", byteWriteChannel);
        this.delegate = byteWriteChannel;
        this.initial = BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer());
    }

    private static /* synthetic */ void getInitial$annotations() {
    }

    public static /* synthetic */ void getTotalBytesWritten$annotations() {
    }

    @InternalAPI
    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        this.delegate.cancel(cause);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object flush(S3.c<? super O3.C> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.CountedByteWriteChannel$flush$1 r0 = (io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.CountedByteWriteChannel$flush$1 r0 = new io.ktor.utils.io.CountedByteWriteChannel$flush$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            P3.r.Y(r5)
            int r5 = r4.flushedCount
            S5.l r2 = r4.getWriteBuffer()
            int r2 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r2)
            int r2 = r2 + r5
            r4.flushedCount = r2
            io.ktor.utils.io.ByteWriteChannel r5 = r4.delegate
            r0.label = r3
            java.lang.Object r5 = r5.flush(r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            S5.l r5 = r4.getWriteBuffer()
            int r5 = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(r5)
            r4.initial = r5
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.CountedByteWriteChannel.flush(S3.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object flushAndClose(S3.c<? super C> cVar) {
        Object objFlushAndClose = this.delegate.flushAndClose(cVar);
        return objFlushAndClose == T3.a.f9048k ? objFlushAndClose : C.a;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    public final long getTotalBytesWritten() {
        return (BytePacketBuilderKt.getSize(getWriteBuffer()) + this.flushedCount) - this.initial;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public S5.l getWriteBuffer() {
        return this.delegate.getWriteBuffer();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return this.delegate.isClosedForWrite();
    }
}
