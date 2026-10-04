package v;

import O.C0502l;
import O.C0510p;

/* loaded from: classes.dex */
public abstract class e0 {
    public static final f0 a = new f0(AbstractC2130i.a, a0.b.f10390t);

    public static final long a(int i7, int i8, int i9, boolean z7) {
        if (!z7) {
            return q0.c.a(i7, i8, 0, i9);
        }
        int iMin = Math.min(i7, 262142);
        int iMin2 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
        int iF = q0.c.f(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        return q0.c.a(iMin, iMin2, Math.min(iF, 0), i9 != Integer.MAX_VALUE ? Math.min(iF, i9) : Integer.MAX_VALUE);
    }

    public static final f0 b(InterfaceC2126e interfaceC2126e, a0.h hVar, C0510p c0510p, int i7) {
        if (kotlin.jvm.internal.l.a(interfaceC2126e, AbstractC2130i.a) && kotlin.jvm.internal.l.a(hVar, a0.b.f10390t)) {
            c0510p.R(-849081669);
            c0510p.p(false);
            return a;
        }
        c0510p.R(-849030798);
        boolean z7 = true;
        boolean z8 = (((i7 & 14) ^ 6) > 4 && c0510p.f(interfaceC2126e)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !c0510p.f(hVar)) && (i7 & 48) != 32) {
            z7 = false;
        }
        boolean z9 = z8 | z7;
        Object objH = c0510p.H();
        if (z9 || objH == C0502l.a) {
            objH = new f0(interfaceC2126e, hVar);
            c0510p.b0(objH);
        }
        f0 f0Var = (f0) objH;
        c0510p.p(false);
        return f0Var;
    }
}
