package p;

/* renamed from: p.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725L {
    public final Float a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1774z f13890b;

    public C1725L(Float f5, InterfaceC1774z interfaceC1774z) {
        this.a = f5;
        this.f13890b = interfaceC1774z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1725L)) {
            return false;
        }
        C1725L c1725l = (C1725L) obj;
        return c1725l.a.equals(this.a) && kotlin.jvm.internal.l.a(c1725l.f13890b, this.f13890b);
    }

    public final int hashCode() {
        return this.f13890b.hashCode() + AbstractC1755i.a(0, this.a.hashCode() * 31, 31);
    }
}
