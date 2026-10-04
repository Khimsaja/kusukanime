package P3;

import f4.InterfaceC0881a;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class G implements ListIterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7750k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f7752m;

    public G(I i7, int i8) {
        this.f7752m = i7;
        this.f7751l = ((List) i7.f7755l).listIterator(q.k0(i8, i7));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f7750k) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f7751l;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7750k) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((kotlin.jvm.internal.v) this.f7751l).f12718k < ((Y.y) this.f7752m).f10040n - 1) {
                }
                break;
        }
        return ((ListIterator) this.f7751l).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f7750k) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((kotlin.jvm.internal.v) this.f7751l).f12718k >= 0) {
                }
                break;
        }
        return ((ListIterator) this.f7751l).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f7750k) {
            case 0:
                return ((ListIterator) this.f7751l).previous();
            case 1:
                return ((ListIterator) this.f7751l).previous();
            default:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f7751l;
                int i7 = vVar.f12718k + 1;
                Y.y yVar = (Y.y) this.f7752m;
                Y.s.a(i7, yVar.f10040n);
                vVar.f12718k = i7;
                return yVar.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f7750k) {
            case 0:
                return r.y((H) this.f7752m) - ((ListIterator) this.f7751l).previousIndex();
            case 1:
                return r.y((I) this.f7752m) - ((ListIterator) this.f7751l).previousIndex();
            default:
                return ((kotlin.jvm.internal.v) this.f7751l).f12718k + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f7750k) {
            case 0:
                return ((ListIterator) this.f7751l).next();
            case 1:
                return ((ListIterator) this.f7751l).next();
            default:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f7751l;
                int i7 = vVar.f12718k;
                Y.y yVar = (Y.y) this.f7752m;
                Y.s.a(i7, yVar.f10040n);
                vVar.f12718k = i7 - 1;
                return yVar.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f7750k) {
            case 0:
                return r.y((H) this.f7752m) - ((ListIterator) this.f7751l).nextIndex();
            case 1:
                return r.y((I) this.f7752m) - ((ListIterator) this.f7751l).nextIndex();
            default:
                return ((kotlin.jvm.internal.v) this.f7751l).f12718k;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f7750k) {
            case 0:
                ((ListIterator) this.f7751l).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f7750k) {
            case 0:
                ((ListIterator) this.f7751l).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public G(H h7, int i7) {
        this.f7752m = h7;
        this.f7751l = h7.f7753k.listIterator(q.k0(i7, h7));
    }

    public G(kotlin.jvm.internal.v vVar, Y.y yVar) {
        this.f7751l = vVar;
        this.f7752m = yVar;
    }
}
