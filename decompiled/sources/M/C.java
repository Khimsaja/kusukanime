package M;

/* loaded from: classes.dex */
public final class C extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6208k;

    /* renamed from: l, reason: collision with root package name */
    public int f6209l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H.F f6210m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(H.F f5, S3.c cVar) {
        super(cVar);
        this.f6210m = f5;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f6208k = obj;
        this.f6209l |= Integer.MIN_VALUE;
        return this.f6210m.emit(null, this);
    }
}
