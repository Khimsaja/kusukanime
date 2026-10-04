package j3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: j3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1319e extends i0 {

    /* renamed from: k, reason: collision with root package name */
    public final Map f12344k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f12345l;

    public C1319e(T t7, Map map) {
        this.f12345l = t7;
        map.getClass();
        this.f12344k = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C1317c c1317c = (C1317c) it;
            if (!c1317c.hasNext()) {
                return;
            }
            c1317c.next();
            c1317c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12344k.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f12344k.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f12344k.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12344k.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12344k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1317c(this, this.f12344k.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f12344k.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f12345l.f12299o -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12344k.size();
    }
}
