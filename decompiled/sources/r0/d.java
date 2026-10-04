package r0;

/* loaded from: classes.dex */
public final class d extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14788k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f14789l;

    /* renamed from: m, reason: collision with root package name */
    public int f14790m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, U3.c cVar) {
        super(cVar);
        this.f14789l = eVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f14788k = obj;
        this.f14790m |= Integer.MIN_VALUE;
        return this.f14789l.b(0L, this);
    }
}
