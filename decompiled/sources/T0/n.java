package T0;

/* loaded from: classes.dex */
public final class n {
    public final long a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static String b(long j7) {
        return a(j7, 0L) ? "Unspecified" : a(j7, 4294967296L) ? "Sp" : a(j7, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.a == ((n) obj).a;
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
