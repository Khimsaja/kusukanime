package a4;

import P3.m;

/* renamed from: a4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0666d {
    public static final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10445b;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        a = bArr;
        int[] iArr = new int[256];
        m.d0(iArr, -1);
        iArr[61] = -2;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 64) {
            iArr[bArr[i8]] = i9;
            i8++;
            i9++;
        }
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f10445b = bArr2;
        int[] iArr2 = new int[256];
        m.d0(iArr2, -1);
        iArr2[61] = -2;
        int i10 = 0;
        while (i7 < 64) {
            iArr2[bArr2[i7]] = i10;
            i7++;
            i10++;
        }
    }
}
