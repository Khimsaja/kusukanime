package o;

import O.C0502l;
import O.C0510p;
import O.R0;
import h0.C0998u;
import i0.AbstractC1019c;
import p.A0;
import p.AbstractC1745d;
import p.AbstractC1751g;
import p.B0;
import p.C0;
import p.C1752g0;
import p.InterfaceC1715B;

/* renamed from: o.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1599K {
    public static final C1752g0 a = AbstractC1745d.p(7, null);

    public static final R0 a(long j7, A0 a02, C0510p c0510p, int i7, int i8) {
        InterfaceC1715B interfaceC1715B = a02;
        if ((i8 & 2) != 0) {
            interfaceC1715B = a;
        }
        InterfaceC1715B interfaceC1715B2 = interfaceC1715B;
        String str = (i8 & 4) != 0 ? "ColorAnimation" : "epCell";
        boolean zF = c0510p.f(C0998u.f(j7));
        Object objH = c0510p.H();
        if (zF || objH == C0502l.a) {
            AbstractC1019c abstractC1019cF = C0998u.f(j7);
            C1618p c1618p = C1618p.f13527n;
            C1622t c1622t = new C1622t(0, abstractC1019cF);
            B0 b02 = C0.a;
            B0 b03 = new B0(c1618p, c1622t);
            c0510p.b0(b03);
            objH = b03;
        }
        return AbstractC1751g.b(new C0998u(j7), (B0) objH, interfaceC1715B2, null, str, c0510p, ((i7 << 3) & 896) | ((i7 << 6) & 57344), 8);
    }
}
