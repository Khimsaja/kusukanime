package T0;

/* loaded from: classes.dex */
public final class f {
    public final long a;

    public static String a(long j7) {
        if (j7 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.b(Float.intBitsToFloat((int) (j7 >> 32)))) + ", " + ((Object) e.b(Float.intBitsToFloat((int) (j7 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.a == ((f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
