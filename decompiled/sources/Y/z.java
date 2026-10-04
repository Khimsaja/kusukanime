package Y;

import O.C0486d;
import m.C1472B;

/* loaded from: classes.dex */
public final class z extends d {

    /* renamed from: o, reason: collision with root package name */
    public final d f10041o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f10042p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f10043q;

    /* renamed from: r, reason: collision with root package name */
    public e4.k f10044r;

    /* renamed from: s, reason: collision with root package name */
    public e4.k f10045s;

    /* renamed from: t, reason: collision with root package name */
    public final long f10046t;

    public z(d dVar, e4.k kVar, e4.k kVar2, boolean z7, boolean z8) {
        e4.k kVarI;
        e4.k kVarF;
        super(0, m.f9994o, o.l(kVar, (dVar == null || (kVarF = dVar.f()) == null) ? ((c) o.f10009i.get()).f9965e : kVarF, z7), o.b(kVar2, (dVar == null || (kVarI = dVar.i()) == null) ? ((c) o.f10009i.get()).f9966f : kVarI));
        this.f10041o = dVar;
        this.f10042p = z7;
        this.f10043q = z8;
        this.f10044r = this.f9965e;
        this.f10045s = this.f9966f;
        this.f10046t = C0486d.z();
    }

    @Override // Y.d
    public final void A(C1472B c1472b) {
        s.g();
        throw null;
    }

    @Override // Y.d
    public final d B(e4.k kVar, e4.k kVar2) {
        e4.k kVarL = o.l(kVar, this.f10044r, true);
        e4.k kVarB = o.b(kVar2, this.f10045s);
        return !this.f10042p ? new z(C().B(null, kVarB), kVarL, kVarB, false, true) : C().B(kVarL, kVarB);
    }

    public final d C() {
        d dVar = this.f10041o;
        return dVar == null ? (d) o.f10009i.get() : dVar;
    }

    @Override // Y.d, Y.h
    public final void c() {
        d dVar;
        this.f9981c = true;
        if (!this.f10043q || (dVar = this.f10041o) == null) {
            return;
        }
        dVar.c();
    }

    @Override // Y.h
    public final int d() {
        return C().d();
    }

    @Override // Y.h
    public final m e() {
        return C().e();
    }

    @Override // Y.d, Y.h
    public final e4.k f() {
        return this.f10044r;
    }

    @Override // Y.d, Y.h
    public final boolean g() {
        return C().g();
    }

    @Override // Y.d, Y.h
    public final int h() {
        return C().h();
    }

    @Override // Y.d, Y.h
    public final e4.k i() {
        return this.f10045s;
    }

    @Override // Y.d, Y.h
    public final void k() {
        s.g();
        throw null;
    }

    @Override // Y.d, Y.h
    public final void l() {
        s.g();
        throw null;
    }

    @Override // Y.d, Y.h
    public final void m() {
        C().m();
    }

    @Override // Y.d, Y.h
    public final void n(v vVar) {
        C().n(vVar);
    }

    @Override // Y.h
    public final void q(int i7) {
        s.g();
        throw null;
    }

    @Override // Y.h
    public final void r(m mVar) {
        s.g();
        throw null;
    }

    @Override // Y.d, Y.h
    public final void s(int i7) {
        C().s(i7);
    }

    @Override // Y.d, Y.h
    public final h t(e4.k kVar) {
        e4.k kVarL = o.l(kVar, this.f10044r, true);
        return !this.f10042p ? o.h(C().t(null), kVarL, true) : C().t(kVarL);
    }

    @Override // Y.d
    public final s v() {
        return C().v();
    }

    @Override // Y.d
    public final C1472B w() {
        return C().w();
    }

    @Override // Y.d
    /* renamed from: x */
    public final e4.k f() {
        return this.f10044r;
    }
}
