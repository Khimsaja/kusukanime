package io.ktor.utils.io;

import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class ByteChannel$writeBuffer$1 extends j implements k {
    public static final ByteChannel$writeBuffer$1 INSTANCE = new ByteChannel$writeBuffer$1();

    public ByteChannel$writeBuffer$1() {
        super(1, ClosedWriteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
    }

    @Override // e4.k
    public final ClosedWriteChannelException invoke(Throwable th) {
        return new ClosedWriteChannelException(th);
    }
}
