package M4;

import O3.l;
import P3.r;
import g5.o;
import java.util.ArrayList;
import java.util.List;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.G;
import n5.I;
import n5.M;
import n5.P;
import n5.Q;
import n5.T;
import n5.W;
import n5.b0;
import p5.k;
import r4.AbstractC1880i;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class g extends T {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6564c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f6565d;

    /* renamed from: b, reason: collision with root package name */
    public final P f6566b = new P(new e());

    static {
        W w7 = W.f13382l;
        f6564c = a.a(n6.d.f0(w7, false, null, 5), b.f6555m, false, null, null, 61);
        f6565d = a.a(n6.d.f0(w7, false, null, 5), b.f6554l, false, null, null, 61);
    }

    @Override // n5.T
    public final Q d(AbstractC1586x abstractC1586x) {
        return new G(h(abstractC1586x, new a(W.f13382l, false, false, null, 62)));
    }

    public final l g(B b4, InterfaceC2099e interfaceC2099e, a aVar) {
        if (b4.t0().getParameters().isEmpty()) {
            return new l(b4, Boolean.FALSE);
        }
        if (AbstractC1880i.y(b4)) {
            Q q6 = (Q) b4.q0().get(0);
            b0 b0VarA = q6.a();
            AbstractC1586x abstractC1586xB = q6.b();
            kotlin.jvm.internal.l.e("getType(...)", abstractC1586xB);
            return new l(AbstractC1566c.u(r.H(new G(h(abstractC1586xB, aVar), b0VarA)), b4.s0(), b4.t0(), b4.u0()), Boolean.FALSE);
        }
        if (AbstractC1566c.k(b4)) {
            return new l(p5.l.c(k.f14450x, b4.t0().toString()), Boolean.FALSE);
        }
        o oVarN = interfaceC2099e.N(this);
        kotlin.jvm.internal.l.e("getMemberScope(...)", oVarN);
        I iS0 = b4.s0();
        M mV = interfaceC2099e.v();
        kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV);
        List<u4.Q> parameters = interfaceC2099e.v().getParameters();
        kotlin.jvm.internal.l.e("getParameters(...)", parameters);
        ArrayList arrayList = new ArrayList(r.p(parameters, 10));
        for (u4.Q q7 : parameters) {
            kotlin.jvm.internal.l.c(q7);
            P p7 = this.f6566b;
            arrayList.add(e.a(q7, aVar, p7, p7.k(q7, aVar)));
        }
        return new l(AbstractC1566c.w(iS0, mV, arrayList, b4.u0(), oVarN, new f(interfaceC2099e, this, b4, aVar)), Boolean.TRUE);
    }

    public final AbstractC1586x h(AbstractC1586x abstractC1586x, a aVar) {
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        if (interfaceC2102hF instanceof u4.Q) {
            aVar.getClass();
            return h(this.f6566b.k((u4.Q) interfaceC2102hF, a.a(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(interfaceC2102hF instanceof InterfaceC2099e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC2102hF).toString());
        }
        InterfaceC2102h interfaceC2102hF2 = AbstractC1566c.F(abstractC1586x).t0().f();
        if (interfaceC2102hF2 instanceof InterfaceC2099e) {
            l lVarG = g(AbstractC1566c.m(abstractC1586x), (InterfaceC2099e) interfaceC2102hF, f6564c);
            B b4 = (B) lVarG.f7528k;
            boolean zBooleanValue = ((Boolean) lVarG.f7529l).booleanValue();
            l lVarG2 = g(AbstractC1566c.F(abstractC1586x), (InterfaceC2099e) interfaceC2102hF2, f6565d);
            B b7 = (B) lVarG2.f7528k;
            return (zBooleanValue || ((Boolean) lVarG2.f7529l).booleanValue()) ? new i(b4, b7) : AbstractC1566c.f(b4, b7);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC2102hF2 + "\" while for lower it's \"" + interfaceC2102hF + '\"').toString());
    }
}
