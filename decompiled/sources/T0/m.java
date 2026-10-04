package T0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f8847b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f8848c = n6.d.T(Float.NaN, 0);
    public final long a;

    public /* synthetic */ m(long j7) {
        this.a = j7;
    }

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final long b(long j7) {
        return f8847b[(int) ((j7 & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static String d(long j7) {
        long jB = b(j7);
        if (n.a(jB, 0L)) {
            return "Unspecified";
        }
        if (n.a(jB, 4294967296L)) {
            return c(j7) + ".sp";
        }
        if (!n.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j7) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.a == ((m) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
