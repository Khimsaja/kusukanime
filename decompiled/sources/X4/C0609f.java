package X4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609f {

    /* renamed from: c, reason: collision with root package name */
    public int f9885c;

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f9887e;

    /* renamed from: f, reason: collision with root package name */
    public int f9888f;

    /* renamed from: i, reason: collision with root package name */
    public int f9891i;

    /* renamed from: h, reason: collision with root package name */
    public int f9890h = Integer.MAX_VALUE;
    public final byte[] a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f9884b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9886d = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f9889g = 0;

    public C0609f(InputStream inputStream) {
        this.f9887e = inputStream;
    }

    public final void a(int i7) {
        if (this.f9888f != i7) {
            throw new r("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i7 = this.f9890h;
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        return i7 - (this.f9889g + this.f9886d);
    }

    public final void c(int i7) {
        this.f9890h = i7;
        o();
    }

    public final int d(int i7) {
        if (i7 < 0) {
            throw new r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.f9889g + this.f9886d + i7;
        int i9 = this.f9890h;
        if (i8 > i9) {
            throw r.b();
        }
        this.f9890h = i8;
        o();
        return i9;
    }

    public final v e() {
        int iK = k();
        int i7 = this.f9884b;
        int i8 = this.f9886d;
        if (iK > i7 - i8 || iK <= 0) {
            return iK == 0 ? AbstractC0608e.f9883k : new v(h(iK));
        }
        byte[] bArr = new byte[iK];
        System.arraycopy(this.a, i8, bArr, 0, iK);
        v vVar = new v(bArr);
        this.f9886d += iK;
        return vVar;
    }

    public final int f() {
        return k();
    }

    public final AbstractC0605b g(x xVar, C0611h c0611h) throws r {
        int iK = k();
        if (this.f9891i >= 64) {
            throw new r("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iK);
        this.f9891i++;
        AbstractC0605b abstractC0605b = (AbstractC0605b) xVar.a(this, c0611h);
        a(0);
        this.f9891i--;
        c(iD);
        return abstractC0605b;
    }

    public final byte[] h(int i7) throws IOException {
        if (i7 <= 0) {
            if (i7 == 0) {
                return AbstractC0620q.a;
            }
            throw new r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.f9889g;
        int i9 = this.f9886d;
        int i10 = i8 + i9 + i7;
        int i11 = this.f9890h;
        if (i10 > i11) {
            r((i11 - i8) - i9);
            throw r.b();
        }
        byte[] bArr = this.a;
        if (i7 < 4096) {
            byte[] bArr2 = new byte[i7];
            int i12 = this.f9884b - i9;
            System.arraycopy(bArr, i9, bArr2, 0, i12);
            this.f9886d = this.f9884b;
            int i13 = i7 - i12;
            if (i13 > 0) {
                p(i13);
            }
            System.arraycopy(bArr, 0, bArr2, i12, i13);
            this.f9886d = i13;
            return bArr2;
        }
        int i14 = this.f9884b;
        this.f9889g = i8 + i14;
        this.f9886d = 0;
        this.f9884b = 0;
        int length = i14 - i9;
        int i15 = i7 - length;
        ArrayList arrayList = new ArrayList();
        while (i15 > 0) {
            int iMin = Math.min(i15, 4096);
            byte[] bArr3 = new byte[iMin];
            int i16 = 0;
            while (i16 < iMin) {
                int i17 = this.f9887e.read(bArr3, i16, iMin - i16);
                if (i17 == -1) {
                    throw r.b();
                }
                this.f9889g += i17;
                i16 += i17;
            }
            i15 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i7];
        System.arraycopy(bArr, i9, bArr4, 0, length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws r {
        int i7 = this.f9886d;
        if (this.f9884b - i7 < 4) {
            p(4);
            i7 = this.f9886d;
        }
        this.f9886d = i7 + 4;
        byte[] bArr = this.a;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long j() throws r {
        int i7 = this.f9886d;
        if (this.f9884b - i7 < 8) {
            p(8);
            i7 = this.f9886d;
        }
        this.f9886d = i7 + 8;
        byte[] bArr = this.a;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int k() {
        int i7;
        int i8 = this.f9886d;
        int i9 = this.f9884b;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.a;
            byte b4 = bArr[i8];
            if (b4 >= 0) {
                this.f9886d = i10;
                return b4;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b4;
                long j7 = i12;
                if (j7 < 0) {
                    i7 = (int) ((-128) ^ j7);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    long j8 = i14;
                    if (j8 >= 0) {
                        i7 = (int) (16256 ^ j8);
                    } else {
                        int i15 = i8 + 4;
                        long j9 = i14 ^ (bArr[i13] << 21);
                        if (j9 < 0) {
                            i7 = (int) ((-2080896) ^ j9);
                        } else {
                            i13 = i8 + 5;
                            int i16 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i15] < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i17 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i17;
                                                    i7 = i16;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i16;
                            }
                            i7 = i16;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f9886d = i11;
                return i7;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.C0609f.l():long");
    }

    public final long m() throws r {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f9886d == this.f9884b) {
                p(1);
            }
            int i8 = this.f9886d;
            this.f9886d = i8 + 1;
            j7 |= (r3 & 127) << i7;
            if ((this.a[i8] & 128) == 0) {
                return j7;
            }
        }
        throw new r("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws r {
        if (this.f9886d == this.f9884b && !s(1)) {
            this.f9888f = 0;
            return 0;
        }
        int iK = k();
        this.f9888f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new r("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i7 = this.f9884b + this.f9885c;
        this.f9884b = i7;
        int i8 = this.f9889g + i7;
        int i9 = this.f9890h;
        if (i8 <= i9) {
            this.f9885c = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f9885c = i10;
        this.f9884b = i7 - i10;
    }

    public final void p(int i7) throws r {
        if (!s(i7)) {
            throw r.b();
        }
    }

    public final boolean q(int i7, B1.G g4) throws IOException {
        int iN;
        int i8 = i7 & 7;
        if (i8 == 0) {
            long jL = l();
            g4.K(i7);
            g4.L(jL);
            return true;
        }
        if (i8 == 1) {
            long j7 = j();
            g4.K(i7);
            g4.J(j7);
            return true;
        }
        if (i8 == 2) {
            v vVarE = e();
            g4.K(i7);
            g4.K(vVarE.size());
            g4.G(vVarE);
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw new r("Protocol message tag had invalid wire type.");
            }
            int i9 = i();
            g4.K(i7);
            g4.I(i9);
            return true;
        }
        g4.K(i7);
        do {
            iN = n();
            if (iN == 0) {
                break;
            }
        } while (q(iN, g4));
        int i10 = ((i7 >>> 3) << 3) | 4;
        a(i10);
        g4.K(i10);
        return true;
    }

    public final void r(int i7) throws r {
        int i8 = this.f9884b;
        int i9 = this.f9886d;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.f9886d = i9 + i7;
            return;
        }
        if (i7 < 0) {
            throw new r("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f9889g;
        int i12 = i11 + i9 + i7;
        int i13 = this.f9890h;
        if (i12 > i13) {
            r((i13 - i11) - i9);
            throw r.b();
        }
        this.f9886d = i8;
        p(1);
        while (true) {
            int i14 = i7 - i10;
            int i15 = this.f9884b;
            if (i14 <= i15) {
                this.f9886d = i14;
                return;
            } else {
                i10 += i15;
                this.f9886d = i15;
                p(1);
            }
        }
    }

    public final boolean s(int i7) throws IOException {
        InputStream inputStream;
        int i8 = this.f9886d;
        int i9 = i8 + i7;
        int i10 = this.f9884b;
        if (i9 <= i10) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i7);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f9889g + i8 + i7 <= this.f9890h && (inputStream = this.f9887e) != null) {
            byte[] bArr = this.a;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f9889g += i8;
                this.f9884b -= i8;
                this.f9886d = 0;
            }
            int i11 = this.f9884b;
            int i12 = inputStream.read(bArr, i11, bArr.length - i11);
            if (i12 == 0 || i12 < -1 || i12 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i12);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i12 > 0) {
                this.f9884b += i12;
                if ((this.f9889g + i7) - 67108864 > 0) {
                    throw new r("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f9884b >= i7) {
                    return true;
                }
                return s(i7);
            }
        }
        return false;
    }
}
