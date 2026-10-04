package H1;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f3527c = new k0(0, false);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3528b;

    public k0(int i7, boolean z7) {
        this.a = i7;
        this.f3528b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a == k0Var.a && this.f3528b == k0Var.f3528b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.f3528b ? 1 : 0);
    }
}
