package K5;

/* renamed from: K5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343w extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0344x f4863k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4864l;

    /* renamed from: m, reason: collision with root package name */
    public int f4865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0344x f4866n;

    /* renamed from: o, reason: collision with root package name */
    public Object f4867o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0343w(C0344x c0344x, S3.c cVar) {
        super(cVar);
        this.f4866n = c0344x;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4864l = obj;
        this.f4865m |= Integer.MIN_VALUE;
        return this.f4866n.emit(null, this);
    }
}
