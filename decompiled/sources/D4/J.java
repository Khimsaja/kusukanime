package D4;

/* loaded from: classes.dex */
public final class J extends D {
    public final long a;

    public J(long j7) {
        this.a = j7;
    }

    @Override // D4.D
    public final Object a() {
        return new O3.x(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.a == ((J) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
