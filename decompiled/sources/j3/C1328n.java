package j3;

import f6.AbstractC0905c;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: j3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328n extends AbstractCollection {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12365k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f12366l;

    public /* synthetic */ C1328n(int i7, Serializable serializable) {
        this.f12365k = i7;
        this.f12366l = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f12365k) {
            case 0:
                ((T) this.f12366l).b();
                break;
            case 1:
                ((C1334u) this.f12366l).clear();
                break;
            default:
                ((C1318d) this.f12366l).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f12365k) {
            case 0:
                Iterator it = ((C1328n) ((T) this.f12366l).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C1318d) this.f12366l).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f12365k) {
            case 2:
                return ((C1318d) this.f12366l).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f12365k) {
            case 0:
                return new C1315a((T) this.f12366l);
            case 1:
                C1334u c1334u = (C1334u) this.f12366l;
                Map mapB = c1334u.b();
                return mapB != null ? mapB.values().iterator() : new r(c1334u, 2);
            default:
                return new Q(((C1318d) this.f12366l).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f12365k) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C1318d c1318d = (C1318d) this.f12366l;
                    for (Map.Entry entry : c1318d.entrySet()) {
                        if (AbstractC0905c.l(obj, entry.getValue())) {
                            c1318d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f12365k) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C1318d c1318d = (C1318d) this.f12366l;
                    for (Map.Entry entry : c1318d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1318d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f12365k) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C1318d c1318d = (C1318d) this.f12366l;
                    for (Map.Entry entry : c1318d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c1318d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f12365k) {
            case 0:
                return ((T) this.f12366l).f12299o;
            case 1:
                return ((C1334u) this.f12366l).size();
            default:
                return ((C1318d) this.f12366l).f12335m.size();
        }
    }

    public C1328n(C1318d c1318d) {
        this.f12365k = 2;
        this.f12366l = c1318d;
    }
}
