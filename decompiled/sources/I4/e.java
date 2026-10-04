package I4;

import A4.u;
import O3.l;
import P3.A;
import P3.E;
import P3.r;
import P3.v;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import r4.AbstractC1886o;
import v4.m;
import v4.n;

/* loaded from: classes.dex */
public abstract class e {
    public static final Object a = E.n0(new l("PACKAGE", EnumSet.noneOf(n.class)), new l("TYPE", EnumSet.of(n.f16675m, n.f16687y)), new l("ANNOTATION_TYPE", EnumSet.of(n.f16676n)), new l("TYPE_PARAMETER", EnumSet.of(n.f16677o)), new l("FIELD", EnumSet.of(n.f16679q)), new l("LOCAL_VARIABLE", EnumSet.of(n.f16680r)), new l("PARAMETER", EnumSet.of(n.f16681s)), new l("CONSTRUCTOR", EnumSet.of(n.f16682t)), new l("METHOD", EnumSet.of(n.f16683u, n.f16684v, n.f16685w)), new l("TYPE_USE", EnumSet.of(n.f16686x)));

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4057b = E.n0(new l("RUNTIME", m.f16662k), new l("CLASS", m.f16663l), new l("SOURCE", m.f16664m));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static b5.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof u) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(W4.e.e(((u) it.next()).f235b.name()).b());
            if (iterable == null) {
                iterable = A.f7737k;
            }
            v.e0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(r.p(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            n nVar = (n) it2.next();
            W4.c cVar = AbstractC1886o.f15013u;
            kotlin.jvm.internal.l.f("topLevelFqName", cVar);
            arrayList3.add(new b5.i(new W4.b(cVar.b(), cVar.a.g()), W4.e.e(nVar.name())));
        }
        return new b5.b(d.f4056k, arrayList3);
    }
}
