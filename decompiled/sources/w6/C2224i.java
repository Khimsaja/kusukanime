package w6;

import b1.AbstractC0703b;
import io.ktor.http.auth.HttpAuthHeader;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import z5.C2496a;

/* renamed from: w6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2224i implements InterfaceC2226k, InterfaceC2225j, Cloneable, ByteChannel {

    /* renamed from: k, reason: collision with root package name */
    public D f17155k;

    /* renamed from: l, reason: collision with root package name */
    public long f17156l;

    @Override // w6.InterfaceC2225j
    public final /* bridge */ /* synthetic */ InterfaceC2225j A(int i7) {
        g0(i7);
        return this;
    }

    @Override // w6.InterfaceC2225j
    public final /* bridge */ /* synthetic */ InterfaceC2225j E(byte[] bArr) {
        f0(bArr);
        return this;
    }

    @Override // w6.H
    public final long F(C2224i c2224i, long j7) {
        kotlin.jvm.internal.l.f("sink", c2224i);
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount < 0: ", j7).toString());
        }
        long j8 = this.f17156l;
        if (j8 == 0) {
            return -1L;
        }
        if (j7 > j8) {
            j7 = j8;
        }
        c2224i.f(this, j7);
        return j7;
    }

    @Override // w6.InterfaceC2226k
    public final void G(C2224i c2224i, long j7) throws EOFException {
        long j8 = this.f17156l;
        if (j8 >= j7) {
            c2224i.f(this, j7);
        } else {
            c2224i.f(this, j8);
            throw new EOFException();
        }
    }

    public final long H(long j7, l lVar) {
        kotlin.jvm.internal.l.f("targetBytes", lVar);
        long j8 = 0;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("fromIndex < 0: ", j7).toString());
        }
        D d4 = this.f17155k;
        if (d4 == null) {
            return -1L;
        }
        long j9 = this.f17156l;
        long j10 = j9 - j7;
        byte[] bArr = lVar.f17158k;
        if (j10 < j7) {
            while (j9 > j7) {
                d4 = d4.f17121g;
                kotlin.jvm.internal.l.c(d4);
                j9 -= d4.f17117c - d4.f17116b;
            }
            if (bArr.length == 2) {
                byte b4 = bArr[0];
                byte b7 = bArr[1];
                while (j9 < this.f17156l) {
                    int i7 = d4.f17117c;
                    for (int i8 = (int) ((d4.f17116b + j7) - j9); i8 < i7; i8++) {
                        byte b8 = d4.a[i8];
                        if (b8 == b4 || b8 == b7) {
                            return (i8 - d4.f17116b) + j9;
                        }
                    }
                    j9 += d4.f17117c - d4.f17116b;
                    d4 = d4.f17120f;
                    kotlin.jvm.internal.l.c(d4);
                    j7 = j9;
                }
                return -1L;
            }
            while (j9 < this.f17156l) {
                int i9 = d4.f17117c;
                for (int i10 = (int) ((d4.f17116b + j7) - j9); i10 < i9; i10++) {
                    byte b9 = d4.a[i10];
                    for (byte b10 : bArr) {
                        if (b9 == b10) {
                            return (i10 - d4.f17116b) + j9;
                        }
                    }
                }
                j9 += d4.f17117c - d4.f17116b;
                d4 = d4.f17120f;
                kotlin.jvm.internal.l.c(d4);
                j7 = j9;
            }
            return -1L;
        }
        while (true) {
            long j11 = (d4.f17117c - d4.f17116b) + j8;
            if (j11 > j7) {
                break;
            }
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
            j8 = j11;
        }
        if (bArr.length == 2) {
            byte b11 = bArr[0];
            byte b12 = bArr[1];
            while (j8 < this.f17156l) {
                int i11 = d4.f17117c;
                for (int i12 = (int) ((d4.f17116b + j7) - j8); i12 < i11; i12++) {
                    byte b13 = d4.a[i12];
                    if (b13 == b11 || b13 == b12) {
                        return (i12 - d4.f17116b) + j8;
                    }
                }
                j8 += d4.f17117c - d4.f17116b;
                d4 = d4.f17120f;
                kotlin.jvm.internal.l.c(d4);
                j7 = j8;
            }
            return -1L;
        }
        while (j8 < this.f17156l) {
            int i13 = d4.f17117c;
            for (int i14 = (int) ((d4.f17116b + j7) - j8); i14 < i13; i14++) {
                byte b14 = d4.a[i14];
                for (byte b15 : bArr) {
                    if (b14 == b15) {
                        return (i14 - d4.f17116b) + j8;
                    }
                }
            }
            j8 += d4.f17117c - d4.f17116b;
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
            j7 = j8;
        }
        return -1L;
    }

    public final boolean J(long j7, l lVar, int i7) {
        kotlin.jvm.internal.l.f("bytes", lVar);
        if (i7 >= 0 && j7 >= 0 && i7 + j7 <= this.f17156l && i7 <= lVar.f17158k.length) {
            return i7 == 0 || x6.a.a(this, lVar, j7, j7 + 1, i7) != -1;
        }
        return false;
    }

    @Override // w6.InterfaceC2226k
    public final long K(l lVar) {
        kotlin.jvm.internal.l.f("bytes", lVar);
        byte[] bArr = x6.a.a;
        return x6.a.a(this, lVar, 0L, Long.MAX_VALUE, lVar.f17158k.length);
    }

    public final int L(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("sink", bArr);
        AbstractC2217b.e(bArr.length, i7, i8);
        D d4 = this.f17155k;
        if (d4 == null) {
            return -1;
        }
        int iMin = Math.min(i8, d4.f17117c - d4.f17116b);
        int i9 = d4.f17116b;
        P3.m.U(i7, i9, i9 + iMin, d4.a, bArr);
        int i10 = d4.f17116b + iMin;
        d4.f17116b = i10;
        this.f17156l -= iMin;
        if (i10 == d4.f17117c) {
            this.f17155k = d4.a();
            E.a(d4);
        }
        return iMin;
    }

    public final C2223h O(C2223h c2223h) {
        kotlin.jvm.internal.l.f("unsafeCursor", c2223h);
        byte[] bArr = x6.a.a;
        if (c2223h == AbstractC2217b.a) {
            c2223h = new C2223h();
        }
        if (c2223h.f17148k != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c2223h.f17148k = this;
        c2223h.f17149l = true;
        return c2223h;
    }

    public final byte[] P(long j7) throws EOFException {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        if (this.f17156l < j7) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j7];
        W(bArr);
        return bArr;
    }

    @Override // w6.InterfaceC2225j
    public final /* bridge */ /* synthetic */ InterfaceC2225j R(String str) {
        k0(str);
        return this;
    }

    @Override // w6.InterfaceC2225j
    public final /* bridge */ /* synthetic */ InterfaceC2225j S(long j7) {
        h0(j7);
        return this;
    }

    public final l T(long j7) throws EOFException {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        if (this.f17156l < j7) {
            throw new EOFException();
        }
        if (j7 < 4096) {
            return new l(P(j7));
        }
        l lVarC0 = c0((int) j7);
        n(j7);
        return lVarC0;
    }

    @Override // w6.InterfaceC2226k
    public final int U(x xVar) throws EOFException {
        kotlin.jvm.internal.l.f("options", xVar);
        int iD = x6.a.d(this, xVar, false);
        if (iD == -1) {
            return -1;
        }
        n(xVar.f17188k[iD].d());
        return iD;
    }

    @Override // w6.InterfaceC2226k
    public final long V(l lVar) {
        kotlin.jvm.internal.l.f("targetBytes", lVar);
        return H(0L, lVar);
    }

    public final void W(byte[] bArr) throws EOFException {
        kotlin.jvm.internal.l.f("sink", bArr);
        int i7 = 0;
        while (i7 < bArr.length) {
            int iL = L(bArr, i7, bArr.length - i7);
            if (iL == -1) {
                throw new EOFException();
            }
            i7 += iL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4 A[EDGE_INSN: B:43:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long X() throws java.io.EOFException {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r2 = 48
            r3 = 0
            r4 = 1
            long r5 = r0.f17156l
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Lab
            r9 = r3
            r10 = r9
            r5 = r7
        L12:
            w6.D r11 = r0.f17155k
            kotlin.jvm.internal.l.c(r11)
            int r12 = r11.f17116b
            int r13 = r11.f17117c
        L1b:
            if (r12 >= r13) goto L90
            byte[] r14 = r11.a
            r14 = r14[r12]
            if (r14 < r2) goto L2a
            r15 = 57
            if (r14 > r15) goto L2a
            int r15 = r14 + (-48)
            goto L3f
        L2a:
            r15 = 97
            if (r14 < r15) goto L35
            r15 = 102(0x66, float:1.43E-43)
            if (r14 > r15) goto L35
            int r15 = r14 + (-87)
            goto L3f
        L35:
            r15 = 65
            if (r14 < r15) goto L68
            r15 = 70
            if (r14 > r15) goto L68
            int r15 = r14 + (-55)
        L3f:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r5 & r16
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 != 0) goto L4d
            long r5 = r5 << r1
            long r14 = (long) r15
            long r5 = r5 | r14
            int r12 = r12 + r4
            int r9 = r9 + r4
            goto L1b
        L4d:
            w6.i r1 = new w6.i
            r1.<init>()
            r1.i0(r5)
            r1.g0(r14)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.a0()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L68:
            if (r9 == 0) goto L6c
            r10 = r4
            goto L90
        L6c:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            char[] r5 = x6.b.a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r5[r1]
            r6 = r14 & 15
            char r5 = r5[r6]
            r6 = 2
            char[] r6 = new char[r6]
            r6[r3] = r1
            r6[r4] = r5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L90:
            if (r12 != r13) goto L9c
            w6.D r12 = r11.a()
            r0.f17155k = r12
            w6.E.a(r11)
            goto L9e
        L9c:
            r11.f17116b = r12
        L9e:
            if (r10 != 0) goto La4
            w6.D r11 = r0.f17155k
            if (r11 != 0) goto L12
        La4:
            long r1 = r0.f17156l
            long r3 = (long) r9
            long r1 = r1 - r3
            r0.f17156l = r1
            return r5
        Lab:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C2224i.X():long");
    }

    public final short Y() throws EOFException {
        short s7 = readShort();
        return (short) (((s7 & 255) << 8) | ((65280 & s7) >>> 8));
    }

    public final String Z(long j7, Charset charset) throws EOFException {
        kotlin.jvm.internal.l.f(HttpAuthHeader.Parameters.Charset, charset);
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        if (this.f17156l < j7) {
            throw new EOFException();
        }
        if (j7 == 0) {
            return "";
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        int i7 = d4.f17116b;
        if (i7 + j7 > d4.f17117c) {
            return new String(P(j7), charset);
        }
        int i8 = (int) j7;
        String str = new String(d4.a, i7, i8, charset);
        int i9 = d4.f17116b + i8;
        d4.f17116b = i9;
        this.f17156l -= j7;
        if (i9 == d4.f17117c) {
            this.f17155k = d4.a();
            E.a(d4);
        }
        return str;
    }

    public final String a0() {
        return Z(this.f17156l, C2496a.f19036b);
    }

    public final void b() throws EOFException {
        n(this.f17156l);
    }

    public final int b0() {
        int i7;
        int i8;
        int i9;
        if (this.f17156l == 0) {
            throw new EOFException();
        }
        byte bV = v(0L);
        if ((bV & 128) == 0) {
            i7 = bV & 127;
            i8 = 0;
            i9 = 1;
        } else if ((bV & 224) == 192) {
            i7 = bV & 31;
            i9 = 2;
            i8 = 128;
        } else if ((bV & 240) == 224) {
            i7 = bV & 15;
            i9 = 3;
            i8 = 2048;
        } else {
            if ((bV & 248) != 240) {
                n(1L);
                return 65533;
            }
            i7 = bV & 7;
            i8 = 65536;
            i9 = 4;
        }
        long j7 = i9;
        if (this.f17156l < j7) {
            StringBuilder sbP = AbstractC0703b.p(i9, "size < ", ": ");
            sbP.append(this.f17156l);
            sbP.append(" (to read code point prefixed 0x");
            char[] cArr = x6.b.a;
            sbP.append(new String(new char[]{cArr[(bV >> 4) & 15], cArr[bV & 15]}));
            sbP.append(')');
            throw new EOFException(sbP.toString());
        }
        for (int i10 = 1; i10 < i9; i10++) {
            long j8 = i10;
            byte bV2 = v(j8);
            if ((bV2 & 192) != 128) {
                n(j8);
                return 65533;
            }
            i7 = (i7 << 6) | (bV2 & 63);
        }
        n(j7);
        if (i7 <= 1114111 && ((55296 > i7 || i7 >= 57344) && i7 >= i8)) {
            return i7;
        }
        return 65533;
    }

    @Override // w6.InterfaceC2226k
    public final boolean c(long j7) {
        return this.f17156l >= j7;
    }

    public final l c0(int i7) {
        if (i7 == 0) {
            return l.f17157n;
        }
        AbstractC2217b.e(this.f17156l, 0L, i7);
        D d4 = this.f17155k;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            kotlin.jvm.internal.l.c(d4);
            int i11 = d4.f17117c;
            int i12 = d4.f17116b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            d4 = d4.f17120f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        D d6 = this.f17155k;
        int i13 = 0;
        while (i8 < i7) {
            kotlin.jvm.internal.l.c(d6);
            bArr[i13] = d6.a;
            i8 += d6.f17117c - d6.f17116b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = d6.f17116b;
            d6.f17118d = true;
            i13++;
            d6 = d6.f17120f;
        }
        return new F(bArr, iArr);
    }

    @Override // w6.H
    public final J d() {
        return J.f17126d;
    }

    public final D d0(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        D d4 = this.f17155k;
        if (d4 == null) {
            D dB = E.b();
            this.f17155k = dB;
            dB.f17121g = dB;
            dB.f17120f = dB;
            return dB;
        }
        D d6 = d4.f17121g;
        kotlin.jvm.internal.l.c(d6);
        if (d6.f17117c + i7 <= 8192 && d6.f17119e) {
            return d6;
        }
        D dB2 = E.b();
        d6.b(dB2);
        return dB2;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C2224i clone() {
        C2224i c2224i = new C2224i();
        if (this.f17156l == 0) {
            return c2224i;
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        D dC = d4.c();
        c2224i.f17155k = dC;
        dC.f17121g = dC;
        dC.f17120f = dC;
        for (D d6 = d4.f17120f; d6 != d4; d6 = d6.f17120f) {
            D d7 = dC.f17121g;
            kotlin.jvm.internal.l.c(d7);
            kotlin.jvm.internal.l.c(d6);
            d7.b(d6.c());
        }
        c2224i.f17156l = this.f17156l;
        return c2224i;
    }

    public final void e0(l lVar) {
        kotlin.jvm.internal.l.f("byteString", lVar);
        lVar.s(this, lVar.d());
    }

    public final boolean equals(Object obj) {
        boolean z7 = true;
        if (this == obj) {
            return true;
        }
        boolean z8 = false;
        if (!(obj instanceof C2224i)) {
            return false;
        }
        long j7 = this.f17156l;
        C2224i c2224i = (C2224i) obj;
        if (j7 != c2224i.f17156l) {
            return false;
        }
        if (j7 == 0) {
            return true;
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        D d6 = c2224i.f17155k;
        kotlin.jvm.internal.l.c(d6);
        int i7 = d4.f17116b;
        int i8 = d6.f17116b;
        long j8 = 0;
        while (j8 < this.f17156l) {
            long jMin = Math.min(d4.f17117c - i7, d6.f17117c - i8);
            long j9 = 0;
            while (j9 < jMin) {
                int i9 = i7 + 1;
                boolean z9 = z7;
                byte b4 = d4.a[i7];
                int i10 = i8 + 1;
                boolean z10 = z8;
                if (b4 != d6.a[i8]) {
                    return z10;
                }
                j9++;
                i8 = i10;
                i7 = i9;
                z7 = z9;
                z8 = z10;
            }
            boolean z11 = z7;
            boolean z12 = z8;
            if (i7 == d4.f17117c) {
                D d7 = d4.f17120f;
                kotlin.jvm.internal.l.c(d7);
                i7 = d7.f17116b;
                d4 = d7;
            }
            if (i8 == d6.f17117c) {
                d6 = d6.f17120f;
                kotlin.jvm.internal.l.c(d6);
                i8 = d6.f17116b;
            }
            j8 += jMin;
            z7 = z11;
            z8 = z12;
        }
        return z7;
    }

    @Override // w6.G
    public final void f(C2224i c2224i, long j7) {
        D dB;
        kotlin.jvm.internal.l.f("source", c2224i);
        if (c2224i == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC2217b.e(c2224i.f17156l, 0L, j7);
        while (j7 > 0) {
            D d4 = c2224i.f17155k;
            kotlin.jvm.internal.l.c(d4);
            int i7 = d4.f17117c;
            D d6 = c2224i.f17155k;
            kotlin.jvm.internal.l.c(d6);
            long j8 = i7 - d6.f17116b;
            int i8 = 0;
            if (j7 < j8) {
                D d7 = this.f17155k;
                D d8 = d7 != null ? d7.f17121g : null;
                if (d8 != null && d8.f17119e) {
                    if ((d8.f17117c + j7) - (d8.f17118d ? 0 : d8.f17116b) <= 8192) {
                        D d9 = c2224i.f17155k;
                        kotlin.jvm.internal.l.c(d9);
                        d9.d(d8, (int) j7);
                        c2224i.f17156l -= j7;
                        this.f17156l += j7;
                        return;
                    }
                }
                D d10 = c2224i.f17155k;
                kotlin.jvm.internal.l.c(d10);
                int i9 = (int) j7;
                if (i9 <= 0 || i9 > d10.f17117c - d10.f17116b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i9 >= 1024) {
                    dB = d10.c();
                } else {
                    dB = E.b();
                    int i10 = d10.f17116b;
                    P3.m.U(0, i10, i10 + i9, d10.a, dB.a);
                }
                dB.f17117c = dB.f17116b + i9;
                d10.f17116b += i9;
                D d11 = d10.f17121g;
                kotlin.jvm.internal.l.c(d11);
                d11.b(dB);
                c2224i.f17155k = dB;
            }
            D d12 = c2224i.f17155k;
            kotlin.jvm.internal.l.c(d12);
            long j9 = d12.f17117c - d12.f17116b;
            c2224i.f17155k = d12.a();
            D d13 = this.f17155k;
            if (d13 == null) {
                this.f17155k = d12;
                d12.f17121g = d12;
                d12.f17120f = d12;
            } else {
                D d14 = d13.f17121g;
                kotlin.jvm.internal.l.c(d14);
                d14.b(d12);
                D d15 = d12.f17121g;
                if (d15 == d12) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.l.c(d15);
                if (d15.f17119e) {
                    int i11 = d12.f17117c - d12.f17116b;
                    D d16 = d12.f17121g;
                    kotlin.jvm.internal.l.c(d16);
                    int i12 = 8192 - d16.f17117c;
                    D d17 = d12.f17121g;
                    kotlin.jvm.internal.l.c(d17);
                    if (!d17.f17118d) {
                        D d18 = d12.f17121g;
                        kotlin.jvm.internal.l.c(d18);
                        i8 = d18.f17116b;
                    }
                    if (i11 <= i12 + i8) {
                        D d19 = d12.f17121g;
                        kotlin.jvm.internal.l.c(d19);
                        d12.d(d19, i11);
                        d12.a();
                        E.a(d12);
                    }
                }
            }
            c2224i.f17156l -= j9;
            this.f17156l += j9;
            j7 -= j9;
        }
    }

    public final void f0(byte[] bArr) {
        kotlin.jvm.internal.l.f("source", bArr);
        m216write(bArr, 0, bArr.length);
    }

    public final long g() {
        long j7 = this.f17156l;
        if (j7 == 0) {
            return 0L;
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        D d6 = d4.f17121g;
        kotlin.jvm.internal.l.c(d6);
        return (d6.f17117c >= 8192 || !d6.f17119e) ? j7 : j7 - (r3 - d6.f17116b);
    }

    public final void g0(int i7) {
        D dD0 = d0(1);
        int i8 = dD0.f17117c;
        dD0.f17117c = i8 + 1;
        dD0.a[i8] = (byte) i7;
        this.f17156l++;
    }

    public final void h0(long j7) {
        boolean z7;
        byte[] bArr;
        if (j7 == 0) {
            g0(48);
            return;
        }
        if (j7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                k0("-9223372036854775808");
                return;
            }
            z7 = true;
        } else {
            z7 = false;
        }
        byte[] bArr2 = x6.a.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j7)) * 10) >>> 5;
        int i7 = iNumberOfLeadingZeros + (j7 > x6.a.f17521b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z7) {
            i7++;
        }
        D dD0 = d0(i7);
        int i8 = dD0.f17117c + i7;
        while (true) {
            bArr = dD0.a;
            if (j7 == 0) {
                break;
            }
            long j8 = 10;
            i8--;
            bArr[i8] = x6.a.a[(int) (j7 % j8)];
            j7 /= j8;
        }
        if (z7) {
            bArr[i8 - 1] = 45;
        }
        dD0.f17117c += i7;
        this.f17156l += i7;
    }

    public final int hashCode() {
        D d4 = this.f17155k;
        if (d4 == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = d4.f17117c;
            for (int i9 = d4.f17116b; i9 < i8; i9++) {
                i7 = (i7 * 31) + d4.a[i9];
            }
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
        } while (d4 != this.f17155k);
        return i7;
    }

    public final void i(C2224i c2224i, long j7, long j8) {
        kotlin.jvm.internal.l.f("out", c2224i);
        long j9 = j7;
        AbstractC2217b.e(this.f17156l, j9, j8);
        if (j8 == 0) {
            return;
        }
        c2224i.f17156l += j8;
        D d4 = this.f17155k;
        while (true) {
            kotlin.jvm.internal.l.c(d4);
            long j10 = d4.f17117c - d4.f17116b;
            if (j9 < j10) {
                break;
            }
            j9 -= j10;
            d4 = d4.f17120f;
        }
        D d6 = d4;
        long j11 = j8;
        while (j11 > 0) {
            kotlin.jvm.internal.l.c(d6);
            D dC = d6.c();
            int i7 = dC.f17116b + ((int) j9);
            dC.f17116b = i7;
            dC.f17117c = Math.min(i7 + ((int) j11), dC.f17117c);
            D d7 = c2224i.f17155k;
            if (d7 == null) {
                dC.f17121g = dC;
                dC.f17120f = dC;
                c2224i.f17155k = dC;
            } else {
                D d8 = d7.f17121g;
                kotlin.jvm.internal.l.c(d8);
                d8.b(dC);
            }
            j11 -= dC.f17117c - dC.f17116b;
            d6 = d6.f17120f;
            j9 = 0;
        }
    }

    public final void i0(long j7) {
        if (j7 == 0) {
            g0(48);
            return;
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i7 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + 3) / 4);
        D dD0 = d0(i7);
        int i8 = dD0.f17117c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            dD0.a[i9] = x6.a.a[(int) (15 & j7)];
            j7 >>>= 4;
        }
        dD0.f17117c += i7;
        this.f17156l += i7;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(int i7) {
        D dD0 = d0(2);
        int i8 = dD0.f17117c;
        byte[] bArr = dD0.a;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        dD0.f17117c = i8 + 2;
        this.f17156l += 2;
    }

    @Override // w6.InterfaceC2225j
    public final /* bridge */ /* synthetic */ InterfaceC2225j k(l lVar) {
        e0(lVar);
        return this;
    }

    public final void k0(String str) {
        kotlin.jvm.internal.l.f("string", str);
        l0(str, 0, str.length());
    }

    @Override // w6.InterfaceC2225j
    public final long l(H h7) {
        kotlin.jvm.internal.l.f("source", h7);
        long j7 = 0;
        while (true) {
            long jF = h7.F(this, 8192L);
            if (jF == -1) {
                return j7;
            }
            j7 += jF;
        }
    }

    public final void l0(String str, int i7, int i8) {
        char cCharAt;
        kotlin.jvm.internal.l.f("string", str);
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "beginIndex < 0: ").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(A6.b.e(i8, i7, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i8 > str.length()) {
            StringBuilder sbP = AbstractC0703b.p(i8, "endIndex > string.length: ", " > ");
            sbP.append(str.length());
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        while (i7 < i8) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128) {
                D dD0 = d0(1);
                int i9 = dD0.f17117c - i7;
                int iMin = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                byte[] bArr = dD0.a;
                bArr[i7 + i9] = (byte) cCharAt2;
                while (true) {
                    i7 = i10;
                    if (i7 >= iMin || (cCharAt = str.charAt(i7)) >= 128) {
                        break;
                    }
                    i10 = i7 + 1;
                    bArr[i7 + i9] = (byte) cCharAt;
                }
                int i11 = dD0.f17117c;
                int i12 = (i9 + i7) - i11;
                dD0.f17117c = i11 + i12;
                this.f17156l += i12;
            } else {
                if (cCharAt2 < 2048) {
                    D dD02 = d0(2);
                    int i13 = dD02.f17117c;
                    byte[] bArr2 = dD02.a;
                    bArr2[i13] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    dD02.f17117c = i13 + 2;
                    this.f17156l += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    D dD03 = d0(3);
                    int i14 = dD03.f17117c;
                    byte[] bArr3 = dD03.a;
                    bArr3[i14] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    dD03.f17117c = i14 + 3;
                    this.f17156l += 3;
                } else {
                    int i15 = i7 + 1;
                    char cCharAt3 = i15 < i8 ? str.charAt(i15) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        g0(63);
                        i7 = i15;
                    } else {
                        int i16 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        D dD04 = d0(4);
                        int i17 = dD04.f17117c;
                        byte[] bArr4 = dD04.a;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        dD04.f17117c = i17 + 4;
                        this.f17156l += 4;
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
    }

    public final void m0(int i7) {
        if (i7 < 128) {
            g0(i7);
            return;
        }
        if (i7 < 2048) {
            D dD0 = d0(2);
            int i8 = dD0.f17117c;
            byte[] bArr = dD0.a;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            dD0.f17117c = i8 + 2;
            this.f17156l += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            g0(63);
            return;
        }
        if (i7 < 65536) {
            D dD02 = d0(3);
            int i9 = dD02.f17117c;
            byte[] bArr2 = dD02.a;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            dD02.f17117c = i9 + 3;
            this.f17156l += 3;
            return;
        }
        if (i7 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC2217b.j(i7)));
        }
        D dD03 = d0(4);
        int i10 = dD03.f17117c;
        byte[] bArr3 = dD03.a;
        bArr3[i10] = (byte) ((i7 >> 18) | 240);
        bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
        dD03.f17117c = i10 + 4;
        this.f17156l += 4;
    }

    @Override // w6.InterfaceC2226k
    public final void n(long j7) throws EOFException {
        while (j7 > 0) {
            D d4 = this.f17155k;
            if (d4 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j7, d4.f17117c - d4.f17116b);
            long j8 = iMin;
            this.f17156l -= j8;
            j7 -= j8;
            int i7 = d4.f17116b + iMin;
            d4.f17116b = i7;
            if (i7 == d4.f17117c) {
                this.f17155k = d4.a();
                E.a(d4);
            }
        }
    }

    @Override // w6.InterfaceC2226k
    public final boolean p(long j7, l lVar) {
        kotlin.jvm.internal.l.f("bytes", lVar);
        return J(j7, lVar, lVar.f17158k.length);
    }

    public final void r(int i7) {
        D dD0 = d0(4);
        int i8 = dD0.f17117c;
        byte[] bArr = dD0.a;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        dD0.f17117c = i8 + 4;
        this.f17156l += 4;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("sink", byteBuffer);
        D d4 = this.f17155k;
        if (d4 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), d4.f17117c - d4.f17116b);
        byteBuffer.put(d4.a, d4.f17116b, iMin);
        int i7 = d4.f17116b + iMin;
        d4.f17116b = i7;
        this.f17156l -= iMin;
        if (i7 == d4.f17117c) {
            this.f17155k = d4.a();
            E.a(d4);
        }
        return iMin;
    }

    public final byte readByte() {
        if (this.f17156l == 0) {
            throw new EOFException();
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        int i7 = d4.f17116b;
        int i8 = d4.f17117c;
        int i9 = i7 + 1;
        byte b4 = d4.a[i7];
        this.f17156l--;
        if (i9 != i8) {
            d4.f17116b = i9;
            return b4;
        }
        this.f17155k = d4.a();
        E.a(d4);
        return b4;
    }

    public final int readInt() throws EOFException {
        if (this.f17156l < 4) {
            throw new EOFException();
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        int i7 = d4.f17116b;
        int i8 = d4.f17117c;
        if (i8 - i7 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = d4.a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i11 = i7 + 4;
        int i12 = i10 | (bArr[i9] & 255);
        this.f17156l -= 4;
        if (i11 != i8) {
            d4.f17116b = i11;
            return i12;
        }
        this.f17155k = d4.a();
        E.a(d4);
        return i12;
    }

    public final long readLong() throws EOFException {
        if (this.f17156l < 8) {
            throw new EOFException();
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        int i7 = d4.f17116b;
        int i8 = d4.f17117c;
        if (i8 - i7 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = d4.a;
        int i9 = i7 + 7;
        long j7 = ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
        int i10 = i7 + 8;
        long j8 = j7 | (bArr[i9] & 255);
        this.f17156l -= 8;
        if (i10 != i8) {
            d4.f17116b = i10;
            return j8;
        }
        this.f17155k = d4.a();
        E.a(d4);
        return j8;
    }

    public final short readShort() throws EOFException {
        if (this.f17156l < 2) {
            throw new EOFException();
        }
        D d4 = this.f17155k;
        kotlin.jvm.internal.l.c(d4);
        int i7 = d4.f17116b;
        int i8 = d4.f17117c;
        if (i8 - i7 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i9 = i7 + 1;
        byte[] bArr = d4.a;
        int i10 = (bArr[i7] & 255) << 8;
        int i11 = i7 + 2;
        int i12 = (bArr[i9] & 255) | i10;
        this.f17156l -= 2;
        if (i11 == i8) {
            this.f17155k = d4.a();
            E.a(d4);
        } else {
            d4.f17116b = i11;
        }
        return (short) i12;
    }

    public final String toString() {
        long j7 = this.f17156l;
        if (j7 <= 2147483647L) {
            return c0((int) j7).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f17156l).toString());
    }

    public final byte v(long j7) {
        AbstractC2217b.e(this.f17156l, j7, 1L);
        D d4 = this.f17155k;
        if (d4 == null) {
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        long j8 = this.f17156l;
        if (j8 - j7 < j7) {
            while (j8 > j7) {
                d4 = d4.f17121g;
                kotlin.jvm.internal.l.c(d4);
                j8 -= d4.f17117c - d4.f17116b;
            }
            return d4.a[(int) ((d4.f17116b + j7) - j8)];
        }
        long j9 = 0;
        while (true) {
            int i7 = d4.f17117c;
            int i8 = d4.f17116b;
            long j10 = (i7 - i8) + j9;
            if (j10 > j7) {
                return d4.a[(int) ((i8 + j7) - j9)];
            }
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
            j9 = j10;
        }
    }

    @Override // w6.InterfaceC2226k
    public final String w() throws EOFException {
        if (Long.MAX_VALUE < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("limit < 0: ", Long.MAX_VALUE).toString());
        }
        long j7 = Long.MAX_VALUE != Long.MAX_VALUE ? Long.MAX_VALUE + 1 : Long.MAX_VALUE;
        long jX = x((byte) 10, 0L, j7);
        if (jX != -1) {
            return x6.a.c(this, jX);
        }
        if (j7 < this.f17156l && v(j7 - 1) == 13 && v(j7) == 10) {
            return x6.a.c(this, j7);
        }
        C2224i c2224i = new C2224i();
        i(c2224i, 0L, Math.min(32, this.f17156l));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f17156l, Long.MAX_VALUE) + " content=" + c2224i.T(c2224i.f17156l).e() + (char) 8230);
    }

    @Override // w6.InterfaceC2225j
    public final /* bridge */ /* synthetic */ InterfaceC2225j write(byte[] bArr, int i7, int i8) {
        m216write(bArr, i7, i8);
        return this;
    }

    public final long x(byte b4, long j7, long j8) {
        D d4;
        long j9 = 0;
        if (0 > j7 || j7 > j8) {
            throw new IllegalArgumentException(("size=" + this.f17156l + " fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        long j10 = this.f17156l;
        if (j8 > j10) {
            j8 = j10;
        }
        if (j7 == j8 || (d4 = this.f17155k) == null) {
            return -1L;
        }
        if (j10 - j7 < j7) {
            while (j10 > j7) {
                d4 = d4.f17121g;
                kotlin.jvm.internal.l.c(d4);
                j10 -= d4.f17117c - d4.f17116b;
            }
            while (j10 < j8) {
                int iMin = (int) Math.min(d4.f17117c, (d4.f17116b + j8) - j10);
                for (int i7 = (int) ((d4.f17116b + j7) - j10); i7 < iMin; i7++) {
                    if (d4.a[i7] == b4) {
                        return (i7 - d4.f17116b) + j10;
                    }
                }
                j10 += d4.f17117c - d4.f17116b;
                d4 = d4.f17120f;
                kotlin.jvm.internal.l.c(d4);
                j7 = j10;
            }
            return -1L;
        }
        while (true) {
            long j11 = (d4.f17117c - d4.f17116b) + j9;
            if (j11 > j7) {
                break;
            }
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
            j9 = j11;
        }
        while (j9 < j8) {
            int iMin2 = (int) Math.min(d4.f17117c, (d4.f17116b + j8) - j9);
            for (int i8 = (int) ((d4.f17116b + j7) - j9); i8 < iMin2; i8++) {
                if (d4.a[i8] == b4) {
                    return (i8 - d4.f17116b) + j9;
                }
            }
            j9 += d4.f17117c - d4.f17116b;
            d4 = d4.f17120f;
            kotlin.jvm.internal.l.c(d4);
            j7 = j9;
        }
        return -1L;
    }

    @Override // w6.InterfaceC2226k
    public final long y(InterfaceC2225j interfaceC2225j) {
        long j7 = this.f17156l;
        if (j7 > 0) {
            interfaceC2225j.f(this, j7);
        }
        return j7;
    }

    public final boolean z() {
        return this.f17156l == 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("source", byteBuffer);
        int iRemaining = byteBuffer.remaining();
        int i7 = iRemaining;
        while (i7 > 0) {
            D dD0 = d0(1);
            int iMin = Math.min(i7, 8192 - dD0.f17117c);
            byteBuffer.get(dD0.a, dD0.f17117c, iMin);
            i7 -= iMin;
            dD0.f17117c += iMin;
        }
        this.f17156l += iRemaining;
        return iRemaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m216write(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("source", bArr);
        long j7 = i8;
        AbstractC2217b.e(bArr.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            D dD0 = d0(1);
            int iMin = Math.min(i9 - i7, 8192 - dD0.f17117c);
            int i10 = i7 + iMin;
            P3.m.U(dD0.f17117c, i7, i10, bArr, dD0.a);
            dD0.f17117c += iMin;
            i7 = i10;
        }
        this.f17156l += j7;
    }

    @Override // w6.InterfaceC2226k
    public final C2224i a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, w6.G
    public final void close() {
    }

    @Override // w6.G, java.io.Flushable
    public final void flush() {
    }
}
