package T0;

/* loaded from: classes.dex */
public final class o {
    public final long a;

    public static long a(long j7, float f5, float f7, int i7) {
        if ((i7 & 1) != 0) {
            f5 = Float.intBitsToFloat((int) (j7 >> 32));
        }
        if ((i7 & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    public static final float b(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    public static final float c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static final long d(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String f(long j7) {
        return "(" + b(j7) + ", " + c(j7) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.a == ((o) obj).a;
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
