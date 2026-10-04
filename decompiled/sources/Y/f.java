package Y;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: e, reason: collision with root package name */
    public final e4.k f9976e;

    /* renamed from: f, reason: collision with root package name */
    public final h f9977f;

    public f(int i7, m mVar, e4.k kVar, h hVar) {
        super(i7, mVar);
        this.f9976e = kVar;
        this.f9977f = hVar;
        hVar.k();
    }

    @Override // Y.h
    public final void c() {
        if (this.f9981c) {
            return;
        }
        int i7 = this.f9980b;
        h hVar = this.f9977f;
        if (i7 != hVar.d()) {
            a();
        }
        hVar.l();
        this.f9981c = true;
        synchronized (o.f10002b) {
            int i8 = this.f9982d;
            if (i8 >= 0) {
                o.u(i8);
                this.f9982d = -1;
            }
        }
    }

    @Override // Y.h
    public final e4.k f() {
        return this.f9976e;
    }

    @Override // Y.h
    public final boolean g() {
        return true;
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
    public final void n(v vVar) {
        B2.l lVar = o.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // Y.h
    public final h t(e4.k kVar) {
        return new f(this.f9980b, this.a, o.l(kVar, this.f9976e, true), this.f9977f);
    }

    @Override // Y.h
    public final void m() {
    }
}
