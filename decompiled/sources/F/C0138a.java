package F;

/* renamed from: F.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138a extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C0138a f2003m = new C0138a(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0138a f2004n = new C0138a(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0138a f2005o = new C0138a(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2006l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0138a(int i7, int i8) {
        super(i7);
        this.f2006l = i8;
    }

    @Override // e4.k
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f2006l) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                break;
            default:
                int i7 = ((N0.k) obj).a;
                break;
        }
        return O3.C.a;
    }
}
