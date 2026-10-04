package b6;

/* renamed from: b6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734i {
    public static final char[] a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11022b = new byte[126];

    static {
        int i7 = 0;
        for (int i8 = 0; i8 < 32; i8++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f11022b;
            if (i7 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i7] = 127;
            i7++;
        }
    }

    public static void a(char c2, int i7) {
        if (c2 != 'u') {
            a[c2] = (char) i7;
        }
    }
}
