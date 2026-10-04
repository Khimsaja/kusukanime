package io.ktor.utils.io.jvm.nio;

import U3.c;
import U3.e;
import com.kusukanime.BuildConfig;
import io.ktor.util.collections.ConcurrentMapKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.OutputArraysJVMKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "", "count", "Ljava/nio/ByteBuffer;", "request", "(I)Ljava/nio/ByteBuffer;", "LO3/C;", "tryAwait", "(I)V", "rc", "written", "(ILS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "kotlin.jvm.PlatformType", "byteBuffer", "Ljava/nio/ByteBuffer;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WriteSuspendSession {
    private final ByteBuffer byteBuffer;
    private final ByteWriteChannel channel;

    @e(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", l = {BuildConfig.VERSION_CODE, ConcurrentMapKt.INITIAL_CAPACITY}, m = "written")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1, reason: invalid class name */
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
            return WriteSuspendSession.this.written(0, this);
        }
    }

    public WriteSuspendSession(ByteWriteChannel byteWriteChannel) {
        l.f("channel", byteWriteChannel);
        this.channel = byteWriteChannel;
        this.byteBuffer = ByteBuffer.allocate(8192);
    }

    public final ByteWriteChannel getChannel() {
        return this.channel;
    }

    public final ByteBuffer request(int count) {
        return this.byteBuffer;
    }

    public final void tryAwait(int count) {
        S5.l writeBuffer = this.channel.getWriteBuffer();
        ByteBuffer byteBuffer = this.byteBuffer;
        l.e("byteBuffer", byteBuffer);
        OutputArraysJVMKt.writeByteBuffer(writeBuffer, byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r7.flush(r6) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object written(int r6, S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r6 = r7 instanceof io.ktor.utils.io.jvm.nio.WriteSuspendSession.AnonymousClass1
            if (r6 == 0) goto L13
            r6 = r7
            io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1 r6 = (io.ktor.utils.io.jvm.nio.WriteSuspendSession.AnonymousClass1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.label = r0
            goto L18
        L13:
            io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1 r6 = new io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.result
            T3.a r0 = T3.a.f9048k
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            P3.r.Y(r7)
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            P3.r.Y(r7)
            goto L50
        L36:
            P3.r.Y(r7)
            java.nio.ByteBuffer r7 = r5.byteBuffer
            r7.flip()
            io.ktor.utils.io.ByteWriteChannel r7 = r5.channel
            java.nio.ByteBuffer r1 = r5.byteBuffer
            java.lang.String r4 = "byteBuffer"
            kotlin.jvm.internal.l.e(r4, r1)
            r6.label = r3
            java.lang.Object r7 = io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(r7, r1, r6)
            if (r7 != r0) goto L50
            goto L5f
        L50:
            java.nio.ByteBuffer r7 = r5.byteBuffer
            r7.clear()
            io.ktor.utils.io.ByteWriteChannel r7 = r5.channel
            r6.label = r2
            java.lang.Object r6 = r7.flush(r6)
            if (r6 != r0) goto L60
        L5f:
            return r0
        L60:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WriteSuspendSession.written(int, S3.c):java.lang.Object");
    }
}
