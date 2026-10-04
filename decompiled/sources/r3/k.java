package r3;

/* loaded from: classes.dex */
public final class k extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14894k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f14895l;

    /* renamed from: m, reason: collision with root package name */
    public int f14896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, U3.c cVar) {
        super(cVar);
        this.f14895l = mVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f14894k = obj;
        this.f14896m |= Integer.MIN_VALUE;
        return m.e(this.f14895l, null, this);
    }
}
