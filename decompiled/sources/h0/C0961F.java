package h0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: h0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961F extends AbstractC0971P {

    /* renamed from: c, reason: collision with root package name */
    public final List f11777c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11778d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11779e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11780f;

    public C0961F(List list, ArrayList arrayList, long j7, long j8) {
        this.f11777c = list;
        this.f11778d = arrayList;
        this.f11779e = j7;
        this.f11780f = j8;
    }

    @Override // h0.AbstractC0971P
    public final Shader b(long j7) {
        int i7;
        int[] iArr;
        int i8;
        float[] fArr;
        long j8 = this.f11779e;
        float fD = g0.c.d(j8) == Float.POSITIVE_INFINITY ? g0.f.d(j7) : g0.c.d(j8);
        float fB = g0.c.e(j8) == Float.POSITIVE_INFINITY ? g0.f.b(j7) : g0.c.e(j8);
        long j9 = this.f11780f;
        float fD2 = g0.c.d(j9) == Float.POSITIVE_INFINITY ? g0.f.d(j7) : g0.c.d(j9);
        float fB2 = g0.c.e(j9) == Float.POSITIVE_INFINITY ? g0.f.b(j7) : g0.c.e(j9);
        long jE = AbstractC0832b.e(fD, fB);
        long jE2 = AbstractC0832b.e(fD2, fB2);
        List list = this.f11777c;
        ArrayList arrayList = this.f11778d;
        if (arrayList == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != arrayList.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i7 = 0;
        } else {
            int iY = P3.r.y(list);
            i7 = 0;
            for (int i9 = 1; i9 < iY; i9++) {
                if (C0998u.d(((C0998u) list.get(i9)).a) == 0.0f) {
                    i7++;
                }
            }
        }
        float fD3 = g0.c.d(jE);
        float fE = g0.c.e(jE);
        float fD4 = g0.c.d(jE2);
        float fE2 = g0.c.e(jE2);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = AbstractC0968M.w(((C0998u) list.get(i10)).a);
            }
        } else {
            iArr = new int[list.size() + i7];
            int iY2 = P3.r.y(list);
            int size2 = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size2; i12++) {
                long j10 = ((C0998u) list.get(i12)).a;
                if (C0998u.d(j10) != 0.0f) {
                    i8 = i11 + 1;
                    iArr[i11] = AbstractC0968M.w(j10);
                } else if (i12 == 0) {
                    i8 = i11 + 1;
                    iArr[i11] = AbstractC0968M.w(C0998u.b(0.0f, ((C0998u) list.get(1)).a));
                } else if (i12 == iY2) {
                    i8 = i11 + 1;
                    iArr[i11] = AbstractC0968M.w(C0998u.b(0.0f, ((C0998u) list.get(i12 - 1)).a));
                } else {
                    int i13 = i11 + 1;
                    iArr[i11] = AbstractC0968M.w(C0998u.b(0.0f, ((C0998u) list.get(i12 - 1)).a));
                    i11 += 2;
                    iArr[i13] = AbstractC0968M.w(C0998u.b(0.0f, ((C0998u) list.get(i12 + 1)).a));
                }
                i11 = i8;
            }
        }
        int[] iArr2 = iArr;
        if (i7 != 0) {
            fArr = new float[list.size() + i7];
            fArr[0] = arrayList != null ? ((Number) arrayList.get(0)).floatValue() : 0.0f;
            int iY3 = P3.r.y(list);
            int i14 = 1;
            for (int i15 = 1; i15 < iY3; i15++) {
                long j11 = ((C0998u) list.get(i15)).a;
                float fFloatValue = arrayList != null ? ((Number) arrayList.get(i15)).floatValue() : i15 / P3.r.y(list);
                int i16 = i14 + 1;
                fArr[i14] = fFloatValue;
                if (C0998u.d(j11) == 0.0f) {
                    i14 += 2;
                    fArr[i16] = fFloatValue;
                } else {
                    i14 = i16;
                }
            }
            fArr[i14] = arrayList != null ? ((Number) arrayList.get(P3.r.y(list))).floatValue() : 1.0f;
        } else if (arrayList != null) {
            kotlin.jvm.internal.l.f("<this>", arrayList);
            fArr = new float[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                fArr[i17] = ((Number) it.next()).floatValue();
                i17++;
            }
        } else {
            fArr = null;
        }
        return new LinearGradient(fD3, fE, fD4, fE2, iArr2, fArr, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0961F)) {
            return false;
        }
        C0961F c0961f = (C0961F) obj;
        return this.f11777c.equals(c0961f.f11777c) && kotlin.jvm.internal.l.a(this.f11778d, c0961f.f11778d) && g0.c.b(this.f11779e, c0961f.f11779e) && g0.c.b(this.f11780f, c0961f.f11780f);
    }

    public final int hashCode() {
        int iHashCode = this.f11777c.hashCode() * 31;
        ArrayList arrayList = this.f11778d;
        return Integer.hashCode(0) + AbstractC0703b.c(AbstractC0703b.c((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.f11779e), 31, this.f11780f);
    }

    public final String toString() {
        String str;
        long j7 = this.f11779e;
        String str2 = "";
        if (AbstractC0832b.w(j7)) {
            str = "start=" + ((Object) g0.c.j(j7)) + ", ";
        } else {
            str = "";
        }
        long j8 = this.f11780f;
        if (AbstractC0832b.w(j8)) {
            str2 = "end=" + ((Object) g0.c.j(j8)) + ", ";
        }
        return "LinearGradient(colors=" + this.f11777c + ", stops=" + this.f11778d + ", " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
