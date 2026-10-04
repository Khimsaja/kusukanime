package L0;

/* loaded from: classes.dex */
public abstract class a {
    public static final int[] a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f5994b = new Object[0];

    public static final int a(int i7, int i8, int[] iArr) {
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
}
