package p;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC1773y {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13836b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1774z f13837c;

    public A0(int i7, InterfaceC1774z interfaceC1774z, int i8) {
        this((i8 & 1) != 0 ? 300 : i7, 0, (i8 & 4) != 0 ? AbstractC1714A.a : interfaceC1774z);
    }

    @Override // p.InterfaceC1760l
    public final D0 a(B0 b02) {
        return new m6.x(this.a, this.f13836b, this.f13837c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (a02.a == this.a && a02.f13836b == this.f13836b && kotlin.jvm.internal.l.a(a02.f13837c, this.f13837c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13837c.hashCode() + (this.a * 31)) * 31) + this.f13836b;
    }

    @Override // p.InterfaceC1773y, p.InterfaceC1760l
    public final E0 a(B0 b02) {
        return new m6.x(this.a, this.f13836b, this.f13837c);
    }

    public A0(int i7, int i8, InterfaceC1774z interfaceC1774z) {
        this.a = i7;
        this.f13836b = i8;
        this.f13837c = interfaceC1774z;
    }
}
