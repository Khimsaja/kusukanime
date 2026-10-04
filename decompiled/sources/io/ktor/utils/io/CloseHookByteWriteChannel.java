package io.ktor.utils.io;

import O3.C;
import U3.c;
import U3.e;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005H\u0096A¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011R*\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/ktor/utils/io/CloseHookByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "Lkotlin/Function1;", "LS3/c;", "LO3/C;", "", "onClose", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Le4/k;)V", "flushAndClose", "(LS3/c;)Ljava/lang/Object;", "flush", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "Le4/k;", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "LS5/l;", "getWriteBuffer", "()LS5/l;", "writeBuffer", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CloseHookByteWriteChannel implements ByteWriteChannel {
    private final ByteWriteChannel delegate;
    private final k onClose;

    @e(c = "io.ktor.utils.io.CloseHookByteWriteChannel", f = "CloseHookByteWriteChannel.kt", l = {24, 25}, m = "flushAndClose")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1, reason: invalid class name */
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
            return CloseHookByteWriteChannel.this.flushAndClose(this);
        }
    }

    public CloseHookByteWriteChannel(ByteWriteChannel byteWriteChannel, k kVar) {
        l.f("delegate", byteWriteChannel);
        l.f("onClose", kVar);
        this.delegate = byteWriteChannel;
        this.onClose = kVar;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        this.delegate.cancel(cause);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object flush(S3.c<? super C> cVar) {
        return this.delegate.flush(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r6.invoke(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object flushAndClose(S3.c<? super O3.C> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.CloseHookByteWriteChannel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1 r0 = (io.ktor.utils.io.CloseHookByteWriteChannel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1 r0 = new io.ktor.utils.io.CloseHookByteWriteChannel$flushAndClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            P3.r.Y(r6)
            goto L44
        L36:
            P3.r.Y(r6)
            io.ktor.utils.io.ByteWriteChannel r6 = r5.delegate
            r0.label = r4
            java.lang.Object r6 = r6.flushAndClose(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            e4.k r6 = r5.onClose
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.CloseHookByteWriteChannel.flushAndClose(S3.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        return this.delegate.getClosedCause();
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
