package x;

import q.X;

/* loaded from: classes.dex */
public final class t extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public v f17270k;

    /* renamed from: l, reason: collision with root package name */
    public X f17271l;

    /* renamed from: m, reason: collision with root package name */
    public e4.n f17272m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f17273n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f17274o;

    /* renamed from: p, reason: collision with root package name */
    public int f17275p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, S3.c cVar) {
        super(cVar);
        this.f17274o = vVar;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f17273n = obj;
        this.f17275p |= Integer.MIN_VALUE;
        return this.f17274o.e(null, null, this);
    }
}
