package q;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1828j extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C1831m f14563k;

    /* renamed from: l, reason: collision with root package name */
    public long f14564l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f14565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1831m f14566n;

    /* renamed from: o, reason: collision with root package name */
    public int f14567o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1828j(C1831m c1831m, U3.c cVar) {
        super(cVar);
        this.f14566n = c1831m;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f14565m = obj;
        this.f14567o |= Integer.MIN_VALUE;
        return this.f14566n.b(0L, null, this);
    }
}
