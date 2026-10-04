package i3;

import H1.C0236q;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: n, reason: collision with root package name */
    public static final C0236q f12019n = new C0236q(3);

    /* renamed from: k, reason: collision with root package name */
    public final Object f12020k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public volatile h f12021l;

    /* renamed from: m, reason: collision with root package name */
    public Object f12022m;

    public j(h hVar) {
        this.f12021l = hVar;
    }

    @Override // i3.h
    public final Object get() {
        h hVar = this.f12021l;
        C0236q c0236q = f12019n;
        if (hVar != c0236q) {
            synchronized (this.f12020k) {
                try {
                    if (this.f12021l != c0236q) {
                        Object obj = this.f12021l.get();
                        this.f12022m = obj;
                        this.f12021l = c0236q;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f12022m;
    }

    public final String toString() {
        Object obj = this.f12021l;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f12019n) {
            obj = "<supplier that returned " + this.f12022m + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
