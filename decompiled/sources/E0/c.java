package E0;

/* loaded from: classes.dex */
public final class c extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public f f1799k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1800l;

    /* renamed from: m, reason: collision with root package name */
    public T0.i f1801m;

    /* renamed from: n, reason: collision with root package name */
    public int f1802n;

    /* renamed from: o, reason: collision with root package name */
    public int f1803o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1804p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f1805q;

    /* renamed from: r, reason: collision with root package name */
    public int f1806r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, U3.c cVar) {
        super(cVar);
        this.f1805q = fVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f1804p = obj;
        this.f1806r |= Integer.MIN_VALUE;
        return f.a(this.f1805q, null, null, this);
    }
}
