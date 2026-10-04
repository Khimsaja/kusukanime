package B1;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static z f367f;
    public final Executor a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f368b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f369c;

    /* renamed from: d, reason: collision with root package name */
    public int f370d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f371e;

    public z(Context context) {
        Executor executorO = AbstractC0015b.o();
        this.a = executorO;
        this.f368b = new CopyOnWriteArrayList();
        this.f369c = new Object();
        this.f370d = 0;
        executorO.execute(new RunnableC0016c(1, this, context));
    }

    public static synchronized z a(Context context) {
        try {
            if (f367f == null) {
                f367f = new z(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f367f;
    }

    public final int b() {
        int i7;
        synchronized (this.f369c) {
            i7 = this.f370d;
        }
        return i7;
    }

    public final void c(int i7) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f368b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar.a.get() == null) {
                copyOnWriteArrayList.remove(xVar);
            }
        }
        synchronized (this.f369c) {
            try {
                if (this.f371e && this.f370d == i7) {
                    return;
                }
                this.f371e = true;
                this.f370d = i7;
                Iterator it2 = this.f368b.iterator();
                while (it2.hasNext()) {
                    x xVar2 = (x) it2.next();
                    xVar2.getClass();
                    xVar2.f364b.execute(new w(0, xVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
