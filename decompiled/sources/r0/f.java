package r0;

/* loaded from: classes.dex */
public final class f extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public h f14793k;

    /* renamed from: l, reason: collision with root package name */
    public long f14794l;

    /* renamed from: m, reason: collision with root package name */
    public long f14795m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f14796n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f14797o;

    /* renamed from: p, reason: collision with root package name */
    public int f14798p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, U3.c cVar) {
        super(cVar);
        this.f14797o = hVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f14796n = obj;
        this.f14798p |= Integer.MIN_VALUE;
        return this.f14797o.Y(0L, 0L, this);
    }
}
