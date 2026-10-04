package io.ktor.util;

import O3.C;
import io.ktor.utils.io.InternalAPI;
import io.ktor.utils.io.core.internal.ChunkBufferJvmKt;
import io.ktor.utils.io.core.internal.ChunkBufferKt;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "LS5/a;", "buffer", "", "read", "(Ljava/nio/channels/ReadableByteChannel;LS5/a;)I", "Ljava/nio/channels/WritableByteChannel;", "write", "(Ljava/nio/channels/WritableByteChannel;LS5/a;)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BufferViewJvmKt {
    public static final int read(ReadableByteChannel readableByteChannel, S5.a aVar) {
        l.f("<this>", readableByteChannel);
        l.f("buffer", aVar);
        if (ChunkBufferKt.getWriteRemaining(aVar) == 0) {
            return 0;
        }
        v vVar = new v();
        ChunkBufferJvmKt.writeDirect(aVar, 1, new a(2, vVar, readableByteChannel));
        return vVar.f12718k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C read$lambda$0(v vVar, ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        l.f("bb", byteBuffer);
        vVar.f12718k = readableByteChannel.read(byteBuffer);
        return C.a;
    }

    @InternalAPI
    public static final int write(WritableByteChannel writableByteChannel, S5.a aVar) {
        l.f("<this>", writableByteChannel);
        l.f("buffer", aVar);
        v vVar = new v();
        ChunkBufferJvmKt.readDirect(aVar, new a(1, vVar, writableByteChannel));
        return vVar.f12718k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C write$lambda$1(v vVar, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
        l.f("bb", byteBuffer);
        vVar.f12718k = writableByteChannel.write(byteBuffer);
        return C.a;
    }
}
