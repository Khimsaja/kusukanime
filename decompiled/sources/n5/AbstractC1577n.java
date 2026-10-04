package n5;

/* renamed from: n5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1577n extends AbstractC1576m {

    /* renamed from: l, reason: collision with root package name */
    public final B f13404l;

    public AbstractC1577n(B b4) {
        this.f13404l = b4;
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        return z7 == u0() ? this : this.f13404l.x0(z7).z0(s0());
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return i7 != s0() ? new D(this, i7) : this;
    }

    @Override // n5.AbstractC1576m
    public final B C0() {
        return this.f13404l;
    }
}
