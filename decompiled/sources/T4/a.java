package T4;

import P3.C0563d;
import P3.m;
import P3.n;
import P3.q;
import P3.y;
import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9062b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9063c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9064d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9065e;

    public a(int... iArr) {
        List listS0;
        l.f("numbers", iArr);
        this.a = iArr;
        Integer numK0 = m.k0(iArr, 0);
        this.f9062b = numK0 != null ? numK0.intValue() : -1;
        Integer numK02 = m.k0(iArr, 1);
        this.f9063c = numK02 != null ? numK02.intValue() : -1;
        Integer numK03 = m.k0(iArr, 2);
        this.f9064d = numK03 != null ? numK03.intValue() : -1;
        if (iArr.length <= 3) {
            listS0 = y.f7779k;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(AbstractC0703b.l(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listS0 = q.S0(new C0563d(new n(iArr), 3, iArr.length));
        }
        this.f9065e = listS0;
    }

    public final boolean a(int i7, int i8, int i9) {
        int i10 = this.f9062b;
        if (i10 > i7) {
            return true;
        }
        if (i10 < i7) {
            return false;
        }
        int i11 = this.f9063c;
        if (i11 > i8) {
            return true;
        }
        return i11 >= i8 && this.f9064d >= i9;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9062b == aVar.f9062b && this.f9063c == aVar.f9063c && this.f9064d == aVar.f9064d && l.a(this.f9065e, aVar.f9065e);
    }

    public final int hashCode() {
        int i7 = this.f9062b;
        int i8 = (i7 * 31) + this.f9063c + i7;
        int i9 = (i8 * 31) + this.f9064d + i8;
        return this.f9065e.hashCode() + (i9 * 31) + i9;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.a) {
            if (i7 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList.isEmpty() ? "unknown" : q.y0(arrayList, ".", null, null, null, 62);
    }
}
