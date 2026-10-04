package io.ktor.websocket.internals;

import S5.a;
import S5.j;
import S5.n;
import S5.p;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LS5/n;", "", "data", "", "endsWith", "(LS5/n;[B)Z", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BytePacketUtilsKt {
    public static final boolean endsWith(n nVar, byte[] bArr) {
        l.f("<this>", nVar);
        l.f("data", bArr);
        a aVarA = nVar.a();
        a aVar = new a();
        if (aVarA.f8784m != 0) {
            j jVar = aVarA.f8782k;
            l.c(jVar);
            j jVarF = jVar.f();
            aVar.f8782k = jVarF;
            aVar.f8783l = jVarF;
            for (j jVar2 = jVar.f8805f; jVar2 != null; jVar2 = jVar2.f8805f) {
                j jVar3 = aVar.f8783l;
                l.c(jVar3);
                j jVarF2 = jVar2.f();
                jVar3.e(jVarF2);
                aVar.f8783l = jVarF2;
            }
            aVar.f8784m = aVarA.f8784m;
        }
        ByteReadPacketKt.discard(aVar, ByteReadPacketKt.getRemaining(aVar) - bArr.length);
        return Arrays.equals(p.j(aVar, -1), bArr);
    }
}
