package Y;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: e, reason: collision with root package name */
    public final e4.k f9978e;

    /* renamed from: f, reason: collision with root package name */
    public int f9979f;

    public g(int i7, m mVar, e4.k kVar) {
        super(i7, mVar);
        this.f9978e = kVar;
        this.f9979f = 1;
    }

    @Override // Y.h
    public final void c() {
        if (this.f9981c) {
            return;
        }
        l();
        this.f9981c = true;
        synchronized (o.f10002b) {
            int i7 = this.f9982d;
            if (i7 >= 0) {
                o.u(i7);
                this.f9982d = -1;
            }
        }
    }

    @Override // Y.h
    public final e4.k f() {
        return this.f9978e;
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
        this.f9979f++;
    }

    @Override // Y.h
    public final void l() {
        int i7 = this.f9979f - 1;
        this.f9979f = i7;
        if (i7 == 0) {
            a();
        }
    }

    @Override // Y.h
    public final void n(v vVar) {
        B2.l lVar = o.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // Y.h
    public final h t(e4.k kVar) {
        o.d(this);
        return new f(this.f9980b, this.a, o.l(kVar, this.f9978e, true), this);
    }

    @Override // Y.h
    public final void m() {
    }
}
