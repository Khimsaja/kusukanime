package io.ktor.utils.io.core;

import S5.a;
import S5.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LS5/a;", "", "count", "", "readBytes", "(LS5/a;I)[B", "", "isEmpty", "(LS5/a;)Z", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuffersKt {
    public static final boolean isEmpty(a aVar) {
        l.f("<this>", aVar);
        return aVar.f8784m == 0;
    }

    public static final byte[] readBytes(a aVar, int i7) {
        l.f("<this>", aVar);
        return p.i(aVar, i7);
    }

    public static byte[] readBytes$default(a aVar, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = (int) aVar.f8784m;
        }
        return readBytes(aVar, i7);
    }
}
