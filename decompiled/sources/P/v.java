package P;

import O.C0517t;
import O.D0;
import e4.InterfaceC0821a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final v f7687c;

    static {
        int i7 = 1;
        f7687c = new v(0, i7, i7);
    }

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        ((ArrayList) c0517t.f7175e).add((InterfaceC0821a) sVar.e(0));
    }

    @Override // P.C
    public final String c(int i7) {
        return i7 == 0 ? "effect" : super.c(i7);
    }
}
