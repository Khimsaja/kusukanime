package D4;

/* loaded from: classes.dex */
public final class H extends D {
    public final byte a;

    public H(byte b4) {
        this.a = b4;
    }

    @Override // D4.D
    public final Object a() {
        return new O3.s(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.a == ((H) obj).a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
