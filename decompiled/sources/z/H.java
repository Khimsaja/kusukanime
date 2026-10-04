package z;

/* loaded from: classes.dex */
public final class H extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f18438k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f18439l;

    /* renamed from: m, reason: collision with root package name */
    public int f18440m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i7, U3.c cVar) {
        super(cVar);
        this.f18439l = i7;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f18438k = obj;
        this.f18440m |= Integer.MIN_VALUE;
        return this.f18439l.a(null, 0.0f, this);
    }
}
