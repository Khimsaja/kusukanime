package i3;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements e, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final List f12007k;

    public f(List list) {
        this.f12007k = list;
    }

    @Override // i3.e
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f12007k;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((e) list.get(i7)).apply(obj)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f12007k.equals(((f) obj).f12007k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12007k.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z7 = true;
        for (Object obj : this.f12007k) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
