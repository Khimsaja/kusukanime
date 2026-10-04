package m;

import java.util.ConcurrentModificationException;
import n.AbstractC1529a;

/* renamed from: m.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1493n {
    public static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f12898b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12899c = new Object();

    public static final void a(C1478H c1478h) {
        int i7 = c1478h.f12874n;
        int[] iArr = c1478h.f12872l;
        Object[] objArr = c1478h.f12873m;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f12899c) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        c1478h.f12871k = false;
        c1478h.f12874n = i8;
    }

    public static final void b(C1485f c1485f, int i7) {
        kotlin.jvm.internal.l.f("<this>", c1485f);
        c1485f.f12891k = new int[i7];
        c1485f.f12892l = new Object[i7];
    }

    public static final int c(C1485f c1485f, Object obj, int i7) {
        kotlin.jvm.internal.l.f("<this>", c1485f);
        int i8 = c1485f.f12893m;
        if (i8 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC1529a.a(c1485f.f12893m, i7, c1485f.f12891k);
            if (iA < 0 || kotlin.jvm.internal.l.a(obj, c1485f.f12892l[iA])) {
                return iA;
            }
            int i9 = iA + 1;
            while (i9 < i8 && c1485f.f12891k[i9] == i7) {
                if (kotlin.jvm.internal.l.a(obj, c1485f.f12892l[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = iA - 1; i10 >= 0 && c1485f.f12891k[i10] == i7; i10--) {
                if (kotlin.jvm.internal.l.a(obj, c1485f.f12892l[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
