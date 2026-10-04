package y;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2321b extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public S3.j f17615k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f17616l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2322c f17617m;

    /* renamed from: n, reason: collision with root package name */
    public int f17618n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2321b(C2322c c2322c, U3.c cVar) {
        super(cVar);
        this.f17617m = c2322c;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f17616l = obj;
        this.f17618n |= Integer.MIN_VALUE;
        return this.f17617m.h(this);
    }
}
