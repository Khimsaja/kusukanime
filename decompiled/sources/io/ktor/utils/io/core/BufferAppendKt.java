package io.ktor.utils.io.core;

import O3.InterfaceC0554c;
import S5.a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LS5/a;", "other", "", "maxSize", "writeBufferAppend", "(LS5/a;LS5/a;I)I", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BufferAppendKt {
    @InterfaceC0554c
    public static final int writeBufferAppend(a aVar, a aVar2, int i7) {
        l.f("<this>", aVar);
        l.f("other", aVar2);
        long jMin = Math.min(aVar2.f8784m, i7);
        aVar.write(aVar2, jMin);
        return (int) jMin;
    }
}
