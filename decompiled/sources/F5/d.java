package F5;

import P3.AbstractC0565f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d extends AbstractC0565f implements D5.c {

    /* renamed from: m, reason: collision with root package name */
    public static final d f2513m = new d(p.f2543e, 0);

    /* renamed from: k, reason: collision with root package name */
    public final p f2514k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2515l;

    public d(p pVar, int i7) {
        kotlin.jvm.internal.l.f("node", pVar);
        this.f2514k = pVar;
        this.f2515l = i7;
    }

    @Override // P3.AbstractC0565f
    public final Set a() {
        return new l(this, 0);
    }

    @Override // P3.AbstractC0565f
    public final Set b() {
        return new l(this, 1);
    }

    @Override // P3.AbstractC0565f
    public final int c() {
        return this.f2515l;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f2514k.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // P3.AbstractC0565f
    public final Collection e() {
        return new n(this);
    }

    @Override // P3.AbstractC0565f, java.util.Map
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
        boolean z7 = map instanceof d;
        p pVar = this.f2514k;
        return z7 ? pVar.g(((d) obj).f2514k, c.f2508l) : map instanceof f ? pVar.g(((f) obj).f2522m, c.f2509m) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f2514k.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final d h(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        p pVar = this.f2514k;
        p pVarV = pVar.v(iHashCode, 0, obj);
        if (pVar == pVarV) {
            return this;
        }
        if (pVarV != null) {
            return new d(pVarV, this.f2515l - 1);
        }
        d dVar = f2513m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>", dVar);
        return dVar;
    }
}
