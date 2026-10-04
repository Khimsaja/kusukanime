package P;

import O.C0486d;
import O.C0517t;
import O.D0;

/* loaded from: classes.dex */
public final class j extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final j f7671c;

    static {
        int i7 = 0;
        f7671c = new j(i7, i7, 3);
    }

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        while (true) {
            int i7 = d02.f6987v;
            if ((i7 < 0 && d02.f6986u > 0) || i7 == 0) {
                break;
            }
            d02.D();
            if (C0486d.m(d02.f6967b, d02.p(d02.f6987v))) {
                lVar.U();
            }
            d02.i();
        }
        d02.i();
    }
}
