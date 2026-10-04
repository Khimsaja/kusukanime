package v;

import O.C0502l;
import O.C0510p;

/* loaded from: classes.dex */
public abstract class r {
    public static final C2140t a = new C2140t(AbstractC2130i.f16445c, a0.b.f10393w);

    public static final C2140t a(InterfaceC2128g interfaceC2128g, a0.g gVar, C0510p c0510p, int i7) {
        if (kotlin.jvm.internal.l.a(interfaceC2128g, AbstractC2130i.f16445c) && gVar.equals(a0.b.f10393w)) {
            c0510p.R(345962472);
            c0510p.p(false);
            return a;
        }
        c0510p.R(346016319);
        boolean z7 = true;
        boolean z8 = (((i7 & 14) ^ 6) > 4 && c0510p.f(interfaceC2128g)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !c0510p.f(gVar)) && (i7 & 48) != 32) {
            z7 = false;
        }
        boolean z9 = z8 | z7;
        Object objH = c0510p.H();
        if (z9 || objH == C0502l.a) {
            objH = new C2140t(interfaceC2128g, gVar);
            c0510p.b0(objH);
        }
        C2140t c2140t = (C2140t) objH;
        c0510p.p(false);
        return c2140t;
    }

    public static final long b(int i7, int i8, int i9, boolean z7) {
        if (!z7) {
            return q0.c.a(0, i9, i7, i8);
        }
        int iMin = Math.min(i7, 262142);
        int iMin2 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
        int iF = q0.c.f(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        return q0.c.a(Math.min(iF, 0), i9 != Integer.MAX_VALUE ? Math.min(iF, i9) : Integer.MAX_VALUE, iMin, iMin2);
    }
}
