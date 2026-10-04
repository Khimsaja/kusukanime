package j3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1318d extends AbstractMap {

    /* renamed from: k, reason: collision with root package name */
    public transient C1316b f12333k;

    /* renamed from: l, reason: collision with root package name */
    public transient C1328n f12334l;

    /* renamed from: m, reason: collision with root package name */
    public final transient Map f12335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f12336n;

    public C1318d(T t7, Map map) {
        this.f12336n = t7;
        this.f12335m = map;
    }

    public final C a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        T t7 = this.f12336n;
        List list = (List) collection;
        return new C(key, list instanceof RandomAccess ? new C1322h(t7, key, list, null) : new C1326l(t7, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        T t7 = this.f12336n;
        if (this.f12335m == t7.f12298n) {
            t7.b();
            return;
        }
        C1317c c1317c = new C1317c(this);
        while (c1317c.hasNext()) {
            c1317c.next();
            c1317c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f12335m;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1316b c1316b = this.f12333k;
        if (c1316b != null) {
            return c1316b;
        }
        C1316b c1316b2 = new C1316b(this);
        this.f12333k = c1316b2;
        return c1316b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f12335m.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f12335m;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        T t7 = this.f12336n;
        List list = (List) collection;
        return list instanceof RandomAccess ? new C1322h(t7, obj, list, null) : new C1326l(t7, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f12335m.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        T t7 = this.f12336n;
        C1319e c1319e = t7.f12367k;
        if (c1319e != null) {
            return c1319e;
        }
        Map map = t7.f12298n;
        C1319e c1321g = map instanceof NavigableMap ? new C1321g(t7, (NavigableMap) map) : map instanceof SortedMap ? new C1324j(t7, (SortedMap) map) : new C1319e(t7, map);
        t7.f12367k = c1321g;
        return c1321g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f12335m.remove(obj);
        if (collection == null) {
            return null;
        }
        T t7 = this.f12336n;
        List list = (List) t7.f12300p.get();
        list.addAll(collection);
        t7.f12299o -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12335m.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f12335m.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1328n c1328n = this.f12334l;
        if (c1328n != null) {
            return c1328n;
        }
        C1328n c1328n2 = new C1328n(this);
        this.f12334l = c1328n2;
        return c1328n2;
    }
}
