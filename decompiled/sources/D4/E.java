package D4;

/* loaded from: classes.dex */
public final class E extends D {
    public final long a;

    public E(long j7) {
        this.a = j7;
    }

    @Override // D4.D
    public final Object a() {
        return Long.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && this.a == ((E) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
