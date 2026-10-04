package w;

import q.X;

/* loaded from: classes.dex */
public final class q extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public u f16778k;

    /* renamed from: l, reason: collision with root package name */
    public X f16779l;

    /* renamed from: m, reason: collision with root package name */
    public e4.n f16780m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f16781n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f16782o;

    /* renamed from: p, reason: collision with root package name */
    public int f16783p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, S3.c cVar) {
        super(cVar);
        this.f16782o = uVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f16781n = obj;
        this.f16783p |= Integer.MIN_VALUE;
        return this.f16782o.e(null, null, this);
    }
}
