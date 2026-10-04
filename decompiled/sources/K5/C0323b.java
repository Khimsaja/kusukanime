package K5;

/* renamed from: K5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323b extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public J5.t f4799k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0324c f4801m;

    /* renamed from: n, reason: collision with root package name */
    public int f4802n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323b(C0324c c0324c, U3.c cVar) {
        super(cVar);
        this.f4801m = c0324c;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4800l = obj;
        this.f4802n |= Integer.MIN_VALUE;
        return this.f4801m.d(null, this);
    }
}
