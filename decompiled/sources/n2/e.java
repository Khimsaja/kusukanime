package n2;

import V1.k;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f13343d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f13344b;

    /* renamed from: c, reason: collision with root package name */
    public int f13345c;

    public static long a(int i7, boolean z7, byte[] bArr) {
        long j7 = bArr[0] & 255;
        if (z7) {
            j7 &= ~f13343d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    public static int b(int i7) {
        for (int i8 = 0; i8 < 8; i8++) {
            if ((f13343d[i8] & i7) != 0) {
                return i8 + 1;
            }
        }
        return -1;
    }

    public final long c(k kVar, boolean z7, boolean z8, int i7) {
        int i8 = this.f13344b;
        byte[] bArr = this.a;
        if (i8 == 0) {
            if (!kVar.a(bArr, 0, 1, z7)) {
                return -1L;
            }
            int iB = b(bArr[0] & 255);
            this.f13345c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f13344b = 1;
        }
        int i9 = this.f13345c;
        if (i9 > i7) {
            this.f13344b = 0;
            return -2L;
        }
        if (i9 != 1) {
            kVar.a(bArr, 1, i9 - 1, false);
        }
        this.f13344b = 0;
        return a(this.f13345c, z8, bArr);
    }
}
