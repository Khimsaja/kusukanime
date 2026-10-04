package w5;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import t5.p;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17103k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17104l = true;

    /* renamed from: m, reason: collision with root package name */
    public final Object f17105m;

    public /* synthetic */ g(int i7, Object obj) {
        this.f17103k = i7;
        this.f17105m = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17103k) {
        }
        return this.f17104l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17103k) {
            case 0:
                if (!this.f17104l) {
                    throw new NoSuchElementException();
                }
                this.f17104l = false;
                return this.f17105m;
            case 1:
                if (!this.f17104l) {
                    throw new NoSuchElementException();
                }
                this.f17104l = false;
                return this.f17105m;
            default:
                if (!this.f17104l) {
                    throw new NoSuchElementException();
                }
                this.f17104l = false;
                return ((p) this.f17105m).f16119k;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17103k) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
