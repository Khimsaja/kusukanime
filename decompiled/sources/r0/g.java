package r0;

/* loaded from: classes.dex */
public final class g extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public h f14799k;

    /* renamed from: l, reason: collision with root package name */
    public long f14800l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f14802n;

    /* renamed from: o, reason: collision with root package name */
    public int f14803o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, U3.c cVar) {
        super(cVar);
        this.f14802n = hVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f14801m = obj;
        this.f14803o |= Integer.MIN_VALUE;
        return this.f14802n.m(0L, this);
    }
}
