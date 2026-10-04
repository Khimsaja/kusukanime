package D;

import e5.AbstractC0832b;

/* loaded from: classes.dex */
public final class N0 {
    public final H0.F a;

    /* renamed from: b, reason: collision with root package name */
    public w0.r f1080b = null;

    /* renamed from: c, reason: collision with root package name */
    public w0.r f1081c;

    public N0(H0.F f5, w0.r rVar) {
        this.a = f5;
        this.f1081c = rVar;
    }

    public final long a(long j7) {
        g0.d dVarK;
        w0.r rVar = this.f1080b;
        g0.d dVar = g0.d.f11658e;
        if (rVar != null) {
            if (rVar.B()) {
                w0.r rVar2 = this.f1081c;
                dVarK = rVar2 != null ? rVar2.K(rVar, true) : null;
            } else {
                dVarK = dVar;
            }
            if (dVarK != null) {
                dVar = dVarK;
            }
        }
        float fD = g0.c.d(j7);
        float fD2 = dVar.a;
        if (fD >= fD2) {
            float fD3 = g0.c.d(j7);
            fD2 = dVar.f11660c;
            if (fD3 <= fD2) {
                fD2 = g0.c.d(j7);
            }
        }
        float fE = g0.c.e(j7);
        float fE2 = dVar.f11659b;
        if (fE >= fE2) {
            float fE3 = g0.c.e(j7);
            fE2 = dVar.f11661d;
            if (fE3 <= fE2) {
                fE2 = g0.c.e(j7);
            }
        }
        return AbstractC0832b.e(fD2, fE2);
    }

    public final int b(long j7, boolean z7) {
        if (z7) {
            j7 = a(j7);
        }
        return this.a.f3083b.e(d(j7));
    }

    public final boolean c(long j7) {
        long jD = d(a(j7));
        float fE = g0.c.e(jD);
        H0.F f5 = this.a;
        int iC = f5.f3083b.c(fE);
        return g0.c.d(jD) >= f5.f(iC) && g0.c.d(jD) <= f5.g(iC);
    }

    public final long d(long j7) {
        w0.r rVar;
        w0.r rVar2 = this.f1080b;
        if (rVar2 == null) {
            return j7;
        }
        if (!rVar2.B()) {
            rVar2 = null;
        }
        if (rVar2 == null || (rVar = this.f1081c) == null) {
            return j7;
        }
        w0.r rVar3 = rVar.B() ? rVar : null;
        return rVar3 == null ? j7 : rVar2.k(rVar3, j7);
    }

    public final long e(long j7) {
        w0.r rVar;
        w0.r rVar2 = this.f1080b;
        if (rVar2 == null) {
            return j7;
        }
        if (!rVar2.B()) {
            rVar2 = null;
        }
        if (rVar2 == null || (rVar = this.f1081c) == null) {
            return j7;
        }
        w0.r rVar3 = rVar.B() ? rVar : null;
        return rVar3 == null ? j7 : rVar3.k(rVar2, j7);
    }
}
