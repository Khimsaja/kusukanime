package z0;

/* renamed from: z0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2469t extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f18839k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2471u f18840l;

    /* renamed from: m, reason: collision with root package name */
    public int f18841m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2469t(C2471u c2471u, U3.c cVar) {
        super(cVar);
        this.f18840l = c2471u;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f18839k = obj;
        this.f18841m |= Integer.MIN_VALUE;
        this.f18840l.E(null, this);
        return T3.a.f9048k;
    }
}
