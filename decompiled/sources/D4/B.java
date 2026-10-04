package D4;

/* loaded from: classes.dex */
public final class B extends D {
    public final int a;

    public B(int i7) {
        this.a = i7;
    }

    @Override // D4.D
    public final Object a() {
        return Integer.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && this.a == ((B) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
