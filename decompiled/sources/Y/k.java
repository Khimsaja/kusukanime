package Y;

/* loaded from: classes.dex */
public final class k {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f9984b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9985c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9986d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9987e;

    public int a(int i7) {
        int i8 = this.a + 1;
        int[] iArr = (int[]) this.f9985c;
        int length = iArr.length;
        if (i8 > length) {
            int i9 = length * 2;
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            P3.m.Y(0, 0, 14, iArr, iArr2);
            P3.m.Y(0, 0, 14, (int[]) this.f9986d, iArr3);
            this.f9985c = iArr2;
            this.f9986d = iArr3;
        }
        int i10 = this.a;
        this.a = i10 + 1;
        int length2 = ((int[]) this.f9987e).length;
        if (this.f9984b >= length2) {
            int i11 = length2 * 2;
            int[] iArr4 = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                iArr4[i12] = i13;
                i12 = i13;
            }
            P3.m.Y(0, 0, 14, (int[]) this.f9987e, iArr4);
            this.f9987e = iArr4;
        }
        int i14 = this.f9984b;
        int[] iArr5 = (int[]) this.f9987e;
        this.f9984b = iArr5[i14];
        int[] iArr6 = (int[]) this.f9985c;
        iArr6[i10] = i7;
        ((int[]) this.f9986d)[i10] = i14;
        iArr5[i14] = i10;
        int i15 = iArr6[i10];
        while (i10 > 0) {
            int i16 = ((i10 + 1) >> 1) - 1;
            if (iArr6[i16] <= i15) {
                break;
            }
            b(i16, i10);
            i10 = i16;
        }
        return i14;
    }

    public void b(int i7, int i8) {
        int[] iArr = (int[]) this.f9985c;
        int[] iArr2 = (int[]) this.f9986d;
        int[] iArr3 = (int[]) this.f9987e;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
        int i10 = iArr2[i7];
        iArr2[i7] = iArr2[i8];
        iArr2[i8] = i10;
        iArr3[iArr2[i7]] = i7;
        iArr3[iArr2[i8]] = i8;
    }
}
