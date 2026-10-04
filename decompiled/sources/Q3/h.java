package Q3;

import P3.AbstractC0568i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h extends AbstractC0568i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7990k;

    /* renamed from: l, reason: collision with root package name */
    public final g f7991l;

    public /* synthetic */ h(g gVar, int i7) {
        this.f7990k = i7;
        this.f7991l = gVar;
    }

    @Override // P3.AbstractC0568i
    public final int a() {
        switch (this.f7990k) {
        }
        return this.f7991l.f7985s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f7990k) {
            case 0:
                l.f("element", (Map.Entry) obj);
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f7990k) {
            case 0:
                l.f("elements", collection);
                throw new UnsupportedOperationException();
            default:
                l.f("elements", collection);
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7990k) {
            case 0:
                this.f7991l.clear();
                break;
            default:
                this.f7991l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7990k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                l.f("element", entry);
                return this.f7991l.i(entry);
            default:
                return this.f7991l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f7990k) {
            case 0:
                l.f("elements", collection);
                return this.f7991l.h(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f7990k) {
        }
        return this.f7991l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7990k) {
            case 0:
                g gVar = this.f7991l;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f7991l;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7990k) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    l.f("element", entry);
                    g gVar = this.f7991l;
                    gVar.getClass();
                    gVar.c();
                    int iK = gVar.k(entry.getKey());
                    if (iK >= 0) {
                        Object[] objArr = gVar.f7978l;
                        l.c(objArr);
                        if (l.a(objArr[iK], entry.getValue())) {
                            gVar.q(iK);
                            break;
                        }
                    }
                }
                break;
            default:
                g gVar2 = this.f7991l;
                gVar2.c();
                int iK2 = gVar2.k(obj);
                if (iK2 >= 0) {
                    gVar2.q(iK2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f7990k) {
            case 0:
                l.f("elements", collection);
                this.f7991l.c();
                break;
            default:
                l.f("elements", collection);
                this.f7991l.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f7990k) {
            case 0:
                l.f("elements", collection);
                this.f7991l.c();
                break;
            default:
                l.f("elements", collection);
                this.f7991l.c();
                break;
        }
        return super.retainAll(collection);
    }
}
