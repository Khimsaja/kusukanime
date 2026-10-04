package X4;

/* loaded from: classes.dex */
public abstract class F {
    public static final D a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final E f9844b = new E();

    public static int a(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    public static int b(byte[] bArr, int i7, int i8) {
        byte b4 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            if (b4 > -12) {
                return -1;
            }
            return b4;
        }
        if (i9 == 1) {
            return a(b4, bArr[i7]);
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        byte b7 = bArr[i7];
        byte b8 = bArr[i7 + 1];
        if (b4 > -12 || b7 > -65 || b8 > -65) {
            return -1;
        }
        return (b8 << 16) ^ ((b7 << 8) ^ b4);
    }

    public static int c(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i8) {
            return 0;
        }
        while (i7 < i8) {
            int i9 = i7 + 1;
            byte b4 = bArr[i7];
            if (b4 >= 0) {
                i7 = i9;
            } else if (b4 < -32) {
                if (i9 >= i8) {
                    return b4;
                }
                if (b4 < -62) {
                    return -1;
                }
                i7 += 2;
                if (bArr[i9] > -65) {
                    return -1;
                }
            } else if (b4 < -16) {
                if (i9 >= i8 - 1) {
                    return b(bArr, i9, i8);
                }
                int i10 = i7 + 2;
                byte b7 = bArr[i9];
                if (b7 > -65) {
                    return -1;
                }
                if (b4 == -32 && b7 < -96) {
                    return -1;
                }
                if (b4 == -19 && b7 >= -96) {
                    return -1;
                }
                i7 += 3;
                if (bArr[i10] > -65) {
                    return -1;
                }
            } else {
                if (i9 >= i8 - 2) {
                    return b(bArr, i9, i8);
                }
                int i11 = i7 + 2;
                byte b8 = bArr[i9];
                if (b8 > -65) {
                    return -1;
                }
                if ((((b8 + 112) + (b4 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i12 = i7 + 3;
                if (bArr[i11] > -65) {
                    return -1;
                }
                i7 += 4;
                if (bArr[i12] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
