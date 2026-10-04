package q3;

import A3.i;
import D4.S;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.Z;
import O3.C;
import a0.q;
import androidx.compose.foundation.layout.FillElement;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import com.kusukanime.data.SessionGate;
import e4.InterfaceC0821a;
import e4.k;
import e4.n;
import f.AbstractC0847h;
import f1.AbstractC0871d;
import h0.C0975U;
import h0.C0998u;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.AbstractC1420H;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import v.AbstractC2130i;
import v.C2127f;
import v.C2140t;
import v.r;
import v1.C2147a;
import w1.AbstractC2208a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: q3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1856g {
    public static final W.a a = new W.a(false, -471514781, new io.ktor.http.cio.b(11));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f14743b = new W.a(false, 1912925860, new io.ktor.http.cio.b(12));

    public static final void a(k kVar, InterfaceC0821a interfaceC0821a, C1855f c1855f, C0510p c0510p, int i7) {
        int i8;
        C1855f c1855f2;
        String str;
        boolean z7;
        C1855f c1855f3;
        C0510p c0510p2 = c0510p;
        l.f("onOpen", kVar);
        l.f("onLogin", interfaceC0821a);
        c0510p2.T(-211081053);
        int i9 = i7 | (c0510p2.h(kVar) ? 4 : 2) | (c0510p2.h(interfaceC0821a) ? 32 : 16) | 128;
        if ((i9 & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
            c1855f3 = c1855f;
        } else {
            c0510p2.O();
            if ((i7 & 1) == 0 || c0510p2.x()) {
                W wA = AbstractC2208a.a(c0510p2);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i8 = i9 & (-897);
                c1855f2 = (C1855f) AbstractC0871d.v0(y.a.b(C1855f.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p2);
            } else {
                c0510p2.M();
                i8 = i9 & (-897);
                c1855f2 = c1855f;
            }
            c0510p2.q();
            C c2 = C.a;
            boolean zH = c0510p2.h(c1855f2);
            Object objH = c0510p2.H();
            Object obj = C0502l.a;
            if (zH || objH == obj) {
                objH = new C1850a(c1855f2, null);
                c0510p2.b0(objH);
            }
            C0486d.e(c0510p2, (n) objH, c2);
            Z zV = C0486d.v(SessionGate.INSTANCE.getLoggedIn(), c0510p2);
            Boolean bool = (Boolean) zV.getValue();
            boolean zF = c0510p2.f(zV) | c0510p2.h(c1855f2);
            Object objH2 = c0510p2.H();
            if (zF || objH2 == obj) {
                objH2 = new C1851b(c1855f2, zV, null);
                c0510p2.b0(objH2);
            }
            C0486d.e(c0510p2, (n) objH2, bool);
            Z zV2 = C0486d.v(c1855f2.f14735c, c0510p2);
            Z zV3 = C0486d.v(c1855f2.f14737e, c0510p2);
            Z zV4 = C0486d.v(c1855f2.f14739g, c0510p2);
            Z zV5 = C0486d.v(c1855f2.f14741i, c0510p2);
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            C2140t c2140tA = r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i10 = c0510p2.f7128P;
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
            C0486d.R(c0510p2, C2363j.f17875f, c2140tA);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            if (((List) zV2.getValue()).isEmpty()) {
                str = null;
            } else {
                str = ((List) zV2.getValue()).size() + " anime disimpan";
            }
            D3.f.f("Simpanan", str, null, c0510p2, 6);
            if (((Boolean) zV3.getValue()).booleanValue()) {
                c0510p2.R(-1657510713);
                D3.f.g(null, c0510p2, 0);
                c0510p2.p(false);
            } else if (((Boolean) zV4.getValue()).booleanValue()) {
                c0510p2.R(-1657509185);
                C1538e c1538eB = AbstractC1420H.f12747e;
                if (c1538eB == null) {
                    C1537d c1537d = new C1537d("Filled.Lock", false);
                    int i11 = AbstractC1530A.a;
                    C0975U c0975u = new C0975U(C0998u.f11829b);
                    S s7 = new S(7, false);
                    s7.u(18.0f, 8.0f);
                    s7.r(-1.0f);
                    s7.s(17.0f, 6.0f);
                    s7.o(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                    s7.v(7.0f, 3.24f, 7.0f, 6.0f);
                    s7.A(2.0f);
                    s7.s(6.0f, 8.0f);
                    s7.o(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    s7.A(10.0f);
                    s7.o(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    s7.r(12.0f);
                    s7.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    s7.s(20.0f, 10.0f);
                    s7.o(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    s7.m();
                    s7.u(12.0f, 17.0f);
                    s7.o(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                    s7.w(0.9f, -2.0f, 2.0f, -2.0f);
                    s7.w(2.0f, 0.9f, 2.0f, 2.0f);
                    s7.w(-0.9f, 2.0f, -2.0f, 2.0f);
                    s7.m();
                    s7.u(15.1f, 8.0f);
                    s7.s(8.9f, 8.0f);
                    s7.s(8.9f, 6.0f);
                    s7.o(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                    s7.o(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                    s7.A(2.0f);
                    s7.m();
                    C1537d.a(c1537d, s7.f1530k, c0975u);
                    c1538eB = c1537d.b();
                    AbstractC1420H.f12747e = c1538eB;
                }
                D3.f.c(c1538eB, "Masuk dulu", "Simpanan tersimpan di akunmu, bukan di perangkat ini", null, "Masuk", interfaceC0821a, c0510p2, ((i8 << 12) & 458752) | 25008, 8);
                c0510p2.p(false);
            } else if (((List) zV2.getValue()).isEmpty()) {
                c0510p2.R(157123581);
                String str2 = (String) zV5.getValue();
                if (str2 != null) {
                    c0510p2.R(-1657497516);
                    C1538e c1538eU = z1.c.u();
                    boolean zH2 = c0510p2.h(c1855f2);
                    Object objH3 = c0510p2.H();
                    if (zH2 || objH3 == obj) {
                        objH3 = new B3.q(13, c1855f2);
                        c0510p2.b0(objH3);
                    }
                    D3.f.c(c1538eU, "Gagal memuat", str2, null, "Coba lagi", (InterfaceC0821a) objH3, c0510p2, 24624, 8);
                    c0510p2.p(false);
                    z7 = false;
                } else {
                    c0510p2.R(-1657489329);
                    D3.f.c(z1.c.u(), "Belum ada simpanan", "Tekan ikon simpan di halaman anime buat menandainya", null, null, null, c0510p2, 432, 56);
                    z7 = false;
                    c0510p2.p(false);
                }
                c0510p2.p(z7);
            } else {
                c0510p2.R(-1657479405);
                float f5 = 12;
                float f7 = 8;
                v.Z z8 = new v.Z(f5, f7, f5, f7);
                C2127f c2127fG = AbstractC2130i.g(6);
                boolean zF2 = c0510p2.f(zV2) | ((i8 & 14) == 4);
                Object objH4 = c0510p2.H();
                if (zF2 || objH4 == obj) {
                    objH4 = new i(zV2, kVar, 1);
                    c0510p2.b0(objH4);
                }
                AbstractC0847h.a(null, null, z8, c2127fG, null, null, false, (k) objH4, c0510p, 24960, 235);
                c0510p2 = c0510p;
                c0510p2.p(false);
            }
            c0510p2.p(true);
            c1855f3 = c1855f2;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new A3.l(kVar, interfaceC0821a, c1855f3, i7, 6);
        }
    }
}
