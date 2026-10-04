package s0;

/* loaded from: classes.dex */
public final class q {
    public final long a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static String b(long j7) {
        return "PointerId(value=" + j7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.a == ((q) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
