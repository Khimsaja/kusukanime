package L;

/* loaded from: classes.dex */
public final class O0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P0 f5285m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0(P0 p02, int i7) {
        super(1);
        this.f5284l = i7;
        this.f5285m = p02;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f5284l) {
            case 0:
                P0 p02 = this.f5285m;
                p02.f5294o.getClass();
                p02.f5293n.invoke();
                return O3.C.a;
            default:
                P0 p03 = this.f5285m;
                p03.show();
                return new D.r(1, p03);
        }
    }
}
