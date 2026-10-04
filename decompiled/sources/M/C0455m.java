package M;

/* renamed from: M.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455m extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0460s f6317k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6318l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0460s f6319m;

    /* renamed from: n, reason: collision with root package name */
    public int f6320n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0455m(C0460s c0460s, U3.c cVar) {
        super(cVar);
        this.f6319m = c0460s;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f6318l = obj;
        this.f6320n |= Integer.MIN_VALUE;
        return this.f6319m.a(null, null, null, this);
    }
}
