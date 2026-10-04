package j2;

import B1.A;
import B1.B;
import B1.K;
import e2.C0818a;
import f1.AbstractC0871d;
import j3.G;
import j3.X;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import y1.C;
import y1.D;

/* loaded from: classes.dex */
public final class h extends z1.c {

    /* renamed from: s, reason: collision with root package name */
    public static final I1.e f12250s = new I1.e(25);

    /* renamed from: r, reason: collision with root package name */
    public final I1.e f12251r;

    public h(I1.e eVar) {
        this.f12251r = eVar;
    }

    public static C1313a P(B b4, int i7, int i8) {
        int iH0;
        String strConcat;
        int iT = b4.t();
        Charset charsetE0 = e0(iT);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        b4.e(bArr, 0, i9);
        if (i8 == 2) {
            strConcat = "image/" + AbstractC0871d.r0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iH0 = 2;
        } else {
            iH0 = h0(bArr, 0);
            String strR0 = AbstractC0871d.r0(new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1));
            strConcat = strR0.indexOf(47) == -1 ? "image/".concat(strR0) : strR0;
        }
        int i10 = bArr[iH0 + 1] & 255;
        int i11 = iH0 + 2;
        int iG0 = g0(bArr, i11, iT);
        String str = new String(bArr, i11, iG0 - i11, charsetE0);
        int iD0 = d0(iT) + iG0;
        return new C1313a(strConcat, str, i10, i9 <= iD0 ? K.f302c : Arrays.copyOfRange(bArr, iD0, i9));
    }

    public static c Q(B b4, int i7, int i8, boolean z7, int i9, I1.e eVar) throws Throwable {
        int i10 = b4.f288b;
        int iH0 = h0(b4.a, i10);
        String str = new String(b4.a, i10, iH0 - i10, StandardCharsets.ISO_8859_1);
        b4.F(iH0 + 1);
        int iG = b4.g();
        int iG2 = b4.g();
        long jV = b4.v();
        if (jV == 4294967295L) {
            jV = -1;
        }
        long jV2 = b4.v();
        long j7 = jV2 == 4294967295L ? -1L : jV2;
        ArrayList arrayList = new ArrayList();
        int i11 = i10 + i7;
        while (b4.f288b < i11) {
            i iVarT = T(i8, b4, z7, i9, eVar);
            if (iVarT != null) {
                arrayList.add(iVarT);
            }
        }
        return new c(str, iG, iG2, jV, j7, (i[]) arrayList.toArray(new i[0]));
    }

    public static d R(B b4, int i7, int i8, boolean z7, int i9, I1.e eVar) throws Throwable {
        int i10 = b4.f288b;
        int iH0 = h0(b4.a, i10);
        String str = new String(b4.a, i10, iH0 - i10, StandardCharsets.ISO_8859_1);
        b4.F(iH0 + 1);
        int iT = b4.t();
        boolean z8 = (iT & 2) != 0;
        boolean z9 = (iT & 1) != 0;
        int iT2 = b4.t();
        String[] strArr = new String[iT2];
        for (int i11 = 0; i11 < iT2; i11++) {
            int i12 = b4.f288b;
            int iH02 = h0(b4.a, i12);
            strArr[i11] = new String(b4.a, i12, iH02 - i12, StandardCharsets.ISO_8859_1);
            b4.F(iH02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i7;
        while (b4.f288b < i13) {
            i iVarT = T(i8, b4, z7, i9, eVar);
            if (iVarT != null) {
                arrayList.add(iVarT);
            }
        }
        return new d(str, z8, z9, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e S(int i7, B b4) {
        if (i7 < 4) {
            return null;
        }
        int iT = b4.t();
        Charset charsetE0 = e0(iT);
        byte[] bArr = new byte[3];
        b4.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        b4.e(bArr2, 0, i8);
        int iG0 = g0(bArr2, 0, iT);
        String str2 = new String(bArr2, 0, iG0, charsetE0);
        int iD0 = d0(iT) + iG0;
        return new e(str, str2, X(bArr2, iD0, g0(bArr2, iD0, iT), charsetE0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x020e A[Catch: all -> 0x012e, Exception -> 0x0131, OutOfMemoryError -> 0x0134, TRY_LEAVE, TryCatch #3 {Exception -> 0x0131, OutOfMemoryError -> 0x0134, all -> 0x012e, blocks: (B:107:0x0128, B:115:0x0139, B:122:0x014f, B:124:0x0157, B:132:0x0171, B:141:0x0189, B:152:0x01a4, B:159:0x01b6, B:182:0x01f4, B:190:0x0209, B:191:0x020e), top: B:205:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0230  */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j2.i T(int r19, B1.B r20, boolean r21, int r22, I1.e r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.h.T(int, B1.B, boolean, int, I1.e):j2.i");
    }

    public static f U(int i7, B b4) {
        int iT = b4.t();
        Charset charsetE0 = e0(iT);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        b4.e(bArr, 0, i8);
        int iH0 = h0(bArr, 0);
        String strM = D.m(new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1));
        int i9 = iH0 + 1;
        int iG0 = g0(bArr, i9, iT);
        String strX = X(bArr, i9, iG0, charsetE0);
        int iD0 = d0(iT) + iG0;
        int iG02 = g0(bArr, iD0, iT);
        String strX2 = X(bArr, iD0, iG02, charsetE0);
        int iD02 = d0(iT) + iG02;
        return new f(strM, strX, strX2, i8 <= iD02 ? K.f302c : Arrays.copyOfRange(bArr, iD02, i8));
    }

    public static l V(int i7, B b4) {
        int iZ = b4.z();
        int iW = b4.w();
        int iW2 = b4.w();
        int iT = b4.t();
        int iT2 = b4.t();
        A a = new A();
        a.o(b4);
        int i8 = ((i7 - 10) * 8) / (iT + iT2);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = a.i(iT);
            int i11 = a.i(iT2);
            iArr[i9] = i10;
            iArr2[i9] = i11;
        }
        return new l(iZ, iW, iW2, iArr, iArr2);
    }

    public static m W(int i7, B b4) {
        byte[] bArr = new byte[i7];
        b4.e(bArr, 0, i7);
        int iH0 = h0(bArr, 0);
        String str = new String(bArr, 0, iH0, StandardCharsets.ISO_8859_1);
        int i8 = iH0 + 1;
        return new m(str, i7 <= i8 ? K.f302c : Arrays.copyOfRange(bArr, i8, i7));
    }

    public static String X(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, charset);
    }

    public static n Y(int i7, B b4, String str) {
        if (i7 < 1) {
            return null;
        }
        int iT = b4.t();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        b4.e(bArr, 0, i8);
        return new n(str, null, Z(bArr, iT, 0));
    }

    public static X Z(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return G.w("");
        }
        j3.D dR = G.r();
        int iG0 = g0(bArr, i8, i7);
        while (i8 < iG0) {
            dR.a(new String(bArr, i8, iG0 - i8, e0(i7)));
            i8 = d0(i7) + iG0;
            iG0 = g0(bArr, i8, i7);
        }
        X xF = dR.f();
        return xF.isEmpty() ? G.w("") : xF;
    }

    public static n a0(int i7, B b4) {
        if (i7 < 1) {
            return null;
        }
        int iT = b4.t();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        b4.e(bArr, 0, i8);
        int iG0 = g0(bArr, 0, iT);
        return new n("TXXX", new String(bArr, 0, iG0, e0(iT)), Z(bArr, iT, d0(iT) + iG0));
    }

    public static o b0(int i7, B b4, String str) {
        byte[] bArr = new byte[i7];
        b4.e(bArr, 0, i7);
        return new o(str, null, new String(bArr, 0, h0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static o c0(int i7, B b4) {
        if (i7 < 1) {
            return null;
        }
        int iT = b4.t();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        b4.e(bArr, 0, i8);
        int iG0 = g0(bArr, 0, iT);
        String str = new String(bArr, 0, iG0, e0(iT));
        int iD0 = d0(iT) + iG0;
        return new o("WXXX", str, X(bArr, iD0, h0(bArr, iD0), StandardCharsets.ISO_8859_1));
    }

    public static int d0(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    public static Charset e0(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String f0(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int g0(byte[] bArr, int i7, int i8) {
        int iH0 = h0(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return iH0;
        }
        while (iH0 < bArr.length - 1) {
            if ((iH0 - i7) % 2 == 0 && bArr[iH0 + 1] == 0) {
                return iH0;
            }
            iH0 = h0(bArr, iH0 + 1);
        }
        return bArr.length;
    }

    public static int h0(byte[] bArr, int i7) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int i0(int i7, B b4) {
        byte[] bArr = b4.a;
        int i8 = b4.f288b;
        int i9 = i8;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= i8 + i7) {
                return i7;
            }
            if ((bArr[i9] & 255) == 255 && bArr[i10] == 0) {
                System.arraycopy(bArr, i9 + 2, bArr, i10, (i7 - (i9 - i8)) - 2);
                i7--;
            }
            i9 = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j0(B1.B r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f288b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.v()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.z()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.w()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.w()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.F(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.F(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.F(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.F(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.F(r2)
            return r4
        Lb0:
            r1.F(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.h.j0(B1.B, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y1.C O(byte[] r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.h.O(byte[], int):y1.C");
    }

    @Override // z1.c
    public final C l(C0818a c0818a, ByteBuffer byteBuffer) {
        return O(byteBuffer.array(), byteBuffer.limit());
    }
}
