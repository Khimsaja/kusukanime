package v;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2130i {
    public static final M a = new M(4);

    /* renamed from: b, reason: collision with root package name */
    public static final M f16444b = new M(3);

    /* renamed from: c, reason: collision with root package name */
    public static final C2124c f16445c = new C2124c();

    /* renamed from: d, reason: collision with root package name */
    public static final C2125d f16446d = new C2125d(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C2125d f16447e;

    static {
        new C2125d(3);
        f16447e = new C2125d(2);
        new C2125d(1);
    }

    public static void a(int i7, int[] iArr, int[] iArr2, boolean z7) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float f5 = (i7 - i9) / 2;
        if (!z7) {
            int length = iArr.length;
            int i11 = 0;
            while (i8 < length) {
                int i12 = iArr[i8];
                iArr2[i11] = Math.round(f5);
                f5 += i12;
                i8++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = iArr[length2];
            iArr2[length2] = Math.round(f5);
            f5 += i13;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z7) {
        int i7 = 0;
        if (!z7) {
            int length = iArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i7 < length) {
                int i10 = iArr[i7];
                iArr2[i8] = i9;
                i9 += i10;
                i7++;
                i8++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i11 = iArr[length2];
            iArr2[length2] = i7;
            i7 += i11;
        }
    }

    public static void c(int i7, int[] iArr, int[] iArr2, boolean z7) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        int i11 = i7 - i9;
        if (!z7) {
            int length = iArr.length;
            int i12 = 0;
            while (i8 < length) {
                int i13 = iArr[i8];
                iArr2[i12] = i11;
                i11 += i13;
                i8++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i11;
            i11 += i14;
        }
    }

    public static void d(int i7, int[] iArr, int[] iArr2, boolean z7) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float length = iArr.length == 0 ? 0.0f : (i7 - i9) / iArr.length;
        float f5 = length / 2;
        if (!z7) {
            int length2 = iArr.length;
            int i11 = 0;
            while (i8 < length2) {
                int i12 = iArr[i8];
                iArr2[i11] = Math.round(f5);
                f5 += i12 + length;
                i8++;
                i11++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i13 = iArr[length3];
            iArr2[length3] = Math.round(f5);
            f5 += i13 + length;
        }
    }

    public static void e(int i7, int[] iArr, int[] iArr2, boolean z7) {
        if (iArr.length == 0) {
            return;
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float fMax = (i7 - i9) / Math.max(iArr.length - 1, 1);
        float f5 = (z7 && iArr.length == 1) ? fMax : 0.0f;
        if (z7) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i11 = iArr[length];
                iArr2[length] = Math.round(f5);
                f5 += i11 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i12 = 0;
        while (i8 < length2) {
            int i13 = iArr[i8];
            iArr2[i12] = Math.round(f5);
            f5 += i13 + fMax;
            i8++;
            i12++;
        }
    }

    public static void f(int i7, int[] iArr, int[] iArr2, boolean z7) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float length = (i7 - i9) / (iArr.length + 1);
        if (z7) {
            float f5 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i11 = iArr[length2];
                iArr2[length2] = Math.round(f5);
                f5 += i11 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f7 = length;
        int i12 = 0;
        while (i8 < length3) {
            int i13 = iArr[i8];
            iArr2[i12] = Math.round(f7);
            f7 += i13 + length;
            i8++;
            i12++;
        }
    }

    public static C2127f g(float f5) {
        return new C2127f(f5, true, C2129h.f16443l);
    }
}
