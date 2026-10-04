package n;

import io.ktor.http.ContentType;
import kotlin.jvm.internal.l;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1529a {
    public static final int[] a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f13114b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f13115c = new Object[0];

    public static final int a(int i7, int i8, int[] iArr) {
        l.f("array", iArr);
        int i9 = i7 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final int b(long[] jArr, int i7, long j7) {
        l.f("array", jArr);
        int i8 = i7 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            long j8 = jArr[i10];
            if (j8 < j7) {
                i9 = i10 + 1;
            } else {
                if (j8 <= j7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static final void c(String str) {
        l.f(ContentType.Message.TYPE, str);
        throw new IllegalArgumentException(str);
    }
}
