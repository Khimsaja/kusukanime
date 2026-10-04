package K5;

/* renamed from: K5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322a extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public L5.t f4794k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0332k f4796m;

    /* renamed from: n, reason: collision with root package name */
    public int f4797n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0322a(C0332k c0332k, S3.c cVar) {
        super(cVar);
        this.f4796m = c0332k;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4795l = obj;
        this.f4797n |= Integer.MIN_VALUE;
        return this.f4796m.collect(null, this);
    }
}
