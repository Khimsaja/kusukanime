package D4;

/* renamed from: D4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105y extends D {
    public final double a;

    public C0105y(double d4) {
        this.a = d4;
    }

    @Override // D4.D
    public final Object a() {
        return Double.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0105y) && Double.compare(this.a, ((C0105y) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
