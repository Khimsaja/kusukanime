package i3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final transient Object f12015k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final h f12016l;

    /* renamed from: m, reason: collision with root package name */
    public volatile transient boolean f12017m;

    /* renamed from: n, reason: collision with root package name */
    public transient Object f12018n;

    public i(h hVar) {
        this.f12016l = hVar;
    }

    @Override // i3.h
    public final Object get() {
        if (!this.f12017m) {
            synchronized (this.f12015k) {
                try {
                    if (!this.f12017m) {
                        Object obj = this.f12016l.get();
                        this.f12018n = obj;
                        this.f12017m = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f12018n;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f12017m) {
            obj = "<supplier that returned " + this.f12018n + ">";
        } else {
            obj = this.f12016l;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
