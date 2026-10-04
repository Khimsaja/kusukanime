package z0;

/* loaded from: classes.dex */
public final class T extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f18676k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W f18677l;

    /* renamed from: m, reason: collision with root package name */
    public int f18678m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w7, U3.c cVar) {
        super(cVar);
        this.f18677l = w7;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f18676k = obj;
        this.f18678m |= Integer.MIN_VALUE;
        this.f18677l.a(null, this);
        return T3.a.f9048k;
    }
}
