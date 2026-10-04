package T0;

/* loaded from: classes.dex */
public final class j {
    public final long a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static String b(long j7) {
        return ((int) (j7 >> 32)) + " x " + ((int) (j7 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.a == ((j) obj).a;
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
