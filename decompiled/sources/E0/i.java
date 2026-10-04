package E0;

/* loaded from: classes.dex */
public final class i extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public j f1820k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1821l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f1822m;

    /* renamed from: n, reason: collision with root package name */
    public int f1823n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, U3.c cVar) {
        super(cVar);
        this.f1822m = jVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f1821l = obj;
        this.f1823n |= Integer.MIN_VALUE;
        return this.f1822m.b(0.0f, this);
    }
}
