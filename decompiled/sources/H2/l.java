package H2;

import D.C0056i;
import G2.C0174k;
import H.M;
import L.AbstractC0412r0;
import L.E;
import L.E0;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O3.C;
import h0.InterfaceC0973S;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3620l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3621m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3622n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3623o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3624p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f3625q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a0.q qVar, InterfaceC0973S interfaceC0973S, L.B b4, E e7, W.a aVar, int i7) {
        super(2);
        this.f3620l = 1;
        this.f3621m = qVar;
        this.f3622n = interfaceC0973S;
        this.f3623o = b4;
        this.f3624p = e7;
        this.f3625q = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3620l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    C0174k c0174k = (C0174k) this.f3621m;
                    boolean zH = c0510p.h(c0174k);
                    p pVar = (p) this.f3622n;
                    boolean zF = zH | c0510p.f(pVar);
                    Object objH = c0510p.H();
                    if (zF || objH == C0502l.a) {
                        objH = new C0056i((Y.r) this.f3624p, c0174k, pVar, 3);
                        c0510p.b0(objH);
                    }
                    C0486d.c(c0174k, (e4.k) objH, c0510p);
                    q0.c.d(c0174k, (X.g) this.f3623o, W.f.b(-497631156, new M(1, (o) this.f3625q, c0174k), c0510p), c0510p, 384);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV = C0486d.V(196615);
                W.a aVar = (W.a) this.f3625q;
                L.B b4 = (L.B) this.f3623o;
                E e7 = (E) this.f3624p;
                E0.c((a0.q) this.f3621m, (InterfaceC0973S) this.f3622n, b4, e7, aVar, (C0510p) obj, iV);
                break;
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    AbstractC0412r0.b((W.a) this.f3621m, (W.a) this.f3622n, (W.a) this.f3623o, (W.a) this.f3624p, (W.a) this.f3625q, c0510p2, 384);
                }
                break;
        }
        return C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        super(2);
        this.f3620l = i7;
        this.f3621m = obj;
        this.f3622n = obj2;
        this.f3623o = obj3;
        this.f3624p = obj4;
        this.f3625q = obj5;
    }
}
