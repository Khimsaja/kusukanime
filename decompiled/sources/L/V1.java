package L;

import O.C0486d;
import O.C0510p;
import v.C2122a;

/* loaded from: classes.dex */
public final class V1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.q f5385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W.a f5386m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W.a f5387n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W.a f5388o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W.a f5389p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5390q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5391r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f5392s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2122a f5393t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ W.a f5394u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(a0.q qVar, W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, int i7, long j7, long j8, C2122a c2122a, W.a aVar5, int i8) {
        super(2);
        this.f5385l = qVar;
        this.f5386m = aVar;
        this.f5387n = aVar2;
        this.f5388o = aVar3;
        this.f5389p = aVar4;
        this.f5390q = i7;
        this.f5391r = j7;
        this.f5392s = j8;
        this.f5393t = c2122a;
        this.f5394u = aVar5;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(805306753);
        W.a aVar = this.f5394u;
        W.a aVar2 = this.f5387n;
        long j7 = this.f5391r;
        long j8 = this.f5392s;
        Y1.a(this.f5385l, this.f5386m, aVar2, this.f5388o, this.f5389p, this.f5390q, j7, j8, this.f5393t, aVar, (C0510p) obj, iV);
        return O3.C.a;
    }
}
