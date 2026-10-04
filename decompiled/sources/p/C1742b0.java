package p;

/* renamed from: p.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1742b0 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C1746d0 f13952k;

    /* renamed from: l, reason: collision with root package name */
    public Object f13953l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13954m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13955n;

    /* renamed from: o, reason: collision with root package name */
    public int f13956o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742b0(C1746d0 c1746d0, U3.c cVar) {
        super(cVar);
        this.f13955n = c1746d0;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f13954m = obj;
        this.f13956o |= Integer.MIN_VALUE;
        return C1746d0.O0(this.f13955n, this);
    }
}
