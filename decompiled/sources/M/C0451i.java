package M;

/* renamed from: M.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451i extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0460s f6304k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0460s f6306m;

    /* renamed from: n, reason: collision with root package name */
    public int f6307n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0451i(C0460s c0460s, U3.c cVar) {
        super(cVar);
        this.f6306m = c0460s;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f6305l = obj;
        this.f6307n |= Integer.MIN_VALUE;
        return this.f6306m.b(null, null, this);
    }
}
