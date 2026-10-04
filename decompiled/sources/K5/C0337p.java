package K5;

/* renamed from: K5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337p extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4839k;

    /* renamed from: l, reason: collision with root package name */
    public int f4840l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0338q f4841m;

    /* renamed from: n, reason: collision with root package name */
    public C0338q f4842n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0330i f4843o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0337p(C0338q c0338q, S3.c cVar) {
        super(cVar);
        this.f4841m = c0338q;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4839k = obj;
        this.f4840l |= Integer.MIN_VALUE;
        return this.f4841m.collect(null, this);
    }
}
