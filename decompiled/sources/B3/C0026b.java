package B3;

import H0.I;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.Z;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import t3.AbstractC2048f;
import u3.AbstractC2077b;
import v.AbstractC2130i;
import v.C2140t;
import w3.AbstractC2210a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* renamed from: B3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0026b implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f455k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f456l;

    public /* synthetic */ C0026b(int i7, Z z7) {
        this.f455k = i7;
        this.f456l = z7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f455k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    Object objH = c0510p.H();
                    if (objH == C0502l.a) {
                        objH = new i(6, this.f456l);
                        c0510p.b0(objH);
                    }
                    E0.b((InterfaceC0821a) objH, null, false, null, null, null, null, null, AbstractC0025a.f442h, c0510p, 805306374, 510);
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    a0.n nVar = a0.n.a;
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
                    int i7 = c0510p2.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
                    a0.q qVarC = a0.a.c(c0510p2, nVar);
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
                    if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p2, i7, c2361h);
                    }
                    C0486d.R(c0510p2, C2363j.f17873d, qVarC);
                    H2.b(AbstractC2510o.I0(3000, (String) this.f456l.getValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5220l, c0510p2, 0, 0, 65534);
                    c0510p2.p(true);
                }
                break;
            case 2:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    Object objH2 = c0510p3.H();
                    if (objH2 == C0502l.a) {
                        objH2 = new i(1, this.f456l);
                        c0510p3.b0(objH2);
                    }
                    E0.b((InterfaceC0821a) objH2, null, false, null, null, null, null, null, AbstractC0025a.f444j, c0510p3, 805306374, 510);
                }
                break;
            case 3:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    Object objH3 = c0510p4.H();
                    if (objH3 == C0502l.a) {
                        objH3 = new i(5, this.f456l);
                        c0510p4.b0(objH3);
                    }
                    E0.h((InterfaceC0821a) objH3, null, false, null, null, null, null, AbstractC0025a.f449o, c0510p4, 805306374, 510);
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p5 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    Object objH4 = c0510p5.H();
                    if (objH4 == C0502l.a) {
                        objH4 = new i(3, this.f456l);
                        c0510p5.b0(objH4);
                    }
                    E0.b((InterfaceC0821a) objH4, null, false, null, null, null, null, null, AbstractC0025a.f452r, c0510p5, 805306374, 510);
                }
                break;
            case 5:
                C0510p c0510p6 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    H2.b(((Boolean) this.f456l.getValue()).booleanValue() ? "Terbaru ▾" : "Terlama ▾", androidx.compose.foundation.layout.a.i(a0.n.a, 12, 6), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p6.k(N2.a)).f5222n, c0510p6, 48, 0, 65532);
                }
                break;
            case 6:
                C0510p c0510p7 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    H2.b(((Boolean) this.f456l.getValue()).booleanValue() ? "Terbaru" : "Terlama", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p7, 0, 0, 131070);
                }
                break;
            case 7:
                C0510p c0510p8 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p8.y()) {
                    c0510p8.M();
                } else {
                    H2.b(((Boolean) this.f456l.getValue()).booleanValue() ? "Terbaru" : "Terlama", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p8, 0, 0, 131070);
                }
                break;
            case 8:
                C0510p c0510p9 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p9.y()) {
                    c0510p9.M();
                } else {
                    Z z7 = this.f456l;
                    if (((String) z7.getValue()).length() > 0) {
                        c0510p9.R(511186500);
                        Object objH5 = c0510p9.H();
                        if (objH5 == C0502l.a) {
                            objH5 = new i(26, z7);
                            c0510p9.b0(objH5);
                        }
                        E0.f((InterfaceC0821a) objH5, null, false, null, AbstractC2048f.f15991c, c0510p9, 196614, 30);
                    } else {
                        c0510p9.R(506093076);
                    }
                    c0510p9.p(false);
                }
                break;
            case 9:
                C0510p c0510p10 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p10.y()) {
                    c0510p10.M();
                } else {
                    Object objH6 = c0510p10.H();
                    if (objH6 == C0502l.a) {
                        objH6 = new i(29, this.f456l);
                        c0510p10.b0(objH6);
                    }
                    E0.h((InterfaceC0821a) objH6, null, false, null, null, null, null, AbstractC2077b.f16257b, c0510p10, 805306374, 510);
                }
                break;
            case 10:
                C0510p c0510p11 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p11.y()) {
                    c0510p11.M();
                } else {
                    H2.b(((String) this.f456l.getValue()).length() + "/40", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p11, 0, 0, 131070);
                }
                break;
            case 11:
                C0510p c0510p12 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p12.y()) {
                    c0510p12.M();
                } else {
                    H2.b(((String) this.f456l.getValue()).length() + "/200", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p12, 0, 0, 131070);
                }
                break;
            case 12:
                C0510p c0510p13 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p13.y()) {
                    c0510p13.M();
                } else {
                    Object objH7 = c0510p13.H();
                    if (objH7 == C0502l.a) {
                        objH7 = new w3.m(3, this.f456l);
                        c0510p13.b0(objH7);
                    }
                    E0.h((InterfaceC0821a) objH7, null, false, null, null, null, null, AbstractC2210a.f16945q, c0510p13, 805306374, 510);
                }
                break;
            case 13:
                C0510p c0510p14 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p14.y()) {
                    c0510p14.M();
                } else {
                    I i8 = ((M2) c0510p14.k(N2.a)).f5222n;
                    long j7 = ((N) c0510p14.k(P.a)).f5264w;
                    a0.n nVar2 = a0.n.a;
                    Object objH8 = c0510p14.H();
                    if (objH8 == C0502l.a) {
                        objH8 = new w3.m(5, this.f456l);
                        c0510p14.b0(objH8);
                    }
                    H2.b("Hapus", androidx.compose.foundation.layout.a.i(D3.f.k(nVar2, (InterfaceC0821a) objH8), 12, 8), j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, i8, c0510p14, 6, 0, 65528);
                }
                break;
            case 14:
                C0510p c0510p15 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p15.y()) {
                    c0510p15.M();
                } else {
                    Object objH9 = c0510p15.H();
                    if (objH9 == C0502l.a) {
                        objH9 = new w3.m(4, this.f456l);
                        c0510p15.b0(objH9);
                    }
                    E0.h((InterfaceC0821a) objH9, null, false, null, null, null, null, AbstractC2210a.f16949u, c0510p15, 805306374, 510);
                }
                break;
            case 15:
                C0510p c0510p16 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p16.y()) {
                    c0510p16.M();
                } else {
                    Object objH10 = c0510p16.H();
                    if (objH10 == C0502l.a) {
                        objH10 = new w3.m(1, this.f456l);
                        c0510p16.b0(objH10);
                    }
                    E0.b((InterfaceC0821a) objH10, null, false, null, null, null, null, null, AbstractC2210a.f16952x, c0510p16, 805306374, 510);
                }
                break;
            default:
                C0510p c0510p17 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p17.y()) {
                    c0510p17.M();
                } else {
                    H2.b(AbstractC2510o.I0(3000, (String) this.f456l.getValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p17.k(N2.a)).f5220l, c0510p17, 0, 0, 65534);
                }
                break;
        }
        return O3.C.a;
    }
}
