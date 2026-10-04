package io.ktor.utils.io.core;

import S5.l;
import S5.p;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LS5/l;", "Ljava/nio/ByteBuffer;", "buffer", "LO3/C;", "writeFully", "(LS5/l;Ljava/nio/ByteBuffer;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BytePacketBuilderExtensions_jvmKt {
    public static final void writeFully(l lVar, ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("<this>", lVar);
        kotlin.jvm.internal.l.f("buffer", byteBuffer);
        p.m(lVar.a(), byteBuffer);
    }
}
