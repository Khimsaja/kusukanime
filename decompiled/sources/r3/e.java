package r3;

import L.AbstractC0384j0;
import L.N;
import L.P;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import O3.C;
import P3.r;
import a0.q;
import b1.AbstractC0703b;
import h0.AbstractC0968M;
import h0.C0998u;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14870k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f14871l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f14872m;

    public /* synthetic */ e(String str, String str2) {
        this.f14871l = str;
        this.f14872m = str2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C2361h c2361h;
        switch (this.f14870k) {
            case 0:
                ((Integer) obj2).getClass();
                n.a(this.f14871l, this.f14872m, (C0510p) obj, C0486d.V(385));
                break;
            default:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    a0.n nVar = a0.n.a;
                    float f5 = 64;
                    q qVarJ = androidx.compose.foundation.layout.c.j(nVar, f5);
                    a0.i iVar = a0.b.f10385o;
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
                    int i7 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    q qVarC = a0.a.c(c0510p, qVarJ);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C2361h c2361h2 = C2363j.f17875f;
                    C0486d.R(c0510p, c2361h2, interfaceC2173HE);
                    C2361h c2361h3 = C2363j.f17874e;
                    C0486d.R(c0510p, c2361h3, interfaceC0501k0M);
                    C2361h c2361h4 = C2363j.f17876g;
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p, i7, c2361h4);
                    }
                    C2361h c2361h5 = C2363j.f17873d;
                    C0486d.R(c0510p, c2361h5, qVarC);
                    String str = this.f14871l;
                    if (str == null || AbstractC2510o.g0(str)) {
                        c0510p.R(2112641496);
                        c2361h = c2361h5;
                        AbstractC0384j0.a(r.A(), null, null, ((N) c0510p.k(P.a)).f5260s, c0510p, 48, 4);
                        c0510p.p(false);
                    } else {
                        c0510p.R(2112888659);
                        T2.q.b(str, this.f14872m, q0.c.o(androidx.compose.foundation.layout.c.j(nVar, f5), C.e.b(12)), c0510p, 1572864);
                        c0510p.p(false);
                        c2361h = c2361h5;
                    }
                    q qVarB = androidx.compose.foundation.a.b(q0.c.o(androidx.compose.foundation.layout.c.j(nVar, 24), C.e.a), C0998u.b(0.45f, C0998u.f11829b), AbstractC0968M.a);
                    InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar, false);
                    int i8 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
                    q qVarC2 = a0.a.c(c0510p, qVarB);
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, c2361h2, interfaceC2173HE2);
                    C0486d.R(c0510p, c2361h3, interfaceC0501k0M2);
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p, i8, c2361h4);
                    }
                    C0486d.R(c0510p, c2361h, qVarC2);
                    AbstractC0384j0.a(r.A(), null, androidx.compose.foundation.layout.c.j(nVar, 15), C0998u.f11830c, c0510p, 3504, 0);
                    c0510p.p(true);
                    c0510p.p(true);
                }
                break;
        }
        return C.a;
    }

    public /* synthetic */ e(String str, String str2, int i7) {
        this.f14871l = str;
        this.f14872m = str2;
    }
}
