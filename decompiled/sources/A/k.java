package A;

import H5.D;
import O3.C;
import a0.p;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import s.C1924l;
import w0.r;
import y0.AbstractC2359f;
import y0.InterfaceC2374v;
import y0.Y;
import y0.o0;

/* loaded from: classes.dex */
public final class k extends p implements a, InterfaceC2374v, o0 {

    /* renamed from: z, reason: collision with root package name */
    public static final e f31z = new e(0);

    /* renamed from: x, reason: collision with root package name */
    public C1924l f32x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f33y;

    public static final g0.d G0(k kVar, Y y7, InterfaceC0821a interfaceC0821a) {
        g0.d dVar;
        if (kVar.f10414w && kVar.f33y) {
            Y yU = AbstractC2359f.u(kVar);
            if (!y7.P0().f10414w) {
                y7 = null;
            }
            if (y7 != null && (dVar = (g0.d) interfaceC0821a.invoke()) != null) {
                g0.d dVarK = yU.K(y7, false);
                return dVar.h(AbstractC0832b.e(dVarK.a, dVarK.f11659b));
            }
        }
        return null;
    }

    @Override // A.a
    public final Object C(Y y7, InterfaceC0821a interfaceC0821a, U3.c cVar) {
        Object objJ = D.j(new i(this, y7, interfaceC0821a, new j(this, y7, interfaceC0821a), null), cVar);
        return objJ == T3.a.f9048k ? objJ : C.a;
    }

    @Override // y0.InterfaceC2374v
    public final void b0(r rVar) {
        this.f33y = true;
    }

    @Override // y0.o0
    public final Object p() {
        return f31z;
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
