package P3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: P3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562c extends O3.t implements ListIterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0564e f7758n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0562c(AbstractC0564e abstractC0564e, int i7) {
        super(4, abstractC0564e);
        this.f7758n = abstractC0564e;
        int iA = abstractC0564e.a();
        if (i7 < 0 || i7 > iA) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, iA, "index: ", ", size: "));
        }
        this.f7543l = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7543l > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7543l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f7543l - 1;
        this.f7543l = i7;
        return this.f7758n.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7543l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
