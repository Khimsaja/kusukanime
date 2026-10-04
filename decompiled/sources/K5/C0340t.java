package K5;

/* renamed from: K5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340t extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0327f f4854k;

    /* renamed from: l, reason: collision with root package name */
    public Object f4855l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4856m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0327f f4857n;

    /* renamed from: o, reason: collision with root package name */
    public int f4858o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340t(C0327f c0327f, S3.c cVar) {
        super(cVar);
        this.f4857n = c0327f;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4856m = obj;
        this.f4858o |= Integer.MIN_VALUE;
        return this.f4857n.emit(null, this);
    }
}
