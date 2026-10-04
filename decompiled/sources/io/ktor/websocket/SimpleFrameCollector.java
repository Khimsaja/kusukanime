package io.ktor.websocket;

import io.ktor.util.NIOKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lio/ktor/websocket/SimpleFrameCollector;", "", "<init>", "()V", "", "length", "Ljava/nio/ByteBuffer;", "bb", "LO3/C;", "start", "(ILjava/nio/ByteBuffer;)V", "handle", "(Ljava/nio/ByteBuffer;)V", "maskKey", "take", "(Ljava/lang/Integer;)Ljava/nio/ByteBuffer;", "remaining", "I", "buffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "maskBuffer", "", "getHasRemaining", "()Z", "hasRemaining", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SimpleFrameCollector {
    private ByteBuffer buffer;
    private final ByteBuffer maskBuffer = ByteBuffer.allocate(4);
    private int remaining;

    public final boolean getHasRemaining() {
        return this.remaining > 0;
    }

    public final void handle(ByteBuffer bb) {
        l.f("bb", bb);
        int i7 = this.remaining;
        ByteBuffer byteBuffer = this.buffer;
        l.c(byteBuffer);
        this.remaining = i7 - NIOKt.moveTo(bb, byteBuffer, this.remaining);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(int r2, java.nio.ByteBuffer r3) {
        /*
            r1 = this;
            java.lang.String r0 = "bb"
            kotlin.jvm.internal.l.f(r0, r3)
            int r0 = r1.remaining
            if (r0 != 0) goto L2a
            r1.remaining = r2
            java.nio.ByteBuffer r0 = r1.buffer
            if (r0 == 0) goto L18
            kotlin.jvm.internal.l.c(r0)
            int r0 = r0.capacity()
            if (r0 >= r2) goto L1e
        L18:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.buffer = r2
        L1e:
            java.nio.ByteBuffer r2 = r1.buffer
            kotlin.jvm.internal.l.c(r2)
            r2.clear()
            r1.handle(r3)
            return
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "remaining should be 0"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.SimpleFrameCollector.start(int, java.nio.ByteBuffer):void");
    }

    public final ByteBuffer take(Integer maskKey) {
        ByteBuffer byteBuffer = this.buffer;
        l.c(byteBuffer);
        byteBuffer.flip();
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        if (maskKey != null) {
            this.maskBuffer.clear();
            this.maskBuffer.asIntBuffer().put(maskKey.intValue());
            this.maskBuffer.clear();
            l.c(byteBufferSlice);
            ByteBuffer byteBuffer2 = this.maskBuffer;
            l.e("maskBuffer", byteBuffer2);
            UtilsKt.xor(byteBufferSlice, byteBuffer2);
        }
        this.buffer = null;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferSlice.asReadOnlyBuffer();
        l.e("run(...)", byteBufferAsReadOnlyBuffer);
        return byteBufferAsReadOnlyBuffer;
    }
}
