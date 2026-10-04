package v3;

import D4.S;
import L.AbstractC0384j0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.Q1;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import O3.C;
import b1.AbstractC0703b;
import h0.C0975U;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.e0;
import v.f0;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2151a implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16528k;

    public /* synthetic */ C2151a(int i7) {
        this.f16528k = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        a0.n nVar = a0.n.a;
        C c2 = C.a;
        switch (this.f16528k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                    break;
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                    break;
                }
                break;
            case 2:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p3.y()) {
                    D3.f.j("Rilisan Terbaru", null, null, c0510p3, 6, 6);
                    break;
                } else {
                    c0510p3.M();
                    break;
                }
                break;
            case 3:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p4.y()) {
                    C1538e c1538eB = n6.m.a;
                    if (c1538eB == null) {
                        C1537d c1537d = new C1537d("Filled.ArrowBack", false);
                        int i7 = AbstractC1530A.a;
                        C0975U c0975u = new C0975U(C0998u.f11829b);
                        S s7 = new S(7, false);
                        s7.u(20.0f, 11.0f);
                        s7.q(7.83f);
                        s7.t(5.59f, -5.59f);
                        s7.s(12.0f, 4.0f);
                        s7.t(-8.0f, 8.0f);
                        s7.t(8.0f, 8.0f);
                        s7.t(1.41f, -1.41f);
                        s7.s(7.83f, 13.0f);
                        s7.q(20.0f);
                        s7.A(-2.0f);
                        s7.m();
                        C1537d.a(c1537d, s7.f1530k, c0975u);
                        c1538eB = c1537d.b();
                        n6.m.a = c1538eB;
                    }
                    AbstractC0384j0.a(c1538eB, "Kembali", null, 0L, c0510p4, 48, 12);
                    break;
                } else {
                    c0510p4.M();
                    break;
                }
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p5 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p5.y()) {
                    H2.b("Username", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p5, 6, 0, 131070);
                    break;
                } else {
                    c0510p5.M();
                    break;
                }
                break;
            case 5:
                C0510p c0510p6 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p6.y()) {
                    H2.b("@", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p6, 6, 0, 131070);
                    break;
                } else {
                    c0510p6.M();
                    break;
                }
            case 6:
                C0510p c0510p7 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p7.y()) {
                    H2.b("Nama Profil", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p7, 6, 0, 131070);
                    break;
                } else {
                    c0510p7.M();
                    break;
                }
                break;
            case 7:
                C0510p c0510p8 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p8.y()) {
                    H2.b("Bio", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p8, 6, 0, 131070);
                    break;
                } else {
                    c0510p8.M();
                    break;
                }
            case 8:
                C0510p c0510p9 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p9.y()) {
                    H2.b("Ceritakan anime favoritmu…", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p9, 6, 0, 131070);
                    break;
                } else {
                    c0510p9.M();
                    break;
                }
                break;
            case 9:
                C0510p c0510p10 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p10.y()) {
                    H2.b("BARU", androidx.compose.foundation.layout.a.i(nVar, 8, 3), ((N) c0510p10.k(P.a)).f5243b, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p10.k(N2.a)).f5223o, c0510p10, 54, 0, 65528);
                    break;
                } else {
                    c0510p10.M();
                    break;
                }
            case 10:
                C0510p c0510p11 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p11.y()) {
                    H2.b("Keluar?", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p11, 6, 0, 131070);
                    break;
                } else {
                    c0510p11.M();
                    break;
                }
                break;
            case 11:
                C0510p c0510p12 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p12.y()) {
                    H2.b("Bookmark/riwayat di cloud aman, login lagi buat sinkron.", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p12, 6, 0, 131070);
                    break;
                } else {
                    c0510p12.M();
                    break;
                }
            case 12:
                C0510p c0510p13 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p13.y()) {
                    H2.b("Hapus riwayat?", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p13, 6, 0, 131070);
                    break;
                } else {
                    c0510p13.M();
                    break;
                }
                break;
            case 13:
                C0510p c0510p14 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p14.y()) {
                    H2.b("Semua riwayat tontonan dihapus permanen.", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p14, 6, 0, 131070);
                    break;
                } else {
                    c0510p14.M();
                    break;
                }
            case 14:
                C0510p c0510p15 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p15.y()) {
                    H2.b("Log crash", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p15, 6, 0, 131070);
                    break;
                } else {
                    c0510p15.M();
                    break;
                }
                break;
            case 15:
                C0510p c0510p16 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p16.y()) {
                    float f5 = 16;
                    float f7 = 10;
                    a0.q qVarI = androidx.compose.foundation.layout.a.i(nVar, f5, f7);
                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p16, 48);
                    int i8 = c0510p16.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p16.m();
                    a0.q qVarC = a0.a.c(c0510p16, qVarI);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p16.V();
                    if (c0510p16.f7127O) {
                        c0510p16.l(c2362i);
                    } else {
                        c0510p16.e0();
                    }
                    C0486d.R(c0510p16, C2363j.f17875f, f0VarB);
                    C0486d.R(c0510p16, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p16.f7127O || !kotlin.jvm.internal.l.a(c0510p16.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p16, i8, c2361h);
                    }
                    C0486d.R(c0510p16, C2363j.f17873d, qVarC);
                    long j7 = C0998u.f11830c;
                    Q1.a(androidx.compose.foundation.layout.c.j(nVar, f5), j7, 2, 0L, 0, c0510p16, 438, 24);
                    AbstractC2123b.a(c0510p16, androidx.compose.foundation.layout.c.n(f7));
                    H2.b("Memuat…", null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p16.k(N2.a)).f5221m, c0510p16, 390, 0, 65530);
                    c0510p16.p(true);
                    break;
                } else {
                    c0510p16.M();
                    break;
                }
                break;
            case 16:
                C0510p c0510p17 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p17.y()) {
                    AbstractC0384j0.a(n6.d.D(), "Pengaturan putar", null, C0998u.f11830c, c0510p17, 3120, 4);
                    break;
                } else {
                    c0510p17.M();
                    break;
                }
            default:
                C0510p c0510p18 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p18.y()) {
                    H2.b("Pengaturan", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p18, 6, 0, 131070);
                    break;
                } else {
                    c0510p18.M();
                    break;
                }
                break;
        }
        return c2;
    }
}
