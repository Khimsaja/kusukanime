package t;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2025e extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f15855k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2027g f15856l;

    /* renamed from: m, reason: collision with root package name */
    public int f15857m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2025e(C2027g c2027g, U3.c cVar) {
        super(cVar);
        this.f15856l = c2027g;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15855k = obj;
        this.f15857m |= Integer.MIN_VALUE;
        return this.f15856l.d(null, 0.0f, null, this);
    }
}
