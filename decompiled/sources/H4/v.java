package H4;

import java.util.Map;

/* loaded from: classes.dex */
public final class v {
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final B f3751b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3752c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3753d;

    public v(B b4, B b7) {
        P3.z zVar = P3.z.f7780k;
        this.a = b4;
        this.f3751b = b7;
        this.f3752c = zVar;
        z1.c.C(new u(0, this));
        B b8 = B.f3682l;
        this.f3753d = b4 == b8 && b7 == b8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.f3751b == vVar.f3751b && kotlin.jvm.internal.l.a(this.f3752c, vVar.f3752c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        B b4 = this.f3751b;
        return this.f3752c.hashCode() + ((iHashCode + (b4 == null ? 0 : b4.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.f3751b + ", userDefinedLevelForSpecificAnnotation=" + this.f3752c + ')';
    }
}
