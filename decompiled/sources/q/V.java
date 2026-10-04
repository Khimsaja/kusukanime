package q;

import O.C0486d;
import O.C0493g0;
import android.view.View;
import e5.AbstractC0832b;
import l4.AbstractC1420H;
import y0.AbstractC2359f;
import y0.C2351F;
import y0.InterfaceC2368o;
import y0.InterfaceC2369p;

/* loaded from: classes.dex */
public final class V extends a0.p implements InterfaceC2369p, InterfaceC2368o, y0.l0, y0.a0 {

    /* renamed from: A, reason: collision with root package name */
    public View f14502A;

    /* renamed from: B, reason: collision with root package name */
    public T0.b f14503B;

    /* renamed from: C, reason: collision with root package name */
    public f0 f14504C;

    /* renamed from: E, reason: collision with root package name */
    public O.E f14506E;

    /* renamed from: G, reason: collision with root package name */
    public T0.j f14508G;

    /* renamed from: H, reason: collision with root package name */
    public J5.e f14509H;

    /* renamed from: x, reason: collision with root package name */
    public H.X f14510x;

    /* renamed from: y, reason: collision with root package name */
    public H.Y f14511y;

    /* renamed from: z, reason: collision with root package name */
    public g0 f14512z;

    /* renamed from: D, reason: collision with root package name */
    public final C0493g0 f14505D = C0486d.K(null, O.T.f7046m);

    /* renamed from: F, reason: collision with root package name */
    public long f14507F = 9205357640488583168L;

    public V(H.X x7, H.Y y7, g0 g0Var) {
        this.f14510x = x7;
        this.f14511y = y7;
        this.f14512z = g0Var;
    }

    @Override // y0.InterfaceC2369p
    public final void E(y0.Y y7) {
        this.f14505D.setValue(y7);
    }

    public final long G0() {
        if (this.f14506E == null) {
            this.f14506E = C0486d.D(new T(this, 0));
        }
        O.E e7 = this.f14506E;
        if (e7 != null) {
            return ((g0.c) e7.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void H0() {
        f0 f0Var = this.f14504C;
        if (f0Var != null) {
            ((h0) f0Var).b();
        }
        View viewX = this.f14502A;
        if (viewX == null) {
            viewX = AbstractC2359f.x(this);
        }
        this.f14502A = viewX;
        T0.b bVar = this.f14503B;
        if (bVar == null) {
            bVar = AbstractC2359f.v(this).f17655B;
        }
        this.f14503B = bVar;
        this.f14504C = this.f14512z.b(viewX, bVar);
        J0();
    }

    public final void I0() {
        T0.b bVar = this.f14503B;
        if (bVar == null) {
            bVar = AbstractC2359f.v(this).f17655B;
            this.f14503B = bVar;
        }
        long j7 = ((g0.c) this.f14510x.invoke(bVar)).a;
        if (!AbstractC0832b.x(j7) || !AbstractC0832b.x(G0())) {
            this.f14507F = 9205357640488583168L;
            f0 f0Var = this.f14504C;
            if (f0Var != null) {
                ((h0) f0Var).b();
                return;
            }
            return;
        }
        this.f14507F = g0.c.h(G0(), j7);
        if (this.f14504C == null) {
            H0();
        }
        f0 f0Var2 = this.f14504C;
        if (f0Var2 != null) {
            f0Var2.a(this.f14507F, 9205357640488583168L);
        }
        J0();
    }

    public final void J0() {
        T0.b bVar;
        f0 f0Var = this.f14504C;
        if (f0Var == null || (bVar = this.f14503B) == null) {
            return;
        }
        h0 h0Var = (h0) f0Var;
        long jC = h0Var.c();
        T0.j jVar = this.f14508G;
        if (jVar != null && jC == jVar.a) {
            return;
        }
        this.f14511y.invoke(new T0.g(bVar.w(AbstractC1420H.O(h0Var.c()))));
        this.f14508G = new T0.j(h0Var.c());
    }

    @Override // y0.a0
    public final void K() {
        AbstractC2359f.s(this, new T(this, 2));
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        c2351f.b();
        J5.e eVar = this.f14509H;
        if (eVar != null) {
            eVar.mo2trySendJP2dKIU(O3.C.a);
        }
    }

    @Override // y0.l0
    public final void y(F0.i iVar) {
        iVar.j(W.a, new T(this, 1));
    }

    @Override // a0.p
    public final void y0() {
        K();
        this.f14509H = P3.F.a(0, 7, null);
        H5.D.x(u0(), null, new U(this, null), 3);
    }

    @Override // a0.p
    public final void z0() {
        f0 f0Var = this.f14504C;
        if (f0Var != null) {
            ((h0) f0Var).b();
        }
        this.f14504C = null;
    }
}
