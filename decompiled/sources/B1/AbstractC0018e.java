package B1;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: B1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0018e {
    public static final byte[] a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f323b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f324c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i7, boolean z7, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = {f323b[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(z7 ? 'H' : 'L'), Integer.valueOf(i10)};
        int i11 = K.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(java.lang.String r12, java.lang.String[] r13, y1.C2384f r14) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.AbstractC0018e.b(java.lang.String, java.lang.String[], y1.f):android.util.Pair");
    }
}
