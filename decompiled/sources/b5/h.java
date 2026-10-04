package b5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r4.EnumC1882k;
import x4.C2255A;

/* loaded from: classes.dex */
public final class h {
    public static final h a = new h();

    public final b a(List list, C2255A c2255a, EnumC1882k enumC1882k) {
        List listS0 = P3.q.S0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            g gVarB = b(it.next(), null);
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        return c2255a != null ? new x(arrayList, c2255a.f17339n.q(enumC1882k)) : new b(new A4.j(14, enumC1882k), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [P3.y] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [P3.y] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v38, types: [P3.y] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v45, types: [P3.y] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [P3.y] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [b5.h] */
    public final g b(Object obj, C2255A c2255a) {
        ?? H6;
        ?? H7;
        ?? H8;
        ?? H9;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new e(ch);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new c(bool);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            kotlin.jvm.internal.l.f("value", str);
            return new w(str);
        }
        boolean z7 = obj instanceof byte[];
        ?? H10 = P3.y.f7779k;
        int i7 = 0;
        if (z7) {
            byte[] bArr = (byte[]) obj;
            kotlin.jvm.internal.l.f("<this>", bArr);
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    H10 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i7 < length2) {
                        H10.add(Byte.valueOf(bArr[i7]));
                        i7++;
                    }
                } else {
                    H10 = P3.r.H(Byte.valueOf(bArr[0]));
                }
            }
            return a(H10, c2255a, EnumC1882k.f14946r);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            kotlin.jvm.internal.l.f("<this>", sArr);
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    H10 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i7 < length4) {
                        H10.add(Short.valueOf(sArr[i7]));
                        i7++;
                    }
                } else {
                    H10 = P3.r.H(Short.valueOf(sArr[0]));
                }
            }
            return a(H10, c2255a, EnumC1882k.f14947s);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            kotlin.jvm.internal.l.f("<this>", iArr);
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    H9 = new ArrayList(iArr.length);
                    for (int i8 : iArr) {
                        H9.add(Integer.valueOf(i8));
                    }
                } else {
                    H9 = P3.r.H(Integer.valueOf(iArr[0]));
                }
            } else {
                H9 = P3.y.f7779k;
            }
            return a(H9, c2255a, EnumC1882k.f14948t);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            kotlin.jvm.internal.l.f("<this>", jArr);
            int length6 = jArr.length;
            if (length6 != 0) {
                if (length6 != 1) {
                    H8 = new ArrayList(jArr.length);
                    for (long j7 : jArr) {
                        H8.add(Long.valueOf(j7));
                    }
                } else {
                    H8 = P3.r.H(Long.valueOf(jArr[0]));
                }
            } else {
                H8 = P3.y.f7779k;
            }
            return a(H8, c2255a, EnumC1882k.f14950v);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            kotlin.jvm.internal.l.f("<this>", cArr);
            int length7 = cArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    H10 = new ArrayList(cArr.length);
                    int length8 = cArr.length;
                    while (i7 < length8) {
                        H10.add(Character.valueOf(cArr[i7]));
                        i7++;
                    }
                } else {
                    H10 = P3.r.H(Character.valueOf(cArr[0]));
                }
            }
            return a(H10, c2255a, EnumC1882k.f14945q);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            kotlin.jvm.internal.l.f("<this>", fArr);
            int length9 = fArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    H7 = new ArrayList(fArr.length);
                    for (float f5 : fArr) {
                        H7.add(Float.valueOf(f5));
                    }
                } else {
                    H7 = P3.r.H(Float.valueOf(fArr[0]));
                }
            } else {
                H7 = P3.y.f7779k;
            }
            return a(H7, c2255a, EnumC1882k.f14949u);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            kotlin.jvm.internal.l.f("<this>", dArr);
            int length10 = dArr.length;
            if (length10 != 0) {
                if (length10 != 1) {
                    H10 = new ArrayList(dArr.length);
                    int length11 = dArr.length;
                    while (i7 < length11) {
                        H10.add(Double.valueOf(dArr[i7]));
                        i7++;
                    }
                } else {
                    H10 = P3.r.H(Double.valueOf(dArr[0]));
                }
            }
            return a(H10, c2255a, EnumC1882k.f14951w);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new u(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.l.f("<this>", zArr);
        int length12 = zArr.length;
        if (length12 != 0) {
            if (length12 != 1) {
                H6 = new ArrayList(zArr.length);
                for (boolean z8 : zArr) {
                    H6.add(Boolean.valueOf(z8));
                }
            } else {
                H6 = P3.r.H(Boolean.valueOf(zArr[0]));
            }
        } else {
            H6 = P3.y.f7779k;
        }
        return a(H6, c2255a, EnumC1882k.f14944p);
    }
}
