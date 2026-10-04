package K;

import L.Y;
import L.Z;
import l4.AbstractC1420H;
import m.C1502w;
import y0.AbstractC2359f;
import y0.C2351F;
import y0.InterfaceC2365l;
import y0.InterfaceC2368o;
import y0.InterfaceC2374v;

/* loaded from: classes.dex */
public abstract class w extends a0.p implements InterfaceC2365l, InterfaceC2368o, InterfaceC2374v {

    /* renamed from: A, reason: collision with root package name */
    public final Y f4426A;

    /* renamed from: B, reason: collision with root package name */
    public final Z f4427B;

    /* renamed from: C, reason: collision with root package name */
    public F1.m f4428C;

    /* renamed from: D, reason: collision with root package name */
    public float f4429D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4431F;

    /* renamed from: x, reason: collision with root package name */
    public final u.j f4433x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f4434y;

    /* renamed from: z, reason: collision with root package name */
    public final float f4435z;

    /* renamed from: E, reason: collision with root package name */
    public long f4430E = 0;

    /* renamed from: G, reason: collision with root package name */
    public final C1502w f4432G = new C1502w();

    public w(u.j jVar, boolean z7, float f5, Y y7, Z z8) {
        this.f4433x = jVar;
        this.f4434y = z7;
        this.f4435z = f5;
        this.f4426A = y7;
        this.f4427B = z8;
    }

    public abstract void G0(u.m mVar, long j7, float f5);

    public abstract void H0(C2351F c2351f);

    public final void I0(u.o oVar) {
        if (oVar instanceof u.m) {
            G0((u.m) oVar, this.f4430E, this.f4429D);
        } else if (oVar instanceof u.n) {
            J0(((u.n) oVar).a);
        } else if (oVar instanceof u.l) {
            J0(((u.l) oVar).a);
        }
    }

    public abstract void J0(u.m mVar);

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        c2351f.b();
        F1.m mVar = this.f4428C;
        if (mVar != null) {
            mVar.i(c2351f, this.f4429D, this.f4426A.a());
        }
        H0(c2351f);
    }

    @Override // y0.InterfaceC2374v
    public final void r(long j7) {
        this.f4431F = true;
        T0.b bVar = AbstractC2359f.v(this).f17655B;
        this.f4430E = AbstractC1420H.O(j7);
        float f5 = this.f4435z;
        this.f4429D = Float.isNaN(f5) ? q.a(bVar, this.f4434y, this.f4430E) : bVar.x(f5);
        C1502w c1502w = this.f4432G;
        Object[] objArr = c1502w.a;
        int i7 = c1502w.f12934b;
        for (int i8 = 0; i8 < i7; i8++) {
            I0((u.o) objArr[i8]);
        }
        P3.m.c0(c1502w.a, 0, c1502w.f12934b);
        c1502w.f12934b = 0;
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    @Override // a0.p
    public final void y0() {
        H5.D.x(u0(), null, new v(this, null), 3);
    }
}
