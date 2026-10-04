package b5;

import n5.AbstractC1586x;

/* loaded from: classes.dex */
public final class p extends r {
    public final AbstractC1586x a;

    public p(AbstractC1586x abstractC1586x) {
        this.a = abstractC1586x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.l.a(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.a + ')';
    }
}
