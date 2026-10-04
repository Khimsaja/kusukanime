package v;

/* renamed from: v.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145y implements m0 {
    public final m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f16516b;

    public C2145y(m0 m0Var, m0 m0Var2) {
        this.a = m0Var;
        this.f16516b = m0Var2;
    }

    @Override // v.m0
    public final int a(T0.b bVar, T0.k kVar) {
        int iA = this.a.a(bVar, kVar) - this.f16516b.a(bVar, kVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // v.m0
    public final int b(T0.b bVar, T0.k kVar) {
        int iB = this.a.b(bVar, kVar) - this.f16516b.b(bVar, kVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // v.m0
    public final int c(T0.b bVar) {
        int iC = this.a.c(bVar) - this.f16516b.c(bVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // v.m0
    public final int d(T0.b bVar) {
        int iD = this.a.d(bVar) - this.f16516b.d(bVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2145y)) {
            return false;
        }
        C2145y c2145y = (C2145y) obj;
        return kotlin.jvm.internal.l.a(c2145y.a, this.a) && kotlin.jvm.internal.l.a(c2145y.f16516b, this.f16516b);
    }

    public final int hashCode() {
        return this.f16516b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.f16516b + ')';
    }
}
