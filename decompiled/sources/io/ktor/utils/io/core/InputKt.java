package io.ktor.utils.io.core;

import S5.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u0019\u0010\f\u001a\u00020\t*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010\r\"\u00020\u00002\u00020\u0000¨\u0006\u000e"}, d2 = {"LS5/n;", "Lio/ktor/utils/io/core/Input;", "", "buffer", "", "offset", "length", "readAvailable", "(LS5/n;[BII)I", "", "getEndOfInput", "(LS5/n;)Z", "endOfInput", "Input", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputKt {
    public static final boolean getEndOfInput(n nVar) {
        l.f("<this>", nVar);
        return nVar.z();
    }

    public static final int readAvailable(n nVar, byte[] bArr, int i7, int i8) {
        l.f("<this>", nVar);
        l.f("buffer", bArr);
        int iC = nVar.C(bArr, i7, i8 + i7);
        if (iC == -1) {
            return 0;
        }
        return iC;
    }

    public static /* synthetic */ int readAvailable$default(n nVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length - i7;
        }
        return readAvailable(nVar, bArr, i7, i8);
    }
}
