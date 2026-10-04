package r;

import D.C0066n;
import H.M;
import O.C0509o0;
import O.C0510p;
import Y.r;
import e4.InterfaceC0821a;
import e4.o;

/* loaded from: classes.dex */
public final class g {
    public final r a = new r();

    public static void b(g gVar, C0066n c0066n, boolean z7, InterfaceC0821a interfaceC0821a) {
        gVar.getClass();
        gVar.a.add(new W.a(true, 262103052, new B.c(c0066n, z7, interfaceC0821a)));
    }

    public final void a(C1859a c1859a, C0510p c0510p, int i7) {
        c0510p.T(1320309496);
        int i8 = (c0510p.f(c1859a) ? 4 : 2) | i7 | (c0510p.f(this) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            r rVar = this.a;
            int size = rVar.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((o) rVar.get(i9)).invoke(c1859a, c0510p, Integer.valueOf(i8 & 14));
            }
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new M(i7, 13, this, c1859a);
        }
    }
}
