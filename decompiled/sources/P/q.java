package P;

import O.C0517t;
import O.D0;
import y0.C2349D;

/* loaded from: classes.dex */
public final class q extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final q f7682c = new q(3, 0, 2);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        ((C2349D) lVar.f418n).I(sVar.d(0), sVar.d(1), sVar.d(2));
    }

    @Override // P.C
    public final String b(int i7) {
        return i7 == 0 ? "from" : i7 == 1 ? "to" : i7 == 2 ? "count" : super.b(i7);
    }
}
