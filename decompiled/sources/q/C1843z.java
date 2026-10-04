package q;

import h0.C0998u;
import j0.C1296b;
import j0.InterfaceC1298d;
import y0.C2351F;
import y0.InterfaceC2368o;

/* renamed from: q.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1843z extends a0.p implements InterfaceC2368o {

    /* renamed from: A, reason: collision with root package name */
    public boolean f14654A;

    /* renamed from: x, reason: collision with root package name */
    public final u.j f14655x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14656y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14657z;

    public C1843z(u.j jVar) {
        this.f14655x = jVar;
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        c2351f.b();
        boolean z7 = this.f14656y;
        C1296b c1296b = c2351f.f17696k;
        if (z7) {
            InterfaceC1298d.R(c2351f, C0998u.b(0.3f, C0998u.f11829b), 0L, c1296b.d(), 0.0f, 122);
        } else if (this.f14657z || this.f14654A) {
            InterfaceC1298d.R(c2351f, C0998u.b(0.1f, C0998u.f11829b), 0L, c1296b.d(), 0.0f, 122);
        }
    }

    @Override // a0.p
    public final void y0() {
        H5.D.x(u0(), null, new C1842y(this, null), 3);
    }
}
