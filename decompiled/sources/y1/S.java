package y1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class S {
    public final Q a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.G f17973b;

    static {
        B1.K.B(0);
        B1.K.B(1);
    }

    public S(Q q6, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= q6.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = q6;
        this.f17973b = j3.G.s(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            S s7 = (S) obj;
            if (this.a.equals(s7.a) && this.f17973b.equals(s7.f17973b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17973b.hashCode() * 31) + this.a.hashCode();
    }
}
