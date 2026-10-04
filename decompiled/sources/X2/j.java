package X2;

/* loaded from: classes.dex */
public final class j extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9811k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f9812l;

    /* renamed from: m, reason: collision with root package name */
    public int f9813m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, U3.c cVar) {
        super(cVar);
        this.f9812l = lVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f9811k = obj;
        this.f9813m |= Integer.MIN_VALUE;
        return this.f9812l.b(null, this);
    }
}
