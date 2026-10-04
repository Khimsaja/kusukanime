package L;

import O.C0486d;
import O.C0510p;

/* renamed from: L.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406p extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0409q f5710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.n f5711m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f5712n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f5713o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C.d f5714p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f5715q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0406p(C0409q c0409q, a0.n nVar, float f5, float f7, C.d dVar, long j7, int i7) {
        super(2);
        this.f5710l = c0409q;
        this.f5711m = nVar;
        this.f5712n = f5;
        this.f5713o = f7;
        this.f5714p = dVar;
        this.f5715q = j7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(196609);
        float f5 = this.f5712n;
        float f7 = this.f5713o;
        this.f5710l.a(this.f5711m, f5, f7, this.f5714p, this.f5715q, (C0510p) obj, iV);
        return O3.C.a;
    }
}
