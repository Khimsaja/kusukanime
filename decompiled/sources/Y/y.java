package Y;

import O.C0486d;
import P3.D;
import P3.G;
import f4.InterfaceC0883c;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class y implements List, InterfaceC0883c {

    /* renamed from: k, reason: collision with root package name */
    public final r f10037k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10038l;

    /* renamed from: m, reason: collision with root package name */
    public int f10039m;

    /* renamed from: n, reason: collision with root package name */
    public int f10040n;

    public y(r rVar, int i7, int i8) {
        this.f10037k = rVar;
        this.f10038l = i7;
        this.f10039m = rVar.o();
        this.f10040n = i8 - i7;
    }

    public final void a() {
        if (this.f10037k.o() != this.f10039m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i7 = this.f10038l + this.f10040n;
        r rVar = this.f10037k;
        rVar.add(i7, obj);
        this.f10040n++;
        this.f10039m = rVar.o();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f10040n, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7;
        S.b bVar;
        h hVarK;
        boolean z7;
        if (this.f10040n > 0) {
            a();
            r rVar = this.f10037k;
            int i8 = this.f10038l;
            int i9 = this.f10040n + i8;
            do {
                Object obj = s.a;
                synchronized (obj) {
                    q qVar = rVar.f10015k;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                    q qVar2 = (q) o.i(qVar);
                    i7 = qVar2.f10013d;
                    bVar = qVar2.f10012c;
                }
                kotlin.jvm.internal.l.c(bVar);
                S.e eVarO = bVar.o();
                eVarO.subList(i8, i9).clear();
                S.b bVarJ = eVarO.j();
                if (kotlin.jvm.internal.l.a(bVarJ, bVar)) {
                    break;
                }
                q qVar3 = rVar.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
                synchronized (o.f10002b) {
                    hVarK = o.k();
                    q qVar4 = (q) o.w(qVar3, rVar, hVarK);
                    synchronized (obj) {
                        int i10 = qVar4.f10013d;
                        if (i10 == i7) {
                            qVar4.f10012c = bVarJ;
                            qVar4.f10013d = i10 + 1;
                            z7 = true;
                            qVar4.f10014e++;
                        } else {
                            z7 = false;
                        }
                    }
                }
                o.n(hVarK, rVar);
            } while (!z7);
            this.f10040n = 0;
            this.f10039m = this.f10037k.o();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a();
        s.a(i7, this.f10040n);
        return this.f10037k.get(this.f10038l + i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i7 = this.f10040n;
        int i8 = this.f10038l;
        Iterator it = e3.c.L(i8, i7 + i8).iterator();
        while (it.hasNext()) {
            int iA = ((D) it).a();
            if (kotlin.jvm.internal.l.a(obj, this.f10037k.get(iA))) {
                return iA - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f10040n == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i7 = this.f10040n;
        int i8 = this.f10038l;
        for (int i9 = (i7 + i8) - 1; i9 >= i8; i9--) {
            if (kotlin.jvm.internal.l.a(obj, this.f10037k.get(i9))) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z7 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z7) {
                    z7 = true;
                }
            }
            return z7;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7;
        S.b bVar;
        h hVarK;
        boolean z7;
        a();
        r rVar = this.f10037k;
        int i8 = this.f10038l;
        int i9 = this.f10040n + i8;
        int size = rVar.size();
        do {
            Object obj = s.a;
            synchronized (obj) {
                q qVar = rVar.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i7 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.e eVarO = bVar.o();
            eVarO.subList(i8, i9).retainAll(collection);
            S.b bVarJ = eVarO.j();
            if (kotlin.jvm.internal.l.a(bVarJ, bVar)) {
                break;
            }
            q qVar3 = rVar.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, rVar, hVarK);
                synchronized (obj) {
                    int i10 = qVar4.f10013d;
                    if (i10 == i7) {
                        qVar4.f10012c = bVarJ;
                        qVar4.f10013d = i10 + 1;
                        qVar4.f10014e++;
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
            }
            o.n(hVarK, rVar);
        } while (!z7);
        int size2 = size - rVar.size();
        if (size2 > 0) {
            this.f10039m = this.f10037k.o();
            this.f10040n -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        s.a(i7, this.f10040n);
        a();
        int i8 = i7 + this.f10038l;
        r rVar = this.f10037k;
        Object obj2 = rVar.set(i8, obj);
        this.f10039m = rVar.o();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f10040n;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        if (!(i7 >= 0 && i7 <= i8 && i8 <= this.f10040n)) {
            C0486d.T("fromIndex or toIndex are out of bounds");
            throw null;
        }
        a();
        int i9 = this.f10038l;
        return new y(this.f10037k, i7 + i9, i8 + i9);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        a();
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.f12718k = i7 - 1;
        return new G(vVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        a();
        int i8 = i7 + this.f10038l;
        r rVar = this.f10037k;
        boolean zAddAll = rVar.addAll(i8, collection);
        if (zAddAll) {
            this.f10040n = collection.size() + this.f10040n;
            this.f10039m = rVar.o();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        a();
        int i8 = this.f10038l + i7;
        r rVar = this.f10037k;
        Object objRemove = rVar.remove(i8);
        this.f10040n--;
        this.f10039m = rVar.o();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        a();
        int i8 = this.f10038l + i7;
        r rVar = this.f10037k;
        rVar.add(i8, obj);
        this.f10040n++;
        this.f10039m = rVar.o();
    }
}
