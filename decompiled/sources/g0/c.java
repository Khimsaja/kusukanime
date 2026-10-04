package g0;

import e5.AbstractC0832b;

/* loaded from: classes.dex */
public final class c {
    public final long a;

    public static long a(long j7, float f5, int i7) {
        float fIntBitsToFloat = (i7 & 1) != 0 ? Float.intBitsToFloat((int) (j7 >> 32)) : 0.0f;
        if ((i7 & 2) != 0) {
            f5 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    public static final boolean b(long j7, long j8) {
        return j7 == j8;
    }

    public static final float c(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    public static final float e(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static final boolean f(long j7) {
        long j8 = j7 & 9223372034707292159L;
        return (((~j8) & (j8 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long g(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final long h(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long i(float f5, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f5;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f5;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String j(long j7) {
        if (!AbstractC0832b.x(j7)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + e3.c.K(d(j7)) + ", " + e3.c.K(e(j7)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.a == ((c) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}
