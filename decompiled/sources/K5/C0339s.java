package K5;

/* renamed from: K5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339s extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public H.F f4850k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4851l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H.F f4852m;

    /* renamed from: n, reason: collision with root package name */
    public int f4853n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339s(H.F f5, S3.c cVar) {
        super(cVar);
        this.f4852m = f5;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4851l = obj;
        this.f4853n |= Integer.MIN_VALUE;
        return this.f4852m.emit(null, this);
    }
}
