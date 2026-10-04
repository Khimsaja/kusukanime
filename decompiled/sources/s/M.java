package s;

/* loaded from: classes.dex */
public final class M extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public P f15168k;

    /* renamed from: l, reason: collision with root package name */
    public C1943v f15169l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f15170m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P f15171n;

    /* renamed from: o, reason: collision with root package name */
    public int f15172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p7, U3.c cVar) {
        super(cVar);
        this.f15171n = p7;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15170m = obj;
        this.f15172o |= Integer.MIN_VALUE;
        return P.L0(this.f15171n, null, this);
    }
}
