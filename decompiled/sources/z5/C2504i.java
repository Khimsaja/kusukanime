package z5;

/* renamed from: z5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2504i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final k4.g f19056b;

    public C2504i(String str, k4.g gVar) {
        this.a = str;
        this.f19056b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2504i)) {
            return false;
        }
        C2504i c2504i = (C2504i) obj;
        return kotlin.jvm.internal.l.a(this.a, c2504i.a) && kotlin.jvm.internal.l.a(this.f19056b, c2504i.f19056b);
    }

    public final int hashCode() {
        return this.f19056b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.f19056b + ')';
    }
}
