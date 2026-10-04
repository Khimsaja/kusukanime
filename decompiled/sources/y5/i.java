package y5;

import O3.C;
import P3.r;
import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends j implements Iterator, S3.c, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public int f18385k;

    /* renamed from: l, reason: collision with root package name */
    public Object f18386l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f18387m;

    /* renamed from: n, reason: collision with root package name */
    public S3.c f18388n;

    @Override // y5.j
    public final void a(Object obj, U3.i iVar) {
        this.f18386l = obj;
        this.f18385k = 3;
        this.f18388n = iVar;
        T3.a aVar = T3.a.f9048k;
    }

    public final RuntimeException b() {
        int i7 = this.f18385k;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f18385k);
    }

    @Override // S3.c
    public final S3.h getContext() {
        return S3.i.f8767k;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i7 = this.f18385k;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.f18387m;
                kotlin.jvm.internal.l.c(it);
                if (it.hasNext()) {
                    this.f18385k = 2;
                    return true;
                }
                this.f18387m = null;
            }
            this.f18385k = 5;
            S3.c cVar = this.f18388n;
            kotlin.jvm.internal.l.c(cVar);
            this.f18388n = null;
            cVar.resumeWith(C.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f18385k;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f18385k = 1;
            Iterator it = this.f18387m;
            kotlin.jvm.internal.l.c(it);
            return it.next();
        }
        if (i7 != 3) {
            throw b();
        }
        this.f18385k = 0;
        Object obj = this.f18386l;
        this.f18386l = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // S3.c
    public final void resumeWith(Object obj) throws Throwable {
        r.Y(obj);
        this.f18385k = 4;
    }
}
