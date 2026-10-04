package p;

/* renamed from: p.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735W extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C1746d0 f13920k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13921l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f13922m;

    /* renamed from: n, reason: collision with root package name */
    public int f13923n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735W(C1746d0 c1746d0, U3.c cVar) {
        super(cVar);
        this.f13922m = c1746d0;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f13921l = obj;
        this.f13923n |= Integer.MIN_VALUE;
        return C1746d0.N0(this.f13922m, this);
    }
}
