package s;

/* renamed from: s.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925l0 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public long f15338k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15339l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1927m0 f15340m;

    /* renamed from: n, reason: collision with root package name */
    public int f15341n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1925l0(C1927m0 c1927m0, U3.c cVar) {
        super(cVar);
        this.f15340m = c1927m0;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15339l = obj;
        this.f15341n |= Integer.MIN_VALUE;
        return this.f15340m.Y(0L, 0L, this);
    }
}
