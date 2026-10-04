package F5;

import f4.InterfaceC0882b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends AbstractCollection implements Collection, InterfaceC0882b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2534k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2535l;

    public /* synthetic */ k(int i7, Object obj) {
        this.f2534k = i7;
        this.f2535l = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2534k) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f2534k) {
            case 1:
                kotlin.jvm.internal.l.f("elements", collection);
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f2534k) {
            case 0:
                ((f) this.f2535l).clear();
                break;
            case 1:
                ((Q3.g) this.f2535l).clear();
                break;
            default:
                ((W.c) this.f2535l).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2534k) {
            case 0:
                return ((f) this.f2535l).containsValue(obj);
            case 1:
                return ((Q3.g) this.f2535l).containsValue(obj);
            default:
                return ((W.c) this.f2535l).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2534k) {
            case 1:
                return ((Q3.g) this.f2535l).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2534k) {
            case 0:
                f fVar = (f) this.f2535l;
                kotlin.jvm.internal.l.f("builder", fVar);
                q[] qVarArr = new q[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    qVarArr[i7] = new r(2);
                }
                return new j(fVar, qVarArr);
            case 1:
                Q3.g gVar = (Q3.g) this.f2535l;
                gVar.getClass();
                return new Q3.d(gVar, 2);
            default:
                q[] qVarArr2 = new q[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    qVarArr2[i8] = new T.i(2);
                }
                return new T.e((W.c) this.f2535l, qVarArr2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f2534k) {
            case 1:
                Q3.g gVar = (Q3.g) this.f2535l;
                gVar.c();
                int iM = gVar.m(obj);
                if (iM < 0) {
                    return false;
                }
                gVar.q(iM);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f2534k) {
            case 1:
                kotlin.jvm.internal.l.f("elements", collection);
                ((Q3.g) this.f2535l).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f2534k) {
            case 1:
                kotlin.jvm.internal.l.f("elements", collection);
                ((Q3.g) this.f2535l).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f2534k) {
            case 0:
                return ((f) this.f2535l).c();
            case 1:
                return ((Q3.g) this.f2535l).f7985s;
            default:
                return ((W.c) this.f2535l).c();
        }
    }

    public k(f fVar) {
        this.f2534k = 0;
        kotlin.jvm.internal.l.f("builder", fVar);
        this.f2535l = fVar;
    }
}
