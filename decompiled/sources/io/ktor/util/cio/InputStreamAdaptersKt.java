package io.ktor.util.cio;

import H5.D;
import H5.InterfaceC0265f0;
import H5.M;
import O3.InterfaceC0554c;
import S3.h;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "LS3/h;", "context", "LH5/f0;", "parent", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/io/InputStream;Lio/ktor/utils/io/pool/ObjectPool;LS3/h;LH5/f0;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputStreamAdaptersKt {
    @InterfaceC0554c
    public static final ByteReadChannel toByteReadChannel(InputStream inputStream, ObjectPool<ByteBuffer> objectPool, h hVar, InterfaceC0265f0 interfaceC0265f0) {
        l.f("<this>", inputStream);
        l.f("pool", objectPool);
        l.f("context", hVar);
        l.f("parent", interfaceC0265f0);
        return ReadingKt.toByteReadChannel(inputStream, hVar.plus(interfaceC0265f0), objectPool);
    }

    public static ByteReadChannel toByteReadChannel$default(InputStream inputStream, ObjectPool objectPool, h hVar, InterfaceC0265f0 interfaceC0265f0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i7 & 2) != 0) {
            hVar = M.f3814b;
        }
        if ((i7 & 4) != 0) {
            interfaceC0265f0 = D.d();
        }
        return toByteReadChannel(inputStream, objectPool, hVar, interfaceC0265f0);
    }
}
