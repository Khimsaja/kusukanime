package u4;

import d5.C0806b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x4.C2255A;
import x4.C2297x;

/* renamed from: u4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2115v {
    public static final F2.G a = new F2.G("InvalidModuleNotifier", 6);

    public static final B2.l a(n5.B b4, InterfaceC2103i interfaceC2103i, int i7) {
        if (interfaceC2103i == null || p5.l.f(interfaceC2103i)) {
            return null;
        }
        int size = interfaceC2103i.n().size() + i7;
        if (interfaceC2103i.j()) {
            List listSubList = b4.q0().subList(i7, size);
            InterfaceC2105k interfaceC2105kK = interfaceC2103i.k();
            return new B2.l(interfaceC2103i, listSubList, a(b4, interfaceC2105kK instanceof InterfaceC2103i ? (InterfaceC2103i) interfaceC2105kK : null, size));
        }
        if (size != b4.q0().size()) {
            Z4.e.n(interfaceC2103i);
        }
        return new B2.l(interfaceC2103i, b4.q0().subList(i7, b4.q0().size()), (B2.l) null);
    }

    public static final void b(InterfaceC2091G interfaceC2091G, W4.c cVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2091G);
        kotlin.jvm.internal.l.f("fqName", cVar);
        interfaceC2091G.b(cVar, arrayList);
    }

    public static final List c(InterfaceC2103i interfaceC2103i) {
        List parameters;
        Object next;
        n5.M mV;
        kotlin.jvm.internal.l.f("<this>", interfaceC2103i);
        List listN = interfaceC2103i.n();
        kotlin.jvm.internal.l.e("getDeclaredTypeParameters(...)", listN);
        if (!interfaceC2103i.j() && !(interfaceC2103i.k() instanceof InterfaceC2096b)) {
            return listN;
        }
        int i7 = d5.e.a;
        C0806b c0806b = C0806b.f11325l;
        List listW = y5.k.W(new y5.g(new y5.f(new Z3.h(y5.k.P(y5.k.S(c0806b, interfaceC2103i), 1), C2110p.f16335n), true, C2110p.f16336o), C2110p.f16337p, y5.m.f18389k));
        Iterator it = y5.k.P(y5.k.S(c0806b, interfaceC2103i), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC2099e) {
                break;
            }
        }
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) next;
        if (interfaceC2099e != null && (mV = interfaceC2099e.v()) != null) {
            parameters = mV.getParameters();
        }
        if (parameters == null) {
            parameters = P3.y.f7779k;
        }
        if (listW.isEmpty() && parameters.isEmpty()) {
            List listN2 = interfaceC2103i.n();
            kotlin.jvm.internal.l.e("getDeclaredTypeParameters(...)", listN2);
            return listN2;
        }
        ArrayList arrayListG0 = P3.q.G0(listW, parameters);
        ArrayList arrayList = new ArrayList(P3.r.p(arrayListG0, 10));
        Iterator it2 = arrayListG0.iterator();
        while (it2.hasNext()) {
            Q q6 = (Q) it2.next();
            kotlin.jvm.internal.l.c(q6);
            arrayList.add(new C2098d(q6, interfaceC2103i, listN.size()));
        }
        return P3.q.G0(listN, arrayList);
    }

    public static final InterfaceC2099e d(InterfaceC2118y interfaceC2118y, W4.b bVar) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2118y);
        kotlin.jvm.internal.l.f("classId", bVar);
        InterfaceC2102h interfaceC2102hE = e(interfaceC2118y, bVar);
        if (interfaceC2102hE instanceof InterfaceC2099e) {
            return (InterfaceC2099e) interfaceC2102hE;
        }
        return null;
    }

    public static final InterfaceC2102h e(InterfaceC2118y interfaceC2118y, W4.b bVar) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2118y);
        kotlin.jvm.internal.l.f("classId", bVar);
        if (interfaceC2118y.o0(Z4.l.a) != null) {
            throw new ClassCastException();
        }
        InterfaceC2092H interfaceC2092HF = interfaceC2118y.F(bVar.a);
        W4.d dVar = bVar.f9616b.a;
        dVar.getClass();
        List listF = W4.d.f(dVar);
        InterfaceC2102h interfaceC2102hB = ((C2297x) interfaceC2092HF).f17514q.b((W4.e) P3.q.r0(listF), C4.c.f965q);
        if (interfaceC2102hB != null) {
            for (W4.e eVar : listF.subList(1, listF.size())) {
                if (interfaceC2102hB instanceof InterfaceC2099e) {
                    InterfaceC2102h interfaceC2102hB2 = ((InterfaceC2099e) interfaceC2102hB).Y().b(eVar, C4.c.f965q);
                    interfaceC2102hB = interfaceC2102hB2 instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hB2 : null;
                    if (interfaceC2102hB != null) {
                    }
                }
            }
            return interfaceC2102hB;
        }
        return null;
    }

    public static final InterfaceC2099e f(InterfaceC2118y interfaceC2118y, W4.b bVar, A2.b bVar2) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2118y);
        kotlin.jvm.internal.l.f("classId", bVar);
        kotlin.jvm.internal.l.f("notFoundClasses", bVar2);
        InterfaceC2099e interfaceC2099eD = d(interfaceC2118y, bVar);
        return interfaceC2099eD != null ? interfaceC2099eD : bVar2.t(bVar, y5.k.W(y5.k.U(y5.k.S(C2111q.f16339k, bVar), C2110p.f16333l)));
    }

    public static final InterfaceC2102h g(InterfaceC2105k interfaceC2105k) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2105k);
        InterfaceC2105k interfaceC2105kK = interfaceC2105k.k();
        if (interfaceC2105kK == null || (interfaceC2105k instanceof InterfaceC2088D)) {
            return null;
        }
        if (!(interfaceC2105kK.k() instanceof InterfaceC2088D)) {
            return g(interfaceC2105kK);
        }
        if (interfaceC2105kK instanceof InterfaceC2102h) {
            return (InterfaceC2102h) interfaceC2105kK;
        }
        return null;
    }

    public static final boolean h(InterfaceC2091G interfaceC2091G, W4.c cVar) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2091G);
        kotlin.jvm.internal.l.f("fqName", cVar);
        return interfaceC2091G.a(cVar);
    }

    public static final ArrayList i(InterfaceC2091G interfaceC2091G, W4.c cVar) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2091G);
        kotlin.jvm.internal.l.f("fqName", cVar);
        ArrayList arrayList = new ArrayList();
        b(interfaceC2091G, cVar, arrayList);
        return arrayList;
    }

    public static final InterfaceC2099e j(C2255A c2255a, W4.c cVar) {
        g5.o oVarY;
        C4.c cVar2 = C4.c.f959k;
        kotlin.jvm.internal.l.f("<this>", c2255a);
        kotlin.jvm.internal.l.f("fqName", cVar);
        W4.d dVar = cVar.a;
        if (!dVar.c()) {
            InterfaceC2102h interfaceC2102hB = ((C2297x) c2255a.F(cVar.b())).f17514q.b(dVar.g(), cVar2);
            InterfaceC2099e interfaceC2099e = interfaceC2102hB instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hB : null;
            if (interfaceC2099e != null) {
                return interfaceC2099e;
            }
            InterfaceC2099e interfaceC2099eJ = j(c2255a, cVar.b());
            InterfaceC2102h interfaceC2102hB2 = (interfaceC2099eJ == null || (oVarY = interfaceC2099eJ.Y()) == null) ? null : oVarY.b(dVar.g(), cVar2);
            if (interfaceC2102hB2 instanceof InterfaceC2099e) {
                return (InterfaceC2099e) interfaceC2102hB2;
            }
        }
        return null;
    }
}
