package D3;

import A3.C0007b;
import B3.C0027c;
import H0.I;
import L.AbstractC0384j0;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.Q1;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O.T;
import O3.C;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import h0.AbstractC0968M;
import h0.C0961F;
import h0.C0998u;
import io.ktor.http.ContentType;
import io.ktor.http.LinkHeader;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.e0;
import v.f0;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public abstract class f {
    public static final W.a a = new W.a(false, 1181807466, new C0007b(18));

    public static final void a(String str, String str2, a0.q qVar, C0510p c0510p, int i7) {
        boolean z7;
        C0510p c0510p2;
        c0510p.T(-1754768944);
        int i8 = i7 | (c0510p.f(str) ? 4 : 2) | (c0510p.f(str2) ? 32 : 16) | 3072;
        if ((i8 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
            c0510p2 = c0510p;
        } else {
            a0.n nVar = a0.n.a;
            a0.q qVarJ = androidx.compose.foundation.layout.c.j(nVar, 72);
            C.d dVar = C.e.a;
            a0.q qVarO = q0.c.o(qVarJ, dVar);
            a0.i iVar = a0.b.f10385o;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarO);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, interfaceC2173HE);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            if (str == null || AbstractC2510o.g0(str)) {
                c0510p.R(206863632);
                a0.q qVarA = androidx.compose.foundation.a.a(q0.c.o(androidx.compose.foundation.layout.c.f10591c, dVar), new C0961F(P3.r.I(new C0998u(a.a), new C0998u(a.f1424b)), null, 0L, 9187343241974906880L));
                InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar, false);
                int i10 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
                a0.q qVarC2 = a0.a.c(c0510p, qVarA);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE2);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i10))) {
                    AbstractC0703b.u(i10, c0510p, i10, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC2);
                qVar = nVar;
                z7 = true;
                H2.b(str2, null, C0998u.f11830c, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p.k(N2.a)).f5214f, c0510p, ((i8 >> 3) & 14) | 384, 0, 65530);
                c0510p2 = c0510p;
                c0510p2.p(true);
                c0510p2.p(false);
            } else {
                c0510p.R(206605371);
                T2.q.b(str, "Foto profil", q0.c.o(androidx.compose.foundation.layout.c.f10591c, dVar), c0510p, (i8 & 14) | 1572912);
                c0510p.p(false);
                c0510p2 = c0510p;
                qVar = nVar;
                z7 = true;
            }
            c0510p2.p(z7);
        }
        a0.q qVar2 = qVar;
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new i(str, str2, qVar2, i7, 0);
        }
    }

    public static final void b(final String str, float f5, final InterfaceC0821a interfaceC0821a, final String str2, C0510p c0510p, final int i7) {
        int i8;
        float f7;
        C0510p c0510p2 = c0510p;
        kotlin.jvm.internal.l.f("onClick", interfaceC0821a);
        c0510p2.T(1338516201);
        int i9 = i7 | (c0510p2.f(str) ? 4 : 2) | (c0510p2.c(f5) ? 32 : 16) | (c0510p2.h(interfaceC0821a) ? 256 : 128) | 3072;
        if ((i9 & 9363) == 9362 && c0510p2.y()) {
            c0510p2.M();
            f7 = f5;
        } else {
            a0.n nVar = a0.n.a;
            float f8 = 16;
            a0.q qVarI = androidx.compose.foundation.layout.a.i(k(androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 64, 0.0f, 2), interfaceC0821a), f8, 10);
            f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
            int i10 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarI);
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
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            a0.q qVarO = q0.c.o(androidx.compose.foundation.layout.c.j(nVar, 44), C.e.b(12));
            S0 s02 = P.a;
            a0.q qVarB = androidx.compose.foundation.a.b(qVarO, ((N) c0510p2.k(s02)).f5230G, AbstractC0968M.a);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
            int i11 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, qVarB);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, interfaceC2173HE);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p2, i11, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            c0510p2.R(1885746261);
            AbstractC0384j0.a(g.f1441b, null, androidx.compose.foundation.layout.c.j(nVar, 20), ((N) c0510p2.k(s02)).a, c0510p2, 438, 0);
            c0510p2.p(false);
            c0510p2.p(true);
            AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.n(f8));
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C2140t c2140tA = v.r.a(AbstractC2130i.g(5), a0.b.f10393w, c0510p2, 6);
            int i12 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M3 = c0510p2.m();
            a0.q qVarC3 = a0.a.c(c0510p2, layoutWeightElement);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, c2140tA);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M3);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i12))) {
                AbstractC0703b.u(i12, c0510p2, i12, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC3);
            S0 s03 = N2.a;
            H2.b(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M2) c0510p2.k(s03)).f5218j, c0510p, i9 & 14, 3120, 55294);
            c0510p2 = c0510p;
            if (str2 == null || AbstractC2510o.g0(str2)) {
                i8 = -611021953;
                c0510p2.R(-611021953);
            } else {
                c0510p2.R(-605559474);
                I i13 = ((M2) c0510p2.k(s03)).f5223o;
                i8 = -611021953;
                H2.b(str2, null, ((N) c0510p2.k(s02)).f5260s, 0L, null, 0L, null, 0L, 2, false, 1, 0, i13, c0510p, 6, 3120, 55290);
                c0510p2 = c0510p;
            }
            c0510p2.p(false);
            if (f5 > 0.0f) {
                c0510p2.R(673212473);
                f7 = f5;
                e(f7, androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 4), c0510p2, ((i9 >> 3) & 14) | 48);
            } else {
                f7 = f5;
                c0510p2.R(i8);
            }
            c0510p2.p(false);
            c0510p2.p(true);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            final float f9 = f7;
            c0509o0S.f7111d = new e4.n(str, f9, interfaceC0821a, str2, i7) { // from class: D3.h

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ String f1448k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ float f1449l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f1450m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ String f1451n;

                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0486d.V(24577);
                    String str3 = this.f1448k;
                    InterfaceC0821a interfaceC0821a2 = this.f1450m;
                    String str4 = this.f1451n;
                    f.b(str3, this.f1449l, interfaceC0821a2, str4, (C0510p) obj, iV);
                    return C.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(n0.C1538e r33, java.lang.String r34, java.lang.String r35, a0.q r36, java.lang.String r37, e4.InterfaceC0821a r38, O.C0510p r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.f.c(n0.e, java.lang.String, java.lang.String, a0.q, java.lang.String, e4.a, O.p, int, int):void");
    }

    public static final void d(String str, InterfaceC0821a interfaceC0821a, a0.q qVar, C0510p c0510p, int i7) {
        int i8;
        a0.q qVar2;
        C0510p c0510p2 = c0510p;
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        kotlin.jvm.internal.l.f("onRetry", interfaceC0821a);
        c0510p2.T(1479616470);
        if ((i7 & 6) == 0) {
            i8 = i7 | (c0510p2.f(str) ? 4 : 2);
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p2.h(interfaceC0821a) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if ((i9 & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
            qVar2 = qVar;
        } else {
            a0.n nVar = a0.n.a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
            int i10 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, fillElement);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h, interfaceC2173HE);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            a0.g gVar = a0.b.f10394x;
            a0.q qVarH = androidx.compose.foundation.layout.a.h(nVar, 28);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, gVar, c0510p2, 48);
            int i11 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, qVarH);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, c2140tA);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p2, i11, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            S0 s02 = N2.a;
            I i12 = ((M2) c0510p2.k(s02)).f5217i;
            S0 s03 = P.a;
            H2.b("Gagal memuat", null, ((N) c0510p2.k(s03)).f5264w, 0L, null, 0L, null, 0L, 0, false, 0, 0, i12, c0510p, 6, 0, 65530);
            AbstractC2136o.a(androidx.compose.foundation.layout.c.e(nVar, 6), c0510p, 6);
            H2.b(str, null, ((N) c0510p.k(s03)).f5260s, 0L, null, 0L, null, 0L, 2, false, 3, 0, ((M2) c0510p.k(s02)).f5220l, c0510p, i9 & 14, 3120, 55290);
            c0510p2 = c0510p;
            AbstractC2136o.a(androidx.compose.foundation.layout.c.e(nVar, 16), c0510p2, 6);
            E0.b(interfaceC0821a, null, false, null, null, null, null, null, a, c0510p2, ((i9 >> 3) & 14) | 805306368, 510);
            c0510p2.p(true);
            c0510p2.p(true);
            qVar2 = nVar;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new b(str, interfaceC0821a, qVar2, i7, 0);
        }
    }

    public static final void e(final float f5, final a0.q qVar, C0510p c0510p, final int i7) {
        int i8;
        c0510p.T(-1207194610);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.c(f5) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(qVar) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            boolean z7 = (i8 & 14) == 4;
            Object objH = c0510p.H();
            T t7 = C0502l.a;
            if (z7 || objH == t7) {
                objH = new InterfaceC0821a() { // from class: D3.j
                    @Override // e4.InterfaceC0821a
                    public final Object invoke() {
                        return Float.valueOf(e3.c.j(f5, 0.0f, 1.0f));
                    }
                };
                c0510p.b0(objH);
            }
            InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
            a0.q qVarO = q0.c.o(qVar, C.e.a());
            S0 s02 = P.a;
            long j7 = ((N) c0510p.k(s02)).a;
            long j8 = ((N) c0510p.k(s02)).f5231H;
            float f7 = 0;
            Object objH2 = c0510p.H();
            if (objH2 == t7) {
                objH2 = new A3.e(9);
                c0510p.b0(objH2);
            }
            Q1.b(interfaceC0821a, qVarO, j7, j8, 1, f7, (e4.k) objH2, c0510p, 1769472, 0);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e4.n() { // from class: D3.k
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0486d.V(i7 | 1);
                    f.e(f5, qVar, (C0510p) obj, iV);
                    return C.a;
                }
            };
        }
    }

    public static final void f(String str, String str2, a0.n nVar, C0510p c0510p, int i7) {
        C0510p c0510p2 = c0510p;
        c0510p2.T(512183541);
        if (((i7 | (c0510p2.f(str2) ? 32 : 16) | 384) & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
        } else {
            a0.n nVar2 = a0.n.a;
            a0.q qVarD = androidx.compose.foundation.layout.c.d(nVar2, 1.0f);
            S0 s02 = P.a;
            a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.a(qVarD, new C0961F(P3.r.I(new C0998u(C0998u.b(0.18f, ((N) c0510p2.k(s02)).a)), new C0998u(C0998u.f11833f)), null, AbstractC0832b.e(0.0f, 0.0f), AbstractC0832b.e(0.0f, Float.POSITIVE_INFINITY))), 16, 18);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
            int i8 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarI);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h, interfaceC2173HE);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p2, i8, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i9 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, nVar2);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, c2140tA);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p2, i9, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            S0 s03 = N2.a;
            String str3 = null;
            nVar = nVar2;
            H2.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s03)).f5214f, c0510p2, 6, 0, 65534);
            if (str2 != null && !AbstractC2510o.g0(str2)) {
                str3 = str2;
            }
            if (str3 == null) {
                c0510p2.R(-1433789098);
                c0510p2.p(false);
                c0510p2 = c0510p2;
            } else {
                c0510p2.R(-1433789097);
                H2.b(str3, null, ((N) c0510p2.k(s02)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s03)).f5220l, c0510p, 0, 0, 65530);
                c0510p2 = c0510p;
                c0510p2.p(false);
            }
            c0510p2.p(true);
            c0510p2.p(true);
        }
        a0.n nVar3 = nVar;
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new A3.l(str, str2, nVar3, i7, 4);
        }
    }

    public static final void g(a0.q qVar, C0510p c0510p, int i7) {
        C0510p c0510p2;
        c0510p.T(-619291971);
        if (((i7 | 6) & 3) == 2 && c0510p.y()) {
            c0510p.M();
            c0510p2 = c0510p;
        } else {
            qVar = a0.n.a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
            int i8 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, fillElement);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, interfaceC2173HE);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p, i8, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            c0510p2 = c0510p;
            Q1.a(null, 0L, 0.0f, 0L, 0, c0510p2, 0, 31);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new c(qVar, i7);
        }
    }

    public static final void h(String str, a0.n nVar, C0510p c0510p, int i7) {
        a0.n nVar2;
        kotlin.jvm.internal.l.f(ContentType.Text.TYPE, str);
        c0510p.T(1065264490);
        if ((((c0510p.f(str) ? 4 : 2) | i7 | 48) & 19) == 18 && c0510p.y()) {
            c0510p.M();
            nVar2 = nVar;
        } else {
            nVar2 = a0.n.a;
            q2.a(nVar2, C.e.a(), ((N) c0510p.k(P.a)).f5230G, 0L, 0.0f, 0.0f, W.f.b(-413139025, new e(str, 0), c0510p), c0510p, 12582918, 120);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new A3.h(i7, 2, str, nVar2);
        }
    }

    public static final void i(String str, String str2, InterfaceC0821a interfaceC0821a, a0.n nVar, String str3, C0510p c0510p, int i7) {
        a0.n nVar2;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Title, str);
        kotlin.jvm.internal.l.f("onClick", interfaceC0821a);
        c0510p.T(1548293538);
        int i8 = i7 | (c0510p.f(str) ? 4 : 2) | (c0510p.f(str2) ? 32 : 16) | (c0510p.h(interfaceC0821a) ? 256 : 128) | 3072 | (c0510p.f(str3) ? 16384 : 8192) | 196608;
        if ((74899 & i8) == 74898 && c0510p.y()) {
            c0510p.M();
            nVar2 = nVar;
        } else {
            a0.n nVar3 = a0.n.a;
            E0.d(interfaceC0821a, androidx.compose.foundation.layout.c.d(nVar3, 1.0f), false, C.e.b(16), E0.j(((N) c0510p.k(P.a)).I, c0510p), E0.k(0, 62), W.f.b(-1677619625, new C0027c(str2, str, str3, 2), c0510p), c0510p, 100663296 | ((i8 >> 6) & 14), 196);
            nVar2 = nVar3;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new l(str, str2, interfaceC0821a, nVar2, str3, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final java.lang.String r24, a0.n r25, W.a r26, O.C0510p r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.f.j(java.lang.String, a0.n, W.a, O.p, int, int):void");
    }

    public static final a0.q k(a0.q qVar, InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("<this>", qVar);
        kotlin.jvm.internal.l.f("onClick", interfaceC0821a);
        return androidx.compose.foundation.a.e(qVar, false, null, interfaceC0821a, 7);
    }

    public static final void l(Context context, boolean z7) {
        kotlin.jvm.internal.l.f("ctx", context);
        Object systemService = context.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null && vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 29) {
                vibrator.vibrate(VibrationEffect.createPredefined(z7 ? 5 : 0));
            } else {
                vibrator.vibrate(z7 ? 40L : 20L);
            }
        }
    }
}
