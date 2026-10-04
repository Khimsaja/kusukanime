package Y;

import L.L1;
import O.C0486d;
import f4.InterfaceC0883c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class r implements v, List, RandomAccess, InterfaceC0883c {

    /* renamed from: k, reason: collision with root package name */
    public q f10015k;

    public r() {
        S.h hVar = S.h.f8701l;
        q qVar = new q(hVar);
        if (o.a.s() != null) {
            q qVar2 = new q(hVar);
            qVar2.a = 1;
            qVar.f10036b = qVar2;
        }
        this.f10015k = qVar;
    }

    @Override // Y.v
    public final x a() {
        return this.f10015k;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7;
        S.b bVar;
        boolean z7;
        h hVarK;
        do {
            Object obj2 = s.a;
            synchronized (obj2) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i7 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.b bVarJ = bVar.j(obj);
            z7 = false;
            if (bVarJ.equals(bVar)) {
                return false;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj2) {
                    int i8 = qVar4.f10013d;
                    if (i8 == i7) {
                        qVar4.f10012c = bVarJ;
                        qVar4.f10014e++;
                        qVar4.f10013d = i8 + 1;
                        z7 = true;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return p(new L1(i7, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        h hVarK;
        q qVar = this.f10015k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
        synchronized (o.f10002b) {
            hVarK = o.k();
            q qVar2 = (q) o.w(qVar, this, hVarK);
            synchronized (s.a) {
                qVar2.f10012c = S.h.f8701l;
                qVar2.f10013d++;
                qVar2.f10014e++;
            }
        }
        o.n(hVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return m().f10012c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return m().f10012c.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return m().f10012c.get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return m().f10012c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return m().f10012c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // Y.v
    public final void j(x xVar) {
        xVar.f10036b = this.f10015k;
        this.f10015k = (q) xVar;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return m().f10012c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new Q3.a(this, 0);
    }

    public final q m() {
        q qVar = this.f10015k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
        return (q) o.t(qVar, this);
    }

    public final int o() {
        q qVar = this.f10015k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
        return ((q) o.i(qVar)).f10014e;
    }

    public final boolean p(e4.k kVar) {
        int i7;
        S.b bVar;
        Object objInvoke;
        h hVarK;
        boolean z7;
        do {
            Object obj = s.a;
            synchronized (obj) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i7 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.e eVarO = bVar.o();
            objInvoke = kVar.invoke(eVarO);
            S.b bVarJ = eVarO.j();
            if (kotlin.jvm.internal.l.a(bVarJ, bVar)) {
                break;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj) {
                    int i8 = qVar4.f10013d;
                    if (i8 == i7) {
                        qVar4.f10012c = bVarJ;
                        qVar4.f10013d = i8 + 1;
                        z7 = true;
                        qVar4.f10014e++;
                    } else {
                        z7 = false;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        int i8;
        S.b bVar;
        h hVarK;
        boolean z7;
        Object obj = get(i7);
        do {
            Object obj2 = s.a;
            synchronized (obj2) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i8 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.b bVarQ = bVar.q(i7);
            if (bVarQ.equals(bVar)) {
                break;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj2) {
                    int i9 = qVar4.f10013d;
                    if (i9 == i8) {
                        qVar4.f10012c = bVarQ;
                        z7 = true;
                        qVar4.f10014e++;
                        qVar4.f10013d = i9 + 1;
                    } else {
                        z7 = false;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7;
        S.b bVar;
        boolean z7;
        h hVarK;
        do {
            Object obj = s.a;
            synchronized (obj) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i7 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.b bVarP = bVar.p(new S.a(0, collection));
            z7 = false;
            if (kotlin.jvm.internal.l.a(bVarP, bVar)) {
                return false;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj) {
                    int i8 = qVar4.f10013d;
                    if (i8 == i7) {
                        qVar4.f10012c = bVarP;
                        qVar4.f10014e++;
                        qVar4.f10013d = i8 + 1;
                        z7 = true;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return p(new S.a(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        int i8;
        S.b bVar;
        h hVarK;
        boolean z7;
        Object obj2 = get(i7);
        do {
            Object obj3 = s.a;
            synchronized (obj3) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i8 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.b bVarR = bVar.r(i7, obj);
            if (bVarR.equals(bVar)) {
                break;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj3) {
                    int i9 = qVar4.f10013d;
                    if (i9 == i8) {
                        qVar4.f10012c = bVarR;
                        qVar4.f10013d = i9 + 1;
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return m().f10012c.a();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        if (i7 >= 0 && i7 <= i8 && i8 <= size()) {
            return new y(this, i7, i8);
        }
        C0486d.T("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    public final String toString() {
        q qVar = this.f10015k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
        return "SnapshotStateList(value=" + ((q) o.i(qVar)).f10012c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i7;
        S.b bVar;
        boolean z7;
        h hVarK;
        do {
            Object obj = s.a;
            synchronized (obj) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i7 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.b bVarM = bVar.m(collection);
            z7 = false;
            if (kotlin.jvm.internal.l.a(bVarM, bVar)) {
                return false;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj) {
                    int i8 = qVar4.f10013d;
                    if (i8 == i7) {
                        qVar4.f10012c = bVarM;
                        qVar4.f10014e++;
                        qVar4.f10013d = i8 + 1;
                        z7 = true;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new Q3.a(this, i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        S.b bVar;
        h hVarK;
        boolean z7;
        do {
            Object obj2 = s.a;
            synchronized (obj2) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i8 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            S.b bVarH = bVar.h(i7, obj);
            if (bVarH.equals(bVar)) {
                return;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj2) {
                    int i9 = qVar4.f10013d;
                    if (i9 == i8) {
                        qVar4.f10012c = bVarH;
                        z7 = true;
                        qVar4.f10014e++;
                        qVar4.f10013d = i9 + 1;
                    } else {
                        z7 = false;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7;
        S.b bVar;
        boolean z7;
        h hVarK;
        do {
            Object obj2 = s.a;
            synchronized (obj2) {
                q qVar = this.f10015k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar);
                q qVar2 = (q) o.i(qVar);
                i7 = qVar2.f10013d;
                bVar = qVar2.f10012c;
            }
            kotlin.jvm.internal.l.c(bVar);
            int iIndexOf = bVar.indexOf(obj);
            S.b bVarQ = iIndexOf != -1 ? bVar.q(iIndexOf) : bVar;
            z7 = false;
            if (bVarQ.equals(bVar)) {
                return false;
            }
            q qVar3 = this.f10015k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", qVar3);
            synchronized (o.f10002b) {
                hVarK = o.k();
                q qVar4 = (q) o.w(qVar3, this, hVarK);
                synchronized (obj2) {
                    int i8 = qVar4.f10013d;
                    if (i8 == i7) {
                        qVar4.f10012c = bVarQ;
                        qVar4.f10014e++;
                        qVar4.f10013d = i8 + 1;
                        z7 = true;
                    }
                }
            }
            o.n(hVarK, this);
        } while (!z7);
        return true;
    }
}
