package T0;

/* loaded from: classes.dex */
public final class g {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.a == ((g) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j7 = this.a;
        if (j7 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(Float.intBitsToFloat((int) (j7 >> 32)))) + " x " + ((Object) e.b(Float.intBitsToFloat((int) (j7 & 4294967295L))));
    }
}
