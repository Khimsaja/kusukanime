package X4;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class H implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public int f9848k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9849l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f9850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f9851n;

    public H(C c2) {
        this.f9851n = c2;
    }

    public final Iterator a() {
        if (this.f9850m == null) {
            this.f9850m = this.f9851n.f9841m.entrySet().iterator();
        }
        return this.f9850m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9848k + 1 < this.f9851n.f9840l.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f9849l = true;
        int i7 = this.f9848k + 1;
        this.f9848k = i7;
        C c2 = this.f9851n;
        return i7 < c2.f9840l.size() ? (Map.Entry) c2.f9840l.get(this.f9848k) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9849l) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f9849l = false;
        int i7 = C.f9838p;
        C c2 = this.f9851n;
        c2.b();
        if (this.f9848k >= c2.f9840l.size()) {
            a().remove();
            return;
        }
        int i8 = this.f9848k;
        this.f9848k = i8 - 1;
        c2.f(i8);
    }
}
