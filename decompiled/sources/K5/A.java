package K5;

/* loaded from: classes.dex */
public final class A extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0344x f4730k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4731l;

    /* renamed from: m, reason: collision with root package name */
    public int f4732m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0344x f4733n;

    /* renamed from: o, reason: collision with root package name */
    public Object f4734o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0344x c0344x, S3.c cVar) {
        super(cVar);
        this.f4733n = c0344x;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4731l = obj;
        this.f4732m |= Integer.MIN_VALUE;
        return this.f4733n.emit(null, this);
    }
}
