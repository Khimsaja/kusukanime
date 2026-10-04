package s4;

import P3.q;
import P3.r;
import P3.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n5.AbstractC1565b;
import n5.AbstractC1566c;
import n5.G;
import n5.I;
import r4.AbstractC1887p;
import u4.AbstractC2115v;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2118y;
import u4.N;
import u4.Q;
import v.c0;
import x5.AbstractC2300a;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2016b extends AbstractC1565b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f15818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2016b(c cVar) {
        super(cVar.f15821o);
        this.f15818c = cVar;
    }

    @Override // n5.AbstractC1569f
    public final Collection b() {
        List<W4.b> listI;
        Iterable iterableH;
        c cVar = this.f15818c;
        k kVar = cVar.f15823q;
        g gVar = g.f15830c;
        if (kotlin.jvm.internal.l.a(kVar, gVar)) {
            listI = r.H(c.f15819v);
        } else {
            boolean zA = kotlin.jvm.internal.l.a(kVar, h.f15831c);
            int i7 = cVar.f15824r;
            if (zA) {
                listI = r.I(c.f15820w, new W4.b(AbstractC1887p.f15028k, gVar.a(i7)));
            } else {
                j jVar = j.f15833c;
                if (kotlin.jvm.internal.l.a(kVar, jVar)) {
                    listI = r.H(c.f15819v);
                } else {
                    if (!kotlin.jvm.internal.l.a(kVar, i.f15832c)) {
                        int i8 = AbstractC2300a.a;
                        throw new IllegalStateException("should not be called");
                    }
                    listI = r.I(c.f15820w, new W4.b(AbstractC1887p.f15023f, jVar.a(i7)));
                }
            }
        }
        InterfaceC2118y interfaceC2118yK = cVar.f15822p.k();
        ArrayList arrayList = new ArrayList(r.p(listI, 10));
        for (W4.b bVar : listI) {
            InterfaceC2099e interfaceC2099eD = AbstractC2115v.d(interfaceC2118yK, bVar);
            if (interfaceC2099eD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            int size = interfaceC2099eD.v().getParameters().size();
            List list = cVar.f15827u;
            kotlin.jvm.internal.l.f("<this>", list);
            if (size < 0) {
                throw new IllegalArgumentException(c0.a(size, "Requested element count ", " is less than zero.").toString());
            }
            if (size == 0) {
                iterableH = y.f7779k;
            } else {
                int size2 = list.size();
                if (size >= size2) {
                    iterableH = q.S0(list);
                } else if (size == 1) {
                    iterableH = r.H(q.A0(list));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list instanceof RandomAccess) {
                        for (int i9 = size2 - size; i9 < size2; i9++) {
                            arrayList2.add(list.get(i9));
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableH = arrayList2;
                }
            }
            ArrayList arrayList3 = new ArrayList(r.p(iterableH, 10));
            Iterator it = iterableH.iterator();
            while (it.hasNext()) {
                arrayList3.add(new G(((Q) it.next()).g()));
            }
            I.f13362l.getClass();
            arrayList.add(AbstractC1566c.t(I.f13363m, interfaceC2099eD, arrayList3));
        }
        return q.S0(arrayList);
    }

    @Override // n5.M
    public final boolean e() {
        return true;
    }

    @Override // n5.AbstractC1565b, n5.M
    public final InterfaceC2102h f() {
        return this.f15818c;
    }

    @Override // n5.M
    public final List getParameters() {
        return this.f15818c.f15827u;
    }

    @Override // n5.AbstractC1569f
    public final N h() {
        return N.f16297m;
    }

    @Override // n5.AbstractC1565b
    /* renamed from: m */
    public final InterfaceC2099e f() {
        return this.f15818c;
    }

    public final String toString() {
        return this.f15818c.toString();
    }
}
