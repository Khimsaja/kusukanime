package y5;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18376k;

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f18377l;

    /* renamed from: m, reason: collision with root package name */
    public int f18378m;

    /* renamed from: n, reason: collision with root package name */
    public Object f18379n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f18380o;

    public e(f fVar) {
        this.f18376k = 0;
        this.f18380o = fVar;
        this.f18377l = fVar.a.iterator();
        this.f18378m = -1;
    }

    public void a() {
        Object next;
        f fVar;
        do {
            Iterator it = this.f18377l;
            if (!it.hasNext()) {
                this.f18378m = 0;
                return;
            } else {
                next = it.next();
                fVar = (f) this.f18380o;
            }
        } while (((Boolean) fVar.f18382c.invoke(next)).booleanValue() != fVar.f18381b);
        this.f18379n = next;
        this.f18378m = 1;
    }

    public void b() {
        Iterator it = this.f18377l;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((e4.k) ((Z3.h) this.f18380o).f10262c).invoke(next)).booleanValue()) {
                this.f18378m = 1;
                this.f18379n = next;
                return;
            }
        }
        this.f18378m = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.f18379n;
        if (it2 != null && it2.hasNext()) {
            this.f18378m = 1;
            return true;
        }
        do {
            Iterator it3 = this.f18377l;
            if (!it3.hasNext()) {
                this.f18378m = 2;
                this.f18379n = null;
                return false;
            }
            Object next = it3.next();
            g gVar = (g) this.f18380o;
            it = (Iterator) gVar.f18384c.invoke(gVar.f18383b.invoke(next));
        } while (!it.hasNext());
        this.f18379n = it;
        this.f18378m = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18376k) {
            case 0:
                if (this.f18378m == -1) {
                    a();
                }
                return this.f18378m == 1;
            case 1:
                int i7 = this.f18378m;
                if (i7 == 1) {
                    return true;
                }
                if (i7 == 2) {
                    return false;
                }
                return c();
            default:
                if (this.f18378m == -1) {
                    b();
                }
                return this.f18378m == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18376k) {
            case 0:
                if (this.f18378m == -1) {
                    a();
                }
                if (this.f18378m == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f18379n;
                this.f18379n = null;
                this.f18378m = -1;
                return obj;
            case 1:
                int i7 = this.f18378m;
                if (i7 == 2) {
                    throw new NoSuchElementException();
                }
                if (i7 == 0 && !c()) {
                    throw new NoSuchElementException();
                }
                this.f18378m = 0;
                Iterator it = (Iterator) this.f18379n;
                kotlin.jvm.internal.l.c(it);
                return it.next();
            default:
                if (this.f18378m == -1) {
                    b();
                }
                if (this.f18378m == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f18379n;
                this.f18379n = null;
                this.f18378m = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18376k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar) {
        this.f18376k = 1;
        this.f18380o = gVar;
        this.f18377l = gVar.a.iterator();
    }

    public e(Z3.h hVar) {
        this.f18376k = 2;
        this.f18380o = hVar;
        this.f18377l = ((h) hVar.f10261b).iterator();
        this.f18378m = -1;
    }
}
