package O4;

import H4.EnumC0247a;
import L4.E;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.Y;
import o5.AbstractC1707g;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2106l;
import u4.Q;

/* loaded from: classes.dex */
public final class r {
    public final InterfaceC2106l a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7588b;

    /* renamed from: c, reason: collision with root package name */
    public final A2.b f7589c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0247a f7590d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7591e;

    public r(InterfaceC2106l interfaceC2106l, boolean z7, A2.b bVar, EnumC0247a enumC0247a, boolean z8) {
        kotlin.jvm.internal.l.f("containerContext", bVar);
        this.a = interfaceC2106l;
        this.f7588b = z7;
        this.f7589c = bVar;
        this.f7590d = enumC0247a;
        this.f7591e = z8;
    }

    public static void a(Object obj, ArrayList arrayList, A4.j jVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) jVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, jVar);
            }
        }
    }

    public static W4.d c(B b4) {
        p5.i iVar = Y.a;
        InterfaceC2102h interfaceC2102hF = b4.t0().f();
        InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
        if (interfaceC2099e != null) {
            return Z4.e.g(interfaceC2099e);
        }
        return null;
    }

    public static h d(q5.d dVar) {
        B bH;
        B bH2;
        kotlin.jvm.internal.l.f("<this>", dVar);
        AbstractC1580q abstractC1580qG = AbstractC1707g.g(dVar);
        if (abstractC1580qG == null || (bH = AbstractC1707g.Q(abstractC1580qG)) == null) {
            bH = AbstractC1707g.h(dVar);
            kotlin.jvm.internal.l.c(bH);
        }
        if (AbstractC1707g.I(bH)) {
            return h.f7563l;
        }
        AbstractC1580q abstractC1580qG2 = AbstractC1707g.g(dVar);
        if (abstractC1580qG2 == null || (bH2 = AbstractC1707g.b0(abstractC1580qG2)) == null) {
            bH2 = AbstractC1707g.h(dVar);
            kotlin.jvm.internal.l.c(bH2);
        }
        if (AbstractC1707g.I(bH2)) {
            return null;
        }
        return h.f7564m;
    }

    public final i b(Q q6) {
        List list;
        h hVar;
        kotlin.jvm.internal.l.f("<this>", q6);
        if (!(q6 instanceof E)) {
            return null;
        }
        List upperBounds = q6.getUpperBounds();
        kotlin.jvm.internal.l.e("getUpperBounds(...)", upperBounds);
        if (upperBounds.isEmpty()) {
            return null;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (!AbstractC1707g.E((q5.d) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : upperBounds) {
                    if (d((q5.d) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                O3.i iVarB = z1.c.B(O3.j.f7526l, new A3.q(8, upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            kotlin.jvm.internal.l.f("<this>", (q5.d) it2.next());
                            list = upperBounds;
                        }
                    }
                    return new i(h.f7562k, false);
                }
                if (((List) iVarB.getValue()).isEmpty()) {
                    return null;
                }
                List list2 = (List) iVarB.getValue();
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    if (it3.hasNext()) {
                        kotlin.jvm.internal.l.f("<this>", (q5.d) it3.next());
                        list = (List) iVarB.getValue();
                    }
                }
                return new i(h.f7562k, true);
                if (list == null || !list.isEmpty()) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        if (!AbstractC1707g.K((q5.d) it4.next())) {
                            hVar = h.f7564m;
                            break;
                        }
                    }
                    hVar = h.f7563l;
                } else {
                    hVar = h.f7563l;
                }
                return new i(hVar, list != upperBounds);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [O3.i, java.lang.Object] */
    public final ArrayList e(q5.d dVar) {
        A2.b bVar = this.f7589c;
        H4.t tVar = (H4.t) bVar.f112n.getValue();
        K4.a aVar = (K4.a) bVar.f110l;
        kotlin.jvm.internal.l.f("<this>", dVar);
        a aVar2 = new a(dVar, aVar.f4715q.b(tVar, ((AbstractC1586x) dVar).getAnnotations()), null);
        A4.j jVar = new A4.j(10, this);
        ArrayList arrayList = new ArrayList(1);
        a(aVar2, arrayList, jVar);
        return arrayList;
    }
}
