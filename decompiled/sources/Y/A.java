package Y;

import O.C0486d;

/* loaded from: classes.dex */
public final class A extends h {

    /* renamed from: e, reason: collision with root package name */
    public final h f9955e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9956f;

    /* renamed from: g, reason: collision with root package name */
    public e4.k f9957g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9958h;

    public A(h hVar, e4.k kVar, boolean z7) {
        e4.k kVarF;
        super(0, m.f9994o);
        this.f9955e = hVar;
        this.f9956f = z7;
        this.f9957g = o.l(kVar, (hVar == null || (kVarF = hVar.f()) == null) ? ((c) o.f10009i.get()).f9965e : kVarF, false);
        this.f9958h = C0486d.z();
    }

    @Override // Y.h
    public final void c() {
        h hVar;
        this.f9981c = true;
        if (!this.f9956f || (hVar = this.f9955e) == null) {
            return;
        }
        hVar.c();
    }

    @Override // Y.h
    public final int d() {
        return u().d();
    }

    @Override // Y.h
    public final m e() {
        return u().e();
    }

    @Override // Y.h
    public final e4.k f() {
        return this.f9957g;
    }

    @Override // Y.h
    public final boolean g() {
        return u().g();
    }

    @Override // Y.h
    public final e4.k i() {
        return null;
    }

    @Override // Y.h
    public final void k() {
        s.g();
        throw null;
    }

    @Override // Y.h
    public final void l() {
        s.g();
        throw null;
    }

    @Override // Y.h
    public final void m() {
        u().m();
    }

    @Override // Y.h
    public final void n(v vVar) {
        u().n(vVar);
    }

    @Override // Y.h
    public final h t(e4.k kVar) {
        return o.h(u().t(null), o.l(kVar, this.f9957g, true), true);
    }

    public final h u() {
        h hVar = this.f9955e;
        return hVar == null ? (h) o.f10009i.get() : hVar;
    }
}
