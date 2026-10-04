package D3;

import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import O3.C;
import b1.AbstractC0703b;
import h0.C0998u;
import v.AbstractC2130i;
import v.C2140t;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1439k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f1440l;

    public /* synthetic */ e(String str, int i7) {
        this.f1439k = i7;
        this.f1440l = str;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1439k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    H2.b(this.f1440l, androidx.compose.foundation.layout.a.i(a0.n.a, 8, 3), ((N) c0510p.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p.k(N2.a)).f5223o, c0510p, 48, 0, 65528);
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    H2.b(this.f1440l, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5223o, c0510p2, 0, 0, 65534);
                }
                break;
            default:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    a0.q qVarH = androidx.compose.foundation.layout.a.h(a0.n.a, 12);
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p3, 0);
                    int i7 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p3.m();
                    a0.q qVarC = a0.a.c(c0510p3, qVarH);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(c2362i);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, C2363j.f17875f, c2140tA);
                    C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p3, i7, c2361h);
                    }
                    C0486d.R(c0510p3, C2363j.f17873d, qVarC);
                    H2.b(this.f1440l, null, C0998u.f11830c, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p3.k(N2.a)).f5217i, c0510p3, 384, 0, 65530);
                    c0510p3.p(true);
                }
                break;
        }
        return C.a;
    }
}
