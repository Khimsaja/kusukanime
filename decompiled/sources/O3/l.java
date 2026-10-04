package O3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f7528k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7529l;

    public l(Object obj, Object obj2) {
        this.f7528k = obj;
        this.f7529l = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.a(this.f7528k, lVar.f7528k) && kotlin.jvm.internal.l.a(this.f7529l, lVar.f7529l);
    }

    public final int hashCode() {
        Object obj = this.f7528k;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f7529l;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f7528k);
        sb.append(", ");
        return A6.b.i(sb, this.f7529l, ')');
    }
}
