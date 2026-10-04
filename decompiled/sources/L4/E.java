package L4;

import H4.EnumC0247a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.W;
import n5.Y;
import n5.b0;
import u4.InterfaceC2106l;
import x4.AbstractC2276c;

/* loaded from: classes.dex */
public final class E extends AbstractC2276c {

    /* renamed from: u, reason: collision with root package name */
    public final A2.b f6053u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.D f6054v;

    /* JADX WARN: Illegal instructions before constructor call */
    public E(A2.b bVar, A4.D d4, int i7, InterfaceC2106l interfaceC2106l) {
        kotlin.jvm.internal.l.f("javaTypeParameter", d4);
        K4.a aVar = (K4.a) bVar.f110l;
        super(aVar.a, interfaceC2106l, new K4.c(bVar, d4, false), W4.e.e(d4.a.getName()), b0.f13390m, false, i7, aVar.f4711m);
        this.f6053u = bVar;
        this.f6054v = d4;
    }

    @Override // x4.AbstractC2282i
    public final List N0(List list) {
        O4.d dVar;
        AbstractC1586x abstractC1586x;
        AbstractC1586x abstractC1586xB;
        A2.b bVar = this.f6053u;
        O4.d dVar2 = ((K4.a) bVar.f110l).f4716r;
        dVar2.getClass();
        ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1586x abstractC1586x2 = (AbstractC1586x) it.next();
            O4.o oVar = O4.o.f7582n;
            kotlin.jvm.internal.l.f("<this>", abstractC1586x2);
            if (Y.c(abstractC1586x2, oVar, null)) {
                dVar = dVar2;
                abstractC1586x = abstractC1586x2;
            } else {
                dVar = dVar2;
                abstractC1586x = abstractC1586x2;
                abstractC1586xB = dVar.b(new O4.r(this, false, bVar, EnumC0247a.f3715p, false), abstractC1586x, P3.y.f7779k, null, false);
                if (abstractC1586xB == null) {
                }
                arrayList.add(abstractC1586xB);
                dVar2 = dVar;
            }
            abstractC1586xB = abstractC1586x;
            arrayList.add(abstractC1586xB);
            dVar2 = dVar;
        }
        return arrayList;
    }

    @Override // x4.AbstractC2282i
    public final List O0() {
        Type[] bounds = this.f6054v.a.getBounds();
        kotlin.jvm.internal.l.e("getBounds(...)", bounds);
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new A4.r(type));
        }
        A4.r rVar = (A4.r) P3.q.M0(arrayList);
        List list = arrayList;
        if (kotlin.jvm.internal.l.a(rVar != null ? rVar.a : null, Object.class)) {
            list = P3.y.f7779k;
        }
        boolean zIsEmpty = list.isEmpty();
        A2.b bVar = this.f6053u;
        if (zIsEmpty) {
            return P3.r.H(AbstractC1566c.f(((K4.a) bVar.f110l).f4713o.f17339n.e(), ((K4.a) bVar.f110l).f4713o.f17339n.o()));
        }
        ArrayList arrayList2 = new ArrayList(P3.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((B2.l) bVar.f113o).R((A4.r) it.next(), n6.d.f0(W.f13382l, false, this, 3)));
        }
        return arrayList2;
    }
}
