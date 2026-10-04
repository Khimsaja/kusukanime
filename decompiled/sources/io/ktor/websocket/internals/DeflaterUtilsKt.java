package io.ktor.websocket.internals;

import S5.a;
import S5.p;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljava/util/zip/Deflater;", "", "data", "deflateFully", "(Ljava/util/zip/Deflater;[B)[B", "Ljava/util/zip/Inflater;", "inflateFully", "(Ljava/util/zip/Inflater;[B)[B", "LS5/l;", "deflater", "Ljava/nio/ByteBuffer;", "buffer", "", "flush", "", "deflateTo", "(LS5/l;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Z)I", "PADDED_EMPTY_CHUNK", "[B", "EMPTY_CHUNK", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeflaterUtilsKt {
    private static final byte[] PADDED_EMPTY_CHUNK = {0, 0, 0, -1, -1};
    private static final byte[] EMPTY_CHUNK = {0, 0, -1, -1};

    public static final byte[] deflateFully(Deflater deflater, byte[] bArr) {
        l.f("<this>", deflater);
        l.f("data", bArr);
        deflater.setInput(bArr);
        a aVar = new a();
        ObjectPool<ByteBuffer> ktorDefaultPool = ByteBufferPoolKt.getKtorDefaultPool();
        ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
        try {
            ByteBuffer byteBuffer = byteBufferBorrow;
            while (!deflater.needsInput()) {
                deflateTo(aVar, deflater, byteBuffer, false);
            }
            do {
            } while (deflateTo(aVar, deflater, byteBuffer, true) != 0);
            ktorDefaultPool.recycle(byteBufferBorrow);
            if (BytePacketUtilsKt.endsWith(aVar, PADDED_EMPTY_CHUNK)) {
                return p.i(aVar, ((int) ByteReadPacketKt.getRemaining(aVar)) - EMPTY_CHUNK.length);
            }
            a aVar2 = new a();
            BytePacketBuilderKt.writePacket(aVar2, aVar);
            aVar2.D((byte) 0);
            return p.j(aVar2, -1);
        } catch (Throwable th) {
            ktorDefaultPool.recycle(byteBufferBorrow);
            throw th;
        }
    }

    private static final int deflateTo(S5.l lVar, Deflater deflater, ByteBuffer byteBuffer, boolean z7) {
        byteBuffer.clear();
        int iDeflate = z7 ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        BytePacketBuilderExtensions_jvmKt.writeFully(lVar, byteBuffer);
        return iDeflate;
    }

    public static final byte[] inflateFully(Inflater inflater, byte[] bArr) {
        l.f("<this>", inflater);
        l.f("data", bArr);
        byte[] bArr2 = EMPTY_CHUNK;
        l.f("elements", bArr2);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        l.c(bArrCopyOf);
        inflater.setInput(bArrCopyOf);
        a aVar = new a();
        ObjectPool<ByteBuffer> ktorDefaultPool = ByteBufferPoolKt.getKtorDefaultPool();
        ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
        try {
            ByteBuffer byteBuffer = byteBufferBorrow;
            long length3 = bArrCopyOf.length + inflater.getBytesRead();
            while (inflater.getBytesRead() < length3) {
                byteBuffer.clear();
                byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                byteBuffer.flip();
                BytePacketBuilderExtensions_jvmKt.writeFully(aVar, byteBuffer);
            }
            ktorDefaultPool.recycle(byteBufferBorrow);
            return p.j(aVar, -1);
        } catch (Throwable th) {
            ktorDefaultPool.recycle(byteBufferBorrow);
            throw th;
        }
    }
}
