package O3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f7538k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7539l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7540m;

    public r(Object obj, Object obj2, Object obj3) {
        this.f7538k = obj;
        this.f7539l = obj2;
        this.f7540m = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.l.a(this.f7538k, rVar.f7538k) && kotlin.jvm.internal.l.a(this.f7539l, rVar.f7539l) && kotlin.jvm.internal.l.a(this.f7540m, rVar.f7540m);
    }

    public final int hashCode() {
        Object obj = this.f7538k;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f7539l;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f7540m;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f7538k);
        sb.append(", ");
        sb.append(this.f7539l);
        sb.append(", ");
        return A6.b.i(sb, this.f7540m, ')');
    }
}
