package P3;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.C2419b;

/* loaded from: classes.dex */
public final class C implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7739k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f7740l;

    /* renamed from: m, reason: collision with root package name */
    public int f7741m;

    public C(Iterator it) {
        kotlin.jvm.internal.l.f("iterator", it);
        this.f7740l = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f7739k) {
            case 0:
                return this.f7740l.hasNext();
            case 1:
                break;
            default:
                return this.f7741m > 0 && this.f7740l.hasNext();
        }
        while (true) {
            int i7 = this.f7741m;
            it = this.f7740l;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f7741m--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f7739k) {
            case 0:
                int i7 = this.f7741m;
                this.f7741m = i7 + 1;
                if (i7 >= 0) {
                    return new B(i7, this.f7740l.next());
                }
                r.X();
                throw null;
            case 1:
                break;
            default:
                int i8 = this.f7741m;
                if (i8 == 0) {
                    throw new NoSuchElementException();
                }
                this.f7741m = i8 - 1;
                return this.f7740l.next();
        }
        while (true) {
            int i9 = this.f7741m;
            it = this.f7740l;
            if (i9 > 0 && it.hasNext()) {
                it.next();
                this.f7741m--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7739k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C(C2419b c2419b, byte b4) {
        this.f7741m = c2419b.f18375c;
        this.f7740l = c2419b.f18374b.iterator();
    }

    public C(C2419b c2419b) {
        this.f7740l = c2419b.f18374b.iterator();
        this.f7741m = c2419b.f18375c;
    }
}
