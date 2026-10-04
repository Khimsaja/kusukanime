package M;

import O.C0486d;
import O.C0493g0;
import v.C2122a;
import v.m0;

/* loaded from: classes.dex */
public final class G implements m0 {
    public final C0493g0 a;

    public G(C2122a c2122a) {
        this.a = C0486d.K(c2122a, O.T.f7049p);
    }

    @Override // v.m0
    public final int a(T0.b bVar, T0.k kVar) {
        return ((m0) this.a.getValue()).a(bVar, kVar);
    }

    @Override // v.m0
    public final int b(T0.b bVar, T0.k kVar) {
        return ((m0) this.a.getValue()).b(bVar, kVar);
    }

    @Override // v.m0
    public final int c(T0.b bVar) {
        return ((m0) this.a.getValue()).c(bVar);
    }

    @Override // v.m0
    public final int d(T0.b bVar) {
        return ((m0) this.a.getValue()).d(bVar);
    }
}
