package B1;

/* loaded from: classes.dex */
public final class A {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f281b;

    /* renamed from: c, reason: collision with root package name */
    public int f282c;

    /* renamed from: d, reason: collision with root package name */
    public int f283d;

    /* renamed from: e, reason: collision with root package name */
    public int f284e;

    public A() {
        this.a = 0;
        this.f281b = K.f302c;
    }

    public void a() {
        int i7;
        int i8;
        switch (this.a) {
            case 0:
                int i9 = this.f282c;
                AbstractC0015b.h(i9 >= 0 && (i9 < (i7 = this.f284e) || (i9 == i7 && this.f283d == 0)));
                break;
            default:
                int i10 = this.f283d;
                AbstractC0015b.h(i10 >= 0 && (i10 < (i8 = this.f282c) || (i10 == i8 && this.f284e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f284e - this.f282c) * 8) - this.f283d;
    }

    public void c() {
        if (this.f283d == 0) {
            return;
        }
        this.f283d = 0;
        this.f282c++;
        a();
    }

    public boolean d(int i7) {
        int i8 = this.f283d;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f284e + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f282c) {
                break;
            }
            if (r(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f282c;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public boolean e() {
        int i7 = this.f283d;
        int i8 = this.f284e;
        int i9 = 0;
        while (this.f283d < this.f282c && !h()) {
            i9++;
        }
        boolean z7 = this.f283d == this.f282c;
        this.f283d = i7;
        this.f284e = i8;
        return !z7 && d((i9 * 2) + 1);
    }

    public int f() {
        AbstractC0015b.h(this.f283d == 0);
        return this.f282c;
    }

    public int g() {
        return (this.f282c * 8) + this.f283d;
    }

    public boolean h() {
        switch (this.a) {
            case 0:
                boolean z7 = (this.f281b[this.f282c] & (128 >> this.f283d)) != 0;
                s();
                return z7;
            case 1:
                boolean z8 = (this.f281b[this.f283d] & (128 >> this.f284e)) != 0;
                s();
                return z8;
            default:
                boolean z9 = (((this.f281b[this.f283d] & 255) >> this.f284e) & 1) == 1;
                t(1);
                return z9;
        }
    }

    public int i(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                this.f283d += i7;
                int i8 = 0;
                while (true) {
                    int i9 = this.f283d;
                    if (i9 <= 8) {
                        byte[] bArr = this.f281b;
                        int i10 = this.f282c;
                        int i11 = ((-1) >>> (32 - i7)) & (i8 | ((bArr[i10] & 255) >> (8 - i9)));
                        if (i9 == 8) {
                            this.f283d = 0;
                            this.f282c = i10 + 1;
                        }
                        a();
                        return i11;
                    }
                    int i12 = i9 - 8;
                    this.f283d = i12;
                    byte[] bArr2 = this.f281b;
                    int i13 = this.f282c;
                    this.f282c = i13 + 1;
                    i8 |= (bArr2[i13] & 255) << i12;
                }
            case 1:
                this.f284e += i7;
                int i14 = 0;
                while (true) {
                    int i15 = this.f284e;
                    if (i15 <= 8) {
                        byte[] bArr3 = this.f281b;
                        int i16 = this.f283d;
                        int i17 = ((-1) >>> (32 - i7)) & (i14 | ((bArr3[i16] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.f284e = 0;
                            this.f283d = i16 + (r(i16 + 1) ? 2 : 1);
                        }
                        a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.f284e = i18;
                    byte[] bArr4 = this.f281b;
                    int i19 = this.f283d;
                    i14 |= (bArr4[i19] & 255) << i18;
                    if (!r(i19 + 1)) {
                        i = 1;
                    }
                    this.f283d = i19 + i;
                }
            default:
                int i20 = this.f283d;
                int iMin = Math.min(i7, 8 - this.f284e);
                int i21 = i20 + 1;
                byte[] bArr5 = this.f281b;
                int i22 = ((bArr5[i20] & 255) >> this.f284e) & (255 >> (8 - iMin));
                while (iMin < i7) {
                    i22 |= (bArr5[i21] & 255) << iMin;
                    iMin += 8;
                    i21++;
                }
                int i23 = i22 & ((-1) >>> (32 - i7));
                t(i7);
                return i23;
        }
    }

    public void j(byte[] bArr, int i7) {
        int i8 = i7 >> 3;
        for (int i9 = 0; i9 < i8; i9++) {
            byte[] bArr2 = this.f281b;
            int i10 = this.f282c;
            int i11 = i10 + 1;
            this.f282c = i11;
            byte b4 = bArr2[i10];
            int i12 = this.f283d;
            byte b7 = (byte) (b4 << i12);
            bArr[i9] = b7;
            bArr[i9] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b7);
        }
        int i13 = i7 & 7;
        if (i13 == 0) {
            return;
        }
        byte b8 = (byte) (bArr[i8] & (255 >> i13));
        bArr[i8] = b8;
        int i14 = this.f283d;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f281b;
            int i15 = this.f282c;
            this.f282c = i15 + 1;
            bArr[i8] = (byte) (b8 | ((bArr3[i15] & 255) << i14));
            this.f283d = i14 - 8;
        }
        int i16 = this.f283d + i13;
        this.f283d = i16;
        byte[] bArr4 = this.f281b;
        int i17 = this.f282c;
        bArr[i8] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i8]);
        if (i16 == 8) {
            this.f283d = 0;
            this.f282c = i17 + 1;
        }
        a();
    }

    public long k(int i7) {
        if (i7 <= 32) {
            int i8 = i(i7);
            int i9 = K.a;
            return 4294967295L & i8;
        }
        int i10 = i(i7 - 32);
        int i11 = i(32);
        int i12 = K.a;
        return (4294967295L & i11) | ((i10 & 4294967295L) << 32);
    }

    public void l(byte[] bArr, int i7) {
        AbstractC0015b.h(this.f283d == 0);
        System.arraycopy(this.f281b, this.f282c, bArr, 0, i7);
        this.f282c += i7;
        a();
    }

    public int m() {
        int i7 = 0;
        while (!h()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? i(i7) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(B b4) {
        p(b4.a, b4.f289c);
        q(b4.f288b * 8);
    }

    public void p(byte[] bArr, int i7) {
        this.f281b = bArr;
        this.f282c = 0;
        this.f283d = 0;
        this.f284e = i7;
    }

    public void q(int i7) {
        int i8 = i7 / 8;
        this.f282c = i8;
        this.f283d = i7 - (i8 * 8);
        a();
    }

    public boolean r(int i7) {
        if (2 > i7 || i7 >= this.f282c) {
            return false;
        }
        byte[] bArr = this.f281b;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 - 1] == 0;
    }

    public void s() {
        switch (this.a) {
            case 0:
                int i7 = this.f283d + 1;
                this.f283d = i7;
                if (i7 == 8) {
                    this.f283d = 0;
                    this.f282c++;
                }
                a();
                break;
            default:
                int i8 = this.f284e + 1;
                this.f284e = i8;
                if (i8 == 8) {
                    this.f284e = 0;
                    int i9 = this.f283d;
                    this.f283d = i9 + (r(i9 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i7) {
        int i8;
        switch (this.a) {
            case 0:
                int i9 = i7 / 8;
                int i10 = this.f282c + i9;
                this.f282c = i10;
                int i11 = (i7 - (i9 * 8)) + this.f283d;
                this.f283d = i11;
                if (i11 > 7) {
                    this.f282c = i10 + 1;
                    this.f283d = i11 - 8;
                }
                a();
                break;
            case 1:
                int i12 = this.f283d;
                int i13 = i7 / 8;
                int i14 = i12 + i13;
                this.f283d = i14;
                int i15 = (i7 - (i13 * 8)) + this.f284e;
                this.f284e = i15;
                if (i15 > 7) {
                    this.f283d = i14 + 1;
                    this.f284e = i15 - 8;
                }
                while (true) {
                    i12++;
                    if (i12 > this.f283d) {
                        a();
                        break;
                    } else if (r(i12)) {
                        this.f283d++;
                        i12 += 2;
                    }
                }
            default:
                int i16 = i7 / 8;
                int i17 = this.f283d + i16;
                this.f283d = i17;
                int i18 = (i7 - (i16 * 8)) + this.f284e;
                this.f284e = i18;
                boolean z7 = true;
                if (i18 > 7) {
                    this.f283d = i17 + 1;
                    this.f284e = i18 - 8;
                }
                int i19 = this.f283d;
                if (i19 < 0 || (i19 >= (i8 = this.f282c) && (i19 != i8 || this.f284e != 0))) {
                    z7 = false;
                }
                AbstractC0015b.h(z7);
                break;
        }
    }

    public void u(int i7) {
        AbstractC0015b.h(this.f283d == 0);
        this.f282c += i7;
        a();
    }

    public A(byte[] bArr) {
        this.a = 2;
        this.f281b = bArr;
        this.f282c = bArr.length;
    }

    public A(byte[] bArr, int i7, int i8) {
        this.a = 1;
        this.f281b = bArr;
        this.f283d = i7;
        this.f282c = i8;
        this.f284e = 0;
        a();
    }

    public A(byte[] bArr, int i7) {
        this.a = 0;
        this.f281b = bArr;
        this.f284e = i7;
    }

    public A(int i7, int i8) {
        this.a = 3;
        this.f282c = i7;
        this.f283d = i8;
        this.f281b = new byte[(i8 * 2) - 1];
        this.f284e = 0;
    }
}
