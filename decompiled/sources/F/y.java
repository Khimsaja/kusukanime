package F;

import D.C0053g0;
import H.S;
import O.C0486d;
import O.C0493g0;
import O.T;
import y0.InterfaceC2365l;
import y0.InterfaceC2366m;
import y0.InterfaceC2369p;
import y0.Y;

/* loaded from: classes.dex */
public final class y extends a0.p implements InterfaceC2365l, InterfaceC2369p, InterfaceC2366m {

    /* renamed from: A, reason: collision with root package name */
    public final C0493g0 f2042A = C0486d.K(null, T.f7049p);

    /* renamed from: x, reason: collision with root package name */
    public C0144g f2043x;

    /* renamed from: y, reason: collision with root package name */
    public C0053g0 f2044y;

    /* renamed from: z, reason: collision with root package name */
    public S f2045z;

    public y(C0144g c0144g, C0053g0 c0053g0, S s7) {
        this.f2043x = c0144g;
        this.f2044y = c0053g0;
        this.f2045z = s7;
    }

    @Override // y0.InterfaceC2369p
    public final void E(Y y7) {
        this.f2042A.setValue(y7);
    }

    @Override // a0.p
    public final void y0() {
        C0144g c0144g = this.f2043x;
        if (c0144g.a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        c0144g.a = this;
    }

    @Override // a0.p
    public final void z0() {
        this.f2043x.k(this);
    }
}
