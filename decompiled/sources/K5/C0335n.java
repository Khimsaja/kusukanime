package K5;

/* renamed from: K5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335n extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4832k;

    /* renamed from: l, reason: collision with root package name */
    public int f4833l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0336o f4834m;

    /* renamed from: n, reason: collision with root package name */
    public Object f4835n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0330i f4836o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335n(C0336o c0336o, S3.c cVar) {
        super(cVar);
        this.f4834m = c0336o;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4832k = obj;
        this.f4833l |= Integer.MIN_VALUE;
        return this.f4834m.collect(null, this);
    }
}
