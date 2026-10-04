package l5;

import P3.y;
import R4.C0580k;
import f1.AbstractC0870c;
import io.ktor.http.ContentDisposition;
import j5.C1354i;
import j5.C1356k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m5.C1520i;
import m5.C1521j;
import m5.C1523l;
import n5.AbstractC1586x;
import o5.C1706f;
import o5.C1712l;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;

/* renamed from: l5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1455h extends AbstractC1463p {

    /* renamed from: g, reason: collision with root package name */
    public final C1706f f12775g;

    /* renamed from: h, reason: collision with root package name */
    public final C1520i f12776h;

    /* renamed from: i, reason: collision with root package name */
    public final C1520i f12777i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1456i f12778j;

    public C1455h(C1456i c1456i, C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        this.f12778j = c1456i;
        C1356k c1356k = c1456i.f12792v;
        C0580k c0580k = c1456i.f12785o;
        List list = c0580k.f8529A;
        kotlin.jvm.internal.l.e("getFunctionList(...)", list);
        List list2 = c0580k.f8530B;
        kotlin.jvm.internal.l.e("getPropertyList(...)", list2);
        List list3 = c0580k.f8531C;
        kotlin.jvm.internal.l.e("getTypeAliasList(...)", list3);
        List list4 = c0580k.f8552u;
        kotlin.jvm.internal.l.e("getNestedClassNameList(...)", list4);
        T4.g gVar = c1456i.f12792v.f12439b;
        ArrayList arrayList = new ArrayList(P3.r.p(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0870c.U(gVar, ((Number) it.next()).intValue()));
        }
        super(c1356k, list, list2, list3, new C1452e(0, arrayList));
        this.f12775g = c1706f;
        C1354i c1354i = c1356k.a;
        C1523l c1523l = c1354i.a;
        C1453f c1453f = new C1453f(this, 0);
        c1523l.getClass();
        this.f12776h = new C1520i(c1523l, c1453f);
        C1523l c1523l2 = c1354i.a;
        C1453f c1453f2 = new C1453f(this, 1);
        c1523l2.getClass();
        this.f12777i = new C1520i(c1523l2, c1453f2);
    }

    @Override // l5.AbstractC1463p, g5.p, g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        s(eVar, cVar);
        return super.a(eVar, cVar);
    }

    @Override // l5.AbstractC1463p, g5.p, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        InterfaceC2099e interfaceC2099e;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        s(eVar, aVar);
        A2.b bVar = this.f12778j.f12796z;
        return (bVar == null || (interfaceC2099e = (InterfaceC2099e) ((C1521j) bVar.f111m).invoke(eVar)) == null) ? super.b(eVar, aVar) : interfaceC2099e;
    }

    @Override // g5.p, g5.q
    public final Collection e(g5.f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return (Collection) this.f12776h.invoke();
    }

    @Override // l5.AbstractC1463p, g5.p, g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        s(eVar, aVar);
        return super.f(eVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [P3.y] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // l5.AbstractC1463p
    public final void h(ArrayList arrayList, e4.k kVar) {
        ?? arrayList2;
        A2.b bVar = this.f12778j.f12796z;
        if (bVar != null) {
            Set<W4.e> setKeySet = ((LinkedHashMap) bVar.f110l).keySet();
            arrayList2 = new ArrayList();
            for (W4.e eVar : setKeySet) {
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
                InterfaceC2099e interfaceC2099e = (InterfaceC2099e) ((C1521j) bVar.f111m).invoke(eVar);
                if (interfaceC2099e != null) {
                    arrayList2.add(interfaceC2099e);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = y.f7779k;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // l5.AbstractC1463p
    public final void j(W4.e eVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f12777i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1586x) it.next()).k0().f(eVar, C4.c.f961m));
        }
        C1356k c1356k = this.f12815b;
        arrayList.addAll(c1356k.a.f12426n.b(eVar, this.f12778j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C1712l) c1356k.a.f12429q).f13812d.h(eVar, arrayList2, arrayList3, this.f12778j, new C1454g(arrayList, 0));
    }

    @Override // l5.AbstractC1463p
    public final void k(W4.e eVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f12777i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC1586x) it.next()).k0().a(eVar, C4.c.f961m));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C1712l) this.f12815b.a.f12429q).f13812d.h(eVar, arrayList2, arrayList3, this.f12778j, new C1454g(arrayList, 0));
    }

    @Override // l5.AbstractC1463p
    public final W4.b l(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return this.f12778j.f12788r.d(eVar);
    }

    @Override // l5.AbstractC1463p
    public final Set n() {
        List listI = this.f12778j.f12794x.g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            Set setG = ((AbstractC1586x) it.next()).k0().g();
            if (setG == null) {
                return null;
            }
            P3.v.e0(linkedHashSet, setG);
        }
        return linkedHashSet;
    }

    @Override // l5.AbstractC1463p
    public final Set o() {
        C1456i c1456i = this.f12778j;
        List listI = c1456i.f12794x.g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            P3.v.e0(linkedHashSet, ((AbstractC1586x) it.next()).k0().c());
        }
        linkedHashSet.addAll(this.f12815b.a.f12426n.c(c1456i));
        return linkedHashSet;
    }

    @Override // l5.AbstractC1463p
    public final Set p() {
        List listI = this.f12778j.f12794x.g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            P3.v.e0(linkedHashSet, ((AbstractC1586x) it.next()).k0().d());
        }
        return linkedHashSet;
    }

    @Override // l5.AbstractC1463p
    public final boolean r(C1466s c1466s) {
        return this.f12815b.a.f12427o.a(this.f12778j, c1466s);
    }

    public final void s(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        kotlin.jvm.internal.l.f("<this>", this.f12815b.a.f12421i);
        kotlin.jvm.internal.l.f("scopeOwner", this.f12778j);
    }
}
