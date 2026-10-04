package U2;

/* loaded from: classes.dex */
public final class c extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public Object f9196k;

    /* renamed from: l, reason: collision with root package name */
    public R5.i f9197l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9198m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f9199n;

    /* renamed from: o, reason: collision with root package name */
    public int f9200o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, U3.c cVar) {
        super(cVar);
        this.f9199n = dVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f9198m = obj;
        this.f9200o |= Integer.MIN_VALUE;
        return this.f9199n.a(this);
    }
}
