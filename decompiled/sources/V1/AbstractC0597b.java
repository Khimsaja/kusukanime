package V1;

import B1.AbstractC0015b;
import B1.K;
import C2.C0034g;
import android.util.Base64;
import b1.AbstractC0703b;
import h2.C1004a;
import io.ktor.client.utils.CIOKt;
import io.ktor.util.GzipHeaderFlags;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m2.C1510a;

/* renamed from: V1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0597b {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9330b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9331c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9332d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9333e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9334f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9335g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f9336h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f9337i = {2002, 2000, 1920, 1601, 1600, 1001, CIOKt.DEFAULT_HTTP_POOL_SIZE, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f9338j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9339k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f9340l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f9341m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9342n = {5, 8, 10, 12};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f9343o = {6, 9, 12, 15};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f9344p = {2, 4, 6, 8};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f9345q = {9, 11, 13, 16};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f9346r = {5, 8, 10, 12};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f9347s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f9348t = {44100, 48000, 32000};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f9349u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f9350v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f9351w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f9352x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9353y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(B1.B r21, V1.t r22, int r23, V1.r r24) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.AbstractC0597b.b(B1.B, V1.t, int, V1.r):boolean");
    }

    public static void c(String str, boolean z7) throws y1.E {
        if (!z7) {
            throw y1.E.a(null, str);
        }
    }

    public static void d(long j7, B1.B b4, G[] gArr) {
        int i7;
        while (true) {
            if (b4.a() <= 1) {
                return;
            }
            int i8 = 0;
            while (true) {
                if (b4.a() == 0) {
                    i7 = -1;
                    break;
                }
                int iT = b4.t();
                i8 += iT;
                if (iT != 255) {
                    i7 = i8;
                    break;
                }
            }
            int i9 = 0;
            while (true) {
                if (b4.a() == 0) {
                    i9 = -1;
                    break;
                }
                int iT2 = b4.t();
                i9 += iT2;
                if (iT2 != 255) {
                    break;
                }
            }
            int i10 = b4.f288b + i9;
            if (i9 == -1 || i9 > b4.a()) {
                AbstractC0015b.v("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i10 = b4.f289c;
            } else if (i7 == 4 && i9 >= 8) {
                int iT3 = b4.t();
                int iZ = b4.z();
                int iG = iZ == 49 ? b4.g() : 0;
                int iT4 = b4.t();
                if (iZ == 47) {
                    b4.G(1);
                }
                boolean z7 = iT3 == 181 && (iZ == 49 || iZ == 47) && iT4 == 3;
                if (iZ == 49) {
                    z7 &= iG == 1195456820;
                }
                if (z7) {
                    e(j7, b4, gArr);
                }
            }
            b4.F(i10);
        }
    }

    public static void e(long j7, B1.B b4, G[] gArr) {
        int iT = b4.t();
        if ((iT & 64) != 0) {
            b4.G(1);
            int i7 = (iT & 31) * 3;
            int i8 = b4.f288b;
            for (G g4 : gArr) {
                b4.F(i8);
                g4.c(b4, i7, 0);
                AbstractC0015b.h(j7 != -9223372036854775807L);
                g4.b(j7, 1, i7, 0, null);
            }
        }
    }

    public static int f(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 < 0 || i7 >= 3 || i8 < 0 || i9 >= 19) {
            return -1;
        }
        int i10 = f9332d[i7];
        if (i10 == 44100) {
            return ((i8 % 2) + f9336h[i9]) * 2;
        }
        int i11 = f9335g[i9];
        return i10 == 32000 ? i11 * 6 : i11 * 4;
    }

    public static void g(int i7, B1.B b4) {
        b4.C(7);
        byte[] bArr = b4.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int h(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!((i7 & (-2097152)) == -2097152) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = f9348t[i11];
        if (i8 == 2) {
            i12 /= 2;
        } else if (i8 == 0) {
            i12 /= 4;
        }
        int i13 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f9349u[i10 - 1] : f9350v[i10 - 1]) * 12) / i12) + i13) * 4;
        }
        int i14 = i8 == 3 ? i9 == 2 ? f9351w[i10 - 1] : f9352x[i10 - 1] : f9353y[i10 - 1];
        if (i8 == 3) {
            return ((i14 * 144) / i12) + i13;
        }
        return (((i9 == 1 ? 72 : 144) * i14) / i12) + i13;
    }

    public static B1.A i(byte[] bArr) {
        byte b4 = bArr[0];
        if (b4 == 127 || b4 == 100 || b4 == 64 || b4 == 113) {
            return new B1.A(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b7 = bArrCopyOf[0];
        if (b7 == -2 || b7 == -1 || b7 == 37 || b7 == -14 || b7 == -24) {
            for (int i7 = 0; i7 < bArrCopyOf.length - 1; i7 += 2) {
                byte b8 = bArrCopyOf[i7];
                int i8 = i7 + 1;
                bArrCopyOf[i7] = bArrCopyOf[i8];
                bArrCopyOf[i8] = b8;
            }
        }
        B1.A a7 = new B1.A(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            B1.A a8 = new B1.A(bArrCopyOf, bArrCopyOf.length);
            while (a8.b() >= 16) {
                a8.t(2);
                int i9 = a8.i(14) & 16383;
                int iMin = Math.min(8 - a7.f283d, 14);
                int i10 = a7.f283d;
                int i11 = (8 - i10) - iMin;
                byte[] bArr2 = a7.f281b;
                int i12 = a7.f282c;
                byte b9 = (byte) (((65280 >> i10) | ((1 << i11) - 1)) & bArr2[i12]);
                bArr2[i12] = b9;
                int i13 = 14 - iMin;
                bArr2[i12] = (byte) (b9 | ((i9 >>> i13) << i11));
                int i14 = i12 + 1;
                while (i13 > 8) {
                    a7.f281b[i14] = (byte) (i9 >>> (i13 - 8));
                    i13 -= 8;
                    i14++;
                }
                int i15 = 8 - i13;
                byte[] bArr3 = a7.f281b;
                byte b10 = (byte) (bArr3[i14] & ((1 << i15) - 1));
                bArr3[i14] = b10;
                bArr3[i14] = (byte) (((i9 & ((1 << i13) - 1)) << i15) | b10);
                a7.t(14);
                a7.a();
            }
        }
        a7.p(bArrCopyOf, bArrCopyOf.length);
        return a7;
    }

    public static long j(byte b4, byte b7) {
        int i7;
        int i8 = b4 & 255;
        int i9 = b4 & 3;
        if (i9 != 0) {
            i7 = 2;
            if (i9 != 1 && i9 != 2) {
                i7 = b7 & 63;
            }
        } else {
            i7 = 1;
        }
        int i10 = i8 >> 3;
        return i7 * (i10 >= 16 ? 2500 << r6 : i10 >= 12 ? 10000 << (i10 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int k(B1.A a7) throws y1.E {
        int i7 = a7.i(4);
        if (i7 == 15) {
            if (a7.b() >= 24) {
                return a7.i(24);
            }
            throw y1.E.a(null, "AAC header insufficient data");
        }
        if (i7 < 13) {
            return a[i7];
        }
        throw y1.E.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int l(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C1.i m(B1.A r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = V1.AbstractC0597b.f9337i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            C1.i r1 = new C1.i
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.AbstractC0597b.m(B1.A):C1.i");
    }

    public static C0596a n(B1.A a7, boolean z7) throws y1.E {
        int i7 = a7.i(5);
        if (i7 == 31) {
            i7 = a7.i(6) + 32;
        }
        int iK = k(a7);
        int i8 = a7.i(4);
        String strG = AbstractC0703b.g(i7, "mp4a.40.");
        if (i7 == 5 || i7 == 29) {
            iK = k(a7);
            int i9 = a7.i(5);
            if (i9 == 31) {
                i9 = a7.i(6) + 32;
            }
            i7 = i9;
            if (i7 == 22) {
                i8 = a7.i(4);
            }
        }
        if (z7) {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 17) {
                switch (i7) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw y1.E.b("Unsupported audio object type: " + i7);
                }
            }
            if (a7.h()) {
                AbstractC0015b.v("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (a7.h()) {
                a7.t(14);
            }
            boolean zH = a7.h();
            if (i8 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i7 == 6 || i7 == 20) {
                a7.t(3);
            }
            if (zH) {
                if (i7 == 22) {
                    a7.t(16);
                }
                if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                    a7.t(3);
                }
                a7.t(1);
            }
            switch (i7) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i10 = a7.i(2);
                    if (i10 == 2 || i10 == 3) {
                        throw y1.E.b("Unsupported epConfig: " + i10);
                    }
            }
        }
        int i11 = f9330b[i8];
        if (i11 != -1) {
            return new C0596a(strG, iK, i11);
        }
        throw y1.E.a(null, null);
    }

    public static void o(B1.A a7, J1.k kVar) throws y1.E {
        int i7 = a7.i(5);
        a7.t(2);
        if (a7.h()) {
            a7.t(5);
        }
        if (i7 >= 7 && i7 <= 10) {
            a7.s();
        }
        if (a7.h()) {
            int i8 = a7.i(3);
            if (kVar.f4208b == -1 && i7 >= 0 && i7 <= 15 && (i8 == 0 || i8 == 1)) {
                kVar.f4208b = i7;
            }
            if (a7.h()) {
                v(a7);
            }
        }
    }

    public static void p(B1.A a7, J1.k kVar) throws y1.E {
        a7.t(2);
        boolean zH = a7.h();
        int i7 = a7.i(8);
        for (int i8 = 0; i8 < i7; i8++) {
            a7.t(2);
            if (a7.h()) {
                a7.t(5);
            }
            if (zH) {
                a7.t(24);
            } else {
                if (a7.h()) {
                    if (!a7.h()) {
                        a7.t(4);
                    }
                    kVar.f4209c = a7.i(6) + 1;
                }
                a7.t(4);
            }
        }
        if (a7.h()) {
            a7.t(3);
            if (a7.h()) {
                v(a7);
            }
        }
    }

    public static int q(B1.A a7, int[] iArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < 3 && a7.h(); i8++) {
            i7++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 += 1 << iArr[i10];
        }
        return a7.i(iArr[i7]) + i9;
    }

    public static y1.C r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i8 = K.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC0015b.v("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C1004a.d(new B1.B(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    AbstractC0015b.w("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new C1510a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new y1.C(arrayList);
    }

    public static int s(int i7, B1.B b4) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return b4.t() + 1;
            case 7:
                return b4.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static L2.e t(B1.B b4) {
        b4.G(1);
        int iW = b4.w();
        long j7 = b4.f288b + iW;
        int i7 = iW / 18;
        long[] jArrCopyOf = new long[i7];
        long[] jArrCopyOf2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long jN = b4.n();
            if (jN == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                break;
            }
            jArrCopyOf[i8] = jN;
            jArrCopyOf2[i8] = b4.n();
            b4.G(2);
            i8++;
        }
        b4.G((int) (j7 - b4.f288b));
        return new L2.e(11, jArrCopyOf, jArrCopyOf2);
    }

    public static C0034g u(B1.B b4, boolean z7, boolean z8) throws y1.E {
        if (z7) {
            w(3, b4, false);
        }
        b4.r((int) b4.k(), StandardCharsets.UTF_8);
        long jK = b4.k();
        String[] strArr = new String[(int) jK];
        for (int i7 = 0; i7 < jK; i7++) {
            strArr[i7] = b4.r((int) b4.k(), StandardCharsets.UTF_8);
        }
        if (z8 && (b4.t() & 1) == 0) {
            throw y1.E.a(null, "framing bit expected to be set");
        }
        return new C0034g(28, strArr);
    }

    public static void v(B1.A a7) throws y1.E {
        int i7 = a7.i(6);
        if (i7 < 2 || i7 > 42) {
            throw y1.E.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i7)));
        }
        a7.t(i7 * 8);
    }

    public static boolean w(int i7, B1.B b4, boolean z7) throws y1.E {
        if (b4.a() < 7) {
            if (z7) {
                return false;
            }
            throw y1.E.a(null, "too short header: " + b4.a());
        }
        if (b4.t() != i7) {
            if (z7) {
                return false;
            }
            throw y1.E.a(null, "expected header type " + Integer.toHexString(i7));
        }
        if (b4.t() == 118 && b4.t() == 111 && b4.t() == 114 && b4.t() == 98 && b4.t() == 105 && b4.t() == 115) {
            return true;
        }
        if (z7) {
            return false;
        }
        throw y1.E.a(null, "expected characters 'vorbis'");
    }
}
