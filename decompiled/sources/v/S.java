package v;

/* loaded from: classes.dex */
public final class S implements Y {
    public final m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.b f16409b;

    public S(m0 m0Var, T0.b bVar) {
        this.a = m0Var;
        this.f16409b = bVar;
    }

    @Override // v.Y
    public final float a() {
        m0 m0Var = this.a;
        T0.b bVar = this.f16409b;
        return bVar.q0(m0Var.d(bVar));
    }

    @Override // v.Y
    public final float b(T0.k kVar) {
        m0 m0Var = this.a;
        T0.b bVar = this.f16409b;
        return bVar.q0(m0Var.a(bVar, kVar));
    }

    @Override // v.Y
    public final float c() {
        m0 m0Var = this.a;
        T0.b bVar = this.f16409b;
        return bVar.q0(m0Var.c(bVar));
    }

    @Override // v.Y
    public final float d(T0.k kVar) {
        m0 m0Var = this.a;
        T0.b bVar = this.f16409b;
        return bVar.q0(m0Var.b(bVar, kVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s7 = (S) obj;
        return kotlin.jvm.internal.l.a(this.a, s7.a) && kotlin.jvm.internal.l.a(this.f16409b, s7.f16409b);
    }

    public final int hashCode() {
        return this.f16409b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.f16409b + ')';
    }
}
