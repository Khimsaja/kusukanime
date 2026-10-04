package x;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2232f extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final C2232f f17204m = new C2232f(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2232f f17205n = new C2232f(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17206l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2232f(int i7, int i8) {
        super(i7);
        this.f17206l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17206l) {
            case 0:
                ((Number) obj2).intValue();
                return new C2228b(1);
            default:
                v vVar = (v) obj2;
                return P3.r.I(Integer.valueOf(vVar.f17279b.f16771b.f()), Integer.valueOf(vVar.f17279b.f16772c.f()));
        }
    }
}
