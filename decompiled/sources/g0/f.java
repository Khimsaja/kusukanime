package g0;

/* loaded from: classes.dex */
public final class f {
    public final long a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final float b(long j7) {
        if (j7 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float c(long j7) {
        if (j7 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j7 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j7 & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float d(long j7) {
        if (j7 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j7 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final boolean e(long j7) {
        if (j7 == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j8 = j7 & (~((((-9223372034707292160L) & j7) >>> 31) * (-1)));
        return ((j8 & 4294967295L) & (j8 >>> 32)) == 0;
    }

    public static String f(long j7) {
        if (j7 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + e3.c.K(d(j7)) + ", " + e3.c.K(b(j7)) + ')';
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
        return f(this.a);
    }
}
