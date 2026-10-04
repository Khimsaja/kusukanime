package F5;

import P3.AbstractC0567h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends AbstractC0567h {

    /* renamed from: k, reason: collision with root package name */
    public d f2520k;

    /* renamed from: l, reason: collision with root package name */
    public A.e f2521l;

    /* renamed from: m, reason: collision with root package name */
    public p f2522m;

    /* renamed from: n, reason: collision with root package name */
    public Object f2523n;

    /* renamed from: o, reason: collision with root package name */
    public int f2524o;

    /* renamed from: p, reason: collision with root package name */
    public int f2525p;

    public f(d dVar) {
        kotlin.jvm.internal.l.f("map", dVar);
        this.f2520k = dVar;
        this.f2521l = new A.e(7);
        this.f2522m = dVar.f2514k;
        this.f2525p = dVar.c();
    }

    @Override // P3.AbstractC0567h
    public final Set a() {
        return new h(0, this);
    }

    @Override // P3.AbstractC0567h
    public final Set b() {
        return new h(1, this);
    }

    @Override // P3.AbstractC0567h
    public final int c() {
        return this.f2525p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p pVar = p.f2543e;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", pVar);
        i(pVar);
        j(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f2522m.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // P3.AbstractC0567h
    public final Collection e() {
        return new k(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (c() != map.size()) {
            return false;
        }
        if (map instanceof d) {
            return this.f2522m.g(((d) obj).f2514k, c.f2510n);
        }
        if (map instanceof f) {
            return this.f2522m.g(((f) obj).f2522m, c.f2511o);
        }
        kotlin.jvm.internal.l.f("otherMap", map);
        if (size() != map.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                kotlin.jvm.internal.l.f("element", entry);
                V v5 = get(entry.getKey());
                if (!(v5 != 0 ? v5.equals(entry.getValue()) : entry.getValue() == null && containsKey(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.f2522m.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final d h() {
        d dVar = this.f2520k;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this.f2522m, c());
        this.f2520k = dVar2;
        this.f2521l = new A.e(7);
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final void i(p pVar) {
        kotlin.jvm.internal.l.f("value", pVar);
        if (pVar != this.f2522m) {
            this.f2522m = pVar;
            this.f2520k = null;
        }
    }

    public final void j(int i7) {
        this.f2525p = i7;
        this.f2524o++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f2523n = null;
        i(this.f2522m.m(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.f2523n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        kotlin.jvm.internal.l.f("from", map);
        if (map.isEmpty()) {
            return;
        }
        d dVarH = null;
        d dVar = map instanceof d ? (d) map : null;
        if (dVar == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                dVarH = fVar.h();
            }
        } else {
            dVarH = dVar;
        }
        if (dVarH == null) {
            super.putAll(map);
            return;
        }
        G5.a aVar = new G5.a();
        aVar.a = 0;
        int iC = c();
        p pVar = this.f2522m;
        p pVar2 = dVarH.f2514k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", pVar2);
        i(pVar.n(pVar2, 0, aVar, this));
        int iC2 = (dVarH.c() + iC) - aVar.a;
        if (iC != iC2) {
            j(iC2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        p pVar = p.f2543e;
        this.f2523n = null;
        p pVarO = this.f2522m.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (pVarO == null) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", pVar);
        } else {
            pVar = pVarO;
        }
        i(pVar);
        return this.f2523n;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        p pVar = p.f2543e;
        int iC = c();
        p pVarP = this.f2522m.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (pVarP == null) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", pVar);
        } else {
            pVar = pVarP;
        }
        i(pVar);
        return iC != c();
    }
}
