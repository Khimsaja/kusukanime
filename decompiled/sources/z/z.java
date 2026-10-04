package z;

import q.X;

/* loaded from: classes.dex */
public final class z extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C f18542k;

    /* renamed from: l, reason: collision with root package name */
    public X f18543l;

    /* renamed from: m, reason: collision with root package name */
    public e4.n f18544m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f18545n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f18546o;

    /* renamed from: p, reason: collision with root package name */
    public int f18547p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C c2, S3.c cVar) {
        super(cVar);
        this.f18546o = c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f18545n = obj;
        this.f18547p |= Integer.MIN_VALUE;
        return C.r(this.f18546o, null, null, this);
    }
}
