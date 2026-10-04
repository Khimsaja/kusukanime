package io.ktor.utils.io;

import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function1;", "LS3/c;", "LO3/C;", "", "onClose", "(Lio/ktor/utils/io/ByteWriteChannel;Le4/k;)Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CloseHookByteWriteChannelKt {
    public static final ByteWriteChannel onClose(ByteWriteChannel byteWriteChannel, k kVar) {
        l.f("<this>", byteWriteChannel);
        l.f("onClose", kVar);
        return new CloseHookByteWriteChannel(byteWriteChannel, kVar);
    }
}
