package H0;

/* renamed from: H0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218j extends l {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final G f3121b;

    public C0218j(String str, G g4) {
        this.a = str;
        this.f3121b = g4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0218j)) {
            return false;
        }
        C0218j c0218j = (C0218j) obj;
        if (!kotlin.jvm.internal.l.a(this.a, c0218j.a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f3121b, c0218j.f3121b)) {
            return false;
        }
        c0218j.getClass();
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        G g4 = this.f3121b;
        return (iHashCode + (g4 != null ? g4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
