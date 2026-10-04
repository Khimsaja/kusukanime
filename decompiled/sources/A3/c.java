package A3;

import H.a0;
import H.b0;
import L.D2;
import L.E0;
import L.N;
import L.P;
import L.t2;
import L.y2;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O.T;
import O.Z;
import O3.C;
import P3.F;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import com.kusukanime.data.SearchSuggestion;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import f1.AbstractC0871d;
import h0.C0998u;
import java.util.List;
import v.AbstractC2130i;
import v.C2127f;
import v.C2140t;
import v1.C2147a;
import w.C2165f;
import w1.AbstractC2208a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public abstract class c {
    public static final W.a a = new W.a(false, 1682503759, new C0006a(0));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f134b = new W.a(false, -588963986, new C0006a(1));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f135c = new W.a(false, -1915352171, new C0006a(2));

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f136d = new W.a(false, -1812167619, new C0006a(3));

    /* renamed from: e, reason: collision with root package name */
    public static final W.a f137e = new W.a(false, -444011214, new C0007b(0));

    /* renamed from: f, reason: collision with root package name */
    public static final W.a f138f = new W.a(false, -1412508832, new C0007b(1));

    public static final void a(final e4.k kVar, e4.k kVar2, B b4, C0510p c0510p, int i7) {
        int i8;
        B b7;
        String str;
        long j7;
        int i9;
        final B b8;
        boolean z7;
        B b9;
        C0510p c0510p2 = c0510p;
        kotlin.jvm.internal.l.f("onOpen", kVar);
        c0510p2.T(-1341751074);
        int i10 = i7 | (c0510p2.h(kVar) ? 4 : 2) | (c0510p2.h(kVar2) ? 32 : 16) | 128;
        if ((i10 & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
            b9 = b4;
        } else {
            c0510p2.O();
            int i11 = i7 & 1;
            Object obj = C0502l.a;
            if (i11 == 0 || c0510p2.x()) {
                W wA = AbstractC2208a.a(c0510p2);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i8 = i10 & (-897);
                b7 = (B) AbstractC0871d.v0(kotlin.jvm.internal.y.a.b(B.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p2);
            } else {
                c0510p2.M();
                i8 = i10 & (-897);
                b7 = b4;
            }
            c0510p2.q();
            Context context = (Context) c0510p2.k(AndroidCompositionLocals_androidKt.f10669b);
            C c2 = C.a;
            boolean zH = c0510p2.h(b7) | c0510p2.h(context);
            Object objH = c0510p2.H();
            if (zH || objH == obj) {
                objH = new o(b7, context, null);
                c0510p2.b0(objH);
            }
            C0486d.e(c0510p2, (e4.n) objH, c2);
            Z zV = C0486d.v(b7.f119c, c0510p2);
            final Z zV2 = C0486d.v(b7.f121e, c0510p2);
            Z zV3 = C0486d.v(b7.f123g, c0510p2);
            Z zV4 = C0486d.v(b7.f125i, c0510p2);
            Z zV5 = C0486d.v(b7.f127k, c0510p2);
            Z zV6 = C0486d.v(b7.f129m, c0510p2);
            Object objH2 = c0510p2.H();
            if (objH2 == obj) {
                objH2 = C0486d.K(Boolean.TRUE, T.f7049p);
                c0510p2.b0(objH2);
            }
            Z z8 = (Z) objH2;
            a0.n nVar = a0.n.a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i12 = c0510p2.f7128P;
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
            C0486d.R(c0510p2, C2363j.f17875f, c2140tA);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i12))) {
                AbstractC0703b.u(i12, c0510p2, i12, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            String str2 = (String) zV.getValue();
            C.d dVarB = C.e.b(28);
            y2 y2Var = y2.a;
            S0 s02 = P.a;
            long j8 = ((N) c0510p2.k(s02)).f5230G;
            long j9 = ((N) c0510p2.k(s02)).f5230G;
            long j10 = C0998u.f11833f;
            long j11 = C0998u.f11834g;
            N n7 = (N) c0510p2.k(s02);
            t2 t2Var = n7.f5242U;
            c0510p2.R(27085453);
            if (t2Var == null) {
                j7 = j9;
                str = str2;
                t2Var = new t2(P.c(n7, 18), P.c(n7, 18), C0998u.b(0.38f, P.c(n7, 18)), P.c(n7, 18), P.c(n7, 39), P.c(n7, 39), P.c(n7, 39), P.c(n7, 39), P.c(n7, 26), P.c(n7, 2), (a0) c0510p2.k(b0.a), P.c(n7, 26), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 18)), P.c(n7, 2), P.c(n7, 19), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 18)), P.c(n7, 19), P.c(n7, 19), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 18)), P.c(n7, 2), P.c(n7, 26), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 18)), P.c(n7, 2), P.c(n7, 19), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 18)), P.c(n7, 19), P.c(n7, 19), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 18)), P.c(n7, 2), P.c(n7, 19), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 19)), P.c(n7, 19), P.c(n7, 19), P.c(n7, 19), C0998u.b(0.38f, P.c(n7, 19)), P.c(n7, 19));
                n7.f5242U = t2Var;
            } else {
                str = str2;
                j7 = j9;
            }
            c0510p2.p(false);
            long j12 = j11 != 16 ? j11 : t2Var.a;
            long j13 = j11 != 16 ? j11 : t2Var.f5830b;
            long j14 = j11 != 16 ? j11 : t2Var.f5831c;
            long j15 = j11 != 16 ? j11 : t2Var.f5832d;
            if (j8 == 16) {
                j8 = t2Var.f5833e;
            }
            t2 t2Var2 = new t2(j12, j13, j14, j15, j8, j7 != 16 ? j7 : t2Var.f5834f, j11 != 16 ? j11 : t2Var.f5835g, j11 != 16 ? j11 : t2Var.f5836h, j11 != 16 ? j11 : t2Var.f5837i, j11 != 16 ? j11 : t2Var.f5838j, t2Var.f5839k, j10 != 16 ? j10 : t2Var.f5840l, j10 != 16 ? j10 : t2Var.f5841m, j11 != 16 ? j11 : t2Var.f5842n, j11 != 16 ? j11 : t2Var.f5843o, j11 != 16 ? j11 : t2Var.f5844p, j11 != 16 ? j11 : t2Var.f5845q, j11 != 16 ? j11 : t2Var.f5846r, j11 != 16 ? j11 : t2Var.f5847s, j11 != 16 ? j11 : t2Var.f5848t, j11 != 16 ? j11 : t2Var.f5849u, j11 != 16 ? j11 : t2Var.f5850v, j11 != 16 ? j11 : t2Var.f5851w, j11 != 16 ? j11 : t2Var.f5852x, j11 != 16 ? j11 : t2Var.f5853y, j11 != 16 ? j11 : t2Var.f5854z, j11 != 16 ? j11 : t2Var.f5815A, j11 != 16 ? j11 : t2Var.f5816B, j11 != 16 ? j11 : t2Var.f5817C, j11 != 16 ? j11 : t2Var.f5818D, j11 != 16 ? j11 : t2Var.f5819E, j11 != 16 ? j11 : t2Var.f5820F, j11 != 16 ? j11 : t2Var.f5821G, j11 != 16 ? j11 : t2Var.f5822H, j11 != 16 ? j11 : t2Var.I, j11 != 16 ? j11 : t2Var.J, j11 != 16 ? j11 : t2Var.f5823K, j11 != 16 ? j11 : t2Var.f5824L, j11 != 16 ? j11 : t2Var.f5825M, j11 != 16 ? j11 : t2Var.f5826N, j11 != 16 ? j11 : t2Var.f5827O, j11 != 16 ? j11 : t2Var.f5828P, j11 != 16 ? j11 : t2Var.f5829Q);
            float f5 = 12;
            float f7 = 8;
            a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar, 1.0f), f5, f7);
            boolean zH2 = c0510p2.h(b7);
            Object objH3 = c0510p2.H();
            if (zH2 || objH3 == obj) {
                i9 = 0;
                objH3 = new d(i9, b7);
                c0510p2.b0(objH3);
            } else {
                i9 = 0;
            }
            B b10 = b7;
            D2.a(str, (e4.k) objH3, qVarI, false, null, a, f134b, W.f.b(1434535565, new h(1, b7, zV), c0510p2), null, null, null, true, 0, 0, dVarB, t2Var2, c0510p, 918552960);
            final String string = AbstractC2510o.J0((String) zV.getValue()).toString();
            if (string.length() < 2) {
                c0510p.R(688822091);
                float f8 = 4;
                v.Z z9 = new v.Z(f5, f8, f5, f8);
                C2127f c2127fG = AbstractC2130i.g(f8);
                boolean zF = c0510p.f(zV4) | c0510p.h(b10) | c0510p.f(zV6) | ((i8 & 112) == 32);
                Object objH4 = c0510p.H();
                if (zF || objH4 == obj) {
                    j jVar = new j(zV4, b10, z8, zV6, kVar2);
                    b8 = b10;
                    c0510p.b0(jVar);
                    objH4 = jVar;
                } else {
                    b8 = b10;
                }
                AbstractC0847h.a(null, null, z9, c2127fG, null, null, false, (e4.k) objH4, c0510p, 24960, 235);
                c0510p2 = c0510p;
                c0510p2.p(false);
            } else {
                c0510p2 = c0510p;
                b8 = b10;
                if (((Boolean) zV3.getValue()).booleanValue() && ((List) zV2.getValue()).isEmpty()) {
                    c0510p2.R(689001602);
                    D3.f.g(null, c0510p2, 0);
                    c0510p2.p(false);
                } else if (((String) zV5.getValue()) != null && ((List) zV2.getValue()).isEmpty()) {
                    c0510p2.R(689005221);
                    D3.f.c(F.A(), "Pencarian gagal", (String) zV5.getValue(), null, null, null, c0510p2, 48, 56);
                    c0510p2.p(false);
                } else if (((List) zV2.getValue()).isEmpty()) {
                    c0510p2.R(689012434);
                    D3.f.c(F.A(), "Tidak ketemu", AbstractC0703b.j("Tidak ada hasil untuk \"", string, "\". Coba kata kunci lain."), null, null, null, c0510p2, 48, 56);
                    c0510p2.p(false);
                } else {
                    c0510p2.R(689021191);
                    float f9 = 4;
                    v.Z z10 = new v.Z(f5, f9, f5, f9);
                    C2127f c2127fG2 = AbstractC2130i.g(f7);
                    boolean zF2 = ((i8 & 14) == 4) | c0510p2.f(zV2) | c0510p2.f(string) | c0510p2.h(b8);
                    Object objH5 = c0510p2.H();
                    if (zF2 || objH5 == obj) {
                        objH5 = new e4.k() { // from class: A3.k
                            @Override // e4.k
                            public final Object invoke(Object obj2) {
                                C2165f c2165f = (C2165f) obj2;
                                kotlin.jvm.internal.l.f("$this$LazyColumn", c2165f);
                                String str3 = string;
                                Z z11 = zV2;
                                C2165f.w0(c2165f, new W.a(true, -1355084823, new n(str3, z11, 0)));
                                List list = (List) z11.getValue();
                                c2165f.x0(list.size(), new t(1, new e(0), list), new u(2, list), new W.a(true, -632812321, new x(list, b8, str3, kVar)));
                                return C.a;
                            }
                        };
                        c0510p2.b0(objH5);
                    }
                    AbstractC0847h.a(null, null, z10, c2127fG2, null, null, false, (e4.k) objH5, c0510p, 24960, 235);
                    c0510p2 = c0510p;
                    c0510p2.p(false);
                    z7 = true;
                    c0510p2.p(z7);
                    b9 = b8;
                }
            }
            z7 = true;
            c0510p2.p(z7);
            b9 = b8;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new l(kVar, kVar2, b9, i7, 0);
        }
    }

    public static final void b(SearchSuggestion searchSuggestion, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        c0510p.T(829624246);
        int i8 = (c0510p.f(searchSuggestion) ? 4 : 2) | i7 | (c0510p.h(interfaceC0821a) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            E0.d(interfaceC0821a, androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), false, C.e.b(16), E0.j(((N) c0510p.k(P.a)).I, c0510p), E0.k(0, 62), W.f.b(2076162347, new g(0, searchSuggestion), c0510p), c0510p, 100663344 | ((i8 >> 3) & 14), 196);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new h(i7, 0, searchSuggestion, interfaceC0821a);
        }
    }
}
