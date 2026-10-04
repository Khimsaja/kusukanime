package x4;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import l5.C1454g;
import m5.C1516e;
import m5.C1520i;
import m5.C1523l;
import n5.AbstractC1569f;
import n5.AbstractC1586x;

/* renamed from: x4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2290q extends g5.p {

    /* renamed from: b, reason: collision with root package name */
    public final C1516e f17450b;

    /* renamed from: c, reason: collision with root package name */
    public final C1516e f17451c;

    /* renamed from: d, reason: collision with root package name */
    public final C1520i f17452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2291r f17453e;

    public C2290q(C2291r c2291r, C1523l c1523l) {
        if (c1523l == null) {
            h(0);
            throw null;
        }
        this.f17453e = c2291r;
        this.f17450b = c1523l.b(new C2289p(this, 0));
        int i7 = 1;
        this.f17451c = c1523l.b(new C2289p(this, i7));
        this.f17452d = new C1520i(c1523l, new C2280g(i7, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2290q.h(int):void");
    }

    @Override // g5.p, g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        if (eVar != null) {
            return (Collection) this.f17451c.invoke(eVar);
        }
        h(1);
        throw null;
    }

    @Override // g5.p, g5.o
    public final Set c() {
        Set set = (Set) this.f17453e.f17456s.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // g5.p, g5.o
    public final Set d() {
        Set set = (Set) this.f17453e.f17456s.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // g5.p, g5.q
    public final Collection e(g5.f fVar, e4.k kVar) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.f17452d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // g5.p, g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        if (eVar != null) {
            return (Collection) this.f17450b.invoke(eVar);
        }
        h(5);
        throw null;
    }

    @Override // g5.p, g5.o
    public final Set g() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    public final g5.o i() {
        g5.o oVarK0 = ((AbstractC1586x) ((AbstractC1569f) this.f17453e.v()).g().iterator().next()).k0();
        if (oVarK0 != null) {
            return oVarK0;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(W4.e eVar, Collection collection) {
        if (eVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Z4.k.f10274c.h(eVar, collection, Collections.EMPTY_SET, this.f17453e, new C1454g(linkedHashSet, 1));
        return linkedHashSet;
    }
}
