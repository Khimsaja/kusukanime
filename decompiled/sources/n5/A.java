package n5;

/* loaded from: classes.dex */
public final class A extends AbstractC1577n {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f13349m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(B b4, int i7) {
        super(b4);
        this.f13349m = i7;
    }

    @Override // n5.AbstractC1576m
    public final AbstractC1576m E0(B b4) {
        switch (this.f13349m) {
            case 0:
                return new A(b4, 0);
            default:
                return new A(b4, 1);
        }
    }

    @Override // n5.AbstractC1576m, n5.AbstractC1586x
    public final boolean u0() {
        switch (this.f13349m) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
