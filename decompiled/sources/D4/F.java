package D4;

/* loaded from: classes.dex */
public final class F extends D {
    public final short a;

    public F(short s7) {
        this.a = s7;
    }

    @Override // D4.D
    public final Object a() {
        return Short.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && this.a == ((F) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
