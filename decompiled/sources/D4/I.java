package D4;

/* loaded from: classes.dex */
public final class I extends D {
    public final int a;

    public I(int i7) {
        this.a = i7;
    }

    @Override // D4.D
    public final Object a() {
        return new O3.v(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.a == ((I) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
