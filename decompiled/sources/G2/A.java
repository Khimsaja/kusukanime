package G2;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m.AbstractC1493n;
import m.C1478H;

/* loaded from: classes.dex */
public final class A implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public int f2617k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2618l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f2619m;

    public A(B b4) {
        this.f2619m = b4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2617k + 1 < this.f2619m.f2621s.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2618l = true;
        C1478H c1478h = this.f2619m.f2621s;
        int i7 = this.f2617k + 1;
        this.f2617k = i7;
        return (y) c1478h.f(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2618l) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        B b4 = this.f2619m;
        int i7 = this.f2617k;
        C1478H c1478h = b4.f2621s;
        ((y) c1478h.f(i7)).f2758l = null;
        int i8 = this.f2617k;
        Object[] objArr = c1478h.f12873m;
        Object obj = objArr[i8];
        Object obj2 = AbstractC1493n.f12899c;
        if (obj != obj2) {
            objArr[i8] = obj2;
            c1478h.f12871k = true;
        }
        this.f2617k = i8 - 1;
        this.f2618l = false;
    }
}
