package L;

import O.C0486d;
import O.C0510p;
import O.C0525y;
import h0.C0998u;

/* loaded from: classes.dex */
public final class A0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4889l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f4890m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4891n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4892o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C0436z0 c0436z0, boolean z7, W.a aVar) {
        super(2);
        this.f4891n = c0436z0;
        this.f4890m = z7;
        this.f4892o = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4889l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    c0510p.R(1264683960);
                    c0510p.p(false);
                    C0525y c0525y = X.a;
                    boolean z7 = this.f4890m;
                    C0436z0 c0436z0 = (C0436z0) this.f4891n;
                    C0486d.a(c0525y.a(new C0998u(z7 ? c0436z0.a : c0436z0.f5976d)), W.f.b(-1728894036, new C0351b((W.a) this.f4892o, 4, (byte) 0), c0510p), c0510p, 56);
                }
                break;
            default:
                ((Number) obj2).intValue();
                androidx.compose.material3.a.a(this.f4890m, (a0.q) this.f4891n, (r2) this.f4892o, (C0510p) obj, C0486d.V(49));
                break;
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(boolean z7, a0.q qVar, r2 r2Var, int i7) {
        super(2);
        this.f4890m = z7;
        this.f4891n = qVar;
        this.f4892o = r2Var;
    }
}
