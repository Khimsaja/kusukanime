package D4;

/* loaded from: classes.dex */
public final class K extends D {
    public final short a;

    public K(short s7) {
        this.a = s7;
    }

    @Override // D4.D
    public final Object a() {
        return new O3.A(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && this.a == ((K) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
