package r0;

/* loaded from: classes.dex */
public final class c extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14785k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f14786l;

    /* renamed from: m, reason: collision with root package name */
    public int f14787m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, U3.c cVar) {
        super(cVar);
        this.f14786l = eVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f14785k = obj;
        this.f14787m |= Integer.MIN_VALUE;
        return this.f14786l.a(0L, 0L, this);
    }
}
