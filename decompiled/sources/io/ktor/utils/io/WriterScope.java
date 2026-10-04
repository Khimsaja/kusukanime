package io.ktor.utils.io;

import H5.A;
import S3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LH5/A;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "LS3/h;", "coroutineContext", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/h;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WriterScope implements A {
    private final ByteWriteChannel channel;
    private final h coroutineContext;

    public WriterScope(ByteWriteChannel byteWriteChannel, h hVar) {
        l.f("channel", byteWriteChannel);
        l.f("coroutineContext", hVar);
        this.channel = byteWriteChannel;
        this.coroutineContext = hVar;
    }

    public final ByteWriteChannel getChannel() {
        return this.channel;
    }

    @Override // H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }
}
