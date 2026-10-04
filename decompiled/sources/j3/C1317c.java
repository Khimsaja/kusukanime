package j3;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1317c implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12322k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f12323l;

    /* renamed from: m, reason: collision with root package name */
    public Object f12324m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f12325n;

    public C1317c(C1326l c1326l) {
        this.f12325n = c1326l;
        Collection collection = c1326l.f12360l;
        this.f12324m = collection;
        this.f12323l = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C1326l c1326l = (C1326l) this.f12325n;
        c1326l.h();
        if (c1326l.f12360l != ((Collection) this.f12324m)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12322k) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f12323l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12322k) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f12323l.next();
                this.f12324m = (Collection) entry.getValue();
                return ((C1318d) this.f12325n).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f12323l.next();
                this.f12324m = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f12323l.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12322k) {
            case 0:
                if (!(((Collection) this.f12324m) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f12323l.remove();
                ((C1318d) this.f12325n).f12336n.f12299o -= ((Collection) this.f12324m).size();
                ((Collection) this.f12324m).clear();
                this.f12324m = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f12324m;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f12323l.remove();
                ((C1319e) this.f12325n).f12345l.f12299o -= collection.size();
                collection.clear();
                this.f12324m = null;
                return;
            default:
                this.f12323l.remove();
                C1326l c1326l = (C1326l) this.f12325n;
                T t7 = c1326l.f12363o;
                t7.f12299o--;
                c1326l.j();
                return;
        }
    }

    public C1317c(C1326l c1326l, ListIterator listIterator) {
        this.f12325n = c1326l;
        this.f12324m = c1326l.f12360l;
        this.f12323l = listIterator;
    }

    public C1317c(C1319e c1319e, Iterator it) {
        this.f12323l = it;
        this.f12325n = c1319e;
    }

    public C1317c(C1318d c1318d) {
        this.f12325n = c1318d;
        this.f12323l = c1318d.f12335m.entrySet().iterator();
    }
}
