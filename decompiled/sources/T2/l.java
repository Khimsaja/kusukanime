package T2;

/* loaded from: classes.dex */
public final class l extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9005k;

    /* renamed from: l, reason: collision with root package name */
    public int f9006l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f9007m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, S3.c cVar) {
        super(cVar);
        this.f9007m = mVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f9005k = obj;
        this.f9006l |= Integer.MIN_VALUE;
        return this.f9007m.emit(null, this);
    }
}
