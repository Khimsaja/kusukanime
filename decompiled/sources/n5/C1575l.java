package n5;

/* renamed from: n5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1575l extends AbstractC1576m implements InterfaceC1573j, q5.e {

    /* renamed from: l, reason: collision with root package name */
    public final B f13402l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f13403m;

    public C1575l(B b4, boolean z7) {
        this.f13402l = b4;
        this.f13403m = z7;
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        return z7 ? this.f13402l.x0(z7) : this;
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return new C1575l(this.f13402l.z0(i7), this.f13403m);
    }

    @Override // n5.AbstractC1576m
    public final B C0() {
        return this.f13402l;
    }

    @Override // n5.AbstractC1576m
    public final AbstractC1576m E0(B b4) {
        return new C1575l(b4, this.f13403m);
    }

    @Override // n5.InterfaceC1573j
    public final boolean S() {
        B b4 = this.f13402l;
        b4.t0();
        return b4.t0().f() instanceof u4.Q;
    }

    @Override // n5.InterfaceC1573j
    public final a0 f(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("replacement", abstractC1586x);
        return AbstractC1566c.n(abstractC1586x.w0(), this.f13403m);
    }

    @Override // n5.B
    public final String toString() {
        return this.f13402l + " & Any";
    }

    @Override // n5.AbstractC1576m, n5.AbstractC1586x
    public final boolean u0() {
        return false;
    }
}
