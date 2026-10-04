package f6;

import D4.S;
import f4.InterfaceC0881a;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z5.AbstractC2517v;

/* renamed from: f6.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920r implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final String[] f11596k;

    public C0920r(String[] strArr) {
        this.f11596k = strArr;
    }

    public final String a(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        String[] strArr = this.f11596k;
        int length = strArr.length - 2;
        int iB = P3.r.B(length, 0, -2);
        if (iB > length) {
            return null;
        }
        while (!AbstractC2517v.M(str, strArr[length], true)) {
            if (length == iB) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0920r) {
            return Arrays.equals(this.f11596k, ((C0920r) obj).f11596k);
        }
        return false;
    }

    public final String h(int i7) {
        return this.f11596k[i7 * 2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11596k);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        O3.l[] lVarArr = new O3.l[size];
        for (int i7 = 0; i7 < size; i7++) {
            lVarArr[i7] = new O3.l(h(i7), m(i7));
        }
        return kotlin.jvm.internal.l.i(lVarArr);
    }

    public final S j() {
        S s7 = new S(5, false);
        P3.v.f0(s7.f1530k, this.f11596k);
        return s7;
    }

    public final String m(int i7) {
        return this.f11596k[(i7 * 2) + 1];
    }

    public final List o(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            if (str.equalsIgnoreCase(h(i7))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m(i7));
            }
        }
        if (arrayList == null) {
            return P3.y.f7779k;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.l.e("{\n      Collections.unmodifiableList(result)\n    }", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public final int size() {
        return this.f11596k.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String strH = h(i7);
            String strM = m(i7);
            sb.append(strH);
            sb.append(": ");
            if (g6.b.q(strH)) {
                strM = "██";
            }
            sb.append(strM);
            sb.append("\n");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
