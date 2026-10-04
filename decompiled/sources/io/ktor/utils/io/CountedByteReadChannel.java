package io.ktor.utils.io;

import U3.c;
import U3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00158VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\"\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lio/ktor/utils/io/CountedByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "LO3/C;", "transferFromDelegate", "()V", "updateConsumed", "", "min", "", "awaitContent", "(ILS3/c;)Ljava/lang/Object;", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getDelegate", "()Lio/ktor/utils/io/ByteReadChannel;", "LS5/a;", "buffer", "LS5/a;", "", "initial", "J", "consumed", "getReadBuffer", "()LS5/a;", "getReadBuffer$annotations", "readBuffer", "getTotalBytesRead", "()J", "totalBytesRead", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CountedByteReadChannel implements ByteReadChannel {
    private final S5.a buffer;
    private long consumed;
    private final ByteReadChannel delegate;
    private long initial;

    @e(c = "io.ktor.utils.io.CountedByteReadChannel", f = "CountedByteReadChannel.kt", l = {48}, m = "awaitContent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.CountedByteReadChannel$awaitContent$1, reason: invalid class name */
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
            return CountedByteReadChannel.this.awaitContent(0, this);
        }
    }

    public CountedByteReadChannel(ByteReadChannel byteReadChannel) {
        l.f("delegate", byteReadChannel);
        this.delegate = byteReadChannel;
        this.buffer = new S5.a();
    }

    @InternalAPI
    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    private final void transferFromDelegate() {
        updateConsumed();
        this.initial += this.buffer.M(this.delegate.getReadBuffer());
    }

    private final void updateConsumed() {
        long j7 = this.consumed;
        long j8 = this.initial;
        long j9 = this.buffer.f8784m;
        this.consumed = (j8 - j9) + j7;
        this.initial = j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitContent(int r9, S3.c<? super java.lang.Boolean> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.CountedByteReadChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.CountedByteReadChannel$awaitContent$1 r0 = (io.ktor.utils.io.CountedByteReadChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.CountedByteReadChannel$awaitContent$1 r0 = new io.ktor.utils.io.CountedByteReadChannel$awaitContent$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r10)
            goto L4b
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            P3.r.Y(r10)
            S5.a r10 = r8.getReadBuffer()
            long r4 = r10.f8784m
            long r6 = (long) r9
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L40
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L40:
            io.ktor.utils.io.ByteReadChannel r10 = r8.delegate
            r0.label = r3
            java.lang.Object r10 = r10.awaitContent(r9, r0)
            if (r10 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L59
            r8.transferFromDelegate()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L59:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.CountedByteReadChannel.awaitContent(int, S3.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        this.delegate.cancel(cause);
        this.buffer.getClass();
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    public final ByteReadChannel getDelegate() {
        return this.delegate;
    }

    public final long getTotalBytesRead() {
        updateConsumed();
        return this.consumed;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.buffer.z() && this.delegate.isClosedForRead();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public S5.a getReadBuffer() {
        transferFromDelegate();
        return this.buffer;
    }
}
