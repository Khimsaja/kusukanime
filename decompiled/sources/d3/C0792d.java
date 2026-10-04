package d3;

/* renamed from: d3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792d {
    public final e3.i a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.g f11256b;

    /* renamed from: c, reason: collision with root package name */
    public final e3.e f11257c;

    public C0792d(e3.i iVar, e3.g gVar, e3.e eVar) {
        this.a = iVar;
        this.f11256b = gVar;
        this.f11257c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0792d)) {
            return false;
        }
        C0792d c0792d = (C0792d) obj;
        c0792d.getClass();
        return kotlin.jvm.internal.l.a(this.a, c0792d.a) && this.f11256b == c0792d.f11256b && this.f11257c == c0792d.f11257c;
    }

    public final int hashCode() {
        e3.i iVar = this.a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        e3.g gVar = this.f11256b;
        int iHashCode2 = (iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 887503681;
        e3.e eVar = this.f11257c;
        return (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 887503681;
    }
}
