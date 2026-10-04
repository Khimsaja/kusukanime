package L4;

import A4.AbstractC0011d;
import A4.AbstractC0013f;
import A4.C0012e;
import C2.C0034g;
import e4.InterfaceC0821a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import t4.C2054e;
import u4.AbstractC2115v;
import u4.InterfaceC2099e;

/* renamed from: L4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442e implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6065k;

    /* renamed from: l, reason: collision with root package name */
    public final f f6066l;

    public /* synthetic */ C0442e(f fVar, int i7) {
        this.f6065k = i7;
        this.f6066l = fVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f6065k) {
            case 0:
                return AbstractC0011d.a(n6.m.F(n6.m.B(this.f6066l.f6068b.a))).a();
            case 1:
                f fVar = this.f6066l;
                W4.c cVarA = fVar.a();
                C0012e c0012e = fVar.f6068b;
                if (cVarA == null) {
                    return p5.l.c(p5.k.f14437O, c0012e.toString());
                }
                A2.b bVar = fVar.a;
                InterfaceC2099e interfaceC2099eB = C2054e.b(cVarA, ((K4.a) bVar.f110l).f4713o.f17339n);
                if (interfaceC2099eB == null) {
                    A4.p pVar = new A4.p(n6.m.F(n6.m.B(c0012e.a)));
                    K4.a aVar = (K4.a) bVar.f110l;
                    C0034g c0034g = aVar.f4709k;
                    c0034g.getClass();
                    X4.y yVar = (X4.y) c0034g.f741l;
                    if (yVar == null) {
                        kotlin.jvm.internal.l.l("resolver");
                        throw null;
                    }
                    interfaceC2099eB = yVar.D(pVar);
                    if (interfaceC2099eB == null) {
                        interfaceC2099eB = AbstractC2115v.f(aVar.f4713o, new W4.b(cVarA.b(), cVarA.a.g()), aVar.f4702d.c().f12424l);
                    }
                }
                return interfaceC2099eB.g();
            default:
                f fVar2 = this.f6066l;
                ArrayList arrayListB = fVar2.f6068b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    N4.a aVar2 = (N4.a) it.next();
                    W4.e eVar = ((AbstractC0013f) aVar2).a;
                    if (eVar == null) {
                        eVar = H4.x.f3755b;
                    }
                    b5.g gVarC = fVar2.c(aVar2);
                    O3.l lVar = gVarC != null ? new O3.l(eVar, gVarC) : null;
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                }
                return P3.E.r0(arrayList);
        }
    }
}
