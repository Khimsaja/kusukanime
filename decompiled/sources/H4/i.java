package H4;

import b1.AbstractC0703b;
import java.util.List;
import n5.AbstractC1586x;
import n5.V;
import p.AbstractC1755i;
import u4.InterfaceC2096b;
import u4.InterfaceC2099e;
import x4.C2266L;
import x4.C2295v;

/* loaded from: classes.dex */
public final class i implements Z4.f {
    @Override // Z4.f
    public final int a(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2, InterfaceC2099e interfaceC2099e) {
        kotlin.jvm.internal.l.f("superDescriptor", interfaceC2096b);
        kotlin.jvm.internal.l.f("subDescriptor", interfaceC2096b2);
        if (!(interfaceC2096b2 instanceof J4.f)) {
            return 3;
        }
        J4.f fVar = (J4.f) interfaceC2096b2;
        if (!fVar.getTypeParameters().isEmpty()) {
            return 3;
        }
        Z4.j jVarI = Z4.k.i(interfaceC2096b, interfaceC2096b2);
        if ((jVarI != null ? jVarI.b() : 0) != 0) {
            return 3;
        }
        List listM0 = fVar.m0();
        kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
        y5.o oVarU = y5.k.U(P3.q.l0(listM0), C0250d.f3724o);
        AbstractC1586x abstractC1586x = fVar.f17494q;
        kotlin.jvm.internal.l.c(abstractC1586x);
        y5.g gVarQ = y5.k.Q(P3.m.Q(new y5.h[]{oVarU, new b6.z(1, abstractC1586x)}));
        C2295v c2295v = fVar.f17496s;
        y5.e eVar = new y5.e(y5.k.Q(P3.m.Q(new y5.h[]{gVarQ, P3.q.l0(P3.r.J(c2295v != null ? c2295v.getType() : null))})));
        while (eVar.hasNext()) {
            AbstractC1586x abstractC1586x2 = (AbstractC1586x) eVar.next();
            if (!abstractC1586x2.q0().isEmpty() && !(abstractC1586x2.w0() instanceof M4.i)) {
                return 3;
            }
        }
        InterfaceC2096b interfaceC2096bBuild = (InterfaceC2096b) interfaceC2096b.b(new V(new M4.g()));
        if (interfaceC2096bBuild == null) {
            return 3;
        }
        if (interfaceC2096bBuild instanceof C2266L) {
            C2266L c2266l = (C2266L) interfaceC2096bBuild;
            if (!c2266l.getTypeParameters().isEmpty()) {
                interfaceC2096bBuild = c2266l.f0().f().build();
                kotlin.jvm.internal.l.c(interfaceC2096bBuild);
            }
        }
        int iB = Z4.k.f10274c.n(interfaceC2096bBuild, interfaceC2096b2, false).b();
        AbstractC0703b.A(iB, "getResult(...)");
        return h.a[AbstractC1755i.b(iB)] == 1 ? 1 : 3;
    }

    @Override // Z4.f
    public final int b() {
        return 2;
    }
}
