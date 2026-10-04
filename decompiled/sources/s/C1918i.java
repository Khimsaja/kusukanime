package s;

import H5.C0270k;
import H5.C0284z;
import b1.AbstractC0703b;
import f6.AbstractC0915m;

/* renamed from: s.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1918i {
    public final A.f a;

    /* renamed from: b, reason: collision with root package name */
    public final C0270k f15307b;

    public C1918i(A.f fVar, C0270k c0270k) {
        this.a = fVar;
        this.f15307b = c0270k;
    }

    public final String toString() {
        String strJ;
        C0270k c0270k = this.f15307b;
        C0284z c0284z = (C0284z) c0270k.f3856o.get(C0284z.f3892l);
        String str = c0284z != null ? c0284z.f3893k : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC0915m.k(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.l.e("toString(this, checkRadix(radix))", string);
        sb.append(string);
        if (str == null || (strJ = AbstractC0703b.j("[", str, "](")) == null) {
            strJ = "(";
        }
        sb.append(strJ);
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(c0270k);
        sb.append(')');
        return sb.toString();
    }
}
