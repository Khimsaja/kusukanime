package H0;

/* loaded from: classes.dex */
public final class J {
    public final String a;

    public J(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return kotlin.jvm.internal.l.a(this.a, ((J) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
