package v3;

import D.S;
import L.C0349a1;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O.T;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f.AbstractC0847h;
import h0.AbstractC0968M;
import java.util.List;
import t3.C2044b;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2127f;
import v.C2140t;
import v.Z;
import v.e0;
import v.f0;
import w.C2164e;
import x.C2231e;
import x.C2233g;
import x.C2237k;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z.C2425d;
import z.G;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2152b {
    public static final W.a a = new W.a(false, 1740967479, new io.ktor.http.cio.b(25));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f16529b = new W.a(false, 1519149842, new io.ktor.http.cio.b(26));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f16530c;

    static {
        new W.a(false, -1762183960, new io.ktor.http.cio.b(27));
        new W.a(false, 2055858152, new io.ktor.http.cio.b(28));
        new W.a(false, 1298117886, new io.ktor.http.cio.b(29));
        new W.a(false, -1853830051, new C2151a(0));
        new W.a(false, 206476844, new C2151a(1));
        f16530c = new W.a(false, -707081140, new C2151a(2));
    }

    public static final void a(List list, e4.k kVar, C0510p c0510p, int i7) {
        c0510p.T(-2018839028);
        int i8 = (c0510p.h(list) ? 4 : 2) | i7 | (c0510p.h(kVar) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            Z zA = androidx.compose.foundation.layout.a.a(12, 2);
            C2127f c2127fG = AbstractC2130i.g(10);
            a0.q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), 96);
            boolean zH = ((i8 & 112) == 32) | c0510p.h(list);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                objH = new C2044b(list, kVar, 3);
                c0510p.b0(objH);
            }
            AbstractC0847h.b(qVarE, null, zA, c2127fG, null, null, false, (e4.k) objH, c0510p, 24966, 234);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new c(list, kVar, i7, 2);
        }
    }

    public static final void b(List list, e4.k kVar, C0510p c0510p, int i7) {
        c0510p.T(-422290017);
        int i8 = (c0510p.h(list) ? 4 : 2) | i7 | (c0510p.h(kVar) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            Z zA = androidx.compose.foundation.layout.a.a(12, 2);
            C2127f c2127fG = AbstractC2130i.g(10);
            a0.q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), 178);
            boolean zH = ((i8 & 112) == 32) | c0510p.h(list);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                objH = new C2044b(list, kVar, 1);
                c0510p.b0(objH);
            }
            AbstractC0847h.b(qVarE, null, zA, c2127fG, null, null, false, (e4.k) objH, c0510p, 24966, 234);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new c(list, kVar, i7, 0);
        }
    }

    public static final void c(List list, e4.k kVar, C0510p c0510p, int i7) {
        c0510p.T(-1773981067);
        int i8 = (c0510p.h(list) ? 4 : 2) | i7 | (c0510p.h(kVar) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            Z zA = androidx.compose.foundation.layout.a.a(12, 2);
            C2127f c2127fG = AbstractC2130i.g(8);
            a0.q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), 38);
            boolean zH = ((i8 & 112) == 32) | c0510p.h(list);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                objH = new C2044b(list, kVar, 2);
                c0510p.b0(objH);
            }
            AbstractC0847h.b(qVarE, null, zA, c2127fG, null, null, false, (e4.k) objH, c0510p, 24966, 234);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new c(list, kVar, i7, 1);
        }
    }

    public static final void d(List list, e4.k kVar, C0510p c0510p, int i7) {
        int i8;
        int i9;
        long j7;
        C0510p c0510p2 = c0510p;
        c0510p2.T(-1141321162);
        if ((((c0510p2.h(list) ? 4 : 2) | i7 | (c0510p2.h(kVar) ? 32 : 16)) & 19) == 18 && c0510p2.y()) {
            c0510p2.M();
            i8 = 3;
        } else {
            boolean zH = c0510p2.h(list);
            Object objH = c0510p2.H();
            Object obj = C0502l.a;
            if (zH || objH == obj) {
                objH = new P3.w(4, list);
                c0510p2.b0(objH);
            }
            InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
            float f5 = G.a;
            Object[] objArr = new Object[0];
            L2.e eVar = C2425d.f18447H;
            boolean zD = c0510p2.d(0) | c0510p2.c(0.0f) | c0510p2.f(interfaceC0821a);
            Object objH2 = c0510p2.H();
            if (zD || objH2 == obj) {
                objH2 = new C0349a1(interfaceC0821a, 3);
                c0510p2.b0(objH2);
            }
            C2425d c2425d = (C2425d) z1.c.F(objArr, eVar, (InterfaceC0821a) objH2, c0510p2, 0, 4);
            c2425d.f18448G.setValue(interfaceC0821a);
            boolean zD2 = c0510p2.d(list.size());
            Object objH3 = c0510p2.H();
            if (zD2 || objH3 == obj) {
                objH3 = C0486d.K(Boolean.FALSE, T.f7049p);
                c0510p2.b0(objH3);
            }
            O.Z z7 = (O.Z) objH3;
            Integer numValueOf = Integer.valueOf(list.size());
            Boolean bool = (Boolean) z7.getValue();
            bool.booleanValue();
            boolean zH2 = c0510p2.h(list) | c0510p2.f(z7) | c0510p2.f(c2425d);
            Object objH4 = c0510p2.H();
            if (zH2 || objH4 == obj) {
                objH4 = new i(list, c2425d, z7, null);
                c0510p2.b0(objH4);
            }
            C0486d.f(numValueOf, bool, (e4.n) objH4, c0510p2);
            a0.n nVar = a0.n.a;
            a0.q qVarD = androidx.compose.foundation.layout.c.d(nVar, 1.0f);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i10 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarD);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h, c2140tA);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            a0.q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 230);
            Integer numValueOf2 = Integer.valueOf(list.size());
            boolean zF = c0510p2.f(z7);
            Object objH5 = c0510p2.H();
            if (zF || objH5 == obj) {
                objH5 = new k(z7, null);
                c0510p2.b0(objH5);
            }
            W.a aVarB = W.f.b(993945630, new d(0, list, kVar), c0510p2);
            c0510p2 = c0510p;
            AbstractC0832b.c(c2425d, s0.w.a(qVarE, numValueOf2, (e4.n) objH5), androidx.compose.foundation.layout.a.a(12, 2), null, 10, null, null, false, null, null, aVarB, c0510p2, 196992);
            a0.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 0.0f, 8, 1);
            f0 f0VarB = e0.b(AbstractC2130i.f16446d, a0.b.f10390t, c0510p2, 6);
            int i11 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, qVarJ);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, f0VarB);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p2, i11, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            c0510p2.R(-2068712844);
            int size = list.size();
            int i12 = 0;
            while (i12 < size) {
                boolean z8 = i12 == c2425d.j();
                a0.q qVarO = q0.c.o(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.a.j(nVar, 3, 0.0f, 2), z8 ? 18 : 6), 6), C.e.a);
                if (z8) {
                    c0510p2.R(-1336549069);
                    j7 = ((N) c0510p2.k(P.a)).a;
                    i9 = 0;
                    c0510p2.p(false);
                } else {
                    i9 = 0;
                    c0510p2.R(-1336546909);
                    j7 = ((N) c0510p2.k(P.a)).f5231H;
                    c0510p2.p(false);
                }
                AbstractC2136o.a(androidx.compose.foundation.a.b(qVarO, j7, AbstractC0968M.a), c0510p2, i9);
                i12++;
            }
            i8 = 3;
            c0510p2.p(false);
            c0510p2.p(true);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new c(list, kVar, i7, i8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.util.List r26, final boolean r27, final java.lang.String r28, final x.v r29, final e4.k r30, final e4.InterfaceC0821a r31, final java.util.List r32, final W.a r33, final W.a r34, final W.a r35, final W.a r36, final W.a r37, O.C0510p r38, final int r39) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.AbstractC2152b.e(java.util.List, boolean, java.lang.String, x.v, e4.k, e4.a, java.util.List, W.a, W.a, W.a, W.a, W.a, O.p, int):void");
    }

    public static final void f(String str, String str2, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        int i8;
        InterfaceC0821a interfaceC0821a2 = interfaceC0821a;
        C0510p c0510p2 = c0510p;
        c0510p2.T(-1626266506);
        if ((i7 & 6) == 0) {
            i8 = (c0510p2.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p2.f(str2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p2.h(interfaceC0821a2) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
        } else {
            a0.n nVar = a0.n.a;
            a0.q qVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 16, 12, 4, 8);
            f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
            int i9 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarK);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h, f0VarB);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p2, i9, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i10 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, layoutWeightElement);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, c2140tA);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            S0 s02 = N2.a;
            int i11 = i8;
            H2.b("Kusukanime", null, 0L, 0L, M0.u.f6418r, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s02)).f5214f, c0510p, 196614, 0, 65502);
            AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.e(nVar, 2));
            H2.b(str2 + ", " + (str == null ? "Kusufans" : str), null, ((N) c0510p.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M2) c0510p.k(s02)).f5219k, c0510p, 0, 3120, 55290);
            c0510p2 = c0510p;
            c0510p2.p(true);
            interfaceC0821a2 = interfaceC0821a;
            E0.f(interfaceC0821a2, null, false, null, a, c0510p2, ((i11 >> 6) & 14) | 196608, 30);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D3.b(str, str2, interfaceC0821a2, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(e4.k r29, e4.k r30, e4.InterfaceC0821a r31, v3.z r32, O.C0510p r33, int r34) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.AbstractC2152b.g(e4.k, e4.k, e4.a, v3.z, O.p, int):void");
    }

    public static final void h(List list, e4.k kVar, C0510p c0510p, int i7) {
        c0510p.T(482921053);
        int i8 = (c0510p.h(list) ? 4 : 2) | i7 | (c0510p.h(kVar) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            Z zA = androidx.compose.foundation.layout.a.a(12, 2);
            C2127f c2127fG = AbstractC2130i.g(10);
            a0.q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), 112);
            boolean zH = ((i8 & 112) == 32) | c0510p.h(list);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                objH = new C2044b(list, kVar, 4);
                c0510p.b0(objH);
            }
            AbstractC0847h.b(qVarE, null, zA, c2127fG, null, null, false, (e4.k) objH, c0510p, 24966, 234);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new c(list, kVar, i7, 4);
        }
    }

    public static final void i(C2233g c2233g, W.a aVar) {
        s3.T t7 = new s3.T(10);
        W.a aVar2 = new W.a(true, -1836464053, new A3.g(7, aVar));
        c2233g.getClass();
        c2233g.f17207b.b(1, new C2231e(null, new S(23, t7), new C2237k(1, 3), new W.a(true, -34608120, new C2164e(1, aVar2))));
        c2233g.f17208c = true;
    }
}
