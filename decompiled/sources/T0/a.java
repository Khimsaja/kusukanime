package T0;

/* loaded from: classes.dex */
public final class a {
    public final long a;

    public /* synthetic */ a(long j7) {
        this.a = j7;
    }

    public static long a(long j7, int i7, int i8, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i7 = j(j7);
        }
        if ((i11 & 2) != 0) {
            i8 = h(j7);
        }
        if ((i11 & 4) != 0) {
            i9 = i(j7);
        }
        if ((i11 & 8) != 0) {
            i10 = g(j7);
        }
        if (!(i9 >= 0 && i7 >= 0)) {
            android.support.v4.media.session.b.H("minHeight(" + i9 + ") and minWidth(" + i7 + ") must be >= 0");
            throw null;
        }
        if (!(i8 >= i7)) {
            android.support.v4.media.session.b.H("maxWidth(" + i8 + ") must be >= minWidth(" + i7 + ')');
            throw null;
        }
        if (i10 >= i9) {
            return q0.c.x(i7, i8, i9, i10);
        }
        android.support.v4.media.session.b.H("maxHeight(" + i10 + ") must be >= minHeight(" + i9 + ')');
        throw null;
    }

    public static final boolean b(long j7, long j8) {
        return j7 == j8;
    }

    public static final boolean c(long j7) {
        int i7 = (int) (3 & j7);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return (((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) != 0;
    }

    public static final boolean d(long j7) {
        int i7 = (int) (3 & j7);
        return (((int) (j7 >> 33)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j7) {
        int i7 = (int) (3 & j7);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i9 = (1 << (18 - i8)) - 1;
        int i10 = ((int) (j7 >> (i8 + 15))) & i9;
        int i11 = ((int) (j7 >> (i8 + 46))) & i9;
        return i10 == (i11 == 0 ? Integer.MAX_VALUE : i11 - 1);
    }

    public static final boolean f(long j7) {
        int i7 = (int) (3 & j7);
        int i8 = (1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1;
        int i9 = ((int) (j7 >> 2)) & i8;
        int i10 = ((int) (j7 >> 33)) & i8;
        return i9 == (i10 == 0 ? Integer.MAX_VALUE : i10 - 1);
    }

    public static final int g(long j7) {
        int i7 = (int) (3 & j7);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i9 = ((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int h(long j7) {
        int i7 = (int) (3 & j7);
        int i8 = (int) (j7 >> 33);
        int i9 = i8 & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    public static final int i(long j7) {
        int i7 = (int) (3 & j7);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return ((int) (j7 >> (i8 + 15))) & ((1 << (18 - i8)) - 1);
    }

    public static final int j(long j7) {
        int i7 = (int) (3 & j7);
        return ((int) (j7 >> 2)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
    }

    public static final boolean k(long j7) {
        int i7 = (int) (3 & j7);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return (((int) (j7 >> 33)) & ((1 << (i8 + 13)) - 1)) - 1 == 0 || (((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) - 1 == 0;
    }

    public static String l(long j7) {
        int iH = h(j7);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j7);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j7));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j7));
        sb.append(", maxHeight = ");
        return A6.b.j(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return l(this.a);
    }
}
