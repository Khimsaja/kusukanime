package W;

import F5.k;
import O.AbstractC0505m0;
import O.U0;
import P3.AbstractC0567h;
import T.h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends AbstractC0567h {

    /* renamed from: k, reason: collision with root package name */
    public V.b f9505k = new V.b();

    /* renamed from: l, reason: collision with root package name */
    public h f9506l;

    /* renamed from: m, reason: collision with root package name */
    public Object f9507m;

    /* renamed from: n, reason: collision with root package name */
    public int f9508n;

    /* renamed from: o, reason: collision with root package name */
    public int f9509o;

    /* renamed from: p, reason: collision with root package name */
    public d f9510p;

    public c(d dVar) {
        this.f9506l = dVar.f8818k;
        this.f9509o = dVar.f8819l;
        this.f9510p = dVar;
    }

    @Override // P3.AbstractC0567h
    public final Set a() {
        return new T.d(0, this);
    }

    @Override // P3.AbstractC0567h
    public final Set b() {
        return new T.d(1, this);
    }

    @Override // P3.AbstractC0567h
    public final int c() {
        return this.f9509o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f9506l = h.f8828e;
        m(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0505m0) {
            return i((AbstractC0505m0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof U0) {
            return super.containsValue((U0) obj);
        }
        return false;
    }

    @Override // P3.AbstractC0567h
    public final Collection e() {
        return new k(2, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0505m0) {
            return (U0) j((AbstractC0505m0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0505m0) ? obj2 : (U0) super.getOrDefault((AbstractC0505m0) obj, (U0) obj2);
    }

    public final d h() {
        h hVar = this.f9506l;
        d dVar = this.f9510p;
        if (hVar != dVar.f8818k) {
            this.f9505k = new V.b();
            dVar = new d(this.f9506l, c());
        }
        this.f9510p = dVar;
        return dVar;
    }

    public final boolean i(Object obj) {
        return this.f9506l.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object j(Object obj) {
        return this.f9506l.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object k(Object obj) {
        this.f9507m = null;
        h hVarN = this.f9506l.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (hVarN == null) {
            hVarN = h.f8828e;
        }
        this.f9506l = hVarN;
        return this.f9507m;
    }

    public final void m(int i7) {
        this.f9509o = i7;
        this.f9508n++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f9507m = null;
        this.f9506l = this.f9506l.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f9507m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T.b] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        d dVarH = null;
        d dVar = map instanceof T.b ? (T.b) map : null;
        if (dVar == null) {
            c cVar = map instanceof c ? (c) map : null;
            if (cVar != null) {
                dVarH = cVar.h();
            }
        } else {
            dVarH = dVar;
        }
        if (dVarH == null) {
            super.putAll(map);
            return;
        }
        V.a aVar = new V.a();
        aVar.a = 0;
        int i7 = this.f9509o;
        h hVar = this.f9506l;
        h hVar2 = dVarH.f8818k;
        l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", hVar2);
        this.f9506l = hVar.m(hVar2, 0, aVar, this);
        int i8 = (dVarH.f8819l + i7) - aVar.a;
        if (i7 != i8) {
            m(i8);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        h hVarO = this.f9506l.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (hVarO == null) {
            hVarO = h.f8828e;
        }
        this.f9506l = hVarO;
        return iC != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0505m0) {
            return (U0) k((AbstractC0505m0) obj);
        }
        return null;
    }
}
