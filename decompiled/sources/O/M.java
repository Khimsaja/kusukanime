package O;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class M {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f7015b;

    public M() {
        this.a = new int[10];
    }

    public int a() {
        int[] iArr = this.a;
        int i7 = this.f7015b - 1;
        this.f7015b = i7;
        return iArr[i7];
    }

    public void b(int i7) {
        int i8 = this.f7015b;
        int[] iArr = this.a;
        if (i8 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.a = iArrCopyOf;
        }
        int[] iArr2 = this.a;
        int i9 = this.f7015b;
        this.f7015b = i9 + 1;
        iArr2[i9] = i7;
    }

    public void c(int i7, int i8, int i9) {
        int i10 = this.f7015b;
        int i11 = i10 + 3;
        int[] iArr = this.a;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.a = iArrCopyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i10] = i7 + i9;
        iArr2[i10 + 1] = i8 + i9;
        iArr2[i10 + 2] = i9;
        this.f7015b = i11;
    }

    public void d(int i7, int i8, int i9, int i10) {
        int i11 = this.f7015b;
        int i12 = i11 + 4;
        int[] iArr = this.a;
        if (i12 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.a = iArrCopyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i11] = i7;
        iArr2[i11 + 1] = i8;
        iArr2[i11 + 2] = i9;
        iArr2[i11 + 3] = i10;
        this.f7015b = i12;
    }

    public void e(int i7, int i8) {
        if (i7 < i8) {
            int i9 = i7 - 3;
            for (int i10 = i7; i10 < i8; i10 += 3) {
                int[] iArr = this.a;
                int i11 = iArr[i10];
                int i12 = iArr[i8];
                if (i11 < i12 || (i11 == i12 && iArr[i10 + 1] <= iArr[i8 + 1])) {
                    i9 += 3;
                    f(i9, i10);
                }
            }
            f(i9 + 3, i8);
            e(i7, i9);
            e(i9 + 6, i8);
        }
    }

    public void f(int i7, int i8) {
        int[] iArr = this.a;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
        int i10 = i7 + 1;
        int i11 = i8 + 1;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i7 + 2;
        int i14 = i8 + 2;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
    }

    public M(int i7) {
        this.a = new int[i7];
    }
}
