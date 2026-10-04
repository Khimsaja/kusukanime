package P;

import O.C0486d;
import O.C0517t;
import O.D0;

/* loaded from: classes.dex */
public final class u extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final u f7686c;

    static {
        int i7 = 0;
        f7686c = new u(i7, i7, 3);
    }

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        if (d02.f6979n != 0) {
            C0486d.w("Cannot reset when inserting");
            throw null;
        }
        d02.z();
        d02.f6985t = 0;
        d02.f6986u = d02.m() - d02.f6973h;
        d02.f6974i = 0;
        d02.f6975j = 0;
        d02.f6980o = 0;
    }
}
