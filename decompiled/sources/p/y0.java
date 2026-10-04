package p;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u0 f14164m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(u0 u0Var, int i7) {
        super(1);
        this.f14163l = i7;
        this.f14164m = u0Var;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f14163l) {
            case 0:
                return new x0(this.f14164m, 0);
            default:
                return new x0(this.f14164m, 1);
        }
    }
}
