package F5;

import O3.t;
import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.Map;
import n0.AbstractC1531B;
import n0.C1559z;

/* loaded from: classes.dex */
public final class i implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2532k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f2533l;

    public i(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        this.f2533l = kotlin.jvm.internal.l.i(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2532k) {
            case 0:
                return ((g) this.f2533l).f2518m;
            case 1:
                return ((T.c) this.f2533l).f2518m;
            case 2:
                return this.f2533l.hasNext();
            default:
                return ((t) this.f2533l).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2532k) {
            case 0:
                return (Map.Entry) ((g) this.f2533l).next();
            case 1:
                return (Map.Entry) ((T.c) this.f2533l).next();
            case 2:
                return (AbstractC1531B) this.f2533l.next();
            default:
                return ((t) this.f2533l).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2532k) {
            case 0:
                ((g) this.f2533l).remove();
                return;
            case 1:
                ((T.c) this.f2533l).remove();
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public i(W.c cVar) {
        q[] qVarArr = new q[8];
        for (int i7 = 0; i7 < 8; i7++) {
            qVarArr[i7] = new T.j(this);
        }
        this.f2533l = new T.c(cVar, qVarArr);
    }

    public i(f fVar) {
        kotlin.jvm.internal.l.f("builder", fVar);
        q[] qVarArr = new q[8];
        for (int i7 = 0; i7 < 8; i7++) {
            qVarArr[i7] = new s(this);
        }
        this.f2533l = new g(fVar, qVarArr);
    }

    public i(C1559z c1559z) {
        this.f2533l = c1559z.f13225l.iterator();
    }
}
