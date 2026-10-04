package E5;

import f4.InterfaceC0881a;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1948k;

    /* renamed from: l, reason: collision with root package name */
    public int f1949l;

    /* renamed from: m, reason: collision with root package name */
    public int f1950m;

    public /* synthetic */ a(int i7, int i8, int i9) {
        this.f1948k = i9;
        this.f1949l = i7;
        this.f1950m = i8;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.f1948k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1948k) {
            case 0:
                if (this.f1949l < this.f1950m) {
                }
                break;
            default:
                if (this.f1949l < this.f1950m) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1948k) {
            case 0:
                if (this.f1949l > 0) {
                }
                break;
            default:
                if (this.f1949l > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1948k) {
        }
        return this.f1949l;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1948k) {
        }
        return this.f1949l - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.f1948k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.f1948k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
