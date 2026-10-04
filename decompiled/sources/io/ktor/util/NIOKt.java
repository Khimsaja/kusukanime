package io.ktor.util;

import io.ktor.http.ContentDisposition;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljava/nio/ByteBuffer;", "destination", "", "limit", "moveTo", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I", "", "moveToByteArray", "(Ljava/nio/ByteBuffer;)[B", "Ljava/nio/charset/Charset;", HttpAuthHeader.Parameters.Charset, "", "decodeString", "(Ljava/nio/ByteBuffer;Ljava/nio/charset/Charset;)Ljava/lang/String;", ContentDisposition.Parameters.Size, "copy", "(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/pool/ObjectPool;I)Ljava/nio/ByteBuffer;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NIOKt {
    public static final ByteBuffer copy(ByteBuffer byteBuffer, int i7) {
        l.f("<this>", byteBuffer);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i7);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        l.e("slice(...)", byteBufferSlice);
        l.c(byteBufferAllocate);
        moveTo$default(byteBufferSlice, byteBufferAllocate, 0, 2, null);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static /* synthetic */ ByteBuffer copy$default(ByteBuffer byteBuffer, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = byteBuffer.remaining();
        }
        return copy(byteBuffer, i7);
    }

    public static final String decodeString(ByteBuffer byteBuffer, Charset charset) {
        l.f("<this>", byteBuffer);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        String string = charset.decode(byteBuffer).toString();
        l.e("toString(...)", string);
        return string;
    }

    public static /* synthetic */ String decodeString$default(ByteBuffer byteBuffer, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        return decodeString(byteBuffer, charset);
    }

    public static final int moveTo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i7) {
        l.f("<this>", byteBuffer);
        l.f("destination", byteBuffer2);
        int iMin = Math.min(i7, Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        if (iMin == byteBuffer.remaining()) {
            byteBuffer2.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    public static /* synthetic */ int moveTo$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return moveTo(byteBuffer, byteBuffer2, i7);
    }

    public static final byte[] moveToByteArray(ByteBuffer byteBuffer) {
        l.f("<this>", byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static /* synthetic */ ByteBuffer copy$default(ByteBuffer byteBuffer, ObjectPool objectPool, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = byteBuffer.remaining();
        }
        return copy(byteBuffer, objectPool, i7);
    }

    public static final ByteBuffer copy(ByteBuffer byteBuffer, ObjectPool<ByteBuffer> objectPool, int i7) {
        l.f("<this>", byteBuffer);
        l.f("pool", objectPool);
        ByteBuffer byteBufferBorrow = objectPool.borrow();
        byteBufferBorrow.limit(i7);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        l.e("slice(...)", byteBufferSlice);
        moveTo$default(byteBufferSlice, byteBufferBorrow, 0, 2, null);
        byteBufferBorrow.flip();
        return byteBufferBorrow;
    }
}
