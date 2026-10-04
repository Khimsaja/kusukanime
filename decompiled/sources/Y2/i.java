package Y2;

/* loaded from: classes.dex */
public final class i extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public j f10122k;

    /* renamed from: l, reason: collision with root package name */
    public h f10123l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10124m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f10125n;

    /* renamed from: o, reason: collision with root package name */
    public int f10126o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, U3.c cVar) {
        super(cVar);
        this.f10125n = jVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f10124m = obj;
        this.f10126o |= Integer.MIN_VALUE;
        return this.f10125n.b(null, this);
    }
}
