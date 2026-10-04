package D4;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f1572c = new c0(null, null);
    public final e0 a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f1573b;

    public c0(e0 e0Var, a0 a0Var) {
        this.a = e0Var;
        this.f1573b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a == c0Var.a && kotlin.jvm.internal.l.a(this.f1573b, c0Var.f1573b);
    }

    public final int hashCode() {
        e0 e0Var = this.a;
        int iHashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        a0 a0Var = this.f1573b;
        return iHashCode + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.a + ", type=" + this.f1573b + ')';
    }
}
