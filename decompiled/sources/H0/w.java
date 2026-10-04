package H0;

/* loaded from: classes.dex */
public final class w {
    public final v a;

    /* renamed from: b, reason: collision with root package name */
    public final u f3155b;

    public w(v vVar, u uVar) {
        this.a = vVar;
        this.f3155b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.l.a(this.f3155b, wVar.f3155b) && kotlin.jvm.internal.l.a(this.a, wVar.a);
    }

    public final int hashCode() {
        v vVar = this.a;
        int iHashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        u uVar = this.f3155b;
        return iHashCode + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.f3155b + ')';
    }
}
