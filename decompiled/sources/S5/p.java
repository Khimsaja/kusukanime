package S5;

import b1.AbstractC0703b;
import io.ktor.util.date.GMTDateParser;
import java.io.EOFException;
import java.nio.ByteBuffer;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class p {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static final void a(long j7, long j8, long j9) {
        if (j8 < 0 || j9 > j7) {
            StringBuilder sbK = A6.b.k("startIndex (", j8, ") and endIndex (");
            sbK.append(j9);
            sbK.append(") are not within the range [0..size(");
            sbK.append(j7);
            sbK.append("))");
            throw new IndexOutOfBoundsException(sbK.toString());
        }
        if (j8 <= j9) {
            return;
        }
        StringBuilder sbK2 = A6.b.k("startIndex (", j8, ") > endIndex (");
        sbK2.append(j9);
        sbK2.append(')');
        throw new IllegalArgumentException(sbK2.toString());
    }

    public static final void b(long j7, long j8, long j9) {
        if (j8 < 0 || j8 > j7 || j7 - j8 < j9 || j9 < 0) {
            StringBuilder sbK = A6.b.k("offset (", j8, ") and byteCount (");
            sbK.append(j9);
            sbK.append(") are not within the range [0..size(");
            sbK.append(j7);
            sbK.append("))");
            throw new IllegalArgumentException(sbK.toString());
        }
    }

    public static final String c(a aVar, long j7) {
        if (j7 == 0) {
            return "";
        }
        j jVar = aVar.f8782k;
        if (jVar == null) {
            throw new IllegalStateException("Unreacheable");
        }
        if (jVar.b() < j7) {
            byte[] bArrI = i(aVar, (int) j7);
            return z1.c.e(bArrI, 0, bArrI.length);
        }
        int i7 = jVar.f8801b;
        String strE = z1.c.e(jVar.a, i7, Math.min(jVar.f8802c, ((int) j7) + i7));
        aVar.n(j7);
        return strE;
    }

    public static final int d(a aVar) throws EOFException {
        int i7;
        int i8;
        int i9;
        aVar.Q(1L);
        byte bE = aVar.e(0L);
        if ((bE & 128) == 0) {
            i7 = bE & 127;
            i8 = 0;
            i9 = 1;
        } else if ((bE & 224) == 192) {
            i7 = bE & 31;
            i9 = 2;
            i8 = 128;
        } else if ((bE & 240) == 224) {
            i7 = bE & 15;
            i9 = 3;
            i8 = 2048;
        } else {
            if ((bE & 248) != 240) {
                aVar.n(1L);
                return 65533;
            }
            i7 = bE & 7;
            i8 = 65536;
            i9 = 4;
        }
        int i10 = i7;
        long j7 = i9;
        if (aVar.f8784m < j7) {
            StringBuilder sbP = AbstractC0703b.p(i9, "size < ", ": ");
            sbP.append(aVar.f8784m);
            sbP.append(" (to read code point prefixed 0x");
            char[] cArr = a;
            sbP.append(new String(new char[]{cArr[(bE >> 4) & 15], cArr[bE & 15]}));
            sbP.append(')');
            throw new EOFException(sbP.toString());
        }
        for (int i11 = 1; i11 < i9; i11++) {
            long j8 = i11;
            byte bE2 = aVar.e(j8);
            if ((bE2 & 192) != 128) {
                aVar.n(j8);
                return 65533;
            }
            i10 = (i10 << 6) | (bE2 & 63);
        }
        aVar.n(j7);
        if (i10 <= 1114111 && ((55296 > i10 || i10 >= 57344) && i10 >= i8)) {
            return i10;
        }
        return 65533;
    }

    public static final int e(j jVar, byte b4, int i7, int i8) {
        if (i7 < 0 || i7 >= jVar.b()) {
            throw new IllegalArgumentException(String.valueOf(i7).toString());
        }
        if (i7 > i8 || i8 > jVar.b()) {
            throw new IllegalArgumentException(String.valueOf(i8).toString());
        }
        int i9 = jVar.f8801b;
        while (i7 < i8) {
            if (jVar.a[i9 + i7] == b4) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final boolean f(j jVar) {
        kotlin.jvm.internal.l.f("<this>", jVar);
        return jVar.b() == 0;
    }

    public static final int g(n nVar, ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("<this>", nVar);
        kotlin.jvm.internal.l.f("sink", byteBuffer);
        if (nVar.a().f8784m == 0) {
            nVar.c(8192L);
            if (nVar.a().f8784m == 0) {
                return -1;
            }
        }
        a aVarA = nVar.a();
        kotlin.jvm.internal.l.f("<this>", aVarA);
        if (aVarA.z()) {
            return -1;
        }
        if (aVarA.z()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        j jVar = aVarA.f8782k;
        kotlin.jvm.internal.l.c(jVar);
        int i7 = jVar.f8801b;
        int iMin = Math.min(byteBuffer.remaining(), jVar.f8802c - i7);
        byteBuffer.put(jVar.a, i7, iMin);
        if (iMin == 0) {
            return iMin;
        }
        if (iMin < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (iMin > jVar.b()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        aVarA.n(iMin);
        return iMin;
    }

    public static final byte[] h(n nVar) {
        kotlin.jvm.internal.l.f("<this>", nVar);
        return j(nVar, -1);
    }

    public static final byte[] i(n nVar, int i7) {
        kotlin.jvm.internal.l.f("<this>", nVar);
        long j7 = i7;
        if (j7 >= 0) {
            return j(nVar, i7);
        }
        throw new IllegalArgumentException(("byteCount (" + j7 + ") < 0").toString());
    }

    public static final byte[] j(n nVar, int i7) {
        if (i7 == -1) {
            for (long j7 = 2147483647L; nVar.a().f8784m < 2147483647L && nVar.c(j7); j7 *= 2) {
            }
            if (nVar.a().f8784m >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + nVar.a().f8784m).toString());
            }
            i7 = (int) nVar.a().f8784m;
        } else {
            nVar.Q(i7);
        }
        byte[] bArr = new byte[i7];
        l(nVar.a(), bArr, 0, i7);
        return bArr;
    }

    public static final String k(n nVar) {
        nVar.c(Long.MAX_VALUE);
        return c(nVar.a(), nVar.a().f8784m);
    }

    public static final void l(n nVar, byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", nVar);
        kotlin.jvm.internal.l.f("sink", bArr);
        a(bArr.length, i7, i8);
        int i9 = i7;
        while (i9 < i8) {
            int iC = nVar.C(bArr, i9, i8);
            if (iC == -1) {
                throw new EOFException("Source exhausted before reading " + (i8 - i7) + " bytes. Only " + iC + " bytes were read.");
            }
            i9 += iC;
        }
    }

    public static final void m(a aVar, ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("<this>", aVar);
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            j jVarM = aVar.m(1);
            int i7 = jVarM.f8802c;
            byte[] bArr = jVarM.a;
            int iMin = Math.min(iRemaining, bArr.length - i7);
            byteBuffer.get(bArr, i7, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                jVarM.f8802c += iMin;
                aVar.f8784m += iMin;
            } else {
                if (iMin < 0 || iMin > jVarM.a()) {
                    StringBuilder sbP = AbstractC0703b.p(iMin, "Invalid number of bytes written: ", ". Should be in 0..");
                    sbP.append(jVarM.a());
                    throw new IllegalStateException(sbP.toString().toString());
                }
                if (iMin != 0) {
                    jVarM.f8802c += iMin;
                    aVar.f8784m += iMin;
                } else if (f(jVarM)) {
                    aVar.i();
                }
            }
        }
    }

    public static final void n(l lVar, ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("<this>", lVar);
        long j7 = lVar.a().f8784m;
        m(lVar.a(), byteBuffer);
        long j8 = lVar.a().f8784m;
        lVar.q();
    }

    public static final void o(a aVar, int i7) {
        String strH;
        int i8 = 0;
        if (i7 < 0 || i7 > 1114111) {
            StringBuilder sb = new StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
            if (i7 != 0) {
                char[] cArr = a;
                char c2 = cArr[0];
                char[] cArr2 = {c2, c2, c2, c2, c2, c2, cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
                while (i8 < 8 && cArr2[i8] == '0') {
                    i8++;
                }
                strH = AbstractC2517v.H(cArr2, i8, 8);
            } else {
                strH = "0";
            }
            sb.append(strH);
            sb.append(" (");
            sb.append(i7);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString());
        }
        if (i7 < 128) {
            aVar.D((byte) i7);
            return;
        }
        if (i7 < 2048) {
            j jVarM = aVar.m(2);
            int i9 = jVarM.f8802c;
            byte[] bArr = jVarM.a;
            bArr[i9] = (byte) ((i7 >> 6) | 192);
            bArr[1 + i9] = (byte) ((i7 & 63) | 128);
            jVarM.f8802c = i9 + 2;
            aVar.f8784m += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            aVar.D((byte) 63);
            return;
        }
        if (i7 < 65536) {
            j jVarM2 = aVar.m(3);
            int i10 = jVarM2.f8802c;
            byte[] bArr2 = jVarM2.a;
            bArr2[i10] = (byte) 224;
            bArr2[1 + i10] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[2 + i10] = (byte) ((i7 & 63) | 128);
            jVarM2.f8802c = i10 + 3;
            aVar.f8784m += 3;
            return;
        }
        j jVarM3 = aVar.m(4);
        int i11 = jVarM3.f8802c;
        byte[] bArr3 = jVarM3.a;
        bArr3[i11] = (byte) 240;
        bArr3[1 + i11] = (byte) 128;
        bArr3[2 + i11] = (byte) (((i7 >> 6) & 63) | 128);
        bArr3[3 + i11] = (byte) ((i7 & 63) | 128);
        jVarM3.f8802c = i11 + 4;
        aVar.f8784m += 4;
    }

    public static final void p(l lVar, String str, int i7, int i8) {
        int i9;
        long j7;
        kotlin.jvm.internal.l.f("string", str);
        a(str.length(), i7, i8);
        a aVarA = lVar.a();
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 128) {
                j jVarM = aVarA.m(1);
                int i10 = -i7;
                int iMin = Math.min(i8, jVarM.a() + i7);
                int i11 = i7 + 1;
                int i12 = jVarM.f8802c + i7 + i10;
                byte[] bArr = jVarM.a;
                bArr[i12] = (byte) cCharAt;
                while (i11 < iMin) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[jVarM.f8802c + i11 + i10] = (byte) cCharAt2;
                    i11++;
                }
                int i13 = i10 + i11;
                if (i13 == 1) {
                    jVarM.f8802c += i13;
                    aVarA.f8784m += i13;
                } else {
                    if (i13 < 0 || i13 > jVarM.a()) {
                        StringBuilder sbP = AbstractC0703b.p(i13, "Invalid number of bytes written: ", ". Should be in 0..");
                        sbP.append(jVarM.a());
                        throw new IllegalStateException(sbP.toString().toString());
                    }
                    if (i13 != 0) {
                        jVarM.f8802c += i13;
                        aVarA.f8784m += i13;
                    } else if (f(jVarM)) {
                        aVarA.i();
                    }
                }
                i7 = i11;
            } else {
                if (cCharAt < 2048) {
                    i9 = 2;
                    j jVarM2 = aVarA.m(2);
                    int i14 = jVarM2.f8802c;
                    byte[] bArr2 = jVarM2.a;
                    bArr2[i14] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt & '?') | 128);
                    jVarM2.f8802c = i14 + 2;
                    j7 = aVarA.f8784m;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i9 = 3;
                    j jVarM3 = aVarA.m(3);
                    int i15 = jVarM3.f8802c;
                    byte[] bArr3 = jVarM3.a;
                    bArr3[i15] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt & '?') | 128);
                    jVarM3.f8802c = i15 + 3;
                    j7 = aVarA.f8784m;
                } else {
                    int i16 = i7 + 1;
                    char cCharAt3 = i16 < i8 ? str.charAt(i16) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        aVarA.D((byte) 63);
                        i7 = i16;
                    } else {
                        int i17 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        j jVarM4 = aVarA.m(4);
                        int i18 = jVarM4.f8802c;
                        byte[] bArr4 = jVarM4.a;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        jVarM4.f8802c = i18 + 4;
                        aVarA.f8784m += 4;
                        i7 += 2;
                    }
                }
                aVarA.f8784m = j7 + i9;
                i7++;
            }
        }
        lVar.q();
    }
}
