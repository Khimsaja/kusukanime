package s0;

/* loaded from: classes.dex */
public final class z extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f15503k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1953A f15504l;

    /* renamed from: m, reason: collision with root package name */
    public int f15505m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C1953A c1953a, U3.a aVar) {
        super(aVar);
        this.f15504l = c1953a;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15503k = obj;
        this.f15505m |= Integer.MIN_VALUE;
        return this.f15504l.j(0L, null, this);
    }
}
