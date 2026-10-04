package L;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import h0.C0998u;
import v.AbstractC2130i;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public final class H extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.Z f5101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W.a f5102n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f5103o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W.a f5104p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(float f5, v.Z z7, W.a aVar, long j7, W.a aVar2, long j8) {
        super(2);
        this.f5100l = f5;
        this.f5101m = z7;
        this.f5102n = aVar;
        this.f5103o = j7;
        this.f5104p = aVar2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            a0.n nVar = a0.n.a;
            a0.q qVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.b(nVar, 0.0f, this.f5100l, 1), this.f5101m);
            G g4 = G.f5070b;
            int i7 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarG);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, g4);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                AbstractC0703b.u(i7, c0510p, i7, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            c0510p.R(-1293169671);
            a0.i iVar = a0.b.f10385o;
            W.a aVar = this.f5102n;
            if (aVar != null) {
                a0.q qVarC2 = androidx.compose.ui.layout.a.c(nVar, "leadingIcon");
                InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
                int i8 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
                a0.q qVarC3 = a0.a.c(c0510p, qVarC2);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                    AbstractC0703b.u(i8, c0510p, i8, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC3);
                if (aVar != null) {
                    c0510p.R(832788565);
                    C0486d.a(X.a.a(new C0998u(this.f5103o)), aVar, c0510p, 8);
                    c0510p.p(false);
                } else {
                    c0510p.R(833040347);
                    c0510p.p(false);
                }
                c0510p.p(true);
            }
            c0510p.p(false);
            a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.ui.layout.a.c(nVar, "label"), M.a, 0);
            v.f0 f0VarB = v.e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p, 54);
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M3 = c0510p.m();
            a0.q qVarC4 = a0.a.c(c0510p, qVarI);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h, f0VarB);
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M3);
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h3);
            }
            C0486d.R(c0510p, c2361h4, qVarC4);
            this.f5104p.invoke(c0510p, 0);
            c0510p.p(true);
            c0510p.R(-1293135324);
            c0510p.p(false);
            c0510p.p(true);
        }
        return O3.C.a;
    }
}
