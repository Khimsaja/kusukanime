package z0;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2440e extends AbstractC2434b {

    /* renamed from: c, reason: collision with root package name */
    public static C2440e f18748c;

    @Override // z0.AbstractC2434b
    public final int[] a(int i7) {
        int length = c().length();
        if (length <= 0 || i7 >= length) {
            return null;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        while (i7 < length && c().charAt(i7) == '\n' && (c().charAt(i7) == '\n' || (i7 != 0 && c().charAt(i7 - 1) != '\n'))) {
            i7++;
        }
        if (i7 >= length) {
            return null;
        }
        int i8 = i7 + 1;
        while (i8 < length && !e(i8)) {
            i8++;
        }
        return b(i7, i8);
    }

    @Override // z0.AbstractC2434b
    public final int[] d(int i7) {
        int length = c().length();
        if (length <= 0 || i7 <= 0) {
            return null;
        }
        if (i7 > length) {
            i7 = length;
        }
        while (i7 > 0 && c().charAt(i7 - 1) == '\n' && !e(i7)) {
            i7--;
        }
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        while (i8 > 0 && (c().charAt(i8) == '\n' || (i8 != 0 && c().charAt(i8 - 1) != '\n'))) {
            i8--;
        }
        return b(i8, i7);
    }

    public final boolean e(int i7) {
        if (i7 <= 0 || c().charAt(i7 - 1) == '\n') {
            return false;
        }
        return i7 == c().length() || c().charAt(i7) == '\n';
    }
}
