package z0;

/* renamed from: z0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2458n extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C2458n f18809m = new C2458n(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2458n f18810n = new C2458n(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2458n f18811o = new C2458n(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2458n f18812p = new C2458n(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18813l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2458n(int i7, int i8) {
        super(i7);
        this.f18813l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f18813l) {
            case 0:
                return O3.C.a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(O.n(obj));
        }
    }
}
