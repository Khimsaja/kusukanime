package Y2;

/* loaded from: classes.dex */
public final class f extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public h f10106k;

    /* renamed from: l, reason: collision with root package name */
    public j f10107l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10108m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f10109n;

    /* renamed from: o, reason: collision with root package name */
    public int f10110o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, U3.c cVar) {
        super(cVar);
        this.f10109n = hVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f10108m = obj;
        this.f10110o |= Integer.MIN_VALUE;
        return this.f10109n.d(null, this);
    }
}
