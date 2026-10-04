package m;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1475E {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        new C1504y(0);
    }

    public static final void a(long[] jArr, int i7) {
        kotlin.jvm.internal.l.f("metadata", jArr);
        int i8 = (i7 + 7) >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            long j7 = jArr[i9] & (-9187201950435737472L);
            jArr[i9] = (-72340172838076674L) & ((~j7) + (j7 >>> 7));
        }
        int length = jArr.length;
        int i10 = length - 1;
        int i11 = length - 2;
        jArr[i11] = (jArr[i11] & 72057594037927935L) | (-72057594037927936L);
        jArr[i10] = jArr[0];
    }

    public static final int b(long[] jArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("metadata", jArr);
        while (i7 < i8) {
            if (((jArr[i7 >> 3] >> ((i7 & 7) << 3)) & 255) == 128) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final int c(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return i7 - (i7 / 8);
    }

    public static final int d(int i7) {
        if (i7 == 0) {
            return 6;
        }
        return (i7 * 2) + 1;
    }

    public static final int e(int i7) {
        if (i7 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i7);
        }
        return 0;
    }

    public static final int f(int i7) {
        if (i7 == 7) {
            return 8;
        }
        return ((i7 - 1) / 7) + i7;
    }
}
