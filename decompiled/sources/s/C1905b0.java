package s;

/* renamed from: s.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1905b0 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C1909d0 f15268k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15269l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1909d0 f15270m;

    /* renamed from: n, reason: collision with root package name */
    public int f15271n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1905b0(C1909d0 c1909d0, U3.c cVar) {
        super(cVar);
        this.f15270m = c1909d0;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15269l = obj;
        this.f15271n |= Integer.MIN_VALUE;
        return this.f15270m.b(this);
    }
}
