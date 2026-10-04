package p3;

import A3.C0007b;
import L.AbstractC0414s;
import L.E0;
import L.H2;
import L.Q1;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.T;
import O.Z;
import O3.C;
import Z5.A;
import a0.i;
import a0.q;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e4.n;
import f1.AbstractC0871d;
import h0.C0961F;
import h0.C0998u;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.r;
import v1.C2147a;
import w0.InterfaceC2173H;
import w1.AbstractC2208a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: p3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1790h {
    public static final W.a a = new W.a(false, 651548249, new C0007b(22));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f14354b = new W.a(false, -792738106, new io.ktor.http.cio.b(10));

    public static final void a(InterfaceC0821a interfaceC0821a, C1789g c1789g, C0510p c0510p, int i7) {
        int i8;
        C1789g c1789g2;
        Object obj;
        int i9;
        boolean z7;
        int i10;
        Object obj2;
        C0510p c0510p2 = c0510p;
        l.f("onOk", interfaceC0821a);
        c0510p2.T(-121959956);
        int i11 = i7 | (c0510p2.h(interfaceC0821a) ? 4 : 2) | 16;
        if ((i11 & 19) == 18 && c0510p2.y()) {
            c0510p2.M();
            obj2 = c1789g;
            i10 = 4;
        } else {
            c0510p2.O();
            if ((i7 & 1) == 0 || c0510p2.x()) {
                W wA = AbstractC2208a.a(c0510p2);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i8 = i11 & (-113);
                c1789g2 = (C1789g) AbstractC0871d.v0(y.a.b(C1789g.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p2);
            } else {
                c0510p2.M();
                i8 = i11 & (-113);
                c1789g2 = c1789g;
            }
            c0510p2.q();
            Z zV = C0486d.v(c1789g2.f14351c, c0510p2);
            Context context = (Context) c0510p2.k(AndroidCompositionLocals_androidKt.f10669b);
            C c2 = C.a;
            boolean zH = c0510p2.h(c1789g2) | c0510p2.h(context);
            Object objH = c0510p2.H();
            T t7 = C0502l.a;
            if (zH || objH == t7) {
                objH = new C1783a(c1789g2, context, null);
                c0510p2.b0(objH);
            }
            C0486d.e(c0510p2, (n) objH, c2);
            a0.n nVar = a0.n.a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            i iVar = a0.b.f10385o;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
            int i12 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            q qVarC = a0.a.c(c0510p2, fillElement);
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
            if (c0510p2.f7127O || !l.a(c0510p2.H(), Integer.valueOf(i12))) {
                AbstractC0703b.u(i12, c0510p2, i12, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            float f5 = 28;
            q qVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(nVar, 1.0f), f5);
            C2140t c2140tA = r.a(AbstractC2130i.f16446d, a0.b.f10394x, c0510p2, 54);
            int i13 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            q qVarC2 = a0.a.c(c0510p2, qVarH);
            c0510p2.V();
            Object obj3 = c1789g2;
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, c2140tA);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !l.a(c0510p2.H(), Integer.valueOf(i13))) {
                AbstractC0703b.u(i13, c0510p2, i13, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            q qVarA = androidx.compose.foundation.a.a(q0.c.o(androidx.compose.foundation.layout.c.j(nVar, 76), C.e.a), new C0961F(P3.r.I(new C0998u(E0.l(c0510p2).a), new C0998u(E0.l(c0510p2).f5247f)), null, 0L, 9187343241974906880L));
            InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar, false);
            int i14 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M3 = c0510p2.m();
            q qVarC3 = a0.a.c(c0510p2, qVarA);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, interfaceC2173HE2);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M3);
            if (c0510p2.f7127O || !l.a(c0510p2.H(), Integer.valueOf(i14))) {
                AbstractC0703b.u(i14, c0510p2, i14, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC3);
            H2.b("K", null, E0.l(c0510p2).f5243b, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p2).f5211c, c0510p, 6, 0, 65530);
            c0510p.p(true);
            float f7 = 16;
            AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.e(nVar, f7));
            H2.b("Kusukanime", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p).f5213e, c0510p, 6, 0, 65534);
            AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.e(nVar, 4));
            H2.b("Masuk untuk simpan bookmark, riwayat tonton, dan ikut berkomentar", null, E0.l(c0510p).f5260s, 0L, null, 0L, new S0.i(3), 0L, 0, false, 0, 0, E0.o(c0510p).f5219k, c0510p, 6, 0, 65018);
            C0510p c0510p3 = c0510p;
            AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, f5));
            InterfaceC1787e interfaceC1787e = (InterfaceC1787e) zV.getValue();
            if (interfaceC1787e instanceof C1786d) {
                c0510p3.R(697119439);
                Q1.a(null, 0L, 0.0f, 0L, 0, c0510p, 0, 31);
                AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.e(nVar, 12));
                H2.b("Menunggu izin dari Google…", null, E0.l(c0510p).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p).f5220l, c0510p, 6, 0, 65530);
                c0510p3 = c0510p;
                c0510p3.p(false);
                obj = obj3;
                i9 = 4;
            } else {
                c0510p3.R(697538435);
                C.d dVarA = C.e.a();
                v.Z z8 = AbstractC0414s.a;
                L.r rVarA = AbstractC0414s.a(E0.l(c0510p3).a, E0.l(c0510p3).f5243b, c0510p3);
                q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 52);
                boolean zH2 = c0510p3.h(obj3) | ((i8 & 14) == 4);
                Object objH2 = c0510p3.H();
                if (zH2 || objH2 == t7) {
                    objH2 = new A(6, obj3, interfaceC0821a);
                    c0510p3.b0(objH2);
                }
                obj = obj3;
                i9 = 4;
                E0.b((InterfaceC0821a) objH2, qVarE, false, dVarA, rVarA, null, null, null, a, c0510p3, 805306416, 484);
                if (interfaceC1787e instanceof C1784b) {
                    c0510p3.R(698256705);
                    float f8 = 12;
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, f8));
                    q2.a(null, C.e.b(f8), E0.l(c0510p3).f5266y, 0L, 0.0f, 0.0f, W.f.b(1197111327, new D3.c(4, (C1784b) interfaceC1787e), c0510p3), c0510p3, 12582912, 121);
                    z7 = false;
                } else {
                    z7 = false;
                    c0510p3.R(689732666);
                }
                c0510p3.p(z7);
                c0510p3.p(z7);
            }
            AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, f7));
            i10 = i9;
            H2.b("Tidak ada akun email/password. Login hanya lewat Google.", null, E0.l(c0510p3).f5260s, 0L, null, 0L, new S0.i(3), 0L, 0, false, 0, 0, E0.o(c0510p3).f5223o, c0510p, 6, 0, 65018);
            c0510p2 = c0510p;
            c0510p2.p(true);
            c0510p2.p(true);
            obj2 = obj;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new A3.h(interfaceC0821a, obj2, i7, i10);
        }
    }

    public static final void b(int i7, C0510p c0510p) {
        C0510p c0510p2;
        c0510p.T(1279225131);
        if (i7 == 0 && c0510p.y()) {
            c0510p.M();
            c0510p2 = c0510p;
        } else {
            c0510p2 = c0510p;
            q2.a(androidx.compose.foundation.layout.c.j(a0.n.a, 20), C.e.a, C0998u.f11830c, 0L, 0.0f, 0.0f, f14354b, c0510p2, 12583302, 120);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new io.ktor.http.cio.b(i7, 9);
        }
    }
}
