package i0;

import m.AbstractC1489j;
import m.C1496q;

/* renamed from: i0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1024h {
    public static final C1496q a;

    static {
        C1033q c1033q = C1020d.f11869c;
        int i7 = c1033q.f11867c;
        C1021e c1021e = new C1021e(c1033q, c1033q, 1);
        C1028l c1028l = C1020d.f11886t;
        int i8 = c1028l.f11867c << 6;
        int i9 = c1033q.f11867c;
        int i10 = i8 | i9;
        C1023g c1023g = new C1023g(c1033q, c1028l, 0);
        int i11 = (i9 << 6) | c1028l.f11867c;
        C1023g c1023g2 = new C1023g(c1028l, c1033q, 0);
        C1496q c1496q = AbstractC1489j.a;
        C1496q c1496q2 = new C1496q();
        c1496q2.h(i7 | (i7 << 6), c1021e);
        c1496q2.h(i10, c1023g);
        c1496q2.h(i11, c1023g2);
        a = c1496q2;
    }
}
