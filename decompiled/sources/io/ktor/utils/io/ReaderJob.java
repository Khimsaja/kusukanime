package io.ktor.utils.io;

import H5.InterfaceC0265f0;
import U3.c;
import U3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0087@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ReaderJob;", "Lio/ktor/utils/io/ChannelJob;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "LH5/f0;", "job", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;LH5/f0;)V", "LO3/C;", "flushAndClose", "(LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "LH5/f0;", "getJob", "()LH5/f0;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReaderJob implements ChannelJob {
    private final ByteWriteChannel channel;
    private final InterfaceC0265f0 job;

    @e(c = "io.ktor.utils.io.ReaderJob", f = "ByteReadChannelOperations.kt", l = {311, 313}, m = "flushAndClose")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.ReaderJob$flushAndClose$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReaderJob.this.flushAndClose(this);
        }
    }

    public ReaderJob(ByteWriteChannel byteWriteChannel, InterfaceC0265f0 interfaceC0265f0) {
        l.f("channel", byteWriteChannel);
        l.f("job", interfaceC0265f0);
        this.channel = byteWriteChannel;
        this.job = interfaceC0265f0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r7.flushAndClose(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.utils.io.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flushAndClose(S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ReaderJob.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ReaderJob$flushAndClose$1 r0 = (io.ktor.utils.io.ReaderJob.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ReaderJob$flushAndClose$1 r0 = new io.ktor.utils.io.ReaderJob$flushAndClose$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            P3.r.Y(r7)
            goto L8e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            java.lang.Object r2 = r0.L$0
            java.util.Iterator r2 = (java.util.Iterator) r2
            P3.r.Y(r7)
            goto L67
        L3b:
            P3.r.Y(r7)
            H5.f0 r7 = r6.getJob()
            y5.h r7 = r7.s()
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r7.next()
            H5.f0 r2 = (H5.InterfaceC0265f0) r2
            r2.e(r3)
            goto L4a
        L5a:
            H5.f0 r7 = r6.getJob()
            y5.h r7 = r7.s()
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L67:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L81
            java.lang.Object r7 = r2.next()
            H5.f0 r7 = (H5.InterfaceC0265f0) r7
            r7.e(r3)
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r7 = r7.m(r0)
            if (r7 != r1) goto L67
            goto L8d
        L81:
            io.ktor.utils.io.ByteWriteChannel r7 = r6.channel
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r7 = r7.flushAndClose(r0)
            if (r7 != r1) goto L8e
        L8d:
            return r1
        L8e:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ReaderJob.flushAndClose(S3.c):java.lang.Object");
    }

    public final ByteWriteChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.utils.io.ChannelJob
    public InterfaceC0265f0 getJob() {
        return this.job;
    }
}
