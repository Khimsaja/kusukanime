package G2;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class J extends M {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2676e;

    public static float[] g(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] h(String str) {
        return new int[]{((Number) M.a.c(str)).intValue()};
    }

    public static long[] i(String str) {
        return new long[]{((Number) M.f2678b.c(str)).longValue()};
    }

    public static boolean[] j(String str) {
        return new boolean[]{((Boolean) M.f2679c.c(str)).booleanValue()};
    }

    @Override // G2.M
    public final Object a(String str, Bundle bundle) {
        switch (this.f2676e) {
            case 0:
                return (boolean[]) A6.b.c(bundle, "bundle", str, "key", str);
            case 1:
                return (float[]) A6.b.c(bundle, "bundle", str, "key", str);
            case 2:
                return (int[]) A6.b.c(bundle, "bundle", str, "key", str);
            case 3:
                return (long[]) A6.b.c(bundle, "bundle", str, "key", str);
            default:
                return (String[]) A6.b.c(bundle, "bundle", str, "key", str);
        }
    }

    @Override // G2.M
    public final String b() {
        switch (this.f2676e) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // G2.M
    public final Object c(String str) {
        switch (this.f2676e) {
            case 0:
                return j(str);
            case 1:
                return g(str);
            case 2:
                return h(str);
            case 3:
                return i(str);
            default:
                return new String[]{str};
        }
    }

    @Override // G2.M
    public final Object d(String str, Object obj) {
        switch (this.f2676e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return j(str);
                }
                boolean[] zArrJ = j(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrJ, 0, zArrCopyOf, length, 1);
                kotlin.jvm.internal.l.c(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return g(str);
                }
                float[] fArrG = g(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrG, 0, fArrCopyOf, length2, 1);
                kotlin.jvm.internal.l.c(fArrCopyOf);
                return fArrCopyOf;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return h(str);
                }
                int[] iArrH = h(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrH, 0, iArrCopyOf, length3, 1);
                kotlin.jvm.internal.l.c(iArrCopyOf);
                return iArrCopyOf;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return i(str);
                }
                long[] jArrI = i(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrI, 0, jArrCopyOf, length4, 1);
                kotlin.jvm.internal.l.c(jArrCopyOf);
                return jArrCopyOf;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                kotlin.jvm.internal.l.c(objArrCopyOf);
                return (String[]) objArrCopyOf;
        }
    }

    @Override // G2.M
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f2676e) {
            case 0:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 2:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 3:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putLongArray(str, (long[]) obj);
                break;
            default:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putStringArray(str, (String[]) obj);
                break;
        }
    }

    @Override // G2.M
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.f2676e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        boolArr[i7] = Boolean.valueOf(zArr[i7]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i8 = 0; i8 < length2; i8++) {
                        boolArr2[i8] = Boolean.valueOf(zArr2[i8]);
                    }
                }
                return P3.m.T(boolArr, boolArr2);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i9 = 0; i9 < length3; i9++) {
                        fArr[i9] = Float.valueOf(fArr2[i9]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i10 = 0; i10 < length4; i10++) {
                        fArr4[i10] = Float.valueOf(fArr3[i10]);
                    }
                }
                return P3.m.T(fArr, fArr4);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i11 = 0; i11 < length5; i11++) {
                        numArr[i11] = Integer.valueOf(iArr[i11]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i12 = 0; i12 < length6; i12++) {
                        numArr2[i12] = Integer.valueOf(iArr2[i12]);
                    }
                }
                return P3.m.T(numArr, numArr2);
            case 3:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i13 = 0; i13 < length7; i13++) {
                        lArr[i13] = Long.valueOf(jArr[i13]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i14 = 0; i14 < length8; i14++) {
                        lArr2[i14] = Long.valueOf(jArr2[i14]);
                    }
                }
                return P3.m.T(lArr, lArr2);
            default:
                return P3.m.T((String[]) obj, (String[]) obj2);
        }
    }
}
