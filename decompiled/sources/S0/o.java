package S0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final o f8720c = new o(n6.d.F(0), n6.d.F(0));
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8721b;

    public o(long j7, long j8) {
        this.a = j7;
        this.f8721b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return T0.m.a(this.a, oVar.a) && T0.m.a(this.f8721b, oVar.f8721b);
    }

    public final int hashCode() {
        T0.n[] nVarArr = T0.m.f8847b;
        return Long.hashCode(this.f8721b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) T0.m.d(this.a)) + ", restLine=" + ((Object) T0.m.d(this.f8721b)) + ')';
    }
}
