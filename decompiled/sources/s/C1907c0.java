package s;

/* renamed from: s.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1907c0 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C1909d0 f15276k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15278m;

    /* renamed from: n, reason: collision with root package name */
    public int f15279n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1907c0(C1909d0 c1909d0, U3.c cVar) {
        super(cVar);
        this.f15278m = c1909d0;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15277l = obj;
        this.f15279n |= Integer.MIN_VALUE;
        return this.f15278m.c(this);
    }
}
