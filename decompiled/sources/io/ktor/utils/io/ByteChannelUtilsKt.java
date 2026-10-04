package io.ktor.utils.io;

import H5.InterfaceC0265f0;
import O3.C;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "LH5/f0;", "job", "LO3/C;", "attachJob", "(Lio/ktor/utils/io/ByteChannel;LH5/f0;)V", "Lio/ktor/utils/io/ChannelJob;", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/utils/io/ChannelJob;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteChannelUtilsKt {
    public static final void attachJob(ByteChannel byteChannel, InterfaceC0265f0 interfaceC0265f0) {
        l.f("<this>", byteChannel);
        l.f("job", interfaceC0265f0);
        interfaceC0265f0.x(new a(byteChannel, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C attachJob$lambda$0(ByteChannel byteChannel, Throwable th) {
        if (th != null) {
            byteChannel.cancel(th);
        }
        return C.a;
    }

    public static final void attachJob(ByteChannel byteChannel, ChannelJob channelJob) {
        l.f("<this>", byteChannel);
        l.f("job", channelJob);
        attachJob(byteChannel, channelJob.getJob());
    }
}
