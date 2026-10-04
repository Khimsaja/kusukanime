package O1;

/* loaded from: classes.dex */
public final class e0 implements a0 {

    /* renamed from: k, reason: collision with root package name */
    public final a0 f7435k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7436l;

    public e0(a0 a0Var, long j7) {
        this.f7435k = a0Var;
        this.f7436l = j7;
    }

    @Override // O1.a0
    public final int d(F.w wVar, G1.f fVar, int i7) {
        int iD = this.f7435k.d(wVar, fVar, i7);
        if (iD == -4) {
            fVar.f2611q += this.f7436l;
        }
        return iD;
    }

    @Override // O1.a0
    public final boolean f() {
        return this.f7435k.f();
    }

    @Override // O1.a0
    public final void h() {
        this.f7435k.h();
    }

    @Override // O1.a0
    public final int j(long j7) {
        return this.f7435k.j(j7 - this.f7436l);
    }
}
