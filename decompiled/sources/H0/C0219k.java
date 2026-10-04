package H0;

/* renamed from: H0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219k extends l {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final G f3122b;

    public C0219k(String str, G g4) {
        this.a = str;
        this.f3122b = g4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0219k)) {
            return false;
        }
        C0219k c0219k = (C0219k) obj;
        if (!kotlin.jvm.internal.l.a(this.a, c0219k.a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f3122b, c0219k.f3122b)) {
            return false;
        }
        c0219k.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        G g4 = this.f3122b;
        return (iHashCode + (g4 != null ? g4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
