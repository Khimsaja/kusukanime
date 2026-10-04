package E4;

import B1.C0017d;
import P4.l;
import P4.m;
import R4.Z;
import T4.k;
import b5.q;
import b5.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import q4.AbstractC1857a;
import u4.InterfaceC2099e;
import u4.M;
import v4.C2155c;

/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: k, reason: collision with root package name */
    public final List f1940k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1941l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1942m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1943n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1944o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f1945p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f1946q;

    public h(T4.g gVar, T4.i iVar, k kVar, h hVar, List list) {
        kotlin.jvm.internal.l.f("strings", gVar);
        kotlin.jvm.internal.l.f("contextExtensions", list);
        this.f1941l = gVar;
        this.f1942m = iVar;
        this.f1943n = kVar;
        this.f1944o = hVar;
        this.f1940k = list;
        this.f1946q = new LinkedHashMap();
        F4.k.a.getClass();
        this.f1945p = F4.j.a();
    }

    public Integer a(int i7) {
        Integer num = (Integer) ((LinkedHashMap) this.f1946q).get(Integer.valueOf(i7));
        if (num != null) {
            return num;
        }
        h hVar = (h) this.f1944o;
        if (hVar != null) {
            return hVar.a(i7);
        }
        return null;
    }

    public h b(List list) {
        kotlin.jvm.internal.l.f("typeParameters", list);
        h hVar = new h((T4.g) this.f1941l, (T4.i) this.f1942m, (k) this.f1943n, this, this.f1940k);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z z7 = (Z) it.next();
            ((LinkedHashMap) hVar.f1946q).put(Integer.valueOf(z7.f8354o), Integer.valueOf(z7.f8353n));
        }
        return hVar;
    }

    @Override // P4.l, P4.m
    public void f() {
        HashMap map = (HashMap) this.f1942m;
        B0.b bVar = (B0.b) this.f1943n;
        bVar.getClass();
        W4.b bVar2 = (W4.b) this.f1945p;
        kotlin.jvm.internal.l.f("arguments", map);
        boolean zO = false;
        if (bVar2.equals(AbstractC1857a.f14744b)) {
            Object obj = map.get(W4.e.e("value"));
            s sVar = obj instanceof s ? (s) obj : null;
            if (sVar != null) {
                Object obj2 = sVar.a;
                q qVar = obj2 instanceof q ? (q) obj2 : null;
                if (qVar != null) {
                    zO = bVar.o(qVar.a.a);
                }
            }
        }
        if (zO || bVar.o(bVar2)) {
            return;
        }
        this.f1940k.add(new C2155c(((InterfaceC2099e) this.f1944o).g(), map, (M) this.f1946q));
    }

    @Override // P4.l
    public void g(W4.e eVar, b5.f fVar) {
        ((HashMap) this.f1942m).put(eVar, new s(new q(fVar)));
    }

    @Override // P4.l
    public void j(W4.e eVar, W4.b bVar, W4.e eVar2) {
        ((HashMap) this.f1942m).put(eVar, new b5.i(bVar, eVar2));
    }

    @Override // P4.l
    public void k(W4.e eVar, Object obj) {
        ((HashMap) this.f1942m).put(eVar, B0.b.c((B0.b) this.f1941l, eVar, obj));
    }

    @Override // P4.l
    public m l(W4.e eVar) {
        return new A2.b((B0.b) this.f1941l, eVar, this);
    }

    @Override // P4.l
    public l n(W4.b bVar, W4.e eVar) {
        ArrayList arrayList = new ArrayList();
        return new C0017d(((B0.b) this.f1941l).r(bVar, M.f16295i, arrayList), this, eVar, arrayList);
    }

    public h(B0.b bVar, InterfaceC2099e interfaceC2099e, W4.b bVar2, List list, M m7) {
        this.f1943n = bVar;
        this.f1944o = interfaceC2099e;
        this.f1945p = bVar2;
        this.f1940k = list;
        this.f1946q = m7;
        this.f1941l = bVar;
        this.f1942m = new HashMap();
    }
}
