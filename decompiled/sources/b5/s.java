package b5;

import f6.AbstractC0905c;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.B;
import n5.G;
import n5.I;
import n5.b0;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.AbstractC2115v;
import u4.InterfaceC2099e;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public final class s extends g {
    public s(W4.b bVar, int i7) {
        super(new q(new f(bVar, i7)));
    }

    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        AbstractC1586x abstractC1586xC;
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        I.f13362l.getClass();
        I i7 = I.f13363m;
        AbstractC1880i abstractC1880iD = interfaceC2118y.d();
        abstractC1880iD.getClass();
        InterfaceC2099e interfaceC2099eJ = abstractC1880iD.j(AbstractC1886o.f14977Q.i());
        Object obj = this.a;
        r rVar = (r) obj;
        if (rVar instanceof p) {
            abstractC1586xC = ((p) obj).a;
        } else {
            if (!(rVar instanceof q)) {
                throw new D6.r();
            }
            f fVar = ((q) obj).a;
            W4.b bVar = fVar.a;
            InterfaceC2099e interfaceC2099eD = AbstractC2115v.d(interfaceC2118y, bVar);
            int i8 = fVar.f10948b;
            if (interfaceC2099eD == null) {
                abstractC1586xC = p5.l.c(p5.k.f14440n, bVar.toString(), String.valueOf(i8));
            } else {
                B bG = interfaceC2099eD.g();
                kotlin.jvm.internal.l.e("getDefaultType(...)", bG);
                AbstractC1586x abstractC1586xZ = AbstractC0905c.z(bG);
                for (int i9 = 0; i9 < i8; i9++) {
                    AbstractC1880i abstractC1880iD2 = interfaceC2118y.d();
                    b0 b0Var = b0.f13390m;
                    abstractC1586xZ = abstractC1880iD2.h(abstractC1586xZ);
                }
                abstractC1586xC = abstractC1586xZ;
            }
        }
        return AbstractC1566c.t(i7, interfaceC2099eJ, P3.r.H(new G(abstractC1586xC)));
    }
}
