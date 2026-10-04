package p;

/* renamed from: p.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1719F implements InterfaceC1760l {
    public final InterfaceC1773y a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13852b;

    public C1719F(InterfaceC1773y interfaceC1773y, long j7) {
        this.a = interfaceC1773y;
        this.f13852b = j7;
    }

    @Override // p.InterfaceC1760l
    public final D0 a(B0 b02) {
        E0 e0A = this.a.a(b02);
        long j7 = this.f13852b;
        J1.x xVar = new J1.x();
        xVar.f4287m = e0A;
        xVar.f4285k = (e0A.o() + e0A.m()) * 1000000;
        xVar.f4286l = j7 * 1000000;
        return xVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1719F)) {
            return false;
        }
        C1719F c1719f = (C1719F) obj;
        if (c1719f.a.equals(this.a)) {
            return c1719f.f13852b == this.f13852b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13852b) + ((AbstractC1755i.b(1) + (this.a.hashCode() * 31)) * 31);
    }
}
