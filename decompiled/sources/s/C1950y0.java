package s;

/* renamed from: s.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1950y0 implements InterfaceC1911e0 {
    public final /* synthetic */ D0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0 f15409b;

    public C1950y0(D0 d02, A0 a02) {
        this.a = d02;
        this.f15409b = a02;
    }

    @Override // s.InterfaceC1911e0
    public final float a(float f5) {
        D0 d02 = this.a;
        long jD = d02.d(d02.g(f5));
        D0 d03 = this.f15409b.a;
        d03.f15103g = 2;
        q.e0 e0Var = d03.f15098b;
        return d02.c(d02.f((e0Var == null || !(d03.a.c() || d03.a.a())) ? D0.a(d03, d03.f15104h, jD, 2) : e0Var.f(jD, d03.f15103g, d03.f15106j)));
    }
}
