package A;

/* loaded from: classes.dex */
public final class b extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public g0.d f3k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f4l;

    /* renamed from: m, reason: collision with root package name */
    public int f5m;

    /* renamed from: n, reason: collision with root package name */
    public int f6n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f7o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c f8p;

    /* renamed from: q, reason: collision with root package name */
    public int f9q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, U3.c cVar2) {
        super(cVar2);
        this.f8p = cVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f7o = obj;
        this.f9q |= Integer.MIN_VALUE;
        return this.f8p.a(null, this);
    }
}
