package O1;

import y1.C2401x;

/* loaded from: classes.dex */
public abstract class i0 extends AbstractC0537k {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0527a f7455k;

    public i0(AbstractC0527a abstractC0527a) {
        this.f7455k = abstractC0527a;
    }

    public void A() {
        z();
    }

    @Override // O1.AbstractC0527a
    public final y1.P f() {
        return this.f7455k.f();
    }

    @Override // O1.AbstractC0527a
    public final C2401x g() {
        return this.f7455k.g();
    }

    @Override // O1.AbstractC0527a
    public final boolean h() {
        return this.f7455k.h();
    }

    @Override // O1.AbstractC0527a
    public final void k(E1.D d4) {
        this.f7460j = d4;
        this.f7459i = B1.K.l(null);
        A();
    }

    @Override // O1.AbstractC0527a
    public void r(C2401x c2401x) {
        this.f7455k.r(c2401x);
    }

    @Override // O1.AbstractC0537k
    public final B s(Object obj, B b4) {
        return x(b4);
    }

    @Override // O1.AbstractC0537k
    public final long t(long j7, Object obj) {
        return j7;
    }

    @Override // O1.AbstractC0537k
    public final int u(int i7, Object obj) {
        return i7;
    }

    @Override // O1.AbstractC0537k
    public final void v(Object obj, AbstractC0527a abstractC0527a, y1.P p7) {
        y(p7);
    }

    public abstract void y(y1.P p7);

    public final void z() {
        w(null, this.f7455k);
    }

    public B x(B b4) {
        return b4;
    }
}
