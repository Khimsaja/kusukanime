package l5;

import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import io.ktor.http.ContentDisposition;
import j5.C1354i;
import j5.C1356k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.InterfaceC1443v;
import m5.C1519h;
import m5.C1520i;
import m5.C1523l;
import u4.InterfaceC2102h;
import u4.P;

/* renamed from: l5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1463p extends g5.p {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f12814f;

    /* renamed from: b, reason: collision with root package name */
    public final C1356k f12815b;

    /* renamed from: c, reason: collision with root package name */
    public final C1462o f12816c;

    /* renamed from: d, reason: collision with root package name */
    public final C1520i f12817d;

    /* renamed from: e, reason: collision with root package name */
    public final C1519h f12818e;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(AbstractC1463p.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        z zVar = y.a;
        f12814f = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(AbstractC1463p.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, zVar)};
    }

    public AbstractC1463p(C1356k c1356k, List list, List list2, List list3, InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("c", c1356k);
        kotlin.jvm.internal.l.f("functionList", list);
        kotlin.jvm.internal.l.f("propertyList", list2);
        kotlin.jvm.internal.l.f("typeAliasList", list3);
        this.f12815b = c1356k;
        C1354i c1354i = c1356k.a;
        c1354i.f12415c.getClass();
        this.f12816c = new C1462o(this, list, list2, list3);
        C1523l c1523l = c1354i.a;
        g5.j jVar = new g5.j(interfaceC0821a, 1);
        c1523l.getClass();
        this.f12817d = new C1520i(c1523l, jVar);
        H4.u uVar = new H4.u(12, this);
        c1523l.getClass();
        this.f12818e = new C1519h(c1523l, uVar);
    }

    @Override // g5.p, g5.o
    public Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return this.f12816c.b(eVar, cVar);
    }

    @Override // g5.p, g5.q
    public InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        if (q(eVar)) {
            return this.f12815b.a.b(l(eVar));
        }
        C1462o c1462o = this.f12816c;
        if (!c1462o.f12807c.keySet().contains(eVar)) {
            return null;
        }
        c1462o.getClass();
        return (P) c1462o.f12810f.invoke(eVar);
    }

    @Override // g5.p, g5.o
    public final Set c() {
        return (Set) AbstractC0832b.u(this.f12816c.f12811g, C1462o.f12805j[0]);
    }

    @Override // g5.p, g5.o
    public final Set d() {
        return (Set) AbstractC0832b.u(this.f12816c.f12812h, C1462o.f12805j[1]);
    }

    @Override // g5.p, g5.o
    public Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return this.f12816c.a(eVar, aVar);
    }

    @Override // g5.p, g5.o
    public final Set g() {
        C1519h c1519h = this.f12818e;
        InterfaceC1443v interfaceC1443v = f12814f[1];
        kotlin.jvm.internal.l.f("<this>", c1519h);
        kotlin.jvm.internal.l.f("p", interfaceC1443v);
        return (Set) c1519h.invoke();
    }

    public abstract void h(ArrayList arrayList, e4.k kVar);

    public final List i(g5.f fVar, e4.k kVar) {
        C4.c cVar = C4.c.f962n;
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        ArrayList arrayList = new ArrayList(0);
        if (fVar.a(g5.f.f11729f)) {
            h(arrayList, kVar);
        }
        C1462o c1462o = this.f12816c;
        c1462o.getClass();
        boolean zA = fVar.a(g5.f.f11733j);
        Z4.h hVar = Z4.h.f10268l;
        if (zA) {
            Set<W4.e> set = (Set) AbstractC0832b.u(c1462o.f12812h, C1462o.f12805j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (W4.e eVar : set) {
                if (((Boolean) kVar.invoke(eVar)).booleanValue()) {
                    arrayList2.addAll(c1462o.b(eVar, cVar));
                }
            }
            P3.u.d0(arrayList2, hVar);
            arrayList.addAll(arrayList2);
        }
        if (fVar.a(g5.f.f11732i)) {
            Set<W4.e> set2 = (Set) AbstractC0832b.u(c1462o.f12811g, C1462o.f12805j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (W4.e eVar2 : set2) {
                if (((Boolean) kVar.invoke(eVar2)).booleanValue()) {
                    arrayList3.addAll(c1462o.a(eVar2, cVar));
                }
            }
            P3.u.d0(arrayList3, hVar);
            arrayList.addAll(arrayList3);
        }
        if (fVar.a(g5.f.f11735l)) {
            for (W4.e eVar3 : m()) {
                if (((Boolean) kVar.invoke(eVar3)).booleanValue()) {
                    w5.k.a(arrayList, this.f12815b.a.b(l(eVar3)));
                }
            }
        }
        if (fVar.a(g5.f.f11730g)) {
            for (Object obj : c1462o.f12807c.keySet()) {
                if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                    c1462o.getClass();
                    kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, obj);
                    w5.k.a(arrayList, (P) c1462o.f12810f.invoke(obj));
                }
            }
        }
        return w5.k.d(arrayList);
    }

    public void j(W4.e eVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
    }

    public void k(W4.e eVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
    }

    public abstract W4.b l(W4.e eVar);

    public final Set m() {
        return (Set) AbstractC0832b.u(this.f12817d, f12814f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return m().contains(eVar);
    }

    public boolean r(C1466s c1466s) {
        return true;
    }
}
