package C3;

import B3.C0027c;
import C.e;
import L.E0;
import L.N;
import L.P;
import O.C0486d;
import O.C0510p;
import O3.C;
import W.f;
import androidx.compose.foundation.layout.c;
import e4.InterfaceC0821a;
import e4.n;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f955k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f956l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f957m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f958n;

    public /* synthetic */ b(InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, InterfaceC0821a interfaceC0821a3) {
        this.f956l = interfaceC0821a;
        this.f957m = interfaceC0821a2;
        this.f958n = interfaceC0821a3;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f955k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    E0.c(c.d(a0.n.a, 1.0f), e.b(24), E0.j(((N) c0510p.k(P.a)).I, c0510p), E0.k(0, 62), f.b(-953006998, new C0027c((Object) this.f956l, (Object) this.f957m, (Object) this.f958n, 1), c0510p), c0510p, 196614);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int iV = C0486d.V(1);
                a.a(this.f956l, this.f957m, this.f958n, (C0510p) obj, iV);
                break;
        }
        return C.a;
    }

    public /* synthetic */ b(InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, InterfaceC0821a interfaceC0821a3, int i7) {
        this.f956l = interfaceC0821a;
        this.f957m = interfaceC0821a2;
        this.f958n = interfaceC0821a3;
    }
}
