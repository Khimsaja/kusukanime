package H1;

import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements B1.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3210k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y1.b0 f3211l;

    public /* synthetic */ C(I1.a aVar, y1.b0 b0Var) {
        this.f3211l = b0Var;
    }

    @Override // B1.n
    public final void invoke(Object obj) {
        switch (this.f3210k) {
            case 0:
                ((y1.J) obj).E(this.f3211l);
                break;
            default:
                I1.k kVar = (I1.k) obj;
                F.w wVar = kVar.f3991p;
                y1.b0 b0Var = this.f3211l;
                if (wVar != null) {
                    C2393o c2393o = (C2393o) wVar.f2037l;
                    if (c2393o.f18120v == -1) {
                        C2392n c2392nA = c2393o.a();
                        c2392nA.f18081t = b0Var.a;
                        c2392nA.f18082u = b0Var.f18028b;
                        kVar.f3991p = new F.w(20, new C2393o(c2392nA), (String) wVar.f2038m);
                    }
                }
                int i7 = b0Var.a;
                break;
        }
    }

    public /* synthetic */ C(y1.b0 b0Var) {
        this.f3211l = b0Var;
    }
}
