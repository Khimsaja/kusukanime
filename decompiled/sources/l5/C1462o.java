package l5;

import B1.G;
import O3.C;
import P3.F;
import R4.B;
import R4.J;
import R4.W;
import X4.AbstractC0605b;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import io.ktor.http.ContentDisposition;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.InterfaceC1443v;
import m5.C1516e;
import m5.C1520i;
import m5.C1521j;
import m5.C1523l;

/* renamed from: l5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462o {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f12805j;
    public final LinkedHashMap a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12806b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12807c;

    /* renamed from: d, reason: collision with root package name */
    public final C1516e f12808d;

    /* renamed from: e, reason: collision with root package name */
    public final C1516e f12809e;

    /* renamed from: f, reason: collision with root package name */
    public final C1521j f12810f;

    /* renamed from: g, reason: collision with root package name */
    public final C1520i f12811g;

    /* renamed from: h, reason: collision with root package name */
    public final C1520i f12812h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1463p f12813i;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(C1462o.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        z zVar = y.a;
        f12805j = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(C1462o.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, zVar)};
    }

    public C1462o(AbstractC1463p abstractC1463p, List list, List list2, List list3) {
        kotlin.jvm.internal.l.f("functionList", list);
        kotlin.jvm.internal.l.f("propertyList", list2);
        kotlin.jvm.internal.l.f("typeAliasList", list3);
        this.f12813i = abstractC1463p;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            W4.e eVarU = AbstractC0870c.U(abstractC1463p.f12815b.f12439b, ((B) ((AbstractC0605b) obj)).f8131p);
            Object arrayList = linkedHashMap.get(eVarU);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarU, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = c(linkedHashMap);
        AbstractC1463p abstractC1463p2 = this.f12813i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            W4.e eVarU2 = AbstractC0870c.U(abstractC1463p2.f12815b.f12439b, ((J) ((AbstractC0605b) obj2)).f8215p);
            Object arrayList2 = linkedHashMap2.get(eVarU2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(eVarU2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f12806b = c(linkedHashMap2);
        this.f12813i.f12815b.a.f12415c.getClass();
        AbstractC1463p abstractC1463p3 = this.f12813i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            W4.e eVarU3 = AbstractC0870c.U(abstractC1463p3.f12815b.f12439b, ((W) ((AbstractC0605b) obj3)).f8326o);
            Object arrayList3 = linkedHashMap3.get(eVarU3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(eVarU3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f12807c = c(linkedHashMap3);
        this.f12808d = this.f12813i.f12815b.a.a.b(new C1460m(this, 0));
        this.f12809e = this.f12813i.f12815b.a.a.b(new C1460m(this, 1));
        this.f12810f = this.f12813i.f12815b.a.a.c(new C1460m(this, 2));
        AbstractC1463p abstractC1463p4 = this.f12813i;
        C1523l c1523l = abstractC1463p4.f12815b.a.a;
        C1461n c1461n = new C1461n(this, abstractC1463p4, 0);
        c1523l.getClass();
        this.f12811g = new C1520i(c1523l, c1461n);
        AbstractC1463p abstractC1463p5 = this.f12813i;
        C1523l c1523l2 = abstractC1463p5.f12815b.a.a;
        C1461n c1461n2 = new C1461n(this, abstractC1463p5, 1);
        c1523l2.getClass();
        this.f12812h = new C1520i(c1523l2, c1461n2);
    }

    public static LinkedHashMap c(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.I(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC0605b> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(P3.r.p(iterable, 10));
            for (AbstractC0605b abstractC0605b : iterable) {
                int iC = abstractC0605b.c();
                int i7 = G.i(iC) + iC;
                if (i7 > 4096) {
                    i7 = 4096;
                }
                G gS = G.s(byteArrayOutputStream, i7);
                gS.K(iC);
                abstractC0605b.f(gS);
                gS.m();
                arrayList.add(C.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return !((Set) AbstractC0832b.u(this.f12811g, f12805j[0])).contains(eVar) ? P3.y.f7779k : (Collection) this.f12808d.invoke(eVar);
    }

    public final Collection b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return !((Set) AbstractC0832b.u(this.f12812h, f12805j[1])).contains(eVar) ? P3.y.f7779k : (Collection) this.f12809e.invoke(eVar);
    }
}
