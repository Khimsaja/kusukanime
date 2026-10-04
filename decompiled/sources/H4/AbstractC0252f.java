package H4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r4.AbstractC1886o;
import r4.AbstractC1887p;
import t4.C2053d;

/* renamed from: H4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0252f {
    public static final Object a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f3730b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f3731c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f3732d;

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    static {
        W4.d dVar = AbstractC1886o.f15002j;
        O3.l lVar = new O3.l(dVar.a(W4.e.e(ContentDisposition.Parameters.Name)).i(), AbstractC1887p.f15021d);
        O3.l lVar2 = new O3.l(dVar.a(W4.e.e("ordinal")).i(), W4.e.e("ordinal"));
        O3.l lVar3 = new O3.l(P3.F.e(AbstractC1886o.f14965C, ContentDisposition.Parameters.Size), W4.e.e(ContentDisposition.Parameters.Size));
        W4.c cVar = AbstractC1886o.f14969G;
        Map mapN0 = P3.E.n0(lVar, lVar2, lVar3, new O3.l(P3.F.e(cVar, ContentDisposition.Parameters.Size), W4.e.e(ContentDisposition.Parameters.Size)), new O3.l(AbstractC1886o.f14994e.a(W4.e.e("length")).i(), W4.e.e("length")), new O3.l(P3.F.e(cVar, "keys"), W4.e.e("keySet")), new O3.l(P3.F.e(cVar, "values"), W4.e.e("values")), new O3.l(P3.F.e(cVar, "entries"), W4.e.e("entrySet")), new O3.l(P3.F.e(AbstractC1886o.f14987a0, ContentDisposition.Parameters.Size), W4.e.e("length")), new O3.l(P3.F.e(AbstractC1886o.f14989b0, ContentDisposition.Parameters.Size), W4.e.e("length")), new O3.l(P3.F.e(AbstractC1886o.f14991c0, ContentDisposition.Parameters.Size), W4.e.e("length")));
        a = mapN0;
        Set<Map.Entry> setEntrySet = mapN0.entrySet();
        ArrayList arrayList = new ArrayList(P3.r.p(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new O3.l(((W4.c) entry.getKey()).a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O3.l lVar4 = (O3.l) it.next();
            W4.e eVar = (W4.e) lVar4.f7529l;
            Object arrayList2 = linkedHashMap.get(eVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(eVar, arrayList2);
            }
            ((List) arrayList2).add((W4.e) lVar4.f7528k);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P3.F.I(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), P3.q.n0((Iterable) entry2.getValue()));
        }
        f3730b = linkedHashMap2;
        ?? r02 = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r02.entrySet()) {
            String str = C2053d.a;
            W4.b bVarF = C2053d.f(((W4.c) entry3.getKey()).b().a);
            kotlin.jvm.internal.l.c(bVarF);
            linkedHashSet.add(bVarF.a().a((W4.e) entry3.getValue()));
        }
        Set setKeySet = a.keySet();
        f3731c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(P3.r.p(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((W4.c) it2.next()).a.g());
        }
        f3732d = P3.q.X0(arrayList3);
    }
}
