package a0;

/* loaded from: classes.dex */
public final class k implements q {
    public final q a;

    /* renamed from: b, reason: collision with root package name */
    public final q f10399b;

    public k(q qVar, q qVar2) {
        this.a = qVar;
        this.f10399b = qVar2;
    }

    @Override // a0.q
    public final Object a(Object obj, e4.n nVar) {
        return this.f10399b.a(this.a.a(obj, nVar), nVar);
    }

    @Override // a0.q
    public final boolean d(e4.k kVar) {
        return this.a.d(kVar) && this.f10399b.d(kVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.l.a(this.a, kVar.a) && kotlin.jvm.internal.l.a(this.f10399b, kVar.f10399b);
    }

    public final int hashCode() {
        return (this.f10399b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("["), (String) a("", j.f10398l), ']');
    }
}
