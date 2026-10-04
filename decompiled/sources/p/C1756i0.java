package p;

/* renamed from: p.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756i0 implements D0 {

    /* renamed from: k, reason: collision with root package name */
    public final D0 f14018k;

    /* renamed from: l, reason: collision with root package name */
    public final long f14019l;

    public C1756i0(D0 d02, long j7) {
        this.f14018k = d02;
        this.f14019l = j7;
    }

    @Override // p.D0
    public final boolean a() {
        return this.f14018k.a();
    }

    @Override // p.D0
    public final long b(AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return this.f14018k.b(abstractC1766r, abstractC1766r2, abstractC1766r3) + this.f14019l;
    }

    @Override // p.D0
    public final AbstractC1766r e(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        long j8 = this.f14019l;
        return j7 < j8 ? abstractC1766r3 : this.f14018k.e(j7 - j8, abstractC1766r, abstractC1766r2, abstractC1766r3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1756i0)) {
            return false;
        }
        C1756i0 c1756i0 = (C1756i0) obj;
        return c1756i0.f14019l == this.f14019l && kotlin.jvm.internal.l.a(c1756i0.f14018k, this.f14018k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14019l) + (this.f14018k.hashCode() * 31);
    }

    @Override // p.D0
    public final AbstractC1766r i(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        long j8 = this.f14019l;
        return j7 < j8 ? abstractC1766r : this.f14018k.i(j7 - j8, abstractC1766r, abstractC1766r2, abstractC1766r3);
    }
}
