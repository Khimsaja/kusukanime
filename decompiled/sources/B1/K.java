package B1;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import e5.AbstractC0832b;
import f1.AbstractC0871d;
import io.ktor.http.ContentType;
import io.ktor.util.GzipHeaderFlags;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import v.c0;
import y1.L;

/* loaded from: classes.dex */
public abstract class K {
    public static final int a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f301b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f302c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f303d;

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f304e;

    /* renamed from: f, reason: collision with root package name */
    public static HashMap f305f;

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f306g;

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f307h;

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f308i;

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f309j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f310k;

    static {
        int i7 = Build.VERSION.SDK_INT;
        a = i7;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f301b = str + ", " + Build.MODEL + ", " + str2 + ", " + i7;
        f302c = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f303d = Pattern.compile("%([A-Fa-f0-9]{2})");
        f304e = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f306g = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f307h = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f308i = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f309j = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f310k = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean A(B b4, B b7, Inflater inflater) {
        if (b4.a() <= 0) {
            return false;
        }
        if (b7.a.length < b4.a()) {
            b7.b(b4.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(b4.a, b4.f288b, b4.a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = b7.a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = b7.a;
                    if (iInflate == bArr2.length) {
                        b7.b(bArr2.length * 2);
                    }
                } else {
                    b7.E(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static void B(int i7) {
        Integer.toString(i7, 36);
    }

    public static boolean C(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }

    public static boolean D(Context context) {
        int i7 = a;
        if (i7 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i7 == 30) {
            String str = Build.MODEL;
            if (AbstractC0871d.S(str, "moto g(20)") || AbstractC0871d.S(str, "rmx3231")) {
                return true;
            }
        }
        return i7 == 34 && AbstractC0871d.S(Build.MODEL, "sm-x200");
    }

    public static boolean E(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long F(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static String G(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strR0 = AbstractC0871d.r0(str);
        int i7 = 0;
        String str2 = strR0.split("-", 2)[0];
        if (f305f == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f306g;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                map.put(strArr[i8], strArr[i8 + 1]);
            }
            f305f = map;
        }
        String str4 = (String) f305f.get(str2);
        if (str4 != null) {
            strR0 = str4 + strR0.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strR0;
        }
        while (true) {
            String[] strArr2 = f307h;
            if (i7 >= strArr2.length) {
                return strR0;
            }
            if (strR0.startsWith(strArr2[i7])) {
                return strArr2[i7 + 1] + strR0.substring(strArr2[i7].length());
            }
            i7 += 2;
        }
    }

    public static Object[] H(int i7, Object[] objArr) {
        AbstractC0015b.c(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static void I(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static long J(int i7, long j7) {
        return L(j7, 1000000L, i7, RoundingMode.DOWN);
    }

    public static void K(long[] jArr, long j7) {
        long j8;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i7 = 0;
        if (j7 >= 1000000 && j7 % 1000000 == 0) {
            long jR = AbstractC0832b.r(j7, 1000000L, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = AbstractC0832b.r(jArr[i7], jR, roundingMode);
                i7++;
            }
            return;
        }
        if (j7 < 1000000 && 1000000 % j7 == 0) {
            long jR2 = AbstractC0832b.r(1000000L, j7, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = AbstractC0832b.C(jArr[i7], jR2);
                i7++;
            }
            return;
        }
        int i8 = 0;
        while (i8 < jArr.length) {
            long j9 = jArr[i8];
            if (j9 != 0) {
                if (j7 >= j9 && j7 % j9 == 0) {
                    jArr[i8] = AbstractC0832b.r(1000000L, AbstractC0832b.r(j7, j9, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j7 >= j9 || j9 % j7 != 0) {
                    j8 = j7;
                    jArr[i8] = M(j9, 1000000L, j8, roundingMode);
                } else {
                    jArr[i8] = AbstractC0832b.C(1000000L, AbstractC0832b.r(j9, j7, RoundingMode.UNNECESSARY));
                }
                j8 = j7;
            } else {
                j8 = j7;
            }
            i8++;
            j7 = j8;
        }
    }

    public static long L(long j7, long j8, long j9, RoundingMode roundingMode) {
        if (j7 == 0 || j8 == 0) {
            return 0L;
        }
        return (j9 < j8 || j9 % j8 != 0) ? (j9 >= j8 || j8 % j9 != 0) ? (j9 < j7 || j9 % j7 != 0) ? (j9 >= j7 || j7 % j9 != 0) ? M(j7, j8, j9, roundingMode) : AbstractC0832b.C(j8, AbstractC0832b.r(j7, j9, RoundingMode.UNNECESSARY)) : AbstractC0832b.r(j8, AbstractC0832b.r(j9, j7, RoundingMode.UNNECESSARY), roundingMode) : AbstractC0832b.C(j7, AbstractC0832b.r(j8, j9, RoundingMode.UNNECESSARY)) : AbstractC0832b.r(j7, AbstractC0832b.r(j9, j8, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long M(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.K.M(long, long, long, java.math.RoundingMode):long");
    }

    public static boolean N(L l7, boolean z7) {
        if (l7 != null) {
            H1.G g4 = (H1.G) l7;
            if (g4.Y0() && g4.Z0() != 1 && g4.Z0() != 4) {
                if (!z7) {
                    return false;
                }
                g4.u1();
                if (g4.f3264q0.f3438n == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String[] O(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static long P(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static int a(long[] jArr, long j7, boolean z7) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j7);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i7 = iBinarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j7) {
                break;
            }
            iBinarySearch = i7;
        }
        return z7 ? iBinarySearch : i7;
    }

    public static int b(r rVar, long j7) {
        int i7 = rVar.a - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            if (rVar.e(i9) < j7) {
                i8 = i9 + 1;
            } else {
                i7 = i9 - 1;
            }
        }
        int i10 = i7 + 1;
        if (i10 < rVar.a && rVar.e(i10) == j7) {
            return i10;
        }
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    public static int c(int[] iArr, int i7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int iBinarySearch = Arrays.binarySearch(iArr, i7);
        if (iBinarySearch < 0) {
            i9 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i8 = iBinarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                iBinarySearch = i8;
            }
            i9 = z7 ? iBinarySearch : i8;
        }
        return z8 ? Math.max(0, i9) : i9;
    }

    public static int d(long[] jArr, long j7, boolean z7) {
        int i7;
        int iBinarySearch = Arrays.binarySearch(jArr, j7);
        if (iBinarySearch < 0) {
            i7 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i8 = iBinarySearch - 1;
                if (i8 < 0 || jArr[i8] != j7) {
                    break;
                }
                iBinarySearch = i8;
            }
            i7 = iBinarySearch;
        }
        return z7 ? Math.max(0, i7) : i7;
    }

    public static int e(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static void f(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float g(float f5, float f7, float f8) {
        return Math.max(f7, Math.min(f5, f8));
    }

    public static int h(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static long i(long j7, long j8, long j9) {
        return Math.max(j8, Math.min(j7, j9));
    }

    public static boolean j(SparseArray sparseArray, int i7) {
        return sparseArray.indexOfKey(i7) >= 0;
    }

    public static int k(int i7, int i8, int i9, byte[] bArr) {
        while (i7 < i8) {
            i9 = f308i[((i9 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static Handler l(T1.h hVar) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0015b.i(looperMyLooper);
        return new Handler(looperMyLooper, hVar);
    }

    public static String m(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int n(int i7) {
        if (i7 == 20) {
            return 30;
        }
        if (i7 == 22) {
            return 31;
        }
        if (i7 == 30) {
            return 34;
        }
        switch (i7) {
            case 2:
            case 3:
                return 3;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i7) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static AudioFormat o(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    public static int p(int i7) {
        int i8 = a;
        if (i7 == 10) {
            return i8 >= 32 ? 737532 : 6396;
        }
        if (i7 == 12) {
            return 743676;
        }
        if (i7 == 24) {
            return i8 >= 32 ? 67108860 : 0;
        }
        switch (i7) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case GzipHeaderFlags.EXTRA /* 4 */:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int q(int i7) {
        if (i7 != 2) {
            if (i7 == 3) {
                return 1;
            }
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int r(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int s(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        int i7 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z7 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i7 = Integer.parseInt(str2);
            if (z7) {
                return -i7;
            }
        } catch (NumberFormatException unused) {
        }
        return i7;
    }

    public static long t(float f5, long j7) {
        return f5 == 1.0f ? j7 : Math.round(j7 * f5);
    }

    public static int u(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static String v(StringBuilder sb, Formatter formatter, long j7) {
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        String str = j7 < 0 ? "-" : "";
        long jAbs = (Math.abs(j7) + 500) / 1000;
        long j8 = jAbs % 60;
        long j9 = (jAbs / 60) % 60;
        long j10 = jAbs / 3600;
        sb.setLength(0);
        return j10 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j10), Long.valueOf(j9), Long.valueOf(j8)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j9), Long.valueOf(j8)).toString();
    }

    public static String w(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            AbstractC0015b.n("Util", "Failed to read system property ".concat(str), e7);
            return null;
        }
    }

    public static String x(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return ContentType.Audio.TYPE;
            case 2:
                return ContentType.Video.TYPE;
            case 3:
                return ContentType.Text.TYPE;
            case GzipHeaderFlags.EXTRA /* 4 */:
                return ContentType.Image.TYPE;
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i7 >= 10000 ? c0.a(i7, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y(y1.L r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = r6
            H1.G r1 = (H1.G) r1
            int r2 = r1.Z0()
            r3 = 1
            if (r2 != r3) goto L1d
            r4 = 2
            r5 = r6
            Q4.c r5 = (Q4.c) r5
            boolean r4 = r5.y0(r4)
            if (r4 == 0) goto L1d
            r1.h1()
        L1b:
            r0 = r3
            goto L39
        L1d:
            r1 = 4
            if (r2 != r1) goto L39
            r2 = r6
            Q4.c r2 = (Q4.c) r2
            boolean r1 = r2.y0(r1)
            if (r1 == 0) goto L39
            r1 = r2
            H1.G r1 = (H1.G) r1
            int r1 = r1.R0()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.C0(r1, r4, r0)
            goto L1b
        L39:
            Q4.c r6 = (Q4.c) r6
            boolean r1 = r6.y0(r3)
            if (r1 == 0) goto L4a
            H1.G r6 = (H1.G) r6
            r6.u1()
            r6.r1(r3, r3)
            return r3
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.K.y(y1.L):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int z(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.K.z(android.net.Uri, java.lang.String):int");
    }
}
