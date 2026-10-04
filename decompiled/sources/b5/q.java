package b5;

/* loaded from: classes.dex */
public final class q extends r {
    public final f a;

    public q(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.l.a(this.a, ((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.a + ')';
    }
}
