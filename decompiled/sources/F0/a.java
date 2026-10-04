package F0;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.e f2062b;

    public a(String str, O3.e eVar) {
        this.a = str;
        this.f2062b = eVar;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.a, aVar.a) && kotlin.jvm.internal.l.a(this.f2062b, aVar.f2062b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        O3.e eVar = this.f2062b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.f2062b + ')';
    }
}
