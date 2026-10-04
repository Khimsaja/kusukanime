package O1;

/* loaded from: classes.dex */
public final class Q {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7308b;

    public Q(int i7, boolean z7) {
        this.a = i7;
        this.f7308b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        Q q6 = (Q) obj;
        return this.a == q6.a && this.f7308b == q6.f7308b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.f7308b ? 1 : 0);
    }
}
