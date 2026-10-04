package p;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.R0;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f1.AbstractC0870c;

/* renamed from: p.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1751g {
    public static final C1752g0 a = AbstractC1745d.p(7, null);

    static {
        Object obj = J0.a;
        AbstractC0870c.F(0.5f, 0.5f);
        AbstractC0832b.e(0.5f, 0.5f);
    }

    public static final R0 a(float f5, A0 a02, C0510p c0510p) {
        InterfaceC1715B interfaceC1715B;
        if (a02 == a) {
            c0510p.R(1125598679);
            boolean zC = c0510p.c(0.01f);
            Object objH = c0510p.H();
            if (zC || objH == C0502l.a) {
                objH = AbstractC1745d.p(3, Float.valueOf(0.01f));
                c0510p.b0(objH);
            }
            c0510p.p(false);
            interfaceC1715B = (C1752g0) objH;
        } else {
            c0510p.R(1125708605);
            c0510p.p(false);
            interfaceC1715B = a02;
        }
        return b(Float.valueOf(f5), C0.a, interfaceC1715B, Float.valueOf(0.01f), "FloatAnimation", c0510p, 0, 0);
    }

    public static final R0 b(Object obj, B0 b02, InterfaceC1760l interfaceC1760l, Float f5, String str, C0510p c0510p, int i7, int i8) {
        Object obj2 = C0502l.a;
        if ((i8 & 8) != 0) {
            f5 = null;
        }
        Object objH = c0510p.H();
        if (objH == obj2) {
            objH = C0486d.K(null, O.T.f7049p);
            c0510p.b0(objH);
        }
        O.Z z7 = (O.Z) objH;
        Object objH2 = c0510p.H();
        if (objH2 == obj2) {
            objH2 = new C1743c(obj, b02, f5);
            c0510p.b0(objH2);
        }
        C1743c c1743c = (C1743c) objH2;
        O.Z zN = C0486d.N(null, c0510p);
        if (f5 != null && (interfaceC1760l instanceof C1752g0)) {
            C1752g0 c1752g0 = (C1752g0) interfaceC1760l;
            if (!kotlin.jvm.internal.l.a(c1752g0.f14016c, f5)) {
                interfaceC1760l = new C1752g0(c1752g0.a, c1752g0.f14015b, f5);
            }
        }
        O.Z zN2 = C0486d.N(interfaceC1760l, c0510p);
        Object objH3 = c0510p.H();
        if (objH3 == obj2) {
            objH3 = P3.F.a(-1, 6, null);
            c0510p.b0(objH3);
        }
        J5.i iVar = (J5.i) objH3;
        boolean zH = c0510p.h(iVar) | c0510p.h(obj);
        Object objH4 = c0510p.H();
        if (zH || objH4 == obj2) {
            objH4 = new A.m(10, iVar, obj);
            c0510p.b0(objH4);
        }
        C0486d.g((InterfaceC0821a) objH4, c0510p);
        boolean zH2 = c0510p.h(iVar) | c0510p.h(c1743c) | c0510p.f(zN2) | c0510p.f(zN);
        Object objH5 = c0510p.H();
        if (zH2 || objH5 == obj2) {
            Object c1749f = new C1749f(iVar, c1743c, zN2, zN, null);
            c0510p.b0(c1749f);
            objH5 = c1749f;
        }
        C0486d.e(c0510p, (e4.n) objH5, iVar);
        R0 r02 = (R0) z7.getValue();
        return r02 == null ? c1743c.f13958c : r02;
    }
}
