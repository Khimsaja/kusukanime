package p;

/* renamed from: p.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1744c0 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C1746d0 f13967k;

    /* renamed from: l, reason: collision with root package name */
    public Object f13968l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13969m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13970n;

    /* renamed from: o, reason: collision with root package name */
    public int f13971o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744c0(C1746d0 c1746d0, U3.c cVar) {
        super(cVar);
        this.f13970n = c1746d0;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f13969m = obj;
        this.f13971o |= Integer.MIN_VALUE;
        return C1746d0.P0(this.f13970n, this);
    }
}
