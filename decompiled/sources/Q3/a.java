package Q3;

import Y.s;
import a0.p;
import f4.InterfaceC0881a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import y0.r;

/* loaded from: classes.dex */
public final class a implements ListIterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7954k;

    /* renamed from: l, reason: collision with root package name */
    public int f7955l;

    /* renamed from: m, reason: collision with root package name */
    public int f7956m;

    /* renamed from: n, reason: collision with root package name */
    public int f7957n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7958o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r rVar, int i7, int i8) {
        this(rVar, (i8 & 1) != 0 ? 0 : i7, 0, rVar.f17891n);
        this.f7954k = 3;
    }

    public void a() {
        if (((AbstractList) ((b) this.f7958o).f7963o).modCount != this.f7957n) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f7954k) {
            case 0:
                a();
                int i7 = this.f7955l;
                this.f7955l = i7 + 1;
                b bVar = (b) this.f7958o;
                bVar.add(i7, obj);
                this.f7956m = -1;
                this.f7957n = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                int i8 = this.f7955l;
                this.f7955l = i8 + 1;
                c cVar = (c) this.f7958o;
                cVar.add(i8, obj);
                this.f7956m = -1;
                this.f7957n = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                int i9 = this.f7955l + 1;
                Y.r rVar = (Y.r) this.f7958o;
                rVar.add(i9, obj);
                this.f7956m = -1;
                this.f7955l++;
                this.f7957n = rVar.o();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f7958o)).modCount != this.f7957n) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((Y.r) this.f7958o).o() != this.f7957n) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7954k) {
            case 0:
                return this.f7955l < ((b) this.f7958o).f7961m;
            case 1:
                return this.f7955l < ((c) this.f7958o).f7966l;
            case 2:
                return this.f7955l < ((Y.r) this.f7958o).size() - 1;
            default:
                return this.f7955l < this.f7957n;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f7954k) {
            case 0:
                if (this.f7955l > 0) {
                }
                break;
            case 1:
                if (this.f7955l > 0) {
                }
                break;
            case 2:
                if (this.f7955l >= 0) {
                }
                break;
            default:
                if (this.f7955l > this.f7956m) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f7954k) {
            case 0:
                a();
                int i7 = this.f7955l;
                b bVar = (b) this.f7958o;
                if (i7 >= bVar.f7961m) {
                    throw new NoSuchElementException();
                }
                this.f7955l = i7 + 1;
                this.f7956m = i7;
                return bVar.f7959k[bVar.f7960l + i7];
            case 1:
                b();
                int i8 = this.f7955l;
                c cVar = (c) this.f7958o;
                if (i8 >= cVar.f7966l) {
                    throw new NoSuchElementException();
                }
                this.f7955l = i8 + 1;
                this.f7956m = i8;
                return cVar.f7965k[i8];
            case 2:
                c();
                int i9 = this.f7955l + 1;
                this.f7956m = i9;
                Y.r rVar = (Y.r) this.f7958o;
                s.a(i9, rVar.size());
                Object obj = rVar.get(i9);
                this.f7955l = i9;
                return obj;
            default:
                Object[] objArr = ((r) this.f7958o).f17888k;
                int i10 = this.f7955l;
                this.f7955l = i10 + 1;
                Object obj2 = objArr[i10];
                l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj2);
                return (p) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f7954k) {
            case 0:
                return this.f7955l;
            case 1:
                return this.f7955l;
            case 2:
                return this.f7955l + 1;
            default:
                return this.f7955l - this.f7956m;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f7954k) {
            case 0:
                a();
                int i7 = this.f7955l;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i8 = i7 - 1;
                this.f7955l = i8;
                this.f7956m = i8;
                b bVar = (b) this.f7958o;
                return bVar.f7959k[bVar.f7960l + i8];
            case 1:
                b();
                int i9 = this.f7955l;
                if (i9 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f7955l = i10;
                this.f7956m = i10;
                return ((c) this.f7958o).f7965k[i10];
            case 2:
                c();
                int i11 = this.f7955l;
                Y.r rVar = (Y.r) this.f7958o;
                s.a(i11, rVar.size());
                int i12 = this.f7955l;
                this.f7956m = i12;
                this.f7955l--;
                return rVar.get(i12);
            default:
                Object[] objArr = ((r) this.f7958o).f17888k;
                int i13 = this.f7955l - 1;
                this.f7955l = i13;
                Object obj = objArr[i13];
                l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
                return (p) obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f7954k) {
            case 0:
                return this.f7955l - 1;
            case 1:
                return this.f7955l - 1;
            case 2:
                return this.f7955l;
            default:
                return (this.f7955l - this.f7956m) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f7954k) {
            case 0:
                a();
                int i7 = this.f7956m;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f7958o;
                bVar.h(i7);
                this.f7955l = this.f7956m;
                this.f7956m = -1;
                this.f7957n = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                int i8 = this.f7956m;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f7958o;
                cVar.h(i8);
                this.f7955l = this.f7956m;
                this.f7956m = -1;
                this.f7957n = ((AbstractList) cVar).modCount;
                return;
            case 2:
                c();
                int i9 = this.f7955l;
                Y.r rVar = (Y.r) this.f7958o;
                rVar.remove(i9);
                this.f7955l--;
                this.f7956m = -1;
                this.f7957n = rVar.o();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f7954k) {
            case 0:
                a();
                int i7 = this.f7956m;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f7958o).set(i7, obj);
                return;
            case 1:
                b();
                int i8 = this.f7956m;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f7958o).set(i8, obj);
                return;
            case 2:
                c();
                int i9 = this.f7956m;
                if (i9 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                Y.r rVar = (Y.r) this.f7958o;
                rVar.set(i9, obj);
                this.f7957n = rVar.o();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(r rVar, int i7, int i8, int i9) {
        this.f7954k = 3;
        this.f7958o = rVar;
        this.f7955l = i7;
        this.f7956m = i8;
        this.f7957n = i9;
    }

    public a(c cVar, int i7) {
        this.f7954k = 1;
        this.f7958o = cVar;
        this.f7955l = i7;
        this.f7956m = -1;
        this.f7957n = ((AbstractList) cVar).modCount;
    }

    public a(Y.r rVar, int i7) {
        this.f7954k = 2;
        this.f7958o = rVar;
        this.f7955l = i7 - 1;
        this.f7956m = -1;
        this.f7957n = rVar.o();
    }

    public a(b bVar, int i7) {
        this.f7954k = 0;
        this.f7958o = bVar;
        this.f7955l = i7;
        this.f7956m = -1;
        this.f7957n = ((AbstractList) bVar).modCount;
    }
}
