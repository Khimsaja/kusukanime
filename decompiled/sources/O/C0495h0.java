package O;

/* renamed from: O.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495h0 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0497i0 f7079k;

    /* renamed from: l, reason: collision with root package name */
    public e4.k f7080l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0497i0 f7082n;

    /* renamed from: o, reason: collision with root package name */
    public int f7083o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0495h0(C0497i0 c0497i0, S3.c cVar) {
        super(cVar);
        this.f7082n = c0497i0;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f7081m = obj;
        this.f7083o |= Integer.MIN_VALUE;
        return this.f7082n.P(null, this);
    }
}
