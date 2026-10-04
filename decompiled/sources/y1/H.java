package y1;

import B1.AbstractC0015b;
import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class H {
    public final C2391m a;

    static {
        new SparseBooleanArray();
        AbstractC0015b.h(!false);
        B1.K.B(0);
    }

    public H(C2391m c2391m) {
        this.a = c2391m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return this.a.equals(((H) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
