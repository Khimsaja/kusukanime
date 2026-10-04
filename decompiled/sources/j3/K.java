package j3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class K extends l0 {

    /* renamed from: k, reason: collision with root package name */
    public int f12282k;

    /* renamed from: l, reason: collision with root package name */
    public Object f12283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12284m;

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f12285n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f12286o;

    public K() {
        this.f12282k = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i7 = this.f12282k;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int iB = AbstractC1755i.b(i7);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f12282k = 4;
        switch (this.f12284m) {
            case 0:
                do {
                    Iterator it = this.f12285n;
                    if (!it.hasNext()) {
                        this.f12282k = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((i3.e) this.f12286o).apply(next));
            default:
                do {
                    Iterator it2 = this.f12285n;
                    if (!it2.hasNext()) {
                        this.f12282k = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((f0) this.f12286o).f12349l.contains(next));
        }
        this.f12283l = next;
        if (this.f12282k == 3) {
            return false;
        }
        this.f12282k = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12282k = 2;
        Object obj = this.f12283l;
        this.f12283l = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(Iterator it, i3.e eVar) {
        this();
        this.f12284m = 0;
        this.f12285n = it;
        this.f12286o = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(f0 f0Var) {
        this();
        this.f12284m = 1;
        this.f12286o = f0Var;
        this.f12285n = f0Var.f12348k.iterator();
    }
}
