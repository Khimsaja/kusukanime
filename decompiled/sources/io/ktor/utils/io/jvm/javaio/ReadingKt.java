package io.ktor.utils.io.jvm.javaio;

import H5.M;
import O5.d;
import O5.e;
import S3.h;
import S5.b;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.pool.ByteArrayPoolKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "LS3/h;", "context", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/io/InputStream;LS3/h;Lio/ktor/utils/io/pool/ObjectPool;)Lio/ktor/utils/io/ByteReadChannel;", "", "toByteReadChannelWithArrayPool", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadingKt {
    public static final ByteReadChannel toByteReadChannel(InputStream inputStream, h hVar, ObjectPool<ByteBuffer> objectPool) {
        l.f("<this>", inputStream);
        l.f("context", hVar);
        l.f("pool", objectPool);
        return new RawSourceChannel(new b(inputStream), hVar);
    }

    public static ByteReadChannel toByteReadChannel$default(InputStream inputStream, h hVar, ObjectPool objectPool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            e eVar = M.a;
            hVar = d.f7623l;
        }
        return toByteReadChannel(inputStream, hVar, objectPool);
    }

    public static final ByteReadChannel toByteReadChannelWithArrayPool(InputStream inputStream, h hVar, ObjectPool<byte[]> objectPool) {
        l.f("<this>", inputStream);
        l.f("context", hVar);
        l.f("pool", objectPool);
        return new RawSourceChannel(new b(inputStream), hVar);
    }

    public static ByteReadChannel toByteReadChannelWithArrayPool$default(InputStream inputStream, h hVar, ObjectPool objectPool, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            e eVar = M.a;
            hVar = d.f7623l;
        }
        if ((i7 & 2) != 0) {
            objectPool = ByteArrayPoolKt.getByteArrayPool();
        }
        return toByteReadChannelWithArrayPool(inputStream, hVar, objectPool);
    }
}
