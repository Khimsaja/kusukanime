package P;

import O.C0517t;
import O.D0;

/* loaded from: classes.dex */
public final class g extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final g f7668c = new g(0, 1, 1);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        for (Object obj : (Object[]) sVar.e(0)) {
            lVar.r(obj);
        }
    }

    @Override // P.C
    public final String c(int i7) {
        return i7 == 0 ? "nodes" : super.c(i7);
    }
}
