package B1;

import b1.AbstractC0703b;
import io.ktor.network.sockets.DatagramKt;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f285d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f286e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final j3.J f287f = j3.J.r(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f288b;

    /* renamed from: c, reason: collision with root package name */
    public int f289c;

    public B() {
        this.a = K.f302c;
    }

    public final long A() {
        int i7;
        int i8;
        long j7 = this.a[this.f288b];
        int i9 = 7;
        while (true) {
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j7) != 0) {
                i9--;
            } else if (i9 < 6) {
                j7 &= r6 - 1;
                i8 = 7 - i9;
            } else if (i9 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 == 0) {
            throw new NumberFormatException(AbstractC0703b.h("Invalid UTF-8 sequence first byte: ", j7));
        }
        for (i7 = 1; i7 < i8; i7++) {
            if ((this.a[this.f288b + i7] & 192) != 128) {
                throw new NumberFormatException(AbstractC0703b.h("Invalid UTF-8 sequence continuation byte: ", j7));
            }
            j7 = (j7 << 6) | (r3 & 63);
        }
        this.f288b += i8;
        return j7;
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i7 = this.f288b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f288b = i7 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i8 = this.f288b;
        byte b4 = bArr2[i8];
        if (b4 == -2 && bArr2[i8 + 1] == -1) {
            this.f288b = i8 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b4 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        }
        this.f288b = i8 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void C(int i7) {
        byte[] bArr = this.a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        D(bArr, i7);
    }

    public final void D(byte[] bArr, int i7) {
        this.a = bArr;
        this.f289c = i7;
        this.f288b = 0;
    }

    public final void E(int i7) {
        AbstractC0015b.c(i7 >= 0 && i7 <= this.a.length);
        this.f289c = i7;
    }

    public final void F(int i7) {
        AbstractC0015b.c(i7 >= 0 && i7 <= this.f289c);
        this.f288b = i7;
    }

    public final void G(int i7) {
        F(this.f288b + i7);
    }

    public final int a() {
        return this.f289c - this.f288b;
    }

    public final void b(int i7) {
        byte[] bArr = this.a;
        if (i7 > bArr.length) {
            this.a = Arrays.copyOf(bArr, i7);
        }
    }

    public final char c(Charset charset) {
        AbstractC0015b.b("Unsupported charset: " + charset, f287f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b4;
        byte b7 = 0;
        int i7 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b4 = this.a[this.f288b];
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.a;
                int i8 = this.f288b;
                b7 = bArr[i8];
                b4 = bArr[i8 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.a;
                int i9 = this.f288b;
                b7 = bArr2[i9 + 1];
                b4 = bArr2[i9];
            }
            i7 = 2;
        }
        return ((b4 & 255) << 16) | (b7 << 24) | (i7 & 255);
    }

    public final void e(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.a, this.f288b, bArr, i7, i8);
        this.f288b += i8;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c2 = (char) (iD >> 16);
            for (char c4 : cArr) {
                if (c4 == c2) {
                    this.f288b += iD & DatagramKt.MAX_DATAGRAM_SIZE;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        int i8 = i7 + 1;
        this.f288b = i8;
        int i9 = (bArr[i7] & 255) << 24;
        int i10 = i7 + 2;
        this.f288b = i10;
        int i11 = ((bArr[i8] & 255) << 16) | i9;
        int i12 = i7 + 3;
        this.f288b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.f288b = i7 + 4;
        return (bArr[i12] & 255) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(java.nio.charset.Charset r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.B.h(java.nio.charset.Charset):java.lang.String");
    }

    public final int i() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        int i8 = i7 + 1;
        this.f288b = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.f288b = i10;
        int i11 = ((bArr[i8] & 255) << 8) | i9;
        int i12 = i7 + 3;
        this.f288b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f288b = i7 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public final long j() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        this.f288b = i7 + 1;
        this.f288b = i7 + 2;
        this.f288b = i7 + 3;
        long j7 = (bArr[i7] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f288b = i7 + 4;
        long j8 = j7 | ((bArr[r8] & 255) << 24);
        this.f288b = i7 + 5;
        long j9 = j8 | ((bArr[r7] & 255) << 32);
        this.f288b = i7 + 6;
        long j10 = j9 | ((bArr[r8] & 255) << 40);
        this.f288b = i7 + 7;
        long j11 = j10 | ((bArr[r7] & 255) << 48);
        this.f288b = i7 + 8;
        return ((bArr[r8] & 255) << 56) | j11;
    }

    public final long k() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        this.f288b = i7 + 1;
        this.f288b = i7 + 2;
        this.f288b = i7 + 3;
        long j7 = (bArr[i7] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f288b = i7 + 4;
        return ((bArr[r4] & 255) << 24) | j7;
    }

    public final int l() {
        int i7 = i();
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalStateException(AbstractC0703b.g(i7, "Top bit not zero: "));
    }

    public final int m() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        int i8 = i7 + 1;
        this.f288b = i8;
        int i9 = bArr[i7] & 255;
        this.f288b = i7 + 2;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public final long n() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        this.f288b = i7 + 1;
        this.f288b = i7 + 2;
        this.f288b = i7 + 3;
        long j7 = ((bArr[i7] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f288b = i7 + 4;
        long j8 = j7 | ((bArr[r4] & 255) << 32);
        this.f288b = i7 + 5;
        long j9 = j8 | ((bArr[r7] & 255) << 24);
        this.f288b = i7 + 6;
        long j10 = j9 | ((bArr[r4] & 255) << 16);
        this.f288b = i7 + 7;
        long j11 = j10 | ((bArr[r7] & 255) << 8);
        this.f288b = i7 + 8;
        return (bArr[r4] & 255) | j11;
    }

    public final String o() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f288b;
        while (i7 < this.f289c && this.a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.a;
        int i8 = this.f288b;
        int i9 = K.a;
        String str = new String(bArr, i8, i7 - i8, StandardCharsets.UTF_8);
        this.f288b = i7;
        if (i7 < this.f289c) {
            this.f288b = i7 + 1;
        }
        return str;
    }

    public final String p(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f288b;
        int i9 = (i8 + i7) - 1;
        int i10 = (i9 >= this.f289c || this.a[i9] != 0) ? i7 : i7 - 1;
        byte[] bArr = this.a;
        int i11 = K.a;
        String str = new String(bArr, i8, i10, StandardCharsets.UTF_8);
        this.f288b += i7;
        return str;
    }

    public final short q() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        int i8 = i7 + 1;
        this.f288b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f288b = i7 + 2;
        return (short) ((bArr[i8] & 255) | i9);
    }

    public final String r(int i7, Charset charset) {
        String str = new String(this.a, this.f288b, i7, charset);
        this.f288b += i7;
        return str;
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        this.f288b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int u() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        int i8 = i7 + 1;
        this.f288b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f288b = i7 + 2;
        int i10 = (bArr[i8] & 255) | i9;
        this.f288b = i7 + 4;
        return i10;
    }

    public final long v() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        this.f288b = i7 + 1;
        this.f288b = i7 + 2;
        this.f288b = i7 + 3;
        long j7 = ((bArr[i7] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f288b = i7 + 4;
        return (bArr[r4] & 255) | j7;
    }

    public final int w() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        int i8 = i7 + 1;
        this.f288b = i8;
        int i9 = (bArr[i7] & 255) << 16;
        int i10 = i7 + 2;
        this.f288b = i10;
        int i11 = ((bArr[i8] & 255) << 8) | i9;
        this.f288b = i7 + 3;
        return (bArr[i10] & 255) | i11;
    }

    public final int x() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(AbstractC0703b.g(iG, "Top bit not zero: "));
    }

    public final long y() {
        long jN = n();
        if (jN >= 0) {
            return jN;
        }
        throw new IllegalStateException(AbstractC0703b.h("Top bit not zero: ", jN));
    }

    public final int z() {
        byte[] bArr = this.a;
        int i7 = this.f288b;
        int i8 = i7 + 1;
        this.f288b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f288b = i7 + 2;
        return (bArr[i8] & 255) | i9;
    }

    public B(int i7) {
        this.a = new byte[i7];
        this.f289c = i7;
    }

    public B(byte[] bArr) {
        this.a = bArr;
        this.f289c = bArr.length;
    }

    public B(byte[] bArr, int i7) {
        this.a = bArr;
        this.f289c = i7;
    }
}
