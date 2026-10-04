package B3;

import L.AbstractC0384j0;
import L.AbstractC0414s;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O.Z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import com.kusukanime.data.EpisodeRef;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import h0.AbstractC0968M;
import h0.C0961F;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import java.util.Map;
import l4.AbstractC1420H;
import n0.C1538e;
import s3.AbstractC1994a;
import s3.C2004k;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2124c;
import v.C2127f;
import v.C2140t;
import v.C2141u;
import v.c0;
import v.e0;
import v.f0;
import v.g0;
import w.C2160a;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* renamed from: B3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0027c implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f457k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f460n;

    public /* synthetic */ C0027c(Object obj, e4.k kVar, Z z7, int i7) {
        this.f457k = i7;
        this.f458l = obj;
        this.f460n = kVar;
        this.f459m = z7;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z7;
        int i7;
        LayoutWeightElement layoutWeightElement;
        C0510p c0510p;
        R1.i iVar = AbstractC0968M.a;
        Object obj4 = C0502l.a;
        a0.n nVar = a0.n.a;
        final int i8 = 1;
        O3.C c2 = O3.C.a;
        Object obj5 = this.f458l;
        Object obj6 = this.f460n;
        Object obj7 = this.f459m;
        switch (this.f457k) {
            case 0:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else if (kotlin.jvm.internal.l.a((Boolean) ((Z) obj7).getValue(), Boolean.TRUE)) {
                    c0510p2.R(-344418052);
                    C1538e c1538eC = AbstractC1420H.C();
                    Object objH = c0510p2.H();
                    if (objH == obj4) {
                        objH = new i(2, (Z) obj6);
                        c0510p2.b0(objH);
                    }
                    InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
                    S0 s02 = P.a;
                    D3.t.f(c1538eC, "Keluar akun", "Session di perangkat ini dihapus", interfaceC0821a, null, ((N) c0510p2.k(s02)).f5264w, ((N) c0510p2.k(s02)).f5264w, false, c0510p2, 3504, 144);
                    c0510p2.p(false);
                } else {
                    c0510p2.R(-343993817);
                    D3.t.f(z1.c.z(), "Masuk / Daftar", "Sinkron bookmark, riwayat, dan komentar", (InterfaceC0821a) obj5, AbstractC0025a.a, 0L, 0L, false, c0510p2, 25008, 224);
                    c0510p2.p(false);
                }
                return c2;
            case 1:
                C0510p c0510p3 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Card", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    a0.q qVarD = androidx.compose.foundation.layout.c.d(nVar, 1.0f);
                    C2124c c2124c = AbstractC2130i.f16445c;
                    C2140t c2140tA = v.r.a(c2124c, a0.b.f10393w, c0510p3, 0);
                    int i9 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p3.m();
                    a0.q qVarC = a0.a.c(c0510p3, qVarD);
                    InterfaceC2364k.f17877j.getClass();
                    InterfaceC0821a interfaceC0821a2 = C2363j.f17871b;
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(interfaceC0821a2);
                    } else {
                        c0510p3.e0();
                    }
                    C2361h c2361h = C2363j.f17875f;
                    C0486d.R(c0510p3, c2361h, c2140tA);
                    C2361h c2361h2 = C2363j.f17874e;
                    C0486d.R(c0510p3, c2361h2, interfaceC0501k0M);
                    C2361h c2361h3 = C2363j.f17876g;
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i9))) {
                        AbstractC0703b.u(i9, c0510p3, i9, c2361h3);
                    }
                    C2361h c2361h4 = C2363j.f17873d;
                    C0486d.R(c0510p3, c2361h4, qVarC);
                    a0.q qVarA = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.d(nVar, 1.0f), new C0961F(P3.r.I(new C0998u(E0.l(c0510p3).a), new C0998u(E0.l(c0510p3).f5247f)), null, 0L, 9187343241974906880L));
                    InterfaceC0821a interfaceC0821a3 = (InterfaceC0821a) obj5;
                    boolean zF = c0510p3.f(interfaceC0821a3);
                    Object objH2 = c0510p3.H();
                    if (zF || objH2 == obj4) {
                        objH2 = new u(interfaceC0821a3, 1);
                        c0510p3.b0(objH2);
                    }
                    a0.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.e(qVarA, false, null, (InterfaceC0821a) objH2, 7), 0.0f, 22, 1);
                    a0.i iVar2 = a0.b.f10385o;
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar2, false);
                    int i10 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p3.m();
                    a0.q qVarC2 = a0.a.c(c0510p3, qVarJ);
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(interfaceC0821a2);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, c2361h, interfaceC2173HE);
                    C0486d.R(c0510p3, c2361h2, interfaceC0501k0M2);
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i10))) {
                        AbstractC0703b.u(i10, c0510p3, i10, c2361h3);
                    }
                    C0486d.R(c0510p3, c2361h4, qVarC2);
                    a0.g gVar = a0.b.f10394x;
                    C2140t c2140tA2 = v.r.a(c2124c, gVar, c0510p3, 48);
                    int i11 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p3.m();
                    a0.q qVarC3 = a0.a.c(c0510p3, nVar);
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(interfaceC0821a2);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, c2361h, c2140tA2);
                    C0486d.R(c0510p3, c2361h2, interfaceC0501k0M3);
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i11))) {
                        AbstractC0703b.u(i11, c0510p3, i11, c2361h3);
                    }
                    C0486d.R(c0510p3, c2361h4, qVarC3);
                    C.d dVar = C.e.a;
                    long j7 = C0998u.f11830c;
                    q2.a(androidx.compose.foundation.layout.c.j(nVar, 64), dVar, C0998u.b(0.18f, j7), 0L, 0.0f, 0.0f, C3.a.a, c0510p3, 12583302, 120);
                    float f5 = 12;
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, f5));
                    H2.b("Info Update Terbaru", null, j7, 0L, M0.u.f6418r, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p3).f5216h, c0510p3, 196998, 0, 65498);
                    c0510p3.p(true);
                    c0510p3.p(true);
                    float f7 = 20;
                    a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar, 1.0f), f7, 16);
                    C2140t c2140tA3 = v.r.a(c2124c, gVar, c0510p3, 48);
                    int i12 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M4 = c0510p3.m();
                    a0.q qVarC4 = a0.a.c(c0510p3, qVarI);
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(interfaceC0821a2);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, c2361h, c2140tA3);
                    C0486d.R(c0510p3, c2361h2, interfaceC0501k0M4);
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i12))) {
                        AbstractC0703b.u(i12, c0510p3, i12, c2361h3);
                    }
                    C0486d.R(c0510p3, c2361h4, qVarC4);
                    H2.b("Gabung channel Telegram Kusukanime", null, 0L, 0L, null, 0L, new S0.i(3), 0L, 0, false, 0, 0, E0.o(c0510p3).f5217i, c0510p3, 6, 0, 65022);
                    float f8 = 6;
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, f8));
                    H2.b("Dapat kabar episode baru dan info penting lebih dulu, langsung dari channel resmi.", null, E0.l(c0510p3).f5260s, 0L, null, 0L, new S0.i(3), 0L, 0, false, 0, 0, E0.o(c0510p3).f5220l, c0510p3, 0, 0, 65018);
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, f5));
                    q2.a(null, C.e.a(), E0.l(c0510p3).f5230G, 0L, 0.0f, 0.0f, C3.a.f952b, c0510p3, 12582912, 121);
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, 18));
                    C.d dVarA = C.e.a();
                    v.Z z8 = AbstractC0414s.a;
                    L.r rVarA = AbstractC0414s.a(E0.l(c0510p3).a, E0.l(c0510p3).f5243b, c0510p3);
                    v.Z z9 = new v.Z(f7, f5, f7, f5);
                    float f9 = 48;
                    a0.q qVarG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.d(nVar, 1.0f), f9, 0.0f, 2);
                    boolean zF2 = c0510p3.f(interfaceC0821a3);
                    Object objH3 = c0510p3.H();
                    if (zF2 || objH3 == obj4) {
                        objH3 = new u(interfaceC0821a3, 2);
                        c0510p3.b0(objH3);
                    }
                    E0.b((InterfaceC0821a) objH3, qVarG, false, dVarA, rVarA, null, null, z9, C3.a.f953c, c0510p3, 817889328, 356);
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, 2));
                    InterfaceC0821a interfaceC0821a4 = (InterfaceC0821a) obj7;
                    boolean zF3 = c0510p3.f(interfaceC0821a4);
                    Object objH4 = c0510p3.H();
                    if (zF3 || objH4 == obj4) {
                        objH4 = new u(interfaceC0821a4, 3);
                        c0510p3.b0(objH4);
                    }
                    E0.i((InterfaceC0821a) objH4, androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.d(nVar, 1.0f), f9, 0.0f, 2), false, null, null, null, C3.a.f954d, c0510p3, 805306416, 508);
                    a0.q qVarO = q0.c.o(androidx.compose.foundation.layout.c.d(nVar, 1.0f), C.e.b(10));
                    InterfaceC0821a interfaceC0821a5 = (InterfaceC0821a) obj6;
                    boolean zF4 = c0510p3.f(interfaceC0821a5);
                    Object objH5 = c0510p3.H();
                    if (zF4 || objH5 == obj4) {
                        objH5 = new u(interfaceC0821a5, 4);
                        c0510p3.b0(objH5);
                    }
                    float f10 = 8;
                    a0.q qVarJ2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.e(qVarO, false, null, (InterfaceC0821a) objH5, 7), 0.0f, f10, 1);
                    f0 f0VarB = e0.b(AbstractC2130i.f16446d, a0.b.f10391u, c0510p3, 54);
                    int i13 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M5 = c0510p3.m();
                    a0.q qVarC5 = a0.a.c(c0510p3, qVarJ2);
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(interfaceC0821a2);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, c2361h, f0VarB);
                    C0486d.R(c0510p3, c2361h2, interfaceC0501k0M5);
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i13))) {
                        AbstractC0703b.u(i13, c0510p3, i13, c2361h3);
                    }
                    C0486d.R(c0510p3, c2361h4, qVarC5);
                    a0.q qVarB = androidx.compose.foundation.a.b(q0.c.o(androidx.compose.foundation.layout.c.j(nVar, f7), C.e.b(f8)), E0.l(c0510p3).f5231H, iVar);
                    InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar2, false);
                    int i14 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M6 = c0510p3.m();
                    a0.q qVarC6 = a0.a.c(c0510p3, qVarB);
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(interfaceC0821a2);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, c2361h, interfaceC2173HE2);
                    C0486d.R(c0510p3, c2361h2, interfaceC0501k0M6);
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i14))) {
                        AbstractC0703b.u(i14, c0510p3, i14, c2361h3);
                    }
                    C0486d.R(c0510p3, c2361h4, qVarC6);
                    AbstractC0384j0.a(n6.m.D(), null, androidx.compose.foundation.layout.c.j(nVar, 14), E0.l(c0510p3).a, c0510p3, 432, 0);
                    c0510p3.p(true);
                    AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.n(f10));
                    H2.b("Ingatkan lagi 1 jam lagi", null, E0.l(c0510p3).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p3).f5222n, c0510p3, 6, 0, 65530);
                    c0510p3.p(true);
                    c0510p3.p(true);
                    c0510p3.p(true);
                }
                return c2;
            case 2:
                C0510p c0510p4 = (C0510p) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Card", (C2141u) obj);
                if ((iIntValue3 & 17) == 16 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    C2124c c2124c2 = AbstractC2130i.f16445c;
                    a0.g gVar2 = a0.b.f10393w;
                    C2140t c2140tA4 = v.r.a(c2124c2, gVar2, c0510p4, 0);
                    int i15 = c0510p4.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M7 = c0510p4.m();
                    a0.q qVarC7 = a0.a.c(c0510p4, nVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p4.V();
                    if (c0510p4.f7127O) {
                        c0510p4.l(c2362i);
                    } else {
                        c0510p4.e0();
                    }
                    C2361h c2361h5 = C2363j.f17875f;
                    C0486d.R(c0510p4, c2361h5, c2140tA4);
                    C2361h c2361h6 = C2363j.f17874e;
                    C0486d.R(c0510p4, c2361h6, interfaceC0501k0M7);
                    C2361h c2361h7 = C2363j.f17876g;
                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i15))) {
                        AbstractC0703b.u(i15, c0510p4, i15, c2361h7);
                    }
                    C2361h c2361h8 = C2363j.f17873d;
                    C0486d.R(c0510p4, c2361h8, qVarC7);
                    a0.q qVarD2 = androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 0.75f);
                    InterfaceC2173H interfaceC2173HE3 = AbstractC2136o.e(a0.b.f10381k, false);
                    int i16 = c0510p4.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M8 = c0510p4.m();
                    a0.q qVarC8 = a0.a.c(c0510p4, qVarD2);
                    c0510p4.V();
                    if (c0510p4.f7127O) {
                        c0510p4.l(c2362i);
                    } else {
                        c0510p4.e0();
                    }
                    C0486d.R(c0510p4, c2361h5, interfaceC2173HE3);
                    C0486d.R(c0510p4, c2361h6, interfaceC0501k0M8);
                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i16))) {
                        AbstractC0703b.u(i16, c0510p4, i16, c2361h7);
                    }
                    C0486d.R(c0510p4, c2361h8, qVarC8);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
                    S0 s03 = P.a;
                    a0.q qVarB2 = androidx.compose.foundation.a.b(fillElement, ((N) c0510p4.k(s03)).f5231H, iVar);
                    InterfaceC2173H interfaceC2173HE4 = AbstractC2136o.e(a0.b.f10385o, false);
                    int i17 = c0510p4.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M9 = c0510p4.m();
                    a0.q qVarC9 = a0.a.c(c0510p4, qVarB2);
                    c0510p4.V();
                    if (c0510p4.f7127O) {
                        c0510p4.l(c2362i);
                    } else {
                        c0510p4.e0();
                    }
                    C0486d.R(c0510p4, c2361h5, interfaceC2173HE4);
                    C0486d.R(c0510p4, c2361h6, interfaceC0501k0M9);
                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i17))) {
                        AbstractC0703b.u(i17, c0510p4, i17, c2361h7);
                    }
                    C0486d.R(c0510p4, c2361h8, qVarC9);
                    AbstractC0384j0.a(n6.m.J(), null, androidx.compose.foundation.layout.c.j(nVar, 28), ((N) c0510p4.k(s03)).f5260s, c0510p4, 432, 0);
                    c0510p4.p(true);
                    float f11 = 16;
                    String str = (String) obj7;
                    T2.q.b((String) obj5, str, q0.c.o(fillElement, C.e.c(f11, f11, 0.0f, 12)), c0510p4, 1572864);
                    Float fValueOf = Float.valueOf(0.0f);
                    long j8 = C0998u.f11833f;
                    AbstractC2136o.a(androidx.compose.foundation.a.a(fillElement, R1.i.u(new O3.l[]{new O3.l(fValueOf, new C0998u(j8)), new O3.l(Float.valueOf(0.7f), new C0998u(j8)), new O3.l(Float.valueOf(1.0f), new C0998u(C0998u.b(0.35f, C0998u.f11829b)))})), c0510p4, 6);
                    c0510p4.R(1236710796);
                    c0510p4.p(false);
                    c0510p4.p(true);
                    a0.q qVarI2 = androidx.compose.foundation.layout.a.i(nVar, 8, 7);
                    C2140t c2140tA5 = v.r.a(c2124c2, gVar2, c0510p4, 0);
                    int i18 = c0510p4.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M10 = c0510p4.m();
                    a0.q qVarC10 = a0.a.c(c0510p4, qVarI2);
                    c0510p4.V();
                    if (c0510p4.f7127O) {
                        c0510p4.l(c2362i);
                    } else {
                        c0510p4.e0();
                    }
                    C0486d.R(c0510p4, c2361h5, c2140tA5);
                    C0486d.R(c0510p4, c2361h6, interfaceC0501k0M10);
                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i18))) {
                        AbstractC0703b.u(i18, c0510p4, i18, c2361h7);
                    }
                    C0486d.R(c0510p4, c2361h8, qVarC10);
                    S0 s04 = N2.a;
                    H2.b(str, null, 0L, 0L, M0.u.f6417q, 0L, null, 0L, 2, false, 2, 2, ((M2) c0510p4.k(s04)).f5220l, c0510p4, 196608, 27696, 38878);
                    String str2 = (String) obj6;
                    String str3 = (str2 == null || AbstractC2510o.g0(str2)) ? null : str2;
                    if (str3 == null) {
                        c0510p4.R(-658232612);
                        z7 = false;
                    } else {
                        c0510p4.R(-658232611);
                        AbstractC2136o.a(androidx.compose.foundation.layout.c.e(nVar, 2), c0510p4, 6);
                        H2.b(str3, null, ((N) c0510p4.k(s03)).f5260s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M2) c0510p4.k(s04)).f5223o, c0510p4, 0, 3120, 55290);
                        z7 = false;
                    }
                    c0510p4.p(z7);
                    c0510p4.p(true);
                    c0510p4.p(true);
                }
                return c2;
            case 3:
                C0510p c0510p5 = (C0510p) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue4 & 17) == 16 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    EpisodeRef episodeRef = (EpisodeRef) obj5;
                    Float f12 = (Float) ((Map) ((Z) obj7).getValue()).get(episodeRef.getSlug());
                    float fFloatValue = f12 != null ? f12.floatValue() : 0.0f;
                    e4.k kVar = (e4.k) obj6;
                    boolean zF5 = c0510p5.f(kVar) | c0510p5.f(episodeRef);
                    Object objH6 = c0510p5.H();
                    if (zF5 || objH6 == obj4) {
                        i7 = 0;
                        objH6 = new C2004k(kVar, episodeRef, 0);
                        c0510p5.b0(objH6);
                    } else {
                        i7 = 0;
                    }
                    AbstractC1994a.c(episodeRef, fFloatValue, (InterfaceC0821a) objH6, c0510p5, i7);
                }
                return c2;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p6 = (C0510p) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue5 & 17) == 16 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    List list = (List) obj5;
                    D3.f.j(c0.a(list.size(), "Episode (", ")"), null, W.f.b(909352753, new A3.l(list, (Z) obj7, (Z) obj6, 7), c0510p6), c0510p6, 384, 2);
                }
                return c2;
            case 5:
                C0510p c0510p7 = (C0510p) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue6 & 17) == 16 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    List list2 = (List) obj5;
                    AbstractC1994a.g(list2, (e4.k) obj6, (Map) ((Z) obj7).getValue(), 0, list2.size() > 12, null, c0510p7, 0);
                }
                return c2;
            case 6:
                C0510p c0510p8 = (C0510p) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue7 & 17) == 16 && c0510p8.y()) {
                    c0510p8.M();
                } else {
                    a0.q qVarI3 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 16, 4);
                    f0 f0VarB2 = e0.b(AbstractC2130i.g(8), a0.b.f10390t, c0510p8, 6);
                    int i19 = c0510p8.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M11 = c0510p8.m();
                    a0.q qVarC11 = a0.a.c(c0510p8, qVarI3);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p8.V();
                    if (c0510p8.f7127O) {
                        c0510p8.l(c2362i2);
                    } else {
                        c0510p8.e0();
                    }
                    C0486d.R(c0510p8, C2363j.f17875f, f0VarB2);
                    C0486d.R(c0510p8, C2363j.f17874e, interfaceC0501k0M11);
                    C2361h c2361h9 = C2363j.f17876g;
                    if (c0510p8.f7127O || !kotlin.jvm.internal.l.a(c0510p8.H(), Integer.valueOf(i19))) {
                        AbstractC0703b.u(i19, c0510p8, i19, c2361h9);
                    }
                    C0486d.R(c0510p8, C2363j.f17873d, qVarC11);
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    final EpisodeRef episodeRef2 = (EpisodeRef) obj5;
                    e4.k kVar2 = (e4.k) obj7;
                    if (episodeRef2 != null) {
                        c0510p8.R(-79029220);
                        boolean zF6 = c0510p8.f(kVar2) | c0510p8.f(episodeRef2);
                        Object objH7 = c0510p8.H();
                        if (zF6 || objH7 == obj4) {
                            objH7 = new C2004k(kVar2, episodeRef2, 2);
                            c0510p8.b0(objH7);
                        }
                        InterfaceC0821a interfaceC0821a6 = (InterfaceC0821a) objH7;
                        final int i20 = 0;
                        E0.h(interfaceC0821a6, layoutWeightElement2, false, null, null, null, null, W.f.b(1989337498, new e4.o() { // from class: s3.r
                            @Override // e4.o
                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                switch (i20) {
                                    case 0:
                                        C0510p c0510p9 = (C0510p) obj9;
                                        int iIntValue8 = ((Integer) obj10).intValue();
                                        kotlin.jvm.internal.l.f("$this$OutlinedButton", (g0) obj8);
                                        if ((iIntValue8 & 17) == 16 && c0510p9.y()) {
                                            c0510p9.M();
                                        } else {
                                            int n7 = episodeRef2.getN();
                                            Object objValueOf = Integer.valueOf(n7);
                                            if (n7 <= 0) {
                                                objValueOf = null;
                                            }
                                            if (objValueOf == null) {
                                                objValueOf = "";
                                            }
                                            H2.b(AbstractC2510o.J0("← EP " + objValueOf).toString(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, c0510p9, 0, 3120, 120830);
                                        }
                                        break;
                                    default:
                                        C0510p c0510p10 = (C0510p) obj9;
                                        int iIntValue9 = ((Integer) obj10).intValue();
                                        kotlin.jvm.internal.l.f("$this$Button", (g0) obj8);
                                        if ((iIntValue9 & 17) == 16 && c0510p10.y()) {
                                            c0510p10.M();
                                        } else {
                                            int n8 = episodeRef2.getN();
                                            Object objValueOf2 = Integer.valueOf(n8);
                                            if (n8 <= 0) {
                                                objValueOf2 = null;
                                            }
                                            if (objValueOf2 == null) {
                                                objValueOf2 = "";
                                            }
                                            H2.b(AbstractC2510o.J0("EP " + objValueOf2 + " →").toString(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, c0510p10, 0, 3120, 120830);
                                        }
                                        break;
                                }
                                return O3.C.a;
                            }
                        }, c0510p8), c0510p8, 805306368, 508);
                        layoutWeightElement = layoutWeightElement2;
                        c0510p = c0510p8;
                        c0510p.p(false);
                    } else {
                        layoutWeightElement = layoutWeightElement2;
                        c0510p = c0510p8;
                        c0510p.R(-78530275);
                        AbstractC2123b.a(c0510p, layoutWeightElement);
                        c0510p.p(false);
                    }
                    final EpisodeRef episodeRef3 = (EpisodeRef) obj6;
                    if (episodeRef3 != null) {
                        c0510p.R(-78414428);
                        boolean zF7 = c0510p.f(kVar2) | c0510p.f(episodeRef3);
                        Object objH8 = c0510p.H();
                        if (zF7 || objH8 == obj4) {
                            objH8 = new C2004k(kVar2, episodeRef3, 3);
                            c0510p.b0(objH8);
                        }
                        E0.b((InterfaceC0821a) objH8, layoutWeightElement, false, null, null, null, null, null, W.f.b(795821189, new e4.o() { // from class: s3.r
                            @Override // e4.o
                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                switch (i8) {
                                    case 0:
                                        C0510p c0510p9 = (C0510p) obj9;
                                        int iIntValue8 = ((Integer) obj10).intValue();
                                        kotlin.jvm.internal.l.f("$this$OutlinedButton", (g0) obj8);
                                        if ((iIntValue8 & 17) == 16 && c0510p9.y()) {
                                            c0510p9.M();
                                        } else {
                                            int n7 = episodeRef3.getN();
                                            Object objValueOf = Integer.valueOf(n7);
                                            if (n7 <= 0) {
                                                objValueOf = null;
                                            }
                                            if (objValueOf == null) {
                                                objValueOf = "";
                                            }
                                            H2.b(AbstractC2510o.J0("← EP " + objValueOf).toString(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, c0510p9, 0, 3120, 120830);
                                        }
                                        break;
                                    default:
                                        C0510p c0510p10 = (C0510p) obj9;
                                        int iIntValue9 = ((Integer) obj10).intValue();
                                        kotlin.jvm.internal.l.f("$this$Button", (g0) obj8);
                                        if ((iIntValue9 & 17) == 16 && c0510p10.y()) {
                                            c0510p10.M();
                                        } else {
                                            int n8 = episodeRef3.getN();
                                            Object objValueOf2 = Integer.valueOf(n8);
                                            if (n8 <= 0) {
                                                objValueOf2 = null;
                                            }
                                            if (objValueOf2 == null) {
                                                objValueOf2 = "";
                                            }
                                            H2.b(AbstractC2510o.J0("EP " + objValueOf2 + " →").toString(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, c0510p10, 0, 3120, 120830);
                                        }
                                        break;
                                }
                                return O3.C.a;
                            }
                        }, c0510p), c0510p, 805306368, 508);
                        c0510p.p(false);
                    } else {
                        c0510p.R(-77923171);
                        AbstractC2123b.a(c0510p, layoutWeightElement);
                        c0510p.p(false);
                    }
                    c0510p.p(true);
                }
                return c2;
            case 7:
                C0510p c0510p9 = (C0510p) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue8 & 17) == 16 && c0510p9.y()) {
                    c0510p9.M();
                } else {
                    v.Z zA = androidx.compose.foundation.layout.a.a(16, 2);
                    float f13 = 8;
                    C2127f c2127fG = AbstractC2130i.g(f13);
                    List list3 = (List) obj5;
                    String str4 = (String) obj7;
                    e4.k kVar3 = (e4.k) obj6;
                    boolean zH = c0510p9.h(list3) | c0510p9.f(str4) | c0510p9.f(kVar3);
                    Object objH9 = c0510p9.H();
                    if (zH || objH9 == obj4) {
                        objH9 = new io.github.jan.supabase.auth.d(list3, str4, kVar3);
                        c0510p9.b0(objH9);
                    }
                    AbstractC0847h.b(null, null, zA, c2127fG, null, null, false, (e4.k) objH9, c0510p9, 24960, 235);
                    AbstractC2123b.a(c0510p9, androidx.compose.foundation.layout.c.e(nVar, f13));
                }
                return c2;
            case 8:
                C0510p c0510p10 = (C0510p) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue9 & 17) == 16 && c0510p10.y()) {
                    c0510p10.M();
                } else {
                    AbstractC2123b.a(c0510p10, androidx.compose.foundation.layout.c.e(nVar, 8));
                    r3.n.c((String) obj7, (String) obj6, (InterfaceC0821a) obj5, null, c0510p10, 0, 8);
                }
                return c2;
            default:
                C0510p c0510p11 = (C0510p) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue10 & 17) == 16 && c0510p11.y()) {
                    c0510p11.M();
                } else {
                    D3.t.e("Lanjutkan menonton", null, W.f.b(-64555725, new C0026b(13, (Z) obj7), c0510p11), W.f.b(-1771549374, new A3.m((Z) obj6, (e4.k) obj5, i8), c0510p11), c0510p11, 3462, 2);
                }
                return c2;
        }
    }

    public /* synthetic */ C0027c(Object obj, Object obj2, O3.e eVar, int i7) {
        this.f457k = i7;
        this.f459m = obj;
        this.f460n = obj2;
        this.f458l = eVar;
    }

    public /* synthetic */ C0027c(Object obj, Object obj2, Object obj3, int i7) {
        this.f457k = i7;
        this.f458l = obj;
        this.f459m = obj2;
        this.f460n = obj3;
    }
}
