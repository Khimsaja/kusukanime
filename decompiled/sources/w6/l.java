package w6;

import b1.AbstractC0703b;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import z5.AbstractC2517v;
import z5.C2496a;

/* loaded from: classes.dex */
public class l implements Serializable, Comparable {

    /* renamed from: n, reason: collision with root package name */
    public static final l f17157n = new l(new byte[0]);

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f17158k;

    /* renamed from: l, reason: collision with root package name */
    public transient int f17159l;

    /* renamed from: m, reason: collision with root package name */
    public transient String f17160m;

    public l(byte[] bArr) {
        kotlin.jvm.internal.l.f("data", bArr);
        this.f17158k = bArr;
    }

    public static int g(l lVar, l lVar2) {
        lVar.getClass();
        kotlin.jvm.internal.l.f("other", lVar2);
        return lVar.f(lVar2.f17158k, 0);
    }

    public static int k(l lVar, l lVar2) {
        lVar.getClass();
        kotlin.jvm.internal.l.f("other", lVar2);
        return lVar.j(lVar2.f17158k);
    }

    public static /* synthetic */ l o(l lVar, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = -1234567890;
        }
        return lVar.n(i7, i8);
    }

    public String a() {
        byte[] bArr = AbstractC2216a.a;
        byte[] bArr2 = this.f17158k;
        kotlin.jvm.internal.l.f("<this>", bArr2);
        kotlin.jvm.internal.l.f("map", bArr);
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b4 = bArr2[i7];
            int i9 = i7 + 2;
            byte b7 = bArr2[i7 + 1];
            i7 += 3;
            byte b8 = bArr2[i9];
            bArr3[i8] = bArr[(b4 & 255) >> 2];
            bArr3[i8 + 1] = bArr[((b4 & 3) << 4) | ((b7 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr3[i8 + 2] = bArr[((b7 & 15) << 2) | ((b8 & 255) >> 6)];
            i8 += 4;
            bArr3[i10] = bArr[b8 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b9 = bArr2[i7];
            bArr3[i8] = bArr[(b9 & 255) >> 2];
            bArr3[i8 + 1] = bArr[(b9 & 3) << 4];
            bArr3[i8 + 2] = 61;
            bArr3[i8 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i7 + 1;
            byte b10 = bArr2[i7];
            byte b11 = bArr2[i11];
            bArr3[i8] = bArr[(b10 & 255) >> 2];
            bArr3[i8 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            bArr3[i8 + 2] = bArr[(b11 & 15) << 2];
            bArr3[i8 + 3] = 61;
        }
        return new String(bArr3, C2496a.f19036b);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        kotlin.jvm.internal.l.f("other", lVar);
        int iD = d();
        int iD2 = lVar.d();
        int iMin = Math.min(iD, iD2);
        for (int i7 = 0; i7 < iMin; i7++) {
            int i8 = i(i7) & 255;
            int i9 = lVar.i(i7) & 255;
            if (i8 != i9) {
                return i8 < i9 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public l c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f17158k, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.l.c(bArrDigest);
        return new l(bArrDigest);
    }

    public int d() {
        return this.f17158k.length;
    }

    public String e() {
        byte[] bArr = this.f17158k;
        char[] cArr = new char[bArr.length * 2];
        int i7 = 0;
        for (byte b4 : bArr) {
            int i8 = i7 + 1;
            char[] cArr2 = x6.b.a;
            cArr[i7] = cArr2[(b4 >> 4) & 15];
            i7 += 2;
            cArr[i8] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            int iD = lVar.d();
            byte[] bArr = this.f17158k;
            if (iD == bArr.length && lVar.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i7) {
        kotlin.jvm.internal.l.f("other", bArr);
        byte[] bArr2 = this.f17158k;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i7, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC2217b.a(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.f17158k;
    }

    public int hashCode() {
        int i7 = this.f17159l;
        if (i7 != 0) {
            return i7;
        }
        int iHashCode = Arrays.hashCode(this.f17158k);
        this.f17159l = iHashCode;
        return iHashCode;
    }

    public byte i(int i7) {
        return this.f17158k[i7];
    }

    public int j(byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        int iD = d();
        byte[] bArr2 = this.f17158k;
        for (int iMin = Math.min(iD, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC2217b.a(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i7, int i8, int i9, byte[] bArr) {
        kotlin.jvm.internal.l.f("other", bArr);
        if (i7 < 0) {
            return false;
        }
        byte[] bArr2 = this.f17158k;
        return i7 <= bArr2.length - i9 && i8 >= 0 && i8 <= bArr.length - i9 && AbstractC2217b.a(i7, i8, i9, bArr2, bArr);
    }

    public boolean m(int i7, l lVar, int i8) {
        kotlin.jvm.internal.l.f("other", lVar);
        return lVar.l(0, i7, i8, this.f17158k);
    }

    public l n(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = d();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f17158k;
        if (i8 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0703b.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i8 - i7 >= 0) {
            return (i7 == 0 && i8 == bArr.length) ? this : new l(P3.m.a0(bArr, i7, i8));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public l p() {
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f17158k;
            if (i7 >= bArr.length) {
                return this;
            }
            byte b4 = bArr[i7];
            if (b4 >= 65 && b4 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.l.e("copyOf(...)", bArrCopyOf);
                bArrCopyOf[i7] = (byte) (b4 + 32);
                for (int i8 = i7 + 1; i8 < bArrCopyOf.length; i8++) {
                    byte b7 = bArrCopyOf[i8];
                    if (b7 >= 65 && b7 <= 90) {
                        bArrCopyOf[i8] = (byte) (b7 + 32);
                    }
                }
                return new l(bArrCopyOf);
            }
            i7++;
        }
    }

    public byte[] q() {
        byte[] bArr = this.f17158k;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.l.e("copyOf(...)", bArrCopyOf);
        return bArrCopyOf;
    }

    public final String r() {
        String str = this.f17160m;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        kotlin.jvm.internal.l.f("<this>", bArrH);
        String str2 = new String(bArrH, C2496a.f19036b);
        this.f17160m = str2;
        return str2;
    }

    public void s(C2224i c2224i, int i7) {
        kotlin.jvm.internal.l.f("buffer", c2224i);
        c2224i.m216write(this.f17158k, 0, i7);
    }

    public String toString() {
        byte b4;
        int i7;
        byte[] bArr = this.f17158k;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            if (i8 >= length) {
                break;
            }
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                int i11 = i10 + 1;
                if (i10 == 64) {
                    break;
                }
                if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (127 <= b7 && b7 < 160))) || b7 == 65533) {
                    break;
                }
                i9 += b7 < 65536 ? 1 : 2;
                i8++;
                while (true) {
                    i10 = i11;
                    if (i8 < length && (b4 = bArr[i8]) >= 0) {
                        i8++;
                        i11 = i10 + 1;
                        if (i10 == 64) {
                            break loop0;
                        }
                        if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (127 <= b4 && b4 < 160))) || b4 == 65533) {
                            break loop0;
                        }
                        i9 += b4 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b7 >> 5) == -2) {
                int i12 = i8 + 1;
                if (length > i12) {
                    byte b8 = bArr[i12];
                    if ((b8 & 192) == 128) {
                        int i13 = (b8 ^ 3968) ^ (b7 << 6);
                        if (i13 >= 128) {
                            i7 = i10 + 1;
                            if (i10 == 64) {
                                break;
                            }
                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                break;
                            }
                            i9 += i13 < 65536 ? 1 : 2;
                            i8 += 2;
                            i10 = i7;
                        } else if (i10 != 64) {
                            break;
                        }
                    } else if (i10 != 64) {
                        break;
                    }
                } else if (i10 != 64) {
                    break;
                }
            } else if ((b7 >> 4) == -2) {
                int i14 = i8 + 2;
                if (length > i14) {
                    byte b9 = bArr[i8 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i14];
                        if ((b10 & 192) == 128) {
                            int i15 = ((b10 ^ (-123008)) ^ (b9 << 6)) ^ (b7 << 12);
                            if (i15 < 2048) {
                                if (i10 != 64) {
                                    break;
                                }
                            } else if (55296 > i15 || i15 >= 57344) {
                                i7 = i10 + 1;
                                if (i10 == 64) {
                                    break;
                                }
                                if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                    break;
                                }
                                i9 += i15 < 65536 ? 1 : 2;
                                i8 += 3;
                                i10 = i7;
                            } else if (i10 != 64) {
                                break;
                            }
                        } else if (i10 != 64) {
                            break;
                        }
                    } else if (i10 != 64) {
                        break;
                    }
                } else if (i10 != 64) {
                    break;
                }
            } else if ((b7 >> 3) == -2) {
                int i16 = i8 + 3;
                if (length > i16) {
                    byte b11 = bArr[i8 + 1];
                    if ((b11 & 192) == 128) {
                        byte b12 = bArr[i8 + 2];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i16];
                            if ((b13 & 192) == 128) {
                                int i17 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b7 << 18);
                                if (i17 > 1114111) {
                                    if (i10 != 64) {
                                        break;
                                    }
                                } else if (55296 > i17 || i17 >= 57344) {
                                    if (i17 >= 65536) {
                                        i7 = i10 + 1;
                                        if (i10 == 64) {
                                            break;
                                        }
                                        if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                            break;
                                        }
                                        i9 += i17 < 65536 ? 1 : 2;
                                        i8 += 4;
                                        i10 = i7;
                                    } else if (i10 != 64) {
                                        break;
                                    }
                                } else if (i10 != 64) {
                                    break;
                                }
                            } else if (i10 != 64) {
                                break;
                            }
                        } else if (i10 != 64) {
                            break;
                        }
                    } else if (i10 != 64) {
                        break;
                    }
                } else if (i10 != 64) {
                    break;
                }
            } else if (i10 != 64) {
                break;
            }
        }
        i9 = -1;
        if (i9 != -1) {
            String strR = r();
            String strSubstring = strR.substring(0, i9);
            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
            String strR2 = AbstractC2517v.R(AbstractC2517v.R(AbstractC2517v.R(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i9 >= strR.length()) {
                return A6.b.d(']', "[text=", strR2);
            }
            return "[size=" + bArr.length + " text=" + strR2 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0703b.l(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new l(P3.m.a0(bArr, 0, 64))).e());
        sb.append("…]");
        return sb.toString();
    }
}
