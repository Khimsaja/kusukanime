package M;

import K5.C0327f;

/* renamed from: M.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449g extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0327f f6295k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6296l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6297m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0327f f6298n;

    /* renamed from: o, reason: collision with root package name */
    public int f6299o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449g(C0327f c0327f, S3.c cVar) {
        super(cVar);
        this.f6298n = c0327f;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f6297m = obj;
        this.f6299o |= Integer.MIN_VALUE;
        return this.f6298n.emit(null, this);
    }
}
