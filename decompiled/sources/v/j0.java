package v;

/* loaded from: classes.dex */
public final class j0 implements m0 {
    public final m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f16454b;

    public j0(m0 m0Var, m0 m0Var2) {
        this.a = m0Var;
        this.f16454b = m0Var2;
    }

    @Override // v.m0
    public final int a(T0.b bVar, T0.k kVar) {
        return Math.max(this.a.a(bVar, kVar), this.f16454b.a(bVar, kVar));
    }

    @Override // v.m0
    public final int b(T0.b bVar, T0.k kVar) {
        return Math.max(this.a.b(bVar, kVar), this.f16454b.b(bVar, kVar));
    }

    @Override // v.m0
    public final int c(T0.b bVar) {
        return Math.max(this.a.c(bVar), this.f16454b.c(bVar));
    }

    @Override // v.m0
    public final int d(T0.b bVar) {
        return Math.max(this.a.d(bVar), this.f16454b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.l.a(j0Var.a, this.a) && kotlin.jvm.internal.l.a(j0Var.f16454b, this.f16454b);
    }

    public final int hashCode() {
        return (this.f16454b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.f16454b + ')';
    }
}
