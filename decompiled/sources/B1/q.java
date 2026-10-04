package B1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import y1.C2391m;

/* loaded from: classes.dex */
public final class q {
    public final D a;

    /* renamed from: b, reason: collision with root package name */
    public final F f349b;

    /* renamed from: c, reason: collision with root package name */
    public final o f350c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f351d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f352e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f353f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f354g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f355h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f356i;

    public q(Looper looper, D d4, o oVar) {
        this(new CopyOnWriteArraySet(), looper, d4, oVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f354g) {
            try {
                if (this.f355h) {
                    return;
                }
                this.f351d.add(new p(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f353f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        F f5 = this.f349b;
        if (!f5.a.hasMessages(1)) {
            f5.getClass();
            E eB = F.b();
            eB.a = f5.a.obtainMessage(1);
            f5.getClass();
            Message message = eB.a;
            message.getClass();
            f5.a.sendMessageAtFrontOfQueue(message);
            eB.a();
        }
        ArrayDeque arrayDeque2 = this.f352e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i7, n nVar) {
        f();
        this.f353f.add(new m(i7, 0, new CopyOnWriteArraySet(this.f351d), nVar));
    }

    public final void d() {
        f();
        synchronized (this.f354g) {
            this.f355h = true;
        }
        Iterator it = this.f351d.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            o oVar = this.f350c;
            pVar.f348d = true;
            if (pVar.f347c) {
                pVar.f347c = false;
                oVar.b(pVar.a, pVar.f346b.b());
            }
        }
        this.f351d.clear();
    }

    public final void e(int i7, n nVar) {
        c(i7, nVar);
        b();
    }

    public final void f() {
        if (this.f356i) {
            AbstractC0015b.h(Thread.currentThread() == this.f349b.a.getLooper().getThread());
        }
    }

    public q(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, D d4, o oVar, boolean z7) {
        this.a = d4;
        this.f351d = copyOnWriteArraySet;
        this.f350c = oVar;
        this.f354g = new Object();
        this.f352e = new ArrayDeque();
        this.f353f = new ArrayDeque();
        this.f349b = d4.a(looper, new Handler.Callback() { // from class: B1.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                q qVar = this.f341k;
                Iterator it = qVar.f351d.iterator();
                while (it.hasNext()) {
                    p pVar = (p) it.next();
                    if (!pVar.f348d && pVar.f347c) {
                        C2391m c2391mB = pVar.f346b.b();
                        pVar.f346b = new E3.b();
                        pVar.f347c = false;
                        qVar.f350c.b(pVar.a, c2391mB);
                    }
                    if (qVar.f349b.a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f356i = z7;
    }
}
