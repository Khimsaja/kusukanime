package H4;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f3746d = new s(B.f3684n, 6);
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.h f3747b;

    /* renamed from: c, reason: collision with root package name */
    public final B f3748c;

    public s(B b4, O3.h hVar, B b7) {
        this.a = b4;
        this.f3747b = hVar;
        this.f3748c = b7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && kotlin.jvm.internal.l.a(this.f3747b, sVar.f3747b) && this.f3748c == sVar.f3748c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        O3.h hVar = this.f3747b;
        return this.f3748c.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.f7524n)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.f3747b + ", reportLevelAfter=" + this.f3748c + ')';
    }

    public s(B b4, int i7) {
        this(b4, (i7 & 2) != 0 ? new O3.h(1, 0, 0) : null, b4);
    }
}
