package U;

import Z3.h;
import e4.InterfaceC0821a;
import e4.k;
import f4.InterfaceC0881a;
import f6.AbstractC0915m;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import m.C1472B;
import m.C1505z;
import y5.i;
import y5.n;

/* loaded from: classes.dex */
public final class c implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9125k;

    /* renamed from: l, reason: collision with root package name */
    public int f9126l;

    /* renamed from: m, reason: collision with root package name */
    public Object f9127m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f9128n;

    public c(Object obj, Map map) {
        this.f9125k = 0;
        this.f9127m = obj;
        this.f9128n = map;
    }

    public void a() {
        Object objInvoke;
        int i7 = this.f9126l;
        h hVar = (h) this.f9128n;
        if (i7 == -2) {
            objInvoke = ((InterfaceC0821a) hVar.f10261b).invoke();
        } else {
            k kVar = (k) hVar.f10262c;
            Object obj = this.f9127m;
            l.c(obj);
            objInvoke = kVar.invoke(obj);
        }
        this.f9127m = objInvoke;
        this.f9126l = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n nVar;
        Iterator it;
        switch (this.f9125k) {
            case 0:
                return this.f9126l < ((Map) this.f9128n).size();
            case 1:
                return ((i) this.f9127m).hasNext();
            case 2:
                if (this.f9126l < 0) {
                    a();
                }
                return this.f9126l == 1;
        }
        while (true) {
            int i7 = this.f9126l;
            nVar = (n) this.f9128n;
            int i8 = nVar.f18390b;
            it = (Iterator) this.f9127m;
            if (i7 < i8 && it.hasNext()) {
                it.next();
                this.f9126l++;
            }
        }
        return this.f9126l < nVar.f18391c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        n nVar;
        Iterator it;
        switch (this.f9125k) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f9127m;
                this.f9126l++;
                Object obj2 = ((Map) this.f9128n).get(obj);
                if (obj2 != null) {
                    this.f9127m = ((a) obj2).f9120b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                return ((i) this.f9127m).next();
            case 2:
                if (this.f9126l < 0) {
                    a();
                }
                if (this.f9126l == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f9127m;
                l.d("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj3);
                this.f9126l = -1;
                return obj3;
        }
        while (true) {
            int i7 = this.f9126l;
            nVar = (n) this.f9128n;
            int i8 = nVar.f18390b;
            it = (Iterator) this.f9127m;
            if (i7 < i8 && it.hasNext()) {
                it.next();
                this.f9126l++;
            }
        }
        int i9 = this.f9126l;
        if (i9 >= nVar.f18391c) {
            throw new NoSuchElementException();
        }
        this.f9126l = i9 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9125k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i7 = this.f9126l;
                if (i7 != -1) {
                    ((C1472B) this.f9128n).k(i7);
                    this.f9126l = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(n nVar) {
        this.f9125k = 3;
        this.f9128n = nVar;
        this.f9127m = nVar.a.iterator();
    }

    public c(h hVar) {
        this.f9125k = 2;
        this.f9128n = hVar;
        this.f9126l = -2;
    }

    public c(C1472B c1472b) {
        this.f9125k = 1;
        this.f9128n = c1472b;
        this.f9126l = -1;
        this.f9127m = AbstractC0915m.C(new C1505z(c1472b, this, null));
    }
}
