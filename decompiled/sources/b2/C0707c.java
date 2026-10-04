package b2;

import B1.B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707c extends Q4.c {

    /* renamed from: l, reason: collision with root package name */
    public long f10924l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f10925m;

    /* renamed from: n, reason: collision with root package name */
    public long[] f10926n;

    public static Serializable L0(int i7, B b4) {
        if (i7 == 0) {
            return Double.valueOf(Double.longBitsToDouble(b4.n()));
        }
        if (i7 == 1) {
            return Boolean.valueOf(b4.t() == 1);
        }
        if (i7 == 2) {
            return N0(b4);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return M0(b4);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(b4.n()));
                b4.G(2);
                return date;
            }
            int iX = b4.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i8 = 0; i8 < iX; i8++) {
                Serializable serializableL0 = L0(b4.t(), b4);
                if (serializableL0 != null) {
                    arrayList.add(serializableL0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strN0 = N0(b4);
            int iT = b4.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableL02 = L0(iT, b4);
            if (serializableL02 != null) {
                map.put(strN0, serializableL02);
            }
        }
    }

    public static HashMap M0(B b4) {
        int iX = b4.x();
        HashMap map = new HashMap(iX);
        for (int i7 = 0; i7 < iX; i7++) {
            String strN0 = N0(b4);
            Serializable serializableL0 = L0(b4.t(), b4);
            if (serializableL0 != null) {
                map.put(strN0, serializableL0);
            }
        }
        return map;
    }

    public static String N0(B b4) {
        int iZ = b4.z();
        int i7 = b4.f288b;
        b4.G(iZ);
        return new String(b4.a, i7, iZ);
    }
}
