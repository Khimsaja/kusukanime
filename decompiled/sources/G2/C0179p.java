package G2;

/* renamed from: G2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179p extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f2728m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0179p(E e7, int i7) {
        super(1);
        this.f2727l = i7;
        this.f2728m = e7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f2727l) {
            case 0:
                kotlin.jvm.internal.l.f("destination", (y) obj);
                return Boolean.valueOf(!this.f2728m.f2644m.containsKey(Integer.valueOf(r2.f2762p)));
            default:
                kotlin.jvm.internal.l.f("destination", (y) obj);
                return Boolean.valueOf(!this.f2728m.f2644m.containsKey(Integer.valueOf(r2.f2762p)));
        }
    }
}
