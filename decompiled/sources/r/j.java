package r;

import e5.AbstractC0832b;

/* loaded from: classes.dex */
public final class j extends k {
    public final long a;

    public j(long j7) {
        this.a = j7;
        if (!AbstractC0832b.x(j7)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return g0.c.b(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) g0.c.j(this.a)) + ')';
    }
}
