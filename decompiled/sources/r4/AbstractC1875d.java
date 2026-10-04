package r4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: r4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1875d {
    public static final LinkedHashSet a;

    static {
        Set<EnumC1882k> set = EnumC1882k.f14943o;
        ArrayList arrayList = new ArrayList(P3.r.p(set, 10));
        for (EnumC1882k enumC1882k : set) {
            kotlin.jvm.internal.l.f("primitiveType", enumC1882k);
            arrayList.add(AbstractC1887p.f15028k.a(enumC1882k.f14953k));
        }
        ArrayList arrayListH0 = P3.q.H0(P3.q.H0(P3.q.H0(arrayList, AbstractC1886o.f14996f.i()), AbstractC1886o.f15000h.i()), AbstractC1886o.f15002j.i());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListH0.iterator();
        while (it.hasNext()) {
            W4.c cVar = (W4.c) it.next();
            kotlin.jvm.internal.l.f("topLevelFqName", cVar);
            linkedHashSet.add(new W4.b(cVar.b(), cVar.a.g()));
        }
        a = linkedHashSet;
    }
}
