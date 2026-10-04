package T2;

/* loaded from: classes.dex */
public final class s extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9029k;

    /* renamed from: l, reason: collision with root package name */
    public int f9030l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f9031m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, S3.c cVar) {
        super(cVar);
        this.f9031m = mVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f9029k = obj;
        this.f9030l |= Integer.MIN_VALUE;
        return this.f9031m.emit(null, this);
    }
}
