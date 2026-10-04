package O;

import m.C1504y;

/* loaded from: classes.dex */
public final class Y {
    public final C1504y a;

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            return kotlin.jvm.internal.l.a(this.a, ((Y) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.a + ')';
    }
}
