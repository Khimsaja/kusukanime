package D;

import K5.C0332k;
import O.C0486d;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072q extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f1269k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0053g0 f1270l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.Z f1271m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N0.x f1272n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H.S f1273o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N0.l f1274p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0072q(C0053g0 c0053g0, O.Z z7, N0.x xVar, H.S s7, N0.l lVar, S3.c cVar) {
        super(2, cVar);
        this.f1270l = c0053g0;
        this.f1271m = z7;
        this.f1272n = xVar;
        this.f1273o = s7;
        this.f1274p = lVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0072q(this.f1270l, this.f1271m, this.f1272n, this.f1273o, this.f1274p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0072q) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1269k;
        C0053g0 c0053g0 = this.f1270l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                C0332k c0332kS = C0486d.S(new C0068o(0, this.f1271m));
                C0070p c0070p = new C0070p(c0053g0, this.f1272n, this.f1273o, this.f1274p, 0);
                this.f1269k = 1;
                if (c0332kS.collect(c0070p, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            AbstractC0047d0.g(c0053g0);
            return O3.C.a;
        } catch (Throwable th) {
            AbstractC0047d0.g(c0053g0);
            throw th;
        }
    }
}
