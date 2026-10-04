package X2;

/* loaded from: classes.dex */
public final class k extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public l f9814k;

    /* renamed from: l, reason: collision with root package name */
    public V2.i f9815l;

    /* renamed from: m, reason: collision with root package name */
    public Object f9816m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f9817n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f9818o;

    /* renamed from: p, reason: collision with root package name */
    public int f9819p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, U3.c cVar) {
        super(cVar);
        this.f9818o = lVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f9817n = obj;
        this.f9819p |= Integer.MIN_VALUE;
        return this.f9818o.a(this);
    }
}
