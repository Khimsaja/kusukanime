package s;

/* loaded from: classes.dex */
public final class K extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public P f15151k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15152l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f15153m;

    /* renamed from: n, reason: collision with root package name */
    public int f15154n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(P p7, U3.c cVar) {
        super(cVar);
        this.f15153m = p7;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15152l = obj;
        this.f15154n |= Integer.MIN_VALUE;
        return P.J0(this.f15153m, this);
    }
}
