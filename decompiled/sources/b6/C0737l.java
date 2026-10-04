package b6;

/* renamed from: b6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737l extends E3.b {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11028d;

    public C0737l(o oVar, boolean z7) {
        super(oVar);
        this.f11028d = z7;
    }

    @Override // E3.b
    public final void e(byte b4) {
        if (this.f11028d) {
            k(String.valueOf(b4 & 255));
        } else {
            i(String.valueOf(b4 & 255));
        }
    }

    @Override // E3.b
    public final void g(int i7) {
        if (this.f11028d) {
            k(Long.toString(4294967295L & i7, 10));
        } else {
            i(Long.toString(4294967295L & i7, 10));
        }
    }

    @Override // E3.b
    public final void h(long j7) {
        int i7 = 63;
        String str = "0";
        if (this.f11028d) {
            if (j7 != 0) {
                if (j7 > 0) {
                    str = Long.toString(j7, 10);
                } else {
                    char[] cArr = new char[64];
                    long j8 = (j7 >>> 1) / 5;
                    long j9 = 10;
                    cArr[63] = Character.forDigit((int) (j7 - (j8 * j9)), 10);
                    while (j8 > 0) {
                        i7--;
                        cArr[i7] = Character.forDigit((int) (j8 % j9), 10);
                        j8 /= j9;
                    }
                    str = new String(cArr, i7, 64 - i7);
                }
            }
            k(str);
            return;
        }
        if (j7 != 0) {
            if (j7 > 0) {
                str = Long.toString(j7, 10);
            } else {
                char[] cArr2 = new char[64];
                long j10 = (j7 >>> 1) / 5;
                long j11 = 10;
                cArr2[63] = Character.forDigit((int) (j7 - (j10 * j11)), 10);
                while (j10 > 0) {
                    i7--;
                    cArr2[i7] = Character.forDigit((int) (j10 % j11), 10);
                    j10 /= j11;
                }
                str = new String(cArr2, i7, 64 - i7);
            }
        }
        i(str);
    }

    @Override // E3.b
    public final void j(short s7) {
        if (this.f11028d) {
            k(String.valueOf(s7 & 65535));
        } else {
            i(String.valueOf(s7 & 65535));
        }
    }
}
