package g0;

import f6.AbstractC0915m;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0932a {
    public static final long a = AbstractC0915m.a(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11654b = 0;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final float b(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    public static final float c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static String d(long j7) {
        if (b(j7) == c(j7)) {
            return "CornerRadius.circular(" + e3.c.K(b(j7)) + ')';
        }
        return "CornerRadius.elliptical(" + e3.c.K(b(j7)) + ", " + e3.c.K(c(j7)) + ')';
    }
}
