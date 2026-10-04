package t;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2022b extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public e4.k f15842k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15843l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2027g f15844m;

    /* renamed from: n, reason: collision with root package name */
    public int f15845n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2022b(C2027g c2027g, U3.c cVar) {
        super(cVar);
        this.f15844m = c2027g;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15843l = obj;
        this.f15845n |= Integer.MIN_VALUE;
        return this.f15844m.c(null, 0.0f, null, this);
    }
}
