package H0;

/* loaded from: classes.dex */
public final class K {
    public final String a;

    public K(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            return kotlin.jvm.internal.l.a(this.a, ((K) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
