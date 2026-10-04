package io.ktor.util;

import S3.h;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lio/ktor/util/Identity;", "Lio/ktor/util/Encoder;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "source", "LS3/h;", "coroutineContext", "encode", "(Lio/ktor/utils/io/ByteReadChannel;LS3/h;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/h;)Lio/ktor/utils/io/ByteWriteChannel;", "decode", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Identity implements Encoder {
    public static final Identity INSTANCE = new Identity();

    private Identity() {
    }

    @Override // io.ktor.util.Encoder
    public ByteReadChannel decode(ByteReadChannel source, h coroutineContext) {
        l.f("source", source);
        l.f("coroutineContext", coroutineContext);
        return source;
    }

    @Override // io.ktor.util.Encoder
    public ByteReadChannel encode(ByteReadChannel source, h coroutineContext) {
        l.f("source", source);
        l.f("coroutineContext", coroutineContext);
        return source;
    }

    @Override // io.ktor.util.Encoder
    public ByteWriteChannel encode(ByteWriteChannel source, h coroutineContext) {
        l.f("source", source);
        l.f("coroutineContext", coroutineContext);
        return source;
    }
}
