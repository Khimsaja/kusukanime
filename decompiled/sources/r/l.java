package r;

import O.C0486d;
import O.C0493g0;
import O.T;

/* loaded from: classes.dex */
public final class l {
    public final C0493g0 a = C0486d.K(i.a, T.f7049p);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return kotlin.jvm.internal.l.a((k) ((l) obj).a.getValue(), (k) this.a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((k) this.a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((k) this.a.getValue()) + ')';
    }
}
