package E1;

import j3.AbstractC1331q;
import j3.g0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements Map {

    /* renamed from: k, reason: collision with root package name */
    public final Map f1907k;

    public o(Map map) {
        this.f1907k = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f1907k.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f1907k.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((g0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC1331q.f(this.f1907k.entrySet(), new n(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC1331q.d(obj, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f1907k.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1331q.h(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f1907k;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC1331q.f(this.f1907k.keySet(), new n(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f1907k.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f1907k.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f1907k.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f1907k;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f1907k.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f1907k.values();
    }
}
