package p;

/* renamed from: p.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1754h0 implements InterfaceC1760l {
    public final InterfaceC1715B a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14017b;

    public C1754h0(InterfaceC1715B interfaceC1715B, long j7) {
        this.a = interfaceC1715B;
        this.f14017b = j7;
    }

    @Override // p.InterfaceC1760l
    public final D0 a(B0 b02) {
        return new C1756i0(this.a.a(b02), this.f14017b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1754h0)) {
            return false;
        }
        C1754h0 c1754h0 = (C1754h0) obj;
        return c1754h0.f14017b == this.f14017b && kotlin.jvm.internal.l.a(c1754h0.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14017b) + (this.a.hashCode() * 31);
    }
}
