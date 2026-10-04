package K;

/* loaded from: classes.dex */
public final class i extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public p f4385k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f4387m;

    /* renamed from: n, reason: collision with root package name */
    public int f4388n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, U3.c cVar) {
        super(cVar);
        this.f4387m = pVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4386l = obj;
        this.f4388n |= Integer.MIN_VALUE;
        return this.f4387m.a(this);
    }
}
