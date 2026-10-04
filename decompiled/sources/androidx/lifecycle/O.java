package androidx.lifecycle;

import java.util.Iterator;
import x1.C2252d;

/* loaded from: classes.dex */
public abstract class O {
    public final C2252d a = new C2252d();

    public final void a(String str, AutoCloseable autoCloseable) throws Exception {
        AutoCloseable autoCloseable2;
        C2252d c2252d = this.a;
        if (c2252d != null) {
            if (c2252d.f17305d) {
                C2252d.a(autoCloseable);
                return;
            }
            synchronized (c2252d.a) {
                autoCloseable2 = (AutoCloseable) c2252d.f17303b.put(str, autoCloseable);
            }
            C2252d.a(autoCloseable2);
        }
    }

    public final void b() {
        C2252d c2252d = this.a;
        if (c2252d != null && !c2252d.f17305d) {
            c2252d.f17305d = true;
            synchronized (c2252d.a) {
                try {
                    Iterator it = c2252d.f17303b.values().iterator();
                    while (it.hasNext()) {
                        C2252d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c2252d.f17304c.iterator();
                    while (it2.hasNext()) {
                        C2252d.a((AutoCloseable) it2.next());
                    }
                    c2252d.f17304c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        C2252d c2252d = this.a;
        if (c2252d == null) {
            return null;
        }
        synchronized (c2252d.a) {
            autoCloseable = (AutoCloseable) c2252d.f17303b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
