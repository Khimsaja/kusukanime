package p2;

import B1.AbstractC0015b;
import V1.E;
import b1.AbstractC0703b;
import j2.C1313a;
import j3.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import y1.B;
import y1.C;
import y1.D;

/* loaded from: classes.dex */
public abstract class o {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static C1.a a(C c2, String str) {
        int i7 = 0;
        while (true) {
            B[] bArr = c2.a;
            if (i7 >= bArr.length) {
                return null;
            }
            B b4 = bArr[i7];
            if (b4 instanceof C1.a) {
                C1.a aVar = (C1.a) b4;
                if (aVar.a.equals(str)) {
                    return aVar;
                }
            }
            i7++;
        }
    }

    public static String b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z7 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((s) it.next()).a.f14309g.f18112n;
            if (D.l(str2)) {
                return "video/mp4";
            }
            if (D.i(str2)) {
                z7 = true;
            } else if (D.j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z7 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    public static boolean c(int i7, boolean z7) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579 && z7) {
            return true;
        }
        int[] iArr = a;
        for (int i8 = 0; i8 < 29; i8++) {
            if (iArr[i8] == i7) {
                return true;
            }
        }
        return false;
    }

    public static j2.e d(int i7, B1.B b4) {
        int iG = b4.g();
        if (b4.g() == 1684108385) {
            b4.G(8);
            String strP = b4.p(iG - 16);
            return new j2.e("und", strP, strP);
        }
        AbstractC0015b.v("MetadataUtil", "Failed to parse comment attribute: " + C1.e.b(i7));
        return null;
    }

    public static C1313a e(B1.B b4) {
        int iG = b4.g();
        if (b4.g() != 1684108385) {
            AbstractC0015b.v("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iG2 = b4.g();
        byte[] bArr = c.a;
        int i7 = iG2 & 16777215;
        String str = i7 == 13 ? "image/jpeg" : i7 == 14 ? "image/png" : null;
        if (str == null) {
            A6.b.n(i7, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        b4.G(4);
        int i8 = iG - 16;
        byte[] bArr2 = new byte[i8];
        b4.e(bArr2, 0, i8);
        return new C1313a(str, null, 3, bArr2);
    }

    public static j2.n f(int i7, B1.B b4, String str) {
        int iG = b4.g();
        if (b4.g() == 1684108385 && iG >= 22) {
            b4.G(10);
            int iZ = b4.z();
            if (iZ > 0) {
                String strG = AbstractC0703b.g(iZ, "");
                int iZ2 = b4.z();
                if (iZ2 > 0) {
                    strG = strG + "/" + iZ2;
                }
                return new j2.n(str, null, G.w(strG));
            }
        }
        AbstractC0015b.v("MetadataUtil", "Failed to parse index/count attribute: " + C1.e.b(i7));
        return null;
    }

    public static int g(B1.B b4) {
        int iG = b4.g();
        if (b4.g() == 1684108385) {
            b4.G(8);
            int i7 = iG - 16;
            if (i7 == 1) {
                return b4.t();
            }
            if (i7 == 2) {
                return b4.z();
            }
            if (i7 == 3) {
                return b4.w();
            }
            if (i7 == 4 && (b4.a[b4.f288b] & 128) == 0) {
                return b4.x();
            }
        }
        AbstractC0015b.v("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static j2.i h(int i7, String str, B1.B b4, boolean z7, boolean z8) {
        int iG = g(b4);
        if (z8) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z7 ? new j2.n(str, null, G.w(Integer.toString(iG))) : new j2.e("und", str, Integer.toString(iG));
        }
        AbstractC0015b.v("MetadataUtil", "Failed to parse uint8 attribute: " + C1.e.b(i7));
        return null;
    }

    public static j2.n i(int i7, B1.B b4, String str) {
        int iG = b4.g();
        if (b4.g() == 1684108385) {
            b4.G(8);
            return new j2.n(str, null, G.w(b4.p(iG - 16)));
        }
        AbstractC0015b.v("MetadataUtil", "Failed to parse text attribute: " + C1.e.b(i7));
        return null;
    }

    public static E j(V1.o oVar, boolean z7, boolean z8) {
        E e7;
        int i7;
        int i8;
        long jN;
        int i9;
        int i10;
        int[] iArr;
        boolean z9 = true;
        long jC = oVar.c();
        long j7 = -1;
        long j8 = 4096;
        if (jC != -1 && jC <= 4096) {
            j8 = jC;
        }
        int i11 = (int) j8;
        B1.B b4 = new B1.B(64);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            b4.C(8);
            if (!oVar.h(b4.a, i12, 8, z9)) {
                break;
            }
            long jV = b4.v();
            int i15 = z9;
            int iG = b4.g();
            if (jV == 1) {
                oVar.l(b4.a, 8, 8);
                i9 = 16;
                b4.E(16);
                jN = b4.n();
                i8 = i13;
            } else {
                if (jV == 0) {
                    long jC2 = oVar.c();
                    if (jC2 != j7) {
                        jV = (jC2 - oVar.i()) + 8;
                    }
                }
                i8 = i13;
                jN = jV;
                i9 = 8;
            }
            long j9 = i9;
            if (jN < j9) {
                return new i();
            }
            int i16 = i8 + i9;
            e7 = null;
            if (iG == 1836019574) {
                i11 += (int) jN;
                if (jC != -1 && i11 > jC) {
                    i11 = (int) jC;
                }
                i13 = i16;
                z9 = i15;
                j7 = -1;
                i12 = 0;
            } else {
                if (iG == 1836019558 || iG == 1836475768) {
                    i7 = i15;
                    break;
                }
                if (iG == 1835295092) {
                    i14 = i15;
                }
                long j10 = jC;
                if ((i16 + jN) - j9 >= i11) {
                    i7 = 0;
                    break;
                }
                int i17 = (int) (jN - j9);
                i13 = i16 + i17;
                if (iG != 1718909296) {
                    i10 = 0;
                    if (i17 != 0) {
                        oVar.n(i17);
                    }
                } else {
                    if (i17 < 8) {
                        return new i();
                    }
                    b4.C(i17);
                    i10 = 0;
                    oVar.l(b4.a, 0, i17);
                    if (c(b4.g(), z8)) {
                        i14 = i15;
                    }
                    b4.G(4);
                    int iA = b4.a() / 4;
                    if (i14 == 0 && iA > 0) {
                        iArr = new int[iA];
                        int i18 = 0;
                        while (true) {
                            if (i18 >= iA) {
                                break;
                            }
                            int iG2 = b4.g();
                            iArr[i18] = iG2;
                            if (c(iG2, z8)) {
                                i14 = i15;
                                break;
                            }
                            i18++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (i14 == 0) {
                        i iVar = new i();
                        if (iArr == null) {
                            int i19 = m3.a.f12968m;
                            return iVar;
                        }
                        int i20 = m3.a.f12968m;
                        if (iArr.length == 0) {
                            return iVar;
                        }
                        new m3.a(Arrays.copyOf(iArr, iArr.length));
                        return iVar;
                    }
                }
                i12 = i10;
                z9 = i15;
                jC = j10;
                j7 = -1;
            }
        }
        e7 = null;
        i7 = i12;
        return i14 == 0 ? i.f14262c : z7 != i7 ? i7 != 0 ? i.a : i.f14261b : e7;
    }
}
