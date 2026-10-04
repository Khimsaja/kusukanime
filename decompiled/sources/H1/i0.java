package H1;

import O1.AbstractC0543q;
import y1.C2380b;
import y1.C2398u;
import y1.C2401x;

/* loaded from: classes.dex */
public final class i0 extends AbstractC0543q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3505c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3506d;

    public i0(y1.P p7, C2401x c2401x) {
        super(p7);
        this.f3506d = c2401x;
    }

    @Override // O1.AbstractC0543q, y1.P
    public y1.N f(int i7, y1.N n7, boolean z7) {
        switch (this.f3505c) {
            case 0:
                y1.P p7 = this.f7481b;
                y1.N nF = p7.f(i7, n7, z7);
                if (p7.m(nF.f17948c, (y1.O) this.f3506d, 0L).a()) {
                    nF.h(n7.a, n7.f17947b, n7.f17948c, n7.f17949d, n7.f17950e, C2380b.f18024c, true);
                } else {
                    nF.f17951f = true;
                }
                return nF;
            default:
                return super.f(i7, n7, z7);
        }
    }

    @Override // O1.AbstractC0543q, y1.P
    public y1.O m(int i7, y1.O o7, long j7) {
        switch (this.f3505c) {
            case 1:
                super.m(i7, o7, j7);
                C2401x c2401x = (C2401x) this.f3506d;
                o7.f17956c = c2401x;
                C2398u c2398u = c2401x.f18138b;
                o7.getClass();
                return o7;
            default:
                return super.m(i7, o7, j7);
        }
    }

    public i0(y1.P p7) {
        super(p7);
        this.f3506d = new y1.O();
    }
}
