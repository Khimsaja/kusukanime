package s5;

import kotlin.jvm.internal.l;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2017a {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15837b;

    public C2017a(Object obj, Object obj2) {
        this.a = obj;
        this.f15837b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2017a)) {
            return false;
        }
        C2017a c2017a = (C2017a) obj;
        return l.a(this.a, c2017a.a) && l.a(this.f15837b, c2017a.f15837b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f15837b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproximationBounds(lower=");
        sb.append(this.a);
        sb.append(", upper=");
        return A6.b.i(sb, this.f15837b, ')');
    }
}
