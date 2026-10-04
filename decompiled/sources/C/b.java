package C;

/* loaded from: classes.dex */
public final class b implements a {
    public final float a;

    public b(float f5) {
        this.a = f5;
    }

    @Override // C.a
    public final float a(long j7, T0.b bVar) {
        return bVar.x(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && T0.e.a(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
