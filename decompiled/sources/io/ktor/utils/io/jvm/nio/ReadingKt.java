package io.ktor.utils.io.jvm.nio;

import H5.M;
import O5.d;
import O5.e;
import S3.h;
import S5.f;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.RawSourceChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "LS3/h;", "context", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/nio/channels/ReadableByteChannel;LS3/h;)Lio/ktor/utils/io/ByteReadChannel;", "LS5/f;", "asSource", "(Ljava/nio/channels/ReadableByteChannel;)LS5/f;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadingKt {
    public static final f asSource(ReadableByteChannel readableByteChannel) {
        l.f("<this>", readableByteChannel);
        return new ReadableByteChannelSource(readableByteChannel);
    }

    public static final ByteReadChannel toByteReadChannel(ReadableByteChannel readableByteChannel, h hVar) {
        l.f("<this>", readableByteChannel);
        l.f("context", hVar);
        return new RawSourceChannel(asSource(readableByteChannel), hVar);
    }

    public static ByteReadChannel toByteReadChannel$default(ReadableByteChannel readableByteChannel, h hVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            e eVar = M.a;
            hVar = d.f7623l;
        }
        return toByteReadChannel(readableByteChannel, hVar);
    }
}
