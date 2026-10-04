package p2;

import B1.B;
import B1.K;
import O1.W;
import V1.AbstractC0597b;
import android.util.Pair;
import java.nio.charset.StandardCharsets;
import y1.D;
import y1.E;

/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        int i7 = K.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static W a(int i7, B b4) {
        b4.F(i7 + 12);
        b4.G(1);
        b(b4);
        b4.G(2);
        int iT = b4.t();
        if ((iT & 128) != 0) {
            b4.G(2);
        }
        if ((iT & 64) != 0) {
            b4.G(b4.t());
        }
        if ((iT & 32) != 0) {
            b4.G(2);
        }
        b4.G(1);
        b(b4);
        String strE = D.e(b4.t());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new W(strE, null, -1L, -1L);
        }
        b4.G(4);
        long jV = b4.v();
        long jV2 = b4.v();
        b4.G(1);
        int iB = b(b4);
        long j7 = jV2;
        byte[] bArr = new byte[iB];
        b4.e(bArr, 0, iB);
        if (j7 <= 0) {
            j7 = -1;
        }
        return new W(strE, bArr, j7, jV > 0 ? jV : -1L);
    }

    public static int b(B b4) {
        int iT = b4.t();
        int i7 = iT & 127;
        while ((iT & 128) == 128) {
            iT = b4.t();
            i7 = (i7 << 7) | (iT & 127);
        }
        return i7;
    }

    public static int c(int i7) {
        return (i7 >> 24) & 255;
    }

    public static C1.g d(B b4) {
        long jN;
        long jN2;
        b4.F(8);
        if (c(b4.g()) == 0) {
            jN = b4.v();
            jN2 = b4.v();
        } else {
            jN = b4.n();
            jN2 = b4.n();
        }
        return new C1.g(jN, jN2, b4.v());
    }

    public static Pair e(B b4, int i7, int i8) throws E {
        Integer num;
        q qVar;
        Pair pairCreate;
        int i9;
        int i10;
        Integer num2;
        boolean z7;
        int i11 = b4.f288b;
        while (i11 - i7 < i8) {
            b4.F(i11);
            int iG = b4.g();
            AbstractC0597b.c("childAtomSize must be positive", iG > 0);
            if (b4.g() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                Integer numValueOf = null;
                String strR = null;
                while (i12 - i11 < iG) {
                    b4.F(i12);
                    int iG2 = b4.g();
                    int iG3 = b4.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(b4.g());
                    } else if (iG3 == 1935894637) {
                        b4.G(4);
                        strR = b4.r(4, StandardCharsets.UTF_8);
                    } else if (iG3 == 1935894633) {
                        i14 = i12;
                        i13 = iG2;
                    }
                    i12 += iG2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strR) || "cbc1".equals(strR) || "cens".equals(strR) || "cbcs".equals(strR)) {
                    AbstractC0597b.c("frma atom is mandatory", numValueOf != null);
                    AbstractC0597b.c("schi atom is mandatory", i14 != -1);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            num = numValueOf;
                            qVar = null;
                            break;
                        }
                        b4.F(i15);
                        int iG4 = b4.g();
                        if (b4.g() == 1952804451) {
                            int iC = c(b4.g());
                            b4.G(1);
                            if (iC == 0) {
                                b4.G(1);
                                i10 = 0;
                                i9 = 0;
                            } else {
                                int iT = b4.t();
                                i9 = iT & 15;
                                i10 = (iT & 240) >> 4;
                            }
                            if (b4.t() == 1) {
                                num2 = numValueOf;
                                z7 = true;
                            } else {
                                num2 = numValueOf;
                                z7 = false;
                            }
                            int iT2 = b4.t();
                            byte[] bArr2 = new byte[16];
                            b4.e(bArr2, 0, 16);
                            if (z7 && iT2 == 0) {
                                int iT3 = b4.t();
                                byte[] bArr3 = new byte[iT3];
                                b4.e(bArr3, 0, iT3);
                                bArr = bArr3;
                            }
                            num = num2;
                            qVar = new q(z7, strR, iT2, bArr2, i10, i9, bArr);
                        } else {
                            i15 += iG4;
                        }
                    }
                    AbstractC0597b.c("tenc atom is mandatory", qVar != null);
                    int i16 = K.a;
                    pairCreate = Pair.create(num, qVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i11 += iG;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0a91 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static B1.G f(B1.B r63, int r64, int r65, java.lang.String r66, y1.C2389k r67, boolean r68) throws y1.E {
        /*
            Method dump skipped, instructions count: 3726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.f(B1.B, int, int, java.lang.String, y1.k, boolean):B1.G");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
    
        r22 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c8, code lost:
    
        r27 = r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x061b A[ADDED_TO_REGION, LOOP:15: B:262:0x061b->B:266:0x0627, LOOP_START, PHI: r23
      0x061b: PHI (r23v4 int) = (r23v3 int), (r23v5 int) binds: [B:261:0x0619, B:266:0x0627] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x098d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x060d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList g(C1.c r60, V1.v r61, long r62, y1.C2389k r64, boolean r65, boolean r66, i3.d r67) {
        /*
            Method dump skipped, instructions count: 2455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.g(C1.c, V1.v, long, y1.k, boolean, boolean, i3.d):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:284:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x065b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(B1.B r56, int r57, int r58, int r59, int r60, java.lang.String r61, int r62, y1.C2389k r63, B1.G r64, int r65) throws y1.E {
        /*
            Method dump skipped, instructions count: 2670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.h(B1.B, int, int, int, int, java.lang.String, int, y1.k, B1.G, int):void");
    }
}
